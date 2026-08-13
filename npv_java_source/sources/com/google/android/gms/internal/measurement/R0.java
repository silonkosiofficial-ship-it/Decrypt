package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class R0 extends com.google.android.gms.internal.measurement.Y implements com.google.android.gms.internal.measurement.P0 {
    R0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void beginAdUnitExposure(java.lang.String str, long j6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeLong(j6);
        L0(23, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, bundle);
        L0(9, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void endAdUnitExposure(java.lang.String str, long j6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeLong(j6);
        L0(24, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void generateEventId(com.google.android.gms.internal.measurement.U0 u6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, u6);
        L0(22, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCachedAppInstanceId(com.google.android.gms.internal.measurement.U0 u6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, u6);
        L0(19, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getConditionalUserProperties(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.U0 u6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, u6);
        L0(10, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCurrentScreenClass(com.google.android.gms.internal.measurement.U0 u6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, u6);
        L0(17, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCurrentScreenName(com.google.android.gms.internal.measurement.U0 u6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, u6);
        L0(16, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getGmpAppId(com.google.android.gms.internal.measurement.U0 u6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, u6);
        L0(21, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getMaxUserProperties(java.lang.String str, com.google.android.gms.internal.measurement.U0 u6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, u6);
        L0(6, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getUserProperties(java.lang.String str, java.lang.String str2, boolean z6, com.google.android.gms.internal.measurement.U0 u6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.measurement.AbstractC5960a0.e(parcelQ0, z6);
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, u6);
        L0(5, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void initialize(X3.a aVar, com.google.android.gms.internal.measurement.C5979c1 c5979c1, long j6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, aVar);
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, c5979c1);
        parcelQ0.writeLong(j6);
        L0(1, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z6, boolean z10, long j6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, bundle);
        com.google.android.gms.internal.measurement.AbstractC5960a0.e(parcelQ0, z6);
        com.google.android.gms.internal.measurement.AbstractC5960a0.e(parcelQ0, z10);
        parcelQ0.writeLong(j6);
        L0(2, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void logHealthData(int i6, java.lang.String str, X3.a aVar, X3.a aVar2, X3.a aVar3) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        parcelQ0.writeString(str);
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, aVar);
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, aVar2);
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, aVar3);
        L0(33, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityCreated(X3.a aVar, android.os.Bundle bundle, long j6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, aVar);
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, bundle);
        parcelQ0.writeLong(j6);
        L0(27, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityDestroyed(X3.a aVar, long j6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, aVar);
        parcelQ0.writeLong(j6);
        L0(28, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityPaused(X3.a aVar, long j6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, aVar);
        parcelQ0.writeLong(j6);
        L0(29, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityResumed(X3.a aVar, long j6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, aVar);
        parcelQ0.writeLong(j6);
        L0(30, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivitySaveInstanceState(X3.a aVar, com.google.android.gms.internal.measurement.U0 u6, long j6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, aVar);
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, u6);
        parcelQ0.writeLong(j6);
        L0(31, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityStarted(X3.a aVar, long j6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, aVar);
        parcelQ0.writeLong(j6);
        L0(25, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityStopped(X3.a aVar, long j6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, aVar);
        parcelQ0.writeLong(j6);
        L0(26, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void performAction(android.os.Bundle bundle, com.google.android.gms.internal.measurement.U0 u6, long j6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, bundle);
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, u6);
        parcelQ0.writeLong(j6);
        L0(32, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.V0 v6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, v6);
        L0(35, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setConditionalUserProperty(android.os.Bundle bundle, long j6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, bundle);
        parcelQ0.writeLong(j6);
        L0(8, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setConsent(android.os.Bundle bundle, long j6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, bundle);
        parcelQ0.writeLong(j6);
        L0(44, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setCurrentScreen(X3.a aVar, java.lang.String str, java.lang.String str2, long j6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, aVar);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        parcelQ0.writeLong(j6);
        L0(15, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setDataCollectionEnabled(boolean z6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.e(parcelQ0, z6);
        L0(39, parcelQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setUserProperty(java.lang.String str, java.lang.String str2, X3.a aVar, boolean z6, long j6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.measurement.AbstractC5960a0.c(parcelQ0, aVar);
        com.google.android.gms.internal.measurement.AbstractC5960a0.e(parcelQ0, z6);
        parcelQ0.writeLong(j6);
        L0(4, parcelQ0);
    }
}
