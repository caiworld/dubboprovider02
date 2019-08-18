package com.caihao.service.impl;

import com.caihao.entity.CopyEmpEntity;
import com.caihao.mapper.CopyEmpEntityMapper;
import com.caihao.service.CopyEmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/8/10 14:21
 */
@Service
public class CopyEmpServiceImpl implements CopyEmpService {

  @Autowired
  private CopyEmpEntityMapper copyEmpEntityMapper;

  /**
   * 分页获取copyemp信息
   *
   * @return com.github.pagehelper.PageInfo<com.caihao.entity.CopyEmpEntity>
   * @author 蔡浩
   * @date 2019/8/10 14:20
   * @since 1.0.0
   */
  @Override
  public PageInfo<CopyEmpEntity> getCopyEmpListFY(int start) {
    PageHelper.startPage(start,10);
    return new PageInfo<>(copyEmpEntityMapper.selectCopyEmpList());
  }

  @Override
  public String test() {
    return "test success";
  }
}
