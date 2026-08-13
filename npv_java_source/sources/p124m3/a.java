package p124m3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: m3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0646a extends p104k3.AbstractC6888e {
    }

    public static void b(final android.content.Context context, final java.lang.String str, final p104k3.g gVar, final int i6, final p124m3.a.AbstractC0646a abstractC0646a) {
        Q3.AbstractC1477p.m(context, "Context cannot be null.");
        Q3.AbstractC1477p.m(str, "adUnitId cannot be null.");
        Q3.AbstractC1477p.m(gVar, "AdRequest cannot be null.");
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25765d.e()).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.bb)).booleanValue()) {
                p224w3.c.f56225b.execute(new java.lang.Runnable() { // from class: m3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context2 = context;
                        int i10 = i6;
                        java.lang.String str2 = str;
                        p104k3.g gVar2 = gVar;
                        try {
                            new com.google.android.gms.internal.ads.C2709Pc(context2, str2, gVar2.a(), i10, abstractC0646a).a();
                        } catch (java.lang.IllegalStateException e6) {
                            com.google.android.gms.internal.ads.C4396lo.c(context2).a(e6, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new com.google.android.gms.internal.ads.C2709Pc(context, str, gVar.a(), i6, abstractC0646a).a();
    }

    public static void c(final android.content.Context context, final java.lang.String str, final p104k3.g gVar, final p124m3.a.AbstractC0646a abstractC0646a) {
        Q3.AbstractC1477p.m(context, "Context cannot be null.");
        Q3.AbstractC1477p.m(str, "adUnitId cannot be null.");
        Q3.AbstractC1477p.m(gVar, "AdRequest cannot be null.");
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25765d.e()).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.bb)).booleanValue()) {
                p224w3.c.f56225b.execute(new java.lang.Runnable() { // from class: m3.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context2 = context;
                        java.lang.String str2 = str;
                        p104k3.g gVar2 = gVar;
                        try {
                            new com.google.android.gms.internal.ads.C2709Pc(context2, str2, gVar2.a(), 3, abstractC0646a).a();
                        } catch (java.lang.IllegalStateException e6) {
                            com.google.android.gms.internal.ads.C4396lo.c(context2).a(e6, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new com.google.android.gms.internal.ads.C2709Pc(context, str, gVar.a(), 3, abstractC0646a).a();
    }

    public abstract p104k3.u a();

    public abstract void d(p104k3.l lVar);

    public abstract void e(android.app.Activity activity);
}
