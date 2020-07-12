package com.ffzhello.designpattern.observer;

import lombok.Data;

/**
 * @author ffzhello
 * @since 2020/7/12
 **/
public class ObservableImpl implements Observable {
    public void statusChanged() {
        // 状态变更通知
        noticeAll();
    }
}
