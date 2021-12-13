package practice2.run;


import practice2.model.vo.GalaxyNote9;
import practice2.model.vo.SmartPhone;
import practice2.model.vo.V40;

public class Run {

	public static void main(String[] args) {
		
    SmartPhone[] phone = new SmartPhone[2];
    
    phone[0] = new GalaxyNote9();
    phone[1] =	new V40();	
   
    for(SmartPhone ph :  phone) {
    	if(ph instanceof GalaxyNote9) {
    		System.out.println("������ ��Ʈ 9�� �Ｚ ���� ����� ����");
    		ph.printMaker();
    		ph.makeacall();
    		ph.takeaCall();
    		ph.touch();
    		ph.charge();
    		ph.picture();
    		System.out.println();
    	}else {
    		System.out.println("V40�� LG���� ���������.");
    		ph.printMaker();
    		ph.makeacall();
    		ph.takeaCall();
    		ph.touch();
    		ph.charge();
    		ph.picture();
    	}
    	
    	
    }
	}

}
