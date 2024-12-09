class Palin:
    def num_palindrome(self):
        a=int(input("Enter the number:"))
        original_num=a
        l=[]
        while a>0:
            x=a%10
            l.append(str(x))
            a//=10
        y="".join(l)
        z=int(y)
        print("The reversed number is:", z)
        return z,original_num
    def str_palindrome(self):
        b=input("Enter the string: ")
        c=b[::-1]
        print("Reversed string is:",c)
        return c,b
class InvalidType(Exception):
    pass
type=input("Enter the type of input:")
obj=Palin()
try:
    if type=="int":
        reversed_num, original_num=obj.num_palindrome()
        if reversed_num==original_num:
            print("The given number is a palindrome")
        else:
            print("The given number is not a palindrome")
    elif type=="str":
        reversed_str, original_str=obj.str_palindrome()
        if reversed_str==original_str:
            print("The given string is a palindrome")
        else:
            print("The given string is not a palindrome")
    else:
        raise InvalidType
except InvalidType:
    print("Error:Enter correct type of input")
