package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3628eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static com.google.android.gms.internal.ads.InterfaceC2215Bq f35054e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f35055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p104k3.EnumC6886c f35056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p184s3.C7093f1 f35057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f35058d;

    public C3628eo(android.content.Context context, p104k3.EnumC6886c enumC6886c, p184s3.C7093f1 c7093f1, java.lang.String str) {
        this.f35055a = context;
        this.f35056b = enumC6886c;
        this.f35057c = c7093f1;
        this.f35058d = str;
    }

    public static com.google.android.gms.internal.ads.InterfaceC2215Bq a(android.content.Context context) {
        com.google.android.gms.internal.ads.InterfaceC2215Bq interfaceC2215Bq;
        synchronized (com.google.android.gms.internal.ads.C3628eo.class) {
            try {
                if (f35054e == null) {
                    f35054e = p184s3.C7147y.a().o(context, new com.google.android.gms.internal.ads.BinderC2801Rl());
                }
                interfaceC2215Bq = f35054e;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return interfaceC2215Bq;
    }

    public final void b(D3.b bVar) {
        p184s3.X1 x1A;
        java.lang.String str;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.android.gms.internal.ads.InterfaceC2215Bq interfaceC2215BqA = a(this.f35055a);
        if (interfaceC2215BqA == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            android.content.Context context = this.f35055a;
            p184s3.C7093f1 c7093f1 = this.f35057c;
            X3.a aVarC2 = X3.b.c2(context);
            if (c7093f1 == null) {
                p184s3.Y1 y6 = new p184s3.Y1();
                y6.g(jCurrentTimeMillis);
                x1A = y6.a();
            } else {
                c7093f1.o(jCurrentTimeMillis);
                x1A = p184s3.b2.f54193a.a(this.f35055a, this.f35057c);
            }
            try {
                interfaceC2215BqA.F3(aVarC2, new com.google.android.gms.internal.ads.C2363Fq(this.f35058d, this.f35056b.name(), null, x1A, 0, null), new com.google.android.gms.internal.ads.BinderC3409co(this, bVar));
                return;
            } catch (android.os.RemoteException unused) {
                str = "Internal Error.";
            }
        }
        bVar.a(str);
    }
}
