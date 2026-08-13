package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Q90 implements java.lang.Runnable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T90 f30922D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.String f30923E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.lang.String f30925G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3339c70 f30926H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private p184s3.W0 f30927I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.util.concurrent.Future f30928J;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f30921C = new java.util.ArrayList();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f30929K = 2;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private com.google.android.gms.internal.ads.V90 f30924F = com.google.android.gms.internal.ads.V90.SCAR_REQUEST_TYPE_UNSPECIFIED;

    Q90(com.google.android.gms.internal.ads.T90 t90) {
        this.f30922D = t90;
    }

    public final synchronized com.google.android.gms.internal.ads.Q90 a(com.google.android.gms.internal.ads.E90 e90) {
        try {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
                java.util.List list = this.f30921C;
                e90.j();
                list.add(e90);
                java.util.concurrent.Future future = this.f30928J;
                if (future != null) {
                    future.cancel(false);
                }
                this.f30928J = com.google.android.gms.internal.ads.AbstractC3524dr.f34798d.schedule(this, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25292H8)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.Q90 b(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue() && com.google.android.gms.internal.ads.P90.e(str)) {
            this.f30923E = str;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.Q90 c(p184s3.W0 w6) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
            this.f30927I = w6;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.Q90 d(java.util.ArrayList arrayList) {
        try {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(p104k3.EnumC6886c.BANNER.name())) {
                    this.f30929K = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(p104k3.EnumC6886c.INTERSTITIAL.name())) {
                    this.f30929K = 4;
                } else if (arrayList.contains("native") || arrayList.contains(p104k3.EnumC6886c.NATIVE.name())) {
                    this.f30929K = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(p104k3.EnumC6886c.REWARDED.name())) {
                    this.f30929K = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f30929K = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(p104k3.EnumC6886c.REWARDED_INTERSTITIAL.name())) {
                    this.f30929K = 6;
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.Q90 e(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
            this.f30925G = str;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.Q90 f(android.os.Bundle bundle) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
            this.f30924F = B3.AbstractC0797c.a(bundle);
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.Q90 g(com.google.android.gms.internal.ads.C3339c70 c3339c70) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
            this.f30926H = c3339c70;
        }
        return this;
    }

    public final synchronized void h() {
        try {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
                java.util.concurrent.Future future = this.f30928J;
                if (future != null) {
                    future.cancel(false);
                }
                for (com.google.android.gms.internal.ads.E90 e90 : this.f30921C) {
                    int i6 = this.f30929K;
                    if (i6 != 2) {
                        e90.A(i6);
                    }
                    if (!android.text.TextUtils.isEmpty(this.f30923E)) {
                        e90.o(this.f30923E);
                    }
                    if (!android.text.TextUtils.isEmpty(this.f30925G) && !e90.l()) {
                        e90.Z(this.f30925G);
                    }
                    com.google.android.gms.internal.ads.C3339c70 c3339c70 = this.f30926H;
                    if (c3339c70 != null) {
                        e90.a(c3339c70);
                    } else {
                        p184s3.W0 w6 = this.f30927I;
                        if (w6 != null) {
                            e90.p(w6);
                        }
                    }
                    e90.b(this.f30924F);
                    this.f30922D.b(e90.m());
                }
                this.f30921C.clear();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized com.google.android.gms.internal.ads.Q90 i(int i6) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
            this.f30929K = i6;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
