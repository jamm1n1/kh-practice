package com.uni.chap01_poiy.part02_electronic.controller;

import com.uni.chap01_poiy.part02_electronic.model.vo.Desktop;
import com.uni.chap01_poiy.part02_electronic.model.vo.Notebook;
import com.uni.chap01_poiy.part02_electronic.model.vo.Tablet;

public class ElectronicContoller {

	private Desktop desk;
	private Notebook note;
	private Tablet tab;
	
	public void insert(Desktop d) {
		
		desk = d;
	}
	
	
	public void insert(Notebook n) {
		
		note = n;
	}

	public void insert(Tablet t) {
		
		tab = t;
		
	}


	public Desktop selectDesktop() {
		
		return desk;
	}


	public Notebook selectNotebook() {
		// TODO Auto-generated method stub
		return note;
	}


	public Tablet selectTablet() {
		// TODO Auto-generated method stub
		return tab;
	}

	

}
