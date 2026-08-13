package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J2 extends com.google.android.gms.internal.play_billing.Y1 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.L2 f41423C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected com.google.android.gms.internal.play_billing.L2 f41424D;

    protected J2(com.google.android.gms.internal.play_billing.L2 l6) {
        this.f41423C = l6;
        if (l6.e()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.f41424D = l6.p();
    }

    private static void d(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.C6281q3.a().b(obj.getClass()).e(obj, obj2);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.J2 clone() {
        com.google.android.gms.internal.play_billing.J2 j6 = (com.google.android.gms.internal.play_billing.J2) this.f41423C.j(5, null, null);
        j6.f41424D = g();
        return j6;
    }

    public final com.google.android.gms.internal.play_billing.J2 j(com.google.android.gms.internal.play_billing.L2 l6) {
        if (!this.f41423C.equals(l6)) {
            if (!this.f41424D.e()) {
                p();
            }
            d(this.f41424D, l6);
        }
        return this;
    }

    public final com.google.android.gms.internal.play_billing.L2 l() {
        com.google.android.gms.internal.play_billing.L2 l2G = g();
        if (com.google.android.gms.internal.play_billing.L2.z(l2G, true)) {
            return l2G;
        }
        throw new com.google.android.gms.internal.play_billing.C6328y3(l2G);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6227h3
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.play_billing.L2 g() {
        if (!this.f41424D.e()) {
            return this.f41424D;
        }
        this.f41424D.v();
        return this.f41424D;
    }

    protected final void n() {
        if (this.f41424D.e()) {
            return;
        }
        p();
    }

    protected void p() {
        com.google.android.gms.internal.play_billing.L2 l2P = this.f41423C.p();
        d(l2P, this.f41424D);
        this.f41424D = l2P;
    }
}
