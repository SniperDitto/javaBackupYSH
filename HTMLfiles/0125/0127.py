import numpy as np

#f(x)=x**2
def myFun1(x):
    return x**2

#f'(x)=x**2
def num_derivative(f,x):
    myZero=1e-4
    return (f(x+myZero)-f(x-myZero)/2*myZero)

result=num_derivative(myFun1,2)
print(result)


