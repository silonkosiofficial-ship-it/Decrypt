package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Fv0 extends com.google.android.gms.internal.ads.Nu0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Jv0 f27588C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected com.google.android.gms.internal.ads.Jv0 f27589D;

    protected Fv0(com.google.android.gms.internal.ads.Jv0 jv0) {
        this.f27588C = jv0;
        if (jv0.V()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.f27589D = n();
    }

    private com.google.android.gms.internal.ads.Jv0 n() {
        return this.f27588C.K();
    }

    private static void p(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.C5512vw0.a().b(obj.getClass()).e(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.Nu0
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.Nu0 h(byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) throws com.google.android.gms.internal.ads.Vv0 {
        t(bArr, i6, i10, c5730xv0);
        return this;
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.ads.Fv0 clone() {
        com.google.android.gms.internal.ads.Fv0 fv0G = w().b();
        fv0G.f27589D = s();
        return fv0G;
    }

    public com.google.android.gms.internal.ads.Fv0 r(com.google.android.gms.internal.ads.Jv0 jv0) {
        if (w().equals(jv0)) {
            return this;
        }
        x();
        p(this.f27589D, jv0);
        return this;
    }

    public com.google.android.gms.internal.ads.Fv0 t(byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) throws com.google.android.gms.internal.ads.Vv0 {
        x();
        try {
            com.google.android.gms.internal.ads.C5512vw0.a().b(this.f27589D.getClass()).h(this.f27589D, bArr, i6, i6 + i10, new com.google.android.gms.internal.ads.Su0(c5730xv0));
            return this;
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw e6;
        } catch (java.io.IOException e10) {
            throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final com.google.android.gms.internal.ads.Jv0 u() {
        com.google.android.gms.internal.ads.Jv0 jv0S = s();
        if (jv0S.P()) {
            return jv0S;
        }
        throw com.google.android.gms.internal.ads.Nu0.k(jv0S);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4413lw0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.ads.Jv0 s() {
        if (!this.f27589D.V()) {
            return this.f27589D;
        }
        this.f27589D.D();
        return this.f27589D;
    }

    public com.google.android.gms.internal.ads.Jv0 w() {
        return this.f27588C;
    }

    protected final void x() {
        if (this.f27589D.V()) {
            return;
        }
        y();
    }

    protected void y() {
        com.google.android.gms.internal.ads.Jv0 jv0N = n();
        p(jv0N, this.f27589D);
        this.f27589D = jv0N;
    }
}
