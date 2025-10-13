def atm_cash_dispenser(money):
    if money == 0:
        print("Amount should be greater than 0")
        return
    denominations = [2000, 500, 200, 100, 50, 20, 10, 5, 2, 1]
    total_notes = 0
    for denom in denominations:
        count = money // denom
        if count:
            print(f"{denom} : {count}")
            total_notes += count
            money %= denom
    print(total_notes)
amount = int(input("Enter the amount to withdraw: "))
atm_cash_dispenser(amount)
