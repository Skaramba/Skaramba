# This is a (python) strong password generator app
# Made by Dolph Wandie
# GitHub: @Skaramba      Email: Qtechwrld@gmail.com
# You can copy and implement it to you application
import random

char = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ}[]{1234567890!@#$%&+^*~'

passNum = input("Enter number of passwords to generate: ")
passNum = int(passNum)

passLen = input("Enter length of password: ")
passLen = int(passLen)

print("\n\tHere are your generated password!!!")
print("============++++++++++++++++===============")
for pswd in range(passNum):
    genPassword = ''
    for i in range(passLen):
        genPassword += random.choice(char)
        genPassword
    print(genPassword)
print("============++++++++++++++++===============")
print("\n\tThank you for using this program\n")
