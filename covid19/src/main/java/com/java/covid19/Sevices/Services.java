package com.java.covid19.Sevices;

import com.java.covid19.Entities.Summary;

import java.io.IOException;

public interface Services {
    Summary getSummaryInfo() throws IOException;
}
