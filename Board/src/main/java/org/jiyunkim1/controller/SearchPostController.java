package org.jiyunkim1.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.jiyunkim1.domain.PageMaker;
import org.jiyunkim1.domain.PostVO;
import org.jiyunkim1.domain.SearchCriteria;
import org.jiyunkim1.service.PostService;

@Controller
@RequestMapping("/spost/*")
public class SearchPostController {
	
	private static final Logger logger = LoggerFactory.getLogger(SearchPostController.class);
	
	@Inject
	private PostService service;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void listPage(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception{
		
		logger.info(cri.toString());
		
		//model.addAttribute("list", service.listCriteria(cri));
		model.addAttribute("list", service.listSearchCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		
		//pageMaker.setTotalCount(service.listCountCriteria(cri));
		pageMaker.setTotalCount(service.listSearchCount(cri));
		
		model.addAttribute("pageMaker", pageMaker);
		
	}
	
	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public void read(@RequestParam("postId") Integer postId, @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
		
		model.addAttribute(service.read(postId));
		
	}
	
	@RequestMapping(value = "/removePage", method = RequestMethod.POST)
	  public String remove(@RequestParam("postId") Integer postId, SearchCriteria cri, RedirectAttributes rttr) throws Exception {

	    service.remove(postId);

	    rttr.addAttribute("page", cri.getPage());
	    rttr.addAttribute("perPageNum", cri.getPerPageNum());
	    rttr.addAttribute("searchType", cri.getSearchType());
	    rttr.addAttribute("keyword", cri.getKeyword());

	    rttr.addFlashAttribute("msg", "SUCCESS");

	    return "redirect:/spost/list";
	  }

	  @RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
	  public void modifyPagingGET(int postId, @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {

	    model.addAttribute(service.read(postId));
	  }
	  
	  @RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
	  public String modifyPagingPOST(PostVO post, SearchCriteria cri, RedirectAttributes rttr) throws Exception {

	    logger.info(cri.toString());
	    service.modify(post);

	    rttr.addAttribute("page", cri.getPage());
	    rttr.addAttribute("perPageNum", cri.getPerPageNum());
	    rttr.addAttribute("searchType", cri.getSearchType());
	    rttr.addAttribute("keyword", cri.getKeyword());

	    rttr.addFlashAttribute("msg", "SUCCESS");

	    logger.info(rttr.toString());

	    return "redirect:/spost/list";
	  }

	  @RequestMapping(value = "/register", method = RequestMethod.GET)
	  public void registGET() throws Exception {

	    logger.info("regist get ...........");
	  }

	  @RequestMapping(value = "/register", method = RequestMethod.POST)
	  public String registPOST(PostVO post, RedirectAttributes rttr) throws Exception {

	    logger.info("regist post ...........");
	    logger.info(post.toString());

	    service.register(post);

	    rttr.addFlashAttribute("msg", "SUCCESS");

	    return "redirect:/spost/list";
	  }
	  
	  @RequestMapping(value = "/reply", method = RequestMethod.GET)
	  public void replyGET()throws Exception {
		  
		  logger.info("reply to post.........");
	  }
	  
	  @RequestMapping(value="/reply", method = RequestMethod.POST)
	  public String replyPOST(PostVO post, RedirectAttributes rttr)throws Exception{
		  
		  logger.info("reply to post.........");
		  logger.info(post.toString());
		 
		  service.reply(post);
		  
		  rttr.addFlashAttribute("msg, 'SUCCESS");
		  return "redirect:/spost/list";
	  }

	  // @RequestMapping(value = "/list", method = RequestMethod.GET)
	  // public void listPage(@ModelAttribute("cri") SearchCriteria cri,
	  // Model model) throws Exception {
	  //
	  // logger.info(cri.toString());
	  //
	  // model.addAttribute("list", service.listCriteria(cri));
	  //
	  // PageMaker pageMaker = new PageMaker();
	  // pageMaker.setCri(cri);
	  //
	  // pageMaker.setTotalCount(service.listCountCriteria(cri));
	  //
	  // model.addAttribute("pageMaker", pageMaker);
	  // }
	}


	
	

		  
		  		  