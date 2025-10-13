class Solution(object):
    def generate(self, numRows):
        l = []
        for i in range(0, numRows):
            if i == 0:
                l1 = []
                l1.append(1)
                l.append(l1)
            elif i == 1:
                l1 = []
                l1.append(1)
                l1.append(1)
                l.append(l1)
            else:
                l1 = []
                l1.append(1)
                for j in range(0, len(l[i - 1]) - 1):
                    ans = l[i - 1][j] + l[i - 1][j + 1]
                    l1.append(ans)
                l1.append(1)
                l.append(l1)
        for row in l:
            print(row)
object = Solution()
print(object.generate(int(input("Enter the number of rows for Pascal's Triangle: "))))