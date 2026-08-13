package p082i1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends p082i1.c {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final i1.b.a f46633L = new i1.b.a(null);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f46634M = 8;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.util.ArrayList f46635K;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p082i1.b bVar) {
        super(bVar);
        p247y7.AbstractC7350t.f(bVar, "clContainer");
        this.f46635K = new java.util.ArrayList();
        java.util.ArrayList arrayList = new java.util.ArrayList(bVar.f46635K.size());
        java.util.Iterator it = bVar.f46635K.iterator();
        while (it.hasNext()) {
            p082i1.c cVarD = ((p082i1.c) it.next()).d();
            cVarD.M(this);
            arrayList.add(cVarD);
        }
        this.f46635K = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(char[] cArr) {
        super(cArr);
        p247y7.AbstractC7350t.f(cArr, "content");
        this.f46635K = new java.util.ArrayList();
    }

    public final void P(p082i1.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "element");
        this.f46635K.add(cVar);
    }

    public final p082i1.c Q(int i6) throws p082i1.g {
        if (i6 >= 0 && i6 < this.f46635K.size()) {
            java.lang.Object obj = this.f46635K.get(i6);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            return (p082i1.c) obj;
        }
        throw new p082i1.g("no element at index " + i6, this);
    }

    public final p082i1.c R(java.lang.String str) throws p082i1.g {
        p247y7.AbstractC7350t.f(str, "name");
        for (p082i1.c cVar : this.f46635K) {
            p247y7.AbstractC7350t.d(cVar, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
            p082i1.d dVar = (p082i1.d) cVar;
            if (p247y7.AbstractC7350t.b(dVar.e(), str)) {
                return dVar.p0();
            }
        }
        throw new p082i1.g("no element for key <" + str + ">", this);
    }

    public final p082i1.a S(java.lang.String str) throws p082i1.g {
        p247y7.AbstractC7350t.f(str, "name");
        p082i1.c cVarR = R(str);
        if (cVarR instanceof p082i1.a) {
            return (p082i1.a) cVarR;
        }
        throw new p082i1.g("no array found for key <" + str + ">, found [" + cVarR.D() + "] : " + cVarR, this);
    }

    public final p082i1.a T(java.lang.String str) {
        p082i1.c cVarD0 = d0(str);
        if (cVarD0 instanceof p082i1.a) {
            return (p082i1.a) cVarD0;
        }
        return null;
    }

    public final float U(int i6) {
        return Q(i6).g();
    }

    public final float V(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return R(str).g();
    }

    public final float W(java.lang.String str) {
        p082i1.c cVarD0 = d0(str);
        if (cVarD0 instanceof p082i1.e) {
            return ((p082i1.e) cVarD0).g();
        }
        return Float.NaN;
    }

    public final int X(int i6) {
        return Q(i6).o();
    }

    public final int Y(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return R(str).o();
    }

    public final java.util.ArrayList Z() {
        return this.f46635K;
    }

    public final p082i1.f a0(java.lang.String str) throws p082i1.g {
        p247y7.AbstractC7350t.f(str, "name");
        p082i1.c cVarR = R(str);
        if (cVarR instanceof p082i1.f) {
            return (p082i1.f) cVarR;
        }
        throw new p082i1.g("no object found for key <" + str + ">, found [" + cVarR.D() + "] : " + cVarR, this);
    }

    public final p082i1.f b0(java.lang.String str) {
        p082i1.c cVarD0 = d0(str);
        if (cVarD0 instanceof p082i1.f) {
            return (p082i1.f) cVarD0;
        }
        return null;
    }

    public final p082i1.c c0(int i6) {
        if (i6 < 0 || i6 >= this.f46635K.size()) {
            return null;
        }
        return (p082i1.c) this.f46635K.get(i6);
    }

    public final void clear() {
        this.f46635K.clear();
    }

    public final p082i1.c d0(java.lang.String str) {
        for (java.lang.Object obj : this.f46635K) {
            p247y7.AbstractC7350t.e(obj, "next(...)");
            p082i1.d dVar = (p082i1.d) ((p082i1.c) obj);
            if (p247y7.AbstractC7350t.b(dVar.e(), str)) {
                return dVar.p0();
            }
        }
        return null;
    }

    public final java.lang.String e0(int i6) throws p082i1.g {
        p082i1.c cVarQ = Q(i6);
        if (cVarQ instanceof p082i1.h) {
            return cVarQ.e();
        }
        throw new p082i1.g("no string at index " + i6, this);
    }

    @Override // p082i1.c
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p082i1.b) {
            return p247y7.AbstractC7350t.b(this.f46635K, ((p082i1.b) obj).f46635K);
        }
        return false;
    }

    public final java.lang.String f0(java.lang.String str) throws p082i1.g {
        p247y7.AbstractC7350t.f(str, "name");
        p082i1.c cVarR = R(str);
        if (cVarR instanceof p082i1.h) {
            return cVarR.e();
        }
        throw new p082i1.g("no string found for key <" + str + ">, found [" + cVarR.D() + "] : " + cVarR, this);
    }

    public final java.lang.String g0(int i6) {
        p082i1.c cVarC0 = c0(i6);
        if (cVarC0 instanceof p082i1.h) {
            return ((p082i1.h) cVarC0).e();
        }
        return null;
    }

    public final java.lang.String h0(java.lang.String str) {
        p082i1.c cVarD0 = d0(str);
        if (!(cVarD0 == null ? true : cVarD0 instanceof p082i1.h) || cVarD0 == null) {
            return null;
        }
        return cVarD0.e();
    }

    @Override // p082i1.c
    public int hashCode() {
        return new java.io.Serializable[]{this.f46635K, java.lang.Integer.valueOf(super.hashCode())}.hashCode();
    }

    public final boolean i0(java.lang.String str) {
        for (p082i1.c cVar : this.f46635K) {
            if ((cVar instanceof p082i1.d) && p247y7.AbstractC7350t.b(((p082i1.d) cVar).e(), str)) {
                return true;
            }
        }
        return false;
    }

    public final java.util.ArrayList j0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p082i1.c cVar : this.f46635K) {
            if (cVar instanceof p082i1.d) {
                arrayList.add(((p082i1.d) cVar).e());
            }
        }
        return arrayList;
    }

    public final void k0(java.lang.String str, p082i1.c cVar) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(cVar, "value");
        for (p082i1.c cVar2 : this.f46635K) {
            p247y7.AbstractC7350t.d(cVar2, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
            p082i1.d dVar = (p082i1.d) cVar2;
            if (p247y7.AbstractC7350t.b(dVar.e(), str)) {
                dVar.q0(cVar);
                return;
            }
        }
        p082i1.c cVarA = p082i1.d.f46644N.a(str, cVar);
        p247y7.AbstractC7350t.d(cVarA, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
        this.f46635K.add((p082i1.d) cVarA);
    }

    public final void l0(java.lang.String str, float f6) {
        p247y7.AbstractC7350t.f(str, "name");
        k0(str, new p082i1.e(f6));
    }

    public final void m0(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "value");
        char[] charArray = str2.toCharArray();
        p247y7.AbstractC7350t.e(charArray, "toCharArray(...)");
        p082i1.h hVar = new p082i1.h(charArray);
        hVar.O(0L);
        hVar.N(str2.length() - 1);
        k0(str, hVar);
    }

    public final int size() {
        return this.f46635K.size();
    }

    @Override // p082i1.c
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (p082i1.c cVar : this.f46635K) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(cVar);
        }
        return super.toString() + " = <" + ((java.lang.Object) sb) + " >";
    }
}
