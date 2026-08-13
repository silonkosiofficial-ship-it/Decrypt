package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f21663a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f21664b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f21665c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21666d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21667e = 0;

    V() {
    }

    private void b() {
        this.f21666d = 0;
        this.f21665c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j6;
        int i6 = this.f21666d;
        if (i6 < 2) {
            return 0.0f;
        }
        int i10 = this.f21667e;
        int i11 = ((i10 + 20) - (i6 - 1)) % 20;
        long j10 = this.f21664b[i10];
        while (true) {
            jArr = this.f21664b;
            j6 = jArr[i11];
            if (j10 - j6 <= 100) {
                break;
            }
            this.f21666d--;
            i11 = (i11 + 1) % 20;
        }
        int i12 = this.f21666d;
        if (i12 < 2) {
            return 0.0f;
        }
        if (i12 == 2) {
            int i13 = (i11 + 1) % 20;
            long j11 = jArr[i13];
            if (j6 == j11) {
                return 0.0f;
            }
            return this.f21663a[i13] / (j11 - j6);
        }
        float fAbs = 0.0f;
        int i14 = 0;
        for (int i15 = 0; i15 < this.f21666d - 1; i15++) {
            int i16 = i15 + i11;
            long[] jArr2 = this.f21664b;
            long j12 = jArr2[i16 % 20];
            int i17 = (i16 + 1) % 20;
            if (jArr2[i17] != j12) {
                i14++;
                float f6 = f(fAbs);
                float f10 = this.f21663a[i17] / (this.f21664b[i17] - j12);
                fAbs += (f10 - f6) * java.lang.Math.abs(f10);
                if (i14 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }

    private static float f(float f6) {
        return (f6 < 0.0f ? -1.0f : 1.0f) * ((float) java.lang.Math.sqrt(java.lang.Math.abs(f6) * 2.0f));
    }

    void a(android.view.MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f21666d != 0 && eventTime - this.f21664b[this.f21667e] > 40) {
            b();
        }
        int i6 = (this.f21667e + 1) % 20;
        this.f21667e = i6;
        int i10 = this.f21666d;
        if (i10 != 20) {
            this.f21666d = i10 + 1;
        }
        this.f21663a[i6] = motionEvent.getAxisValue(26);
        this.f21664b[this.f21667e] = eventTime;
    }

    void c(int i6, float f6) {
        float fAbs;
        float fE = e() * i6;
        this.f21665c = fE;
        if (fE < (-java.lang.Math.abs(f6))) {
            fAbs = -java.lang.Math.abs(f6);
        } else if (this.f21665c <= java.lang.Math.abs(f6)) {
            return;
        } else {
            fAbs = java.lang.Math.abs(f6);
        }
        this.f21665c = fAbs;
    }

    float d(int i6) {
        if (i6 != 26) {
            return 0.0f;
        }
        return this.f21665c;
    }
}
