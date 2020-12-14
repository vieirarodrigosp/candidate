package br.com.vieirarodrigo.candidate.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.vieirarodrigo.candidate.repository.vo.CompanyVO;

@FeignClient(value = "employee-company", url = "${url.company}")
public interface CompanyGTW {
	@GetMapping("/employee/v1/company/{id}")
	public @ResponseBody CompanyVO getCompanyFindById(@PathVariable("id") int id);
}