package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.util.DynamiteApi
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.S0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    com.google.android.gms.measurement.internal.S2 f41716C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.Map f41717D = new p170r.C7026a();

    class a implements p085i4.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.measurement.V0 f41718a;

        a(com.google.android.gms.internal.measurement.V0 v6) {
            this.f41718a = v6;
        }

        @Override // p085i4.u
        public final void a(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j6) {
            try {
                this.f41718a.d4(str, str2, bundle, j6);
            } catch (android.os.RemoteException e6) {
                com.google.android.gms.measurement.internal.S2 s6 = com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.this.f41716C;
                if (s6 != null) {
                    s6.j().L().b("Event interceptor threw exception", e6);
                }
            }
        }
    }

    class b implements p085i4.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.measurement.V0 f41720a;

        b(com.google.android.gms.internal.measurement.V0 v6) {
            this.f41720a = v6;
        }

        @Override // p085i4.t
        public final void a(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j6) {
            try {
                this.f41720a.d4(str, str2, bundle, j6);
            } catch (android.os.RemoteException e6) {
                com.google.android.gms.measurement.internal.S2 s6 = com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.this.f41716C;
                if (s6 != null) {
                    s6.j().L().b("Event listener threw exception", e6);
                }
            }
        }
    }

    private final void L0(com.google.android.gms.internal.measurement.U0 u6, java.lang.String str) {
        y0();
        this.f41716C.L().S(u6, str);
    }

    private final void y0() {
        if (this.f41716C == null) {
            throw new java.lang.IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void beginAdUnitExposure(java.lang.String str, long j6) {
        y0();
        this.f41716C.y().z(str, j6);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        y0();
        this.f41716C.H().h0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void clearMeasurementEnabled(long j6) {
        y0();
        this.f41716C.H().b0(null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void endAdUnitExposure(java.lang.String str, long j6) {
        y0();
        this.f41716C.y().D(str, j6);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void generateEventId(com.google.android.gms.internal.measurement.U0 u6) {
        y0();
        long jR0 = this.f41716C.L().R0();
        y0();
        this.f41716C.L().Q(u6, jR0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getAppInstanceId(com.google.android.gms.internal.measurement.U0 u6) {
        y0();
        this.f41716C.l().D(new com.google.android.gms.measurement.internal.U2(this, u6));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.U0 u6) {
        y0();
        L0(u6, this.f41716C.H().v0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getConditionalUserProperties(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.U0 u6) {
        y0();
        this.f41716C.l().D(new com.google.android.gms.measurement.internal.RunnableC6437o4(this, u6, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.U0 u6) {
        y0();
        L0(u6, this.f41716C.H().w0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.U0 u6) {
        y0();
        L0(u6, this.f41716C.H().x0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getGmpAppId(com.google.android.gms.internal.measurement.U0 u6) {
        y0();
        L0(u6, this.f41716C.H().y0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getMaxUserProperties(java.lang.String str, com.google.android.gms.internal.measurement.U0 u6) {
        y0();
        this.f41716C.H();
        com.google.android.gms.measurement.internal.F3.E(str);
        y0();
        this.f41716C.L().P(u6, 25);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getSessionId(com.google.android.gms.internal.measurement.U0 u6) {
        y0();
        this.f41716C.H().P(u6);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getTestFlag(com.google.android.gms.internal.measurement.U0 u6, int i6) {
        y0();
        if (i6 == 0) {
            this.f41716C.L().S(u6, this.f41716C.H().z0());
            return;
        }
        if (i6 == 1) {
            this.f41716C.L().Q(u6, this.f41716C.H().u0().longValue());
            return;
        }
        if (i6 != 2) {
            if (i6 == 3) {
                this.f41716C.L().P(u6, this.f41716C.H().t0().intValue());
                return;
            } else {
                if (i6 != 4) {
                    return;
                }
                this.f41716C.L().U(u6, this.f41716C.H().r0().booleanValue());
                return;
            }
        }
        com.google.android.gms.measurement.internal.d6 d6VarL = this.f41716C.L();
        double dDoubleValue = this.f41716C.H().s0().doubleValue();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            u6.e0(bundle);
        } catch (android.os.RemoteException e6) {
            d6VarL.f42679a.j().L().b("Error returning double value to wrapper", e6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getUserProperties(java.lang.String str, java.lang.String str2, boolean z6, com.google.android.gms.internal.measurement.U0 u6) {
        y0();
        this.f41716C.l().D(new com.google.android.gms.measurement.internal.RunnableC6484v3(this, u6, str, str2, z6));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void initForTests(java.util.Map map) {
        y0();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void initialize(X3.a aVar, com.google.android.gms.internal.measurement.C5979c1 c5979c1, long j6) {
        com.google.android.gms.measurement.internal.S2 s6 = this.f41716C;
        if (s6 == null) {
            this.f41716C = com.google.android.gms.measurement.internal.S2.c((android.content.Context) Q3.AbstractC1477p.l((android.content.Context) X3.b.L0(aVar)), c5979c1, java.lang.Long.valueOf(j6));
        } else {
            s6.j().L().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.U0 u6) {
        y0();
        this.f41716C.l().D(new com.google.android.gms.measurement.internal.RunnableC6431n5(this, u6));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z6, boolean z10, long j6) {
        y0();
        this.f41716C.H().j0(str, str2, bundle, z6, z10, j6);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logEventAndBundle(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.google.android.gms.internal.measurement.U0 u6, long j6) {
        y0();
        Q3.AbstractC1477p.f(str2);
        (bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle()).putString("_o", "app");
        this.f41716C.l().D(new com.google.android.gms.measurement.internal.O3(this, u6, new com.google.android.gms.measurement.internal.E(str2, new com.google.android.gms.measurement.internal.D(bundle), "app", j6), str));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logHealthData(int i6, java.lang.String str, X3.a aVar, X3.a aVar2, X3.a aVar3) {
        y0();
        this.f41716C.j().z(i6, true, false, str, aVar == null ? null : X3.b.L0(aVar), aVar2 == null ? null : X3.b.L0(aVar2), aVar3 != null ? X3.b.L0(aVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityCreated(X3.a aVar, android.os.Bundle bundle, long j6) {
        y0();
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacksP0 = this.f41716C.H().p0();
        if (activityLifecycleCallbacksP0 != null) {
            this.f41716C.H().D0();
            activityLifecycleCallbacksP0.onActivityCreated((android.app.Activity) X3.b.L0(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityDestroyed(X3.a aVar, long j6) {
        y0();
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacksP0 = this.f41716C.H().p0();
        if (activityLifecycleCallbacksP0 != null) {
            this.f41716C.H().D0();
            activityLifecycleCallbacksP0.onActivityDestroyed((android.app.Activity) X3.b.L0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityPaused(X3.a aVar, long j6) {
        y0();
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacksP0 = this.f41716C.H().p0();
        if (activityLifecycleCallbacksP0 != null) {
            this.f41716C.H().D0();
            activityLifecycleCallbacksP0.onActivityPaused((android.app.Activity) X3.b.L0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityResumed(X3.a aVar, long j6) {
        y0();
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacksP0 = this.f41716C.H().p0();
        if (activityLifecycleCallbacksP0 != null) {
            this.f41716C.H().D0();
            activityLifecycleCallbacksP0.onActivityResumed((android.app.Activity) X3.b.L0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivitySaveInstanceState(X3.a aVar, com.google.android.gms.internal.measurement.U0 u6, long j6) {
        y0();
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacksP0 = this.f41716C.H().p0();
        android.os.Bundle bundle = new android.os.Bundle();
        if (activityLifecycleCallbacksP0 != null) {
            this.f41716C.H().D0();
            activityLifecycleCallbacksP0.onActivitySaveInstanceState((android.app.Activity) X3.b.L0(aVar), bundle);
        }
        try {
            u6.e0(bundle);
        } catch (android.os.RemoteException e6) {
            this.f41716C.j().L().b("Error returning bundle value to wrapper", e6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStarted(X3.a aVar, long j6) {
        y0();
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacksP0 = this.f41716C.H().p0();
        if (activityLifecycleCallbacksP0 != null) {
            this.f41716C.H().D0();
            activityLifecycleCallbacksP0.onActivityStarted((android.app.Activity) X3.b.L0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStopped(X3.a aVar, long j6) {
        y0();
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacksP0 = this.f41716C.H().p0();
        if (activityLifecycleCallbacksP0 != null) {
            this.f41716C.H().D0();
            activityLifecycleCallbacksP0.onActivityStopped((android.app.Activity) X3.b.L0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void performAction(android.os.Bundle bundle, com.google.android.gms.internal.measurement.U0 u6, long j6) {
        y0();
        u6.e0(null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.V0 v6) {
        p085i4.t bVar;
        y0();
        synchronized (this.f41717D) {
            try {
                bVar = (p085i4.t) this.f41717D.get(java.lang.Integer.valueOf(v6.a()));
                if (bVar == null) {
                    bVar = new com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.b(v6);
                    this.f41717D.put(java.lang.Integer.valueOf(v6.a()), bVar);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.f41716C.H().Z(bVar);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void resetAnalyticsData(long j6) {
        y0();
        this.f41716C.H().I(j6);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConditionalUserProperty(android.os.Bundle bundle, long j6) {
        y0();
        if (bundle == null) {
            this.f41716C.j().G().a("Conditional user property must not be null");
        } else {
            this.f41716C.H().O0(bundle, j6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConsent(android.os.Bundle bundle, long j6) {
        y0();
        this.f41716C.H().Y0(bundle, j6);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConsentThirdParty(android.os.Bundle bundle, long j6) {
        y0();
        this.f41716C.H().d1(bundle, j6);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setCurrentScreen(X3.a aVar, java.lang.String str, java.lang.String str2, long j6) {
        y0();
        this.f41716C.I().H((android.app.Activity) X3.b.L0(aVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setDataCollectionEnabled(boolean z6) {
        y0();
        this.f41716C.H().c1(z6);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setDefaultEventParameters(android.os.Bundle bundle) {
        y0();
        this.f41716C.H().X0(bundle);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setEventInterceptor(com.google.android.gms.internal.measurement.V0 v6) {
        y0();
        com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.a aVar = new com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.a(v6);
        if (this.f41716C.l().J()) {
            this.f41716C.H().a0(aVar);
        } else {
            this.f41716C.l().D(new com.google.android.gms.measurement.internal.M4(this, aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.InterfaceC5961a1 interfaceC5961a1) {
        y0();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setMeasurementEnabled(boolean z6, long j6) {
        y0();
        this.f41716C.H().b0(java.lang.Boolean.valueOf(z6));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setMinimumSessionDuration(long j6) {
        y0();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setSessionTimeoutDuration(long j6) {
        y0();
        this.f41716C.H().W0(j6);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setSgtmDebugInfo(android.content.Intent intent) {
        y0();
        this.f41716C.H().K(intent);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setUserId(java.lang.String str, long j6) {
        y0();
        this.f41716C.H().d0(str, j6);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setUserProperty(java.lang.String str, java.lang.String str2, X3.a aVar, boolean z6, long j6) {
        y0();
        this.f41716C.H().m0(str, str2, X3.b.L0(aVar), z6, j6);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.V0 v6) {
        p085i4.t bVar;
        y0();
        synchronized (this.f41717D) {
            bVar = (p085i4.t) this.f41717D.remove(java.lang.Integer.valueOf(v6.a()));
        }
        if (bVar == null) {
            bVar = new com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.b(v6);
        }
        this.f41716C.H().R0(bVar);
    }
}
