package p089i9;

/* JADX INFO: renamed from: i9.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6692x implements p089i9.N, p129m9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Integer f47582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Integer f47583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p089i9.EnumC6676g f47584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Integer f47585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.Integer f47586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.Integer f47587f;

    public C6692x(java.lang.Integer num, java.lang.Integer num2, p089i9.EnumC6676g enumC6676g, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5) {
        this.f47582a = num;
        this.f47583b = num2;
        this.f47584c = enumC6676g;
        this.f47585d = num3;
        this.f47586e = num4;
        this.f47587f = num5;
    }

    public /* synthetic */ C6692x(java.lang.Integer num, java.lang.Integer num2, p089i9.EnumC6676g enumC6676g, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : num, (i6 & 2) != 0 ? null : num2, (i6 & 4) != 0 ? null : enumC6676g, (i6 & 8) != 0 ? null : num3, (i6 & 16) != 0 ? null : num4, (i6 & 32) != 0 ? null : num5);
    }

    @Override // p089i9.N
    public java.lang.Integer A() {
        return this.f47586e;
    }

    @Override // p089i9.N
    public void C(java.lang.Integer num) {
        this.f47586e = num;
    }

    @Override // p089i9.N
    public java.lang.Integer a() {
        return this.f47585d;
    }

    @Override // p089i9.N
    public java.lang.Integer b() {
        return this.f47582a;
    }

    @Override // p129m9.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p089i9.C6692x e() {
        return new p089i9.C6692x(b(), r(), f(), a(), A(), q());
    }

    @Override // p089i9.N
    public void d(p099j9.a aVar) {
        i9.N.a.b(this, aVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p089i9.C6692x) {
            p089i9.C6692x c6692x = (p089i9.C6692x) obj;
            if (p247y7.AbstractC7350t.b(b(), c6692x.b()) && p247y7.AbstractC7350t.b(r(), c6692x.r()) && f() == c6692x.f() && p247y7.AbstractC7350t.b(a(), c6692x.a()) && p247y7.AbstractC7350t.b(A(), c6692x.A()) && p247y7.AbstractC7350t.b(q(), c6692x.q())) {
                return true;
            }
        }
        return false;
    }

    @Override // p089i9.N
    public p089i9.EnumC6676g f() {
        return this.f47584c;
    }

    @Override // p089i9.N
    public void g(p089i9.EnumC6676g enumC6676g) {
        this.f47584c = enumC6676g;
    }

    public final void h(p079h9.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "localTime");
        x(java.lang.Integer.valueOf(lVar.g()));
        i(java.lang.Integer.valueOf(((lVar.g() + 11) % 12) + 1));
        g(lVar.g() >= 12 ? p089i9.EnumC6676g.PM : p089i9.EnumC6676g.AM);
        m(java.lang.Integer.valueOf(lVar.i()));
        C(java.lang.Integer.valueOf(lVar.n()));
        j(java.lang.Integer.valueOf(lVar.m()));
    }

    public int hashCode() {
        java.lang.Integer numB = b();
        int iIntValue = (numB != null ? numB.intValue() : 0) * 31;
        java.lang.Integer numR = r();
        int iIntValue2 = iIntValue + ((numR != null ? numR.intValue() : 0) * 31);
        p089i9.EnumC6676g enumC6676gF = f();
        int iHashCode = iIntValue2 + ((enumC6676gF != null ? enumC6676gF.hashCode() : 0) * 31);
        java.lang.Integer numA = a();
        int iIntValue3 = iHashCode + ((numA != null ? numA.intValue() : 0) * 31);
        java.lang.Integer numA2 = A();
        int iIntValue4 = iIntValue3 + ((numA2 != null ? numA2.intValue() : 0) * 31);
        java.lang.Integer numQ = q();
        return iIntValue4 + (numQ != null ? numQ.intValue() : 0);
    }

    @Override // p089i9.N
    public void i(java.lang.Integer num) {
        this.f47583b = num;
    }

    @Override // p089i9.N
    public void j(java.lang.Integer num) {
        this.f47587f = num;
    }

    public final p079h9.l k() {
        int iIntValue;
        int iIntValue2;
        java.lang.Integer numB = b();
        if (numB != null) {
            iIntValue = numB.intValue();
            java.lang.Integer numR = r();
            if (numR != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = numR.intValue())) {
                throw new java.lang.IllegalArgumentException(("Inconsistent hour and hour-of-am-pm: hour is " + iIntValue + ", but hour-of-am-pm is " + iIntValue2).toString());
            }
            p089i9.EnumC6676g enumC6676gF = f();
            if (enumC6676gF != null) {
                if ((enumC6676gF == p089i9.EnumC6676g.PM) != (iIntValue >= 12)) {
                    throw new java.lang.IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + enumC6676gF).toString());
                }
            }
        } else {
            java.lang.Integer numR2 = r();
            java.lang.Integer numValueOf = null;
            if (numR2 != null) {
                int iIntValue3 = numR2.intValue();
                p089i9.EnumC6676g enumC6676gF2 = f();
                if (enumC6676gF2 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = java.lang.Integer.valueOf(iIntValue3 + (enumC6676gF2 != p089i9.EnumC6676g.PM ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new p079h9.c("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        int iIntValue4 = ((java.lang.Number) p089i9.A.d(a(), "minute")).intValue();
        java.lang.Integer numA = A();
        int iIntValue5 = numA != null ? numA.intValue() : 0;
        java.lang.Integer numQ = q();
        return new p079h9.l(iIntValue, iIntValue4, iIntValue5, numQ != null ? numQ.intValue() : 0);
    }

    @Override // p089i9.N
    public void m(java.lang.Integer num) {
        this.f47585d = num;
    }

    @Override // p089i9.N
    public p099j9.a p() {
        return i9.N.a.a(this);
    }

    @Override // p089i9.N
    public java.lang.Integer q() {
        return this.f47587f;
    }

    @Override // p089i9.N
    public java.lang.Integer r() {
        return this.f47583b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    public java.lang.String toString() {
        java.lang.String strB0;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object objB = b();
        if (objB == null) {
            objB = "??";
        }
        sb.append(objB);
        sb.append(':');
        java.lang.Object objA = a();
        if (objA == null) {
            objA = "??";
        }
        sb.append(objA);
        sb.append(':');
        java.lang.Integer numA = A();
        sb.append(numA != null ? numA : "??");
        sb.append('.');
        java.lang.Integer numQ = q();
        if (numQ != null) {
            java.lang.String strValueOf = java.lang.String.valueOf(numQ.intValue());
            strB0 = S8.r.B0(strValueOf, 9 - strValueOf.length(), '0');
            if (strB0 == null) {
                strB0 = "???";
            }
        } else {
            strB0 = "???";
        }
        sb.append(strB0);
        return sb.toString();
    }

    @Override // p089i9.N
    public void x(java.lang.Integer num) {
        this.f47582a = num;
    }
}
