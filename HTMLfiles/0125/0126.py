import numpy as np
a=np.array([1,2])
print(type(a))#<class 'numpy.ndarray'>

from numpy import exp
result=exp(1)
print(result)

from numpy import array
a=array([1,2])
print(a)

from numpy import *
a=np.array([1,0,0,1])
b=np.array([1,0,0,1])
c=a+b
print(c)
print(c.shape)
print(c.ndim)

a=np.array([[1,2,3],[4,5,6]])
b=np.array([[-1,-2,-3],[-4,-5,-6]])
b=b.reshape(3,2)
print(b)
