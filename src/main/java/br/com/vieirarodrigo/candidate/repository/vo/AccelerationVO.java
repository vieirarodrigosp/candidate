package br.com.vieirarodrigo.candidate.repository.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@Table(name = "ACCELERATION")
public class AccelerationVO implements Serializable {
	public static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	public String name;
	public String slug;
	@Column(name = "CHALLENGE_ID")
	public int challengeId;
	@Column(name = "CREATED_AT")
	public Date created;
}