package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2556Ky extends com.google.android.gms.internal.ads.AbstractC3673fA {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f29164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f29165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final android.content.Context f29166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5735xy f29167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.ZH f29168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4783pG f29169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SC f29170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f29171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3022Xq f29172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f29173s;

    C2556Ky(com.google.android.gms.internal.ads.C3563eA c3563eA, android.content.Context context, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, int i6, com.google.android.gms.internal.ads.C5735xy c5735xy, com.google.android.gms.internal.ads.ZH zh, com.google.android.gms.internal.ads.C4783pG c4783pG, com.google.android.gms.internal.ads.SC sc, com.google.android.gms.internal.ads.C3022Xq c3022Xq) {
        super(c3563eA);
        this.f29173s = false;
        this.f29164j = interfaceC2698Ot;
        this.f29166l = context;
        this.f29165k = i6;
        this.f29167m = c5735xy;
        this.f29168n = zh;
        this.f29169o = c4783pG;
        this.f29170p = sc;
        this.f29171q = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25667q5)).booleanValue();
        this.f29172r = c3022Xq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3673fA
    public final void a() {
        super.a();
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f29164j;
        if (interfaceC2698Ot != null) {
            interfaceC2698Ot.destroy();
        }
    }

    public final int i() {
        return this.f29165k;
    }

    public final void j(com.google.android.gms.internal.ads.InterfaceC5911zc interfaceC5911zc) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f29164j;
        if (interfaceC2698Ot != null) {
            interfaceC2698Ot.U0(interfaceC5911zc);
        }
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
    public final void k(android.app.Activity activity, com.google.android.gms.internal.ads.InterfaceC2672Oc interfaceC2672Oc, boolean z6) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot;
        com.google.android.gms.internal.ads.R60 r60Q;
        android.content.Context context = activity;
        if (activity == null) {
            context = this.f29166l;
        }
        if (this.f29171q) {
            this.f29169o.b();
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25339M0)).booleanValue()) {
            p174r3.v.t();
            if (p214v3.E0.h(context)) {
                p224w3.p.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f29170p.b();
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25350N0)).booleanValue()) {
                    new com.google.android.gms.internal.ads.C3827gd0(context.getApplicationContext(), p174r3.v.x().b()).a(this.f35290a.f34899b.f34448b.f32114b);
                    return;
                }
                return;
            }
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Mb)).booleanValue() && (interfaceC2698Ot = this.f29164j) != null && (r60Q = interfaceC2698Ot.Q()) != null && r60Q.f31195r0 && r60Q.f31197s0 != this.f29172r.b()) {
            p224w3.p.g("The app open consent form has been shown.");
            this.f29170p.p(com.google.android.gms.internal.ads.P70.d(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.f29173s) {
            p224w3.p.g("App open interstitial ad is already visible.");
            this.f29170p.p(com.google.android.gms.internal.ads.P70.d(10, null, null));
        }
        if (this.f29173s) {
            return;
        }
        try {
            this.f29168n.a(z6, context, this.f29170p);
            if (this.f29171q) {
                this.f29169o.a();
            }
            this.f29173s = true;
        } catch (com.google.android.gms.internal.ads.YH e6) {
            this.f29170p.F(e6);
        }
    }

    public final void l(long j6, int i6) {
        this.f29167m.a(j6, i6);
    }
}
