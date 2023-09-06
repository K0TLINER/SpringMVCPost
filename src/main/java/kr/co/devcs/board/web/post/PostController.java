package kr.co.devcs.board.web.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.devcs.board.service.domain.Post;
import kr.co.devcs.board.service.post.PostService;

@Controller
@RequestMapping("/post/*")
public class PostController {

	
	@Autowired
	@Qualifier("postServiceImpl")
	private PostService postService;
	
	public PostController() {
		
	}
	@RequestMapping("/getPost/{postId}")
	public ModelAndView getPost(@PathVariable("postId") int postId) {
		System.out.println("getPost");
		
		Post post = postService.getPost(postId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("post",post);
		modelAndView.setViewName("/post/getPost.jsp");
		
		return modelAndView;
	}
}
