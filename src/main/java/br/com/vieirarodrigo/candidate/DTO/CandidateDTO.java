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
	public AccelerationDTO acceleration;
	public CompanyDTO company;
	public UserDTO user;
	public int status;
	public Date created;
}