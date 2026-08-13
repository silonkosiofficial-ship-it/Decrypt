package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class P2 extends android.database.ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.N2 f40637a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P2(com.google.android.gms.internal.measurement.N2 n6, android.os.Handler handler) {
        super(null);
        this.f40637a = n6;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        this.f40637a.f40584a.set(true);
    }
}
