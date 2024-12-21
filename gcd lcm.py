no_of_inputs=int(input("enter number of inputs:"))
list_of_num=[]
z=[]
multiplication=1
for i in range(no_of_inputs):
    num=int(input("enter the number:"))
    list_of_num.append(num)
for j in list_of_num:
    multiplication*=j
for k in range(1,multiplication):
    z.clear()
    for l in range(len(list_of_num)):
        if k%list_of_num[l]==0:
            z.append(list_of_num[l])
        else:
            break
    if len(z)==len(list_of_num):
        print(f"The LCM of the numbers:{k}")
        break
print("The GCD of the numbers:",multiplication/k)








