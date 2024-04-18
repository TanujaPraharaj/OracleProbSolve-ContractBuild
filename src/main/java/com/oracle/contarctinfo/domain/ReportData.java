package com.oracle.contarctinfo.domain;

import java.util.*;

public class ReportData {
    private Map<String, Set<String>> contractIdMap = new HashMap<>();
    private Map<String, Set<String>> geozoneMap = new HashMap<>();
    private Map<String, List<Integer>> buildDurationMap = new HashMap<>();

    public Map<String, Set<String>> getContractIdMap() {
        return contractIdMap;
    }

    public Map<String, Set<String>> getGeozoneMap() {
        return geozoneMap;
    }

    public Map<String, List<Integer>> getBuildDurationMap() {
        return buildDurationMap;
    }

    // Methods to update data
    public void updateContractIdMap(String contractId, String customerId) {
        contractIdMap.computeIfAbsent(contractId, k -> new HashSet<>()).add(customerId);
    }

    public void updateGeozoneMap(String geozone, String customerId) {
        geozoneMap.computeIfAbsent(geozone, k -> new HashSet<>()).add(customerId);
    }

    public void updateBuildDurationMap(String geozone, int duration) {
        buildDurationMap.computeIfAbsent(geozone, k -> new ArrayList<>()).add(duration);
    }
}
