# Executor Service
This code repo is about how executor service simplified parallel processing

Executor service is easy to use concept for parallel execution. It helps in parallellizing the exeuction with minimal handling the complexities at developer side.

There are different underlying concepts under the hood of executor framework which are CorePoolSize, maximumPoolSize, KeepAliveTime & Queue for handling the threads beyond the thread pool capcity.

ThreadPoolExecutor is just the implementation of the ExecutorService interface.

ExecutorService executor = new ThreadPoolExecutor(poolSize, maxPoolSize, keepAliveTime, TimeUnit, Queue);

I had illustrated in code how poolSize impacts the execution of tasks.
