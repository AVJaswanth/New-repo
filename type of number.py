n=int(input("Enter the number:"))
def prime_comp():
    l=[]
    for i in range(2,n):
        if n%i==0:
            l.append(i)
    if n>=0:
        if n==1 or n==0:
            print("the number is neither prime nor composite")
        elif len(l)==0:
            print("the number is prime")
        else:
            print("the number is composite")
    else:
        print("enter positive number")
def perfect():
    if n>0:
        global original
        original=n
        h=[]
        for i in range(1,n):
            if n%i==0:
                h.append(i)
        if sum(h)==original:
            print("It is a perfect number")
        else:
            print("It is not a perfect number")
        h.append(original)
        print("The divisors of the number are:",h)
    else:
        print("Enter the positive number")
def armstrong():
    if n>0:
        origin=n
        dup=n
        dup=str(n)
        a=len(dup)
        j=[]
        while origin>0:
            k=origin%10
            j.append(k)
            origin//=10
        j=[num**a for num in j]
        x=sum(j)
        if x==n:
            print("the number is armstrong")
        else:
            print("The number is not armstrong")
    else:
        print("Enter the positive number")
prime_comp()
perfect()
armstrong()