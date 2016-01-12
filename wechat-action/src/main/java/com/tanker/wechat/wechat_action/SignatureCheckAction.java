package com.tanker.wechat.wechat_action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import com.opensymphony.xwork2.ActionSupport;
import com.tanker.wechat.wechat_util.SignUtil;
/**
 * 检验signature对请求进行校验
 * @author jiangnan
 * @date 2015.01.05
 *
 */
public class SignatureCheckAction extends ActionSupport{

	private static final long serialVersionUID = -7015669145847008124L;
	private String signature;
	private String timestamp;
	private String nonce;
	private String echostr;
	private InputStream inputStream;
	
	
	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getEchostr() {
		return echostr;
	}

	public void setEchostr(String echostr) {
		this.echostr = echostr;
	}
	
	public InputStream getResult(){
		return inputStream;
	}
	
	public String checkSignature() throws UnsupportedEncodingException{
		
		if(SignUtil.checkSignature(signature, timestamp, nonce)){
			inputStream = new  ByteArrayInputStream(echostr.getBytes("UTF-8"));
			return "CheckedSuccess";
		}
		return "CheckedFailure";		
	}
}
