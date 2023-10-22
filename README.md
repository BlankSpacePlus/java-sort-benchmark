# Java Basic Sort Algorithm Benchmark

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

当 Type=RANDOM, N=10000 时：

| Benchmark | Mode | Cnt | Score | Error | Units |
|:----:|:------:|:----:|:----:|:----:|:----:|
| SortBenchmark.measureBubbleSort | avgt | 5 | 162794592.020  | ±4858423.687  | ns/op |
| SortBenchmark.measureCocktailSort | avgt | 5 | 117875112.974 | ±1801663.339 | ns/op |
| SortBenchmark.measureHeapSort | avgt | 5 | 1167250.200 | ±28239.860 | ns/op |
| SortBenchmark.measureInsertSort | avgt | 5 | 13174480.918 | ±5596179.483 | ns/op |
| SortBenchmark.measureMergeSortIteration | avgt | 5 | 29098146.779 | ±3736357.148 | ns/op |
| SortBenchmark.measureMergeSortRecursion |  avgt  | 5 | 28779516.894 | ±405124.476 | ns/op |
| SortBenchmark.measureQuickSort | avgt | 5 | 709788.344 | ±503343.945 | ns/op |
| SortBenchmark.measureSelectSort | avgt | 5 | 22577842.839 | ±2292587.364 | ns/op |
| SortBenchmark.measureShellSort | avgt | 5 | 818784.598 | ±6145.788 | ns/op |
