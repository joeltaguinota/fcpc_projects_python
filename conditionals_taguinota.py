getUserName = input("Enter username: ")
getPassword= input("Enter password: ")
if(len(getUserName) >= 10):
    if(getUserName == "joelaquino"):
        if(len(getPassword) >= 9):
            if (getPassword == "taguinota"):
                print("Access Granted!")
            elif(getUserName != "joelaquino" and getPassword != "taguinota"):
                print("Access Denied!")

            else:
                print("Login Failed, Incorrect Password!")
        else:
            print("Login Failed, Incorrect Password!")
    else:
        print("Login Failed, Incorrect Username!")
else:
    print("Login Failed, Incorrect Username!")
