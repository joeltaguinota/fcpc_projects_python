def bubble_Sort(bslist):
    for numbers in range(len(bslist)-1,0,-1):
        for x in range(numbers):
            if bslist[x] > bslist[x+1]:
                imple = bslist[x]
                bslist[x] = bslist[x+1]
                bslist [x+1] = imple

bslist = [ 30, 1, 35, 11, 13, 23, 41, 34, 24, 9, 77, 7, 99]
bubble_Sort(bslist)
print(bslist)
