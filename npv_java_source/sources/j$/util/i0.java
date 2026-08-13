package j$.util;

/* JADX INFO: loaded from: classes4.dex */
final class i0 implements j$.util.F, java.util.function.DoubleConsumer, j$.util.InterfaceC6856x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f48156a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f48157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.U f48158c;

    i0(j$.util.U u6) {
        this.f48158c = u6;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d6) {
        this.f48156a = true;
        this.f48157b = d6;
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.F, java.util.Iterator, j$.util.InterfaceC6856x
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.DoubleConsumer) {
            forEachRemaining((java.util.function.DoubleConsumer) consumer);
            return;
        }
        j$.util.Objects.requireNonNull(consumer);
        if (j$.util.t0.f48607a) {
            j$.util.t0.a(j$.util.i0.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        j$.util.Objects.requireNonNull(consumer);
        forEachRemaining((java.util.function.DoubleConsumer) new j$.util.C(consumer));
    }

    @Override // j$.util.O
    public final void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        j$.util.Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f48156a) {
            this.f48158c.tryAdvance((java.util.function.DoubleConsumer) this);
        }
        return this.f48156a;
    }

    @Override // java.util.Iterator
    public final java.lang.Double next() {
        if (!j$.util.t0.f48607a) {
            return java.lang.Double.valueOf(nextDouble());
        }
        j$.util.t0.a(j$.util.i0.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override // j$.util.F
    public final double nextDouble() {
        if (!this.f48156a && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f48156a = false;
        return this.f48157b;
    }
}
