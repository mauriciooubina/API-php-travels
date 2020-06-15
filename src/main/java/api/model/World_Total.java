package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class World_Total {

    @JsonProperty("world_total")
    private Totals totals;

    public Totals getTotals() {
        return totals;
    }

    public void setTotals(Totals totals) {
        this.totals = totals;
    }

}
