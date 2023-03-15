package cn.itedus.lottery.api.domain.receive.service;

import cn.itedus.lottery.api.application.IWxReceiveService;
import cn.itedus.lottery.api.domain.receive.model.BehaviorMatter;
import cn.itedus.lottery.api.domain.receive.service.engine.Engine;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 处理接收信息
 * @author: 小傅哥，微信：fustack
 * @date: 2021/12/18
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Service
public class WxReceiveServiceImpl implements IWxReceiveService {

    @Resource(name = "msgEngineHandle")
    private Engine msgEngineHandle;

    @Override
    public String doReceive(BehaviorMatter behaviorMatter) throws Exception {
        return msgEngineHandle.process(behaviorMatter);
    }

}
