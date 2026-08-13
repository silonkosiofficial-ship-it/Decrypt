package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6841x0 extends j$.util.stream.AbstractC6737c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j$.util.stream.C6837w0 f48585j;

    C6841x0(j$.util.stream.C6837w0 c6837w0, j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        super(abstractC6732b, spliterator);
        this.f48585j = c6837w0;
    }

    C6841x0(j$.util.stream.C6841x0 c6841x0, j$.util.Spliterator spliterator) {
        super(c6841x0, spliterator);
        this.f48585j = c6841x0.f48585j;
    }

    @Override // j$.util.stream.AbstractC6747e
    protected final java.lang.Object a() {
        j$.util.stream.AbstractC6732b abstractC6732b = this.f48436a;
        j$.util.stream.AbstractC6827u0 abstractC6827u0 = (j$.util.stream.AbstractC6827u0) this.f48585j.f48574b.get();
        abstractC6732b.R(this.f48437b, abstractC6827u0);
        boolean z6 = abstractC6827u0.f48559b;
        if (z6 == this.f48585j.f48573a.f48567b) {
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z6);
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f48422h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC6747e
    protected final j$.util.stream.AbstractC6747e e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.C6841x0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC6737c
    protected final java.lang.Object j() {
        return java.lang.Boolean.valueOf(!this.f48585j.f48573a.f48567b);
    }
}
