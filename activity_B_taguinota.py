print("Activity 1")

for x in range(8):
    exp = 2 ** x
    print(exp,end= "\t")
print()
print("Activity 2")
for y in range(1,13):
    if y % 4 == 0:
        print("S",end= "\t")
    else:
        print(y,end= "\t")

print()
print("Activity 3")
for z in range(1,9):
    if z % 8 == 1:
        print(z,end= "\t")
    else:
        print("E",end= "\t")
