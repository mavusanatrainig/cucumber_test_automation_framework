package com.automation.utilities;

import com.automation.driver.factory.Factory;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;


import java.io.File;
import java.util.List;

public class Reports {
    private List<String> jsonFiles;

    public Reports(List<String> jsonFiles) {
        this.jsonFiles = jsonFiles;
    }

    public void createCucumberRepor(){

        Configuration configuration =  new Configuration(new File("target"), "Test Report");
        ReportBuilder reportBuilder = new ReportBuilder(this.jsonFiles,configuration);
        Reportable report = reportBuilder.generateReports();

    }

}
