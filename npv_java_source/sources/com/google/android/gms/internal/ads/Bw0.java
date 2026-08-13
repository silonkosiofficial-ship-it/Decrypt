package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Bw0 implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.ArrayDeque f26101C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC3315bv0 f26102D;

    /* synthetic */ Bw0(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.Cw0 cw0) {
        com.google.android.gms.internal.ads.AbstractC3315bv0 abstractC3315bv0C;
        if (abstractC3753fv0 instanceof com.google.android.gms.internal.ads.Dw0) {
            com.google.android.gms.internal.ads.Dw0 dw0 = (com.google.android.gms.internal.ads.Dw0) abstractC3753fv0;
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(dw0.s());
            this.f26101C = arrayDeque;
            arrayDeque.push(dw0);
            abstractC3315bv0C = c(dw0.f26815F);
        } else {
            this.f26101C = null;
            abstractC3315bv0C = (com.google.android.gms.internal.ads.AbstractC3315bv0) abstractC3753fv0;
        }
        this.f26102D = abstractC3315bv0C;
    }

    private final com.google.android.gms.internal.ads.AbstractC3315bv0 c(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        while (abstractC3753fv0 instanceof com.google.android.gms.internal.ads.Dw0) {
            com.google.android.gms.internal.ads.Dw0 dw0 = (com.google.android.gms.internal.ads.Dw0) abstractC3753fv0;
            this.f26101C.push(dw0);
            abstractC3753fv0 = dw0.f26815F;
        }
        return (com.google.android.gms.internal.ads.AbstractC3315bv0) abstractC3753fv0;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.AbstractC3315bv0 next() {
        com.google.android.gms.internal.ads.AbstractC3315bv0 abstractC3315bv0C;
        com.google.android.gms.internal.ads.AbstractC3315bv0 abstractC3315bv0 = this.f26102D;
        if (abstractC3315bv0 == null) {
            throw new java.util.NoSuchElementException();
        }
        do {
            java.util.ArrayDeque arrayDeque = this.f26101C;
            abstractC3315bv0C = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            abstractC3315bv0C = c(((com.google.android.gms.internal.ads.Dw0) this.f26101C.pop()).f26816G);
        } while (abstractC3315bv0C.n() == 0);
        this.f26102D = abstractC3315bv0C;
        return abstractC3315bv0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26102D != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
