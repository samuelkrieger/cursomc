package br.com.samuel.cursomc.domain.enums;

public enum TipoCliente {
	PESSOAFISICA(1,"Pessoa Fisica"),
	PESSOAJURIDICA(2,"Pessoa Juridica");

	private int cod;
	private String Descricao;
	
	
	private TipoCliente(int cod, String descricao) {
		Descricao = descricao;
	}
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return Descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null ) {
			return null;
		}
		for (TipoCliente xCliente : TipoCliente.values()) {
			if(cod.equals(xCliente)) {
				return xCliente;
			}
			
		
		}
		throw new IllegalArgumentException("id invalido"+ cod);
	}
	
	
	
}
