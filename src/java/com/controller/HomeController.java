
package com.controller;

import com.model.Conectar;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

public class HomeController {
    
    private JdbcTemplate jdbcTemplate;
    
    public HomeController()
    {
        /*Constructor*/
        Conectar con = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping("home.htm")
    public ModelAndView home()
    {
        /*Delcarar la vista */
        ModelAndView mav = new ModelAndView();
        String sql = "select * from usuarios";
        List datos = this.jdbcTemplate.queryForList(sql); 
        mav.addObject("datos",datos);
        mav.setViewName("home");
        return mav;
    }
    
}
