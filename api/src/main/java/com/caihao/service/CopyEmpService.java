package com.caihao.service;

import com.caihao.entity.CopyEmpEntity;
import com.github.pagehelper.PageInfo;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/8/10 13:46
 */
public interface CopyEmpService {

  /**
   * 分页获取copyemp信息
   *
   * @return com.github.pagehelper.PageInfo<com.caihao.entity.CopyEmpEntity>
   * @author 蔡浩
   * @date 2019/8/10 14:20
   * @since 1.0.0
   */
  PageInfo<CopyEmpEntity> getCopyEmpListFY(int start);

  String test();

}
