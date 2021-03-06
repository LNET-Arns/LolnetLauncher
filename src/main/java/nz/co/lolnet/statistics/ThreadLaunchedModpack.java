/*
 * Copyright 2015 CptWin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nz.co.lolnet.statistics;

import java.io.IOException;

/**
 *
 * @author CptWin
 */
public class ThreadLaunchedModpack implements Runnable {
    
    private String title;
    
    public ThreadLaunchedModpack(String title)
    {
        this.title = title;
        startUp();
    }
    
    private void startUp()
    {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            LauncherStatistics.launchModPack(title);
        } catch (IOException ex) {
            //Logger.getLogger(ThreadLauncherIsLaunched.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
