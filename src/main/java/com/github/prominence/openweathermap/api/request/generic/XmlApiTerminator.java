/*
 * Copyright (c) 2021-present Alexey Zinchenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.prominence.openweathermap.api.request.generic;

import com.github.prominence.openweathermap.api.enums.UnitSystem;

public interface XmlApiTerminator {

    /**
     * Terminates the chain of request configuration calls by setting the final parameter and fetches the response as XML text.
     *
     * @param unitSystem The final parameter, defining whether we want to use standard, metric or imperial measurement units.
     *                   Uses {@link UnitSystem#STANDARD} when null.
     * @return XML
     */
    String asXML(UnitSystem unitSystem);

    /**
     * Shorthand to {@link #asXML(UnitSystem) using {@link UnitSystem#STANDARD}}.
     * @return XML
     */
    default String asXML() {
        return asXML(UnitSystem.STANDARD);
    }
}
