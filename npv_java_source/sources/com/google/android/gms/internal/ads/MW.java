package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class MW implements com.google.android.gms.internal.ads.InterfaceC4777pD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f29778a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.YT f29779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4512mr f29780c;

    MW(com.google.android.gms.internal.ads.NW nw, com.google.android.gms.internal.ads.YT yt, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        this.f29779b = yt;
        this.f29780c = c4512mr;
    }

    private final synchronized void a(p184s3.W0 w6) {
        int i6 = 1;
        if (true == ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25707u5)).booleanValue()) {
            i6 = 3;
        }
        this.f29780c.d(new com.google.android.gms.internal.ads.C3156aU(i6, w6));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4777pD
    public final synchronized void f() {
        this.f29780c.c(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4777pD
    public final synchronized void r(int i6) {
        if (this.f29778a) {
            return;
        }
        this.f29778a = true;
        a(new p184s3.W0(i6, com.google.android.gms.internal.ads.NW.e(this.f29779b.f33354a, i6), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4777pD
    public final synchronized void x0(p184s3.W0 w6) {
        if (this.f29778a) {
            return;
        }
        this.f29778a = true;
        a(w6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4777pD
    public final synchronized void y0(int i6, java.lang.String str) {
        try {
            if (this.f29778a) {
                return;
            }
            this.f29778a = true;
            if (str == null) {
                str = com.google.android.gms.internal.ads.NW.e(this.f29779b.f33354a, i6);
            }
            a(new p184s3.W0(i6, str, "undefined", null, null));
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
