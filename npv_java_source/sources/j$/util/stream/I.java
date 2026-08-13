package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class I extends j$.util.stream.L implements j$.util.stream.InterfaceC6800o2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final j$.util.stream.G f48255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final j$.util.stream.G f48256d;

    static {
        j$.util.stream.EnumC6761g3 enumC6761g3 = j$.util.stream.EnumC6761g3.INT_VALUE;
        f48255c = new j$.util.stream.G(true, enumC6761g3, j$.util.A.a(), new j$.util.stream.C6816s(2), new j$.util.stream.C6807q(5));
        f48256d = new j$.util.stream.G(false, enumC6761g3, j$.util.A.a(), new j$.util.stream.C6816s(2), new j$.util.stream.C6807q(5));
    }

    @Override // j$.util.stream.L, j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) {
        o(java.lang.Integer.valueOf(i6));
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        if (this.f48275a) {
            return j$.util.A.d(((java.lang.Integer) this.f48276b).intValue());
        }
        return null;
    }
}
