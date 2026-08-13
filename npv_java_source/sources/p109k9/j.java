package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements p109k9.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f49849a;

    public j(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "string");
        this.f49849a = str;
    }

    @Override // p109k9.o
    public p119l9.e a() {
        return new p119l9.c(this.f49849a);
    }

    @Override // p109k9.o
    public p129m9.q b() {
        java.lang.String strSubstring;
        java.util.List listA;
        java.lang.Object rVar;
        if (this.f49849a.length() == 0) {
            listA = p097j7.AbstractC6879v.m();
        } else {
            java.util.List listC = p097j7.AbstractC6879v.c();
            java.lang.String strSubstring2 = "";
            if (p099j9.f.b(this.f49849a.charAt(0))) {
                java.lang.String strSubstring3 = this.f49849a;
                int length = strSubstring3.length();
                for (int i6 = 0; i6 < length; i6++) {
                    if (!p099j9.f.b(strSubstring3.charAt(i6))) {
                        strSubstring3 = strSubstring3.substring(0, i6);
                        p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
                        break;
                    }
                }
                listC.add(new p129m9.h(p097j7.AbstractC6879v.e(new p129m9.b(strSubstring3))));
                java.lang.String str = this.f49849a;
                int length2 = str.length();
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        strSubstring = "";
                        break;
                    }
                    if (!p099j9.f.b(str.charAt(i10))) {
                        strSubstring = str.substring(i10);
                        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
                        break;
                    }
                    i10++;
                }
            } else {
                strSubstring = this.f49849a;
            }
            if (strSubstring.length() > 0) {
                if (p099j9.f.b(strSubstring.charAt(strSubstring.length() - 1))) {
                    for (int iJ0 = S8.r.j0(strSubstring); -1 < iJ0; iJ0--) {
                        if (!p099j9.f.b(strSubstring.charAt(iJ0))) {
                            strSubstring2 = strSubstring.substring(0, iJ0 + 1);
                            p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
                            break;
                        }
                    }
                    listC.add(new p129m9.r(strSubstring2));
                    for (int iJ1 = S8.r.j0(strSubstring); -1 < iJ1; iJ1--) {
                        if (!p099j9.f.b(strSubstring.charAt(iJ1))) {
                            strSubstring = strSubstring.substring(iJ1 + 1);
                            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
                            break;
                        }
                    }
                    rVar = new p129m9.h(p097j7.AbstractC6879v.e(new p129m9.b(strSubstring)));
                } else {
                    rVar = new p129m9.r(strSubstring);
                }
                listC.add(rVar);
            }
            listA = p097j7.AbstractC6879v.a(listC);
        }
        return new p129m9.q(listA, p097j7.AbstractC6879v.m());
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p109k9.j) && p247y7.AbstractC7350t.b(this.f49849a, ((p109k9.j) obj).f49849a);
    }

    public int hashCode() {
        return this.f49849a.hashCode();
    }

    public java.lang.String toString() {
        return "ConstantFormatStructure(" + this.f49849a + ')';
    }
}
