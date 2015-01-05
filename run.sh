#!/bin/sh
mvn clean install &&
cd web &&
mvn jetty:run
