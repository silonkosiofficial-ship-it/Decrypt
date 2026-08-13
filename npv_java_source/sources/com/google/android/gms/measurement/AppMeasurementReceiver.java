package com.google.android.gms.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementReceiver extends Z1.a implements i4.l.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p085i4.l f41684E;

    @Override // i4.l.a
    public final void a(android.content.Context context, android.content.Intent intent) {
        Z1.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (this.f41684E == null) {
            this.f41684E = new p085i4.l(this);
        }
        this.f41684E.a(context, intent);
    }
}
