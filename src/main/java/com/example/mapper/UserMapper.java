package com.example.mapper;

import com.example.entity.PmsCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<PmsCategory> Sel();
}
