package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2791Rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3690fI0 f31306a = new com.google.android.gms.internal.ads.C3690fI0();

    public final com.google.android.gms.internal.ads.C2791Rg a(int i6) {
        this.f31306a.a(i6);
        return this;
    }

    public final com.google.android.gms.internal.ads.C2791Rg b(com.google.android.gms.internal.ads.C5151sh c5151sh) {
        com.google.android.gms.internal.ads.C3692fJ0 c3692fJ0 = c5151sh.f38787a;
        for (int i6 = 0; i6 < c3692fJ0.b(); i6++) {
            this.f31306a.a(c3692fJ0.a(i6));
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.C2791Rg c(int... iArr) {
        for (int i6 = 0; i6 < 20; i6++) {
            this.f31306a.a(iArr[i6]);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.C2791Rg d(int i6, boolean z6) {
        if (z6) {
            this.f31306a.a(i6);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.C5151sh e() {
        return new com.google.android.gms.internal.ads.C5151sh(this.f31306a.b(), null);
    }
}
