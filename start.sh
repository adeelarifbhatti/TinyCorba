#!/bin/bash
orbd -ORBInitialPort 900 -ORBInitialHost 0.0.0.0 &
sleep 5
echo "ORBD started on localhost and 900"
java Server/Server  -ORBInitialPort 900 -ORBInitialHost localhost



