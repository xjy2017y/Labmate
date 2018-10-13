package com.common.base;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

/**
 * @Comment 对象工厂基类
 * @Author xjy
 * @Date 2018/2/9
 */
public class BaseFactory {

    private static final Logger logger = LoggerFactory.getLogger(BaseFactory.class) ;

    /**
     * 初始化,加载Factory
     *  将非static属性的值,赋值给static属性,属性用法定义如下:
     *      private static Dao dao ;
     *      @Resource
     *      private Dao _dao ;
     */
    public void init(){
        try {
            Field[] fields = this.getClass().getDeclaredFields() ;
            for(int i = 0 ; i < fields.length ; i ++){
                Field field = fields[i] ;
                String fieldName = field.getName() ;
                if(fieldName.startsWith("_")){
                    String staticFieldName = fieldName.substring(1) ;
                    Field staticField = this.getClass().getDeclaredField(staticFieldName) ;
                    field.setAccessible(true);
                    staticField.set(this , field.get(this)) ;
                    staticField.setAccessible(true) ;
                }
            }
        }catch (Exception e){
            logger.error("[项目启动 加载异常] {}" , e);
            e.printStackTrace() ;
        }
    }

}