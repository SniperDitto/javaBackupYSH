import pandas
from sklearn import svm,metrics

csv=pandas.read_csv("iris.csv")
data=csv[["sepal_length","sepal_width","petal_length","petal_width"]]
label=csv["species"]

print(data)
print(label)

clf=svm.SVC()
#학습시키기
clf.fit(data,label)# or 연산자
#질문
result=clf.predict([4.0,3.4,1.6,0.2],[4.8,3.2,1.6,0.2],
[4.8,3.4,3.6,0.2],[4.8,3.4,1.6,1.2])
#답
print(result)
