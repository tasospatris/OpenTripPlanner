package org.opentripplanner.routing.util;

import java.io.Serializable;

import org.opentripplanner.common.MavenVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoadSafetySegment implements Serializable {
	
    private static final long serialVersionUID = MavenVersion.VERSION.getUID();

    private static final Logger LOG = LoggerFactory.getLogger(RoadSafetySegment.class);
    
    private HighwayType highwayType;
    
    public RoadSafetySegment(String highwayValue) {
    	//FIXME Stub constructor
    	this.highwayType = HighwayType.DEFAULT;    	
    }
    
    public double getSafetyFactor() {
    	return highwayType.weight;
    }
    
    public enum HighwayType {
    	DEFAULT(1);
    	private int weight;
    	
    	private HighwayType(int weight) {
    		this.weight = weight;
    	}
    }
}
