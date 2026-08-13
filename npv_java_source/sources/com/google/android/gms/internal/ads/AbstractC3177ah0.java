package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ah0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3177ah0 extends com.google.android.gms.internal.ads.AbstractC4277kj0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f34125C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f34126D;

    protected AbstractC3177ah0(int i6, int i10) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.b(i10, i6, "index");
        this.f34125C = i6;
        this.f34126D = i10;
    }

    protected abstract java.lang.Object b(int i6);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f34126D < this.f34125C;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f34126D > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i6 = this.f34126D;
        this.f34126D = i6 + 1;
        return b(i6);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f34126D;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i6 = this.f34126D - 1;
        this.f34126D = i6;
        return b(i6);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f34126D - 1;
    }
}
