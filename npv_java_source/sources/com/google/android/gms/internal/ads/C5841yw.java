package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5841yw implements com.google.android.gms.internal.ads.InterfaceC2954Vu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f40168c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f40169d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2809Rt f40170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2809Rt f40171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2809Rt f40172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2809Rt f40173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f40174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3027Xv f40175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private java.nio.ByteBuffer f40176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private java.nio.ShortBuffer f40177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private java.nio.ByteBuffer f40178m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f40179n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f40180o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f40181p;

    public C5841yw() {
        com.google.android.gms.internal.ads.C2809Rt c2809Rt = com.google.android.gms.internal.ads.C2809Rt.f31383e;
        this.f40170e = c2809Rt;
        this.f40171f = c2809Rt;
        this.f40172g = c2809Rt;
        this.f40173h = c2809Rt;
        java.nio.ByteBuffer byteBuffer = com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a;
        this.f40176k = byteBuffer;
        this.f40177l = byteBuffer.asShortBuffer();
        this.f40178m = byteBuffer;
        this.f40167b = -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final void a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            com.google.android.gms.internal.ads.C3027Xv c3027Xv = this.f40175j;
            c3027Xv.getClass();
            java.nio.ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f40179n += (long) iRemaining;
            c3027Xv.f(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final java.nio.ByteBuffer b() {
        int iA;
        com.google.android.gms.internal.ads.C3027Xv c3027Xv = this.f40175j;
        if (c3027Xv != null && (iA = c3027Xv.a()) > 0) {
            if (this.f40176k.capacity() < iA) {
                java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocateDirect(iA).order(java.nio.ByteOrder.nativeOrder());
                this.f40176k = byteBufferOrder;
                this.f40177l = byteBufferOrder.asShortBuffer();
            } else {
                this.f40176k.clear();
                this.f40177l.clear();
            }
            c3027Xv.d(this.f40177l);
            this.f40180o += (long) iA;
            this.f40176k.limit(iA);
            this.f40178m = this.f40176k;
        }
        java.nio.ByteBuffer byteBuffer = this.f40178m;
        this.f40178m = com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final void c() {
        if (i()) {
            com.google.android.gms.internal.ads.C2809Rt c2809Rt = this.f40170e;
            this.f40172g = c2809Rt;
            com.google.android.gms.internal.ads.C2809Rt c2809Rt2 = this.f40171f;
            this.f40173h = c2809Rt2;
            if (this.f40174i) {
                this.f40175j = new com.google.android.gms.internal.ads.C3027Xv(c2809Rt.f31384a, c2809Rt.f31385b, this.f40168c, this.f40169d, c2809Rt2.f31384a);
            } else {
                com.google.android.gms.internal.ads.C3027Xv c3027Xv = this.f40175j;
                if (c3027Xv != null) {
                    c3027Xv.c();
                }
            }
        }
        this.f40178m = com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a;
        this.f40179n = 0L;
        this.f40180o = 0L;
        this.f40181p = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final com.google.android.gms.internal.ads.C2809Rt d(com.google.android.gms.internal.ads.C2809Rt c2809Rt) throws com.google.android.gms.internal.ads.C5397uu {
        if (c2809Rt.f31386c != 2) {
            throw new com.google.android.gms.internal.ads.C5397uu("Unhandled input format:", c2809Rt);
        }
        int i6 = this.f40167b;
        if (i6 == -1) {
            i6 = c2809Rt.f31384a;
        }
        this.f40170e = c2809Rt;
        com.google.android.gms.internal.ads.C2809Rt c2809Rt2 = new com.google.android.gms.internal.ads.C2809Rt(i6, c2809Rt.f31385b, 2);
        this.f40171f = c2809Rt2;
        this.f40174i = true;
        return c2809Rt2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final void e() {
        this.f40168c = 1.0f;
        this.f40169d = 1.0f;
        com.google.android.gms.internal.ads.C2809Rt c2809Rt = com.google.android.gms.internal.ads.C2809Rt.f31383e;
        this.f40170e = c2809Rt;
        this.f40171f = c2809Rt;
        this.f40172g = c2809Rt;
        this.f40173h = c2809Rt;
        java.nio.ByteBuffer byteBuffer = com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a;
        this.f40176k = byteBuffer;
        this.f40177l = byteBuffer.asShortBuffer();
        this.f40178m = byteBuffer;
        this.f40167b = -1;
        this.f40174i = false;
        this.f40175j = null;
        this.f40179n = 0L;
        this.f40180o = 0L;
        this.f40181p = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final void f() {
        com.google.android.gms.internal.ads.C3027Xv c3027Xv = this.f40175j;
        if (c3027Xv != null) {
            c3027Xv.e();
        }
        this.f40181p = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final boolean g() {
        if (!this.f40181p) {
            return false;
        }
        com.google.android.gms.internal.ads.C3027Xv c3027Xv = this.f40175j;
        return c3027Xv == null || c3027Xv.a() == 0;
    }

    public final long h(long j6) {
        long j10 = this.f40180o;
        if (j10 < 1024) {
            return (long) (((double) this.f40168c) * j6);
        }
        long j11 = this.f40179n;
        com.google.android.gms.internal.ads.C3027Xv c3027Xv = this.f40175j;
        c3027Xv.getClass();
        long jB = j11 - ((long) c3027Xv.b());
        int i6 = this.f40173h.f31384a;
        int i10 = this.f40172g.f31384a;
        return i6 == i10 ? com.google.android.gms.internal.ads.EW.M(j6, jB, j10, java.math.RoundingMode.DOWN) : com.google.android.gms.internal.ads.EW.M(j6, jB * ((long) i6), j10 * ((long) i10), java.math.RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final boolean i() {
        if (this.f40171f.f31384a == -1) {
            return false;
        }
        if (java.lang.Math.abs(this.f40168c - 1.0f) >= 1.0E-4f || java.lang.Math.abs(this.f40169d - 1.0f) >= 1.0E-4f) {
            return true;
        }
        return this.f40171f.f31384a != this.f40170e.f31384a;
    }

    public final void j(float f6) {
        if (this.f40169d != f6) {
            this.f40169d = f6;
            this.f40174i = true;
        }
    }

    public final void k(float f6) {
        if (this.f40168c != f6) {
            this.f40168c = f6;
            this.f40174i = true;
        }
    }
}
