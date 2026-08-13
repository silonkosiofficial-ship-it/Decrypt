package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6123s5 implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f41197C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.util.Iterator f41198D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.AbstractC6108q5 f41199E;

    private C6123s5(com.google.android.gms.internal.measurement.AbstractC6108q5 abstractC6108q5) {
        this.f41199E = abstractC6108q5;
        this.f41197C = abstractC6108q5.f41154D;
    }

    private final java.util.Iterator b() {
        if (this.f41198D == null) {
            this.f41198D = this.f41199E.f41158H.entrySet().iterator();
        }
        return this.f41198D;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6 = this.f41197C;
        return (i6 > 0 && i6 <= this.f41199E.f41154D) || b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        if (b().hasNext()) {
            return (java.util.Map.Entry) b().next();
        }
        java.lang.Object[] objArr = this.f41199E.f41153C;
        int i6 = this.f41197C - 1;
        this.f41197C = i6;
        return (com.google.android.gms.internal.measurement.C6139u5) objArr[i6];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
