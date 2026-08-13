package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4956qt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3398ci0 f38340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f38341b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.nio.ByteBuffer[] f38342c = new java.nio.ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38343d;

    public C4956qt(com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0) {
        this.f38340a = abstractC3398ci0;
        com.google.android.gms.internal.ads.C2809Rt c2809Rt = com.google.android.gms.internal.ads.C2809Rt.f31383e;
        this.f38343d = false;
    }

    private final int i() {
        return this.f38342c.length - 1;
    }

    private final void j(java.nio.ByteBuffer byteBuffer) {
        boolean z6;
        do {
            z6 = false;
            for (int i6 = 0; i6 <= i(); i6++) {
                if (!this.f38342c[i6].hasRemaining()) {
                    com.google.android.gms.internal.ads.InterfaceC2954Vu interfaceC2954Vu = (com.google.android.gms.internal.ads.InterfaceC2954Vu) this.f38341b.get(i6);
                    if (!interfaceC2954Vu.g()) {
                        java.nio.ByteBuffer byteBuffer2 = i6 > 0 ? this.f38342c[i6 - 1] : byteBuffer.hasRemaining() ? byteBuffer : com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC2954Vu.a(byteBuffer2);
                        this.f38342c[i6] = interfaceC2954Vu.b();
                        long jRemaining2 = jRemaining - ((long) byteBuffer2.remaining());
                        boolean z10 = true;
                        if (jRemaining2 <= 0 && !this.f38342c[i6].hasRemaining()) {
                            z10 = false;
                        }
                        z6 |= z10;
                    } else if (!this.f38342c[i6].hasRemaining() && i6 < i()) {
                        ((com.google.android.gms.internal.ads.InterfaceC2954Vu) this.f38341b.get(i6 + 1)).f();
                    }
                }
            }
        } while (z6);
    }

    public final com.google.android.gms.internal.ads.C2809Rt a(com.google.android.gms.internal.ads.C2809Rt c2809Rt) throws com.google.android.gms.internal.ads.C5397uu {
        if (c2809Rt.equals(com.google.android.gms.internal.ads.C2809Rt.f31383e)) {
            throw new com.google.android.gms.internal.ads.C5397uu("Unhandled input format:", c2809Rt);
        }
        for (int i6 = 0; i6 < this.f38340a.size(); i6++) {
            com.google.android.gms.internal.ads.InterfaceC2954Vu interfaceC2954Vu = (com.google.android.gms.internal.ads.InterfaceC2954Vu) this.f38340a.get(i6);
            com.google.android.gms.internal.ads.C2809Rt c2809RtD = interfaceC2954Vu.d(c2809Rt);
            if (interfaceC2954Vu.i()) {
                com.google.android.gms.internal.ads.LC.f(!c2809RtD.equals(com.google.android.gms.internal.ads.C2809Rt.f31383e));
                c2809Rt = c2809RtD;
            }
        }
        return c2809Rt;
    }

    public final java.nio.ByteBuffer b() {
        if (!h()) {
            return com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a;
        }
        java.nio.ByteBuffer byteBuffer = this.f38342c[i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        j(com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a);
        return this.f38342c[i()];
    }

    public final void c() {
        this.f38341b.clear();
        this.f38343d = false;
        for (int i6 = 0; i6 < this.f38340a.size(); i6++) {
            com.google.android.gms.internal.ads.InterfaceC2954Vu interfaceC2954Vu = (com.google.android.gms.internal.ads.InterfaceC2954Vu) this.f38340a.get(i6);
            interfaceC2954Vu.c();
            if (interfaceC2954Vu.i()) {
                this.f38341b.add(interfaceC2954Vu);
            }
        }
        this.f38342c = new java.nio.ByteBuffer[this.f38341b.size()];
        for (int i10 = 0; i10 <= i(); i10++) {
            this.f38342c[i10] = ((com.google.android.gms.internal.ads.InterfaceC2954Vu) this.f38341b.get(i10)).b();
        }
    }

    public final void d() {
        if (!h() || this.f38343d) {
            return;
        }
        this.f38343d = true;
        ((com.google.android.gms.internal.ads.InterfaceC2954Vu) this.f38341b.get(0)).f();
    }

    public final void e(java.nio.ByteBuffer byteBuffer) {
        if (!h() || this.f38343d) {
            return;
        }
        j(byteBuffer);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.C4956qt)) {
            return false;
        }
        com.google.android.gms.internal.ads.C4956qt c4956qt = (com.google.android.gms.internal.ads.C4956qt) obj;
        if (this.f38340a.size() != c4956qt.f38340a.size()) {
            return false;
        }
        for (int i6 = 0; i6 < this.f38340a.size(); i6++) {
            if (this.f38340a.get(i6) != c4956qt.f38340a.get(i6)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        for (int i6 = 0; i6 < this.f38340a.size(); i6++) {
            com.google.android.gms.internal.ads.InterfaceC2954Vu interfaceC2954Vu = (com.google.android.gms.internal.ads.InterfaceC2954Vu) this.f38340a.get(i6);
            interfaceC2954Vu.c();
            interfaceC2954Vu.e();
        }
        this.f38342c = new java.nio.ByteBuffer[0];
        com.google.android.gms.internal.ads.C2809Rt c2809Rt = com.google.android.gms.internal.ads.C2809Rt.f31383e;
        this.f38343d = false;
    }

    public final boolean g() {
        return this.f38343d && ((com.google.android.gms.internal.ads.InterfaceC2954Vu) this.f38341b.get(i())).g() && !this.f38342c[i()].hasRemaining();
    }

    public final boolean h() {
        return !this.f38341b.isEmpty();
    }

    public final int hashCode() {
        return this.f38340a.hashCode();
    }
}
