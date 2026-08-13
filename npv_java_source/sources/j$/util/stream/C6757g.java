package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6757g implements java.util.stream.BaseStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.util.stream.InterfaceC6762h f48470a;

    private /* synthetic */ C6757g(j$.util.stream.InterfaceC6762h interfaceC6762h) {
        this.f48470a = interfaceC6762h;
    }

    public static /* synthetic */ java.util.stream.BaseStream w(j$.util.stream.InterfaceC6762h interfaceC6762h) {
        if (interfaceC6762h == null) {
            return null;
        }
        if (interfaceC6762h instanceof j$.util.stream.C6752f) {
            return ((j$.util.stream.C6752f) interfaceC6762h).f48445a;
        }
        if (interfaceC6762h instanceof j$.util.stream.F) {
            return j$.util.stream.E.w((j$.util.stream.F) interfaceC6762h);
        }
        if (interfaceC6762h instanceof j$.util.stream.IntStream) {
            return j$.util.stream.IntStream.Wrapper.convert((j$.util.stream.IntStream) interfaceC6762h);
        }
        if (interfaceC6762h instanceof j$.util.stream.InterfaceC6793n0) {
            return j$.util.stream.C6788m0.w((j$.util.stream.InterfaceC6793n0) interfaceC6762h);
        }
        return interfaceC6762h instanceof j$.util.stream.Stream ? j$.util.stream.Stream.Wrapper.convert((j$.util.stream.Stream) interfaceC6762h) : new j$.util.stream.C6757g(interfaceC6762h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws java.lang.Exception {
        this.f48470a.close();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.stream.InterfaceC6762h interfaceC6762h = this.f48470a;
        if (obj instanceof j$.util.stream.C6757g) {
            obj = ((j$.util.stream.C6757g) obj).f48470a;
        }
        return interfaceC6762h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f48470a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f48470a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.f48470a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
        return w(this.f48470a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return w(this.f48470a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return w(this.f48470a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(this.f48470a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return w(this.f48470a.unordered());
    }
}
