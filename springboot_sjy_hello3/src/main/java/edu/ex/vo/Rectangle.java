package edu.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle {
	private double width;
	private double height;
		
	public double getArea() {
		return width*height;
	}	
}
