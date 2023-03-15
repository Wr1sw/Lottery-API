package cn.itedus.lottery.api.domain.lucky.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: 小傅哥，微信：fustack
 * @date: 2021/12/25
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class Prize {

    private List<Strategy> fonts = new ArrayList<>();
    private String background;

    public Prize(Strategy fonts, String background) {
        this.fonts.add(fonts);
        this.background = background;
    }

    public Prize(List<Strategy> fonts, String background) {
        this.fonts = fonts;
        this.background = background;
    }

    public List<Strategy> getFonts() {
        return fonts;
    }

    public void setFonts(List<Strategy> fonts) {
        this.fonts = fonts;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }
}
