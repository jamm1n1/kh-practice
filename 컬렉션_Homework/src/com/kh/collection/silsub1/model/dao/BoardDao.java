package com.kh.collection.silsub1.model.dao;

import java.util.ArrayList;


import com.kh.collection.silsub1.model.vo.Board;

public class BoardDao {

	ArrayList<Board> list = new ArrayList<>();
	
	public BoardDao() {}

public int getLastBoardNo() {
	Board b = list.get(list.size()-1);
	
	return b.getBoardNo();
	
}
public void writeBoard(Board board) {
	list.add(board);
}
public ArrayList<Board> displayAllList (){
	
	 ArrayList<Board> b = ( ArrayList<Board>)list.clone(); //��?�� �̺κ��� �������� �𸣰ٴ�

	return b;
}
public Board displayBoard(int no) {
	
	return list.get(no);
	
	
}
//������� �����ҷ� 
public void upReadCount(int no) {
	
}
public void modifyTitle(int no , String title) {
	
}
public void modifyContend(int no , String title) {
	
}
public void deleteBoard(int no) {
	
}
public ArrayList<Board> searchBoard(String title){
	
}
public void saveListFile() {
	
}
}