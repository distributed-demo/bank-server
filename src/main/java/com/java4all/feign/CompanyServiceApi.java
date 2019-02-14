package com.java4all.feign;

import java.math.BigDecimal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * description:
 *
 * @author wangzhongxiang
 * @date 2019/2/14 16:10
 */
@FeignClient(value = "company-server")
public interface CompanyServiceApi {

  @PostMapping(value = "/company/increaseMoney")
  void increaseMoney(@RequestParam("id")Integer id,@RequestParam("money")BigDecimal money);
}

