package com.dao.factory;

import com.common.base.BaseFactory;
import com.dao.UserEntityMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/10/11 0011.
 */
@Component
public class DaoFactory extends BaseFactory {

    @Resource
    private UserEntityMapper _userEntityMapper;
    public static UserEntityMapper userEntityMapper;

    @Override
    @PostConstruct
    public void init() {
        super.init();
    }
}
