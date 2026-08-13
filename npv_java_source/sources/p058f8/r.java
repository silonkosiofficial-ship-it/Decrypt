package p058f8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final P7.g f45392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p058f8.c f45393b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45394a;

        static {
            int[] iArr = new int[p058f8.h.values().length];
            try {
                iArr[p058f8.h.NULLABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p058f8.h.NOT_NULL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f45394a = iArr;
        }
    }

    static {
        p138n8.c cVar = X7.B.f15917v;
        p247y7.AbstractC7350t.e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        f45392a = new p058f8.c(cVar);
        p138n8.c cVar2 = X7.B.f15918w;
        p247y7.AbstractC7350t.e(cVar2, "ENHANCED_MUTABILITY_ANNOTATION");
        f45393b = new p058f8.c(cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P7.g e(java.util.List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new P7.k(p097j7.AbstractC6879v.T0(list)) : (P7.g) p097j7.AbstractC6879v.G0(list);
        }
        throw new java.lang.IllegalStateException("At least one Annotations object expected".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O7.InterfaceC1427h f(O7.InterfaceC1427h interfaceC1427h, p058f8.e eVar, p058f8.o oVar) {
        N7.d dVar = N7.d.f7840a;
        if (!p058f8.p.a(oVar) || !(interfaceC1427h instanceof O7.InterfaceC1424e)) {
            return null;
        }
        if (eVar.c() == p058f8.f.READ_ONLY && oVar == p058f8.o.FLEXIBLE_LOWER) {
            O7.InterfaceC1424e interfaceC1424e = (O7.InterfaceC1424e) interfaceC1427h;
            if (dVar.c(interfaceC1424e)) {
                return dVar.a(interfaceC1424e);
            }
        }
        if (eVar.c() != p058f8.f.MUTABLE || oVar != p058f8.o.FLEXIBLE_UPPER) {
            return null;
        }
        O7.InterfaceC1424e interfaceC1424e2 = (O7.InterfaceC1424e) interfaceC1427h;
        if (dVar.d(interfaceC1424e2)) {
            return dVar.b(interfaceC1424e2);
        }
        return null;
    }

    public static final P7.g g() {
        return f45392a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Boolean h(p058f8.e eVar, p058f8.o oVar) {
        if (!p058f8.p.a(oVar)) {
            return null;
        }
        p058f8.h hVarD = eVar.d();
        int i6 = hVarD == null ? -1 : f8.r.a.f45394a[hVarD.ordinal()];
        if (i6 == 1) {
            return java.lang.Boolean.TRUE;
        }
        if (i6 != 2) {
            return null;
        }
        return java.lang.Boolean.FALSE;
    }

    public static final boolean i(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return p058f8.s.c(G8.o.f3161a, e6);
    }
}
