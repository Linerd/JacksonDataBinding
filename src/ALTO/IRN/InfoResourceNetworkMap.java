package ALTO.IRN;

import java.util.Map;

import ALTO.base.AddressType;
import ALTO.base.EndpointPrefix;
import ALTO.base.PIDName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoResourceNetworkMap {
	IRNMeta meta;
	@JsonProperty("network-map")
	Map<PIDName, Map<AddressType, EndpointPrefix>> networkmap;

	public IRNMeta getMeta() {
		return meta;
	}

	public Map<PIDName, Map<AddressType, EndpointPrefix>> getNetworkmap() {
		return networkmap;
	}

	public void setMeta(IRNMeta meta) {
		this.meta = meta;
	}

	public void setNetworkmap(
			Map<PIDName, Map<AddressType, EndpointPrefix>> networkmap) {
		this.networkmap = networkmap;
	}

}
