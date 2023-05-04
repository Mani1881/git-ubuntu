#using commandline arguments
import sys
n=len(sys.argv)
print(n)
print(sys.argv[0])
for i in range(1,n):
    print(sys.argv[i],end='\n')
s=0
for i in range(1,n):
    s+=int(sys.argv[i])
print('sum=',s)
    
