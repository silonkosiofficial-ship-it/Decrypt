package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6707e implements j$.time.format.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.format.f[] f47832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f47833b;

    C6707e(java.util.List list, boolean z6) {
        this((j$.time.format.f[]) list.toArray(new j$.time.format.f[list.size()]), z6);
    }

    C6707e(j$.time.format.f[] fVarArr, boolean z6) {
        this.f47832a = fVarArr;
        this.f47833b = z6;
    }

    public final j$.time.format.C6707e a() {
        return !this.f47833b ? this : new j$.time.format.C6707e(this.f47832a, false);
    }

    @Override // j$.time.format.f
    public final boolean n(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        int length = sb.length();
        boolean z6 = this.f47833b;
        if (z6) {
            xVar.g();
        }
        try {
            for (j$.time.format.f fVar : this.f47832a) {
                if (!fVar.n(xVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            return true;
        } finally {
            if (z6) {
                xVar.a();
            }
        }
    }

    @Override // j$.time.format.f
    public final int p(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i6) {
        boolean z6 = this.f47833b;
        j$.time.format.f[] fVarArr = this.f47832a;
        if (!z6) {
            for (j$.time.format.f fVar : fVarArr) {
                i6 = fVar.p(vVar, charSequence, i6);
                if (i6 < 0) {
                    break;
                }
            }
            return i6;
        }
        vVar.r();
        int iP = i6;
        for (j$.time.format.f fVar2 : fVarArr) {
            iP = fVar2.p(vVar, charSequence, iP);
            if (iP < 0) {
                vVar.f(false);
                return i6;
            }
        }
        vVar.f(true);
        return iP;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        j$.time.format.f[] fVarArr = this.f47832a;
        if (fVarArr != null) {
            boolean z6 = this.f47833b;
            sb.append(z6 ? "[" : "(");
            for (j$.time.format.f fVar : fVarArr) {
                sb.append(fVar);
            }
            sb.append(z6 ? "]" : ")");
        }
        return sb.toString();
    }
}
