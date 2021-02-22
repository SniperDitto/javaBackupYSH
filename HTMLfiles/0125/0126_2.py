#exception
def calc(data):
    sum=0
    try:
        sum=data[0]+data[1]+data[2]
        if sum<0:
            raise Exception("sum error")
    except IndexError as err:
        print('indexerror : ',str(err))
    except Exception as err:
        print(str(err))
    finally:
        print('sum : ',sum)

calc([1,2,3])

import numpy as np
a=np.array([[1,2,3],[4,5,6]])
b=np.array([[1,1,1],[1,1,1]])
c=b*a
print(c)

a=np.array([[1,2,3],[4,5,6]])
b=np.array([[-1,-2,-3],[-4,-5,-6]])
b=b.reshape(3,2)
b=np.dot(a,b)
print(a,b,c)

d=a+5
print(d)
print(a.T)#전치행렬

a=np.array([1,2,3,4,5,6,7,8,9,10,11,12]).reshape(4,3)
print(a)
print(a.shape)
print(a[0][0],a[0,0])
print(a[1][0],a[1,0])
print(a[0:-1,1:2])
print(a[:,0])
print(a[:,:])

#a를 순서대로 출력하기 위한 iterator
it=np.nditer(a,flags=['multi_index'],op_flags=['readwrite'])
while not it.finished:
    idx=it.multi_index
    print(idx,a[idx])
    it.iternext()

#concat
a=np.array([[1,2,3],[11,22,33]])
print(a)
b=np.array([7,8,9]).reshape(1,3)
print(b)
c=np.concatenate((a,b),axis=0)


