package atdd.path.application.dto;

import atdd.path.domain.Station;

public class CreateStationRequestView {
    private String name;

    public String getName() {
        return name;
    }

    public Station toStation() {
        return new Station(name);
    }
}
