package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class H1 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f27950a = new com.google.android.gms.internal.ads.C5128sR(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.V0 f27951b = new com.google.android.gms.internal.ads.V0(-1, -1, "image/heif");

    private final boolean a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, int i6) {
        this.f27950a.i(4);
        ((com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0).L(this.f27950a.n(), 0, 4, false);
        return this.f27950a.K() == ((long) i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        this.f27951b.e(j6, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) {
        return this.f27951b.i(interfaceC5300u0, q6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws java.io.EOFException, java.io.InterruptedIOException {
        ((com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0).g(4, false);
        return a(interfaceC5300u0, 1718909296) && a(interfaceC5300u0, 1751476579);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f27951b.k(interfaceC5520w0);
    }
}
