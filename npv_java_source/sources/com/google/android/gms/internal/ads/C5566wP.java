package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5566wP extends com.google.android.gms.internal.ads.AbstractC2456Ie0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.hardware.SensorManager f39589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.hardware.Sensor f39590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f39591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Float f39592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f39593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f39595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5456vP f39597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f39598j;

    C5566wP(android.content.Context context) {
        super("FlickDetector", "ads");
        this.f39591c = 0.0f;
        this.f39592d = java.lang.Float.valueOf(0.0f);
        this.f39593e = p174r3.v.c().a();
        this.f39594f = 0;
        this.f39595g = false;
        this.f39596h = false;
        this.f39597i = null;
        this.f39598j = false;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.f39589a = sensorManager;
        if (sensorManager != null) {
            this.f39590b = sensorManager.getDefaultSensor(4);
        } else {
            this.f39590b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2456Ie0
    public final void a(android.hardware.SensorEvent sensorEvent) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25468X8)).booleanValue()) {
            long jA = p174r3.v.c().a();
            if (this.f39593e + ((long) ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25489Z8)).intValue()) < jA) {
                this.f39594f = 0;
                this.f39593e = jA;
                this.f39595g = false;
                this.f39596h = false;
                this.f39591c = this.f39592d.floatValue();
            }
            java.lang.Float fValueOf = java.lang.Float.valueOf(this.f39592d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f39592d = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f6 = this.f39591c;
            com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25479Y8;
            if (fFloatValue > f6 + ((java.lang.Float) p184s3.A.c().a(abstractC5037rf)).floatValue()) {
                this.f39591c = this.f39592d.floatValue();
                this.f39596h = true;
            } else if (this.f39592d.floatValue() < this.f39591c - ((java.lang.Float) p184s3.A.c().a(abstractC5037rf)).floatValue()) {
                this.f39591c = this.f39592d.floatValue();
                this.f39595g = true;
            }
            if (this.f39592d.isInfinite()) {
                this.f39592d = java.lang.Float.valueOf(0.0f);
                this.f39591c = 0.0f;
            }
            if (this.f39595g && this.f39596h) {
                p214v3.AbstractC7265q0.k("Flick detected.");
                this.f39593e = jA;
                int i6 = this.f39594f + 1;
                this.f39594f = i6;
                this.f39595g = false;
                this.f39596h = false;
                com.google.android.gms.internal.ads.InterfaceC5456vP interfaceC5456vP = this.f39597i;
                if (interfaceC5456vP != null) {
                    if (i6 == ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25500a9)).intValue()) {
                        com.google.android.gms.internal.ads.KP kp = (com.google.android.gms.internal.ads.KP) interfaceC5456vP;
                        kp.i(new com.google.android.gms.internal.ads.IP(kp), com.google.android.gms.internal.ads.JP.GESTURE);
                    }
                }
            }
        }
    }

    public final void b() {
        android.hardware.SensorManager sensorManager;
        android.hardware.Sensor sensor;
        synchronized (this) {
            try {
                if (this.f39598j && (sensorManager = this.f39589a) != null && (sensor = this.f39590b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f39598j = false;
                    p214v3.AbstractC7265q0.k("Stopped listening for flick gestures.");
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
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25468X8)).booleanValue()) {
                    if (!this.f39598j && (sensorManager = this.f39589a) != null && (sensor = this.f39590b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f39598j = true;
                        p214v3.AbstractC7265q0.k("Listening for flick gestures.");
                    }
                    if (this.f39589a == null || this.f39590b == null) {
                        p224w3.p.g("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void d(com.google.android.gms.internal.ads.InterfaceC5456vP interfaceC5456vP) {
        this.f39597i = interfaceC5456vP;
    }
}
