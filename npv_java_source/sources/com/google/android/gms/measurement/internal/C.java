package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class C implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.util.Iterator f41741C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.D f41742D;

    C(com.google.android.gms.measurement.internal.D d6) {
        this.f41742D = d6;
        this.f41741C = d6.f41750C.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41741C.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return (java.lang.String) this.f41741C.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Remove not supported");
    }
}
