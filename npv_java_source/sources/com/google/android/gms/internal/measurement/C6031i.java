package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6031i implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f40969C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C6013g f40970D;

    C6031i(com.google.android.gms.internal.measurement.C6013g c6013g) {
        this.f40970D = c6013g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40969C < this.f40970D.N();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        if (this.f40969C < this.f40970D.N()) {
            com.google.android.gms.internal.measurement.C6013g c6013g = this.f40970D;
            int i6 = this.f40969C;
            this.f40969C = i6 + 1;
            return c6013g.C(i6);
        }
        throw new java.util.NoSuchElementException("Out of bounds index: " + this.f40969C);
    }
}
