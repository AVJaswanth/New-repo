from collections import Counter

class Solution(object):
    def customSortString(self, order, s):
        count = Counter(s)
        ans = ""
        for char in order:
            ans += char * count[char]
            count[char] = 0
        for char in count:
            ans += char * count[char]
        return ans

if __name__ == "__main__":
    order = input("Enter custom order string: ")
    s = input("Enter target string: ")
    sol = Solution()
    result = sol.customSortString(order, s)
    print("Custom sorted string:", result)
