package p239x9;

/* JADX INFO: renamed from: x9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7318o extends p239x9.AbstractC7290a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p199t9.b f57026a;

    private AbstractC7318o(p199t9.b bVar) {
        super(null);
        this.f57026a = bVar;
    }

    public /* synthetic */ AbstractC7318o(p199t9.b bVar, p247y7.AbstractC7342k abstractC7342k) {
        this(bVar);
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public abstract p219v9.f a();

    @Override // p199t9.e
    public void e(p229w9.j jVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        int iJ = j(obj);
        p219v9.f fVarA = a();
        p229w9.f fVarK = jVar.k(fVarA, iJ);
        java.util.Iterator itI = i(obj);
        for (int i6 = 0; i6 < iJ; i6++) {
            fVarK.r(a(), i6, this.f57026a, itI.next());
        }
        fVarK.b(fVarA);
    }

    @Override // p239x9.AbstractC7290a
    protected final void l(p229w9.d dVar, java.lang.Object obj, int i6, int i10) {
        p247y7.AbstractC7350t.f(dVar, "decoder");
        if (i10 < 0) {
            throw new java.lang.IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            m(dVar, i6 + i11, obj, false);
        }
    }

    @Override // p239x9.AbstractC7290a
    protected void m(p229w9.d dVar, int i6, java.lang.Object obj, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "decoder");
        s(obj, i6, p229w9.c.c(dVar, a(), i6, this.f57026a, null, 8, null));
    }

    protected abstract void s(java.lang.Object obj, int i6, java.lang.Object obj2);
}
