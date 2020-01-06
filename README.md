<h4>SonarQube With Kotlin</h4>
<p>
SonarQube is a tool which provides static code analysis.By which we can achieve code readability and security and improve coding performance and reduce cognitive complexity.
</p>
<p>To start with SonarQube, first download SonarQube from https://www.sonarqube.org/downloads/</br>
After successfully download, Extract zip.</br>
If you are windows user then, Go to bin/windows-x86-64 folder and Open StartSonar.bat file.</br>
If you are linux or macOs user then open respective folder in bin folder and then run sonar.sh file.</br>
These files will start SonarQube in our local machine.<p></br>

Run http://localhost:9000 to start local sonarqube server</br>
Note : You have to download JDK 11 to start SonarQube else it throws an error.</br>

Now, Setup in Android Studio.</br>
Follow below steps for setting up SonarQube.</br>
1) Apply plugin in app level build.gradle file.</br>
    apply plugin: 'org.sonarqube'</br>
2) Add maven url in allProjects task in module level build.gradle file</br>
     maven {</br>
                url "https://plugins.gradle.org/m2/"</br>
            }</br>
3) Add classpath in module level build.gradle file</br>
        classpath 'org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:2.8'</br>
4) Add sonarqube properties in app level build.gradle file</br>
    sonarqube{</br>
            properties{</br>
                //Create project in SonarQube server</br>
                property "sonar.projectKey", "SonarqubeKotlin"</br>
                //Default login and password</br>
                property "sonar.login", "admin"</br>
                property "sonar.password", "admin"</br>
            }</br>
        }</br>
5) After successfully setup,run below command to analyse project code</br>
    gradlew sonarqube -Dsonar.user.host=http://localhost:9000</br>
