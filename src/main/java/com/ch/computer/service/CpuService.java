package com.ch.computer.service;

import com.ch.computer.pojo.Cpu;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/11/18:41
 * @Description:
 * @version: 1.0
 */
public interface CpuService {

    List<Cpu> selectCpus();
}
