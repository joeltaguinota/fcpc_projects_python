def populatelist():
    listX = ["abc","def","ghi"]
    return listX
    
listY = populatelist()
print(listY)

def reducelist():
    listZ = populatelist()
    listZ.remove("abc")
    return listZ
print(reducelist())
