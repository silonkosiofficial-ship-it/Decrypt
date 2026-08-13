package D;

/* JADX INFO: loaded from: classes.dex */
public final class I implements D.InterfaceC0867d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X.b f1605a = new X.b(new D.InterfaceC0867d.a[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private D.InterfaceC0867d.a f1607c;

    private final void d(int i6) {
        if (i6 < 0 || i6 >= a()) {
            throw new java.lang.IndexOutOfBoundsException("Index " + i6 + ", size " + a());
        }
    }

    private final boolean e(D.InterfaceC0867d.a aVar, int i6) {
        return i6 < aVar.b() + aVar.a() && aVar.b() <= i6;
    }

    private final D.InterfaceC0867d.a f(int i6) {
        D.InterfaceC0867d.a aVar = this.f1607c;
        if (aVar != null && e(aVar, i6)) {
            return aVar;
        }
        X.b bVar = this.f1605a;
        D.InterfaceC0867d.a aVar2 = (D.InterfaceC0867d.a) bVar.s()[D.AbstractC0868e.b(bVar, i6)];
        this.f1607c = aVar2;
        return aVar2;
    }

    @Override // D.InterfaceC0867d
    public int a() {
        return this.f1606b;
    }

    @Override // D.InterfaceC0867d
    public void b(int i6, int i10, p237x7.l lVar) {
        d(i6);
        d(i10);
        if (i10 < i6) {
            throw new java.lang.IllegalArgumentException(("toIndex (" + i10 + ") should be not smaller than fromIndex (" + i6 + ')').toString());
        }
        int iB = D.AbstractC0868e.b(this.f1605a, i6);
        int iB2 = ((D.InterfaceC0867d.a) this.f1605a.s()[iB]).b();
        while (iB2 <= i10) {
            D.InterfaceC0867d.a aVar = (D.InterfaceC0867d.a) this.f1605a.s()[iB];
            lVar.l(aVar);
            iB2 += aVar.a();
            iB++;
        }
    }

    public final void c(int i6, java.lang.Object obj) {
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("size should be >=0, but was " + i6).toString());
        }
        if (i6 == 0) {
            return;
        }
        D.InterfaceC0867d.a aVar = new D.InterfaceC0867d.a(a(), i6, obj);
        this.f1606b = a() + i6;
        this.f1605a.d(aVar);
    }

    @Override // D.InterfaceC0867d
    public D.InterfaceC0867d.a get(int i6) {
        d(i6);
        return f(i6);
    }
}
