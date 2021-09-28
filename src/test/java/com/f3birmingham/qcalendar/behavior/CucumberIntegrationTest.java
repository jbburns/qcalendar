package com.f3birmingham.qcalendar.behavior;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(  plugin = {"pretty"}, features="src/test/resources/behavior")
public class CucumberIntegrationTest {
}