package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5070rv0 extends com.google.android.gms.internal.ads.Wu0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.logging.Logger f38574b = java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.AbstractC5070rv0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f38575c = com.google.android.gms.internal.ads.Sw0.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.google.android.gms.internal.ads.C5180sv0 f38576a;

    /* synthetic */ AbstractC5070rv0(com.google.android.gms.internal.ads.AbstractC4961qv0 abstractC4961qv0) {
    }

    static int B(int i6, com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0, com.google.android.gms.internal.ads.Ew0 ew0) {
        int iE = e(i6 << 3);
        return iE + iE + ((com.google.android.gms.internal.ads.Ou0) interfaceC4523mw0).f(ew0);
    }

    static int b(com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0, com.google.android.gms.internal.ads.Ew0 ew0) {
        int iF = ((com.google.android.gms.internal.ads.Ou0) interfaceC4523mw0).f(ew0);
        return e(iF) + iF;
    }

    static int c(int i6) {
        if (i6 > 4096) {
            return 4096;
        }
        return i6;
    }

    public static int d(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.ads.Xw0.e(str);
        } catch (com.google.android.gms.internal.ads.Ww0 unused) {
            length = str.getBytes(com.google.android.gms.internal.ads.Tv0.f32041a).length;
        }
        return e(length) + length;
    }

    public static int e(int i6) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i6) * 9)) >>> 6;
    }

    public static int f(long j6) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    public abstract void A(long j6);

    @Override // com.google.android.gms.internal.ads.Wu0
    public abstract void a(byte[] bArr, int i6, int i10);

    public final void g() {
        if (n() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void h(java.lang.String str, com.google.android.gms.internal.ads.Ww0 ww0) throws com.google.android.gms.internal.ads.C4741ov0 {
        f38574b.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) ww0);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.ads.Tv0.f32041a);
        try {
            int length = bytes.length;
            y(length);
            a(bytes, 0, length);
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new com.google.android.gms.internal.ads.C4741ov0(e6);
        }
    }

    public abstract void j();

    public abstract void k(byte b6);

    public abstract void l(int i6, boolean z6);

    public abstract void m(int i6, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0);

    public abstract int n();

    public abstract void o(int i6, int i10);

    public abstract void p(int i6);

    public abstract void q(int i6, long j6);

    public abstract void r(long j6);

    public abstract void s(int i6, int i10);

    public abstract void t(int i6);

    abstract void u(int i6, com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0, com.google.android.gms.internal.ads.Ew0 ew0);

    public abstract void v(int i6, java.lang.String str);

    public abstract void w(int i6, int i10);

    public abstract void x(int i6, int i10);

    public abstract void y(int i6);

    public abstract void z(int i6, long j6);
}
