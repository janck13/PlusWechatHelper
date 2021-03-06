package top.jinhaoplus.wechathelper.wechat.message.response;

import top.jinhaoplus.wechathelper.wechat.api.response.APIResponse;

public class MassSendResponse extends APIResponse {

    /**
     * errorcode
     * 45065  相同 clientmsgid 已存在群发记录,返回数据中带有已存在的群发任务的 msgid
     * 45066  相同 clientmsgid 重试速度过快,请间隔1分钟重试
     * 45067  clientmsgid 长度超过限制
     */

    // 消息发送任务的ID
    private Long msg_id;

    // 消息的数据ID,该字段只有在群发图文消息时,才会出现
    // 可以用于在图文分析数据接口中,获取到对应的图文消息的数据
    private Long msg_data_id;

    public Long getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(Long msg_id) {
        this.msg_id = msg_id;
    }

    public Long getMsg_data_id() {
        return msg_data_id;
    }

    public void setMsg_data_id(Long msg_data_id) {
        this.msg_data_id = msg_data_id;
    }
}
