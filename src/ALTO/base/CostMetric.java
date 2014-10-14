package ALTO.base;

import net.sf.json.JSONString;

public class CostMetric implements JSONString {
	String costmetric;
	static final String regex = ".[^a-zA-Z0-9\\-:_\\.].";
	static final short length = 32;

	public CostMetric(String costmetric) throws Exception {
		if (costmetric.matches(regex)) {
			throw new Exception(
					"CostMetric format error, illegal character detected!");
		} else if (costmetric.length() > length) {
			throw new Exception("CostMetric format error, length exceed limit!");
		} else {
			this.costmetric = costmetric;
		}
	}

	@Override
	public String toJSONString() {
		return costmetric;
	}

	public String getCostmetric() {
		return costmetric;
	}

	public void setCostmetric(String costmetric) throws Exception {
		if (costmetric.matches(regex)) {
			throw new Exception(
					"CostMetric format error, illegal character detected!");
		} else if (costmetric.length() > length) {
			throw new Exception("CostMetric format error, length exceed limit!");
		} else {
			this.costmetric = costmetric;
		}
	}

	@Override
	public String toString() {
		return costmetric;
	}

}
