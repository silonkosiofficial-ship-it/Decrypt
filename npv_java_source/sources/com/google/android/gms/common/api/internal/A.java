package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class A extends P3.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Dialog f24856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.B f24857b;

    A(com.google.android.gms.common.api.internal.B b6, android.app.Dialog dialog) {
        this.f24857b = b6;
        this.f24856a = dialog;
    }

    @Override // P3.r
    public final void a() {
        this.f24857b.f24859D.o();
        if (this.f24856a.isShowing()) {
            this.f24856a.dismiss();
        }
    }
}
