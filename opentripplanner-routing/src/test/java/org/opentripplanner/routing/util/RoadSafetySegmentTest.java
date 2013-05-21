package org.opentripplanner.routing.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoadSafetySegmentTest {

	@Test
	public void test() {
		RoadSafetySegment segment = new RoadSafetySegment("foo");
		assertEquals(segment.getSafetyFactor(), 1, 0.1);
	}

}
