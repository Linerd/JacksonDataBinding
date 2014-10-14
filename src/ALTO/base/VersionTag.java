package ALTO.base;

import java.io.IOException;

import java.io.StringWriter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import net.sf.json.JSONString;

class Tag implements JSONString {
	private String tag;
	final static short length = 64;

	public Tag(String tag) throws Exception {
		if (tag.length() > length)
			throw new Exception("Tag format error, length exceed limit!");
		else if (tag.contains("")) {
			throw new Exception("Tag format error, illegal character detected!");

		} else {
			this.tag = tag;
		}
	}

	@Override
	public String toJSONString() {
		return tag;
	}

	@Override
	public String toString() {
		return tag;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) throws Exception {
		if (tag.length() > length)
			throw new Exception("Tag format error, length exceed limit!");
		else if (tag.contains("")) {
			throw new Exception("Tag format error, illegal character detected!");

		} else {
			this.tag = tag;
		}
	}
}

public class VersionTag {
	private ResourceID resource_id;

	private Tag tag;

	public ResourceID getResource_id() {
		return resource_id;
	}

	public void setResource_id(ResourceID resource_id) {
		this.resource_id = resource_id;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
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
