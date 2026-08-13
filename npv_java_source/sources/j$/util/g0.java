package j$.util;

/* JADX INFO: loaded from: classes4.dex */
final class g0 implements j$.util.J, java.util.function.IntConsumer, j$.util.InterfaceC6856x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f48145a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f48146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.X f48147c;

    g0(j$.util.X x6) {
        this.f48147c = x6;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        this.f48145a = true;
        this.f48146b = i6;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.J, java.util.Iterator, j$.util.InterfaceC6856x
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.IntConsumer) {
            forEachRemaining((java.util.function.IntConsumer) consumer);
            return;
        }
        j$.util.Objects.requireNonNull(consumer);
        if (j$.util.t0.f48607a) {
            j$.util.t0.a(j$.util.g0.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        j$.util.Objects.requireNonNull(consumer);
        forEachRemaining((java.util.function.IntConsumer) new j$.util.G(consumer));
    }

    @Override // j$.util.O
    public final void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        j$.util.Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f48145a) {
            this.f48147c.tryAdvance((java.util.function.IntConsumer) this);
        }
        return this.f48145a;
    }

    @Override // java.util.Iterator
    public final java.lang.Integer next() {
        if (!j$.util.t0.f48607a) {
            return java.lang.Integer.valueOf(nextInt());
        }
        j$.util.t0.a(j$.util.g0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // j$.util.J
    public final int nextInt() {
        if (!this.f48145a && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f48145a = false;
        return this.f48146b;
    }
}
