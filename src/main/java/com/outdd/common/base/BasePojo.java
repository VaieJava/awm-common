package com.outdd.common.base;

import com.outdd.common.constants.EntityConstants;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/*
 * 实体类 - 基类
 * @author VAIE
 * @date: 2019/6/10-10:21
 * @version v1.0
 */
@Data
public class BasePojo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;
    /**
     * 版本
     */
    private Long version;
    /**
     * 租户id
     */
    private Integer tenantId;
    /**
     * 删除标记
     */
    private Integer deleted = EntityConstants.IS_DEL_NO;
    /**
     * 创建者
     */
    private Long createBy;
    /**
     * 更新者
     */
    private Long updateBy;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新时间
     */
    private Date updateDate;
}
