package com.jjp.admin.vo;

import com.jjp.admin.comm.vo.commonVo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserVo extends commonVo {
	private String userId;
    private String userPass;
    private String userRole;
    private String userNm;
    private String telNo;
    private String email;
}
