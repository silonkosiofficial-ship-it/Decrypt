package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Lw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f29596a = 100;

    Lw0() {
    }

    abstract java.lang.Object a(java.lang.Object obj);

    abstract java.lang.Object b();

    abstract java.lang.Object c(java.lang.Object obj);

    abstract void d(java.lang.Object obj, int i6, int i10);

    abstract void e(java.lang.Object obj, int i6, long j6);

    abstract void f(java.lang.Object obj, int i6, java.lang.Object obj2);

    abstract void g(java.lang.Object obj, int i6, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0);

    abstract void h(java.lang.Object obj, int i6, long j6);

    abstract void i(java.lang.Object obj);

    abstract void j(java.lang.Object obj, java.lang.Object obj2);

    final boolean k(java.lang.Object obj, com.google.android.gms.internal.ads.InterfaceC5842yw0 interfaceC5842yw0, int i6) throws com.google.android.gms.internal.ads.Vv0 {
        int iF = interfaceC5842yw0.f();
        int i10 = iF >>> 3;
        int i11 = iF & 7;
        if (i11 == 0) {
            h(obj, i10, interfaceC5842yw0.l());
            return true;
        }
        if (i11 == 1) {
            e(obj, i10, interfaceC5842yw0.k());
            return true;
        }
        if (i11 == 2) {
            g(obj, i10, interfaceC5842yw0.q());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
            }
            d(obj, i10, interfaceC5842yw0.e());
            return true;
        }
        java.lang.Object objB = b();
        int i12 = i10 << 3;
        int i13 = i6 + 1;
        if (i13 >= f29596a) {
            throw new com.google.android.gms.internal.ads.Vv0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (interfaceC5842yw0.c() != Integer.MAX_VALUE && k(objB, interfaceC5842yw0, i13)) {
        }
        if ((i12 | 4) != interfaceC5842yw0.f()) {
            throw new com.google.android.gms.internal.ads.Vv0("Protocol message end-group tag did not match expected tag.");
        }
        f(obj, i10, c(objB));
        return true;
    }
}
