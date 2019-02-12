myContactList = {}

while True:
    user_Input = input("Enter your name: ")
    number_Input = input("Enter your number: ")
    myContactList[user_Input] = "Name"
    myContactList[number_Input] = "Number"
    print(myContactList)
