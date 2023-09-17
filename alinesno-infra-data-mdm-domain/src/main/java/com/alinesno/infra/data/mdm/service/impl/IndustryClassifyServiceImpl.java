package com.alinesno.infra.data.mdm.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.data.mdm.entity.IndustryClassifyEntity;
import com.alinesno.infra.data.mdm.mapper.IndustryClassifyMapper;
import com.alinesno.infra.data.mdm.service.IIndustryClassifyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 行业分类ServiceImpl接口
 *
 * @version 1.0.0
 * @author luoxiaodong
 */

@Service
public class IndustryClassifyServiceImpl extends IBaseServiceImpl<IndustryClassifyEntity, IndustryClassifyMapper> implements IIndustryClassifyService {
    private static final Logger log = LoggerFactory.getLogger(IndustryClassifyServiceImpl.class);
}
