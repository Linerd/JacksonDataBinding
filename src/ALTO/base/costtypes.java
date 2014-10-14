package ALTO.base;

public enum costtypes {
	num_routing, num_hop, ord_routing, ord_hop;

	@Override
	public String toString() {
		return this.name();
	}
}
