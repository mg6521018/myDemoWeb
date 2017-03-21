package com.mg.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ivan
 *
 */
@Controller
@RequestMapping("/org")
public class OrgController {
    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(OrgController.class);
    /*@Reference
    private OrgService orgService;

    /**
     * 新增user
     */
    /*@RequestMapping("/loadOrgData.do")
    @ResponseBody
    public List loadOrgData(HttpServletRequest request,@RequestParam(required=false,defaultValue="-1") Integer id){
        List<Org> list = orgService.selectAll(id);
        return covertTree(list);
    }

    private List covertTree(List<Org> list) {
        if(null == list || list.size() == 0){
            return null;
        }
        List <Map<String,Object>> json = new ArrayList();
        for(Org org : list){
            Map<String,Object> map = new HashMap();
            map.put("id",org.getId());
            map.put("text",org.getName());
            if(null != org.getHavSub() && 1 == org.getHavSub()){
                map.put("state","closed");
            }
            else{
                map.put("state","open");
            }

            json.add(map);
        }
        return json;
    }*/
}