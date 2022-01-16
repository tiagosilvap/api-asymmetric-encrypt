#!/usr/bin/env bash

dockerize -wait tcp://mysqldb:3306 -timeout 30s
source /usr/local/bin/mvn-entrypoint.sh
