package p089i9;

/* JADX INFO: renamed from: i9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6690v implements p089i9.InterfaceC6677h, p129m9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Integer f47576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Integer f47577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Integer f47578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Integer f47579d;

    public C6690v(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        this.f47576a = num;
        this.f47577b = num2;
        this.f47578c = num3;
        this.f47579d = num4;
    }

    public /* synthetic */ C6690v(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : num, (i6 & 2) != 0 ? null : num2, (i6 & 4) != 0 ? null : num3, (i6 & 8) != 0 ? null : num4);
    }

    @Override // p129m9.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p089i9.C6690v e() {
        return new p089i9.C6690v(n(), w(), v(), s());
    }

    public final void b(p079h9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "date");
        t(java.lang.Integer.valueOf(hVar.o()));
        k(java.lang.Integer.valueOf(hVar.m()));
        o(java.lang.Integer.valueOf(hVar.g()));
        y(java.lang.Integer.valueOf(p079h9.d.b(hVar.i())));
    }

    public final p079h9.h c() {
        int iIntValue;
        p079h9.h hVar = new p079h9.h(((java.lang.Number) p089i9.A.d(n(), "year")).intValue(), ((java.lang.Number) p089i9.A.d(w(), "monthNumber")).intValue(), ((java.lang.Number) p089i9.A.d(v(), "dayOfMonth")).intValue());
        java.lang.Integer numS = s();
        if (numS == null || (iIntValue = numS.intValue()) == p079h9.d.b(hVar.i())) {
            return hVar;
        }
        throw new p079h9.c("Can not create a LocalDate from the given input: the day of week is " + p079h9.d.a(iIntValue) + " but the date is " + hVar + ", which is a " + hVar.i());
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p089i9.C6690v) {
            p089i9.C6690v c6690v = (p089i9.C6690v) obj;
            if (p247y7.AbstractC7350t.b(n(), c6690v.n()) && p247y7.AbstractC7350t.b(w(), c6690v.w()) && p247y7.AbstractC7350t.b(v(), c6690v.v()) && p247y7.AbstractC7350t.b(s(), c6690v.s())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.Integer numN = n();
        int iHashCode = (numN != null ? numN.hashCode() : 0) * 31;
        java.lang.Integer numW = w();
        int iHashCode2 = iHashCode + ((numW != null ? numW.hashCode() : 0) * 31);
        java.lang.Integer numV = v();
        int iHashCode3 = iHashCode2 + ((numV != null ? numV.hashCode() : 0) * 31);
        java.lang.Integer numS = s();
        return iHashCode3 + ((numS != null ? numS.hashCode() : 0) * 31);
    }

    @Override // p089i9.InterfaceC6677h
    public void k(java.lang.Integer num) {
        this.f47577b = num;
    }

    @Override // p089i9.InterfaceC6677h
    public java.lang.Integer n() {
        return this.f47576a;
    }

    @Override // p089i9.InterfaceC6677h
    public void o(java.lang.Integer num) {
        this.f47578c = num;
    }

    @Override // p089i9.InterfaceC6677h
    public java.lang.Integer s() {
        return this.f47579d;
    }

    @Override // p089i9.InterfaceC6677h
    public void t(java.lang.Integer num) {
        this.f47576a = num;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object objN = n();
        if (objN == null) {
            objN = "??";
        }
        sb.append(objN);
        sb.append('-');
        java.lang.Object objW = w();
        if (objW == null) {
            objW = "??";
        }
        sb.append(objW);
        sb.append('-');
        java.lang.Object objV = v();
        if (objV == null) {
            objV = "??";
        }
        sb.append(objV);
        sb.append(" (day of week is ");
        java.lang.Integer numS = s();
        sb.append(numS != null ? numS : "??");
        sb.append(')');
        return sb.toString();
    }

    @Override // p089i9.InterfaceC6677h
    public java.lang.Integer v() {
        return this.f47578c;
    }

    @Override // p089i9.InterfaceC6677h
    public java.lang.Integer w() {
        return this.f47577b;
    }

    @Override // p089i9.InterfaceC6677h
    public void y(java.lang.Integer num) {
        this.f47579d = num;
    }
}
