package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5245tY implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f38965a;

    C5245tY(android.content.Context context) {
        this.f38965a = context;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C5355uY(androidx.core.content.a.a(this.f38965a, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
