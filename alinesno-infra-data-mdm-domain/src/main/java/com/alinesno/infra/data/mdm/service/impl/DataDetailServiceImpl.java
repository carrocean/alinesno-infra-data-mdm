package com.alinesno.infra.data.mdm.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.data.mdm.entity.DataDetailEntity;
import com.alinesno.infra.data.mdm.mapper.DataDetailMapper;
import com.alinesno.infra.data.mdm.service.IDataDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 数据明细ServiceImpl接口
 *
 * @version 1.0.0
 * @author luoxiaodong
 */

@Service
public class DataDetailServiceImpl extends IBaseServiceImpl<DataDetailEntity, DataDetailMapper> implements IDataDetailService {
    private static final Logger log = LoggerFactory.getLogger(DataDetailServiceImpl.class);
}
