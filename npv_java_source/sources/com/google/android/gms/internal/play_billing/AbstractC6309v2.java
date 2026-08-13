package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6309v2 extends com.google.android.gms.internal.play_billing.AbstractC6220g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.logging.Logger f41660b = java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.AbstractC6309v2.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f41661c = com.google.android.gms.internal.play_billing.G3.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.google.android.gms.internal.play_billing.C6315w2 f41662a;

    /* synthetic */ AbstractC6309v2(com.google.android.gms.internal.play_billing.AbstractC6303u2 abstractC6303u2) {
    }

    public static int a(long j6) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    static int w(int i6, com.google.android.gms.internal.play_billing.InterfaceC6233i3 interfaceC6233i3, com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3) {
        int iZ = z(i6 << 3);
        return iZ + iZ + ((com.google.android.gms.internal.play_billing.Z1) interfaceC6233i3).b(interfaceC6298t3);
    }

    static int x(com.google.android.gms.internal.play_billing.InterfaceC6233i3 interfaceC6233i3, com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3) {
        int iB = ((com.google.android.gms.internal.play_billing.Z1) interfaceC6233i3).b(interfaceC6298t3);
        return z(iB) + iB;
    }

    public static int y(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.play_billing.J3.c(str);
        } catch (com.google.android.gms.internal.play_billing.I3 unused) {
            length = str.getBytes(com.google.android.gms.internal.play_billing.Q2.f41448a).length;
        }
        return z(length) + length;
    }

    public static int z(int i6) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i6) * 9)) >>> 6;
    }

    public final void b() {
        if (e() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void c(java.lang.String str, com.google.android.gms.internal.play_billing.I3 i6) throws com.google.android.gms.internal.play_billing.C6297t2 {
        f41660b.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) i6);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.play_billing.Q2.f41448a);
        try {
            int length = bytes.length;
            t(length);
            o(bytes, 0, length);
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new com.google.android.gms.internal.play_billing.C6297t2(e6);
        }
    }

    public abstract int e();

    public abstract void f(byte b6);

    public abstract void g(int i6, boolean z6);

    public abstract void h(int i6, com.google.android.gms.internal.play_billing.AbstractC6268o2 abstractC6268o2);

    public abstract void i(int i6, int i10);

    public abstract void j(int i6);

    public abstract void k(int i6, long j6);

    public abstract void l(long j6);

    public abstract void m(int i6, int i10);

    public abstract void n(int i6);

    public abstract void o(byte[] bArr, int i6, int i10);

    abstract void p(int i6, com.google.android.gms.internal.play_billing.InterfaceC6233i3 interfaceC6233i3, com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3);

    public abstract void q(int i6, java.lang.String str);

    public abstract void r(int i6, int i10);

    public abstract void s(int i6, int i10);

    public abstract void t(int i6);

    public abstract void u(int i6, long j6);

    public abstract void v(long j6);
}
