package com.uni.chap01_poiy.part02_electronic.controller;

import com.uni.chap01_poiy.part02_electronic.model.vo.Electronic;

public class ElectronicComtroller2 {

    private Electronic[] elec = new Electronic[3];
    private int count = 0;
    
    public void insert(Electronic any) {
    	
    	elec[count++] = any;
    }
    
    public Electronic select(int index) {
    	return elec[index];
    }
    
    public Electronic[] selectAll() {
    	return elec;
    }
    
}
