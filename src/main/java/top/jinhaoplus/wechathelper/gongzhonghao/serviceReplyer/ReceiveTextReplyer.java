package top.jinhaoplus.wechathelper.gongzhonghao.serviceReplyer;

import top.jinhaoplus.wechathelper.wechat.message.entity.passive.receive.data.ReceiveTextMessage;
import top.jinhaoplus.wechathelper.wechat.message.entity.passive.send.SendMessage;
import top.jinhaoplus.wechathelper.wechat.message.entity.passive.send.data.text.SendTextMessage;
import top.jinhaoplus.wechathelper.wechat.message.replyers.impl.InternalReceiveTextReplyer;
import org.springframework.stereotype.Component;


@Component
public class ReceiveTextReplyer extends InternalReceiveTextReplyer {

    @Override
    public SendMessage doReply(ReceiveTextMessage receiveTextMessage, SendMessage defaultSendMessage) {
        try {
            SendTextMessage sendTextMessage = convertSendMessage(defaultSendMessage, SendTextMessage.class);
            sendTextMessage.setContent("HELLO");
            return sendTextMessage;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defaultSendMessage;
    }
}
