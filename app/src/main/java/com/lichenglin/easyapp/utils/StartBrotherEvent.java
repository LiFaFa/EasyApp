package com.lichenglin.easyapp.utils;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * created by LiChengalin at 2017/4/5/0005
 */
public class StartBrotherEvent {
    public SupportFragment targetFragment;

    public StartBrotherEvent(SupportFragment targetFragment) {
        this.targetFragment = targetFragment;
    }
}
