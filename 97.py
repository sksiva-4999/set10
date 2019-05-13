k=int(input())
i=0
while k>0:
    r=k%10
    i=i*10+r
    k=k//10
print(i)   
