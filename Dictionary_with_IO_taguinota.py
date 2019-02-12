myContactList = {}
emptylist = []

while True:
    Menu = print("[1]-Add name or number","[2]-Search name or number")
    Menu = input("Enter your choice: ")


    if Menu == "1":
        user_name = input("Enter your name: ")
        cont_number = input("Enter your number: ")
        myContactList[user_name] = cont_number
        print(myContactList)
        continue
    elif Menu == "2":
        print(myContactList)
        search_name = input("Search name or number: ")
        if search_name in myContactList:
            print(myContactList[search_name])

        else:
            print("User not found")
    elif Menu == "3":
        f = open("MyContactList.txt","w")
        for x in emptylist:
            print(f.write(str(x)))
        f.close()

    else:
        print("Invalid choice")
