package studio.thinkground.AroundHubSpringBoot.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import studio.thinkground.AroundHubSpringBoot.dto.MemberDTO;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    // http://localhost:9090/api/v1/post-api/default
    @PostMapping(value = "/default")
    public String postMethod() {
        return "Hello World!";
    }

    // http://localhost:9090/api/v1/post-api/member
    /* body
    {
        "name" : "yeji",
        "email" : "21900806@handong.ac.kr",
        "organization" : "Around Hub Studio"
    }
    */

    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

    /*
        param.forEach((key, value) -> sb.append(key).append(" : ").append(value).append("\n"));
    */

        return sb.toString();
    }

    // http://localhost:9090/api/v1/post-api/member2
    /* body
    {
        "name" : "yeji",
        "email" : "21900806@handong.ac.kr",
        "organization" : "Around Hub Studio"
    }
    */
    @PostMapping(value = "/member2")
    public String postMemberDto(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }

}