package br.com.vieirarodrigo.candidate.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CandidateDTO {
	public int userId;
	public int accelerationId;
	public int companyId;
	public int status;
	public Date created;
}