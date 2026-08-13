package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ie0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2456Ie0 implements android.hardware.SensorEventListener {
    protected AbstractC2456Ie0(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.C2419He0.a();
        com.google.android.gms.internal.ads.C2382Ge0.a();
    }

    public abstract void a(android.hardware.SensorEvent sensorEvent);

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i6) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        a(sensorEvent);
    }
}
