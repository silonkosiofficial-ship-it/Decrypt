package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public interface P0 extends android.os.IInterface {
    void beginAdUnitExposure(java.lang.String str, long j6);

    void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle);

    void clearMeasurementEnabled(long j6);

    void endAdUnitExposure(java.lang.String str, long j6);

    void generateEventId(com.google.android.gms.internal.measurement.U0 u6);

    void getAppInstanceId(com.google.android.gms.internal.measurement.U0 u6);

    void getCachedAppInstanceId(com.google.android.gms.internal.measurement.U0 u6);

    void getConditionalUserProperties(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.U0 u6);

    void getCurrentScreenClass(com.google.android.gms.internal.measurement.U0 u6);

    void getCurrentScreenName(com.google.android.gms.internal.measurement.U0 u6);

    void getGmpAppId(com.google.android.gms.internal.measurement.U0 u6);

    void getMaxUserProperties(java.lang.String str, com.google.android.gms.internal.measurement.U0 u6);

    void getSessionId(com.google.android.gms.internal.measurement.U0 u6);

    void getTestFlag(com.google.android.gms.internal.measurement.U0 u6, int i6);

    void getUserProperties(java.lang.String str, java.lang.String str2, boolean z6, com.google.android.gms.internal.measurement.U0 u6);

    void initForTests(java.util.Map map);

    void initialize(X3.a aVar, com.google.android.gms.internal.measurement.C5979c1 c5979c1, long j6);

    void isDataCollectionEnabled(com.google.android.gms.internal.measurement.U0 u6);

    void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z6, boolean z10, long j6);

    void logEventAndBundle(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.google.android.gms.internal.measurement.U0 u6, long j6);

    void logHealthData(int i6, java.lang.String str, X3.a aVar, X3.a aVar2, X3.a aVar3);

    void onActivityCreated(X3.a aVar, android.os.Bundle bundle, long j6);

    void onActivityDestroyed(X3.a aVar, long j6);

    void onActivityPaused(X3.a aVar, long j6);

    void onActivityResumed(X3.a aVar, long j6);

    void onActivitySaveInstanceState(X3.a aVar, com.google.android.gms.internal.measurement.U0 u6, long j6);

    void onActivityStarted(X3.a aVar, long j6);

    void onActivityStopped(X3.a aVar, long j6);

    void performAction(android.os.Bundle bundle, com.google.android.gms.internal.measurement.U0 u6, long j6);

    void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.V0 v6);

    void resetAnalyticsData(long j6);

    void setConditionalUserProperty(android.os.Bundle bundle, long j6);

    void setConsent(android.os.Bundle bundle, long j6);

    void setConsentThirdParty(android.os.Bundle bundle, long j6);

    void setCurrentScreen(X3.a aVar, java.lang.String str, java.lang.String str2, long j6);

    void setDataCollectionEnabled(boolean z6);

    void setDefaultEventParameters(android.os.Bundle bundle);

    void setEventInterceptor(com.google.android.gms.internal.measurement.V0 v6);

    void setInstanceIdProvider(com.google.android.gms.internal.measurement.InterfaceC5961a1 interfaceC5961a1);

    void setMeasurementEnabled(boolean z6, long j6);

    void setMinimumSessionDuration(long j6);

    void setSessionTimeoutDuration(long j6);

    void setSgtmDebugInfo(android.content.Intent intent);

    void setUserId(java.lang.String str, long j6);

    void setUserProperty(java.lang.String str, java.lang.String str2, X3.a aVar, boolean z6, long j6);

    void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.V0 v6);
}
