package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2150e implements O3.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult f24912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.g f24913b;

    C2150e(com.google.android.gms.common.api.internal.g gVar, com.google.android.gms.common.api.internal.BasePendingResult basePendingResult) {
        this.f24913b = gVar;
        this.f24912a = basePendingResult;
    }

    @Override // O3.g.a
    public final void a(com.google.android.gms.common.api.Status status) {
        this.f24913b.f24916a.remove(this.f24912a);
    }
}
