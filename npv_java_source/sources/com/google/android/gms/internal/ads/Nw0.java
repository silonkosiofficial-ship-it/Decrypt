package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Nw0 extends com.google.android.gms.internal.ads.Lw0 {
    Nw0() {
    }

    @Override // com.google.android.gms.internal.ads.Lw0
    final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        com.google.android.gms.internal.ads.Jv0 jv0 = (com.google.android.gms.internal.ads.Jv0) obj;
        com.google.android.gms.internal.ads.Mw0 mw0 = jv0.zzt;
        if (mw0 != com.google.android.gms.internal.ads.Mw0.c()) {
            return mw0;
        }
        com.google.android.gms.internal.ads.Mw0 mw0F = com.google.android.gms.internal.ads.Mw0.f();
        jv0.zzt = mw0F;
        return mw0F;
    }

    @Override // com.google.android.gms.internal.ads.Lw0
    final /* synthetic */ java.lang.Object b() {
        return com.google.android.gms.internal.ads.Mw0.f();
    }

    @Override // com.google.android.gms.internal.ads.Lw0
    final /* synthetic */ java.lang.Object c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.Mw0 mw0 = (com.google.android.gms.internal.ads.Mw0) obj;
        mw0.h();
        return mw0;
    }

    @Override // com.google.android.gms.internal.ads.Lw0
    final /* bridge */ /* synthetic */ void d(java.lang.Object obj, int i6, int i10) {
        ((com.google.android.gms.internal.ads.Mw0) obj).j((i6 << 3) | 5, java.lang.Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.internal.ads.Lw0
    final /* bridge */ /* synthetic */ void e(java.lang.Object obj, int i6, long j6) {
        ((com.google.android.gms.internal.ads.Mw0) obj).j((i6 << 3) | 1, java.lang.Long.valueOf(j6));
    }

    @Override // com.google.android.gms.internal.ads.Lw0
    final /* bridge */ /* synthetic */ void f(java.lang.Object obj, int i6, java.lang.Object obj2) {
        ((com.google.android.gms.internal.ads.Mw0) obj).j((i6 << 3) | 3, (com.google.android.gms.internal.ads.Mw0) obj2);
    }

    @Override // com.google.android.gms.internal.ads.Lw0
    final /* bridge */ /* synthetic */ void g(java.lang.Object obj, int i6, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        ((com.google.android.gms.internal.ads.Mw0) obj).j((i6 << 3) | 2, abstractC3753fv0);
    }

    @Override // com.google.android.gms.internal.ads.Lw0
    final /* bridge */ /* synthetic */ void h(java.lang.Object obj, int i6, long j6) {
        ((com.google.android.gms.internal.ads.Mw0) obj).j(i6 << 3, java.lang.Long.valueOf(j6));
    }

    @Override // com.google.android.gms.internal.ads.Lw0
    final void i(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.Jv0) obj).zzt.h();
    }

    @Override // com.google.android.gms.internal.ads.Lw0
    final /* synthetic */ void j(java.lang.Object obj, java.lang.Object obj2) {
        ((com.google.android.gms.internal.ads.Jv0) obj).zzt = (com.google.android.gms.internal.ads.Mw0) obj2;
    }
}
