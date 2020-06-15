package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class World_Total {

    @JsonProperty("world_total")
    private Totals totals;
    @JsonProperty("countries_stat")
    private List<Country> countries;

    public Totals getTotals() {
        return totals;
    }

    public void setTotals(Totals totals) {
        this.totals = totals;
    }

    public Country getCountry(String country) {
        return countries.get(getCountryPosition(country));
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public int getCountryPosition(String country){
        int result = 0;
        for(int pos = 0; pos<=countries.size()-1;pos++){
            if(countries.get(pos).getCountry_name().equals(country)){
                result = pos;
            }
        }
        return result;
    }

}
