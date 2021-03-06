package top.jinhaoplus.wechathelper.wechat.message.entity.template;

public class IndustrySetRequest {
    private String industry_id1;
    private String industry_id2;

    public String getIndustry_id1() {
        return industry_id1;
    }

    public void setIndustry_id1(String industry_id1) {
        this.industry_id1 = industry_id1;
    }

    public String getIndustry_id2() {
        return industry_id2;
    }

    public void setIndustry_id2(String industry_id2) {
        this.industry_id2 = industry_id2;
    }

    public IndustrySetRequest(String industry_id1, String industry_id2) {
        this.industry_id1 = industry_id1;
        this.industry_id2 = industry_id2;
    }

    public enum Industry {
        IT科技_互联网电子商务("1"),
        IT科技_IT软件与服务("2"),
        IT科技_IT硬件与设备("3"),
        IT科技_电子技术("4"),
        IT科技_通信与运营商("5"),
        IT科技_网络游戏("6"),
        金融业_银行("7"),
        金融业_基金理财信托("8"),
        金融业_保险("9"),
        餐饮_餐饮("10"),
        酒店旅游_酒店("11"),
        酒店旅游_旅游("12"),
        运输与仓储_快递("13"),
        运输与仓储_物流("14"),
        运输与仓储_仓储("15"),
        教育_培训("16"),
        教育_院校("17"),
        政府与公共事业_学术科研("18"),
        政府与公共事业_交警("19"),
        政府与公共事业_博物馆("20"),
        政府与公共事业_公共事业非盈利机构("21"),
        医药护理_医药医疗("22"),
        医药护理_护理美容("23"),
        医药护理_保健与卫生("24"),
        交通工具_汽车相关("25"),
        交通工具_摩托车相关("26"),
        交通工具_火车相关("27"),
        交通工具_飞机相关("28"),
        房地产_建筑("29"),
        房地产_物业("30"),
        消费品_消费品("31"),
        商业服务_法律("32"),
        商业服务_会展("33"),
        商业服务_中介服务("34"),
        商业服务_认证("35"),
        商业服务_审计("36"),
        文体娱乐_传媒("37"),
        文体娱乐_体育("38"),
        文体娱乐_娱乐休闲("39"),
        印刷_印刷("40"),
        其它_其它("41");

        String industryCode;

        Industry(String industryCode) {
            this.industryCode = industryCode;
        }

        public String getIndustryCode() {
            return industryCode;
        }
    }
}
