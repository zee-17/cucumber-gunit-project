package com.mazen.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",

        "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",

                "json:target/cucumber.json",
                "junit:target/junit/junit-report.xml", // jenkins report

        },

        features = "src/test/resources/features",
        glue = "com/mazen/step_definitions",
        dryRun = false,
        tags = ""
       // publish = true
)
public class CukesRunner {

}
