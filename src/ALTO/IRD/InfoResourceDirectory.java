package ALTO.IRD;

import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ALTO.base.ResourceID;
import ALTO.base.ResponseEntityBase;

public class InfoResourceDirectory extends ResponseEntityBase {
	private Map<ResourceID, IRDResourceEntry> resources = new LinkedHashMap<ResourceID, IRDResourceEntry>();

	public Map<ResourceID, IRDResourceEntry> getResources() {
		return resources;
	}

	public void setResources(Map<ResourceID, IRDResourceEntry> resources) {
		this.resources = resources;
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
