package com.lizhenchuan.Controller;

import com.lizhenchuan.bean.OrderType;
import com.lizhenchuan.bean.QueryVo;
import com.lizhenchuan.bean.Reader;
import com.lizhenchuan.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RuKouController {
    @Autowired
    private ReaderService readerService;

    //页面入口
    @RequestMapping("/reader")
    public String First(QueryVo vo, Model model) {
        Reader selectrid = readerService.selectrid(Long.valueOf(1));
        model.addAttribute("selectrid", selectrid);
        return "index";
    }
}
