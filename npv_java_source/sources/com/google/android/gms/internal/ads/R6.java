package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class R6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31132a = 2500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31133b;

    public final int a() {
        return this.f31133b;
    }

    public final int b() {
        return this.f31132a;
    }

    public final void c(com.google.android.gms.internal.ads.C4215k7 c4215k7) throws com.google.android.gms.internal.ads.C4215k7 {
        int i6 = this.f31133b + 1;
        this.f31133b = i6;
        int i10 = this.f31132a;
        this.f31132a = i10 + i10;
        if (i6 > 1) {
            throw c4215k7;
        }
    }
}
