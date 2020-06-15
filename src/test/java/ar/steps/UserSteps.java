package ar.steps;

import api.config.EntityConfiguration;
import api.model.Country;
import api.model.World_Total;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import com.google.api.client.repackaged.com.google.common.base.Splitter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.lang.StringUtils;
import org.testng.Assert;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class UserSteps extends PageSteps {

    @When("^I perform a '(.*)' to '(.*)' endpoint with the '(.*)' and '(.*)'$")
    public void doRequest(String methodName, String entity, String jsonName, String jsonReplacementValues) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Class entityService = EntityConfiguration.valueOf(entity).getEntityService();
        Map<String, String> parameters = getParameters(jsonReplacementValues);
        String jsonPath = "request/".concat(jsonName);
        if (parameters == null) {
            entityService.getMethod(methodName.toLowerCase(), String.class).invoke("", jsonPath);
        } else {
            entityService.getMethod(methodName.toLowerCase(), String.class, Map.class).invoke("", jsonPath, parameters);
        }
    }

    private Map<String, String> getParameters(String jsonReplacementValues) {
        Map<String, String> parameters = null;
        if (!StringUtils.isEmpty(jsonReplacementValues)) {
            parameters = Splitter.on(",").withKeyValueSeparator(":").split(jsonReplacementValues);
        }
        return parameters;
    }

    @Then("^I will get the proper status code '(.*)'$")
    public void iWillGetTheProperStatusCodeStatusCode(String expStatusCode) {
        int actualStatusCode = APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(Integer.parseInt(expStatusCode), actualStatusCode, "The status code are not equals");
    }

    @And("^The total cases per 1m population is '(.*)'$")
    public void theProperIdReturnedInTheResponse(String cases) {
        World_Total response = (World_Total) APIManager.getLastResponse().getResponse();
        String totalCases = String.valueOf(response.getTotals().getTotal_cases_per_1m_population());
        Assert.assertEquals(totalCases, cases);
    }

    @And("The total cases per 1m population for (.*) is (.*)")
    public void theTotalCasesPerMPopulationForCountryIsCases(String country, String cases) {
        World_Total response = (World_Total) APIManager.getLastResponse().getResponse();
        Country countryName = response.getCountry(country);
        String totalCases = countryName.getTotal_cases_per_1m_population();
        Assert.assertEquals(totalCases, cases);
    }
}
