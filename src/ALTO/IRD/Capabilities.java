package ALTO.IRD;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ALTO.base.costtypes;

public class Capabilities {
	private boolean cost_constraints;
	private List<costtypes> cost_type_names;

	public boolean isCost_constraints() {
		return cost_constraints;
	}

	public void setCost_constraints(boolean cost_constraints) {
		this.cost_constraints = cost_constraints;
	}

	public List<costtypes> getCost_type_names() {
		return cost_type_names;
	}

	public void setCost_type_names(List<costtypes> cost_type_names) {
		this.cost_type_names = cost_type_names;
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
