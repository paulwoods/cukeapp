package org.mrpaulwoods.cukeapp;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bag.feature", plugin = {"pretty", "html:target/cucumber"})
@Category(IntegrationTest.class)
public class BagCucumberIntegrationTest {

    @Test
    public void fake() {
        assert true;
    }


}
