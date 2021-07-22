#!/bin/bash
xjc -d src/main/java/ fa/vsds/Schema_VSD.xsd
# wsimport -J-Djavax.xml.accessExternalDTD=all -d src/main/java conn/SignatureService.wsdl
