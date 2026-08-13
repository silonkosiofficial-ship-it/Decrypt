package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3613eg0 implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.Object f35034C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f35035D = 2;

    protected AbstractC3613eg0() {
    }

    protected abstract java.lang.Object a();

    protected final java.lang.Object b() {
        this.f35035D = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.l(this.f35035D != 4);
        int i6 = this.f35035D;
        int i10 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        if (i10 == 0) {
            return true;
        }
        if (i10 != 2) {
            this.f35035D = 4;
            this.f35034C = a();
            if (this.f35035D != 3) {
                this.f35035D = 1;
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
        this.f35035D = 2;
        java.lang.Object obj = this.f35034C;
        this.f35034C = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
