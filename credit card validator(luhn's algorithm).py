credit_card_no=int(input('Enter a credit card number :'))
dup_credit=credit_card_no
dup_credit1=credit_card_no
no_of_digits=0
while dup_credit>0:
    dup_credit=dup_credit//10
    no_of_digits=no_of_digits+1
digits=[]
if(no_of_digits==15 or no_of_digits==16):
    while dup_credit1>0:
        digit=dup_credit1%10
        digits.append(digit)
        dup_credit1//=10
    dup_digits=digits.copy()
    for i in range(0,no_of_digits):
        if i%2!=0:
            digits[i]=digits[i]*2
            if digits[i]>=10:
                sum=0
                while digits[i]>0:
                    digit=digits[i]%10
                    digits[i]//=10
                    sum+=digit
                digits[i]=sum
    sum_of_digits=0
    for i in digits:
        sum_of_digits+=i
    if sum_of_digits%10 == 0:
        print(f"{credit_card_no} is valid")
        if(dup_digits[no_of_digits-1]==3):
            print("The card is an american express credit card")
        elif(dup_digits[no_of_digits-1]==4):
            print("The card is a visa credit card")
        elif(dup_digits[no_of_digits-1]==5):
            print("The card is a mastercard credit card")
        elif(dup_digits[no_of_digits-1]==6):
            print("The card if discover credit card")
        else:
            print("The card type is unknown")
    else:
        print(f"{credit_card_no} is not valid")
else:
    print(f"{credit_card_no} is not valid")