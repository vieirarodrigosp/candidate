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
public class AccelerationDTO {
	public int id;
	public String name;
	public String slug;
	public int challengeId;
	public Date created;
}