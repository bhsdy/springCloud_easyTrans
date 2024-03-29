package com.cn.account.service;

import com.cn.common.entity.WalletPayVO.WalletPayRequestVO;
import com.cn.common.entity.WalletPayVO.WalletPayResponseVO;
import com.yiqiniu.easytrans.protocol.tcc.TccMethod;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class WalletPayTccService implements TccMethod<WalletPayRequestVO, WalletPayResponseVO>{

	public static final String METHOD_NAME="pay";
	
	@Resource
	private WalletService wlletService;

	@Override
	public WalletPayResponseVO doTry(WalletPayRequestVO param) {
		return wlletService.doTryPay(param);
	}

	@Override
	public void doConfirm(WalletPayRequestVO param) {
		wlletService.doConfirmPay(param);
	}


	@Override
	public void doCancel(WalletPayRequestVO param) {
		wlletService.doCancelPay(param);
	}
	

	@Override
	public int getIdempotentType() {
		return IDENPOTENT_TYPE_FRAMEWORK;
	}
}
