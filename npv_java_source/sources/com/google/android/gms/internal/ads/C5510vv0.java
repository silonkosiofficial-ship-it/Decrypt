package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5510vv0 implements com.google.android.gms.internal.ads.InterfaceC4825pi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4825pi0 f39472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f39473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.net.Uri f39474c = android.net.Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.Map f39475d = java.util.Collections.emptyMap();

    public C5510vv0(com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0) {
        this.f39472a = interfaceC4825pi0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) {
        int iH = this.f39472a.H(bArr, i6, i10);
        if (iH != -1) {
            this.f39473b += (long) iH;
        }
        return iH;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) {
        this.f39474c = c3843gl0.f35675a;
        this.f39475d = java.util.Collections.emptyMap();
        try {
            long jA = this.f39472a.a(c3843gl0);
            if (c() != null) {
            }
            return jA;
        } finally {
            android.net.Uri uriC = c();
            if (uriC != null) {
                this.f39474c = uriC;
            }
            this.f39475d = d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void b(com.google.android.gms.internal.ads.Pv0 pv0) {
        pv0.getClass();
        this.f39472a.b(pv0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        return this.f39472a.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final java.util.Map d() {
        return this.f39472a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        this.f39472a.f();
    }

    public final long g() {
        return this.f39473b;
    }

    public final android.net.Uri h() {
        return this.f39474c;
    }

    public final java.util.Map i() {
        return this.f39475d;
    }
}
