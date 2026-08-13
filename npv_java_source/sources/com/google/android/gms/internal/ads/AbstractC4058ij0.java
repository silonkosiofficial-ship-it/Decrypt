package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ij0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC4058ij0 extends com.google.android.gms.internal.ads.AbstractC3949hj0 implements java.util.ListIterator {
    AbstractC4058ij0(java.util.ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((java.util.ListIterator) this.f36116C).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((java.util.ListIterator) this.f36116C).nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return b(((java.util.ListIterator) this.f36116C).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((java.util.ListIterator) this.f36116C).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
