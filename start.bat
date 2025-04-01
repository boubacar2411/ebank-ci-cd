@echo off
echo Starting E-Bank Application...

REM Vérifier si Java est installé
java -version >nul 2>&1
if errorlevel 1 (
    echo Java n'est pas installé. Veuillez installer Java 17.
    pause
    exit /b 1
)

REM Vérifier si Maven est installé
mvn -version >nul 2>&1
if errorlevel 1 (
    echo Maven n'est pas installé. Veuillez installer Maven.
    pause
    exit /b 1
)

REM Nettoyer et compiler le projet
echo Compilation du projet...
call mvn clean install -DskipTests

REM Démarrer l'application
echo Démarrage de l'application...
call mvn spring-boot:run

pause 