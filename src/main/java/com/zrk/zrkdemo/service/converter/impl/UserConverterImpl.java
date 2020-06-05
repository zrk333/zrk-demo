package com.zrk.zrkdemo.service.converter.impl;


import com.zrk.zrkdemo.model.UserDO;
import com.zrk.zrkdemo.model.UserDTO;
import com.zrk.zrkdemo.service.converter.UserConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2020/3/16
 */
@Slf4j
@Component
public class UserConverterImpl implements UserConverter {
    @Override
    public UserDTO converterDOToDTO(UserDO userDO) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userDO,userDTO);
        return userDTO;
    }
}
