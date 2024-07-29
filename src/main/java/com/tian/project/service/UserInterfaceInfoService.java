package com.tian.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tian.tianapicommon.model.entity.UserInterfaceInfo;

/**
* @author 29960
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-07-23 15:34:19
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validInterfaceInfo(UserInterfaceInfo userinterfaceInfo, boolean add);

    /**
     * 调用接口统计
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
