package javaday3;

import java.util.HashSet;
import java.util.Set;

//import java .util .HashSet;
//import java.util.Iterator;
//import java .util .Set;
public class TrainForSet {
	//list是有序的， set是无序的
	//继承后，子类的属性会覆盖父类的属性
	//父类和子类之间属性不覆盖，只有方法覆盖
	//泛型  目的是为了防止  狼进入羊群
	//泛型   格式：<类型>  没有声明泛型是，集合里面默认放置的都是Object类型
	//Object对象java是一门面向对象编程的语言。     Object是所有类的父类
	//参数：Set集合  将Set集合中的所有元素的名字进行打印
	//返回值为空值
   public static void main(String[] args) {
	Set<sheep> sheepList =new HashSet<sheep>();
	 sheepList.add(new sheep ("喜羊羊"));
     sheepList.add(new sheep ("美羊羊"));
     sheepList.add(new sheep ("懒羊羊"));
     sheepList.add(new sheep ("慢羊羊"));
     sheepList.add(new sheep ("沸羊羊"));
     sheepList.add(new sheep ("美羊羊"));
     sheepList .remove(4);
     sheepList .remove(5);
     sheepList .remove(6);


     for(Object i : sheepList ){
        	 System.out.println(((sheep)i).name);
     }
//     sheepset.add(new Wolf("灰太狼"));
//    for(Object s : sheepset){
//    	System.out.println(((dongwu)s).name );
 //   }
//	void printForName(Set<sheep > sheepset){
//		//迭代器  每种集合都自带迭代器
//		Iterator<sheep> itr =sheepset . iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
//	}
   }}
//}
