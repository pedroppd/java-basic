package course.poo.enums;

public enum WorkLevel {

	JUNIOR(1, "junior"), 
	MID_LEVEL(2, "intermediario"), 
	SENIOR(1, "Senior");

	private Integer cod;

	private String descricao;

	private WorkLevel() {

	}

	private WorkLevel(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static WorkLevel toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (WorkLevel x : WorkLevel.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inv�lido: " + cod);
	}

}
