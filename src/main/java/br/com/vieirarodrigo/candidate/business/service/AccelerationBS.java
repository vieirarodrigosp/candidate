package br.com.vieirarodrigo.candidate.business.service;

import org.springframework.stereotype.Service;

import br.com.vieirarodrigo.candidate.gateway.AccelerationGTW;
import br.com.vieirarodrigo.candidate.repository.vo.AccelerationVO;

@Service
public class AccelerationBS implements AccelerationGTW {
	private final AccelerationGTW accelerationGTW;
	public AccelerationBS(AccelerationGTW accelerationGTW) {
		this.accelerationGTW = accelerationGTW;
	}
	@Override
	public AccelerationVO getAccelerationFindById(int accelerationid) {
		return this.accelerationGTW.getAccelerationFindById(accelerationid);
	}
}