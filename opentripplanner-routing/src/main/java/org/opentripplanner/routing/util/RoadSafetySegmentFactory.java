package org.opentripplanner.routing.util;

import java.util.HashSet;
import java.util.Set;

import org.opentripplanner.common.MavenVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoadSafetySegmentFactory {

    private static final long serialVersionUID = MavenVersion.VERSION.getUID();

    private static final Logger LOG = LoggerFactory.getLogger(RoadSafetySegment.class);
    
    private static RoadSafetySegmentFactory INSTANCE = new RoadSafetySegmentFactory();
    
    private Set<String> highPriorityValues = new HashSet<String>();
    private Set<String> mediumPriorityValues = new HashSet<String>();    
    private Set<String> lowPriorityValues = new HashSet<String>();
    
    public enum RoadSafetyPriority {
    	HIGH(1), MEDIUM(0.6), LOW(0.2), DEFAULT(0.4);
    	private double weight;
    	
    	private RoadSafetyPriority(double weight) {
    		this.weight = weight;
    	}
    }
    
    private RoadSafetySegmentFactory() {
    	highPriorityValues.add("residential");
    	highPriorityValues.add("service");
    	highPriorityValues.add("living_street");
    	highPriorityValues.add("track");
    	highPriorityValues.add("footway");
    	highPriorityValues.add("unclassified");
    	
    	lowPriorityValues.add("motorway") ;
    	lowPriorityValues.add("primary");
    	lowPriorityValues.add("trunk");
    	lowPriorityValues.add("primary_link");
    	
    	mediumPriorityValues.add("secondary") ;
    	mediumPriorityValues.add("tertiary") ;
     	mediumPriorityValues.add("secondary_link") ;
    }
    
    public RoadSafetySegment drawSegment(String highwayValue) {
    	LOG.debug("creating road safety segment") ;
    	if (highPriorityValues.contains(highwayValue))
    		return new RoadSafetySegment(RoadSafetyPriority.HIGH);
    	else if (mediumPriorityValues.contains(highwayValue))
    		return new RoadSafetySegment(RoadSafetyPriority.MEDIUM);
    	 else if (lowPriorityValues.contains(highwayValue))
    		return new RoadSafetySegment(RoadSafetyPriority.LOW);
    	 else 
    		return new RoadSafetySegment(RoadSafetyPriority.DEFAULT);    		
    }
    
    public static RoadSafetySegmentFactory getInstance() {
    	return INSTANCE;
    }
    
}
