package com;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * ��⣺action��������û�з���ֵ��û�е�ʱ��<action>�ڲ�������<result>,������������Ҳ���ᱨ������Ҫ�з���ֵ��ֵ������String����
 *  
 */
public class TestAction extends ActionSupport{

	Logger log = Logger.getLogger(this.getClass().getName());
	
	public String action_1() throws Exception {
		System.out.println("����1...");
		return SUCCESS;
	}
	
	public String action_2() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("����2...");
		return SUCCESS;
	}
	
	public String add(){
		System.out.println("add...");
		return NONE;
	} 
	public String update(){
		System.out.println("update...");
		return NONE;
	} 
	public String log(){
		log.info("hahah");
		return NONE;
	}
  
}
