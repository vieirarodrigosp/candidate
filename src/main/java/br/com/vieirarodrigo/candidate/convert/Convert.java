package br.com.vieirarodrigo.candidate.convert;

import java.util.Date;

import br.com.vieirarodrigo.candidate.DTO.AccelerationDTO;
import br.com.vieirarodrigo.candidate.DTO.CompanyDTO;
import br.com.vieirarodrigo.candidate.repository.vo.AccelerationVO;
import br.com.vieirarodrigo.candidate.repository.vo.CompanyVO;

public class Convert {
	public static AccelerationDTO AccelerationVOToAccelerationDTO(AccelerationVO accelaretion) {
		return AccelerationDTO.builder()
					.id(accelaretion.getId())
					.name(accelaretion.getName())
					.slug(accelaretion.getSlut())
					.challengeId(accelaretion.getChallengeId())
					.created(accelaretion.getCreated())
				.build();
	}
	public static CompanyDTO AccelerationVOToCompanyDTO(CompanyVO company) {
		return CompanyDTO.builder()
				.id(company.getId())
				.name(company.getName())
				.slug(company.getSlut())
				.challengeId(company.getChallengeId())
				.created(company.getCreated())
			.build();
	}
}
