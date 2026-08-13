package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3949hj0 implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.Iterator f36116C;

    AbstractC3949hj0(java.util.Iterator it) {
        it.getClass();
        this.f36116C = it;
    }

    abstract java.lang.Object b(java.lang.Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36116C.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return b(this.f36116C.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f36116C.remove();
    }
}
