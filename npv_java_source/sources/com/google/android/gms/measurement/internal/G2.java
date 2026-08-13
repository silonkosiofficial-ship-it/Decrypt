package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class G2 implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f41927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.measurement.internal.E2 f41928b;

    G2(com.google.android.gms.measurement.internal.E2 e6, java.lang.String str) {
        this.f41928b = e6;
        this.f41927a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (iBinder == null) {
            this.f41928b.f41776a.j().L().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.InterfaceC5987d0 interfaceC5987d0Y0 = com.google.android.gms.internal.measurement.AbstractBinderC5978c0.y0(iBinder);
            if (interfaceC5987d0Y0 == null) {
                this.f41928b.f41776a.j().L().a("Install Referrer Service implementation was not found");
            } else {
                this.f41928b.f41776a.j().K().a("Install Referrer Service connected");
                this.f41928b.f41776a.l().D(new com.google.android.gms.measurement.internal.F2(this, interfaceC5987d0Y0, this));
            }
        } catch (java.lang.RuntimeException e6) {
            this.f41928b.f41776a.j().L().b("Exception occurred while calling Install Referrer API", e6);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f41928b.f41776a.j().K().a("Install Referrer Service disconnected");
    }
}
