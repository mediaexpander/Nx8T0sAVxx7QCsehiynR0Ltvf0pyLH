/**
 * Copyright 2012-2013 StackMob
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stackmob.customcode;

import com.stackmob.core.customcode.CustomCodeMethod;
import com.stackmob.sdkapi.SDKServiceProvider;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.stackmob.core.PushServiceException;
import com.stackmob.core.ServiceNotActivatedException;
import com.stackmob.core.customcode.CustomCodeMethod;
import com.stackmob.core.rest.ProcessedAPIRequest;
import com.stackmob.core.rest.ResponseToProcess;
import com.stackmob.example.Util;
import com.stackmob.sdkapi.*;

import java.net.HttpURLConnection;
import java.util.*;

public class HelloWorld implements CustomCodeMethod {
    
    @Override
    public String getMethodName() {
        return "hello_world";
    }
    
    
    
    @Override
    public List<String> getParams() {
        return Arrays.asList("followers");
    }
    
    @Override
    public ResponseToProcess execute(ProcessedAPIRequest request, SDKServiceProvider serviceProvider) {
        LoggerService logger = serviceProvider.getLoggerService(DirectPushNotification.class);
        Map<String, String> errMap = new HashMap<String, String>();
        
        Map<String, String> payload = new HashMap<String, String>();
        return new ResponseToProcess(HttpURLConnection.HTTP_OK, payload);
    }
    
}