/*
 * Copyright 2019 - 2020 Andre601
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.botblock.javabotblockapi.core;

import java.util.Map;

/**
 * Utility class to perform basic checks.
 */
public class CheckUtil{
    
    /**
     * Will throw a {@link java.lang.NullPointerException NullPointerException} when the provided String is empty.
     * 
     * @param value
     *        The String to check.
     * @param name
     *        The name of the parameter checked.
     */
    public static void notEmpty(String value, String name){
        if(value.isEmpty())
            throw new NullPointerException(name + " may not be empty.");
    }
    
    /**
     * Will throw a {@link java.lang.NullPointerException NullPointerException} when the provided Map is empty.
     * 
     * @param value
     *        The Map to check.
     * @param name
     *        The name of the parameter checked.
     */
    public static void notEmpty(Map<?, ?> value, String name){
        if(value.isEmpty())
            throw new NullPointerException(name + " may not be empty.");
    }
    
    /**
     * Will throw a {@link java.lang.IllegalStateException IllegalStateException} when the provided expression returns true.
     * 
     * @param expression
     *        The expression to check against.
     * @param message
     *        The message to print in the Exception when thrown.
     */
    public static void condition(boolean expression, String message){
        if(expression)
            throw new IllegalStateException(message);
    }
}
