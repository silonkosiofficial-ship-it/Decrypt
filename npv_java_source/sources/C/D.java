package C;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class D {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final C.D.a f985D = new C.D.a();

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

    public static /* synthetic */ void a(C.E e6, int i6, p237x7.l lVar, p237x7.p pVar, p237x7.l lVar2, p237x7.r rVar, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        p237x7.l lVar3 = (i10 & 2) != 0 ? null : lVar;
        p237x7.p pVar2 = (i10 & 4) != 0 ? null : pVar;
        if ((i10 & 8) != 0) {
            lVar2 = C.D.a.f985D;
        }
        e6.a(i6, lVar3, pVar2, lVar2, rVar);
    }
}
