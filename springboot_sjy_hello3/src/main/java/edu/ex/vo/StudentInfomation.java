package edu.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentInfomation {
	private String name;
	private String id;
	private String pw;
	private String email;
	private int age;
	
	

}
