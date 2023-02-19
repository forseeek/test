filePath='D:\ПРОГРАМИРОВАНИЕ\12. Ruby Anna\lesson 9\мультітест'
if ! Dir.exists? (filePath) # якщо папка не існує
    Dir.mkdir(filePath) # створити папку
end
Dir.chdir(filePath)
myfile=File.new("мультітест.txt", "a")

File.open("мультітест.txt", 'a') {|file| file.truncate(0) }
content="1. Що таке механіна хвиля?"
content1="А) поширення коливань у пружному середовищі."
content2="Б) хвиля, в якій частини середовища коливаються
перпендикулярно до напрямку поширення хвилі."
content3="В) хвиля, в якій частини середовища коливаються вздовж напрямку
поширення хвилі."
myfile.puts(content)
myfile.puts(content1)
myfile.puts(content2)
myfile.puts(content3)

content4=""
myfile.puts(content4)

content5="2. Яка формула довжини хвилі?"
content6="А) v ⸱ T"
content7="Б) λν"
content8="В) N/T"
myfile.puts(content5)
myfile.puts(content6)
myfile.puts(content7)
myfile.puts(content8)

content9=""
myfile.puts(content9)

content10="3. В чому вимірюється частота хвилі?"
content11="А) Дж"
content12="Б) Гц"
content13="В) А"
myfile.puts(content10)
myfile.puts(content11)
myfile.puts(content12)
myfile.puts(content13)

content14=""
myfile.puts(content14)
content15="Приклади з алгебри."
myfile.puts(content15)

i=1
while i<10
    a=rand(1..100)
    b=rand(1..100)
    c=a*b
    myfile.puts("#{a}*#{b}=#{c}")
    i+=1
end