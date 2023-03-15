package cn.itedus.lottery.api.domain.lucky.model;

/**
 * @description: 策略
 * @author: 小傅哥，微信：fustack
 * @date: 2021/12/25
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class Strategy {

    private String text;
    private String top;

    public Strategy(String text, String top) {
        this.text = text;
        this.top = top;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

}
