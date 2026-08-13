package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class B50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3232b80 f25898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4115jC f25899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f25900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5751y50 f25901d;

    public B50(com.google.android.gms.internal.ads.InterfaceC3232b80 interfaceC3232b80, com.google.android.gms.internal.ads.InterfaceC4115jC interfaceC4115jC, java.util.concurrent.Executor executor) {
        this.f25898a = interfaceC3232b80;
        this.f25899b = interfaceC4115jC;
        this.f25900c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.internal.ads.InterfaceC4438m80 e() {
        com.google.android.gms.internal.ads.C4546n70 c4546n70I = this.f25899b.i();
        return this.f25898a.d(c4546n70I.f37511d, c4546n70I.f37513f, c4546n70I.f37517j);
    }

    public final P4.d c() {
        P4.d dVarH;
        com.google.android.gms.internal.ads.C5751y50 c5751y50 = this.f25901d;
        if (c5751y50 != null) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(c5751y50);
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2496Jg.f28738a.e()).booleanValue()) {
            dVarH = (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.e((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.m(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(this.f25899b.b().e(this.f25898a.a())), new com.google.android.gms.internal.ads.C5641x50(this), this.f25900c), com.google.android.gms.internal.ads.AR.class, new com.google.android.gms.internal.ads.C5531w50(this), this.f25900c);
        } else {
            com.google.android.gms.internal.ads.C5751y50 c5751y51 = new com.google.android.gms.internal.ads.C5751y50(null, e(), null);
            this.f25901d = c5751y51;
            dVarH = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(c5751y51);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(dVarH, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.v50
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                return (com.google.android.gms.internal.ads.C5751y50) obj;
            }
        }, this.f25900c);
    }
}
