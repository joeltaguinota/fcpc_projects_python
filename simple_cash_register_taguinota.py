milktea_drinkslist = ['Okinawa', 'Winter Melon', 'Original Pearl', 'Cookies and Cream', 'Choco Dinosaur']
milktea_drinksprice = [65, 70, 75, 80, 85]

for x in range(5):
    print((x + 1), milktea_drinkslist[x], '-', milktea_drinksprice[x])

userChoice = int(input('Enter Choice: '))
itemQuantity = int(input('Enter Quantity: '))
userCash = int(input('Enter Money: '))

if userChoice == 1:
    if userCash >= milktea_drinksprice[0]:
        totalQuantity = milktea_drinksprice[0] * itemQuantity
        print('Thank you for buying!')
        print('You recieve your: ')
        print(milktea_drinkslist[0])
    else:
        itemQuantity -= 1
        print('Insufficient balance')
elif userChoice == 2:
    if userCash >= milktea_drinksprice[1]:
        totalQuantity = milktea_drinksprice[1] * itemQuantity
        print('Thank you for buying!')
        print('You recieve your: ')
        print(milktea_drinkslist[1])
    else:
        itemQuantity -= 1
        print('Insufficient balance')
elif userChoice == 3:
    if userCash >= milktea_drinksprice[2]:
        totalQuantity = milktea_drinksprice[2] * itemQuantity
        print('Thank you for buying!')
        print('You recieve your: ')
        print(milktea_drinkslist[2])
    else:
        itemQuantity -= 1
        print('Insufficient balance')
elif userChoice == 4:
    if userCash >= milktea_drinksprice[3]:
        totalQuantity = milktea_drinksprice[3] * itemQuantity
        print('Thank you for buying!')
        print('You recieve your: ')
        print(milktea_drinkslist[3])
    else:
        itemQuantity -= 1
        print('Insufficient balance')
elif userChoice == 5:
    if userCash >= milktea_drinksprice[4]:
        totalQuantity = milktea_drinksprice[4] * itemQuantity
        print('Thank you for buying!')
        print('You recieve your: ')
        print(milktea_drinkslist[4])
    else:
        itemQuantity -= 1
        print('Insufficient balance')
else:
    print('Invalid Choice!')

itemTotal = totalQuantity
if userCash >= itemTotal:
    print('Total: ', itemTotal)
    userChange = userCash - itemTotal
    print('Change: ', userChange)
else:
    print('Insufficient balance')
