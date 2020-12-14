package br.com.vieirarodrigo.candidate.business.object;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.vieirarodrigo.candidate.DTO.AccelerationDTO;
import br.com.vieirarodrigo.candidate.DTO.CandidateDTO;
import br.com.vieirarodrigo.candidate.DTO.CompanyDTO;
import br.com.vieirarodrigo.candidate.DTO.UserDTO;
import br.com.vieirarodrigo.candidate.business.service.AccelerationBS;
import br.com.vieirarodrigo.candidate.business.service.CompanyBS;
import br.com.vieirarodrigo.candidate.business.service.UserBS;
import br.com.vieirarodrigo.candidate.convert.Convert;
import br.com.vieirarodrigo.candidate.repository.CandidateRepository;
import br.com.vieirarodrigo.candidate.repository.vo.CandidateVO;

@Component
public class CandidateBO {
	@Autowired
	private CandidateRepository candidateRPS;
	@Autowired
	private AccelerationBS accelerationBS;
	@Autowired
	private CompanyBS companyBS;
	@Autowired
	private UserBS userBS;
	@Autowired
	private CandidateRepository repository;
	public CandidateVO save(CandidateDTO candidate) {
		return repository.save(CandidateVO.builder()
					.userId(candidate.getUserId())
					.accelerationId(candidate.getAccelerationId())
					.companyId(candidate.getCompanyId())
					.status(candidate.getStatus())
					.created(candidate.getCreated())
					.build());
	}
	public Optional<CandidateDTO> findByCompanyId(int companyId) {
		return this.getCandidateVOFindObjectById(
				repository.findByCompanyId(companyId));
	}
	public Optional<CandidateDTO> findByAccelerationId(int accelerationId) {
//		Optional<CandidateVO> candidateVO = Optional.ofNullable(repository.findByAccelerationId(accelerationId));
//		CandidateDTO candidate = new CandidateDTO();
//		return Optional.ofNullable(repository.findByAccelerationId(accelerationId));
		return this.getCandidateVOFindObjectById(
				repository.findByAccelerationId(accelerationId));
	}
	public Optional<CandidateDTO> getCandidateVOFindObjectById(CandidateVO candidate){
		AccelerationDTO acceleration = 
				Convert.AccelerationVOToAccelerationDTO(
						accelerationBS.getAccelerationFindById(
								candidate.getAccelerationId));
		CompanyDTO company = 
				Convert.AccelerationVOToCompanyDTO(
						companyBS.getCompanyFindById(
								candidate.getCompanyId));
		UserDTO user = 
				Convert.UserVOToUserDTO(
						companyBS.getCompanyFindById(
								candidate.getCompanyId));
		return builder()
				.acceleration(acceleration)
				.company(company)
				.user(user)
				.status(user)
				.created(candidate.getCreated())
				.build();
	}
}