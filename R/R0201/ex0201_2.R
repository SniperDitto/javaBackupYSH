# R script 4.0 version 이상에서 KoNLP package 설치방법 #KoNLP 설치 #KoNLP 오류

install.packages("multilinguer")

library(multilinguer)

install_jdk()



install.packages(c("hash",'tau','Sejong','RSQLite','devtools','bit','rex','lazyeval','htmlwidgets','crosstalk','promises','later','sessioninfo','xopen','bit64','blob','DBI','momoise','plogr','covr','DT','rcmdcheck','rversions'),type = "binary")



install.packages("remotes")

library(remotes)

remotes::install_github('haven-jeon/KoNLP', upgrade = "never", INSTALL_opts=c("--no-multiarch"))

library(KoNLP)

##############################################

setwd('D:/javaBackupYSH/R/R0201')
install.packages('wordcloud')
library(wordcloud)
useSejongDic()
data1 <- readLines("seoul_new.txt")
data1

#sapply = 여러건의 데이터를 한번에 저장하는 함수
#extractNoun 함수는 문장을 단어로 만든 후 명사만 추출하는 함수 --> 이것도 KoNLP
#extractNoun의 주의 사항!! 
#extractNoun은 띄어쓰기 기준으로 명사를 찾아주기 때문에 띄어쓰기를 잘못 할 경우 명사를 잘못 찾게 됩니다.
data2 <- sapply(data1,extractNoun,USE.NAMES = F)
data2

#추출된 명사형을 data3라는 변수에 집어 넣기
head(unlist(data2), 30)
data3 <- unlist(data2)
data3

#data3에서 원하지 않는 내용 삭제하기 -> gsub함수 사용
#gsub함수는 원하지 않는 내용 걸러내는 함수, 함수형은 gsub("변경전 글자","변경후 글자","원본데이터")
data3 <- gsub("\\d+","",data3)## about 숫자
data3 <- gsub("서울시","",data3)
data3 <- gsub("서울","",data3)
data3 <- gsub("요청","",data3)
data3 <- gsub("제안","",data3)
data3 <- gsub(" ","",data3)
data3 <- gsub("-","",data3)
data3

#필요한 명사형만 뽑아낸 후 다시 메모장 파일로 적어봅시다
write(unlist(data3),"seoul_2.txt")

#다시 불러오기
data4 <- read.table("seoul_2.txt")
data4

#data4의 row 갯수 = 데이터 갯수
nrow(data4)
wordcount <- table(data4)
wordcount

head(sort(wordcount, decreasing=T),20)

#또 쓸데없는 단어들은 지워봅시다
data3 <- gsub("OO","",data3)
data3 <- gsub("개선","",data3)
data3 <- gsub("문제","",data3)
data3 <- gsub("관리","",data3)
data3 <- gsub("민원","",data3)
data3 <- gsub("이용","",data3)
data3 <- gsub("관련","",data3)
data3 <- gsub("시장","",data3)
data3 <- gsub("님","",data3)
data3 <- gsub("한","",data3)
data3

#================================================
#gsub가 다수 반복되어 힘든 경우 반복문 사용
#삭제하고 싶은 단어를 미리 gsubfile.txt 파일로 만들어 주고
#txt<-readLines("gsubfile.txt")
#txt
#cnt_txt<-length(txt)
#cnt_txt
# for(i in 1:cnt_txt) {data3<-gsub((txt[i]),"",data3)}
#====================================================

write(unlist(data3),"seoul_3.txt")
data4 <- read.table("seoul_3.txt")
data4
wordcount <- table(data4)
head(sort(wordcount, decreasing = T),20)

################################################
#word Cloud 형태로 그래픽으로 출력
#worldcloud문법 ==>
wordcloud(words,freq=wordcount,scale=c(4,.5),min.freq=3,max.words=inf,random.order=True,random.color=FALSE,rot.per=.1,colors="black",ordered.colors=FALSE, user.r.layout=FALSE,fixed.asp=TRUE)

#words : 출력할 단어들, freq:언급된 빈도수, scale:글자크기, min.freq: 최소빈도수(만족해야 표시), max.words:최대언급횟수
#random.order: 출력되는 순서 임의지정, random.color: 글자 색상 임의 지정, rot,per:단어배치를 90도 각도로 출력 
#colors: 출력될 단어들 색상 지정, ordered.colors : True일 경우 글자별로 색상을 순서대로 지정할 수 있습니다
#use.r.layout : 이 값을 false로 할 경우 R에서 C++코드 사용가능
library(RColorBrewer)
palete <- brewer.pal(9,"Set3")
wordcloud(names(wordcount),freq=wordcount,scale=c(5,1),rot.per = 0.25,min.freq=1,random.order=F,randomecolor=T,colors=palete)

legend(0.3,1,"서울시 응답소 요청사항 분석", cex=0.8, fill=NA, border=NA,bg="white", text.col="red",text.font=2,box.col="red")
