package p141o0;

/* JADX INFO: loaded from: classes.dex */
public final class N implements p141o0.E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.Bitmap f52147a;

    public N(android.graphics.Bitmap bitmap) {
        this.f52147a = bitmap;
    }

    @Override // p141o0.E1
    public void a() {
        this.f52147a.prepareToDraw();
    }

    @Override // p141o0.E1
    public int b() {
        return p141o0.Q.e(this.f52147a.getConfig());
    }

    public final android.graphics.Bitmap c() {
        return this.f52147a;
    }

    @Override // p141o0.E1
    public int getHeight() {
        return this.f52147a.getHeight();
    }

    @Override // p141o0.E1
    public int getWidth() {
        return this.f52147a.getWidth();
    }
}
