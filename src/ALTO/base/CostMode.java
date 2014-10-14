package ALTO.base;

import net.sf.json.JSONString;

public class CostMode implements JSONString {
	private enum CostModeValue {
		numerical, ordinal;
	}

	CostModeValue costmode;

	public CostModeValue getCostmode() {
		return costmode;
	}

	public void setCostmode(CostModeValue costmode) {
		this.costmode = costmode;
	}

	@Override
	public String toJSONString() {
		return costmode.name();
	}

	@Override
	public String toString() {
		return costmode.name();
	}

}
