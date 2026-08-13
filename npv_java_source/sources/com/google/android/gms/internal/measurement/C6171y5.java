package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6171y5 implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f41305C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f41306D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.util.Iterator f41307E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.AbstractC6108q5 f41308F;

    private C6171y5(com.google.android.gms.internal.measurement.AbstractC6108q5 abstractC6108q5) {
        this.f41308F = abstractC6108q5;
        this.f41305C = -1;
    }

    private final java.util.Iterator b() {
        if (this.f41307E == null) {
            this.f41307E = this.f41308F.f41155E.entrySet().iterator();
        }
        return this.f41307E;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41305C + 1 < this.f41308F.f41154D || (!this.f41308F.f41155E.isEmpty() && b().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        this.f41306D = true;
        int i6 = this.f41305C + 1;
        this.f41305C = i6;
        return i6 < this.f41308F.f41154D ? (com.google.android.gms.internal.measurement.C6139u5) this.f41308F.f41153C[this.f41305C] : (java.util.Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f41306D) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.f41306D = false;
        this.f41308F.s();
        if (this.f41305C >= this.f41308F.f41154D) {
            b().remove();
            return;
        }
        com.google.android.gms.internal.measurement.AbstractC6108q5 abstractC6108q5 = this.f41308F;
        int i6 = this.f41305C;
        this.f41305C = i6 - 1;
        abstractC6108q5.h(i6);
    }
}
