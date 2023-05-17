package com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.client;

import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.configuration.EnderecoApiFeignConfiguration;
import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.response.EnderecoApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "EnderecoApiClient",
        url = "${fbiopereira.restClient.enderecoApiUrl}"
)
public interface EnderecoApiClient {

    @GetMapping("/cep/{cep}")
    EnderecoApiResponse find(@PathVariable("cep") String cep);

}
