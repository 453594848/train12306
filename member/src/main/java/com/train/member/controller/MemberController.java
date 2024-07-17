package com.train.member.controller;

import com.train.common.resp.CommonResp;
import com.train.member.req.MemberRegisterReq;
import com.train.member.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource
    private MemberService memberService;

    @GetMapping("/count")
    public CommonResp<Integer> count() {
        CommonResp<Integer> commonResp = new CommonResp<>();
        commonResp.setContent(memberService.count());
        return commonResp;
    }

    @PostMapping("/register")
    public CommonResp<Long> register(MemberRegisterReq memberRegisterReq) {
      /*  CommonResp<Long> commonResp = new CommonResp<>();
        commonResp.setContent(memberService.register(memberRegisterReq));
        return commonResp;*/
        long register = memberService.register(memberRegisterReq);
        return new CommonResp<>(register);
    }

}
