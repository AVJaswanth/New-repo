size = int(input("Enter the size of the list: "))
free = int(input("Enter the number of free elements you can remove: "))
arr = list(map(int, input("Enter the elements of the list: ").split()))
min_arr = arr.copy()
arr.sort()
min_arr.sort()
mini = 0
for i in range(len(arr)):
    count = free
    if arr[i] == 0:
        continue
    else:
        mini += arr[i]
        arr[i] = 0
        j = size - 1
        while count != 0 and j != -1:
            if arr[j] == 0:
                j -= 1
                continue
            arr[j] = 0
            j -= 1
            count -= 1
maxi = 0
for i in range(size - 1, -1, -1):
    count = free
    if min_arr[i] == 0:
        continue
    else:
        maxi += min_arr[i]
        min_arr[i] = 0
        j = 0
        while count != 0 and j != size:
            if min_arr[j] == 0:
                j += 1
                continue
            min_arr[j] = 0
            j += 1
            count -= 1
print(mini, maxi)
