package E3;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void b(final android.content.Context context, final java.lang.String str, final p104k3.g gVar, final E3.d dVar) {
        Q3.AbstractC1477p.m(context, "Context cannot be null.");
        Q3.AbstractC1477p.m(str, "AdUnitId cannot be null.");
        Q3.AbstractC1477p.m(gVar, "AdRequest cannot be null.");
        Q3.AbstractC1477p.m(dVar, "LoadCallback cannot be null.");
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25772k.e()).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.bb)).booleanValue()) {
                p224w3.c.f56225b.execute(new java.lang.Runnable() { // from class: E3.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context2 = context;
                        java.lang.String str2 = str;
                        p104k3.g gVar2 = gVar;
                        try {
                            new com.google.android.gms.internal.ads.C2325Ep(context2, str2).d(gVar2.a(), dVar);
                        } catch (java.lang.IllegalStateException e6) {
                            com.google.android.gms.internal.ads.C4396lo.c(context2).a(e6, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        p224w3.p.b("Loading on UI thread");
        new com.google.android.gms.internal.ads.C2325Ep(context, str).d(gVar.a(), dVar);
    }

    public abstract p104k3.u a();

    public abstract void c(android.app.Activity activity, p104k3.p pVar);
}
