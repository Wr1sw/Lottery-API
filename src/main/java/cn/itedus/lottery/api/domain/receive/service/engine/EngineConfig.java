package cn.itedus.lottery.api.domain.receive.service.engine;

import cn.itedus.lottery.api.domain.receive.service.logic.LogicFilter;
import cn.itedus.lottery.api.domain.receive.service.logic.impl.SubscribeFilter;
import cn.itedus.lottery.api.domain.receive.service.logic.impl.UnsubscribeFilter;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 消息配置
 * @author: 小傅哥，微信：fustack
 * @date: 2021/12/18
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class EngineConfig {

    @Resource
    private LogicFilter lotteryLogicFilter;

    @Resource
    private SubscribeFilter subscribeFilter;

    @Resource
    private UnsubscribeFilter unsubscribeFilter;

    protected static Map<String, Map<String, LogicFilter>> logicFilterMap = new HashMap<>();

    @PostConstruct
    public void init() {

        logicFilterMap.put("text", new HashMap<String, LogicFilter>() {{
            put("lottery", lotteryLogicFilter);
        }});

        logicFilterMap.put("event", new HashMap<String, LogicFilter>() {
            {
                put("subscribe", subscribeFilter);
                put("unsubscribe", unsubscribeFilter);
            }
        });
    }

}
