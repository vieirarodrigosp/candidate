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
public class CompanyDTO {
	public int id;
	public String name;
	public String slug;
	public Date created;
}