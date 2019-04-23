#!/bin/bash

ps -ef | grep vpn-server | grep -v grep | cut -c 9-15 | xargs kill -s 9;
