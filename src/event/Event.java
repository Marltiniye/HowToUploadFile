/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package event;

import Charactor.*;

public class Event {
			public static boolean checkHit(Jeng jeng,Wave wave,int dogSize,int waveHeight){
							if(jeng.x+dogSize>wave.x&&jeng.x<wave.x) {
								if(jeng.y+dogSize>=wave.y-waveHeight) {
									return true;
								}
							}
							return false;
			}
			
			public static void gameStop(Wave[] wave,Environment[] env) {

			}

}
