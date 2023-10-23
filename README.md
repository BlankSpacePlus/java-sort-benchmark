# Java Basic Sort Algorithm Benchmark

## Sort Algorithm

Sort Algorithm Implements:
- **Insertion Sort**
    - [Insertion Sort](./src/main/java/com/blankspace/sort/InsertSort.java)
    - [Shell Sort](./src/main/java/com/blankspace/sort/ShellSort.java)
- **Swap Sort**
    - [Bubble Sort](./src/main/java/com/blankspace/sort/BubbleSort.java)
    - [Cocktail Sort](./src/main/java/com/blankspace/sort/CocktailSort.java)
    - Quick Sort
        - [Quick Sort Iteration](./src/main/java/com/blankspace/sort/QuickSortIteration.java)
        - [Quick Sort Recursion](./src/main/java/com/blankspace/sort/QuickSortRecursion.java)
- **Selection Sort**
    - [Selection Sort](./src/main/java/com/blankspace/sort/SelectSort.java)
    - [Heap Sort](./src/main/java/com/blankspace/sort/HeapSort.java)
- **Merge Sort**
    - [Merge Sort Iteration](./src/main/java/com/blankspace/sort/MergeSortIteration.java)
    - [Merge Sort Recursion](./src/main/java/com/blankspace/sort/MergeSortRecursion.java)

## Unit Test

JUnit 5 is the next generation of JUnit. The goal is to create an up-to-date foundation 
for developer-side testing on the JVM. This includes focusing on Java 8 and above, 
as well as enabling many different styles of testing.

Unit Test Cases:
- [SortFileUnitTest](./src/test/java/com/blankspace/sort/SortFileUnitTest.java)
- [SortRandomUnitTest](./src/test/java/com/blankspace/sort/SortRandomUnitTest.java)
- [SortReversedUnitTest](./src/test/java/com/blankspace/sort/SortReversedUnitTest.java)

## Performance Test

Java Microbenchmark Harness (JMH) is a Java harness for building, running,
and analysing nano/micro/milli/macro benchmarks written in Java and other languages targeting the JVM.

Performance Test Cases:
- [SortFileBenchmark](./src/test/java/com/blankspace/sort/SortFileBenchmark.java)
- [SortRandomBenchmark](./src/test/java/com/blankspace/sort/SortRandomBenchmark.java)
- [SortReversedBenchmark](./src/test/java/com/blankspace/sort/SortReversedBenchmark.java)

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

When Type=RANDOM, N=10000:

| Benchmark | Mode | Cnt | Score | Error | Units |
|:----:|:------:|:----:|:----:|:----:|:----:|
| SortBenchmark.measureBubbleSort | avgt | 5 | 94127074.206  | ±2173899.975  | ns/op |
| SortBenchmark.measureCocktailSort | avgt | 5 | 68573539.008 | ±269837.565 | ns/op |
| SortBenchmark.measureHeapSort | avgt | 5 | 679312.567 | ±9928.700 | ns/op |
| SortBenchmark.measureInsertSort | avgt | 5 | 6752120.169 | ±45460.916 | ns/op |
| SortBenchmark.measureJavaDefaultSort | avgt | 5 | 468236.536 | ±14154.103 | ns/op |
| SortBenchmark.measureMergeSortIteration | avgt | 5 | 17592360.341 | ±607935.037 | ns/op |
| SortBenchmark.measureMergeSortRecursion |  avgt  | 5 | 22307830.879 | ±21577221.818 | ns/op |
| SortBenchmark.measureQuickSortIteration | avgt | 5 | 835890.946 | ±19191.406 | ns/op |
| SortBenchmark.measureQuickSortRecursion | avgt | 5 | 655731.962 | ±25597.504 | ns/op |
| SortBenchmark.measureSelectSort | avgt | 5 | 22459961.269 | ±717506.946 | ns/op |
| SortBenchmark.measureShellSort | avgt | 5 | 819966.639 | ±12803.650 | ns/op |

When Type=REVERSED, N=10000:

| Benchmark | Mode | Cnt | Score | Error | Units |
|:----:|:------:|:----:|:----:|:----:|:----:|
| SortBenchmark.measureBubbleSort | avgt | 5 | 45237359.403 | ±1417096.120 | ns/op |
| SortBenchmark.measureCocktailSort | avgt | 5 | 41880277.654 | ±3168301.470 | ns/op |
| SortBenchmark.measureHeapSort | avgt | 5 | 514323.107 | ±5166.657 | ns/op |
| SortBenchmark.measureInsertSort | avgt | 5 | 16937990.382 | ±618037.770 | ns/op |
| SortBenchmark.measureJavaDefaultSort | avgt | 5 | 12987.115 | ±1009.301 | ns/op |
| SortBenchmark.measureMergeSortIteration | avgt | 5 | 17947855.026 | ±2229773.813 | ns/op |
| SortBenchmark.measureMergeSortRecursion |  avgt  | 5 | 17317912.328 | ±163597.070 | ns/op |
| SortBenchmark.measureQuickSortIteration | avgt | 5 | 22895040.760 | ±1789613.763 | ns/op |
| SortBenchmark.measureQuickSortRecursion | avgt | 5 | 30909357.729 | ±858055.756 | ns/op |
| SortBenchmark.measureSelectSort | avgt | 5 | 27990080.353 | ±187719.953 | ns/op |
| SortBenchmark.measureShellSort | avgt | 5 | 165787.850 | ±11341.027 | ns/op |

When Type=FILE, N=10000:

| Benchmark | Mode | Cnt | Score | Error | Units |
|:----:|:------:|:----:|:----:|:----:|:----:|
| SortBenchmark.measureBubbleSort | avgt | 5 | 101517210.598 | ±4184000.072 | ns/op |
| SortBenchmark.measureCocktailSort | avgt | 5 | 72955616.734 | ±4370608.464 | ns/op |
| SortBenchmark.measureHeapSort | avgt | 5 | 731554.410 | ±22606.707 | ns/op |
| SortBenchmark.measureInsertSort | avgt | 5 | 7208397.541 | ±1593978.129 | ns/op |
| SortBenchmark.measureJavaDefaultSort | avgt | 5 | 465073.960 | ±4382.688 | ns/op |
| SortBenchmark.measureMergeSortIteration | avgt | 5 | 22164818.724 | ±2369642.898 | ns/op |
| SortBenchmark.measureMergeSortRecursion |  avgt  | 5 | 26632735.366 | ±13367818.650 | ns/op |
| SortBenchmark.measureQuickSortIteration | avgt | 5 | 870865.233 | ±50262.306 | ns/op |
| SortBenchmark.measureQuickSortRecursion | avgt | 5 | 657857.885 | ±36181.707 | ns/op |
| SortBenchmark.measureSelectSort | avgt | 5 | 23125089.287 | ±206174.953 | ns/op |
| SortBenchmark.measureShellSort | avgt | 5 | 822260.179 | ±37967.009 | ns/op |
