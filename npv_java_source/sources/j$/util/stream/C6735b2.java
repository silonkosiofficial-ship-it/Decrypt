package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6735b2 extends j$.util.stream.AbstractC6747e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j$.util.stream.AbstractC6845y0 f48420h;

    C6735b2(j$.util.stream.C6735b2 c6735b2, j$.util.Spliterator spliterator) {
        super(c6735b2, spliterator);
        this.f48420h = c6735b2.f48420h;
    }

    C6735b2(j$.util.stream.AbstractC6845y0 abstractC6845y0, j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        super(abstractC6732b, spliterator);
        this.f48420h = abstractC6845y0;
    }

    @Override // j$.util.stream.AbstractC6747e
    protected final java.lang.Object a() {
        j$.util.stream.AbstractC6732b abstractC6732b = this.f48436a;
        j$.util.stream.U1 u1E0 = this.f48420h.e0();
        abstractC6732b.R(this.f48437b, u1E0);
        return u1E0;
    }

    @Override // j$.util.stream.AbstractC6747e
    protected final j$.util.stream.AbstractC6747e e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.C6735b2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC6747e, java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        j$.util.stream.AbstractC6747e abstractC6747e = this.f48439d;
        if (abstractC6747e != null) {
            j$.util.stream.U1 u6 = (j$.util.stream.U1) ((j$.util.stream.C6735b2) abstractC6747e).c();
            u6.f((j$.util.stream.U1) ((j$.util.stream.C6735b2) this.f48440e).c());
            f(u6);
        }
        super.onCompletion(countedCompleter);
    }
}
