package com.keith.modules.controller.withdraw;

import java.util.Arrays;
import java.util.Map;


import com.keith.modules.service.withdraw.UserAdminWithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 * 供应商提现记录表
 *
 * @author lijinxiang
 * @email @qq.com
 * @date 2020-06-18 11:21:07
 */
@RestController
@RequestMapping("withdraw/useradminwithdraw")
public class UserAdminWithdrawController {
    @Autowired
    private UserAdminWithdrawService userAdminWithdrawService;



}
