package V;

/* JADX INFO: loaded from: classes.dex */
final class W0 implements V.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V.W0 f14814a = new V.W0();

    private W0() {
    }

    @Override // V.u1
    public boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2;
    }

    @Override // V.u1
    public /* synthetic */ java.lang.Object b(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return V.t1.a(this, obj, obj2, obj3);
    }

    public java.lang.String toString() {
        return "ReferentialEqualityPolicy";
    }
}
