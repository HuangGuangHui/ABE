package com.abe.service.hx;

/**
 * 发送消息 2016-11-22
 * <ul>
 * <li>发送文本/透传消息：直接编辑内容发送。</li>
 * <li>发送图片/语音/视频消息：需要先上传这三类文件，从接口返回值中获取到相应的参数，按照 API 要求编辑到消息体中然后的发送。</li>
 * </ul>
 * @author 张顺
 */
public interface iMessageService {

	
	/**发送文本消息:
	 * <p>给一个或者多个用户，或者一个或者多个群组发送消息，并且通过可选的 from 字段让接收方看到发送方是不同的人。同时，支持扩展字段，通过 ext 属性，APP 可以发送自己专属的消息结构。</p>
	 * 发送图片消息：
	 * <p>给一个或者多个用户，或者一个或者多个群组发送消息，并且通过可选的 from 字段让接收方看到发送方是不同的人。同时，支持扩展字段，通过 ext 属性，APP 可以发送自己专属的消息结构。</p>
	 * 发送语音消息:
	 * <p>发送语音文件，需要先上传语音文件，然后再发送此消息。（URL 中的 UUID 和 secret 可以从上传后的 response 获取）</p>
	 * 发送视频消息:
	 * <p>发送视频消息，需要先上传视频文件和视频缩略图文件，然后再发送此消息。（URL 中的 UUID 和 secret 可以从上传后的 response 获取）</p>
	 * 发送透传消息:
	 * <p>透传消息：不会在客户端提示（铃声、震动、通知栏等），也不会有 APNS 推送（苹果推送），但可以在客户端监听到，具体功能可以根据自身自定义。</p>
	 * 发送扩展消息:
	 * <p>扩展消息：若普通消息类型不满足用户消息需求，可以使用扩展消息。任何类型的消息都支持扩展，主要是通过message的ext字段实现。</p>
	 * @param json
	 * @param token
	 * @return
	 */
	public String messages(String json,String token);
	
	
	/**
	 * 给一个用户发消息
	 * @param tageusername
	 * @param ownusername
	 * @param msg
	 * @return
	 */
	public String sengMsgOne(String tageusername,String ownusername,String msg);
}
