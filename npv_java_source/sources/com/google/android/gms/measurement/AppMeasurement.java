package com.google.android.gms.measurement;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile com.google.android.gms.measurement.AppMeasurement f41681b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.measurement.AppMeasurement.a f41682a;

    public static class ConditionalUserProperty {

        @androidx.annotation.Keep
        public boolean mActive;

        @androidx.annotation.Keep
        public java.lang.String mAppId;

        @androidx.annotation.Keep
        public long mCreationTimestamp;

        @androidx.annotation.Keep
        public java.lang.String mExpiredEventName;

        @androidx.annotation.Keep
        public android.os.Bundle mExpiredEventParams;

        @androidx.annotation.Keep
        public java.lang.String mName;

        @androidx.annotation.Keep
        public java.lang.String mOrigin;

        @androidx.annotation.Keep
        public long mTimeToLive;

        @androidx.annotation.Keep
        public java.lang.String mTimedOutEventName;

        @androidx.annotation.Keep
        public android.os.Bundle mTimedOutEventParams;

        @androidx.annotation.Keep
        public java.lang.String mTriggerEventName;

        @androidx.annotation.Keep
        public long mTriggerTimeout;

        @androidx.annotation.Keep
        public java.lang.String mTriggeredEventName;

        @androidx.annotation.Keep
        public android.os.Bundle mTriggeredEventParams;

        @androidx.annotation.Keep
        public long mTriggeredTimestamp;

        @androidx.annotation.Keep
        public java.lang.Object mValue;

        ConditionalUserProperty(android.os.Bundle bundle) {
            Q3.AbstractC1477p.l(bundle);
            this.mAppId = (java.lang.String) p085i4.o.a(bundle, "app_id", java.lang.String.class, null);
            this.mOrigin = (java.lang.String) p085i4.o.a(bundle, "origin", java.lang.String.class, null);
            this.mName = (java.lang.String) p085i4.o.a(bundle, "name", java.lang.String.class, null);
            this.mValue = p085i4.o.a(bundle, "value", java.lang.Object.class, null);
            this.mTriggerEventName = (java.lang.String) p085i4.o.a(bundle, "trigger_event_name", java.lang.String.class, null);
            this.mTriggerTimeout = ((java.lang.Long) p085i4.o.a(bundle, "trigger_timeout", java.lang.Long.class, 0L)).longValue();
            this.mTimedOutEventName = (java.lang.String) p085i4.o.a(bundle, "timed_out_event_name", java.lang.String.class, null);
            this.mTimedOutEventParams = (android.os.Bundle) p085i4.o.a(bundle, "timed_out_event_params", android.os.Bundle.class, null);
            this.mTriggeredEventName = (java.lang.String) p085i4.o.a(bundle, "triggered_event_name", java.lang.String.class, null);
            this.mTriggeredEventParams = (android.os.Bundle) p085i4.o.a(bundle, "triggered_event_params", android.os.Bundle.class, null);
            this.mTimeToLive = ((java.lang.Long) p085i4.o.a(bundle, "time_to_live", java.lang.Long.class, 0L)).longValue();
            this.mExpiredEventName = (java.lang.String) p085i4.o.a(bundle, "expired_event_name", java.lang.String.class, null);
            this.mExpiredEventParams = (android.os.Bundle) p085i4.o.a(bundle, "expired_event_params", android.os.Bundle.class, null);
            this.mActive = ((java.lang.Boolean) p085i4.o.a(bundle, "active", java.lang.Boolean.class, java.lang.Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((java.lang.Long) p085i4.o.a(bundle, "creation_timestamp", java.lang.Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((java.lang.Long) p085i4.o.a(bundle, "triggered_timestamp", java.lang.Long.class, 0L)).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class a implements p085i4.z {
        private a() {
        }
    }

    private AppMeasurement(com.google.android.gms.measurement.internal.S2 s6) {
        this.f41682a = new com.google.android.gms.measurement.b(s6);
    }

    private AppMeasurement(p085i4.z zVar) {
        this.f41682a = new com.google.android.gms.measurement.a(zVar);
    }

    private static com.google.android.gms.measurement.AppMeasurement a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (f41681b == null) {
            synchronized (com.google.android.gms.measurement.AppMeasurement.class) {
                try {
                    if (f41681b == null) {
                        p085i4.z zVarB = b(context, null);
                        if (zVarB != null) {
                            f41681b = new com.google.android.gms.measurement.AppMeasurement(zVarB);
                        } else {
                            f41681b = new com.google.android.gms.measurement.AppMeasurement(com.google.android.gms.measurement.internal.S2.c(context, new com.google.android.gms.internal.measurement.C5979c1(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return f41681b;
    }

    private static p085i4.z b(android.content.Context context, android.os.Bundle bundle) {
        return (p085i4.z) com.google.firebase.analytics.FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", android.content.Context.class, android.os.Bundle.class).invoke(null, context, null);
    }

    @androidx.annotation.Keep
    @java.lang.Deprecated
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context context) {
        return a(context, null, null);
    }

    @androidx.annotation.Keep
    public void beginAdUnitExposure(java.lang.String str) {
        this.f41682a.y(str);
    }

    @androidx.annotation.Keep
    public void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.f41682a.a(str, str2, bundle);
    }

    @androidx.annotation.Keep
    public void endAdUnitExposure(java.lang.String str) {
        this.f41682a.E(str);
    }

    @androidx.annotation.Keep
    public long generateEventId() {
        return this.f41682a.e();
    }

    @androidx.annotation.Keep
    public java.lang.String getAppInstanceId() {
        return this.f41682a.i();
    }

    @androidx.annotation.Keep
    public java.util.List<com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty> getConditionalUserProperties(java.lang.String str, java.lang.String str2) {
        java.util.List listC = this.f41682a.c(str, str2);
        java.util.ArrayList arrayList = new java.util.ArrayList(listC == null ? 0 : listC.size());
        java.util.Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty((android.os.Bundle) it.next()));
        }
        return arrayList;
    }

    @androidx.annotation.Keep
    public java.lang.String getCurrentScreenClass() {
        return this.f41682a.g();
    }

    @androidx.annotation.Keep
    public java.lang.String getCurrentScreenName() {
        return this.f41682a.h();
    }

    @androidx.annotation.Keep
    public java.lang.String getGmpAppId() {
        return this.f41682a.j();
    }

    @androidx.annotation.Keep
    public int getMaxUserProperties(java.lang.String str) {
        return this.f41682a.o(str);
    }

    @androidx.annotation.Keep
    protected java.util.Map<java.lang.String, java.lang.Object> getUserProperties(java.lang.String str, java.lang.String str2, boolean z6) {
        return this.f41682a.b(str, str2, z6);
    }

    @androidx.annotation.Keep
    public void logEventInternal(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.f41682a.d(str, str2, bundle);
    }

    @androidx.annotation.Keep
    public void setConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        Q3.AbstractC1477p.l(conditionalUserProperty);
        com.google.android.gms.measurement.AppMeasurement.a aVar = this.f41682a;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        java.lang.String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        java.lang.String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        java.lang.Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            p085i4.o.b(bundle, obj);
        }
        java.lang.String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        java.lang.String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        android.os.Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        java.lang.String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        android.os.Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        java.lang.String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        android.os.Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        aVar.e0(bundle);
    }
}
