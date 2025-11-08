class MatrixAnalyzer(object):
    def luckyNumbers(self, matrix):
        l = []
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if min(matrix[i]) == matrix[i][j]:
                    max_val = 0
                    for k in range(len(matrix)):
                        if max_val < matrix[k][j]:
                            max_val = matrix[k][j]
                    if max_val == matrix[i][j]:
                        l.append(matrix[i][j])
        return l

rows = int(input("Enter number of rows: "))
cols = int(input("Enter number of columns: "))
matrix = []

for i in range(rows):
    row = list(map(int, input("Enter row {} values separated by space: ".format(i + 1)).split()))
    while len(row) != cols:
        row = list(map(int, input("Please enter exactly {} values: ".format(cols)).split()))
    matrix.append(row)

analyzer = MatrixAnalyzer()
result = analyzer.luckyNumbers(matrix)
print("Lucky Numbers:", result)
