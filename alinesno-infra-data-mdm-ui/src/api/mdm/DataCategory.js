import request from '@/utils/request'

/**
 * 【请填写功能名称】 接口文件
 *
 * @author luoxiaodong
 * @since 1.0.0
 */

// 接口配置项
var prefix = '/api/mdm/dataCategory/' ;
var managerUrl = {
    datatables : prefix +"datatables" ,
    createUrl: prefix + 'add' ,
    saveUrl: prefix + 'save' ,
    updateUrl: prefix +"modify" ,
    statusUrl: prefix +"changeStatus" ,
    cleanUrl: prefix + "clean",
    detailUrl: prefix +"detail",
    removeUrl: prefix + "delete" ,
    exportUrl: prefix + "exportExcel",
    changeField: prefix + "changeField",
    statistics: prefix + "statistics",
    treeNavInfo: prefix + "listTreeNavInfo",
    checkIfExist: prefix + "checkDataCategoryIfExist",
    checkIfUsed: prefix + "checkCategoryIfUsed"
}

// 查询【请填写功能名称】列表
export function listDataCategory(query , data) {
  return request({
    url: managerUrl.datatables ,
    method: 'post',
    params: query ,
    data: data
  })
}

// 查询【请填写功能名称】详细
export function getDataCategory(id) {
  return request({
    url: managerUrl.detailUrl + '/' + id ,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addDataCategory(data) {
  return request({
    url: managerUrl.saveUrl,
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateDataCategory(data) {
  return request({
    url: managerUrl.updateUrl,
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delDataCategory(ids) {
  return request({
    url: managerUrl.removeUrl + '/' + ids ,
    method: 'delete'
  })
}

// 导出【请填写功能名称】
export function exportDataCategory(query) {
  return request({
    url: managerUrl.exportUrl,
    method: 'get',
    params: query
  })
}

// 状态【请填写功能名称】修改
export function changeStatusDataCategory(id , status) {
  const data = {
    id ,
    status
  }
  return request({
    url: managerUrl.statusUrl,
    method: 'put',
    data: data
  })
}

// 修改【请填写功能名称】单个字段值
export function changeDataCategoryField(value , field , id){
  const data = {
    value ,
    field ,
    id
  }
  return request({
    url: managerUrl.changeField ,
    method: 'post',
    data: data
  })
}
//statistics
//统计数据明细行数、数据及索引占用的磁盘空间
export function statisticsCata(query , data) {
  return request({
    url: managerUrl.datatables ,
    method: 'post',
    params: query ,
    data: data
  })
}


//查询树形导航条当前节点和下级节点及符合查询条件的数据
export function listTreeNavInfo(ids,pageNum,pageSize, data){
  return request({
    url: managerUrl.treeNavInfo+"?ids=" +ids+"&pageNum="+pageNum+"&pageSize="+pageSize,
    method: 'post',
    params: data,
    data: data
  })
}


//检查同一个用户，行业分类下,数据目录是否存在，如已存在，则不允许保存。确同一个用户、行业分类下数据目录唯一
export function checkDataCategoryIfExist(data) {
  return request({
    url: managerUrl.checkIfExist,
    method: 'post',
    data: data
  })
}


//检查数据目录是否已被引用
export function checkIfUsed(ids) {
  return request({
    url: managerUrl.checkIfUsed + '?ids=' + ids ,
    method: 'get'
  })
}
