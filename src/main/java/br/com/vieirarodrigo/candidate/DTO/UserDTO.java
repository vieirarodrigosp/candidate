package br.com.vieirarodrigo.candidate.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserDTO {
	public int id;
	public String fullName;
	public String email;
	public String nickName;
	public String password;
	public Date created;
}