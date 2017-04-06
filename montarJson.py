
a = open("D:\dispositivos\projeto17\montarJson.txt","r", encoding="utf-8")
b = list()

for i in a.readlines():
    b.append(i[:-1])

a.close()

c = open("D:\dispositivos\projeto17\jsonMontado.txt","w", encoding="utf-8")
c.writelines(b)
c.close()
