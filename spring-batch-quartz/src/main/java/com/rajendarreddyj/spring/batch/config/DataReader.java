package com.rajendarreddyj.spring.batch.config;



import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.core.io.ClassPathResource;

import com.rajendarreddyj.spring.bean.Person;

/**
 * @author rajendarreddy.jagapathi
 *
 */
public class DataReader implements ItemReader<Person>,StepExecutionListener {

    /* (non-Javadoc)
     * @see org.springframework.batch.core.StepExecutionListener#beforeStep(org.springframework.batch.core.StepExecution)
     */
    @Override
    public void beforeStep(StepExecution stepExecution) {
        // TODO Auto-generated method stub
        System.out.println("I AM IN BEFORE STEP");
    }

    /* (non-Javadoc)
     * @see org.springframework.batch.core.StepExecutionListener#afterStep(org.springframework.batch.core.StepExecution)
     */
    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.springframework.batch.item.ItemReader#read()
     */
    @Override
    public Person read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        // TODO Auto-generated method stub
        System.out.println("I AM IN REAd");
        FlatFileItemReader<Person> reader = new FlatFileItemReader<>();
        reader.setResource(new ClassPathResource("sample-data.csv"));
        reader.setLineMapper(new DefaultLineMapper<Person>() {
            {
                this.setLineTokenizer(new DelimitedLineTokenizer() {
                    {
                        this.setNames(new String[] { "firstName", "lastName" });
                    }
                });
                this.setFieldSetMapper(new BeanWrapperFieldSetMapper<Person>() {
                    {
                        this.setTargetType(Person.class);
                    }
                });
            }
        });
        return null;
    }

}
