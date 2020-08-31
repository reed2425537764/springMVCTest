package cn.case1.controller;

import cn.case1.domain.User;
import cn.case1.exception.SysException;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/response")
public class ResponseController {

    @RequestMapping("test1")
    public void test1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请求转发
        //request.getRequestDispatcher("/WEB-INF/pages/sucess.jsp").forward(request,response);
        //重定向
        //response.sendRedirect(request.getContextPath()+"/index.jsp");
        //直接响应
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("你好");
    }

    @RequestMapping("test2")
    public ModelAndView test2() {
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setUsername("ModelAndView");
        user.setPassword("12");
        user.setBirthday(new Date());
        mv.addObject("msg", user);
        mv.setViewName("sucess");
        return mv;
    }

    @RequestMapping("test3")
    public String test3() {
        //使用关键字进行请求转发
        //return "forward:/WEB-INF/pages/sucess.jsp";     //路径写全，因为不经过视图解析器

        //使用关键字进行重定向
        return "redirect:/index.jsp";       //不用加虚拟目录
    }

    @RequestMapping("test4")
    public @ResponseBody User test4(User user) {//POST
        System.out.println(user);
        return user;
    }

    @RequestMapping("test5")
    public @ResponseBody User test5(User user) {//GET
        System.out.println(user);
        return user;
    }

    @RequestMapping("test6")
    public String test6(HttpServletRequest request) throws Exception {
        //传统上传文件  与文件解析器不兼容
        File file = new File("C:\\Users\\石禹钦\\Desktop\\test111");
        if (!file.exists()){
            file.mkdir();
        }
        DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
        List<FileItem> fileItems = upload.parseRequest(request);
        for (FileItem fileItem : fileItems) {
            if (!fileItem.isFormField()){
                String uuid = UUID.randomUUID().toString().replace("-", "");
                System.out.println(uuid);
                fileItem.write(new File(file, fileItem.getName()+uuid));
                fileItem.delete();
            }
        }
        return "sucess";
    }

    @RequestMapping("test7")
    public String test7(MultipartFile file) throws IOException {
        File dir = new File("C:\\Users\\石禹钦\\Desktop\\test111");
        if (!dir.exists()){
            dir.mkdir();
        }
        String fileName = file.getOriginalFilename().substring(0,file.getOriginalFilename().lastIndexOf(".")) +
                UUID.randomUUID().toString().replace("-","")+"."+
                file.getContentType().split("/")[1];
        System.out.println(fileName);
        file.transferTo(new File(dir, fileName));
        return "sucess";
    }

    @RequestMapping("test8")
    public String test8() throws SysException {
        //异常处理器
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new SysException("您的网络开小差了");
        }
        return "sucess";
    }

    @RequestMapping("test9")
    public String test9(){
        System.out.println("controller执行了");
        return "sucess";
    }
}
