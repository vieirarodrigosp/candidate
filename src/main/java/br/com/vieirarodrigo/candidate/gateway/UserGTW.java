package br.com.vieirarodrigo.candidate.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.vieirarodrigo.candidate.repository.vo.UserVO;

@FeignClient(value = "employee-user", url = "${url.user}")
public interface UserGTW {
	@GetMapping("/employee/v1/user/{id}")
	public @ResponseBody UserVO getUserFindById(@PathVariable("id") int id);
}