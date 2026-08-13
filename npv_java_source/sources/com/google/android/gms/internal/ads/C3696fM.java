package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3696fM extends com.google.android.gms.internal.ads.AbstractC3673fA {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final android.content.Context f35327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.lang.ref.WeakReference f35328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.ZH f35329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4783pG f35330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SC f35331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AD f35332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BA f35333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5167sp f35334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3827gd0 f35335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3778g70 f35336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35337t;

    C3696fM(com.google.android.gms.internal.ads.C3563eA c3563eA, android.content.Context context, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.ZH zh, com.google.android.gms.internal.ads.C4783pG c4783pG, com.google.android.gms.internal.ads.SC sc, com.google.android.gms.internal.ads.AD ad, com.google.android.gms.internal.ads.BA ba2, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C3827gd0 c3827gd0, com.google.android.gms.internal.ads.C3778g70 c3778g70) {
        super(c3563eA);
        this.f35337t = false;
        this.f35327j = context;
        this.f35329l = zh;
        this.f35328k = new java.lang.ref.WeakReference(interfaceC2698Ot);
        this.f35330m = c4783pG;
        this.f35331n = sc;
        this.f35332o = ad;
        this.f35333p = ba2;
        this.f35335r = c3827gd0;
        com.google.android.gms.internal.ads.C4728op c4728op = r60.f31182l;
        this.f35334q = new com.google.android.gms.internal.ads.BinderC2620Mp(c4728op != null ? c4728op.f37873C : "", c4728op != null ? c4728op.f37874D : 1);
        this.f35336s = c3778g70;
    }

    public final void finalize() throws java.lang.Throwable {
        try {
            final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) this.f35328k.get();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.A6)).booleanValue()) {
                if (!this.f35337t && interfaceC2698Ot != null) {
                    com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.dM
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

    public final android.os.Bundle i() {
        return this.f35332o.q1();
    }

    public final com.google.android.gms.internal.ads.InterfaceC5167sp j() {
        return this.f35334q;
    }

    public final com.google.android.gms.internal.ads.C3778g70 k() {
        return this.f35336s;
    }

    public final boolean l() {
        return this.f35333p.a();
    }

    public final boolean m() {
        return this.f35337t;
    }

    public final boolean n() {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) this.f35328k.get();
        return (interfaceC2698Ot == null || interfaceC2698Ot.j1()) ? false : true;
    }

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
    public final boolean o(boolean z6, android.app.Activity activity) {
        android.content.Context context;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25339M0)).booleanValue()) {
            p174r3.v.t();
            if (p214v3.E0.h(this.f35327j)) {
                p224w3.p.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f35331n.b();
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25350N0)).booleanValue()) {
                    this.f35335r.a(this.f35290a.f34899b.f34448b.f32114b);
                }
                return false;
            }
        }
        if (this.f35337t) {
            p224w3.p.g("The rewarded ad have been showed.");
            this.f35331n.p(com.google.android.gms.internal.ads.P70.d(10, null, null));
            return false;
        }
        this.f35337t = true;
        this.f35330m.b();
        if (activity == null) {
            context = activity;
            context = this.f35327j;
        }
        try {
            context = activity;
            this.f35329l.a(z6, context, this.f35331n);
            this.f35330m.a();
            return true;
        } catch (com.google.android.gms.internal.ads.YH e6) {
            this.f35331n.F(e6);
            return false;
        }
    }
}
