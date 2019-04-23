#!/bin/bash

mvn clean package;
nohup java -Xms64m -Xmx64m -Xss256k -jar ./target/*.jar & nohup;
tail -f nohup.out;
