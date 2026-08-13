package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6032i0 extends com.google.android.gms.internal.measurement.AbstractC6103q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f40971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.EnumC6126t0 f40972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.EnumC6118s0 f40973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f40974d;

    C6032i0() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6103q0
    public final com.google.android.gms.internal.measurement.AbstractC6103q0 a(com.google.android.gms.internal.measurement.EnumC6118s0 enumC6118s0) {
        if (enumC6118s0 == null) {
            throw new java.lang.NullPointerException("Null filePurpose");
        }
        this.f40973c = enumC6118s0;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6103q0
    final com.google.android.gms.internal.measurement.AbstractC6103q0 b(com.google.android.gms.internal.measurement.EnumC6126t0 enumC6126t0) {
        if (enumC6126t0 == null) {
            throw new java.lang.NullPointerException("Null fileChecks");
        }
        this.f40972b = enumC6126t0;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6103q0
    public final com.google.android.gms.internal.measurement.AbstractC6103q0 c(boolean z6) {
        this.f40974d = (byte) (this.f40974d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6103q0
    public final com.google.android.gms.internal.measurement.AbstractC6110r0 d() {
        if (this.f40974d == 1 && this.f40971a != null && this.f40972b != null && this.f40973c != null) {
            return new com.google.android.gms.internal.measurement.C6041j0(this.f40971a, this.f40972b, this.f40973c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f40971a == null) {
            sb.append(" fileOwner");
        }
        if ((1 & this.f40974d) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f40972b == null) {
            sb.append(" fileChecks");
        }
        if (this.f40973c == null) {
            sb.append(" filePurpose");
        }
        throw new java.lang.IllegalStateException("Missing required properties:" + java.lang.String.valueOf(sb));
    }

    public final com.google.android.gms.internal.measurement.AbstractC6103q0 e(java.lang.String str) {
        this.f40971a = str;
        return this;
    }
}
