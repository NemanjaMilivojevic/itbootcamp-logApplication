package com.itbootcamplogger.servivces;

import com.itbootcamplogger.repository.LogRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LogService {

    private final LogRepository logRepository;
}
