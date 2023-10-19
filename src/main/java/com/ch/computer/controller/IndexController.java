package com.ch.computer.controller;

import com.ch.computer.pojo.Cpu;
import com.ch.computer.pojo.GraphicsCard;
import com.ch.computer.service.impl.CpuServiceImpl;
import com.ch.computer.service.impl.GraphicsCardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/11/18:39
 * @Description:
 * @version: 1.0
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private CpuServiceImpl cpuService;

    @Autowired
    private GraphicsCardServiceImpl graphicsCardService;

    @GetMapping("/")
    public String index(Model model){
        List<Cpu> cpus = cpuService.selectCpus();
        model.addAttribute("cpus",cpus);

        List<GraphicsCard> graphicsCards = graphicsCardService.selectGraphicsCards();
        model.addAttribute("graphicsCards",graphicsCards);
        return "index";
    }
}
