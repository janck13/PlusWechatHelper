package top.jinhaoplus.wechathelper.wechat.analyse.entity;

public class UserAnalyseDailyResult {

    // 数据的日期
    private String ref_date;

    // 用户的渠道,数值代表的含义如下:
    // 0代表其他合计
    // 1代表公众号搜索
    // 17代表名片分享
    // 30代表扫描二维码
    // 43代表图文页右上角菜单
    // 51代表支付后关注(在支付完成页)
    // 57代表图文页内公众号名称
    // 75代表公众号文章广告
    // 78代表朋友圈广告
    private Integer user_source;

    // 新增的用户数量
    private Integer new_user;

    // 取消关注的用户数量,new_user减去cancel_user即为净增用户数量
    private Integer cancel_user;

    // 总用户量
    private Long cumulate_user;

    public String getRef_date() {
        return ref_date;
    }

    public void setRef_date(String ref_date) {
        this.ref_date = ref_date;
    }

    public Integer getUser_source() {
        return user_source;
    }

    public void setUser_source(Integer user_source) {
        this.user_source = user_source;
    }

    public Integer getNew_user() {
        return new_user;
    }

    public void setNew_user(Integer new_user) {
        this.new_user = new_user;
    }

    public Integer getCancel_user() {
        return cancel_user;
    }

    public void setCancel_user(Integer cancel_user) {
        this.cancel_user = cancel_user;
    }

    public Long getCumulate_user() {
        return cumulate_user;
    }

    public void setCumulate_user(Long cumulate_user) {
        this.cumulate_user = cumulate_user;
    }
}
