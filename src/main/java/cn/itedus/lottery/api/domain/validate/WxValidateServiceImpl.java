package cn.itedus.lottery.api.domain.validate;

import cn.itedus.lottery.api.application.IWxValidateService;
import cn.itedus.lottery.api.infrastructure.utils.sdk.SignatureUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @description: 消息验证
 * @author: 小傅哥，微信：fustack
 * @date: 2021/12/18
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Service
public class WxValidateServiceImpl implements IWxValidateService {

    @Value("${wx.config.token}")
    private String token;

    @Override
    public boolean checkSign(String signature, String timestamp, String nonce) {
        return SignatureUtil.check(token, signature, timestamp, nonce);
    }

}
