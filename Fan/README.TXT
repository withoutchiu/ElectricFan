This repository is for Medavie Blue Cross Coding Assessment for the following Challenge;

   The unit has 2 pull cords:   
   -One increases the speed each time it is pulled. There are 3 speed settings, and an “off” (speed 0) setting.   If the cord is pulled on speed 3, the fan returns to the “off” setting. 
   -One reverses the direction of the fan at the current speed setting. Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.
   -You can assume the unit is always powered (no wall switch)
   
This challenge was coded using BlueJ for lightweight installation on my local machine. Please refer to the java classes below:
- Test Class: https://github.com/withoutchiu/ElectricFan/blob/1bcd6ee0f0af24f8de5a5aac66180a0abc0dd6a5/Fan/ElectricfanTest.java
- Java Class: https://github.com/withoutchiu/ElectricFan/blob/1bcd6ee0f0af24f8de5a5aac66180a0abc0dd6a5/Fan/Electricfan.java

Quick overview with my solution:
-Declared OFF = 0 as a final static because off will always be 0
-Set speed to 0 as initial state
-Set speed to Forward as initial state
-Created 2 method to get speed and direction
-Created pullSpeedCord method for changing its speed state
-Created pullDirectionCord method for changing its direction state
-To string to display current state of the class

**You may add additional testing for your own testing
**
**
** Thank you!