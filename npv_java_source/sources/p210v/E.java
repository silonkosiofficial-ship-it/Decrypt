package p210v;

/* JADX INFO: loaded from: classes.dex */
final class E extends android.widget.EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f55582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f55583b;

    public E(android.content.Context context) {
        super(context);
        this.f55582a = Y0.AbstractC1858a.a(context).B0(Y0.i.q(1));
    }

    public final void a(float f6) {
        float f10 = this.f55583b + f6;
        this.f55583b = f10;
        if (java.lang.Math.abs(f10) > this.f55582a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i6) {
        this.f55583b = 0.0f;
        super.onAbsorb(i6);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f6) {
        this.f55583b = 0.0f;
        super.onPull(f6);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f6, float f10) {
        this.f55583b = 0.0f;
        super.onPull(f6, f10);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.f55583b = 0.0f;
        super.onRelease();
    }
}
