/*
 *
 *  * Copyright 2016 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */
package org.deeplearning4j.arbiter.optimize.listener;

import org.deeplearning4j.arbiter.optimize.runner.listener.candidate.UICandidateStatusListener;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.ui.components.text.ComponentText;

/**
 * Listener designed to report status to Arbiter UI - used for MultiLayerNetworks
 * Combines org.deeplearning4j.arbiter.optimize.listener functionality for both early stopping AND iteration listeners
 */
public class UIStatusReportingListener extends BaseUIStatusReportingListener<MultiLayerNetwork> {


    public UIStatusReportingListener(UICandidateStatusListener listener) {
        super(listener);
    }

    @Override
    protected void createConfigComponent(MultiLayerNetwork network) {
        config = new ComponentText(network.getLayerWiseConfigurations().toString(), null);
    }
}