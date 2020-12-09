package br.com.vieirarodrigo.candidate.business.object;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.vieirarodrigo.candidate.DTO.CandidateDTO;
import br.com.vieirarodrigo.candidate.repository.CandidateRepository;
import br.com.vieirarodrigo.candidate.repository.vo.CandidateVO;

@Component
public class CandidateBO {
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
	public Optional<CandidateVO> findByCompanyId(int companyId) {
		return Optional.ofNullable(repository.findByCompanyId(companyId));
	}
	public Optional<CandidateVO> findByAccelerationId(int accelerationId) {
		return Optional.ofNullable(repository.findByAccelerationId(accelerationId));
	}
}