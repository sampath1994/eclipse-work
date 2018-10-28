package com.sam.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
          System.out.println("Wolds best CPU!");
	}

}
