// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iuyiyuiyuiyui.web;

import iuyiyuiyuiyui.domain.MyClass;
import iuyiyuiyuiyui.web.ApplicationConversionServiceFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    public Converter<MyClass, String> ApplicationConversionServiceFactoryBean.getMyClassToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<iuyiyuiyuiyui.domain.MyClass, java.lang.String>() {
            public String convert(MyClass myClass) {
                return "(no displayable fields)";
            }
        };
    }
    
    public Converter<Long, MyClass> ApplicationConversionServiceFactoryBean.getIdToMyClassConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, iuyiyuiyuiyui.domain.MyClass>() {
            public iuyiyuiyuiyui.domain.MyClass convert(java.lang.Long id) {
                return MyClass.findMyClass(id);
            }
        };
    }
    
    public Converter<String, MyClass> ApplicationConversionServiceFactoryBean.getStringToMyClassConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, iuyiyuiyuiyui.domain.MyClass>() {
            public iuyiyuiyuiyui.domain.MyClass convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), MyClass.class);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getMyClassToStringConverter());
        registry.addConverter(getIdToMyClassConverter());
        registry.addConverter(getStringToMyClassConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}