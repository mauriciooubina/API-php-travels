package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {

    @JsonProperty("country_name")
    private String country_name;
    @JsonProperty("cases")
    private String cases;
    @JsonProperty("deaths")
    private String deaths;
    @JsonProperty("region")
    private String region;
    @JsonProperty("total_recovered")
    private String total_recovered;
    @JsonProperty("new_deaths")
    private String new_deaths;
    @JsonProperty("new_cases")
    private String new_cases;
    @JsonProperty("serious_critical")
    private String serious_critical;
    @JsonProperty("active_cases")
    private String active_cases;
    @JsonProperty("total_cases_per_1m_population")
    private String total_cases_per_1m_population;
    @JsonProperty("deaths_per_1m_population")
    private String deaths_per_1m_population;
    @JsonProperty("total_tests")
    private String total_tests;
    @JsonProperty("tests_per_1m_population")
    private String tests_per_1m_population;

    public String getCountry_name() {
        return country_name;
    }

    public String getCases() {
        return cases;
    }

    public String getDeaths() {
        return deaths;
    }

    public String getRegion() {
        return region;
    }

    public String getTotal_recovered() {
        return total_recovered;
    }

    public String getNew_deaths() {
        return new_deaths;
    }

    public String getNew_cases() {
        return new_cases;
    }

    public String getSerious_critical() {
        return serious_critical;
    }

    public String getActive_cases() {
        return active_cases;
    }

    public String getTotal_cases_per_1m_population() {
        return total_cases_per_1m_population;
    }

    public String getDeaths_per_1m_population() {
        return deaths_per_1m_population;
    }

    public String getTotal_tests() {
        return total_tests;
    }

    public String getTests_per_1m_population() {
        return tests_per_1m_population;
    }

}
