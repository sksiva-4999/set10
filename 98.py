s=int(input())
n=[int(i) for i in input().split()]
for i in range(0,s):
	if i+1!=n[i]:
		print(i)
