package br.com.vieirarodrigo.candidate.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.vieirarodrigo.candidate.repository.vo.AccelerationVO;

@FeignClient(value = "employee-acceleration", url = "${url.acceleration}")
public interface AccelerationGTW {
	@GetMapping("/employee/v1/acceleration/{id}")
	public @ResponseBody AccelerationVO getAccelerationFindById(@PathVariable("id") int id);
}