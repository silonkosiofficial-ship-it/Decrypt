package j$.util;

/* JADX INFO: loaded from: classes4.dex */
final class f0 implements java.util.Iterator, java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f48124a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    java.lang.Object f48125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.Spliterator f48126c;

    f0(j$.util.Spliterator spliterator) {
        this.f48126c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.f48124a = true;
        this.f48125b = obj;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f48124a) {
            this.f48126c.tryAdvance(this);
        }
        return this.f48124a;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.f48124a && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f48124a = false;
        return this.f48125b;
    }
}
