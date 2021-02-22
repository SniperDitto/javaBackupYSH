a=1
if a>0:
    print('a=',a)
elif a==0:
    print('a=0')
else:
    print('a<0')
print('종료')

a=[10,20,30,40,50]
b=(10,20,30,40,50)
c={"kim":90,"lee":80}

if 45 in a:
    print('45')
else:
    print('없음')

if 'kim' in c:
    print(c['kim'])
else:
    print('없음')

for data in range(10):
    print(data)
for data in range(0,10,2):
    print(data)
for data in a:
    print(data)
for data in c:
    print(data,' ',c[data])

a=[]
for data in range(10):
    if data%2==0:
        a.append(data)
print(a)

a=5
while a<=10:
    print(a)
    a=a+1
print('종료')

def sum(x,y):
    s=x+y
    return s
result=sum(10,20)
print(result)

def multiFunc(x):
    return x+1,x+2
x1,x2=multiFunc(1)
print(x1,x2)