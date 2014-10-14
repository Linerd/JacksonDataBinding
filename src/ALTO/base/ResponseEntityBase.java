package ALTO.base;

import java.util.LinkedHashMap;

public class ResponseEntityBase {
	protected LinkedHashMap<String, Object> meta = new ResponseMeta<String, Object>();

	public LinkedHashMap<String, Object> getMeta() {
		return meta;
	}

	public void setMeta(ResponseMeta<String, Object> meta) {
		this.meta = meta;
	}

}
