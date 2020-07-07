package com.hab.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 功能：
 * invokeBeanFactoryPostProcessors()->PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors
 * ->invokeBeanDefinitionRegistryPostProcessors->ConfigurationAnnotationProcessor.postProcessBeanDefinitionRegistry
 *
 *
 * BeanDefinitionHolder
 *
 *ConfigurationClassParser.parser(Set<BeanDefinitionHolder> configCandidates)
 * doProcessConfigurationClass  processConfigurationClass  asSourceClass  doProcessConfigurationClass
 *
 * doProcessConfigurationClass方法很重要，解析各种注解
 *
 * ComponentScanAnnotationParser.parse->scanner.doScan
 *
 * AnnotationMetadataReadingVisitor.getAnnotatedMethods
 *
 *
 * processConfigBeanDefinitions尤其重要
 *
 *
 * @author huangaibing
 * @date 2020/7/7 14:38
 */
@Configuration
public class PersonConfig {
    public PersonConfig() {
        System.out.println("person construct");
    }

    @Bean
    public Person person(){
        return new Person("张三",18);
    }
}
