package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6777k implements j$.util.stream.Collector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.function.Supplier f48495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.function.BiConsumer f48496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.function.BinaryOperator f48497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.function.Function f48498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Set f48499e;

    C6777k(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BinaryOperator binaryOperator, java.util.function.Function function, java.util.Set set) {
        this.f48495a = supplier;
        this.f48496b = biConsumer;
        this.f48497c = binaryOperator;
        this.f48498d = function;
        this.f48499e = set;
    }

    @Override // j$.util.stream.Collector
    public final java.util.function.BiConsumer accumulator() {
        return this.f48496b;
    }

    @Override // j$.util.stream.Collector
    public final java.util.Set characteristics() {
        return this.f48499e;
    }

    @Override // j$.util.stream.Collector
    public final java.util.function.BinaryOperator combiner() {
        return this.f48497c;
    }

    @Override // j$.util.stream.Collector
    public final java.util.function.Function finisher() {
        return this.f48498d;
    }

    @Override // j$.util.stream.Collector
    public final java.util.function.Supplier supplier() {
        return this.f48495a;
    }
}
