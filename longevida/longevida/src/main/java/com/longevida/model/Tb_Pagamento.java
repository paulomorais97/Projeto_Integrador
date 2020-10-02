package com.longevida.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Tb_Pagamento {
	
	@Column
	@NotNull
	private String forma_pagamento;
	
	@Column
	@NotNull
	private double valor_total;
	
	@Column
	@NotNull
	private String cartao_pagamento;
	
	@Column
	@NotNull
	private String boleto_pagamento;

	public String getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public String getCartao_pagamento() {
		return cartao_pagamento;
	}

	public void setCartao_pagamento(String cartao_pagamento) {
		this.cartao_pagamento = cartao_pagamento;
	}

	public String getBoleto_pagamento() {
		return boleto_pagamento;
	}

	public void setBoleto_pagamento(String boleto_pagamento) {
		this.boleto_pagamento = boleto_pagamento;
	}
	
	
	//FAZER FK_ID_PRODUTO
	//FAZER FK_ID_USUARIO
	
}