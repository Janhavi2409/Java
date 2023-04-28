import cv2
import pytesseract
from PIL import Image
from detectBox import *
pytesseract.pytesseract.tesseract_cmd = r"C:/Program Files/Tesseract-OCR/tesseract.exe"

# imgList=['box0.jpg', 'box181.jpg', 'box362.jpg']
# for i in boxes: 
#     image = cv2.imread(i)

image = cv2.imread('box0.jpg')


gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

thresh = cv2.threshold(
    gray, 0, 255, cv2.THRESH_BINARY_INV + cv2.THRESH_OTSU)[1]

denoised = cv2.medianBlur(thresh, 1)

coords = cv2.findNonZero(denoised)
angle = cv2.minAreaRect(coords)[-1]
if angle < -45:
    angle = -(90 + angle)
else:
    angle = angle
(h, w) = denoised.shape[:2]
center = (w // 2, h // 2)
M = cv2.getRotationMatrix2D(center, angle, 1.0)
deskewed = cv2.warpAffine(
    denoised, M, (w, h), flags=cv2.INTER_CUBIC, borderMode=cv2.BORDER_REPLICATE)

text = pytesseract.image_to_string(deskewed)
print(text)
