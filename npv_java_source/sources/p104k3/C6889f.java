package p104k3;

/* JADX INFO: renamed from: k3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6889f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p184s3.b2 f49461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f49462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p184s3.N f49463c;

    /* JADX INFO: renamed from: k3.f$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.content.Context f49464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p184s3.Q f49465b;

        public a(android.content.Context context, java.lang.String str) {
            android.content.Context context2 = (android.content.Context) Q3.AbstractC1477p.m(context, "context cannot be null");
            p184s3.Q qC = p184s3.C7147y.a().c(context, str, new com.google.android.gms.internal.ads.BinderC2801Rl());
            this.f49464a = context2;
            this.f49465b = qC;
        }

        public p104k3.C6889f a() {
            try {
                return new p104k3.C6889f(this.f49464a, this.f49465b.d(), p184s3.b2.f54193a);
            } catch (android.os.RemoteException e6) {
                p224w3.p.e("Failed to build AdLoader.", e6);
                return new p104k3.C6889f(this.f49464a, new p184s3.BinderC7152z1().p6(), p184s3.b2.f54193a);
            }
        }

        public p104k3.C6889f.a b(com.google.android.gms.ads.nativead.NativeAd.c cVar) {
            try {
                this.f49465b.U5(new com.google.android.gms.internal.ads.BinderC2212Bn(cVar));
            } catch (android.os.RemoteException e6) {
                p224w3.p.h("Failed to add google native ad listener", e6);
            }
            return this;
        }

        public p104k3.C6889f.a c(p104k3.AbstractC6887d abstractC6887d) {
            try {
                this.f49465b.A4(new p184s3.P1(abstractC6887d));
            } catch (android.os.RemoteException e6) {
                p224w3.p.h("Failed to set AdListener.", e6);
            }
            return this;
        }

        public p104k3.C6889f.a d(com.google.android.gms.ads.nativead.c cVar) {
            try {
                this.f49465b.U4(new com.google.android.gms.internal.ads.C3505dh(4, cVar.e(), -1, cVar.d(), cVar.a(), cVar.c() != null ? new p184s3.Q1(cVar.c()) : null, cVar.h(), cVar.b(), cVar.f(), cVar.g(), cVar.i() - 1));
            } catch (android.os.RemoteException e6) {
                p224w3.p.h("Failed to specify native ad options", e6);
            }
            return this;
        }

        public final p104k3.C6889f.a e(java.lang.String str, p134n3.m mVar, p134n3.l lVar) {
            com.google.android.gms.internal.ads.C5153si c5153si = new com.google.android.gms.internal.ads.C5153si(mVar, lVar);
            try {
                this.f49465b.l3(str, c5153si.d(), c5153si.c());
            } catch (android.os.RemoteException e6) {
                p224w3.p.h("Failed to add custom template ad listener", e6);
            }
            return this;
        }

        public final p104k3.C6889f.a f(p134n3.o oVar) {
            try {
                this.f49465b.U5(new com.google.android.gms.internal.ads.BinderC5263ti(oVar));
            } catch (android.os.RemoteException e6) {
                p224w3.p.h("Failed to add google native ad listener", e6);
            }
            return this;
        }

        public final p104k3.C6889f.a g(p134n3.e eVar) {
            try {
                this.f49465b.U4(new com.google.android.gms.internal.ads.C3505dh(eVar));
            } catch (android.os.RemoteException e6) {
                p224w3.p.h("Failed to specify native ad options", e6);
            }
            return this;
        }
    }

    C6889f(android.content.Context context, p184s3.N n6, p184s3.b2 b2Var) {
        this.f49462b = context;
        this.f49463c = n6;
        this.f49461a = b2Var;
    }

    private final void c(final p184s3.C7093f1 c7093f1) {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(this.f49462b);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25764c.e()).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.bb)).booleanValue()) {
                p224w3.c.f56225b.execute(new java.lang.Runnable() { // from class: k3.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49521C.b(c7093f1);
                    }
                });
                return;
            }
        }
        try {
            this.f49463c.H5(this.f49461a.a(this.f49462b, c7093f1));
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Failed to load ad.", e6);
        }
    }

    public void a(p104k3.g gVar) {
        c(gVar.f49466a);
    }

    final /* synthetic */ void b(p184s3.C7093f1 c7093f1) {
        try {
            this.f49463c.H5(this.f49461a.a(this.f49462b, c7093f1));
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Failed to load ad.", e6);
        }
    }
}
