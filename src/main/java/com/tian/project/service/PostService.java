package com.tian.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.tian.tianapicommon.model.entity.Post;

/**
 * @author tianli
 * @description 针对表【interfaceInfo(帖子)】的数据库操作Service
 */
public interface PostService extends IService<Post> {

    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add 是否为创建校验
     */
    void validPost(Post interfaceInfo, boolean add);
}
