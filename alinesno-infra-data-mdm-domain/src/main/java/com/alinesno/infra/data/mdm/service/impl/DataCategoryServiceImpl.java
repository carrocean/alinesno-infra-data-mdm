package com.alinesno.infra.data.mdm.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.data.mdm.entity.DataCategoryEntity;
import com.alinesno.infra.data.mdm.mapper.DataCategoryMapper;
import com.alinesno.infra.data.mdm.service.IDataCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 数据分类ServiceImpl接口
 *
 * @version 1.0.0
 * @author luoxiaodong
 */

@Service
public class DataCategoryServiceImpl extends IBaseServiceImpl<DataCategoryEntity, DataCategoryMapper> implements IDataCategoryService {
    private static final Logger log = LoggerFactory.getLogger(DataCategoryServiceImpl.class);
}
