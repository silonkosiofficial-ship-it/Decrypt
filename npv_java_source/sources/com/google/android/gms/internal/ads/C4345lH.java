package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4345lH extends com.google.android.gms.internal.ads.AbstractC3673fA {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final android.content.Context f37132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.lang.ref.WeakReference f37133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4783pG f37134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.ZH f37135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BA f37136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3827gd0 f37137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SC f37138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3022Xq f37139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f37140r;

    C4345lH(com.google.android.gms.internal.ads.C3563eA c3563eA, android.content.Context context, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C4783pG c4783pG, com.google.android.gms.internal.ads.ZH zh, com.google.android.gms.internal.ads.BA ba2, com.google.android.gms.internal.ads.C3827gd0 c3827gd0, com.google.android.gms.internal.ads.SC sc, com.google.android.gms.internal.ads.C3022Xq c3022Xq) {
        super(c3563eA);
        this.f37140r = false;
        this.f37132j = context;
        this.f37133k = new java.lang.ref.WeakReference(interfaceC2698Ot);
        this.f37134l = c4783pG;
        this.f37135m = zh;
        this.f37136n = ba2;
        this.f37137o = c3827gd0;
        this.f37138p = sc;
        this.f37139q = c3022Xq;
    }

    public final void finalize() throws java.lang.Throwable {
        try {
            final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) this.f37133k.get();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.A6)).booleanValue()) {
                if (!this.f37140r && interfaceC2698Ot != null) {
                    com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.kH
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC2698Ot.destroy();
                        }
                    });
                }
            } else if (interfaceC2698Ot != null) {
                interfaceC2698Ot.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean i() {
        return this.f37136n.a();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean j(boolean z6, android.app.Activity activity) {
        android.content.Context context;
        com.google.android.gms.internal.ads.R60 r60Q;
        this.f37134l.b();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25339M0)).booleanValue()) {
            p174r3.v.t();
            if (p214v3.E0.h(this.f37132j)) {
                p224w3.p.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f37138p.b();
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25350N0)).booleanValue()) {
                    this.f37137o.a(this.f35290a.f34899b.f34448b.f32114b);
                }
            } else {
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) this.f37133k.get();
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Mb)).booleanValue() || interfaceC2698Ot == null || (r60Q = interfaceC2698Ot.Q()) == null || !r60Q.f31195r0 || r60Q.f31197s0 == this.f37139q.b()) {
                    if (this.f37140r) {
                        p224w3.p.g("The interstitial ad has been shown.");
                        this.f37138p.p(com.google.android.gms.internal.ads.P70.d(10, null, null));
                    }
                    context = activity;
                    if (!this.f37140r) {
                        if (activity == null) {
                            context = this.f37132j;
                        }
                        try {
                            this.f37135m.a(z6, context, this.f37138p);
                            this.f37134l.a();
                            this.f37140r = true;
                            return true;
                        } catch (com.google.android.gms.internal.ads.YH e6) {
                            this.f37138p.F(e6);
                        }
                    }
                } else {
                    p224w3.p.g("The interstitial consent form has been shown.");
                    this.f37138p.p(com.google.android.gms.internal.ads.P70.d(12, "The consent form has already been shown.", null));
                }
            }
        } else {
            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = (com.google.android.gms.internal.ads.InterfaceC2698Ot) this.f37133k.get();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Mb)).booleanValue()) {
                if (this.f37140r) {
                    p224w3.p.g("The interstitial ad has been shown.");
                    this.f37138p.p(com.google.android.gms.internal.ads.P70.d(10, null, null));
                }
                context = activity;
                if (!this.f37140r) {
                    if (activity == null) {
                        context = this.f37132j;
                    }
                    this.f37135m.a(z6, context, this.f37138p);
                    this.f37134l.a();
                    this.f37140r = true;
                    return true;
                }
            } else {
                if (this.f37140r) {
                    p224w3.p.g("The interstitial ad has been shown.");
                    this.f37138p.p(com.google.android.gms.internal.ads.P70.d(10, null, null));
                }
                context = activity;
                if (!this.f37140r) {
                    if (activity == null) {
                        context = this.f37132j;
                    }
                    this.f37135m.a(z6, context, this.f37138p);
                    this.f37134l.a();
                    this.f37140r = true;
                    return true;
                }
            }
        }
        return false;
    }
}
