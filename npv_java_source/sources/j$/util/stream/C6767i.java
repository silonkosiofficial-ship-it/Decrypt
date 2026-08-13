package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6767i implements j$.util.stream.Collector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.Collector f48489a;

    private /* synthetic */ C6767i(java.util.stream.Collector collector) {
        this.f48489a = collector;
    }

    public static /* synthetic */ j$.util.stream.Collector a(java.util.stream.Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof j$.util.stream.C6772j ? ((j$.util.stream.C6772j) collector).f48491a : new j$.util.stream.C6767i(collector);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ java.util.function.BiConsumer accumulator() {
        return this.f48489a.accumulator();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ java.util.Set characteristics() {
        return j$.util.stream.AbstractC6741c3.a(this.f48489a.characteristics());
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ java.util.function.BinaryOperator combiner() {
        return this.f48489a.combiner();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.stream.Collector collector = this.f48489a;
        if (obj instanceof j$.util.stream.C6767i) {
            obj = ((j$.util.stream.C6767i) obj).f48489a;
        }
        return collector.equals(obj);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ java.util.function.Function finisher() {
        return this.f48489a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48489a.hashCode();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ java.util.function.Supplier supplier() {
        return this.f48489a.supplier();
    }
}
