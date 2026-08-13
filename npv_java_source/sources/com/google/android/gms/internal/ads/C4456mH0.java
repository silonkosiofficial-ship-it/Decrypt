package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4456mH0 implements com.google.android.gms.internal.ads.InterfaceC3580eI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5740y0 f37321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5190t0 f37322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5300u0 f37323c;

    public C4456mH0(com.google.android.gms.internal.ads.InterfaceC5740y0 interfaceC5740y0) {
        this.f37321a = interfaceC5740y0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3580eI0
    public final void a(com.google.android.gms.internal.ads.InterfaceC4884qB0 interfaceC4884qB0, android.net.Uri uri, java.util.Map map, long j6, long j10, com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) throws com.google.android.gms.internal.ads.QI0 {
        com.google.android.gms.internal.ads.C3983i0 c3983i0 = new com.google.android.gms.internal.ads.C3983i0(interfaceC4884qB0, j6, j10);
        this.f37323c = c3983i0;
        if (this.f37322b != null) {
            return;
        }
        com.google.android.gms.internal.ads.InterfaceC5190t0[] interfaceC5190t0ArrA = this.f37321a.a(uri, map);
        int length = interfaceC5190t0ArrA.length;
        com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0C = com.google.android.gms.internal.ads.AbstractC3398ci0.C(length);
        if (length == 1) {
            this.f37322b = interfaceC5190t0ArrA[0];
        } else {
            for (com.google.android.gms.internal.ads.InterfaceC5190t0 interfaceC5190t0 : interfaceC5190t0ArrA) {
                try {
                    if (interfaceC5190t0.j(c3983i0)) {
                        this.f37322b = interfaceC5190t0;
                        com.google.android.gms.internal.ads.LC.f(true);
                        c3983i0.j();
                        break;
                    } else {
                        c3083Zh0C.i(interfaceC5190t0.f());
                        boolean z6 = this.f37322b != null || c3983i0.e() == j6;
                        com.google.android.gms.internal.ads.LC.f(z6);
                        c3983i0.j();
                    }
                } catch (java.io.EOFException unused) {
                    if (this.f37322b != null || c3983i0.e() == j6) {
                    }
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.internal.ads.LC.f(this.f37322b != null || c3983i0.e() == j6);
                    c3983i0.j();
                    throw th;
                }
                com.google.android.gms.internal.ads.LC.f(z6);
                c3983i0.j();
            }
            if (this.f37322b == null) {
                java.util.Iterator it = com.google.android.gms.internal.ads.AbstractC5264ti0.b(com.google.android.gms.internal.ads.AbstractC3398ci0.N(interfaceC5190t0ArrA), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.lH0
                    @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                    public final java.lang.Object apply(java.lang.Object obj) {
                        com.google.android.gms.internal.ads.InterfaceC5190t0 interfaceC5190t1 = (com.google.android.gms.internal.ads.InterfaceC5190t0) obj;
                        interfaceC5190t1.c();
                        return interfaceC5190t1.getClass().getSimpleName();
                    }
                }).iterator();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                com.google.android.gms.internal.ads.AbstractC5150sg0.c(sb, it, ", ");
                throw new com.google.android.gms.internal.ads.QI0("None of the available extractors (" + sb.toString() + ") could read the stream.", uri, c3083Zh0C.j());
            }
        }
        this.f37322b.k(interfaceC5520w0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580eI0
    public final long b() {
        com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0 = this.f37323c;
        if (interfaceC5300u0 != null) {
            return interfaceC5300u0.e();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580eI0
    public final void c() {
        com.google.android.gms.internal.ads.InterfaceC5190t0 interfaceC5190t0 = this.f37322b;
        if (interfaceC5190t0 != null && (interfaceC5190t0 instanceof com.google.android.gms.internal.ads.C3330c3)) {
            ((com.google.android.gms.internal.ads.C3330c3) interfaceC5190t0).a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580eI0
    public final void d() {
        if (this.f37322b != null) {
            this.f37322b = null;
        }
        this.f37323c = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580eI0
    public final void e(long j6, long j10) {
        com.google.android.gms.internal.ads.InterfaceC5190t0 interfaceC5190t0 = this.f37322b;
        interfaceC5190t0.getClass();
        interfaceC5190t0.e(j6, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580eI0
    public final int f(com.google.android.gms.internal.ads.Q0 q6) {
        com.google.android.gms.internal.ads.InterfaceC5190t0 interfaceC5190t0 = this.f37322b;
        interfaceC5190t0.getClass();
        com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0 = this.f37323c;
        interfaceC5300u0.getClass();
        return interfaceC5190t0.i(interfaceC5300u0, q6);
    }
}
