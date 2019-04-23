#!/bin/bash

ps -ef | grep "/target/archetype-0.0.1-SNAPSHOT.jar" | grep -v grep | cut -c 9-15 | xargs kill -s 9;
