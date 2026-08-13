package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2709Pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p184s3.V f30754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f30755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f30756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p184s3.C7093f1 f30757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p124m3.a.AbstractC0646a f30759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC2801Rl f30760g = new com.google.android.gms.internal.ads.BinderC2801Rl();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p184s3.b2 f30761h = p184s3.b2.f54193a;

    public C2709Pc(android.content.Context context, java.lang.String str, p184s3.C7093f1 c7093f1, int i6, p124m3.a.AbstractC0646a abstractC0646a) {
        this.f30755b = context;
        this.f30756c = str;
        this.f30757d = c7093f1;
        this.f30758e = i6;
        this.f30759f = abstractC0646a;
    }

    public final void a() {
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            p184s3.V vD = p184s3.C7147y.a().d(this.f30755b, p184s3.c2.f(), this.f30756c, this.f30760g);
            this.f30754a = vD;
            if (vD != null) {
                if (this.f30758e != 3) {
                    this.f30754a.V0(new p184s3.i2(this.f30758e));
                }
                this.f30757d.o(jCurrentTimeMillis);
                this.f30754a.I5(new com.google.android.gms.internal.ads.BinderC2155Ac(this.f30759f, this.f30756c));
                this.f30754a.K3(this.f30761h.a(this.f30755b, this.f30757d));
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }
}
