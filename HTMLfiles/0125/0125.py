print('hello world')

#data type
#list tuple dictionary string
a=[10,20,30,40,50]
print('a[0]=',a[0])
print('a[-1]=',a[-1],'a[-2]',a[-2])

b=[10,20,'hello',[True,3.24]]
print(b[3][0])
print(b[-1][-2])

c=[]
c.append(100),c.append(200),c.append(300)
print(c)
print(a[0:2])

#tuple(변경불가)
a=(10,20,30,40,50)
#a[0]=20 변경불가

#dictionary(키,값)
score={"kim":90,"lee":80}
print(score["kim"])
print(score.keys())
print(score.values())
print(score.items())

#String
a='a24232t9gea;..4,adf'
print(a[2])
a=a+'wersdf234'
print(a)
b=a.split(';')
print(b)

a=[10,20,30,40,50]
b=(10,20,30,40,50)
c={"kim":90,"lee":80}
d='hello world'
e=[[1,2],[2,3],[3,4]]
print(type(a),type(b),type(c),type(d),type(e))
print(len(a),len(b),len(c),len(d),len(e))

a='hello'
print(list(a))
print(str(3.14))
print(str([1,2,3]))
print(int(3.14))
print(int('3'))
print(float('3.14'))