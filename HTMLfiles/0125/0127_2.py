from sklearn import svm,metrics

clf=svm.SVC()
#학습시키기
clf.fit([[0,0],[0,1],[1,0],[1,1]],[0,1,1,1])# or 연산자
#질문
result=clf.predict([[0,0],[1,0]])
#답
print(result)
score=metrics.accuracy_score([[0,0],[1,0]],[0,1])
print('정답률:',score)