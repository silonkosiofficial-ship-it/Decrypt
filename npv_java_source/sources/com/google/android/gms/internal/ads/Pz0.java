package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Pz0 implements com.google.android.gms.internal.ads.InterfaceC3128aB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.JB0 f30849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Nz0 f30850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AB0 f30851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3128aB0 f30852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f30853e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30854f;

    public Pz0(com.google.android.gms.internal.ads.Nz0 nz0, com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD) {
        this.f30850b = nz0;
        this.f30849a = new com.google.android.gms.internal.ads.JB0(interfaceC4447mD);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128aB0
    public final void Q(com.google.android.gms.internal.ads.C4930qg c4930qg) {
        com.google.android.gms.internal.ads.InterfaceC3128aB0 interfaceC3128aB0 = this.f30852d;
        if (interfaceC3128aB0 != null) {
            interfaceC3128aB0.Q(c4930qg);
            c4930qg = this.f30852d.c();
        }
        this.f30849a.Q(c4930qg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128aB0
    public final long a() {
        if (this.f30853e) {
            return this.f30849a.a();
        }
        com.google.android.gms.internal.ads.InterfaceC3128aB0 interfaceC3128aB0 = this.f30852d;
        interfaceC3128aB0.getClass();
        return interfaceC3128aB0.a();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    public final long b(boolean z6) {
        com.google.android.gms.internal.ads.C4930qg c4930qgC;
        com.google.android.gms.internal.ads.AB0 ab0 = this.f30851c;
        if (ab0 == null || ab0.g() || ((z6 && this.f30851c.f() != 2) || (!this.f30851c.X() && (z6 || this.f30851c.g0())))) {
            this.f30853e = true;
            if (this.f30854f) {
                this.f30849a.d();
            }
        } else {
            com.google.android.gms.internal.ads.InterfaceC3128aB0 interfaceC3128aB0 = this.f30852d;
            interfaceC3128aB0.getClass();
            long jA = interfaceC3128aB0.a();
            if (!this.f30853e) {
                this.f30849a.b(jA);
                c4930qgC = interfaceC3128aB0.c();
                if (!c4930qgC.equals(this.f30849a.c())) {
                    this.f30849a.Q(c4930qgC);
                    this.f30850b.a(c4930qgC);
                }
            } else if (jA < this.f30849a.a()) {
                this.f30849a.e();
            } else {
                this.f30853e = false;
                if (this.f30854f) {
                    this.f30849a.d();
                }
                this.f30849a.b(jA);
                c4930qgC = interfaceC3128aB0.c();
                if (!c4930qgC.equals(this.f30849a.c())) {
                    this.f30849a.Q(c4930qgC);
                    this.f30850b.a(c4930qgC);
                }
            }
        }
        return a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128aB0
    public final com.google.android.gms.internal.ads.C4930qg c() {
        com.google.android.gms.internal.ads.InterfaceC3128aB0 interfaceC3128aB0 = this.f30852d;
        return interfaceC3128aB0 != null ? interfaceC3128aB0.c() : this.f30849a.c();
    }

    public final void d(com.google.android.gms.internal.ads.AB0 ab0) {
        if (ab0 == this.f30851c) {
            this.f30852d = null;
            this.f30851c = null;
            this.f30853e = true;
        }
    }

    public final void e(com.google.android.gms.internal.ads.AB0 ab0) throws com.google.android.gms.internal.ads.Qz0 {
        com.google.android.gms.internal.ads.InterfaceC3128aB0 interfaceC3128aB0;
        com.google.android.gms.internal.ads.InterfaceC3128aB0 interfaceC3128aB0L = ab0.l();
        if (interfaceC3128aB0L == null || interfaceC3128aB0L == (interfaceC3128aB0 = this.f30852d)) {
            return;
        }
        if (interfaceC3128aB0 != null) {
            throw com.google.android.gms.internal.ads.Qz0.d(new java.lang.IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f30852d = interfaceC3128aB0L;
        this.f30851c = ab0;
        interfaceC3128aB0L.Q(this.f30849a.c());
    }

    public final void f(long j6) {
        this.f30849a.b(j6);
    }

    public final void g() {
        this.f30854f = true;
        this.f30849a.d();
    }

    public final void h() {
        this.f30854f = false;
        this.f30849a.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128aB0
    public final boolean j() {
        if (this.f30853e) {
            return false;
        }
        com.google.android.gms.internal.ads.InterfaceC3128aB0 interfaceC3128aB0 = this.f30852d;
        interfaceC3128aB0.getClass();
        return interfaceC3128aB0.j();
    }
}
