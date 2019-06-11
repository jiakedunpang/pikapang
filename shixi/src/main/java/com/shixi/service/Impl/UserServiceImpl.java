package com.shixi.service.Impl;

import com.shixi.dao.UserDOMapper;
import com.shixi.dataobject.UserDO;
import com.shixi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @author: jiangyujian
 * @date :2019/6/6
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapper userDOMapper;
    @Override
    public void getUserById(Integer id) {
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
    }
}
