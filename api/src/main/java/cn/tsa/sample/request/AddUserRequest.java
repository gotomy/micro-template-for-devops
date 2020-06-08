package cn.tsa.sample.request;

import lombok.Data;


@Data
public class AddUserRequest {

	private String userName;

	private String password;
}
