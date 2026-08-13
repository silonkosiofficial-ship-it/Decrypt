package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class r extends j$.util.concurrent.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    j$.util.concurrent.r f48104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    j$.util.concurrent.r f48105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    j$.util.concurrent.r f48106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    j$.util.concurrent.r f48107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f48108i;

    r(int i6, java.lang.Object obj, java.lang.Object obj2, j$.util.concurrent.l lVar, j$.util.concurrent.r rVar) {
        super(i6, obj, obj2, lVar);
        this.f48104e = rVar;
    }

    @Override // j$.util.concurrent.l
    final j$.util.concurrent.l a(int i6, java.lang.Object obj) {
        return b(i6, obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0047 A[PHI: r8
  0x0047: PHI (r8v5 java.lang.Class) = (r8v4 java.lang.Class), (r8v6 java.lang.Class) binds: [B:29:0x0040, B:21:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x004d A[SYNTHETIC] */
    final j$.util.concurrent.r b(int i6, java.lang.Object obj, java.lang.Class cls) {
        j$.util.concurrent.r rVarB;
        if (obj == null) {
            return null;
        }
        j$.util.concurrent.r rVar = this;
        do {
            j$.util.concurrent.r rVar2 = rVar.f48105f;
            j$.util.concurrent.r rVar3 = rVar.f48106g;
            int i10 = rVar.f48083a;
            if (i10 <= i6) {
                if (i10 >= i6) {
                    java.lang.Object obj2 = rVar.f48084b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return rVar;
                    }
                    if (rVar2 != null) {
                        if (rVar3 != null) {
                            if (cls == null && (cls = j$.util.concurrent.ConcurrentHashMap.c(obj)) == null) {
                                rVarB = rVar3.b(i6, obj, cls);
                                if (rVarB != null) {
                                    return rVarB;
                                }
                            } else {
                                int i11 = j$.util.concurrent.ConcurrentHashMap.f48049g;
                                int iCompareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((java.lang.Comparable) obj).compareTo(obj2);
                                if (iCompareTo == 0) {
                                    rVarB = rVar3.b(i6, obj, cls);
                                    if (rVarB != null) {
                                        return rVarB;
                                    }
                                } else if (iCompareTo >= 0) {
                                    rVar2 = rVar3;
                                }
                            }
                        }
                        rVar = rVar2;
                    }
                }
                rVar = rVar3;
            } else {
                rVar = rVar2;
            }
        } while (rVar != null);
        return null;
    }
}
