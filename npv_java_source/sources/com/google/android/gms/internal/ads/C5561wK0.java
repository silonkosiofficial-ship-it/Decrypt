package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5561wK0 implements com.google.android.gms.internal.ads.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4530n f39579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5189t f39580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f39581c = new com.google.android.gms.internal.ads.C4682oK0().H();

    public C5561wK0(com.google.android.gms.internal.ads.C4530n c4530n, com.google.android.gms.internal.ads.C5189t c5189t) {
        this.f39579a = c4530n;
        this.f39580b = c5189t;
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void A(int i6) {
        this.f39579a.j(i6);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void F0(boolean z6) {
        this.f39579a.c(z6);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final boolean G0(boolean z6) {
        return this.f39579a.o(z6);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void H0(boolean z6) {
        if (z6) {
            this.f39579a.i();
        }
        this.f39580b.a();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void I0(int i6, com.google.android.gms.internal.ads.D d6) {
        com.google.android.gms.internal.ads.D d10 = this.f39581c;
        int i10 = d10.f26581v;
        int i11 = d6.f26581v;
        if (i11 != i10 || d6.f26582w != d10.f26582w) {
            this.f39580b.b(i11, d6.f26582w);
        }
        float f6 = d6.f26583x;
        if (f6 != this.f39581c.f26583x) {
            this.f39579a.l(f6);
        }
        this.f39581c = d6;
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void J0(long j6, long j10, long j11, long j12) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void K0(com.google.android.gms.internal.ads.InterfaceC4200k interfaceC4200k) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void L0(android.view.Surface surface, com.google.android.gms.internal.ads.UR ur) {
        this.f39579a.m(surface);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void M0(com.google.android.gms.internal.ads.D d6) {
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void N0(long j6, long j10) throws com.google.android.gms.internal.ads.K {
        try {
            this.f39580b.c(j6, j10);
        } catch (com.google.android.gms.internal.ads.Qz0 e6) {
            throw new com.google.android.gms.internal.ads.K(e6, this.f39581c);
        }
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void O0(boolean z6) {
        this.f39579a.e(z6);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void P0(java.util.List list) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final boolean Q0(long j6, boolean z6, long j10, long j11, com.google.android.gms.internal.ads.J j12) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void R0(com.google.android.gms.internal.ads.I i6, java.util.concurrent.Executor executor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final android.view.Surface a() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void b() {
        this.f39579a.m(null);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void c() {
        this.f39579a.b();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void g() {
        this.f39579a.d();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void j() {
        this.f39579a.g();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void k() {
        this.f39579a.h();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void l() {
    }

    @Override // com.google.android.gms.internal.ads.L
    public final boolean v() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void w0(float f6) {
        this.f39579a.n(f6);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final boolean z() {
        return true;
    }
}
