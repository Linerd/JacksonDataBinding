package ALTO.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VersionTag {

	@JsonProperty("resource-id")
	private ResourceID resourceid;

	final static short length = 64;
	private String tag;

	public ResourceID getResourceid() {
		return resourceid;
	}

	public void setResourceid(ResourceID resourceid) {
		this.resourceid = resourceid;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) throws Exception {
		if (tag.length() > length)
			throw new Exception("Tag format error, length exceed limit!");
		else {
			this.tag = tag;
		}
	}
}
