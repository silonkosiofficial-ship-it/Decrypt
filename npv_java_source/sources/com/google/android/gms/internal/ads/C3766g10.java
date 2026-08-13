package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3766g10 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f35506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35507b;

    public C3766g10(java.lang.String str, boolean z6) {
        this.f35506a = str;
        this.f35507b = z6;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.C3677fC) obj).f35302b.putString("gct", this.f35506a);
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        bundle.putString("gct", this.f35506a);
        if (this.f35507b) {
            bundle.putString("de", "1");
        }
    }
}
