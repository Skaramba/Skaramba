# This is a countdown timer that accept time in seconds only
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
    
sec = input('Enter time in seconds: ')
time = int(sec)
start_counting(time)
