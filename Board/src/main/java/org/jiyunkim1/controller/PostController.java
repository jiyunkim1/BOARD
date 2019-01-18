package org.jiyunkim1.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.jiyunkim1.domain.PostVO;
import org.jiyunkim1.service.PostService;

@Controller
@RequestMapping("/post/*")
public class PostController {
	
	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	
	@Inject 
	private PostService service;
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public void registerGET(PostVO post, Model model) throws Exception{
		
		logger.info("register get ......");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(PostVO post, RedirectAttributes rttr) throws Exception {
		
		logger.info("register post ........");
		logger.info(post.toString());
		
		service.register(post);
		
		rttr.addFlashAttribute("msg", "success");
		return "redirect:/post/listAll";
	}
	
	@RequestMapping(value = "/listAll", method=RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		
		logger.info("show all list...............");
		model.addAttribute("list", service.listAll());
	}
	
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public void read(@RequestParam("postId") Integer postId, Model model)
	throws Exception{
		model.addAttribute(service.read(postId));
	}
	
	@RequestMapping(value="/remove", method=RequestMethod.POST)
	public String remove(@RequestParam("postId") Integer postId, RedirectAttributes rttr) throws Exception {
		
		service.remove(postId);
		
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/post/listAll";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public void modifyGET(Integer postId, Model model) throws Exception {
		
		model.addAttribute(service.read(postId));
	}
	
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modifyPOST(PostVO post, RedirectAttributes rttr) throws Exception{
		
		logger.info("mod post......");
		
		service.modify(post);
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/post/listAll";
	}

}
