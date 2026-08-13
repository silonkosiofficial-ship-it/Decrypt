package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC6361d5 implements android.content.ServiceConnection, Q3.AbstractC1464c.a, Q3.AbstractC1464c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f42348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile com.google.android.gms.measurement.internal.C6400j2 f42349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42350c;

    protected ServiceConnectionC6361d5(com.google.android.gms.measurement.internal.F4 f6) {
        this.f42350c = f6;
    }

    @Override // Q3.AbstractC1464c.a
    public final void L0(android.os.Bundle bundle) {
        Q3.AbstractC1477p.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Q3.AbstractC1477p.l(this.f42349b);
                this.f42350c.l().D(new com.google.android.gms.measurement.internal.RunnableC6368e5(this, (p085i4.InterfaceC6654f) this.f42349b.D()));
            } catch (android.os.DeadObjectException | java.lang.IllegalStateException unused) {
                this.f42349b = null;
                this.f42348a = false;
            }
        }
    }

    public final void a() {
        this.f42350c.n();
        android.content.Context contextA = this.f42350c.a();
        synchronized (this) {
            try {
                if (this.f42348a) {
                    this.f42350c.j().K().a("Connection attempt already in progress");
                    return;
                }
                if (this.f42349b != null && (this.f42349b.e() || this.f42349b.j())) {
                    this.f42350c.j().K().a("Already awaiting connection attempt");
                    return;
                }
                this.f42349b = new com.google.android.gms.measurement.internal.C6400j2(contextA, android.os.Looper.getMainLooper(), this, this);
                this.f42350c.j().K().a("Connecting to remote service");
                this.f42348a = true;
                Q3.AbstractC1477p.l(this.f42349b);
                this.f42349b.q();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void b(android.content.Intent intent) {
        this.f42350c.n();
        android.content.Context contextA = this.f42350c.a();
        U3.b bVarB = U3.b.b();
        synchronized (this) {
            try {
                if (this.f42348a) {
                    this.f42350c.j().K().a("Connection attempt already in progress");
                    return;
                }
                this.f42350c.j().K().a("Using local app measurement service");
                this.f42348a = true;
                bVarB.a(contextA, intent, this.f42350c.f41802c, 129);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f42349b != null && (this.f42349b.j() || this.f42349b.e())) {
            this.f42349b.h();
        }
        this.f42349b = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        Q3.AbstractC1477p.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f42348a = false;
                this.f42350c.j().G().a("Service connected with null binder");
                return;
            }
            p085i4.InterfaceC6654f c6365e2 = null;
            try {
                java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c6365e2 = iInterfaceQueryLocalInterface instanceof p085i4.InterfaceC6654f ? (p085i4.InterfaceC6654f) iInterfaceQueryLocalInterface : new com.google.android.gms.measurement.internal.C6365e2(iBinder);
                    this.f42350c.j().K().a("Bound to IMeasurementService interface");
                } else {
                    this.f42350c.j().G().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (android.os.RemoteException unused) {
                this.f42350c.j().G().a("Service connect failed to get IMeasurementService");
            }
            if (c6365e2 == null) {
                this.f42348a = false;
                try {
                    U3.b.b().c(this.f42350c.a(), this.f42350c.f41802c);
                } catch (java.lang.IllegalArgumentException unused2) {
                }
            } else {
                this.f42350c.l().D(new com.google.android.gms.measurement.internal.RunnableC6354c5(this, c6365e2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        Q3.AbstractC1477p.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f42350c.j().F().a("Service disconnected");
        this.f42350c.l().D(new com.google.android.gms.measurement.internal.RunnableC6375f5(this, componentName));
    }

    @Override // Q3.AbstractC1464c.b
    public final void q0(N3.C1389b c1389b) {
        Q3.AbstractC1477p.e("MeasurementServiceConnection.onConnectionFailed");
        com.google.android.gms.measurement.internal.C6428n2 c6428n2E = this.f42350c.f42679a.E();
        if (c6428n2E != null) {
            c6428n2E.L().b("Service connection failed", c1389b);
        }
        synchronized (this) {
            this.f42348a = false;
            this.f42349b = null;
        }
        this.f42350c.l().D(new com.google.android.gms.measurement.internal.RunnableC6382g5(this));
    }

    @Override // Q3.AbstractC1464c.a
    public final void y0(int i6) {
        Q3.AbstractC1477p.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f42350c.j().F().a("Service connection suspended");
        this.f42350c.l().D(new com.google.android.gms.measurement.internal.RunnableC6389h5(this));
    }
}
