package br.com.vieirarodrigo.candidate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vieirarodrigo.candidate.repository.vo.CandidateVO;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateVO, Integer>{
	CandidateVO findByCompanyId(int companyId);
	CandidateVO findByAccelerationId(int accelerationId);
}