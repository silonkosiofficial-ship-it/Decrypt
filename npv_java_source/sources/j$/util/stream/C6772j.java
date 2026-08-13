package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6772j implements java.util.stream.Collector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.util.stream.Collector f48491a;

    private /* synthetic */ C6772j(j$.util.stream.Collector collector) {
        this.f48491a = collector;
    }

    public static /* synthetic */ java.util.stream.Collector a(j$.util.stream.Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof j$.util.stream.C6767i ? ((j$.util.stream.C6767i) collector).f48489a : new j$.util.stream.C6772j(collector);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ java.util.function.BiConsumer accumulator() {
        return this.f48491a.accumulator();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ java.util.Set characteristics() {
        return j$.util.stream.AbstractC6741c3.a(this.f48491a.characteristics());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ java.util.function.BinaryOperator combiner() {
        return this.f48491a.combiner();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.stream.Collector collector = this.f48491a;
        if (obj instanceof j$.util.stream.C6772j) {
            obj = ((j$.util.stream.C6772j) obj).f48491a;
        }
        return collector.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ java.util.function.Function finisher() {
        return this.f48491a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48491a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ java.util.function.Supplier supplier() {
        return this.f48491a.supplier();
    }
}
