#!/bin/bash

mvn clean package;
nohup java -Xms64m -Xmx64m -Xss256k -Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=5005,suspend=y -jar ./target/*.jar & nohup;
tail -f nohup.out;
