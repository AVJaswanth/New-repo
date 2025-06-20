import matplotlib.pyplot as pt
filename=input("Enter file name with extension: ")
with open(filename,'r') as file:
    content=file.read()
    set_of_words=set(content.split())
    list_of_words=content.split()
    list_of_count=[]
    list_of_words1=[]
    for i in set_of_words:
        list_of_words1.append(i)
        count=0
        for j in list_of_words:
            if i==j:
                count+=1
        list_of_count.append(count)
    pt.bar(list_of_words1,list_of_count)
    pt.title('Frequency of each word')
    pt.xlabel('Words')
    pt.ylabel('Count')
    pt.xticks(rotation=90)
    pt.show()

