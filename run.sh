#!/usr/bin/env bash

mvn clean package

echo "<< Implementação fulano >>"
java -cp app/target/app.jar:service-api/target/service-api.jar:service-fulano/target/service-fulano.jar Aplicacao

echo "<< Implementação ciclano >>"
java -cp app/target/app.jar:service-api/target/service-api.jar:service-ciclano/target/service-ciclano.jar Aplicacao
