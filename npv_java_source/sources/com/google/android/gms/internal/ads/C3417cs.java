package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3417cs extends com.google.android.gms.internal.ads.AbstractC2456Ie0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.hardware.SensorManager f34574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f34575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.view.Display f34576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f34577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f34578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f34579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.os.Handler f34580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3308bs f34581h;

    C3417cs(android.content.Context context) {
        super("OrientationMonitor", "ads");
        this.f34574a = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.f34576c = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.f34577d = new float[9];
        this.f34578e = new float[9];
        this.f34575b = new java.lang.Object();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2456Ie0
    public final void a(android.hardware.SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f34575b) {
            try {
                if (this.f34579f == null) {
                    this.f34579f = new float[9];
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        android.hardware.SensorManager.getRotationMatrixFromVector(this.f34577d, fArr);
        int rotation = this.f34576c.getRotation();
        if (rotation == 1) {
            android.hardware.SensorManager.remapCoordinateSystem(this.f34577d, 2, 129, this.f34578e);
        } else if (rotation == 2) {
            android.hardware.SensorManager.remapCoordinateSystem(this.f34577d, 129, 130, this.f34578e);
        } else if (rotation != 3) {
            java.lang.System.arraycopy(this.f34577d, 0, this.f34578e, 0, 9);
        } else {
            android.hardware.SensorManager.remapCoordinateSystem(this.f34577d, 130, 1, this.f34578e);
        }
        float[] fArr2 = this.f34578e;
        float f6 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f6;
        float f10 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f10;
        float f11 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f11;
        synchronized (this.f34575b) {
            java.lang.System.arraycopy(this.f34578e, 0, this.f34579f, 0, 9);
        }
        com.google.android.gms.internal.ads.InterfaceC3308bs interfaceC3308bs = this.f34581h;
        if (interfaceC3308bs != null) {
            interfaceC3308bs.a();
        }
    }

    final void b(com.google.android.gms.internal.ads.InterfaceC3308bs interfaceC3308bs) {
        this.f34581h = interfaceC3308bs;
    }

    final void c() {
        if (this.f34580g != null) {
            return;
        }
        android.hardware.Sensor defaultSensor = this.f34574a.getDefaultSensor(11);
        if (defaultSensor == null) {
            p224w3.p.d("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("OrientationMonitor");
        handlerThread.start();
        com.google.android.gms.internal.ads.HandlerC2345Fe0 handlerC2345Fe0 = new com.google.android.gms.internal.ads.HandlerC2345Fe0(handlerThread.getLooper());
        this.f34580g = handlerC2345Fe0;
        if (this.f34574a.registerListener(this, defaultSensor, 0, handlerC2345Fe0)) {
            return;
        }
        p224w3.p.d("SensorManager.registerListener failed.");
        d();
    }

    final void d() {
        if (this.f34580g == null) {
            return;
        }
        this.f34574a.unregisterListener(this);
        this.f34580g.post(new com.google.android.gms.internal.ads.RunnableC3198as(this));
        this.f34580g = null;
    }

    final boolean e(float[] fArr) {
        synchronized (this.f34575b) {
            try {
                float[] fArr2 = this.f34579f;
                if (fArr2 == null) {
                    return false;
                }
                java.lang.System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
