/*
 * Copyright (c) 2022 Alexey Zinchenko
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

package com.github.prominence.openweathermap.api.model.forecast.daily;

import java.util.Objects;

/**
 * Represents snow information.
 */
public class Snow {
    private static final String DEFAULT_UNIT = "mm";

    private double level;

    protected Snow(double level) {
        this.level = level;
    }

    /**
     * Creates {@link Snow} object with correctness check.
     * @param threeHourLevel snow level value
     * @return snow object.
     */
    public static Snow withValue(double threeHourLevel) {
        if (threeHourLevel < 0) {
            throw new IllegalArgumentException("Snow level value cannot be negative.");
        }
        return new Snow(threeHourLevel);
    }

    /**
     * Returns snow level value.
     * @return snow level value
     */
    public double getLevel() {
        return level;
    }

    /**
     * Sets snow level value with correctness check.
     * @param level snow level value
     */
    public void setLevel(double level) {
        if (level < 0) {
            throw new IllegalArgumentException("Snow level value cannot be negative.");
        }
        this.level = level;
    }

    /**
     * Returns snow level unit of measure. Currently, is constant.
     * @return snow level unit of measure
     */
    public String getUnit() {
        return DEFAULT_UNIT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snow snow = (Snow) o;
        return Double.compare(snow.level, level) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(level);
    }

    @Override
    public String toString() {
        return "Snow volume, mm: " +
                level + ' ' +
                getUnit();
    }
}
