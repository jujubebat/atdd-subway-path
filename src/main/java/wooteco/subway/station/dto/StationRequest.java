package wooteco.subway.station.dto;

import javax.validation.constraints.NotBlank;
import wooteco.subway.station.domain.Station;

public class StationRequest {

    @NotBlank(message = "역 이름은 필수 입력 값입니다.")
    private String name;

    public StationRequest() {
    }

    public StationRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Station toStation() {
        return new Station(name);
    }
}
