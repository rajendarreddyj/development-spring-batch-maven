package com.rajendarreddyj.spring.batch.config;

import org.springframework.batch.item.ItemProcessor;

/**
 * @author rajendarreddy.jagapathi
 *
 */
public class AckProcessor implements ItemProcessor<Object, Object> {

    /* (non-Javadoc)
     * @see org.springframework.batch.item.ItemProcessor#process(java.lang.Object)
     */
    @Override
    public Object process(Object item) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("ACK PROCESSOR PROCESS");
        return null;
    }

}
