package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6752f implements j$.util.stream.InterfaceC6762h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.BaseStream f48445a;

    private /* synthetic */ C6752f(java.util.stream.BaseStream baseStream) {
        this.f48445a = baseStream;
    }

    public static /* synthetic */ j$.util.stream.InterfaceC6762h w(java.util.stream.BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        if (baseStream instanceof j$.util.stream.C6757g) {
            return ((j$.util.stream.C6757g) baseStream).f48470a;
        }
        if (baseStream instanceof java.util.stream.DoubleStream) {
            return j$.util.stream.D.w((java.util.stream.DoubleStream) baseStream);
        }
        if (baseStream instanceof java.util.stream.IntStream) {
            return j$.util.stream.IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream);
        }
        if (baseStream instanceof java.util.stream.LongStream) {
            return j$.util.stream.C6783l0.w((java.util.stream.LongStream) baseStream);
        }
        return baseStream instanceof java.util.stream.Stream ? j$.util.stream.C6736b3.w((java.util.stream.Stream) baseStream) : new j$.util.stream.C6752f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f48445a.close();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.stream.BaseStream baseStream = this.f48445a;
        if (obj instanceof j$.util.stream.C6752f) {
            obj = ((j$.util.stream.C6752f) obj).f48445a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48445a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ boolean isParallel() {
        return this.f48445a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.f48445a.iterator();
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.stream.InterfaceC6762h onClose(java.lang.Runnable runnable) {
        return w(this.f48445a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ j$.util.stream.InterfaceC6762h parallel() {
        return w(this.f48445a.parallel());
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* synthetic */ j$.util.stream.InterfaceC6762h sequential() {
        return w(this.f48445a.sequential());
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.e0.a(this.f48445a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final /* synthetic */ j$.util.stream.InterfaceC6762h unordered() {
        return w(this.f48445a.unordered());
    }
}
