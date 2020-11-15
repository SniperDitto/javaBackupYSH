y=1

while(y==1):
    x=int(input('학생수:'))
    if(x<=7):
        print('8 이상의 학생수를 다시 입력')
    else:
        print('학생수는',x,'명입니다')
        y=0

i=0
score={}
while(i<x):
    a=1
    while(a==1):
        s=int(input('%d번 학생 점수 입력 : ' %(i+1)))
        if(s<0 or s>100):
            print('0에서 100사이의 점수를 입력하세요')
        else:
            score[i]=s
            print('%d번 학생 점수는%d점'%(i+1,score[i]))
            a=0
    i=i+1    

j=0
sm=0
while(j<x):
    print('%d번 학생의 점수는 %d점'%(j+1,score[j]))
    sm=sm+score[j]
    j=j+1
avg=sm/x
print('점수 평균은 %f점' %(avg))