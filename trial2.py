from detectAns import *

initialMks = 0
List1 = []
stuList1 = []
incMksList = []

while True:
    # ansReq = int(input("Enter Number of answers to be checked: "))
    ansReq = 3

    while (0 < ansReq):
        modelAns = float(eval(input("Enter model answer: ")))
        LL = float(eval(input("Enter min. difference of answer: ")))
        UL = float(eval(input("Enter max. difference of answer: ")))
        incMks = int(input("Enter weightage for the question: "))
        incMksList.append(incMks)
        List1.append(modelAns)
        ansReq -= 1

    num_boxes = len(List1)
    while (0 < num_boxes):
        # stuAns = float(eval(input("Enter student answer: ")))
        stuAns = float(text)
        stuList1.append(stuAns)
        num_boxes -= 1

    index = len(stuList1)

    for i in range(0, index):
        if (List1[i]-LL) < stuList1[i] < (List1[i]+LL):
            initialMks += incMksList[i]
        elif (List1[i]-UL) < stuList1[i] < (List1[i]+UL):
            initialMks += (incMksList[i]*0.5)
        else:
            initialMks = initialMks

    ask = input("Do you want to continue? (y/n)")
    if ask == "n" or ask == "N":
        break
print(f'Model Answer: {List1}')
print(f'Student Answer: {stuList1}')
print(f'Marks scored = {initialMks}')