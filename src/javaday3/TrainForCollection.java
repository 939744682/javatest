package javaday3;

import java.util.ArrayList;

public class TrainForCollection {
        public static void main(String[] args) {
			
		
//	int [] a = new int []{1,2,3,4,5};
//         sheep[] sheeps = new sheep[]{
//        	new sheep("ϲ����"),new sheep("������"),new sheep("������"),new sheep("������"),new sheep ("������") 
//        };
//add  ���   size ��ȡ��������  get(i)�õ���i������
		//System.out.println(sheeps[2].name );
	    ArrayList sheepList = new ArrayList();
	    //sheep s = new sheep("xiyangyang");
        sheepList.add(new sheep ("ϲ����"));
        sheepList.add(new sheep ("������"));
        sheepList.add(new sheep ("������"));
        sheepList.add(new sheep ("������"));
        sheepList.add(new sheep ("������"));
        sheepList.add(new sheep ("������"));



        for(int i = 3; i <=sheepList.size();i++ ){
           	  sheepList .remove(i);
        }
        for(int j = 0 ;j <3;j++){
        	System.out.println(((sheep)sheepList.get(j)).name);
        }
//        for(int i = 0 ; i < sheepList . size ();i++){
//        	System.out.println(((sheep)sheepList .get(i)).name);
//        }
//        for(Object s : sheepList){
//        	System.out.println(((sheep)s).name );
//        }
//        //linkedlist�Ա�ArrayList ��ѧ
//        
	}
    
        
}
