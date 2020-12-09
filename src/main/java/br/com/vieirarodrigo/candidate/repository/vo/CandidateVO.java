package br.com.vieirarodrigo.candidate.repository.vo;

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
public class CandidateVO {
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "ACCELERATION_ID")
	private int accelerationId;
	@Column(name = "COMPANY_ID")
	private int companyId;
	private int status;
	@Column(name = "CREATED_AT")
	private Date created;
}