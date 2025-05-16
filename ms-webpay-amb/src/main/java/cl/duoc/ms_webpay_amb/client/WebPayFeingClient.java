package cl.duoc.ms_webpay_amb.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="webpay-svc", url="https://webpay3gint.transbank.cl")
public interface WebPayFeingClient {

    @PostMapping("url de la api")
    public String initTransaction();
}
