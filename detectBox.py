import cv2
import os
import pytesseract
pytesseract.pytesseract.tesseract_cmd = r"C:/Program Files/Tesseract-OCR/tesseract.exe"

img = cv2.imread('TEST.png')

gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

edges = cv2.Canny(gray, 50, 150)

contours, hierarchy = cv2.findContours(
    edges, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)

for i, cnt in enumerate(contours):
    x, y, w, h = cv2.boundingRect(cnt)
    if 600 > w > 30 and 600 > h > 30:
        box_img = img[y:y+h, x:x+w]
        filename = f'box{i}.jpg'
        cv2.imwrite(filename, box_img)


num_boxes = len([name for name in os.listdir('.') if name.endswith('.jpg')])
print(f'Detected {num_boxes} boxes')