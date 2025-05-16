package cl.duoc.ms_webpay_amb.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WebPayInitTransaction {
    
    @JsonProperty(value="buy_order")
    private String BuyOrder;
    @JsonProperty(value="session_id")
    private String sessionId;
    @JsonProperty(value="amount")
    private int amount;
    @JsonProperty(value="return_url")
    private String returnUrl;

    
}
