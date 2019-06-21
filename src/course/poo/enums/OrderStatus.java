package course.poo.enums;

public enum OrderStatus {

	PENDING_PAYMENT(1, "pagamento_pendete"), PROCESSING(2, "processando"), SHIPPED(3, "enviado"),
	DELIVERED(4, "entregue");

	private int cod;
	private String descricao;

	private OrderStatus(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static OrderStatus toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}

		for (OrderStatus x : OrderStatus.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
