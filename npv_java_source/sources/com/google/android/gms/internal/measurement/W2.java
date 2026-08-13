package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class W2 extends com.google.android.gms.internal.measurement.AbstractC6145v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f40698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M4.k f40699b;

    W2(android.content.Context context, M4.k kVar) {
        if (context == null) {
            throw new java.lang.NullPointerException("Null context");
        }
        this.f40698a = context;
        this.f40699b = kVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6145v3
    final android.content.Context a() {
        return this.f40698a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6145v3
    final M4.k b() {
        return this.f40699b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.AbstractC6145v3) {
            com.google.android.gms.internal.measurement.AbstractC6145v3 abstractC6145v3 = (com.google.android.gms.internal.measurement.AbstractC6145v3) obj;
            if (this.f40698a.equals(abstractC6145v3.a())) {
                M4.k kVar = this.f40699b;
                M4.k kVarB = abstractC6145v3.b();
                if (kVar != null ? kVar.equals(kVarB) : kVarB == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f40698a.hashCode() ^ 1000003) * 1000003;
        M4.k kVar = this.f40699b;
        return iHashCode ^ (kVar == null ? 0 : kVar.hashCode());
    }

    public final java.lang.String toString() {
        return "FlagsContext{context=" + java.lang.String.valueOf(this.f40698a) + ", hermeticFileOverrides=" + java.lang.String.valueOf(this.f40699b) + "}";
    }
}
