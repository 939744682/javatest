package javaday3;

import java.util.ArrayList;

public class TrainForCollection {
        public static void main(String[] args) {
			
		
//	int [] a = new int []{1,2,3,4,5};
//         sheep[] sheeps = new sheep[]{
//        	new sheep("喜羊羊"),new sheep("美羊羊"),new sheep("懒羊羊"),new sheep("慢羊羊"),new sheep ("沸羊羊") 
//        };
//add  添加   size 获取对象数量  get(i)得到第i个对象
		//System.out.println(sheeps[2].name );
	    ArrayList sheepList = new ArrayList();
	    //sheep s = new sheep("xiyangyang");
        sheepList.add(new sheep ("喜羊羊"));
        sheepList.add(new sheep ("美羊羊"));
        sheepList.add(new sheep ("懒羊羊"));
        sheepList.add(new sheep ("慢羊羊"));
        sheepList.add(new sheep ("沸羊羊"));
        sheepList.add(new sheep ("美羊羊"));



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
//        //linkedlist对比ArrayList 自学
//        
	}
    
        
}
