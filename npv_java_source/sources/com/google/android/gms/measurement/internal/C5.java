package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class C5 extends com.google.android.gms.measurement.internal.AbstractC6466t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.D5 f41749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5(com.google.android.gms.measurement.internal.D5 d6, com.google.android.gms.measurement.internal.InterfaceC6505y3 interfaceC6505y3) {
        super(interfaceC6505y3);
        this.f41749e = d6;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6466t
    public final void d() throws java.lang.Throwable {
        this.f41749e.z();
        this.f41749e.j().K().a("Starting upload from DelayedRunnable");
        this.f41749e.f41809b.E0();
    }
}
