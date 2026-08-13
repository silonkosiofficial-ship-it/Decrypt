package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6312w extends com.google.android.gms.internal.play_billing.O0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f41665C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f41666D;

    protected AbstractC6312w(int i6, int i10) {
        com.google.android.gms.internal.play_billing.AbstractC6294t.b(i10, i6, "index");
        this.f41665C = i6;
        this.f41666D = i10;
    }

    protected abstract java.lang.Object b(int i6);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f41666D < this.f41665C;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f41666D > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i6 = this.f41666D;
        this.f41666D = i6 + 1;
        return b(i6);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f41666D;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i6 = this.f41666D - 1;
        this.f41666D = i6;
        return b(i6);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f41666D - 1;
    }
}
