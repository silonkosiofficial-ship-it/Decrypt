package j$.util;

/* JADX INFO: loaded from: classes4.dex */
final class h0 implements j$.util.N, java.util.function.LongConsumer, j$.util.InterfaceC6856x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f48153a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f48154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.a0 f48155c;

    h0(j$.util.a0 a0Var) {
        this.f48155c = a0Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f48153a = true;
        this.f48154b = j6;
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.N, java.util.Iterator, j$.util.InterfaceC6856x
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.LongConsumer) {
            forEachRemaining((java.util.function.LongConsumer) consumer);
            return;
        }
        j$.util.Objects.requireNonNull(consumer);
        if (j$.util.t0.f48607a) {
            j$.util.t0.a(j$.util.h0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        j$.util.Objects.requireNonNull(consumer);
        forEachRemaining((java.util.function.LongConsumer) new j$.util.K(consumer));
    }

    @Override // j$.util.O
    public final void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        j$.util.Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f48153a) {
            this.f48155c.tryAdvance((java.util.function.LongConsumer) this);
        }
        return this.f48153a;
    }

    @Override // java.util.Iterator
    public final java.lang.Long next() {
        if (!j$.util.t0.f48607a) {
            return java.lang.Long.valueOf(nextLong());
        }
        j$.util.t0.a(j$.util.h0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.N
    public final long nextLong() {
        if (!this.f48153a && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f48153a = false;
        return this.f48154b;
    }
}
