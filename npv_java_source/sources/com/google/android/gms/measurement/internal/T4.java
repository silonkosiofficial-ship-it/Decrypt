package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class T4 extends com.google.android.gms.measurement.internal.AbstractC6466t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T4(com.google.android.gms.measurement.internal.F4 f6, com.google.android.gms.measurement.internal.InterfaceC6505y3 interfaceC6505y3) {
        super(interfaceC6505y3);
        this.f42161e = f6;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6466t
    public final void d() {
        this.f42161e.j().L().a("Tasks have been queued for a long time");
    }
}
