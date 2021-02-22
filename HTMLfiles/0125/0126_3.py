import numpy as np
load_data=np.loadtxt('./data.csv',delimiter=',',dtype=np.float32)
print(load_data)

x_data=load_data[:,0:-1]
print(x_data)

y_data=load_data[:,-1]
print(y_data)

print(load_data,load_data.ndim,load_data.shape)
print(x_data,x_data.ndim,x_data.shape)
print(y_data,y_data.ndim,y_data.shape)

p1=np.random.rand(3)
p2=np.random.rand(1,3)
p3=np.random.rand(3,1)
print(p1,p2,p3)

x=np.array([2,4,6,8])
print(np.sum(x))
print(np.exp(x))
print(np.log(x))
print(np.max(x))
print(np.min(x))
print(np.argmax(x))
print(np.argmin(x))

a=np.ones([3,3])
print(a)
a=np.zeros([2,4])
print(a)