package br.com.vieirarodrigo.candidate.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vieirarodrigo.candidate.DTO.CandidateDTO;
import br.com.vieirarodrigo.candidate.business.object.CandidateBO;
import br.com.vieirarodrigo.candidate.repository.vo.CandidateVO;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/employee")
public class CandidateController {
	@Autowired
	private CandidateBO candidateBO;
	@ApiOperation(value="This service creates a new Candidate in the database.")
	@PostMapping(path = "/v1/Candidates")
	public @ResponseBody CandidateVO save(@RequestBody CandidateDTO Candidate) {
		return candidateBO.save(Candidate);
	}
	@ApiOperation(value="This service seeks to Candidate by CompanyId.")
	@GetMapping(path = "/v1/Candidates/{id}")
	public @ResponseBody Optional<CandidateDTO> findByCompanyId(@PathVariable int companyId) {
		return candidateBO.findByCompanyId(companyId);
	}
	@ApiOperation(value="This service seeks to Candidate by AccelerationId.")
	@GetMapping(path = "/v1/Candidates/{name}")
	public @ResponseBody Optional<CandidateDTO> findByAccelerationId(@PathVariable int accelerationId) {
		return candidateBO.findByAccelerationId(accelerationId);
	}
}