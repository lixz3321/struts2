package com;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * 详解：action方法可以没有返回值，没有的时候<action>内不用配置<result>,不过配置上了也不会报错，但需要有返回值该值必须是String类型
 *  
 */
public class TestAction extends ActionSupport{

	Logger log = Logger.getLogger(this.getClass().getName());
	
	public String action_1() throws Exception {
		System.out.println("访问1...");
		return SUCCESS;
	}
	
	public String action_2() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("访问2...");
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
