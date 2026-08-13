package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6004f implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.util.Iterator f40935C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.util.Iterator f40936D;

    C6004f(com.google.android.gms.internal.measurement.C6013g c6013g, java.util.Iterator it, java.util.Iterator it2) {
        this.f40935C = it;
        this.f40936D = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f40935C.hasNext()) {
            return true;
        }
        return this.f40936D.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        if (this.f40935C.hasNext()) {
            return new com.google.android.gms.internal.measurement.C6133u(((java.lang.Integer) this.f40935C.next()).toString());
        }
        if (this.f40936D.hasNext()) {
            return new com.google.android.gms.internal.measurement.C6133u((java.lang.String) this.f40936D.next());
        }
        throw new java.util.NoSuchElementException();
    }
}
