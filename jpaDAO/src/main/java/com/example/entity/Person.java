package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pallabitable")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

	@Id
	@Column(name = "pallabiid")
	private int id;
	@Column(name = "pallabiname", length = 20)
	private String name;
	@Column(name = "pallabiemail", length = 22)
	private String email;

}
