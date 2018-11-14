#!/usr/bin/env groovy
package com.praveen

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.praveen.GlobalVars
   // println GlobalVars.foo
}