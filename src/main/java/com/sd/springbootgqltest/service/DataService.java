package com.sd.springbootgqltest.service;

import com.sd.springbootgqltest.model.TT;
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
    public TT saveData(@GraphQLArgument(name = "tt") TT tt) {
        return dataRepository.save(tt);
    }

    @GraphQLQuery
    public List<TT> allData() {
        return dataRepository.findAll();
    }
    
}
