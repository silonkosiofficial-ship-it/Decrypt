package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class O3 extends com.google.android.gms.internal.measurement.Q3 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f40629C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f40630D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.L3 f40631E;

    O3(com.google.android.gms.internal.measurement.L3 l6) {
        this.f40631E = l6;
        this.f40630D = l6.E();
    }

    @Override // com.google.android.gms.internal.measurement.R3
    public final byte a() {
        int i6 = this.f40629C;
        if (i6 >= this.f40630D) {
            throw new java.util.NoSuchElementException();
        }
        this.f40629C = i6 + 1;
        return this.f40631E.D(i6);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40629C < this.f40630D;
    }
}
