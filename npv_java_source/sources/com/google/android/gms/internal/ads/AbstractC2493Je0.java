package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Je0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2493Je0 implements com.google.android.gms.internal.ads.InterfaceC4825pi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.ArrayList f28735b = new java.util.ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3843gl0 f28737d;

    protected AbstractC2493Je0(boolean z6) {
        this.f28734a = z6;
    }

    protected final void D(int i6) {
        com.google.android.gms.internal.ads.C3843gl0 c3843gl0 = this.f28737d;
        int i10 = com.google.android.gms.internal.ads.EW.f27061a;
        for (int i11 = 0; i11 < this.f28736c; i11++) {
            ((com.google.android.gms.internal.ads.Pv0) this.f28735b.get(i11)).i(this, c3843gl0, this.f28734a, i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void b(com.google.android.gms.internal.ads.Pv0 pv0) {
        pv0.getClass();
        if (this.f28735b.contains(pv0)) {
            return;
        }
        this.f28735b.add(pv0);
        this.f28736c++;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public /* synthetic */ java.util.Map d() {
        return java.util.Collections.emptyMap();
    }

    protected final void g() {
        com.google.android.gms.internal.ads.C3843gl0 c3843gl0 = this.f28737d;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        for (int i10 = 0; i10 < this.f28736c; i10++) {
            ((com.google.android.gms.internal.ads.Pv0) this.f28735b.get(i10)).f(this, c3843gl0, this.f28734a);
        }
        this.f28737d = null;
    }

    protected final void h(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) {
        for (int i6 = 0; i6 < this.f28736c; i6++) {
            ((com.google.android.gms.internal.ads.Pv0) this.f28735b.get(i6)).o(this, c3843gl0, this.f28734a);
        }
    }

    protected final void i(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) {
        this.f28737d = c3843gl0;
        for (int i6 = 0; i6 < this.f28736c; i6++) {
            ((com.google.android.gms.internal.ads.Pv0) this.f28735b.get(i6)).q(this, c3843gl0, this.f28734a);
        }
    }
}
