package br.com.vieirarodrigo.candidate.business.service;

import org.springframework.stereotype.Service;

import br.com.vieirarodrigo.candidate.gateway.CompanyGTW;
import br.com.vieirarodrigo.candidate.repository.vo.CompanyVO;

@Service
public class CompanyBS implements CompanyGTW {
	private final CompanyGTW companyGTW;
	public CompanyBS(CompanyGTW companyGTW) { this.companyGTW = companyGTW; }
	@Override
	public CompanyVO getCompanyFindById(int companyId) {
		return this.companyGTW.getCompanyFindById(companyId);
	}
}