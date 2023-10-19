package com.ch.computer.service.impl;

import com.ch.computer.mapper.CpuMapper;
import com.ch.computer.pojo.Cpu;
import com.ch.computer.service.CpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/11/18:41
 * @Description:
 * @version: 1.0
 */
@Service
public class CpuServiceImpl implements CpuService {

    @Autowired
    private CpuMapper cpuMapper;

    public List<Cpu> selectCpus() {
        return cpuMapper.selectByExample(null);
    }
}
