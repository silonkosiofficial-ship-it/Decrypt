package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class H extends j$.util.stream.L implements j$.util.stream.InterfaceC6795n2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final j$.util.stream.G f48243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final j$.util.stream.G f48244d;

    static {
        j$.util.stream.EnumC6761g3 enumC6761g3 = j$.util.stream.EnumC6761g3.DOUBLE_VALUE;
        f48243c = new j$.util.stream.G(true, enumC6761g3, j$.util.C6858z.a(), new j$.util.stream.C6816s(1), new j$.util.stream.C6807q(4));
        f48244d = new j$.util.stream.G(false, enumC6761g3, j$.util.C6858z.a(), new j$.util.stream.C6816s(1), new j$.util.stream.C6807q(4));
    }

    @Override // j$.util.stream.L, j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) {
        o(java.lang.Double.valueOf(d6));
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        if (this.f48275a) {
            return j$.util.C6858z.d(((java.lang.Double) this.f48276b).doubleValue());
        }
        return null;
    }
}
