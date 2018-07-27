package com.ifox.hgx.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * @Description: ${Description}
 * @Author hanguixian
 * @Date Created in 17:34 2018/7/3
 */
@Validated
@ConfigurationProperties(prefix = "person")
@Component
public class Person {
    private String lastName;
    private Integer gae;
    private Boolean boss;
    private Date birth;
    private Map<String, Object> maps;
    private String[] lists;
    private Dog dog;

    // JSR303数据校验
    //@Email
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGae() {
        return gae;
    }

    public void setGae(Integer gae) {
        this.gae = gae;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public String[] getLists() {
        return lists;
    }

    public void setLists(String[] lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", gae=" + gae +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + Arrays.toString(lists) +
                ", dog=" + dog +
                '}';
    }
}
