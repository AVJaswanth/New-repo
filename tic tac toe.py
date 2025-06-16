import random as r
import time
print("WELCOME TO TIC TAC TOE GAME.")
print(" ")
print("THE ONE WHO WON THE TOSS WILL GET FIRST CHANCE TO START.")
print(" ")
print("BOTH PLAYERS CHOOSE HEADS OR TAILS. YOU HAVE 10 SECONDS OF TIME TO DECIDE.")
print(" ")
toss=r.choice(["HEADS","TAILS"])
time.sleep(10)
print(toss)
l=[["1","2","3"],["4","5","6"],["7","8","9"]]
for i in range(0,3):
    for j in range(0,3):
        print(l[i][j],end=" ")
    print(" ")
pos_list=[]
def tic_tac_toe(a,pos_list):
    print(a)
    pos=int(input("Enter the position starts from 1 to 9 :"))
    val=input("Enter O or X :").upper()
    if (val=="O" or val=="o" or val=="x" or val=="X") and (1<=pos<=9) and (pos not in pos_list) :
        out=0
        ins=0
        for i in range(0,3):
            one=False
            for j in range(0,3):
                if l[i][j]==str(pos):
                    l[i][j]=val
                    out=i
                    ins=j
                    one=True
                    break
            if one:
                break
        for i in range(0,3):
            for j in range(0,3):
                print(l[i][j],end=" ")
            print(" ")
        row_check=True
        for i in range(0,3):
            if l[out][i]!=val:
                row_check=False
                break
        if row_check:
            if(a=="player 2 turn"):
                print("player 2 won")
                exit()
            else:
                print("player 1 won")
                exit()
        column_check=True
        for i in range(0,3):
            if l[i][ins]!=val:
                column_check=False
                break
        if column_check:
            if(a=="player 2 turn"):
                print("player 2 won")
                exit()
            else:
                print("player 1 won")
                exit()
        diagonal_check = False
        if l[0][0] == val and l[1][1] == val and l[2][2] == val:
            diagonal_check = True
        elif l[0][2] == val and l[1][1] == val and l[2][0] == val:
            diagonal_check = True

                    
        if diagonal_check:
            if(a=="player 2 turn"):
                print("player 2 won")
                exit()
            else:
                print("player 1 won")
                exit()
    else:
        if val not in ["O", "X"]:
            print("ERROR ENTER EITHER X or O")
        if pos not in range(1, 10):
            print("ERROR ENTER VALID POSITION RANGE FROM 1 TO 9")
        if pos in pos_list:
            print("ERROR DONT OVERWRITE THE POSITIONS")
        tic_tac_toe(a, pos_list)
    return pos    
for i in range(1,10):
    if i % 2 == 0:
        pos = tic_tac_toe("player 2 turn", pos_list)
        pos_list.append(pos)
    else:
        pos = tic_tac_toe("player 1 turn", pos_list)
        pos_list.append(pos)

print("THE GAME WAS A TIE")
