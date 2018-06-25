package com.sd.springbootgqltest.service;

import com.sd.springbootgqltest.model.DataItem;
import com.sd.springbootgqltest.repository.DataRepository;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import java.util.List;
import org.springframework.stereotype.Service;

import lombok.*;

/**
 *
 * @author subha
 */
@Service
@AllArgsConstructor
public class DataService{
    
    private final DataRepository dataRepository;
    
    @GraphQLMutation
    public DataItem saveData(@GraphQLArgument(name = "data") String data) {
        return dataRepository.save(new DataItem(new Long(0), data));
    }
    
    @GraphQLMutation
    public boolean deleteData(@GraphQLArgument(name = "id") Long id){
        try{
            dataRepository.deleteById(id);
            return (dataRepository.getOne(id) == null);
        }catch(Exception e){
            return false;
        }
    }

    @GraphQLQuery
    public List<DataItem> allData() {
        return dataRepository.findAll();
    }
    
    @GraphQLQuery
    public DataItem getData(@GraphQLArgument(name = "id") Long id) {
        return dataRepository.getOne(id);
    }
    
}
