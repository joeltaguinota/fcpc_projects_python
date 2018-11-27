your_name = input("Enter your name :")
print(your_name)
results = ""

for x in range(len(your_name)):
    char = your_name[x]

    if char == "A":
        results += "B"
    elif char == "B":
        results += "C"
    elif char == "C":
        results += "D"
    elif char == "D":
        results += "E"
    elif char == "E":
        results += "F"
    elif char == "F":
        results += "G"
    elif char == "G":
        results += "H"
    elif char == "H":
        results += "I"
    elif char == "I":
        results += "J"
    elif char == "J":
        results += "K"
    elif char == "K":
        results += "L"
    elif char == "L":
        results += "M"
    elif char == "M":
        results += "N"
    elif char == "N":
        results += "O"
    elif char == "O":
        results += "P"
    elif char == "P":
        results += "Q"
    elif char == "Q":
        results += "R"
    elif char == "R":
        results += "S"
    elif char == "S":
        results += "T"
    elif char == "T":
        results += "U"
    elif char == "U":
        results += "V"
    elif char == "V":
        results += "W"
    elif char == "W":
        results += "X"
    elif char == "X":
        results += "Y"
    elif char == "Y":
        results += "Z"
    elif char == "Z":
        results += "Z"
    else:
        char += results

print(results,end='')





