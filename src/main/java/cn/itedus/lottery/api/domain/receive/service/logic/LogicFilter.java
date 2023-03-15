package cn.itedus.lottery.api.domain.receive.service.logic;

import cn.itedus.lottery.api.domain.receive.model.BehaviorMatter;

/**
 * @description: 逻辑接口
 * @author: 小傅哥，微信：fustack
 * @date: 2021/12/18
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface LogicFilter {

    String filter(BehaviorMatter request);

}
