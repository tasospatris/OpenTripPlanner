package org.opentripplanner.routing.util;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.opentripplanner.common.MavenVersion;
import org.opentripplanner.routing.util.RoadSafetySegmentFactory.RoadSafetyPriority;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoadSafetySegment implements Serializable {
	
    private static final long serialVersionUID = MavenVersion.VERSION.getUID();

    private static final Logger LOG = LoggerFactory.getLogger(RoadSafetySegment.class);
    
    private RoadSafetyPriority highwayType;
    
    public RoadSafetySegment(RoadSafetyPriority priority) {
    	this.highwayType = priority;    	
    }
    
    public double getSafetyFactor() {
    	return highwayType.ordinal();
    }
    
}
