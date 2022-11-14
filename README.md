

<!-- ABOUT THE PROJECT -->
## How to run the project

In order to run the project, first clone this repository then you need to have JAVA and Maven installed on your machine. We are using JAVA 11 as it is LTS version and for Maven you can use the latest one.

You can use the following links to download.

* JAVA
  * https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html
* Maven
  * Download - https://maven.apache.org/download.cgi
  * Install - https://maven.apache.org/install.html
  
Once Java and Maven are set up on your machine, go to root of the project cloned and run the following command:

  ```sh
  mvn clean test -Dtest=eFinancialCareers
  ```

### Note:

On running test, if you get an error related to chromedriver, it is due to chromedriver mismatch. You need to download chromedriver for your specific Chrome browser version from the following link: 

* https://chromedriver.chromium.org/

Once chromedriver is downloaded and extracted, replace it in the following directory in the cloned project:

  ```sh
  Mac:      src/test/resources/webdriver/mac
  Windows:  src/test/resources/webdriver/windows
  ```

Just make sure that your extracted chromedriver is named "chromedriver" and not something like "chromedriver 1" etc.
