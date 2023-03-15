package cn.itedus.lottery.api.domain.receive.service.engine.impl;

import cn.itedus.lottery.api.domain.receive.model.BehaviorMatter;
import cn.itedus.lottery.api.domain.receive.model.MessageTextEntity;
import cn.itedus.lottery.api.domain.receive.service.engine.EngineBase;
import cn.itedus.lottery.api.domain.receive.service.logic.LogicFilter;
import cn.itedus.lottery.api.infrastructure.utils.XmlUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @description: 消息处理
 * @author: 小傅哥，微信：fustack
 * @date: 2021/12/18
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Service("msgEngineHandle")
public class MsgEngineHandle extends EngineBase {

    @Value("${wx.config.originalid:gh_b09504456ecb}")
    private String originalId;

    @Override
    public String process(BehaviorMatter request) throws Exception {
        LogicFilter router = super.router(request);
        if (null == router) {
            return null;
        }
        String resultStr = router.filter(request);
        if (StringUtils.isBlank(resultStr)) {
            return "";
        }

        //反馈信息[文本]
        MessageTextEntity res = new MessageTextEntity();
        res.setToUserName(request.getOpenId());
        res.setFromUserName(originalId);
        res.setCreateTime(String.valueOf(System.currentTimeMillis() / 1000L));
        res.setMsgType("text");
        res.setContent(resultStr);
        return XmlUtil.beanToXml(res);
    }

}
