package com.VerifyNotification;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class NotificationServiceTest {

	@Test
	void test() {
		// Creating mock object
        NotifyInterface nMock = mock(NotifyInterface.class);
        // Create NotificationService with Mock
        NotificationService nService = new NotificationService(nMock);
        // Call the Method and store return value
        String res = nService.SendNotification("Syam");
        // Assert
        assertEquals("Hello, Syam",res);
        // Verifying Interaction
        verify(nMock).send("Hello, Syam");
	} 

}
