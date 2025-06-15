low_limit=int(input("Enter the lower range :"))
high_limit=int(input("Enter the higher range :"))
divisor1=int(input("Enter first divisor :"))
divisor2=int(input("Enter second divisor :"))
if divisor1==0 and divisor2==0:
    print("ERROR please enter non zero numbers for both divisors")
elif divisor2==0:
    print("ERROR please enter a non zero number for second divisor")
elif divisor1==0:
    print("ERROR please enter a non zero number for first divisor")
else:
    for i in range(low_limit,high_limit+1):
        if i%divisor1==0 and i%divisor2==0:
            print(f"{i} : FizzBuzz")
        elif i%divisor2==0:
            print(f"{i} : Buzz")
        elif i%divisor1==0:
            print(f"{i} : Fizz")