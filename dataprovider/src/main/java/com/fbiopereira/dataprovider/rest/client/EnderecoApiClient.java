package com.fbiopereira.dataprovider.rest.client;

import com.fbiopereira.dataprovider.rest.response.EnderecoApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "EnderecoApiClient",
        url = "${enderecoApi.client.address.url}"
)
public interface EnderecoApiClient {

    @GetMapping("/{cep}")
    EnderecoApiResponse find(@PathVariable("cep") String cep);

}
