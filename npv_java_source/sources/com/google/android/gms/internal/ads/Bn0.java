package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Bn0 extends com.google.android.gms.internal.ads.AbstractC3406cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5934zn0 f26020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f26021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5824yn0 f26022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3406cm0 f26023d;

    /* synthetic */ Bn0(com.google.android.gms.internal.ads.C5934zn0 c5934zn0, java.lang.String str, com.google.android.gms.internal.ads.C5824yn0 c5824yn0, com.google.android.gms.internal.ads.AbstractC3406cm0 abstractC3406cm0, com.google.android.gms.internal.ads.An0 an0) {
        this.f26020a = c5934zn0;
        this.f26021b = str;
        this.f26022c = c5824yn0;
        this.f26023d = abstractC3406cm0;
    }

    @Override // com.google.android.gms.internal.ads.Sl0
    public final boolean a() {
        return this.f26020a != com.google.android.gms.internal.ads.C5934zn0.f40394c;
    }

    public final com.google.android.gms.internal.ads.AbstractC3406cm0 b() {
        return this.f26023d;
    }

    public final com.google.android.gms.internal.ads.C5934zn0 c() {
        return this.f26020a;
    }

    public final java.lang.String d() {
        return this.f26021b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.Bn0)) {
            return false;
        }
        com.google.android.gms.internal.ads.Bn0 bn0 = (com.google.android.gms.internal.ads.Bn0) obj;
        return bn0.f26022c.equals(this.f26022c) && bn0.f26023d.equals(this.f26023d) && bn0.f26021b.equals(this.f26021b) && bn0.f26020a.equals(this.f26020a);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(com.google.android.gms.internal.ads.Bn0.class, this.f26021b, this.f26022c, this.f26023d, this.f26020a);
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.C5934zn0 c5934zn0 = this.f26020a;
        com.google.android.gms.internal.ads.AbstractC3406cm0 abstractC3406cm0 = this.f26023d;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f26021b + ", dekParsingStrategy: " + java.lang.String.valueOf(this.f26022c) + ", dekParametersForNewKeys: " + java.lang.String.valueOf(abstractC3406cm0) + ", variant: " + java.lang.String.valueOf(c5934zn0) + ")";
    }
}
