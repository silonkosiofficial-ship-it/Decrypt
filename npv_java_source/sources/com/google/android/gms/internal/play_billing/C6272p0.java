package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6272p0 extends com.google.android.gms.internal.play_billing.N0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f41609C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f41610D;

    C6272p0(java.lang.Object obj) {
        this.f41609C = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f41610D;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f41610D) {
            throw new java.util.NoSuchElementException();
        }
        this.f41610D = true;
        return this.f41609C;
    }
}
