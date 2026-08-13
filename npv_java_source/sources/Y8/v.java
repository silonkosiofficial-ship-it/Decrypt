package Y8;

/* JADX INFO: loaded from: classes2.dex */
public class v extends Y8.h {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f16566O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final Y8.EnumC1863d f16567P;

    public v(int i6, Y8.EnumC1863d enumC1863d, p237x7.l lVar) {
        super(i6, lVar);
        this.f16566O = i6;
        this.f16567P = enumC1863d;
        if (enumC1863d == Y8.EnumC1863d.SUSPEND) {
            throw new java.lang.IllegalArgumentException(("This implementation does not support suspension for senders, use " + p247y7.P.b(Y8.h.class).c() + " instead").toString());
        }
        if (i6 >= 1) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i6 + " was specified").toString());
    }

    static /* synthetic */ java.lang.Object p1(Y8.v vVar, java.lang.Object obj, p127m7.e eVar) throws java.lang.Throwable {
        p019b9.S sC;
        java.lang.Object objR1 = vVar.r1(obj, true);
        if (!(objR1 instanceof Y8.n.a)) {
            return p087i7.M.f46721a;
        }
        Y8.n.e(objR1);
        p237x7.l lVar = vVar.f16517D;
        if (lVar == null || (sC = p019b9.w.c(lVar, obj, null, 2, null)) == null) {
            throw vVar.i0();
        }
        p087i7.AbstractC6661g.a(sC, vVar.i0());
        throw sC;
    }

    private final java.lang.Object q1(java.lang.Object obj, boolean z6) {
        p237x7.l lVar;
        p019b9.S sC;
        java.lang.Object objJ = super.j(obj);
        if (Y8.n.j(objJ) || Y8.n.i(objJ)) {
            return objJ;
        }
        if (!z6 || (lVar = this.f16517D) == null || (sC = p019b9.w.c(lVar, obj, null, 2, null)) == null) {
            return Y8.n.f16556b.c(p087i7.M.f46721a);
        }
        throw sC;
    }

    private final java.lang.Object r1(java.lang.Object obj, boolean z6) {
        return this.f16567P == Y8.EnumC1863d.DROP_LATEST ? q1(obj, z6) : e1(obj);
    }

    @Override // Y8.h, Y8.C
    public java.lang.Object h(java.lang.Object obj, p127m7.e eVar) {
        return p1(this, obj, eVar);
    }

    @Override // Y8.h, Y8.C
    public java.lang.Object j(java.lang.Object obj) {
        return r1(obj, false);
    }

    @Override // Y8.h
    protected boolean x0() {
        return this.f16567P == Y8.EnumC1863d.DROP_OLDEST;
    }
}
