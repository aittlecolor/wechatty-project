package space.chensheng.wechatty.mp.message.inbound.event;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import space.chensheng.wechatty.common.message.EventType;
import space.chensheng.wechatty.common.util.XmlUtil.XStreamCDATA;
import space.chensheng.wechatty.mp.message.inbound.EventInboundMessage;


public class ClickEventMessage extends EventInboundMessage {

	@XStreamAlias("EventKey")
	@XStreamCDATA
	private String eventKey;
	
	public ClickEventMessage() {
		super(EventType.CLICK);
	}

	public String getEventKey() {
		return eventKey;
	}
	
}
