#!/bin/bash
sleep 6
java Client/Client -ORBInitialPort 900 -ORBInitialHost server < <(printf "set Norway Oslo\r")
java Client/Client -ORBInitialPort 900 -ORBInitialHost server < <(printf "get Norway\r")
