package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class X2 extends android.database.ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.V2 f40703a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X2(com.google.android.gms.internal.measurement.V2 v6, android.os.Handler handler) {
        super(null);
        this.f40703a = v6;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        this.f40703a.e();
    }
}
