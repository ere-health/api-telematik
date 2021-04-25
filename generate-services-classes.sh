#!/bin/bash
wsimport -J-Djavax.xml.accessExternalDTD=all -d src/main/java conn/SignatureService.wsdl
