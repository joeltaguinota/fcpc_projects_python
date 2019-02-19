user_input = int(input("Enter number of rows: "))
x = []
for y in range(user_input):
    x.append([])
    x[y].append(1)
    for z in range(1,y):
        x[y].append(x[y-1][z-1]+x[y-1][z])
    if(user_input!=0):
        x[y].append(1)
for y in range(user_input):
    print("   "*(user_input-y),end=" ",sep=" ")
    for z in range(0,y+1):
        print('{0:6}'.format(x[y][z]),end=" ",sep=" ")
    print()
