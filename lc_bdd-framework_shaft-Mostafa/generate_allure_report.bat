@echo off
:: If you already have a valid JAVA_HOME environment variable set, feel free to comment the below two lines
set JAVA_HOME=C:\Users\mostafa.hossam\.jdks\openjdk-23.0.1
set path=%JAVA_HOME%\bin;%path%
set path=C:\Users\mostafa.hossam\.m2\repository\allure\allure-2.30.0\bin;%path%
allure serve allure-results -h localhost
pause
exit