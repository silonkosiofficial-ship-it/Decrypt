package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class T extends p239x9.AbstractC7290a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p199t9.b f56975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p199t9.b f56976b;

    private T(p199t9.b bVar, p199t9.b bVar2) {
        super(null);
        this.f56975a = bVar;
        this.f56976b = bVar2;
    }

    public /* synthetic */ T(p199t9.b bVar, p199t9.b bVar2, p247y7.AbstractC7342k abstractC7342k) {
        this(bVar, bVar2);
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
        int i6 = 0;
        while (itI.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) itI.next();
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int i10 = i6 + 1;
            fVarK.r(a(), i6, r(), key);
            i6 += 2;
            fVarK.r(a(), i10, s(), value);
        }
        fVarK.b(fVarA);
    }

    public final p199t9.b r() {
        return this.f56975a;
    }

    public final p199t9.b s() {
        return this.f56976b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void l(p229w9.d dVar, java.util.Map map, int i6, int i10) {
        p247y7.AbstractC7350t.f(dVar, "decoder");
        p247y7.AbstractC7350t.f(map, "builder");
        if (i10 < 0) {
            throw new java.lang.IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        E7.g gVarP = E7.j.p(E7.j.q(0, i10 * 2), 2);
        int iF = gVarP.f();
        int iG = gVarP.g();
        int iO = gVarP.o();
        if ((iO <= 0 || iF > iG) && (iO >= 0 || iG > iF)) {
            return;
        }
        while (true) {
            m(dVar, i6 + iF, map, false);
            if (iF == iG) {
                return;
            } else {
                iF += iO;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m(p229w9.d dVar, int i6, java.util.Map map, boolean z6) {
        int iR;
        p247y7.AbstractC7350t.f(dVar, "decoder");
        p247y7.AbstractC7350t.f(map, "builder");
        java.lang.Object objC = p229w9.c.c(dVar, a(), i6, this.f56975a, null, 8, null);
        if (z6) {
            iR = dVar.r(a());
            if (iR != i6 + 1) {
                throw new java.lang.IllegalArgumentException(("Value must follow key in a map, index for key: " + i6 + ", returned index for value: " + iR).toString());
            }
        } else {
            iR = i6 + 1;
        }
        int i10 = iR;
        map.put(objC, (!map.containsKey(objC) || (this.f56976b.a().j() instanceof p219v9.d)) ? p229w9.c.c(dVar, a(), i10, this.f56976b, null, 8, null) : dVar.B(a(), i10, this.f56976b, p097j7.S.i(map, objC)));
    }
}
