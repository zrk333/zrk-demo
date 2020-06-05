package com.zrk.zrkdemo.service.impl;


import com.zrk.zrkdemo.dao.UserInfoDao;
import com.zrk.zrkdemo.model.UserDTO;
import com.zrk.zrkdemo.model.web.ResultStatus;
import com.zrk.zrkdemo.request.UserRequest;
import com.zrk.zrkdemo.service.UserService;
import com.zrk.zrkdemo.service.converter.UserConverter;
import com.zrk.zrkdemo.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2020/3/16
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserInfoDao userInfoDao;

    @Resource
    private UserConverter userConverter;

    @Override
    public ResultStatus getUserInfo(Long userId) {
        UserRequest userRequest = new UserRequest();
        userRequest.setUserId(userId);
        UserDTO userDTO = userConverter.converterDOToDTO(userInfoDao.getUserInfo(userRequest));
        UserVo userVo = new UserVo();
        userVo.setUserId(userDTO.getUserId());
        userVo.setUserName(userDTO.getUserName());
        ResultStatus resultStatus = new ResultStatus();
        resultStatus.setData(userVo);
        return resultStatus;
    }
}
