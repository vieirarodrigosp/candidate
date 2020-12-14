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
@Table(name = "USER")
public class UserVO implements Serializable {
	public static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	@Column(name = "FULL_NAME")
	public String fullname;
	public String email;
	public String nickname;
	public String password;
	@Column(name = "CREATED_AT")
	public Date created;
}