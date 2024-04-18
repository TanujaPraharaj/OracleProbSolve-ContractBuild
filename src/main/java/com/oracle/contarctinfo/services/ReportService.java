package com.oracle.contarctinfo.services;

import com.oracle.contarctinfo.domain.ReportData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("ReportService")
@Scope("prototype")
public class ReportService {

    @Autowired
    ApplicationContext context;

    ReportData reportData=new ReportData();

    // Method to process the input string
    public void processInput(String input) {
        String[] lines = input.split("\n");
        for (String line : lines) {
            String[] parts = line.split(",");
            String customerId = parts[0];
            String contractId = parts[1];
            String geozone = parts[2];
            String buildDuration = parts[5].substring(0, parts[5].length() - 1); // Remove trailing 's'

            // Update contractId map
            reportData.updateContractIdMap(contractId,customerId);
            // Update geozone map
            reportData.updateGeozoneMap(geozone,customerId);
            // Update buildDuration map
            reportData.updateBuildDurationMap(geozone,Integer.parseInt(buildDuration));
        }
    }

    public List<String> generateReport() {
        List<String> report=new ArrayList<>();
        String uniqinessOfContarctid = "";
        String uniiqueCustomerForEachGeoZone="";
        String avrageBuildTime="";
        String ListOfUniqiueCustId="";

        System.out.println("Number of unique customerId for each contractId:");
        for (String contractId : reportData.getContractIdMap().keySet()) {
            uniqinessOfContarctid=uniqinessOfContarctid+"--"+contractId + ": " + reportData.getContractIdMap().get(contractId).size();
            System.out.println(contractId + ": " + reportData.getContractIdMap().get(contractId).size());
        }
        System.out.println("\nNumber of unique customerId for each geozone:");
        for (String geozone : reportData.getGeozoneMap().keySet()) {
            uniiqueCustomerForEachGeoZone=uniiqueCustomerForEachGeoZone+"--"+geozone + ": " + reportData.getGeozoneMap().get(geozone).size();
            System.out.println(geozone + ": " + reportData.getGeozoneMap().get(geozone).size());
        }
        System.out.println("\nAverage buildduration for each geozone:");
        for (String geozone : reportData.getBuildDurationMap().keySet()) {
            List<Integer> durations = reportData.getBuildDurationMap().get(geozone);
            int totalDuration = durations.stream().mapToInt(Integer::intValue).sum();
            double averageDuration = totalDuration / (double) durations.size();
            avrageBuildTime=avrageBuildTime+"--"+geozone + ": " + averageDuration;
            System.out.println(geozone + ": " + averageDuration);
        }
        System.out.println("\nList of unique customerId for each geozone:");
        for (String geozone : reportData.getGeozoneMap().keySet()) {
            ListOfUniqiueCustId=ListOfUniqiueCustId+"--"+geozone + ": " + reportData.getGeozoneMap().get(geozone);
            System.out.println(geozone + ": " + reportData.getGeozoneMap().get(geozone));
        }
        report.add("Number of unique customerId for each contractId:"+uniqinessOfContarctid);
        report.add("Number of unique customerId for each geozone:"+uniiqueCustomerForEachGeoZone);
        report.add("Average buildduration for each geozone:"+avrageBuildTime);
        report.add("List of unique customerId for each geozone:"+ListOfUniqiueCustId);

        return report;
    }


}

