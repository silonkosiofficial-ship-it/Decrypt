package D3;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p184s3.C7131s1 f1898a;

    public a(p184s3.C7131s1 c7131s1) {
        this.f1898a = c7131s1;
    }

    public static void a(android.content.Context context, p104k3.EnumC6886c enumC6886c, p104k3.g gVar, D3.b bVar) {
        c(context, enumC6886c, gVar, null, bVar);
    }

    private static void c(final android.content.Context context, final p104k3.EnumC6886c enumC6886c, final p104k3.g gVar, final java.lang.String str, final D3.b bVar) {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25771j.e()).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.bb)).booleanValue()) {
                p224w3.c.f56225b.execute(new java.lang.Runnable() { // from class: D3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        p104k3.g gVar2 = gVar;
                        p184s3.C7093f1 c7093f1A = gVar2 == null ? null : gVar2.a();
                        new com.google.android.gms.internal.ads.C3628eo(context, enumC6886c, c7093f1A, str).b(bVar);
                    }
                });
                return;
            }
        }
        new com.google.android.gms.internal.ads.C3628eo(context, enumC6886c, gVar == null ? null : gVar.a(), str).b(bVar);
    }

    public java.lang.String b() {
        return this.f1898a.a();
    }
}
