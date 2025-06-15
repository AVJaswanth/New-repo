import math
lower_range=int(input("Enter the lower range :"))
higher_range=int(input("Enter the higher range :"))
if lower_range<0 or higher_range<lower_range:
    print("Invalid input: make sure that 0 <= lower_range <= higher_range")
    exit()
isprime=[]
for i in range(0,higher_range+1):
    isprime.append(True)
isprime[0],isprime[1]=False,False
for i in range(2,int(math.sqrt(higher_range))+1):
    for j in range(i*i,higher_range+1,i):
        isprime[j]=False
print(f"The prime numbers from {lower_range} to {higher_range} are :")
for i in range(lower_range,higher_range+1):
    if isprime[i]==True:
        print(i)