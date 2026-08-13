package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2950Vq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final java.lang.String f32595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f32596h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f32589a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f32590b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f32591c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f32592d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f32593e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.Object f32594f = new java.lang.Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f32597i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f32598j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f32599k = 0;

    public C2950Vq(java.lang.String str, p214v3.InterfaceC7268s0 interfaceC7268s0) {
        this.f32595g = str;
        this.f32596h = interfaceC7268s0;
    }

    private final void i() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2496Jg.f28738a.e()).booleanValue()) {
            synchronized (this.f32594f) {
                this.f32591c--;
                this.f32592d--;
            }
        }
    }

    public final int a() {
        int i6;
        synchronized (this.f32594f) {
            i6 = this.f32599k;
        }
        return i6;
    }

    public final android.os.Bundle b(android.content.Context context, java.lang.String str) {
        android.os.Bundle bundle;
        java.lang.String str2;
        synchronized (this.f32594f) {
            try {
                bundle = new android.os.Bundle();
                if (!this.f32596h.M()) {
                    bundle.putString("session_id", this.f32595g);
                }
                bundle.putLong("basets", this.f32590b);
                bundle.putLong("currts", this.f32589a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.f32591c);
                bundle.putInt("preqs_in_session", this.f32592d);
                bundle.putLong("time_in_session", this.f32593e);
                bundle.putInt("pclick", this.f32597i);
                bundle.putInt("pimp", this.f32598j);
                android.content.Context contextA = com.google.android.gms.internal.ads.AbstractC3092Zo.a(context);
                int identifier = contextA.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z6 = false;
                if (identifier == 0) {
                    str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
                } else {
                    try {
                        if (identifier == contextA.getPackageManager().getActivityInfo(new android.content.ComponentName(contextA.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z6 = true;
                        } else {
                            p224w3.p.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                        p224w3.p.g("Fail to fetch AdActivity theme");
                        str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
                        p224w3.p.f(str2);
                    }
                    bundle.putBoolean("support_transparent_background", z6);
                    bundle.putInt("consent_form_action_identifier", a());
                }
                p224w3.p.f(str2);
                bundle.putBoolean("support_transparent_background", z6);
                bundle.putInt("consent_form_action_identifier", a());
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final void c() {
        synchronized (this.f32594f) {
            this.f32597i++;
        }
    }

    public final void d() {
        synchronized (this.f32594f) {
            this.f32598j++;
        }
    }

    public final void e() {
        i();
    }

    public final void f() {
        i();
    }

    public final void g(p184s3.X1 x6, long j6) {
        android.os.Bundle bundle;
        synchronized (this.f32594f) {
            try {
                long jF = this.f32596h.f();
                long jA = p174r3.v.c().a();
                if (this.f32590b == -1) {
                    if (jA - jF > ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25526d1)).longValue()) {
                        this.f32592d = -1;
                    } else {
                        this.f32592d = this.f32596h.c();
                    }
                    this.f32590b = j6;
                }
                this.f32589a = j6;
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25298I3)).booleanValue() || (bundle = x6.f54154E) == null || bundle.getInt("gw", 2) != 1) {
                    this.f32591c++;
                    int i6 = this.f32592d + 1;
                    this.f32592d = i6;
                    if (i6 == 0) {
                        this.f32593e = 0L;
                        this.f32596h.C(jA);
                    } else {
                        this.f32593e = jA - this.f32596h.d();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f32594f) {
            this.f32599k++;
        }
    }
}
