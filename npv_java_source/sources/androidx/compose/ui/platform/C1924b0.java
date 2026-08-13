package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1924b0 implements androidx.compose.ui.platform.A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.ViewConfiguration f20083a;

    public C1924b0(android.view.ViewConfiguration viewConfiguration) {
        this.f20083a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.A1
    public long a() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.A1
    public long b() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.A1
    public long c() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.A1
    public float d() {
        return android.os.Build.VERSION.SDK_INT >= 34 ? androidx.compose.ui.platform.C1933e0.f20106a.b(this.f20083a) : androidx.compose.ui.platform.z1.b(this);
    }

    @Override // androidx.compose.ui.platform.A1
    public /* synthetic */ long e() {
        return androidx.compose.ui.platform.z1.d(this);
    }

    @Override // androidx.compose.ui.platform.A1
    public float f() {
        return this.f20083a.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.A1
    public float g() {
        return this.f20083a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.A1
    public float h() {
        return android.os.Build.VERSION.SDK_INT >= 34 ? androidx.compose.ui.platform.C1933e0.f20106a.a(this.f20083a) : androidx.compose.ui.platform.z1.a(this);
    }
}
