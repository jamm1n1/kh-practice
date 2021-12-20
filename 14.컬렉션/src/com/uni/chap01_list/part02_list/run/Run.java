package com.uni.chap01_list.part02_list.run;

import java.util.ArrayList;
import java.util.List;

import com.uni.chap01_list.part02_list.model.vo.Music;

public class Run {

	public static void main(String[] args) {
		//E -> Element : ���ҽ��� ��� ���(��ü)
           ArrayList<Music> list = new ArrayList<Music>();
           
           //1.add(E e) : ����Ʈ�� ���� �ν��Ͻ� �����͸� �߰��ϴ� �޼ҵ� (���������� ����� �˻����� ���밡���� �����̸� �߰��� �Ѿ�� �˾Ƽ� ����� �÷��ش��� �߰���.
           list.add(new Music("Good Bye","��ȿ��"));
           list.add(new Music("���� ��ħ" , "������"));
           list.add(new Music("�޸�" , "�����"));
           
           //list.add("��");
           
           System.out.println(list.toString());
           
           //2.add(int index, E e ) : �ε����� �����ؼ� �ش��ε����� �ν��Ͻ� �߰��ϴ� �޼ҵ� (���������� ������ �ִ°��� �ڷ� ����� �ش��ε����� ���߰� )
           list.add(1,new Music("����","��ȿ��") );
           System.out.println(list);
           
           //3 set(int index, E e ) : �ش��ϴ� �ε����� ���� E�� ����
           list.set(0, new Music("�������̺�","Ʈ���̽ù�"));
           System.out.println(list);
           
           //4 size() : ����Ʈ�ȿ� ��� �����Ͱ� �ִ��� ũ���ȯ
           System.out.println(list.size());
           
           //5. remove(int indext) : �ش��ϴ� �ε����� �ν��Ͻ��� ���� (�˾Ƽ� ������ �����ְ�, ũ���پ���)
           
          // list.remove(1);
           list.remove(new Music("����","��ȿ��"));
           System.out.println(list);
           System.out.println(list.size());
           
           //6. get(int index) : �ش��ϴ� �ε����� �ν��Ͻ� �������� 
           System.out.println(list.get(0));
           System.out.println(list.get(0).getTitle());
           
           //7. subList(int index, int index2) : index1���� index2 �ձ��� �����ؼ� ���ο� list �� ��ȯ
           List sub = list.subList(0, 2);
        		   System.out.println(sub);
           //8 addAll(Collection c ) : �÷����� ��ä�� �ڿ� �߰�
           list.addAll(sub);
           System.out.println(list);
           System.out.println(list.size());
           
           //9.isEmpt() : �÷����� ����ִ��� ���¸޼ҵ� 
           System.out.println(list.isEmpty());
           
           //10.clear() : ���� 
           //list.clear();
           System.out.println(list.isEmpty());
           
           
           for(int i = 0; i < list.size(); i++) {
        	   System.out.println(list.get(i));
           }
           for(Object m :list) {
        	   System.out.println(m);
           }
           
}

}
