package F0;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0.J f2491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F0.C0929o f2492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f2493c;

    public Q(F0.J j6, F0.C0929o c0929o, java.util.List list) {
        this.f2491a = j6;
        this.f2492b = c0929o;
        this.f2493c = list;
    }

    private final boolean b(F0.J j6) {
        java.lang.Object obj;
        F0.J jO0 = j6.o0();
        java.lang.Object obj2 = null;
        F0.J.e eVarX = jO0 != null ? jO0.X() : null;
        if (j6.k() || (j6.p0() != Integer.MAX_VALUE && jO0 != null && jO0.k())) {
            if (j6.e0()) {
                java.util.List list = this.f2493c;
                int size = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i6);
                    F0.V.a aVar = (F0.V.a) obj;
                    if (p247y7.AbstractC7350t.b(aVar.a(), j6) && !aVar.c()) {
                        break;
                    }
                    i6++;
                }
                if (obj != null) {
                    return true;
                }
            }
            if (j6.e0()) {
                return this.f2492b.d(j6) || j6.X() == F0.J.e.LookaheadMeasuring || (jO0 != null && jO0.e0()) || ((jO0 != null && jO0.Z()) || eVarX == F0.J.e.Measuring);
            }
            if (j6.W()) {
                return this.f2492b.d(j6) || jO0 == null || jO0.e0() || jO0.W() || eVarX == F0.J.e.Measuring || eVarX == F0.J.e.LayingOut;
            }
        }
        if (p247y7.AbstractC7350t.b(j6.N0(), java.lang.Boolean.TRUE)) {
            if (j6.Z()) {
                java.util.List list2 = this.f2493c;
                int size2 = list2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    java.lang.Object obj3 = list2.get(i10);
                    F0.V.a aVar2 = (F0.V.a) obj3;
                    if (p247y7.AbstractC7350t.b(aVar2.a(), j6) && aVar2.c()) {
                        obj2 = obj3;
                        break;
                    }
                }
                if (obj2 != null) {
                    return true;
                }
            }
            if (j6.Z()) {
                return this.f2492b.e(j6, true) || (jO0 != null && jO0.Z()) || eVarX == F0.J.e.LookaheadMeasuring || (jO0 != null && jO0.e0() && p247y7.AbstractC7350t.b(j6.b0(), j6));
            }
            if (j6.Y()) {
                return this.f2492b.e(j6, true) || jO0 == null || jO0.Z() || jO0.Y() || eVarX == F0.J.e.LookaheadMeasuring || eVarX == F0.J.e.LookaheadLayingOut || (jO0.W() && p247y7.AbstractC7350t.b(j6.b0(), j6));
            }
        }
        return true;
    }

    private final boolean c(F0.J j6) {
        if (!b(j6)) {
            return false;
        }
        java.util.List listH = j6.H();
        int size = listH.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!c((F0.J) listH.get(i6))) {
                return false;
            }
        }
        return true;
    }

    private final java.lang.String d() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Tree state:");
        p247y7.AbstractC7350t.e(sb, "append(value)");
        sb.append('\n');
        p247y7.AbstractC7350t.e(sb, "append('\\n')");
        e(this, sb, this.f2491a, 0);
        return sb.toString();
    }

    private static final void e(F0.Q q6, java.lang.StringBuilder sb, F0.J j6, int i6) {
        java.lang.String strF = q6.f(j6);
        if (strF.length() > 0) {
            for (int i10 = 0; i10 < i6; i10++) {
                sb.append("..");
            }
            sb.append(strF);
            p247y7.AbstractC7350t.e(sb, "append(value)");
            sb.append('\n');
            p247y7.AbstractC7350t.e(sb, "append('\\n')");
            i6++;
        }
        java.util.List listH = j6.H();
        int size = listH.size();
        for (int i11 = 0; i11 < size; i11++) {
            e(q6, sb, (F0.J) listH.get(i11), i6);
        }
    }

    private final java.lang.String f(F0.J j6) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(j6);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append('[');
        sb2.append(j6.X());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!j6.k()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + j6.g0() + ']');
        if (!b(j6)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    public final void a() {
        if (!c(this.f2491a)) {
            java.lang.System.out.println((java.lang.Object) d());
            throw new java.lang.IllegalStateException("Inconsistency found!");
        }
    }
}
