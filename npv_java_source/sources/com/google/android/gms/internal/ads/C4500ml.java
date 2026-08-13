package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4500ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f37404a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f37405b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5599wl f37406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5599wl f37407d;

    private static final android.content.Context c(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final com.google.android.gms.internal.ads.C5599wl a(android.content.Context context, p224w3.a aVar, com.google.android.gms.internal.ads.T90 t90) {
        com.google.android.gms.internal.ads.C5599wl c5599wl;
        synchronized (this.f37404a) {
            try {
                if (this.f37406c == null) {
                    this.f37406c = new com.google.android.gms.internal.ads.C5599wl(c(context), aVar, (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25491a), t90);
                }
                c5599wl = this.f37406c;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c5599wl;
    }

    public final com.google.android.gms.internal.ads.C5599wl b(android.content.Context context, p224w3.a aVar, com.google.android.gms.internal.ads.T90 t90) {
        com.google.android.gms.internal.ads.C5599wl c5599wl;
        synchronized (this.f37405b) {
            try {
                if (this.f37407d == null) {
                    this.f37407d = new com.google.android.gms.internal.ads.C5599wl(c(context), aVar, (java.lang.String) com.google.android.gms.internal.ads.AbstractC2606Mg.f29815a.e(), t90);
                }
                c5599wl = this.f37407d;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c5599wl;
    }
}
