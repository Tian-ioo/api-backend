package com.tian.project.model.dto.interfaceInfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 点赞 / 取消点赞请求
 *
 * @author tian
 */
@Data
public class PostDoThumbRequest implements Serializable {

    /**
     * 帖子 id
     */
    private long interfaceInfoId;

    private static final long serialVersionUID = 1L;
}