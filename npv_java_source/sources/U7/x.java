package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends U7.z implements p048e8.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Class f14612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Collection f14613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14614d;

    public x(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "reflectType");
        this.f14612b = cls;
        this.f14613c = p097j7.AbstractC6879v.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // U7.z
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public java.lang.Class X() {
        return this.f14612b;
    }

    @Override // p048e8.v
    public L7.h getType() {
        if (p247y7.AbstractC7350t.b(X(), java.lang.Void.TYPE)) {
            return null;
        }
        return p228w8.e.i(X().getName()).o();
    }

    @Override // p048e8.InterfaceC6538d
    public java.util.Collection k() {
        return this.f14613c;
    }

    @Override // p048e8.InterfaceC6538d
    public boolean o() {
        return this.f14614d;
    }
}
