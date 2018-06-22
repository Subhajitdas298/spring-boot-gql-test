package com.sd.springbootgqltest.model;

import io.leangen.graphql.annotations.GraphQLQuery;
import java.io.Serializable;
import javax.persistence.*;

import lombok.*;
/**
 *
 * @author subha
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tt")
public class TT implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GraphQLQuery
    private Long id;
    @Column
    @GraphQLQuery
    private String data;
}
