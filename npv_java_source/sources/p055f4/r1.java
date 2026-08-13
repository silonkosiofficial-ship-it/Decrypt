package p055f4;

/* JADX INFO: loaded from: classes3.dex */
final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p055f4.s1 f45243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p055f4.C6572o0 f45244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45245c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private L4.c.EnumC0153c f45246d = L4.c.EnumC0153c.UNKNOWN;

    r1(p055f4.s1 s1Var, p055f4.C6572o0 c6572o0) {
        this.f45243a = s1Var;
        this.f45244b = c6572o0;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    final p055f4.u1 a() throws p055f4.Z0 {
        L4.c.EnumC0153c enumC0153c;
        java.lang.String str;
        int i6 = this.f45244b.f45213f;
        this.f45243a.f45250c.g(i6 == 8);
        int i10 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
                this.f45245c = 3;
                break;
            case 4:
                this.f45245c = 2;
                break;
            case 5:
                this.f45245c = 1;
                break;
            case 6:
                throw new p055f4.Z0(1, "Invalid response from server: ".concat(java.lang.String.valueOf(this.f45244b.f45210c)));
            case 7:
                throw new p055f4.Z0(3, "Publisher misconfiguration: ".concat(java.lang.String.valueOf(this.f45244b.f45210c)));
            default:
                throw new p055f4.Z0(1, "Invalid response from server.");
        }
        p055f4.C6572o0 c6572o0 = this.f45244b;
        int i11 = c6572o0.f45214g;
        int i12 = i11 - 1;
        if (i11 == 0) {
            throw null;
        }
        if (i12 == 1) {
            enumC0153c = L4.c.EnumC0153c.REQUIRED;
        } else {
            if (i12 != 2) {
                throw new p055f4.Z0(1, "Invalid response from server.");
            }
            enumC0153c = L4.c.EnumC0153c.NOT_REQUIRED;
        }
        this.f45246d = enumC0153c;
        java.lang.String str2 = c6572o0.f45208a;
        p055f4.S s6 = str2 == null ? null : new p055f4.S(c6572o0.f45209b, str2);
        this.f45243a.f45250c.i(new java.util.HashSet(c6572o0.f45211d));
        for (p055f4.C6570n0 c6570n0 : this.f45244b.f45212e) {
            int i13 = c6570n0.f45202b;
            int i14 = i13 - 1;
            if (i13 == 0) {
                throw null;
            }
            if (i14 == 0) {
                str = null;
            } else if (i14 == 1) {
                str = "write";
            } else if (i14 != 2) {
                str = null;
            } else {
                str = "clear";
            }
            if (str != null) {
                p055f4.s1 s1Var = this.f45243a;
                s1Var.f45248a.b(str, c6570n0.f45201a, s1Var.f45249b);
            }
        }
        return new p055f4.u1(this.f45245c, this.f45246d, s6, null);
    }
}
