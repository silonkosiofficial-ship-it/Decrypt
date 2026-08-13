package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ge0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3829ge0 extends com.google.android.gms.internal.ads.AbstractC4707oe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f35646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f35647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35649d;

    C3829ge0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4707oe0
    public final com.google.android.gms.internal.ads.AbstractC4707oe0 a(boolean z6) {
        this.f35647b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4707oe0
    public final com.google.android.gms.internal.ads.AbstractC4927qe0 b() {
        if (this.f35647b == 1 && this.f35646a != null && this.f35648c != 0 && this.f35649d != 0) {
            return new com.google.android.gms.internal.ads.C4049ie0(this.f35646a, false, this.f35648c, null, null, this.f35649d, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f35646a == null) {
            sb.append(" fileOwner");
        }
        if (this.f35647b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f35648c == 0) {
            sb.append(" fileChecks");
        }
        if (this.f35649d == 0) {
            sb.append(" filePurpose");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4707oe0
    final com.google.android.gms.internal.ads.AbstractC4707oe0 c(int i6) {
        this.f35648c = i6;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4707oe0
    public final com.google.android.gms.internal.ads.AbstractC4707oe0 d(int i6) {
        this.f35649d = 1;
        return this;
    }

    public final com.google.android.gms.internal.ads.AbstractC4707oe0 e(java.lang.String str) {
        this.f35646a = "";
        return this;
    }
}
