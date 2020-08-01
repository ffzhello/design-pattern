package com.ffzhello.designpattern.builder;

import lombok.Data;
import org.apache.logging.log4j.util.Strings;

/**
 * @author ffzhello
 */
@Data
public class ObjBuilder {
    private String name;
    private Integer age;
    private Integer sex;
    // ......此处省略n个字段
    /**
     * 电话区号
     **/
    private Integer host;

    /**
     * 电话号码
     **/
    private String phoneNumber;


    /*
     * 痛点一：如果类的参数非常多，而且存在可选项参数
     *        会导致类中出现大量构造方法用于设置可选项参数
     */

    //  => 解决办法：通过set方法设置可选项参数

    /*
     * 痛点二：虽然set方法解决了可选项参数的设置问题，但可选项参数赋值分散在各个字段的set方法中
     *        缺乏统一的参数校验
     *        比如，区号和电话号码是两个可选项参数，但是如果设置了电话号码phoneNumber，区号host就必须设置
     *        而phoneNumber和host是在两个set方法中设置的，无法统一校验
     */

    // => 解决办法：通过建造者模式构建实例
    /**
     * 静态内部类用于构造外部类对象
     **/
    private static class Builder {
        private String name;
        private Integer age;
        private Integer sex;
        private Integer host;
        private String phoneNumber;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder sex(Integer sex) {
            this.sex = sex;
            return this;
        }

        public Builder host(Integer host) {
            this.host = host;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        // ......此处省略n个字段的赋值

        /**
         * 精彩的部分在这里
         * 构建最终的对象，同时统一校验参数
         **/
        public ObjBuilder build() {
            // 参数校验
            if (Strings.isNotBlank(phoneNumber) && host == null) {
                throw new IllegalArgumentException("参数错误. 电话区号错误.");
            }

            ObjBuilder objBuilder = new ObjBuilder();
            objBuilder.setName(name);
            objBuilder.setAge(age);
            objBuilder.setSex(sex);
            objBuilder.setHost(host);
            objBuilder.setPhoneNumber(phoneNumber);
            return objBuilder;
        }
    }
}