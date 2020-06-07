# KotestModule

To reproduce it (https://github.com/kotest/kotest/issues/1495) please just run the build task from the gradle. When I remove module-info.java it works.
```
16:46:46: Executing task 'build'...


> Configure project :
Found module name 'kotestModule'

> Task :compileKotlin
> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes
> Task :inspectClassesForKotlinIC
> Task :jar
> Task :startScripts
> Task :distTar
> Task :distZip
> Task :assemble
> Task :compileTestKotlin
> Task :compileTestJava NO-SOURCE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE
Could not write standard input to Gradle Test Executor 25.
java.io.IOException: The pipe is being closed
	at java.base/java.io.FileOutputStream.writeBytes(Native Method)
	at java.base/java.io.FileOutputStream.write(FileOutputStream.java:354)
	at java.base/java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:81)
	at java.base/java.io.BufferedOutputStream.flush(BufferedOutputStream.java:142)
	at org.gradle.process.internal.streams.ExecOutputHandleRunner.forwardContent(ExecOutputHandleRunner.java:68)
	at org.gradle.process.internal.streams.ExecOutputHandleRunner.run(ExecOutputHandleRunner.java:53)
	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:48)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:56)
	at java.base/java.lang.Thread.run(Thread.java:834)

> Task :test FAILED
Error occurred during initialization of boot layer
java.lang.module.ResolutionException: Modules mockk and mockk.dsl.jvm export package io.mockk to module kotlinx.coroutines.core.common
9 actionable tasks: 9 executed

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':test'.
> Process 'Gradle Test Executor 25' finished with non-zero exit value 1

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 2s
16:46:49: Task execution finished 'build'.
```
