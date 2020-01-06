# SonarQube With Kotlin

SonarQube is a tool which provides static code analysis. By which we can achieve code readability and security and improve coding performance and reduce cognitive complexity.

To start with SonarQube, first download SonarQube from https://www.sonarqube.org/downloads/
After successfully download, Extract zip.
- If you are windows user then, Go to bin/windows-x86-64 folder and Open StartSonar.bat file.
- If you are linux or macOs user then open respective folder in bin folder and then run sonar.sh file.
These files will start SonarQube in our local machine.

- Run http://localhost:9000 to start local sonarqube server</br>
- Note : You have to download JDK 11 to start SonarQube else it throws an error.</br>

### Now, Setup in Android Studio.
Follow below steps for setting up SonarQube.
- Apply plugin in app level build.gradle file.
    ``` 
    apply plugin: 'org.sonarqube'
    ```
- Add maven url in allProjects task in module level build.gradle file
    ```
    maven {
        url "https://plugins.gradle.org/m2/"
    }
    ```
- Add classpath in module level build.gradle file
    ```
    classpath "org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:2.8"
    ```
- Add sonarqube properties in app level build.gradle file</br>
    ```
    sonarqube{
        properties{
            //Create project in SonarQube server
            property "sonar.projectKey", "SonarqubeKotlin"
            //Default login and password
            property "sonar.login", "admin"
            property "sonar.password", "admin"
        }
    }
    ```
- After successfully setup,run below command to analyse project code
    ```
    gradlew sonarqube -Dsonar.user.host=http://localhost:9000
    ```
