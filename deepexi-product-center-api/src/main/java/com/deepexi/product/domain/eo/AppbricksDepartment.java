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
* @desc appbricks_department
* @author admin
*/
//@ApiModel(description = "appbricks_department")
public class AppbricksDepartment{

// @ApiModelProperty(value = "id")
    @TableId
    @TableField(value = "`id`")
    private String id;
// @ApiModelProperty(value = "name")
    @TableField(value = "`name`")
    private String name;
// @ApiModelProperty(value = "name_en")
    @TableField(value = "`name_en`")
    private String nameEn;
// @ApiModelProperty(value = "code")
    @TableField(value = "`code`")
    private String code;
// @ApiModelProperty(value = "parent_id")
    @TableField(value = "`parent_id`")
    private String parentId;
// @ApiModelProperty(value = "update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`update_time`")
    private Date updateTime;
// @ApiModelProperty(value = "create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`create_time`")
    private Date createTime;
// @ApiModelProperty(value = "project_no")
    @TableField(value = "`project_no`")
    private String projectNo;

    public void setId(String id){
    this.id = id;
    }

    public String getId(){
    return this.id;
    }

    public void setName(String name){
    this.name = name;
    }

    public String getName(){
    return this.name;
    }

    public void setNameEn(String nameEn){
    this.nameEn = nameEn;
    }

    public String getNameEn(){
    return this.nameEn;
    }

    public void setCode(String code){
    this.code = code;
    }

    public String getCode(){
    return this.code;
    }

    public void setParentId(String parentId){
    this.parentId = parentId;
    }

    public String getParentId(){
    return this.parentId;
    }

    public void setUpdateTime(Date updateTime){
    this.updateTime = updateTime;
    }

    public Date getUpdateTime(){
    return this.updateTime;
    }

    public void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    public Date getCreateTime(){
    return this.createTime;
    }

    public void setProjectNo(String projectNo){
    this.projectNo = projectNo;
    }

    public String getProjectNo(){
    return this.projectNo;
    }


}

