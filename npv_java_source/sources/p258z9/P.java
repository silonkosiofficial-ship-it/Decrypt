package p258z9;

/* JADX INFO: loaded from: classes2.dex */
class P extends p258z9.AbstractC7390c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p249y9.D f57685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p219v9.f f57686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f57687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f57688k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(p249y9.AbstractC7358b abstractC7358b, p249y9.D d6, java.lang.String str, p219v9.f fVar) {
        super(abstractC7358b, d6, str, null);
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(d6, "value");
        this.f57685h = d6;
        this.f57686i = fVar;
    }

    public /* synthetic */ P(p249y9.AbstractC7358b abstractC7358b, p249y9.D d6, java.lang.String str, p219v9.f fVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(abstractC7358b, d6, (i6 & 4) != 0 ? null : str, (i6 & 8) != 0 ? null : fVar);
    }

    private final boolean B0(p219v9.f fVar, int i6) {
        boolean z6 = (w0().e().j() || fVar.i(i6) || !fVar.h(i6).c()) ? false : true;
        this.f57688k = z6;
        return z6;
    }

    private final boolean C0(p219v9.f fVar, int i6, java.lang.String str) {
        p249y9.AbstractC7358b abstractC7358bW0 = w0();
        boolean zI = fVar.i(i6);
        p219v9.f fVarH = fVar.h(i6);
        if (zI && !fVarH.c() && (j0(str) instanceof p249y9.A)) {
            return true;
        }
        if (p247y7.AbstractC7350t.b(fVarH.j(), v9.m.b.f56057a) && (!fVarH.c() || !(j0(str) instanceof p249y9.A))) {
            p249y9.i iVarJ0 = j0(str);
            p249y9.F f6 = iVarJ0 instanceof p249y9.F ? (p249y9.F) iVarJ0 : null;
            java.lang.String strE = f6 != null ? p249y9.j.e(f6) : null;
            if (strE != null) {
                int i10 = p258z9.I.i(fVarH, abstractC7358bW0, strE);
                boolean z6 = !abstractC7358bW0.e().j() && fVarH.c();
                if (i10 == -3 && (zI || z6)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p258z9.AbstractC7390c
    /* JADX INFO: renamed from: D0 */
    public p249y9.D y0() {
        return this.f57685h;
    }

    @Override // p258z9.AbstractC7390c, p229w9.h
    public p229w9.d a(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (fVar != this.f57686i) {
            return super.a(fVar);
        }
        p249y9.AbstractC7358b abstractC7358bW0 = w0();
        p249y9.i iVarK0 = k0();
        java.lang.String strA = this.f57686i.a();
        if (iVarK0 instanceof p249y9.D) {
            return new p258z9.P(abstractC7358bW0, (p249y9.D) iVarK0, x0(), this.f57686i);
        }
        throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.D.class).c() + ", but had " + p247y7.P.b(iVarK0.getClass()).c() + " as the serialized body of " + strA + " at element: " + g0(), iVarK0.toString());
    }

    @Override // p258z9.AbstractC7390c, p229w9.d
    public void b(p219v9.f fVar) {
        java.util.Set setJ;
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (p258z9.I.m(fVar, w0()) || (fVar.j() instanceof p219v9.c)) {
            return;
        }
        p258z9.I.n(fVar, w0());
        if (this.f57744g.o()) {
            java.util.Set setA = p239x9.K.a(fVar);
            java.util.Map map = (java.util.Map) p249y9.H.a(w0()).a(fVar, p258z9.I.g());
            java.util.Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = p097j7.Z.d();
            }
            setJ = p097j7.Z.j(setA, setKeySet);
        } else {
            setJ = p239x9.K.a(fVar);
        }
        for (java.lang.String str : y0().keySet()) {
            if (!setJ.contains(str) && !p247y7.AbstractC7350t.b(str, x0())) {
                throw p258z9.G.e(-1, "Encountered an unknown key '" + str + "' at element: " + g0() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((java.lang.Object) p258z9.G.j(y0().toString(), 0, 1, null)));
            }
        }
    }

    @Override // p239x9.U
    protected java.lang.String d0(p219v9.f fVar, int i6) {
        java.lang.Object next;
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p258z9.I.n(fVar, w0());
        java.lang.String strF = fVar.f(i6);
        if (!this.f57744g.o() || y0().keySet().contains(strF)) {
            return strF;
        }
        java.util.Map mapE = p258z9.I.e(w0(), fVar);
        java.util.Iterator<T> it = y0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.lang.Integer num = (java.lang.Integer) mapE.get((java.lang.String) next);
            if (num != null && num.intValue() == i6) {
                break;
            }
        }
        java.lang.String str = (java.lang.String) next;
        return str != null ? str : strF;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p258z9.AbstractC7390c
    public p249y9.i j0(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        return (p249y9.i) p097j7.S.i(y0(), str);
    }

    @Override // p229w9.d
    public int r(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        while (this.f57687j < fVar.e()) {
            int i6 = this.f57687j;
            this.f57687j = i6 + 1;
            java.lang.String strX = X(fVar, i6);
            int i10 = this.f57687j - 1;
            this.f57688k = false;
            if (y0().containsKey(strX) || B0(fVar, i10)) {
                if (!this.f57744g.g() || !C0(fVar, i10, strX)) {
                    return i10;
                }
            }
        }
        return -1;
    }

    @Override // p258z9.AbstractC7390c, p229w9.h
    public boolean s() {
        return !this.f57688k && super.s();
    }
}
