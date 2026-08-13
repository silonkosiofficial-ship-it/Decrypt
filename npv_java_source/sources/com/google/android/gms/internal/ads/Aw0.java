package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Aw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayDeque f25810a = new java.util.ArrayDeque();

    /* synthetic */ Aw0(com.google.android.gms.internal.ads.Cw0 cw0) {
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.AbstractC3753fv0 a(com.google.android.gms.internal.ads.Aw0 aw0, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv1) {
        aw0.b(abstractC3753fv0);
        aw0.b(abstractC3753fv1);
        com.google.android.gms.internal.ads.AbstractC3753fv0 dw0 = (com.google.android.gms.internal.ads.AbstractC3753fv0) aw0.f25810a.pop();
        while (!aw0.f25810a.isEmpty()) {
            dw0 = new com.google.android.gms.internal.ads.Dw0((com.google.android.gms.internal.ads.AbstractC3753fv0) aw0.f25810a.pop(), dw0);
        }
        return dw0;
    }

    private final void b(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        com.google.android.gms.internal.ads.Cw0 cw0;
        if (!abstractC3753fv0.w()) {
            if (!(abstractC3753fv0 instanceof com.google.android.gms.internal.ads.Dw0)) {
                throw new java.lang.IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(java.lang.String.valueOf(abstractC3753fv0.getClass())));
            }
            com.google.android.gms.internal.ads.Dw0 dw0 = (com.google.android.gms.internal.ads.Dw0) abstractC3753fv0;
            b(dw0.f26815F);
            b(dw0.f26816G);
            return;
        }
        int iC = c(abstractC3753fv0.n());
        java.util.ArrayDeque arrayDeque = this.f25810a;
        int iA0 = com.google.android.gms.internal.ads.Dw0.a0(iC + 1);
        if (arrayDeque.isEmpty() || ((com.google.android.gms.internal.ads.AbstractC3753fv0) this.f25810a.peek()).n() >= iA0) {
            this.f25810a.push(abstractC3753fv0);
            return;
        }
        int iA1 = com.google.android.gms.internal.ads.Dw0.a0(iC);
        com.google.android.gms.internal.ads.AbstractC3753fv0 dw1 = (com.google.android.gms.internal.ads.AbstractC3753fv0) this.f25810a.pop();
        while (true) {
            cw0 = null;
            if (this.f25810a.isEmpty() || ((com.google.android.gms.internal.ads.AbstractC3753fv0) this.f25810a.peek()).n() >= iA1) {
                break;
            } else {
                dw1 = new com.google.android.gms.internal.ads.Dw0((com.google.android.gms.internal.ads.AbstractC3753fv0) this.f25810a.pop(), dw1);
            }
        }
        com.google.android.gms.internal.ads.Dw0 dw2 = new com.google.android.gms.internal.ads.Dw0(dw1, abstractC3753fv0);
        while (!this.f25810a.isEmpty()) {
            int iC2 = c(dw2.n()) + 1;
            java.util.ArrayDeque arrayDeque2 = this.f25810a;
            if (((com.google.android.gms.internal.ads.AbstractC3753fv0) arrayDeque2.peek()).n() >= com.google.android.gms.internal.ads.Dw0.a0(iC2)) {
                break;
            } else {
                dw2 = new com.google.android.gms.internal.ads.Dw0((com.google.android.gms.internal.ads.AbstractC3753fv0) this.f25810a.pop(), dw2);
            }
        }
        this.f25810a.push(dw2);
    }

    private static final int c(int i6) {
        int iBinarySearch = java.util.Arrays.binarySearch(com.google.android.gms.internal.ads.Dw0.f26813J, i6);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
