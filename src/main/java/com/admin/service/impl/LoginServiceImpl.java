package com.admin.service.impl;

import com.admin.service.ILoginService;
import com.dao.UserEntityMapper;
import com.dao.factory.DaoFactory;
import com.entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/10/11 0011.
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Override
    public boolean login(String wechat) {
        UserEntity userEntity = new UserEntity();
        userEntity.setWechat(wechat);
        List<UserEntity> list = DaoFactory.userEntityMapper.selectSelective(userEntity);
        if (list.size() == 0 || list == null)
            return false;
        else
            return true;
    }
}
