#!/usr/bin/env bash
mvn clean package
echo ""
echo "-----------------BUILD FINISH--------------------"
echo ""

echo ""
echo "-----------------EXAM1 RESULT--------------------"
echo ""
java -jar Exam1/target/*.jar
echo ""

echo ""
echo "-----------------EXAM2 RESULT--------------------"
echo ""
java -jar Exam2/target/*.jar
echo ""

echo ""
echo "-----------------EXAM3 RESULT--------------------"
echo ""
java -jar Exam3/target/*.jar