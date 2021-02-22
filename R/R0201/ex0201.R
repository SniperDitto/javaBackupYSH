#주석
#R의 자료형
#숫자,문자,논리

#ctrl+enter로 실행
10
10.4
'ㅁㄴㅇㄹ'
'asdf'
true
TRUE
T
Sys.Date()
Sys.time()
date()

NA #없다
NULL #null이 있음

#변수
data<-'asdf'
data

#스칼라/벡터
v1<-c(1,2,3)
v1
v2<-c('kim','lee','hong','goo')
v2
v3<-c(T,F,TRUE)
v3
v4<-c(10,T,'test')
v4

#반복 데이터
x<-seq(1,10)
x
x<-seq(1,10,by=2)
x
x<-1:5
x

#1~10 일정간격으로 4개출력
x<-seq(1,10,length.out=4)
x

#반복
x<-c(1,2,3,4,5)
rep(x,times=3)
rep(x,each=3)
x[1]
x[3]
x[1:2]
x[c(2,4)]

#벡터 연산
x<-c(1,2,3)
y<-c(3,4,5)
x+y
x-y
x*y
x/y

#함수 연산
union(x,y) #합집합
setdiff(x,y) #여집합
intersect(x,y) #교집합

#행렬
x<-c(1,2,3,4)
mat1<-matrix(x)
mat1
mat2<-matrix(x,nrow=2)
mat2
mat3<-matrix(x,nrow=2,byrow=T)
mat3

#데이터 프레임
#다양한 데이터타입 저장
#데이터베이스의 테이블과 유사
no<-c(1,2,3,4)
name<-c('apple','banana','peach','grape')
price<-c(500,200,500,300)
qty<-c(5,2,4,9)
sales<-data.frame(no,name,price,qty)
sales
View(sales)
sales[,2]
subset(sales,qty>3)
subset(sales,name=='apple')
subset(sales,price>=300)
sales$name
subset(sales,price>=300,select=name)
subset(sales,price>=300,select=price)
subset(sales,qty>=2,select=c(name,price))
