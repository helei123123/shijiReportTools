package com.shiji.serviceImpl;

import com.shiji.mapper.outlet.OutOutletsMapper;
import com.shiji.service.OutOutletsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：jaylen
 * @date ：Created in 2019/8/23 15:41
 * @description：Outlet
 * @modified By：
 * @version: v1.0$
 */
@Service
public class OutOutletsServiceImpl implements OutOutletsServices {
	@Autowired
	private OutOutletsMapper outOutletsMapper;
	@Override
	public String findByOutletId(String outletCode) {
		return outOutletsMapper.findByOutletId(outletCode);
	}
}
