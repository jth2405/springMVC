package webprj.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import webprj.entity.Notice;
import webprj.service.NoticeService;
import webprj.service.jdbc.JDBCNoticeService;

public class ListController implements Controller {
	
	
	private NoticeService noticeService;
	
	@Autowired
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
	
		ModelAndView mv=new ModelAndView("notice.list");
		//mv.setViewName("/WEB-INF/view/index.jsp");
		List<Notice> list= noticeService.getList(1, "TITLE","");
		mv.addObject("list", list);
		
		return mv;
	}


	

}
