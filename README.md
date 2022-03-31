# End Test fetch API

Steps:-
1. setup mongo
2. create database "EndTest"
3. Setup usename and pass as root,root respectively in "EndTest" database 
4. create 2 collection as "EndTestProjectSuiteLinking" and "endTest"
5. download json for endtest suite from endtest website and then upload it to "endTest" collection
6. go inside mongo-service folder
7. run command:- mvn clean install -U
8. run command:-  java -jar target/mongo-service-1.0-SNAPSHOT.jar
9. wait for given log "Started EndTestApplication" in terminal
10. open new terminal
11. open endTestPage and inspect element.
12. open browser console
13. type "appID" and hit enter. this will give you AppID
14. type "appCode" and hit enter. this will give you appCode
15. run below api:- 
16. curl --location --request GET 'http://localhost:9990/endTest/getSuiteTestIdDateAndSaveInLinkingDB?appId=<appID>&appCode=<APP_code>'
17. run command:- mvn test -P transform
18. above command will create .txt for all suite added in mongo
19. run command: mvn test -P DynamicSuite -DsuiteXml=TestSuiteXMLCreation.xml
20. above command will create xml runner files and selenium code for each suite.
21. set Lambdatest credential via below command. https://automation.lambdatest.com/timeline/?viewType=build&page=1
22. run command:- export LT_USERNAME="<lambdatest Automation username>"
23. run command:- export LT_ACCESS_KEY="<lambdatest Automation key>"
24. run each suite via command:-  mvn test -P testNGRunner -DsuiteXml=<suitename>.xml



add key and username for Lambdatest in cucumber.yaml
1. create cucumber.yaml file in location src/main/java/cucumberRunnerFiles/testrunner/cucumber.yaml
2. add all values and copy template from src/main/java/cucumberRunnerFiles/testrunner/cucumber.yaml.sample.yaml
3. do not replace name of cucumber.yaml.sample.yaml file. your key will be public if you do that. this file need to be .gitignore
4. create feature file for each java suite file in src/main/java/features
5. create a test as a scenario in each feature file.
6. create step def in src/main/java/StepDef
7. steps will be plan text don't take variables for default steps as your int value in name will be treated as variable.
8. use the below command to run your test. CUCUMBER_FILTER_TAGS=<Tag> mvn test -P cucumberRun  -DsuiteXmlFile=<parallel count xml> -DJENKINS_JOB_IDENTIFIER=<unique build name. use ${BUILD_ID} if using jenkins>
9. eg:- CUCUMBER_FILTER_TAGS=@regression_colombia_ecom_1 mvn test -P cucumberRun  -DsuiteXmlFile=5Parallel.xml -DJENKINS_JOB_IDENTIFIER=Run1
