num = int(input("Enter a number: "))
for x in range(num,1,-1):
    print(str(x-1),"mod(",str(num),")=",str(((x-1)**num)%num))
