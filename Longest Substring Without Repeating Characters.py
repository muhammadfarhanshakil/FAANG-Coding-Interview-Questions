# Given a string s, find the length of the longest 
# substring
#  without repeating characters.


# s = "ohomm"
# longestSubstring = 0
# temp= ""
# substringsLength = []
# while (s != ''):
#     for i in s:
#         if(temp.find(i) == -1):
#             longestSubstring+=1
#             temp += i
#         else:
#             substringsLength.append(longestSubstring)
#             temp = ""
#             longestSubstring = 0
#             s = s[1:]
#             break

# print(substringsLength)

            
s = "abcabcbbbbbwxyz"

maxLength = 0

left = 0
right=0

for i in range(1, len(s)):
   
    if( s[i] in  s[left:right+1]):
        
        
        windowIdx = s[left:right+1].find(s[i])

        windowIdx = windowIdx+ left
        left = windowIdx+1
        right=i

        # print(f"{windowIdx} = {s[left:right+1]}.find(s[i])")

        # if(i - windowIdx-1 >= right-left ):
        #     left=windowIdx+1
        #     right = i

            
    else:
        right=i
        
    if(maxLength <= (right-left+1)):
        maxLength = right-left+1
        print(left, right, maxLength)
    
    
    

print(maxLength)


# if(b in  a)
# left: 0 right: 1

# if(c in  ab)
# left: 0 right: 2

# if(a in  abc)
# 0 = abc.find(s[i])
# left: 1 right: 3

# if(b in  bca)
# 1 = bca.find(s[i])
# left: 2 right: 4

# if(c in  cab)
# 2 = cab.find(s[i])
# left: 3 right: 5

# if(b in  abc)
# 4 = abc.find(s[i])
# left: 3 right: 5

# if(b in  abc)
# 4 = abc.find(s[i])
# left: 5 right: 7

# 7 5





