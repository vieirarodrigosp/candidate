package br.com.vieirarodrigo.candidate.business.service;

import org.springframework.stereotype.Service;

import br.com.vieirarodrigo.candidate.gateway.UserGTW;
import br.com.vieirarodrigo.candidate.repository.vo.UserVO;

@Service
public class UserBS implements UserGTW {
	private final UserGTW userGTW;
	public UserBS(UserGTW userGTW) { this.userGTW = userGTW; }
	@Override
	public UserVO getUserFindById(int userId) {
		return this.userGTW.getUserFindById(userId);
	}
}