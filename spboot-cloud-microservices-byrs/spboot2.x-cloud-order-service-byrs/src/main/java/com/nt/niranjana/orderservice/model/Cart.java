package com.nt.niranjana.orderservice.model;

import lombok.Data;

@Data
public class Cart 
{
	private Integer cartId;
	private String cartCode;
	private Double cartCost;
}
