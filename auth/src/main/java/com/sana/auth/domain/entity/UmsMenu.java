package com.sana.auth.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("ums_menu")
public class UmsMenu implements Serializable {
    @TableId
    private Long id;

    private Long parentId;
    private String menuName;
    private Integer menuType;
    private Integer sort;
    private Integer status;
    private String path;
    private String componentPath;
    private String perms;
    private String icon;

    private String creator;
    private String updater;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String remark;
    @TableLogic
    private String deleted;
}
