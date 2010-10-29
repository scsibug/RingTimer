package com.ringerApp.test;

import com.ringerApp.RingTimerService;
import android.content.Intent;
import android.os.IBinder;

import android.test.ServiceTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.test.suitebuilder.annotation.MediumTest;

public class RingTimerServiceTest extends ServiceTestCase<RingTimerService> {

	public RingTimerServiceTest() {
		super(RingTimerService.class);
	}
        protected void setUp() throws Exception {
            super.setUp();
        }
	
        @SmallTest
        public void testPreconditions() {
        }

        /**
         * Test basic startup/shutdown of Service
         */
        @SmallTest
        public void testStartable() {
            Intent startIntent = new Intent();
            startIntent.setClass(getContext(), RingTimerService.class);
            startService(startIntent); 
        }

        /**
         * Test binding to service
         */
        @MediumTest
        public void testBindable() {
            Intent startIntent = new Intent();
            startIntent.setClass(getContext(), RingTimerService.class);
            IBinder service = bindService(startIntent); 
        }

	@SmallTest
	public void testRingerSleep(){
            assertTrue(true);
	}

	@SmallTest
	public void testTurnOffRinger(){
		assertTrue(true);
	}

}
