package cn.itedus.lottery.api.application;

/**
 * @description: 验证
 * @author: 小傅哥，微信：fustack
 * @date: 2021/12/18
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface IWxValidateService {

    /**
     * 验签
     * @param signature 签名
     * @param timestamp 时间
     * @param nonce     当前
     * @return          结果
     */
    boolean checkSign(String signature, String timestamp, String nonce);

}
