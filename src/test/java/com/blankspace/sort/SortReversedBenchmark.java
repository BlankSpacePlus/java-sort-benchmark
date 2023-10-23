package com.blankspace.sort;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import com.blankspace.sort.util.DataGenerator;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class SortReversedBenchmark {

    private int[] records;

    @Setup(value = Level.Invocation)
    public void setUpInvocation() {
        this.records = DataGenerator.getReversedRecords();
    }

    @Benchmark
    public void measureBubbleSort(Blackhole blackhole) {
        int[] bubbleRecords = Arrays.copyOf(records, records.length);
        blackhole.consume(new BubbleSort().sort(bubbleRecords));
    }

    @Benchmark
    public void measureCocktailSort(Blackhole blackhole) {
        int[] cocktailRecords = Arrays.copyOf(records, records.length);
        blackhole.consume(new CocktailSort().sort(cocktailRecords));
    }

    @Benchmark
    public void measureHeapSort(Blackhole blackhole) {
        int[] heapRecords = Arrays.copyOf(records, records.length);
        blackhole.consume(new HeapSort().sort(heapRecords));
    }

    @Benchmark
    public void measureInsertSort(Blackhole blackhole) {
        int[] insertRecords = Arrays.copyOf(records, records.length);
        blackhole.consume(new InsertSort().sort(insertRecords));
    }

    @Benchmark
    public void measureMergeSortIteration(Blackhole blackhole) {
        int[] mergeRecords = Arrays.copyOf(records, records.length);
        blackhole.consume(new MergeSortIteration().sort(mergeRecords));
    }

    @Benchmark
    public void measureMergeSortRecursion(Blackhole blackhole) {
        int[] mergeRecords = Arrays.copyOf(records, records.length);
        blackhole.consume(new MergeSortRecursion().sort(mergeRecords));
    }

    @Benchmark
    public void measureQuickSortIteration(Blackhole blackhole) {
        int[] quickRecords = Arrays.copyOf(records, records.length);
        blackhole.consume(new QuickSortIteration().sort(quickRecords));
    }

    @Benchmark
    public void measureQuickSortRecursion(Blackhole blackhole) {
        int[] quickRecords = Arrays.copyOf(records, records.length);
        blackhole.consume(new QuickSortRecursion().sort(quickRecords));
    }

    @Benchmark
    public void measureSelectSort(Blackhole blackhole) {
        int[] selectRecords = Arrays.copyOf(records, records.length);
        blackhole.consume(new SelectSort().sort(selectRecords));
    }

    @Benchmark
    public void measureShellSort(Blackhole blackhole) {
        int[] shellRecords = Arrays.copyOf(records, records.length);
        blackhole.consume(new ShellSort().sort(shellRecords));
    }

    @Benchmark
    public void measureJavaDefaultSort(Blackhole blackhole) {
        int[] defaultRecords = Arrays.copyOf(records, records.length);
        Arrays.sort(defaultRecords);
        blackhole.consume(defaultRecords);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(SortReversedBenchmark.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .build();
        new Runner(opt).run();
    }

}
