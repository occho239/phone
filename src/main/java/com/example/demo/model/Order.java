package com.example.demo.model;
// Generated Jul 2, 2020 5:29:35 PM by Hibernate Tools 5.4.14.Final

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1932048841275779863L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "id_user")
	private int idUser;

	@Column(name = "name_emp")
	private String nameEmp;

	@Column(name = "tel_emp")
	private String telEmp;

	@Column(name = "address_emp")
	private String addressEmp;

	@Column(name = "city_emp")
	private String cityEmp;

	@OneToOne (targetEntity = Cart.class,fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_cart")
	private Cart cart;


}
