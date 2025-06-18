string1=input("Enter anything: ")
string1=string1.lower().replace(" ","").replace(",","").replace(".","").replace(";","").replace("'","").replace("?","").replace("!","")
rev=string1[::-1]
if string1==rev:
    print("palindrome")
else:
    print("Not a palindrome")