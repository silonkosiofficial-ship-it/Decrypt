package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RI0 extends com.google.android.gms.internal.ads.AbstractC5115sH0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.NH0 f31229k;

    protected RI0(com.google.android.gms.internal.ads.NH0 nh0) {
        this.f31229k = nh0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5115sH0
    protected final /* bridge */ /* synthetic */ int A(java.lang.Object obj, int i6) {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5115sH0
    protected final /* synthetic */ long B(java.lang.Object obj, long j6, com.google.android.gms.internal.ads.LH0 lh0) {
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5115sH0
    protected final /* synthetic */ com.google.android.gms.internal.ads.LH0 C(java.lang.Object obj, com.google.android.gms.internal.ads.LH0 lh0) {
        return D(lh0);
    }

    protected abstract com.google.android.gms.internal.ads.LH0 D(com.google.android.gms.internal.ads.LH0 lh0);

    protected abstract void E(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm);

    protected abstract void F();

    @Override // com.google.android.gms.internal.ads.AbstractC4236kH0, com.google.android.gms.internal.ads.NH0
    public final com.google.android.gms.internal.ads.AbstractC4942qm R() {
        this.f31229k.R();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public abstract void b(com.google.android.gms.internal.ads.JH0 jh0);

    @Override // com.google.android.gms.internal.ads.NH0
    public final com.google.android.gms.internal.ads.Q7 l0() {
        return this.f31229k.l0();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5115sH0, com.google.android.gms.internal.ads.AbstractC4236kH0
    protected final void t(com.google.android.gms.internal.ads.Pv0 pv0) {
        super.t(pv0);
        F();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4236kH0, com.google.android.gms.internal.ads.NH0
    public final boolean v() {
        this.f31229k.v();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5115sH0
    protected final /* synthetic */ void y(java.lang.Object obj, com.google.android.gms.internal.ads.NH0 nh0, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        E(abstractC4942qm);
    }
}
