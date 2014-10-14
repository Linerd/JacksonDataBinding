package ALTO.base;

import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class CostType {
	CostMetric cost_metric;
	CostMode cost_mode;
	String desciption;

	public CostMetric getCost_metric() {
		return cost_metric;
	}

	public void setCost_metric(CostMetric cost_metric) {
		this.cost_metric = cost_metric;
	}

	public CostMode getCost_mode() {
		return cost_mode;
	}

	public void setCost_mode(CostMode cost_mode) {
		this.cost_mode = cost_mode;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	@Override
	public String toString() {
		ObjectMapper om = new ObjectMapper();
		om.configure(SerializationFeature.INDENT_OUTPUT, true);
		StringWriter sw = new StringWriter();
		try {
			om.writeValue(sw, this);
			return sw.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
