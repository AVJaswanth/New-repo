class Solution(object):
    def printVertically(self, s):
        l = s.split(" ")
        ans = []
        max_len = 0
        for i in l:
            if len(i) > max_len:
                max_len = len(i)
        for i in range(0, max_len):
            st = ""
            for j in l:
                if len(j) > i:
                    st = st + j[i]
                else:
                    st = st + " "
            st = st.rstrip()
            ans.append(st)
        return ans

if __name__ == "__main__":
    s = input("Enter a sentence: ")
    sol = Solution()
    result = sol.printVertically(s)
    for line in result:
        print(line)
