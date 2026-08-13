package B4;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends B4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.Typeface f765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B4.a.InterfaceC0013a f766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f767c;

    /* JADX INFO: renamed from: B4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0013a {
        void a(android.graphics.Typeface typeface);
    }

    public a(B4.a.InterfaceC0013a interfaceC0013a, android.graphics.Typeface typeface) {
        this.f765a = typeface;
        this.f766b = interfaceC0013a;
    }

    private void d(android.graphics.Typeface typeface) {
        if (this.f767c) {
            return;
        }
        this.f766b.a(typeface);
    }

    @Override // B4.f
    public void a(int i6) {
        d(this.f765a);
    }

    @Override // B4.f
    public void b(android.graphics.Typeface typeface, boolean z6) {
        d(typeface);
    }

    public void c() {
        this.f767c = true;
    }
}
