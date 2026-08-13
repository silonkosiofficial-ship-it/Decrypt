package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3258bM implements com.google.android.gms.internal.ads.InterfaceC5815yj {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4557nD f34299C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4728op f34300D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f34301E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f34302F;

    public C3258bM(com.google.android.gms.internal.ads.C4557nD c4557nD, com.google.android.gms.internal.ads.R60 r60) {
        this.f34299C = c4557nD;
        this.f34300D = r60.f31182l;
        this.f34301E = r60.f31178j;
        this.f34302F = r60.f31180k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5815yj
    public final void b() {
        this.f34299C.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5815yj
    public final void c() {
        this.f34299C.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5815yj
    public final void v0(com.google.android.gms.internal.ads.C4728op c4728op) {
        int i6;
        java.lang.String str;
        com.google.android.gms.internal.ads.C4728op c4728op2 = this.f34300D;
        if (c4728op2 != null) {
            c4728op = c4728op2;
        }
        if (c4728op != null) {
            str = c4728op.f37873C;
            i6 = c4728op.f37874D;
        } else {
            i6 = 1;
            str = "";
        }
        this.f34299C.q1(new com.google.android.gms.internal.ads.BinderC3056Yo(str, i6), this.f34301E, this.f34302F);
    }
}
