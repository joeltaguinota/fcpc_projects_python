clockHours = int(input("Enter Hour/s: "))
clockMinutes = int(input("Enter Minute/s: "))
clockHoursElap = int(input("Enter Hour/s Elapsed: "))
clockMinutesElap = int(input("Enter Minute/s Elap: "))

currentHour = (clockHours + clockHoursElap)
currentMinute = (clockMinutes + clockMinutesElap)
currentHour += (currentMinute // 60)
currentMinute = (clockMinutes + clockMinutesElap) %60

print("Current Time: ", currentHour, ":", currentMinute)
