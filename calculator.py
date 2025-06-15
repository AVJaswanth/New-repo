print("Welcome to calculator")
first_num=int(input("Enter the first number :"))
result=first_num
while True:
    operator=input("Enter a operator (+,-,*,/,//,%,**) or q to quit :")
    if(operator=="q"):
        break
    elif(operator=="+"):
        second_number=int(input("Enter the next number :"))
        result=result+second_number
        print(f"Current result :{result}")
    elif(operator=="-"):
        second_number=int(input("Enter the next number :"))
        result=result-second_number
        print(f"Current result :{result}")
    elif(operator=="*"):
        second_number=int(input("Enter the next number :"))
        result=result*second_number
        print(f"Current result :{result}")
    elif(operator=="/"):
        second_number=int(input("Enter the next number :"))
        if second_number==0:
            print("please enter a non zero number")
            continue
        result=result/second_number
        print(f"Current result :{result}")
    elif(operator=="%"):
        second_number=int(input("Enter the next number :"))
        if second_number==0:
            print("please enter a non zero number")
            continue
        result=result%second_number
        print(f"Current result :{result}")
    elif(operator=="//"):
        second_number=int(input("Enter the next number :"))
        if second_number==0:
            print("please enter a non zero number")
            continue
        result=result//second_number
        print(f"Current result :{result}")
    elif(operator=="**"):
        second_number=int(input("Enter the next number :"))
        result=result**second_number
        print(f"Current result :{result}")
    else:
        print("ERROR please enter valid operator")
print(f"Final Result :{result}")
print("THANK YOU")