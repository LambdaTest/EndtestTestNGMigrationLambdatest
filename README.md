# Migrate Endtest TestNG Tests to TestMu AI (Formerly LambdaTest)

<p align="center">
  <a href="https://www.testmuai.com/"><img src="https://img.shields.io/badge/MADE%20BY%20TestMu%20AI-000000.svg?style=for-the-badge&labelColor=000" alt="Made by TestMu AI"></a>
  <a href="https://mvnrepository.com/artifact/org.testng/testng"><img src="https://img.shields.io/maven-central/v/org.testng/testng.svg?style=for-the-badge&labelColor=000000" alt="TestNG version"></a>
  <a href="https://community.testmuai.com/"><img src="https://img.shields.io/badge/Join%20the%20community-blueviolet.svg?style=for-the-badge&labelColor=000000" alt="Community"></a>
</p>

## Getting Started

[TestMu AI](https://www.testmuai.com/) (Formerly LambdaTest) is the world's first full-stack AI Agentic Quality Engineering platform that empowers teams to test intelligently, smarter, and ship faster. Built for scale, it offers a full-stack testing cloud with 10K+ real devices and 3,000+ browsers. With AI-native test management, MCP servers, and agent-based automation, TestMu AI supports Selenium, Appium, Playwright, and all major frameworks.

With TestMu AI (Formerly LambdaTest), you can migrate Endtest test suites to a TestNG-based Selenium framework and run them at scale on the cloud. This sample shows how to fetch Endtest suites via API, generate TestNG runner files, and execute them on the TestMu AI (Formerly LambdaTest) cloud.

- [Sign up on TestMu AI](https://www.testmuai.com/register/) (Formerly LambdaTest).
- Follow the [TestMu AI documentation](https://www.testmuai.com/support/docs/) (Formerly LambdaTest) for the full setup walkthrough.

### Prerequisites

- Java 8 or later
- Maven
- MongoDB
- A TestMu AI (Formerly LambdaTest) account with automation access

### Setup

Clone the repository:

```bash
git clone https://github.com/LambdaTest/EndtestTestNGMigrationLambdatest.git
cd EndtestTestNGMigrationLambdatest
```

Set up MongoDB:

1. Install and start MongoDB
2. Create a database named `EndTest`
3. Set username and password to `root`/`root` in the `EndTest` database
4. Create two collections: `EndTestProjectSuiteLinking` and `endTest`
5. Download the JSON for your Endtest suite from the Endtest website and upload it to the `endTest` collection

Build the mongo-service:

```bash
cd mongo-service
mvn clean install -U
java -jar target/mongo-service-1.0-SNAPSHOT.jar
```

Wait for the log line `Started EndTestApplication` in the terminal.

Set your credentials as environment variables.

**macOS / Linux:**

```bash
export LT_USERNAME="YOUR_USERNAME"
export LT_ACCESS_KEY="YOUR_ACCESS_KEY"
```

**Windows:**

```bash
set LT_USERNAME="YOUR_USERNAME"
set LT_ACCESS_KEY="YOUR_ACCESS_KEY"
```

### Fetching Suite Data and Generating Test Files

1. Open the Endtest page in your browser, open the browser console, type `appID` and press Enter to get the App ID. Repeat for `appCode`.
2. Call the fetch API:

```bash
curl --location --request GET 'http://localhost:9990/endTest/getSuiteTestIdDateAndSaveInLinkingDB?appId=<appID>&appCode=<APP_code>'
```

3. Generate `.txt` files for all suites:

```bash
mvn test -P transform
```

4. Generate XML runner files and Selenium code for each suite:

```bash
mvn test -P DynamicSuite -DsuiteXml=TestSuiteXMLCreation.xml
```

### Cucumber Integration

1. Create `cucumber.yaml` in `src/main/java/cucumberRunnerFiles/testrunner/cucumber.yaml` (use `cucumber.yaml.sample.yaml` as a template — do not rename the sample file as it would expose your credentials; keep it in `.gitignore`)
2. Create a feature file for each Java suite file in `src/main/java/features`
3. Add test scenarios in each feature file
4. Create step definitions in `src/main/java/StepDef`

### Run tests

Run individual suites:

```bash
mvn test -P testNGRunner -DsuiteXml=<suitename>.xml
```

Run Cucumber suites:

```bash
CUCUMBER_FILTER_TAGS=<Tag> mvn test -P cucumberRun -DsuiteXmlFile=<parallel_count_xml> -DJENKINS_JOB_IDENTIFIER=<unique_build_name>
```

Example:

```bash
CUCUMBER_FILTER_TAGS=@regression_colombia_ecom_1 mvn test -P cucumberRun -DsuiteXmlFile=5Parallel.xml -DJENKINS_JOB_IDENTIFIER=Run1
```

View results on your TestMu AI dashboard at https://automation.lambdatest.com/timeline/.

## Contributions

Contributions are welcome. Open an issue to discuss your idea before submitting a pull request. When reporting bugs, include your Java version, OS, and TestNG version.

## TestMu AI (Formerly LambdaTest) Community

Connect with testers and developers in the [TestMu AI Community](https://community.testmuai.com/). Ask questions, share what you are building, and discuss best practices in test automation and DevOps.

## TestMu AI (Formerly LambdaTest) Certifications

Earn free [TestMu AI Certifications](https://www.testmuai.com/certifications/) for testers, developers, and QA engineers. Validate your skills in Selenium, Cypress, Playwright, Appium, Espresso and more. Industry-recognized, shareable on LinkedIn, and built by practitioners, not marketers.

## Learning Resources by TestMu AI (Formerly LambdaTest)

Learn modern testing through tutorials, guides, videos, and weekly updates:

* [TestMu AI Blog](https://www.testmuai.com/blog/)
* [TestMu AI Learning Hub](https://www.testmuai.com/learning-hub/)
* [TestMu AI on YouTube](https://www.youtube.com/@TestMuAI)
* [TestMu AI Newsletter](https://www.testmuai.com/newsletter/)

## LambdaTest is Now TestMu AI

On **January 12, 2026**, [LambdaTest evolved to TestMu AI](https://www.testmuai.com/lambdatest-is-now-testmuai/), the world's first fully autonomous **Agentic AI Quality Engineering Platform**.

Same team. Same infrastructure. Same customer accounts. All existing LambdaTest logins, scripts, capabilities, and integrations continue to work without change.

Find the new home for [LambdaTest](https://www.testmuai.com).

### How LambdaTest Evolved into TestMu AI

In 2017, we launched LambdaTest with a simple mission: make testing fast, reliable, and accessible. As LambdaTest grew, we expanded into Test Intelligence, Visual Regression Testing, Accessibility Testing, API Testing, and Performance Testing, covering the full depth of the testing lifecycle.

As software development entered the AI era, testing had to evolve, too. We rebuilt the architecture to be AI-native from the ground up, with autonomous agents that **plan, author, execute, analyze, and optimize tests** while keeping humans in the loop. The platform integrates with your repos, CI, IDEs, and terminals, continuously learning from every code change and development signal.

That evolution earned a new name: **TestMu AI**, built for an AI-first future of quality engineering. TestMu is not a new name for us. It is the name of our annual community conference, which has brought together 100,000+ quality engineers to discuss how AI would reshape testing, long before that became an industry norm.

What started as a high-performance cloud testing platform has transformed into an AI-native, multi-agent system powering a connected, end-to-end quality layer. That evolution defined a new identity: LambdaTest evolved into TestMu AI, built for an AI-first future of quality engineering.

## Support

Got a question? Email [support@testmuai.com](mailto:support@testmuai.com) or chat with us 24x7 from our chat portal.
