package wooteco.subway.admin.domain.subwayShortestPath;

import java.util.function.Function;

import wooteco.subway.admin.domain.LineStation;

/**
 *    class description
 *
 *    @author HyungJu An, KuenHwi Choi
 */
public enum PathType {
	DISTANCE(LineStation::getDistance),
	DURATION(LineStation::getDuration);

	private final Function<LineStation, Integer> expression;

	PathType(Function<LineStation, Integer> expression) {
		this.expression = expression;
	}

	public int findWeightOf(LineStation lineStation) {
		return expression.apply(lineStation);
	}
}