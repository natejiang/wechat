package com.tanker.wechat.wechat_entity;
/**
 * 请求消息基类(普通用户 -> 公众账号)
 * @author jiangnan
 *@date 2016-01-03
 *
 */
public class BaseMessage {
	// 开发者微信号
	private String ToUserName;
	// 发送方账号(一个OpenID)
	private String FromUserName;
	//消息创建时间(整型)
	private long CreateTime;
	//消息类型(text/image/location/link/voice)
	private String MsgType;
	private long MsgId;
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public long getMsgId() {
		return MsgId;
	}
	public void setMsgId(long msgId) {
		MsgId = msgId;
	}
	
	
}
