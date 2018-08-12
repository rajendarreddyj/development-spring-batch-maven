package com.rajendarreddyj.spring.batch.config;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

/**
 * @author rajendarreddy.jagapathi
 *
 */
public class AckWriter implements ItemWriter<Object> {

  

    @Override
    public void write(List<?> list) throws Exception {
                System.out.println("ACT WRITER WRITE");
    }
}
