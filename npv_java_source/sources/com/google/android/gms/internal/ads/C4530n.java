package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4530n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4420m f37445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5079s f37446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37447c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f37450f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37453i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37448d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f37449e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f37451g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37452h = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f37454j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4447mD f37455k = com.google.android.gms.internal.ads.InterfaceC4447mD.f37298a;

    public C4530n(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC4420m interfaceC4420m, long j6) {
        this.f37445a = interfaceC4420m;
        this.f37446b = new com.google.android.gms.internal.ads.C5079s(context);
    }

    private final void q(int i6) {
        this.f37448d = java.lang.Math.min(this.f37448d, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r15 > 100000) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r20 >= r24) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (r17.f37447c != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r18, long r20, long r22, long r24, boolean r26, com.google.android.gms.internal.ads.C4310l r27) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4530n.a(long, long, long, long, boolean, com.google.android.gms.internal.ads.l):int");
    }

    public final void b() {
        if (this.f37448d == 0) {
            this.f37448d = 1;
        }
    }

    public final void c(boolean z6) {
        this.f37453i = z6;
        this.f37452h = -9223372036854775807L;
    }

    public final void d() {
        q(0);
    }

    public final void e(boolean z6) {
        this.f37448d = z6 ? 1 : 0;
    }

    public final void f() {
        q(2);
    }

    public final void g() {
        this.f37447c = true;
        this.f37450f = com.google.android.gms.internal.ads.EW.K(this.f37455k.b());
        this.f37446b.g();
    }

    public final void h() {
        this.f37447c = false;
        this.f37452h = -9223372036854775807L;
        this.f37446b.h();
    }

    public final void i() {
        this.f37446b.f();
        this.f37451g = -9223372036854775807L;
        this.f37449e = -9223372036854775807L;
        q(1);
        this.f37452h = -9223372036854775807L;
    }

    public final void j(int i6) {
        this.f37446b.j(i6);
    }

    public final void k(com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD) {
        this.f37455k = interfaceC4447mD;
    }

    public final void l(float f6) {
        this.f37446b.c(f6);
    }

    public final void m(android.view.Surface surface) {
        this.f37446b.i(surface);
        q(1);
    }

    public final void n(float f6) {
        com.google.android.gms.internal.ads.LC.d(f6 > 0.0f);
        if (f6 == this.f37454j) {
            return;
        }
        this.f37454j = f6;
        this.f37446b.e(f6);
    }

    public final boolean o(boolean z6) {
        boolean z10 = true;
        if (z6 && this.f37448d == 3) {
            this.f37452h = -9223372036854775807L;
        } else {
            if (this.f37452h == -9223372036854775807L) {
                return false;
            }
            if (this.f37455k.b() >= this.f37452h) {
                z10 = false;
                this.f37452h = -9223372036854775807L;
            }
        }
        return z10;
    }

    public final boolean p() {
        int i6 = this.f37448d;
        this.f37448d = 3;
        this.f37450f = com.google.android.gms.internal.ads.EW.K(this.f37455k.b());
        return i6 != 3;
    }
}
