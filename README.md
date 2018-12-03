#cucumber with maven project test example
## 1.新增maven project
* file>new>maven project
* 只選擇第二項 use default Workspace location > next
* Group Id選擇 "org.apache.maven.archetypes" ArtifactId選擇 "maven-archetype-quickstart" >next
* Group Id輸入公司或自己測試的(會反映在package的名稱)&Artifact Id為專案名稱 >finish

## 2.設定pom.xml
可以透過cucumber的網站中找到maven的方式  
http://docs.cucumber.io/installation/java/  
但因為此包並無加入Junit 所以需要再加入cucumber-junit 加入完就算完成了

## 3.開始寫feature
撰寫想要做出什麼樣的目標  
詳細設定可看  http://teddy-chen-tw.blogspot.com/2013/07/bdd2cucumber.html
撰寫完成後就做出test的java檔  

## 4.加入測試檔並實作
http://teddy-chen-tw.blogspot.com/2013/07/bdd4cucumber-jvm.html  
http://teddy-chen-tw.blogspot.com/2013/08/bdd5cucumber-jvm.html
