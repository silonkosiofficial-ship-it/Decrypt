package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4950qq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static com.google.android.gms.internal.ads.AbstractC4950qq f38338a;

    public static synchronized com.google.android.gms.internal.ads.AbstractC4950qq d(android.content.Context context) {
        try {
            com.google.android.gms.internal.ads.AbstractC4950qq abstractC4950qq = f38338a;
            if (abstractC4950qq != null) {
                return abstractC4950qq;
            }
            android.content.Context applicationContext = context.getApplicationContext();
            com.google.android.gms.internal.ads.AbstractC2161Af.a(applicationContext);
            p214v3.InterfaceC7268s0 interfaceC7268s0J = p174r3.v.s().j();
            interfaceC7268s0J.t(applicationContext);
            com.google.android.gms.internal.ads.C4071iq c4071iq = new com.google.android.gms.internal.ads.C4071iq(null);
            c4071iq.b(applicationContext);
            c4071iq.c(p174r3.v.c());
            c4071iq.a(interfaceC7268s0J);
            c4071iq.d(p174r3.v.r());
            com.google.android.gms.internal.ads.AbstractC4950qq abstractC4950qqE = c4071iq.e();
            f38338a = abstractC4950qqE;
            abstractC4950qqE.a().a();
            com.google.android.gms.internal.ads.C5389uq c5389uqC = f38338a.c();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25251E0)).booleanValue()) {
                p174r3.v.t();
                java.util.Map mapB0 = p214v3.E0.b0((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25262F0));
                java.util.Iterator it = mapB0.keySet().iterator();
                while (it.hasNext()) {
                    c5389uqC.c((java.lang.String) it.next());
                }
                c5389uqC.d(new com.google.android.gms.internal.ads.C5169sq(c5389uqC, mapB0));
            }
            return f38338a;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    abstract com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3304bq a();

    abstract com.google.android.gms.internal.ads.C3742fq b();

    abstract com.google.android.gms.internal.ads.C5389uq c();
}
