package ALTO.base;

import com.googlecode.ipv6.*;

public class TypedEndpointAddress {
	String typedendpointaddress;

	final static String regexipv4 = "ipv4:(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";

	public TypedEndpointAddress(String typedendpointaddress) throws Exception {
		if (typedendpointaddress.matches(regexipv4)) {
			this.typedendpointaddress = typedendpointaddress;
		} else if (typedendpointaddress.startsWith("ipv6:")) {
			try {
				String ipv6address = typedendpointaddress.substring(5,
						typedendpointaddress.length());
				IPv6Address.fromString(ipv6address);
				this.typedendpointaddress = typedendpointaddress;
			} catch (Exception e) {
				throw new Exception(
						"TypedEndpointAddress error, illegal format!");
			}
		} else {
			throw new Exception("TypedEndpointAddress error, illegal format!");
		}
	}

	public String getTypedendpointaddress() {
		return typedendpointaddress;
	}

	public void setTypedendpointaddress(String typedendpointaddress)
			throws Exception {
		if (!(typedendpointaddress.matches(regexipv4))) {
			try {
				String ipv6address = typedendpointaddress.substring(5,
						typedendpointaddress.length());
				IPv6Address.fromString(ipv6address);
				this.typedendpointaddress = typedendpointaddress;
			} catch (Exception e) {
				throw new Exception(
						"TypedEndpointAddress error, illegal format!");
			}
		} else {
			this.typedendpointaddress = typedendpointaddress;
		}
	}
}
