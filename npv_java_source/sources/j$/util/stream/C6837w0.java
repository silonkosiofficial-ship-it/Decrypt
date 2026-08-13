package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6837w0 implements j$.util.stream.L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final j$.util.stream.EnumC6832v0 f48573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.function.Supplier f48574b;

    C6837w0(j$.util.stream.EnumC6761g3 enumC6761g3, j$.util.stream.EnumC6832v0 enumC6832v0, java.util.function.Supplier supplier) {
        this.f48573a = enumC6832v0;
        this.f48574b = supplier;
    }

    @Override // j$.util.stream.L3
    public final java.lang.Object b(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        j$.util.stream.AbstractC6827u0 abstractC6827u0 = (j$.util.stream.AbstractC6827u0) this.f48574b.get();
        abstractC6732b.R(spliterator, abstractC6827u0);
        return java.lang.Boolean.valueOf(abstractC6827u0.f48559b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.L3
    public final java.lang.Object c(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        return (java.lang.Boolean) new j$.util.stream.C6841x0(this, abstractC6732b, spliterator).invoke();
    }

    @Override // j$.util.stream.L3
    public final int d() {
        return j$.util.stream.EnumC6756f3.f48463u | j$.util.stream.EnumC6756f3.f48460r;
    }
}
