package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class J extends j$.util.stream.L implements j$.util.stream.InterfaceC6805p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final j$.util.stream.G f48263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final j$.util.stream.G f48264d;

    static {
        j$.util.stream.EnumC6761g3 enumC6761g3 = j$.util.stream.EnumC6761g3.LONG_VALUE;
        f48263c = new j$.util.stream.G(true, enumC6761g3, j$.util.B.a(), new j$.util.stream.C6816s(3), new j$.util.stream.C6807q(6));
        f48264d = new j$.util.stream.G(false, enumC6761g3, j$.util.B.a(), new j$.util.stream.C6816s(3), new j$.util.stream.C6807q(6));
    }

    @Override // j$.util.stream.L, j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        o(java.lang.Long.valueOf(j6));
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        if (this.f48275a) {
            return j$.util.B.d(((java.lang.Long) this.f48276b).longValue());
        }
        return null;
    }
}
