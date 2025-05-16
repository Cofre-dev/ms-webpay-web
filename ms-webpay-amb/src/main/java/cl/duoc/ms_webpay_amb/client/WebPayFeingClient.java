package cl.duoc.ms_webpay_amb.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import cl.duoc.ms_webpay_amb.model.dto.WebPayInitTransaction;

@FeignClient(name="webpay-svc", url="https://webpay3gint.transbank.cl")
public interface WebPayFeingClient {

    @PostMapping("url de la api")
    public String initTransaction(  @RequestHeader(name="tbk-api-Key-Id") String tbkApikeyId,
                                    @RequestHeader(name="tbk-api-Key-Secret") String tbkApikeySecret,
                                    @RequestBody WebPayInitTransaction webPayFeingClient);
}
