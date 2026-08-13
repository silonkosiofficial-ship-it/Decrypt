package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Q0 implements java.util.function.LongFunction, java.util.function.IntFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.function.IntFunction f48317a;

    @Override // java.util.function.IntFunction
    public java.lang.Object apply(int i6) {
        java.lang.Object objApply = this.f48317a.apply(i6);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.IntStream) {
            return j$.util.stream.IntStream.Wrapper.convert((j$.util.stream.IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return j$.util.stream.IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        j$.util.C6713e.a("java.util.stream.IntStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public java.lang.Object apply(long j6) {
        return j$.util.stream.AbstractC6845y0.D(j6, this.f48317a);
    }
}
