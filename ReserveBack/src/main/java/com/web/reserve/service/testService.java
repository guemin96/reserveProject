package com.web.reserve.service;

import com.web.reserve.dao.mapper.testMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class testService {
    private final testMapper testmapper;

    public int testConnect() {
        return testmapper.testConnect();
    }
}
