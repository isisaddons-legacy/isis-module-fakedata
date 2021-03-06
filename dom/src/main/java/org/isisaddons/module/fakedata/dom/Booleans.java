/*
 *  Copyright 2015 Dan Haywood
 *
 *  Licensed under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.isisaddons.module.fakedata.dom;

import org.apache.isis.applib.annotation.Programmatic;

public class Booleans extends AbstractRandomValueGenerator {

    public Booleans(final FakeDataService fakeDataService) {
        super(fakeDataService);
    }

    /**
     * Same as {@link #any()}.
     */
    @Programmatic
    public boolean coinFlip() {
        return any();
    }

    /**
     * Same as {@link #any()}.
     */
    @Programmatic
    public boolean either() {
        return any();
    }

    @Programmatic
    public boolean diceRollOf6() {
        return fake.ints().upTo(6) == 5;
    }

    @Programmatic
    public boolean any() {
        return fake.randomService.nextDouble() < 0.5;
    }
}
