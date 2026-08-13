package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2018o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f21759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.core.view.InterfaceC2020p f21760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.core.view.C2018o.b f21761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.core.view.C2018o.a f21762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.view.VelocityTracker f21763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f21764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f21768j;

    /* JADX INFO: renamed from: androidx.core.view.o$a */
    interface a {
        float a(android.view.VelocityTracker velocityTracker, android.view.MotionEvent motionEvent, int i6);
    }

    /* JADX INFO: renamed from: androidx.core.view.o$b */
    interface b {
        void a(android.content.Context context, int[] iArr, android.view.MotionEvent motionEvent, int i6);
    }

    public C2018o(android.content.Context context, androidx.core.view.InterfaceC2020p interfaceC2020p) {
        this(context, interfaceC2020p, new androidx.core.view.C2018o.b() { // from class: androidx.core.view.m
            @Override // androidx.core.view.C2018o.b
            public final void a(android.content.Context context2, int[] iArr, android.view.MotionEvent motionEvent, int i6) {
                androidx.core.view.C2018o.c(context2, iArr, motionEvent, i6);
            }
        }, new androidx.core.view.C2018o.a() { // from class: androidx.core.view.n
            @Override // androidx.core.view.C2018o.a
            public final float a(android.view.VelocityTracker velocityTracker, android.view.MotionEvent motionEvent, int i6) {
                return androidx.core.view.C2018o.f(velocityTracker, motionEvent, i6);
            }
        });
    }

    C2018o(android.content.Context context, androidx.core.view.InterfaceC2020p interfaceC2020p, androidx.core.view.C2018o.b bVar, androidx.core.view.C2018o.a aVar) {
        this.f21765g = -1;
        this.f21766h = -1;
        this.f21767i = -1;
        this.f21768j = new int[]{Integer.MAX_VALUE, 0};
        this.f21759a = context;
        this.f21760b = interfaceC2020p;
        this.f21761c = bVar;
        this.f21762d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(android.content.Context context, int[] iArr, android.view.MotionEvent motionEvent, int i6) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        iArr[0] = androidx.core.view.AbstractC1993b0.i(context, viewConfiguration, motionEvent.getDeviceId(), i6, motionEvent.getSource());
        iArr[1] = androidx.core.view.AbstractC1993b0.h(context, viewConfiguration, motionEvent.getDeviceId(), i6, motionEvent.getSource());
    }

    private boolean d(android.view.MotionEvent motionEvent, int i6) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f21766h == source && this.f21767i == deviceId && this.f21765g == i6) {
            return false;
        }
        this.f21761c.a(this.f21759a, this.f21768j, motionEvent, i6);
        this.f21766h = source;
        this.f21767i = deviceId;
        this.f21765g = i6;
        return true;
    }

    private float e(android.view.MotionEvent motionEvent, int i6) {
        if (this.f21763e == null) {
            this.f21763e = android.view.VelocityTracker.obtain();
        }
        return this.f21762d.a(this.f21763e, motionEvent, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(android.view.VelocityTracker velocityTracker, android.view.MotionEvent motionEvent, int i6) {
        androidx.core.view.U.a(velocityTracker, motionEvent);
        androidx.core.view.U.b(velocityTracker, 1000);
        return androidx.core.view.U.d(velocityTracker, i6);
    }

    public void g(android.view.MotionEvent motionEvent, int i6) {
        boolean zD = d(motionEvent, i6);
        if (this.f21768j[0] == Integer.MAX_VALUE) {
            android.view.VelocityTracker velocityTracker = this.f21763e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f21763e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i6) * this.f21760b.b();
        float fSignum = java.lang.Math.signum(fE);
        if (zD || (fSignum != java.lang.Math.signum(this.f21764f) && fSignum != 0.0f)) {
            this.f21760b.c();
        }
        float fAbs = java.lang.Math.abs(fE);
        int[] iArr = this.f21768j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i10 = iArr[1];
        float fMax = java.lang.Math.max(-i10, java.lang.Math.min(fE, i10));
        this.f21764f = this.f21760b.a(fMax) ? fMax : 0.0f;
    }
}
