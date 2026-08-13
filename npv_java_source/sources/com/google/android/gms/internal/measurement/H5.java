package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class H5 extends com.google.android.gms.internal.measurement.F5 {
    H5() {
    }

    private static void m(java.lang.Object obj, com.google.android.gms.internal.measurement.E5 e6) {
        ((com.google.android.gms.internal.measurement.AbstractC6130t4) obj).zzb = e6;
    }

    @Override // com.google.android.gms.internal.measurement.F5
    final /* synthetic */ int a(java.lang.Object obj) {
        return ((com.google.android.gms.internal.measurement.E5) obj).a();
    }

    @Override // com.google.android.gms.internal.measurement.F5
    final /* synthetic */ java.lang.Object b(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.E5 e6 = (com.google.android.gms.internal.measurement.E5) obj;
        com.google.android.gms.internal.measurement.E5 e10 = (com.google.android.gms.internal.measurement.E5) obj2;
        if (com.google.android.gms.internal.measurement.E5.k().equals(e10)) {
            return e6;
        }
        return com.google.android.gms.internal.measurement.E5.k().equals(e6) ? com.google.android.gms.internal.measurement.E5.c(e6, e10) : e6.b(e10);
    }

    @Override // com.google.android.gms.internal.measurement.F5
    final /* synthetic */ void c(java.lang.Object obj, int i6, com.google.android.gms.internal.measurement.L3 l6) {
        ((com.google.android.gms.internal.measurement.E5) obj).e((i6 << 3) | 2, l6);
    }

    @Override // com.google.android.gms.internal.measurement.F5
    final /* synthetic */ void d(java.lang.Object obj, com.google.android.gms.internal.measurement.X5 x6) {
        ((com.google.android.gms.internal.measurement.E5) obj).g(x6);
    }

    @Override // com.google.android.gms.internal.measurement.F5
    final /* synthetic */ int e(java.lang.Object obj) {
        return ((com.google.android.gms.internal.measurement.E5) obj).i();
    }

    @Override // com.google.android.gms.internal.measurement.F5
    final /* synthetic */ void f(java.lang.Object obj, int i6, long j6) {
        ((com.google.android.gms.internal.measurement.E5) obj).e(i6 << 3, java.lang.Long.valueOf(j6));
    }

    @Override // com.google.android.gms.internal.measurement.F5
    final /* synthetic */ void g(java.lang.Object obj, com.google.android.gms.internal.measurement.X5 x6) {
        ((com.google.android.gms.internal.measurement.E5) obj).j(x6);
    }

    @Override // com.google.android.gms.internal.measurement.F5
    final /* synthetic */ void h(java.lang.Object obj, java.lang.Object obj2) {
        m(obj, (com.google.android.gms.internal.measurement.E5) obj2);
    }

    @Override // com.google.android.gms.internal.measurement.F5
    final /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        com.google.android.gms.internal.measurement.E5 e6 = ((com.google.android.gms.internal.measurement.AbstractC6130t4) obj).zzb;
        if (e6 != com.google.android.gms.internal.measurement.E5.k()) {
            return e6;
        }
        com.google.android.gms.internal.measurement.E5 e5L = com.google.android.gms.internal.measurement.E5.l();
        m(obj, e5L);
        return e5L;
    }

    @Override // com.google.android.gms.internal.measurement.F5
    final /* synthetic */ void j(java.lang.Object obj, java.lang.Object obj2) {
        m(obj, (com.google.android.gms.internal.measurement.E5) obj2);
    }

    @Override // com.google.android.gms.internal.measurement.F5
    final /* synthetic */ java.lang.Object k(java.lang.Object obj) {
        return ((com.google.android.gms.internal.measurement.AbstractC6130t4) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.F5
    final void l(java.lang.Object obj) {
        ((com.google.android.gms.internal.measurement.AbstractC6130t4) obj).zzb.m();
    }
}
