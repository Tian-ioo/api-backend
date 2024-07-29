package com.tian.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tian.project.common.ErrorCode;
import com.tian.project.exception.BusinessException;
import com.tian.project.mapper.PostMapper;
import com.tian.project.model.enums.PostGenderEnum;
import com.tian.project.model.enums.PostReviewStatusEnum;
import com.tian.project.service.PostService;
import com.tian.tianapicommon.model.entity.Post;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author tianli
 * @description 针对表【interfaceInfo(帖子)】的数据库操作Service实现
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

    @Override
    public void validPost(Post interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Integer age = interfaceInfo.getAge();
        Integer gender = interfaceInfo.getGender();
        String content = interfaceInfo.getContent();
        String job = interfaceInfo.getJob();
        String place = interfaceInfo.getPlace();
        String education = interfaceInfo.getEducation();
        String loveExp = interfaceInfo.getLoveExp();
        Integer reviewStatus = interfaceInfo.getReviewStatus();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(content, job, place, education, loveExp) || ObjectUtils.anyNull(age, gender)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(content) && content.length() > 8192) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "内容过长");
        }
        if (reviewStatus != null && !PostReviewStatusEnum.getValues().contains(reviewStatus)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        if (age != null && (age < 18 || age > 100)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "年龄不符合要求");
        }
        if (gender != null && !PostGenderEnum.getValues().contains(gender)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "性别不符合要求");
        }
    }
}




