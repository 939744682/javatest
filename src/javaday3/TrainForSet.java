package javaday3;

import java.util.HashSet;
import java.util.Set;

//import java .util .HashSet;
//import java.util.Iterator;
//import java .util .Set;
public class TrainForSet {
	//list������ģ� set�������
	//�̳к���������ԻḲ�Ǹ��������
	//���������֮�����Բ����ǣ�ֻ�з�������
	//����  Ŀ����Ϊ�˷�ֹ  �ǽ�����Ⱥ
	//����   ��ʽ��<����>  û�����������ǣ���������Ĭ�Ϸ��õĶ���Object����
	//Object����java��һ����������̵����ԡ�     Object��������ĸ���
	//������Set����  ��Set�����е�����Ԫ�ص����ֽ��д�ӡ
	//����ֵΪ��ֵ
   public static void main(String[] args) {
	Set<sheep> sheepList =new HashSet<sheep>();
	 sheepList.add(new sheep ("ϲ����"));
     sheepList.add(new sheep ("������"));
     sheepList.add(new sheep ("������"));
     sheepList.add(new sheep ("������"));
     sheepList.add(new sheep ("������"));
     sheepList.add(new sheep ("������"));
     sheepList .remove(4);
     sheepList .remove(5);
     sheepList .remove(6);


     for(Object i : sheepList ){
        	 System.out.println(((sheep)i).name);
     }
//     sheepset.add(new Wolf("��̫��"));
//    for(Object s : sheepset){
//    	System.out.println(((dongwu)s).name );
 //   }
//	void printForName(Set<sheep > sheepset){
//		//������  ÿ�ּ��϶��Դ�������
//		Iterator<sheep> itr =sheepset . iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
//	}
   }}
//}
