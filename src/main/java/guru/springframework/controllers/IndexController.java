package guru.springframework.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.domain.Category;
import guru.springframework.repositories.CategoryRepository;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

	@Autowired
	CategoryRepository cr;
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
    	cr.findAll().forEach(i -> System.out.println(i.getDescription()));;
        return "index";
    }
}
