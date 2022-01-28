# This is a strong password generator
# Made by Dolph Wandie
# GitHub: @Skaramba      Email: Qtechwrld@gmail.com
# You can copy and implement it to you application

import time

print("This is a countdown timer")



def start_counting(t):
    print('\tCounting down now...\n')
    print('\t\t  ***')
    print('\t\t  ***')
    print('\t\t*******')
    print('\t\t *****')
    print('\t\t  ***')
    print('\t\t   *')
    print('+++++++++++++++++++++++++++++++++++++')    
    while t:
        m, s = divmod(t, 60)
        timed = '{:02d}:{:02d}'.format(m, s)
        print("\t\t" +timed, end="\r")
        time.sleep(1)
        t -= 1
        
    print('\tYour timer completed!!')
    print('+++++++++++++++++++++++++++++++++++++')
    
# def my_method(d, h, m, s):
#     if s > 60:
#         m = s/60

# day = input("Enter date [eg:12-10-2022] for your last day of the countdown: ")
# hr = int(input('Enter time in hours: '))
# minu = int(input('Enter time in minutes: '))
sec = int(input('Enter time in seconds: '))
timer = sec
start_counting(timer)
# my_method(day, hr, minu, sec)