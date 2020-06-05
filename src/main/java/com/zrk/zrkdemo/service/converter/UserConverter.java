package com.zrk.zrkdemo.service.converter;


import com.zrk.zrkdemo.model.UserDO;
import com.zrk.zrkdemo.model.UserDTO;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2020/3/16
 */
public interface UserConverter {

    /**
     * DOToDTO
     * @param userInfo
     * @return
     */
    UserDTO converterDOToDTO(UserDO userInfo);
}
