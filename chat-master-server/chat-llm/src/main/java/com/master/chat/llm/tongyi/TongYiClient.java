package com.master.chat.llm.tongyi;

import com.master.chat.client.enums.ChatModelEnum;
import com.master.chat.llm.base.key.updater.KeyUpdater;
import lombok.Data;

/**
 * 通义千问client
 * 文档地址：https://help.aliyun.com/zh/dashscope/developer-reference/model-square/?disableWebsiteRedirect=true
 *
 * @author: Yang
 * @date: 2023/12/4
 * https://www.panday94.xyz
 * Copyright Ⓒ 2023 曜栋网络科技工作室 Limited All rights reserved.
 */
@Data
public class TongYiClient implements KeyUpdater {

    private String appKey;

    public TongYiClient() {
    }

    public TongYiClient(String appKey) {
        this.appKey = appKey;
    }


    @Override
    public String supportModel() {
        return ChatModelEnum.TONGYI.getValue();
    }

    @Override
    public void updateKey(KeyModel keyModel) {
        this.setAppKey(keyModel.getAppKey());
    }
}
