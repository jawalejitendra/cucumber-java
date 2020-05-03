# cucumber-java-framework
Cucumber Java Framework

feature/cucumber-stuff
Cucumber features path: src/test/resources/features
Cucumber step definitions: src/test/java/stepdefinitions
Cucumber Runner file: src/test/java/runnerfile/CucumberTest


Execute feature file from src/test/resources/features/Feature1.feature
Execute cucumber runner file from src/test/java/runnerfile/CucumberTest
Execute from maven test step as mvn clean test -Dcucumber.options="--tags @scenario1"

feature/add-google-guice
added google guice dependency. 
@googleguice scenario  has shared step definitions in multiple class files but shares the same data context.

