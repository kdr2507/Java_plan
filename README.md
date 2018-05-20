# Java_plan
# Java_plan

SSH키 생성</br>
cd ~/.ssh</br>
ssh-keygen</br>
**
Generating public/private rsa key pair.</br>
Enter file in which to save the key (/home/schacon/.ssh/id_rsa):</br>
Created directory '/home/schacon/.ssh'.</br>
Enter passphrase (empty for no passphrase):</br>
Enter same passphrase again:</br>
Your identification has been saved in /home/schacon/.ssh/id_rsa.</br>
Your public key has been saved in /home/schacon/.ssh/id_rsa.pub.</br>
The key fingerprint is:</br>
d0:82:24:8e:d7:f1:bb:9b:33:53:96:93:49:da:9b:e3 schacon@mylaptop.local</br>
**</br>
*중요 : 비밀번호 반드시 설정하기*</br>
cat ~/.ssh/id_rsa.pub</br>
ssh-rsa AAAAB3NzaC1yc2EAAAABIwAAAQEAklOUpkDHrfHY17SbrmTIpNLTGK9Tjom/BWDSU
GPl+nafzlHDTYW7hdI4yZ5ew18JH4JW9jbhUFrviQzM7xlELEVf4h9lFX5QVkbPppSwg0cda3
Pbv7kOdJ/MTyBlWXFCR+HAo3FXRitBqxiX1nKhXpHAZsMciLq8V6RjsNAQwdsdMFvSlVK/7XA
t3FaoJoAsncM1Q9x5+3V0Ww68/eIFmb1zuUFljQJKprrX88XypNDvjYNby6vw/Pb0rwert/En
mZ+AW4OZPnTPI89ZPmVMLuayrD2cE86Z/il8b+gw3r3+1nKatmIkjn2so1d01QraTlMqVSsbx
NrRFi9wrf+M7Q== schacon@mylaptop.local</br>
이 내용을 github에 ssh키 생성후 복사 </br>
</br>
처음 깃 설정할때</br>
echo "# Java_plan" >> README.md</br>
git init</br>
git add README.md</br>
git commit -m '#'</br>
git remote add origin git@github.com:kdr2507/Java_plan.git</br>
git push -u origin master</br>
이 순서대로 치기</br>
</br>
만약 이대로 했는데 안되는 경우</br>
git pull --rebase origin master</br>
git push origin master</br>
이렇게 치기</br>
# Java_plan
# Java_plan
# Java_plan
