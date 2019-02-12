emptylist ={}
f = open('file.txt','w')
f.write("Hi")
f.write("Welcome")
f.write("Joel")
f.close()

f = open('file.txt', 'r')
print(f.read())

