package com.deepexi.product.domain.eo;


import java.util.Date;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Collection;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
* @desc appbricks_user
* @author admin
*/
//@ApiModel(description = "appbricks_user")
public class AppbricksUser{

// @ApiModelProperty(value = "id")
    @TableId
    @TableField(value = "`id`")
    private String id;
// @ApiModelProperty(value = "username")
    @TableField(value = "`username`")
    private String username;
// @ApiModelProperty(value = "usernumber")
    @TableField(value = "`usernumber`")
    private String usernumber;
// @ApiModelProperty(value = "password")
    @TableField(value = "`password`")
    private String password;
// @ApiModelProperty(value = "token")
    @TableField(value = "`token`")
    private String token;
// @ApiModelProperty(value = "fullname")
    @TableField(value = "`fullname`")
    private String fullname;
// @ApiModelProperty(value = "fullname_en")
    @TableField(value = "`fullname_en`")
    private String fullnameEn;
// @ApiModelProperty(value = "email")
    @TableField(value = "`email`")
    private String email;
// @ApiModelProperty(value = "gender")
    @TableField(value = "`gender`")
    private String gender;
// @ApiModelProperty(value = "tel")
    @TableField(value = "`tel`")
    private String tel;
// @ApiModelProperty(value = "update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`update_time`")
    private Date updateTime;
// @ApiModelProperty(value = "update_person")
    @TableField(value = "`update_person`")
    private String updatePerson;
// @ApiModelProperty(value = "create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`create_time`")
    private Date createTime;
// @ApiModelProperty(value = "create_person")
    @TableField(value = "`create_person`")
    private String createPerson;
// @ApiModelProperty(value = "guid")
    @TableField(value = "`guid`")
    private String guid;
// @ApiModelProperty(value = "current_project_no")
    @TableField(value = "`current_project_no`")
    private String currentProjectNo;
// @ApiModelProperty(value = "project_no")
    @TableField(value = "`project_no`")
    private String projectNo;
// @ApiModelProperty(value = "status")
    @TableField(value = "`status`")
    private String status;
// @ApiModelProperty(value = "type")
    @TableField(value = "`type`")
    private String type;
// @ApiModelProperty(value = "avatar")
    @TableField(value = "`avatar`")
    private String avatar;

    public void setId(String id){
    this.id = id;
    }

    public String getId(){
    return this.id;
    }

    public void setUsername(String username){
    this.username = username;
    }

    public String getUsername(){
    return this.username;
    }

    public void setUsernumber(String usernumber){
    this.usernumber = usernumber;
    }

    public String getUsernumber(){
    return this.usernumber;
    }

    public void setPassword(String password){
    this.password = password;
    }

    public String getPassword(){
    return this.password;
    }

    public void setToken(String token){
    this.token = token;
    }

    public String getToken(){
    return this.token;
    }

    public void setFullname(String fullname){
    this.fullname = fullname;
    }

    public String getFullname(){
    return this.fullname;
    }

    public void setFullnameEn(String fullnameEn){
    this.fullnameEn = fullnameEn;
    }

    public String getFullnameEn(){
    return this.fullnameEn;
    }

    public void setEmail(String email){
    this.email = email;
    }

    public String getEmail(){
    return this.email;
    }

    public void setGender(String gender){
    this.gender = gender;
    }

    public String getGender(){
    return this.gender;
    }

    public void setTel(String tel){
    this.tel = tel;
    }

    public String getTel(){
    return this.tel;
    }

    public void setUpdateTime(Date updateTime){
    this.updateTime = updateTime;
    }

    public Date getUpdateTime(){
    return this.updateTime;
    }

    public void setUpdatePerson(String updatePerson){
    this.updatePerson = updatePerson;
    }

    public String getUpdatePerson(){
    return this.updatePerson;
    }

    public void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    public Date getCreateTime(){
    return this.createTime;
    }

    public void setCreatePerson(String createPerson){
    this.createPerson = createPerson;
    }

    public String getCreatePerson(){
    return this.createPerson;
    }

    public void setGuid(String guid){
    this.guid = guid;
    }

    public String getGuid(){
    return this.guid;
    }

    public void setCurrentProjectNo(String currentProjectNo){
    this.currentProjectNo = currentProjectNo;
    }

    public String getCurrentProjectNo(){
    return this.currentProjectNo;
    }

    public void setProjectNo(String projectNo){
    this.projectNo = projectNo;
    }

    public String getProjectNo(){
    return this.projectNo;
    }

    public void setStatus(String status){
    this.status = status;
    }

    public String getStatus(){
    return this.status;
    }

    public void setType(String type){
    this.type = type;
    }

    public String getType(){
    return this.type;
    }

    public void setAvatar(String avatar){
    this.avatar = avatar;
    }

    public String getAvatar(){
    return this.avatar;
    }


}

