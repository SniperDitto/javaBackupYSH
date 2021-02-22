class Person:
    count=0 #클래스 변수
    def __init__(self,name):
        self.name=name #인스턴스 변수
        Person.count+=1
        print(self.name+'초기화')
    def work(self,company):
        print(self.name+'회사'+company)
    def sleep(self):
        print(Person.count)
        print(self.name+'잠')
    def __myName(self): #접근자 private
        print('hello')
    @classmethod
    def getCount(cls):
        return cls.count

obj=Person('a')
obj.work('company123')
obj.sleep()
