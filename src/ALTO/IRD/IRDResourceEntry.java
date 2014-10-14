package ALTO.IRD;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonPropertyOrder({ "uri", "media-type", "accepts", "capabilities", "uses" })
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class IRDResourceEntry {

	@JsonProperty("media-type")
	String media_type;

	String uri;
	String accepts;
	Map<String, Object> capabilities;
	List<String> uses;

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getMedia_type() {
		return media_type;
	}

	public void setMedia_type(String media_type) {
		this.media_type = media_type;
	}

	public String getAccepts() {
		return accepts;
	}

	public void setAccepts(String accepts) {
		this.accepts = accepts;
	}

	public List<String> getUses() {
		return uses;
	}

	public void setUses(List<String> uses) {
		this.uses = uses;
	}

	public Map<String, Object> getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(Map<String, Object> capabilities) {
		this.capabilities = capabilities;
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
