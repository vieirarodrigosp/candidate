package br.com.vieirarodrigo.candidate.repository.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "CANDIDATE")
public class CandidateVO implements Serializable {
	public static final long serialVersionUID = 1L;
	@Column(name = "USER_ID")
	public int userId;
	@Column(name = "ACCELERATION_ID")
	public int accelerationId;
	@Column(name = "COMPANY_ID")
	public int companyId;
	public int status;
	@Column(name = "CREATED_AT")
	public Date created;
}