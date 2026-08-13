package V;

/* JADX INFO: renamed from: V.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1757y0 implements V.InterfaceC1713g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.InterfaceC1713g f15070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15072c;

    public C1757y0(V.InterfaceC1713g interfaceC1713g, int i6) {
        this.f15070a = interfaceC1713g;
        this.f15071b = i6;
    }

    @Override // V.InterfaceC1713g
    public void a(int i6, int i10) {
        this.f15070a.a(i6 + (this.f15072c == 0 ? this.f15071b : 0), i10);
    }

    @Override // V.InterfaceC1713g
    public java.lang.Object b() {
        return this.f15070a.b();
    }

    @Override // V.InterfaceC1713g
    public void c(int i6, java.lang.Object obj) {
        this.f15070a.c(i6 + (this.f15072c == 0 ? this.f15071b : 0), obj);
    }

    @Override // V.InterfaceC1713g
    public void clear() {
        V.AbstractC1741q.r("Clear is not valid on OffsetApplier");
    }

    @Override // V.InterfaceC1713g
    public void d(java.lang.Object obj) {
        this.f15072c++;
        this.f15070a.d(obj);
    }

    @Override // V.InterfaceC1713g
    public /* synthetic */ void e() {
        V.AbstractC1710f.a(this);
    }

    @Override // V.InterfaceC1713g
    public void f(int i6, int i10, int i11) {
        int i12 = this.f15072c == 0 ? this.f15071b : 0;
        this.f15070a.f(i6 + i12, i10 + i12, i11);
    }

    @Override // V.InterfaceC1713g
    public void g() {
        if (!(this.f15072c > 0)) {
            V.AbstractC1741q.r("OffsetApplier up called with no corresponding down");
        }
        this.f15072c--;
        this.f15070a.g();
    }

    @Override // V.InterfaceC1713g
    public void h(int i6, java.lang.Object obj) {
        this.f15070a.h(i6 + (this.f15072c == 0 ? this.f15071b : 0), obj);
    }

    @Override // V.InterfaceC1713g
    public /* synthetic */ void i() {
        V.AbstractC1710f.b(this);
    }
}
