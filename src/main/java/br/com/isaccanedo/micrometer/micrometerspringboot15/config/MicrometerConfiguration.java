package br.com.isaccanedo.micrometer.micrometerspringboot15.config;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.spring.autoconfigure.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MicrometerConfiguration {

    @SuppressWarnings("rawtypes")
	@Bean
    MeterRegistryCustomizer meterRegistryCustomizer(MeterRegistry meterRegistry) {
        return meterRegistry1 -> {
          meterRegistry.config()
          .commonTags("application", "prometheus-micrometer");
        };
    }

}
