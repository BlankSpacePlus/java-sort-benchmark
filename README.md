# Java Basic Sort Algorithm Benchmark

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

当 Type=RANDOM, N=10000 时：

| Benchmark | Mode | Cnt | Score | Error | Units |
|:----:|:------:|:----:|:----:|:----:|:----:|
| SortBenchmark.measureBubbleSort | avgt | 5 | 94168100.841  | ±1247454.610  | ns/op |
| SortBenchmark.measureCocktailSort | avgt | 5 | 69638390.145 | ±6755961.266 | ns/op |
| SortBenchmark.measureHeapSort | avgt | 5 | 681508.508 | ±32362.943 | ns/op |
| SortBenchmark.measureInsertSort | avgt | 5 | 7101094.840 | ±116747.237 | ns/op |
| SortBenchmark.measureMergeSortIteration | avgt | 5 | 19651963.054 | ±3605905.950 | ns/op |
| SortBenchmark.measureMergeSortRecursion |  avgt  | 5 | 20057776.819 | ±3738108.849 | ns/op |
| SortBenchmark.measureQuickSortIteration | avgt | 5 | 856202.341 | ±65503.979 | ns/op |
| SortBenchmark.measureQuickSortRecursion | avgt | 5 | 671481.969 | ±22097.596 | ns/op |
| SortBenchmark.measureSelectSort | avgt | 5 | 24514044.623 | ±2912413.417 | ns/op |
| SortBenchmark.measureShellSort | avgt | 5 | 851867.270 | ±55343.716 | ns/op |

当 Type=REVERSED, N=10000 时：

| Benchmark | Mode | Cnt | Score | Error | Units |
|:----:|:------:|:----:|:----:|:----:|:----:|
| SortBenchmark.measureBubbleSort | avgt | 5 | 94192774.283 | ±1359783.251 | ns/op |
| SortBenchmark.measureCocktailSort | avgt | 5 | 68637087.123 | ±477975.106 | ns/op |
| SortBenchmark.measureHeapSort | avgt | 5 | 675679.086 | ±13028.841 | ns/op |
| SortBenchmark.measureInsertSort | avgt | 5 | 6890268.438 | ±646662.028 | ns/op |
| SortBenchmark.measureMergeSortIteration | avgt | 5 | 19085000.919 | ±822251.654 | ns/op |
| SortBenchmark.measureMergeSortRecursion |  avgt  | 5 | 19512033.579 | ±2387702.787 | ns/op |
| SortBenchmark.measureQuickSortIteration | avgt | 5 | 860381.621 | ±23350.125 | ns/op |
| SortBenchmark.measureQuickSortRecursion | avgt | 5 | 683755.812 | ±18832.917 | ns/op |
| SortBenchmark.measureSelectSort | avgt | 5 | 23925266.046 | ±2203583.112 | ns/op |
| SortBenchmark.measureShellSort | avgt | 5 | 851318.322 | ±51979.006 | ns/op |
