package org.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\FeatureFiles\\loginfeature",glue="org.file",snippets=SnippetType.CAMELCASE)

public class RunnerClass {


}
