package cn.itedus.lottery.api.domain.receive.service.logic.impl;

import cn.itedus.lottery.api.domain.receive.model.BehaviorMatter;
import cn.itedus.lottery.api.domain.receive.service.logic.LogicFilter;
import org.springframework.stereotype.Service;

/**
 * @description: 关注微信公众号
 * @author: 小傅哥，微信：fustack
 * @date: 2021/12/18
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Service("subscribe")
public class SubscribeFilter implements LogicFilter {

    @Override
    public String filter(BehaviorMatter request) {
        return "感谢关注，快来回复抽奖，参与小傅哥的活动吧！";
    }

}
