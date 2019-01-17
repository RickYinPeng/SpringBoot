package com.atyp.spring_boot.controller;

import com.atyp.spring_boot.dao.EmployeeDao;
import com.atyp.spring_boot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author RickYinPeng
 * @ClassName EmployeeController
 * @Description
 * @date 2019/1/17/20:42
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    /**
     * 查询所有员工返回列表页面
     * @return
     */
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();

        //放在请求域中
        model.addAttribute("emps",employees);
        //thymeleaf默认就会拼串
        //classpath:/templates/   xxxx.html
        return "emp/list";
    }
}
