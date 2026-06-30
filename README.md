# ShieldCare Assignment 2

Group: duha&alaa

This repository contains a Java implementation skeleton for the Assignment 2 design class diagram.

## Contents
- `src/shieldcare`: Java source code
- `xml/insurer-policy-sync.xml`: example XML file for import
- `database`: place `ShieldCare.accdb` here before final submission
- `docs`: diagram images and documentation

## Run
Compile:
```bash
javac -d out src/shieldcare/*.java
```
Create JAR:
```bash
jar cfe ShieldCareEX2.jar shieldcare.ClaimImportApp -C out .
```
Run:
```bash
java -jar ShieldCareEX2.jar xml/insurer-policy-sync.xml
```
