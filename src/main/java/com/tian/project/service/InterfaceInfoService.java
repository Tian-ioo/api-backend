package com.tian.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tian.tianapicommon.model.entity.InterfaceInfo;

/**
* @author 29960
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-07-19 20:01:44
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
