package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4578nQ extends com.google.android.gms.internal.ads.AbstractC2456Ie0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f37589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.hardware.SensorManager f37590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.hardware.Sensor f37591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f37592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4468mQ f37594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37595g;

    C4578nQ(android.content.Context context) {
        super("ShakeDetector", "ads");
        this.f37589a = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2456Ie0
    public final void a(android.hardware.SensorEvent sensorEvent) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25413S8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f6 = fArr[0] / 9.80665f;
            float f10 = fArr[1] / 9.80665f;
            float f11 = fArr[2] / 9.80665f;
            if (((float) java.lang.Math.sqrt((f6 * f6) + (f10 * f10) + (f11 * f11))) >= ((java.lang.Float) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25424T8)).floatValue()) {
                long jA = p174r3.v.c().a();
                if (this.f37592d + ((long) ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25435U8)).intValue()) <= jA) {
                    if (this.f37592d + ((long) ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25446V8)).intValue()) < jA) {
                        this.f37593e = 0;
                    }
                    p214v3.AbstractC7265q0.k("Shake detected.");
                    this.f37592d = jA;
                    int i6 = this.f37593e + 1;
                    this.f37593e = i6;
                    com.google.android.gms.internal.ads.InterfaceC4468mQ interfaceC4468mQ = this.f37594f;
                    if (interfaceC4468mQ != null) {
                        if (i6 == ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25457W8)).intValue()) {
                            com.google.android.gms.internal.ads.KP kp = (com.google.android.gms.internal.ads.KP) interfaceC4468mQ;
                            kp.i(new com.google.android.gms.internal.ads.HP(kp), com.google.android.gms.internal.ads.JP.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (this.f37595g) {
                    android.hardware.SensorManager sensorManager = this.f37590b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f37591c);
                        p214v3.AbstractC7265q0.k("Stopped listening for shake gestures.");
                    }
                    this.f37595g = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        android.hardware.SensorManager sensorManager;
        android.hardware.Sensor sensor;
        synchronized (this) {
            try {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25413S8)).booleanValue()) {
                    if (this.f37590b == null) {
                        android.hardware.SensorManager sensorManager2 = (android.hardware.SensorManager) this.f37589a.getSystemService("sensor");
                        this.f37590b = sensorManager2;
                        if (sensorManager2 == null) {
                            p224w3.p.g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f37591c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f37595g && (sensorManager = this.f37590b) != null && (sensor = this.f37591c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f37592d = p174r3.v.c().a() - ((long) ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25435U8)).intValue());
                        this.f37595g = true;
                        p214v3.AbstractC7265q0.k("Listening for shake gestures.");
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void d(com.google.android.gms.internal.ads.InterfaceC4468mQ interfaceC4468mQ) {
        this.f37594f = interfaceC4468mQ;
    }
}
