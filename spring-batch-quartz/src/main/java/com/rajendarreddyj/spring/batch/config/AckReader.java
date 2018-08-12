package com.rajendarreddyj.spring.batch.config;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * @author rajendarreddy.jagapathi
 *
 */
public class AckReader implements ItemReader<Object>, StepExecutionListener {

    /* (non-Javadoc)
     * @see org.springframework.batch.core.StepExecutionListener#beforeStep(org.springframework.batch.core.StepExecution)
     */
    @Override
    public void beforeStep(StepExecution stepExecution) {
        System.out.println("ACK READER BEFORE STEP");
        
    }

    /* (non-Javadoc)
     * @see org.springframework.batch.core.StepExecutionListener#afterStep(org.springframework.batch.core.StepExecution)
     */
    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        // TODO Auto-generated method stub
        return ExitStatus.COMPLETED;
    }

    /* (non-Javadoc)
     * @see org.springframework.batch.item.ItemReader#read()
     */
    @Override
    public Object read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        System.out.println("ACK READER READ");
        // TODO Auto-generated method stub
        return null;
    }


}
