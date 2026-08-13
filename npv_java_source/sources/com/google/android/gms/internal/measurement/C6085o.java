package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6085o implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.util.Iterator f41119C;

    C6085o(java.util.Iterator it) {
        this.f41119C = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41119C.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return new com.google.android.gms.internal.measurement.C6133u((java.lang.String) this.f41119C.next());
    }
}
