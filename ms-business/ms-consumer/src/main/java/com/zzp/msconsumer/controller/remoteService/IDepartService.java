package com.zzp.msconsumer.controller.remoteService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "ms-zzp-provider")

public interface IDepartService {
    @GetMapping("/provider/nameSpace")
    String getNameSpace();
}
