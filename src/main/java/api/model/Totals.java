package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Totals {

    @JsonProperty("total_cases")
    private String total_cases;
    @JsonProperty("new_cases")
    private String new_cases;
    @JsonProperty("total_deaths")
    private String total_deaths;
    @JsonProperty("new_deaths")
    private String new_deaths;
    @JsonProperty("total_recovered")
    private String total_recovered;
    @JsonProperty("active_cases")
    private String active_cases;
    @JsonProperty("serious_critical")
    private String serious_critical;
    @JsonProperty("total_cases_per_1m_population")
    private String total_cases_per_1m_population;
    @JsonProperty("deaths_per_1m_population")
    private String deaths_per_1m_population;
    @JsonProperty("statistic_taken_at")
    private String statistic_taken_at;


    public String getTotal_cases() {
        return total_cases;
    }

    public String getNew_cases() {
        return new_cases;
    }

    public String getTotal_deaths() {
        return total_deaths;
    }

    public String getNew_deaths() {
        return new_deaths;
    }

    public String getTotal_recovered(){return total_recovered;}

    public String getActive_cases(){return active_cases;}

    public String getSerious_critical(){return serious_critical;}

    public String getTotal_cases_per_1m_population(){return total_cases_per_1m_population;}

    public String getDeaths_per_1m_population(){return deaths_per_1m_population;}

    public String getStatistic_taken_at(){return statistic_taken_at;}


}
