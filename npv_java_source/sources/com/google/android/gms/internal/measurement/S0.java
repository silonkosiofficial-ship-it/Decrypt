package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S0 extends com.google.android.gms.internal.measurement.AbstractBinderC5969b0 implements com.google.android.gms.internal.measurement.P0 {
    public S0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static com.google.android.gms.internal.measurement.P0 asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.P0 ? (com.google.android.gms.internal.measurement.P0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.R0(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC5969b0
    protected final boolean q0(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        com.google.android.gms.internal.measurement.U0 w6;
        com.google.android.gms.internal.measurement.U0 w10 = null;
        com.google.android.gms.internal.measurement.U0 w11 = null;
        com.google.android.gms.internal.measurement.U0 w12 = null;
        com.google.android.gms.internal.measurement.U0 w13 = null;
        com.google.android.gms.internal.measurement.V0 x6 = null;
        com.google.android.gms.internal.measurement.V0 x10 = null;
        com.google.android.gms.internal.measurement.V0 x11 = null;
        com.google.android.gms.internal.measurement.U0 w14 = null;
        com.google.android.gms.internal.measurement.U0 w15 = null;
        com.google.android.gms.internal.measurement.U0 w16 = null;
        com.google.android.gms.internal.measurement.U0 w17 = null;
        com.google.android.gms.internal.measurement.U0 w18 = null;
        com.google.android.gms.internal.measurement.U0 w19 = null;
        com.google.android.gms.internal.measurement.InterfaceC5961a1 z6 = null;
        com.google.android.gms.internal.measurement.U0 w20 = null;
        com.google.android.gms.internal.measurement.U0 w21 = null;
        com.google.android.gms.internal.measurement.U0 w22 = null;
        com.google.android.gms.internal.measurement.U0 w23 = null;
        switch (i6) {
            case 1:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.measurement.C5979c1 c5979c1 = (com.google.android.gms.internal.measurement.C5979c1) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.internal.measurement.C5979c1.CREATOR);
                long j6 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                initialize(aVarY0, c5979c1, j6);
                break;
            case 2:
                java.lang.String string = parcel.readString();
                java.lang.String string2 = parcel.readString();
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
                boolean zH = com.google.android.gms.internal.measurement.AbstractC5960a0.h(parcel);
                boolean zH2 = com.google.android.gms.internal.measurement.AbstractC5960a0.h(parcel);
                long j10 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                logEvent(string, string2, bundle, zH, zH2, j10);
                break;
            case 3:
                java.lang.String string3 = parcel.readString();
                java.lang.String string4 = parcel.readString();
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    w6 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w6 = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.W0(strongBinder);
                }
                long j11 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                logEventAndBundle(string3, string4, bundle2, w6, j11);
                break;
            case 4:
                java.lang.String string5 = parcel.readString();
                java.lang.String string6 = parcel.readString();
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                boolean zH3 = com.google.android.gms.internal.measurement.AbstractC5960a0.h(parcel);
                long j12 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setUserProperty(string5, string6, aVarY1, zH3, j12);
                break;
            case 5:
                java.lang.String string7 = parcel.readString();
                java.lang.String string8 = parcel.readString();
                boolean zH4 = com.google.android.gms.internal.measurement.AbstractC5960a0.h(parcel);
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w10 = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.measurement.W0(strongBinder2);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                getUserProperties(string7, string8, zH4, w10);
                break;
            case 6:
                java.lang.String string9 = parcel.readString();
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w23 = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface3 : new com.google.android.gms.internal.measurement.W0(strongBinder3);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                getMaxUserProperties(string9, w23);
                break;
            case 7:
                java.lang.String string10 = parcel.readString();
                long j13 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setUserId(string10, j13);
                break;
            case 8:
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
                long j14 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setConditionalUserProperty(bundle3, j14);
                break;
            case 9:
                java.lang.String string11 = parcel.readString();
                java.lang.String string12 = parcel.readString();
                android.os.Bundle bundle4 = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                java.lang.String string13 = parcel.readString();
                java.lang.String string14 = parcel.readString();
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w22 = iInterfaceQueryLocalInterface4 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface4 : new com.google.android.gms.internal.measurement.W0(strongBinder4);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                getConditionalUserProperties(string13, string14, w22);
                break;
            case 11:
                boolean zH5 = com.google.android.gms.internal.measurement.AbstractC5960a0.h(parcel);
                long j15 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setMeasurementEnabled(zH5, j15);
                break;
            case 12:
                long j16 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                resetAnalyticsData(j16);
                break;
            case 13:
                long j17 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setMinimumSessionDuration(j17);
                break;
            case 14:
                long j18 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setSessionTimeoutDuration(j18);
                break;
            case 15:
                X3.a aVarY2 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                java.lang.String string15 = parcel.readString();
                java.lang.String string16 = parcel.readString();
                long j19 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setCurrentScreen(aVarY2, string15, string16, j19);
                break;
            case 16:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w21 = iInterfaceQueryLocalInterface5 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface5 : new com.google.android.gms.internal.measurement.W0(strongBinder5);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                getCurrentScreenName(w21);
                break;
            case 17:
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w20 = iInterfaceQueryLocalInterface6 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface6 : new com.google.android.gms.internal.measurement.W0(strongBinder6);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                getCurrentScreenClass(w20);
                break;
            case 18:
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    z6 = iInterfaceQueryLocalInterface7 instanceof com.google.android.gms.internal.measurement.InterfaceC5961a1 ? (com.google.android.gms.internal.measurement.InterfaceC5961a1) iInterfaceQueryLocalInterface7 : new com.google.android.gms.internal.measurement.Z0(strongBinder7);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setInstanceIdProvider(z6);
                break;
            case 19:
                android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w19 = iInterfaceQueryLocalInterface8 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface8 : new com.google.android.gms.internal.measurement.W0(strongBinder8);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                getCachedAppInstanceId(w19);
                break;
            case 20:
                android.os.IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w18 = iInterfaceQueryLocalInterface9 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface9 : new com.google.android.gms.internal.measurement.W0(strongBinder9);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                getAppInstanceId(w18);
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                android.os.IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w17 = iInterfaceQueryLocalInterface10 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface10 : new com.google.android.gms.internal.measurement.W0(strongBinder10);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                getGmpAppId(w17);
                break;
            case 22:
                android.os.IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w16 = iInterfaceQueryLocalInterface11 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface11 : new com.google.android.gms.internal.measurement.W0(strongBinder11);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                generateEventId(w16);
                break;
            case 23:
                java.lang.String string17 = parcel.readString();
                long j20 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                beginAdUnitExposure(string17, j20);
                break;
            case 24:
                java.lang.String string18 = parcel.readString();
                long j21 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                endAdUnitExposure(string18, j21);
                break;
            case 25:
                X3.a aVarY3 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                onActivityStarted(aVarY3, j22);
                break;
            case 26:
                X3.a aVarY4 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                onActivityStopped(aVarY4, j23);
                break;
            case 27:
                X3.a aVarY5 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                android.os.Bundle bundle5 = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
                long j24 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                onActivityCreated(aVarY5, bundle5, j24);
                break;
            case 28:
                X3.a aVarY6 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                onActivityDestroyed(aVarY6, j25);
                break;
            case 29:
                X3.a aVarY7 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                onActivityPaused(aVarY7, j26);
                break;
            case 30:
                X3.a aVarY8 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                onActivityResumed(aVarY8, j27);
                break;
            case 31:
                X3.a aVarY9 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                android.os.IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w15 = iInterfaceQueryLocalInterface12 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface12 : new com.google.android.gms.internal.measurement.W0(strongBinder12);
                }
                long j28 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                onActivitySaveInstanceState(aVarY9, w15, j28);
                break;
            case 32:
                android.os.Bundle bundle6 = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
                android.os.IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w14 = iInterfaceQueryLocalInterface13 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface13 : new com.google.android.gms.internal.measurement.W0(strongBinder13);
                }
                long j29 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                performAction(bundle6, w14, j29);
                break;
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                int i11 = parcel.readInt();
                java.lang.String string19 = parcel.readString();
                X3.a aVarY10 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                X3.a aVarY11 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                X3.a aVarY12 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                logHealthData(i11, string19, aVarY10, aVarY11, aVarY12);
                break;
            case 34:
                android.os.IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    x11 = iInterfaceQueryLocalInterface14 instanceof com.google.android.gms.internal.measurement.V0 ? (com.google.android.gms.internal.measurement.V0) iInterfaceQueryLocalInterface14 : new com.google.android.gms.internal.measurement.X0(strongBinder14);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setEventInterceptor(x11);
                break;
            case 35:
                android.os.IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    x10 = iInterfaceQueryLocalInterface15 instanceof com.google.android.gms.internal.measurement.V0 ? (com.google.android.gms.internal.measurement.V0) iInterfaceQueryLocalInterface15 : new com.google.android.gms.internal.measurement.X0(strongBinder15);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                registerOnMeasurementEventListener(x10);
                break;
            case 36:
                android.os.IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    x6 = iInterfaceQueryLocalInterface16 instanceof com.google.android.gms.internal.measurement.V0 ? (com.google.android.gms.internal.measurement.V0) iInterfaceQueryLocalInterface16 : new com.google.android.gms.internal.measurement.X0(strongBinder16);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                unregisterOnMeasurementEventListener(x6);
                break;
            case 37:
                java.util.HashMap mapB = com.google.android.gms.internal.measurement.AbstractC5960a0.b(parcel);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                initForTests(mapB);
                break;
            case 38:
                android.os.IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w13 = iInterfaceQueryLocalInterface17 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface17 : new com.google.android.gms.internal.measurement.W0(strongBinder17);
                }
                int i12 = parcel.readInt();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                getTestFlag(w13, i12);
                break;
            case 39:
                boolean zH6 = com.google.android.gms.internal.measurement.AbstractC5960a0.h(parcel);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setDataCollectionEnabled(zH6);
                break;
            case 40:
                android.os.IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w12 = iInterfaceQueryLocalInterface18 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface18 : new com.google.android.gms.internal.measurement.W0(strongBinder18);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                isDataCollectionEnabled(w12);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                android.os.Bundle bundle7 = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j30 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                clearMeasurementEnabled(j30);
                break;
            case 44:
                android.os.Bundle bundle8 = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
                long j31 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setConsent(bundle8, j31);
                break;
            case 45:
                android.os.Bundle bundle9 = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
                long j32 = parcel.readLong();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setConsentThirdParty(bundle9, j32);
                break;
            case 46:
                android.os.IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w11 = iInterfaceQueryLocalInterface19 instanceof com.google.android.gms.internal.measurement.U0 ? (com.google.android.gms.internal.measurement.U0) iInterfaceQueryLocalInterface19 : new com.google.android.gms.internal.measurement.W0(strongBinder19);
                }
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                getSessionId(w11);
                break;
            case 48:
                android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.content.Intent.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                setSgtmDebugInfo(intent);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
