package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3287bh0 extends com.google.android.gms.internal.ads.AbstractC4167jj0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.Object f34361C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f34362D = 2;

    protected AbstractC3287bh0() {
    }

    protected abstract java.lang.Object a();

    protected final java.lang.Object b() {
        this.f34362D = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.l(this.f34362D != 4);
        int i6 = this.f34362D;
        int i10 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        if (i10 == 0) {
            return true;
        }
        if (i10 != 2) {
            this.f34362D = 4;
            this.f34361C = a();
            if (this.f34362D != 3) {
                this.f34362D = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f34362D = 2;
        java.lang.Object obj = this.f34361C;
        this.f34361C = null;
        return obj;
    }
}
