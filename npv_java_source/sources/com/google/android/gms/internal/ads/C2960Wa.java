package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2960Wa extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {
    public C2960Wa(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10) {
        super(c2262Da, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", c5316u8, i6, 24);
    }

    private final void c() {
        p144o3.a aVarH = this.f38974a.h();
        if (aVarH == null) {
            return;
        }
        try {
            p144o3.a.C0676a c0676aB = aVarH.b();
            java.lang.String strA = c0676aB.a();
            int i6 = com.google.android.gms.internal.ads.AbstractC2373Ga.f27826b;
            if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                java.util.UUID uuidFromString = java.util.UUID.fromString(strA);
                byte[] bArr = new byte[16];
                java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                strA = com.google.android.gms.internal.ads.AbstractC4219k9.a(bArr, true);
            }
            if (strA != null) {
                synchronized (this.f38977d) {
                    this.f38977d.D0(strA);
                    this.f38977d.C0(c0676aB.b());
                    this.f38977d.f0(6);
                }
            }
        } catch (java.io.IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        if (this.f38974a.q()) {
            c();
            return;
        }
        synchronized (this.f38977d) {
            this.f38977d.D0((java.lang.String) this.f38978e.invoke(null, this.f38974a.b()));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    public final java.lang.Void b() {
        if (this.f38974a.r()) {
            super.b();
            return null;
        }
        if (this.f38974a.q()) {
            c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        b();
        return null;
    }
}
