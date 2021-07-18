#!/bin/bash

list=("clean" "install" "package")
path="/Users/youngkyoonim/SpringBootTutorial/demo2"
#"${path}/mvnw" clean -f "${path}/pom.xml"  
for i in ${list[@]}; do
	echo $i
	"${path}/mvnw" $i -f "${path}/pom.xml"  
done
echo "jar"
java -jar ./target/demo2-0.0.1-SNAPSHOT.jar
