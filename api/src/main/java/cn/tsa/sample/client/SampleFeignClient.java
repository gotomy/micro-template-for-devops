package cn.tsa.sample.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "{{service.code}}", url = "http://{{service.code}}")
public class SampleFeignClient {
}
