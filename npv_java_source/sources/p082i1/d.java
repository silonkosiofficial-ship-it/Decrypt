package p082i1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p082i1.b {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final i1.d.a f46644N = new i1.d.a(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final java.util.ArrayList f46645O;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p082i1.c a(java.lang.String str, p082i1.c cVar) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(cVar, "value");
            char[] charArray = str.toCharArray();
            p247y7.AbstractC7350t.e(charArray, "toCharArray(...)");
            p082i1.d dVar = new p082i1.d(charArray);
            dVar.O(0L);
            dVar.N(str.length() - 1);
            dVar.q0(cVar);
            return dVar;
        }
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f46645O = arrayList;
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p082i1.d dVar) {
        super(dVar);
        p247y7.AbstractC7350t.f(dVar, "clKey");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(char[] cArr) {
        super(cArr);
        p247y7.AbstractC7350t.f(cArr, "content");
    }

    @Override // p082i1.b, p082i1.c
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p082i1.d) || p247y7.AbstractC7350t.b(o0(), ((p082i1.d) obj).o0())) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // p082i1.b, p082i1.c
    public int hashCode() {
        return super.hashCode();
    }

    @Override // p082i1.c
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public p082i1.b d() {
        return new p082i1.d(this);
    }

    public final java.lang.String o0() {
        return e();
    }

    public final p082i1.c p0() {
        if (Z().size() <= 0) {
            p247y7.AbstractC7350t.c(null);
            throw new p087i7.C6665k();
        }
        java.lang.Object obj = Z().get(0);
        p247y7.AbstractC7350t.c(obj);
        return (p082i1.c) obj;
    }

    public final void q0(p082i1.c cVar) {
        if (Z().size() > 0) {
            java.util.ArrayList arrayListZ = Z();
            p247y7.AbstractC7350t.c(cVar);
            arrayListZ.set(0, cVar);
        } else {
            java.util.ArrayList arrayListZ2 = Z();
            p247y7.AbstractC7350t.c(cVar);
            arrayListZ2.add(cVar);
        }
    }
}
