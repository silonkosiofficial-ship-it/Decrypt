package B;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final B.z.a f493D = new B.z.a();

        a() {
            super(1);
        }

        public final java.lang.Void a(int i6) {
            return null;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    public static /* synthetic */ void a(B.A a6, java.lang.Object obj, java.lang.Object obj2, p237x7.q qVar, int i6, java.lang.Object obj3) {
        if (obj3 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i6 & 1) != 0) {
            obj = null;
        }
        if ((i6 & 2) != 0) {
            obj2 = null;
        }
        a6.c(obj, obj2, qVar);
    }

    public static /* synthetic */ void b(B.A a6, int i6, p237x7.l lVar, p237x7.l lVar2, p237x7.r rVar, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar2 = B.z.a.f493D;
        }
        a6.d(i6, lVar, lVar2, rVar);
    }

    public static /* synthetic */ void c(B.A a6, java.lang.Object obj, java.lang.Object obj2, p237x7.q qVar, int i6, java.lang.Object obj3) {
        if (obj3 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i6 & 1) != 0) {
            obj = null;
        }
        if ((i6 & 2) != 0) {
            obj2 = null;
        }
        a6.b(obj, obj2, qVar);
    }
}
