package p068g8;

/* JADX INFO: loaded from: classes2.dex */
final class q implements p068g8.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p068g8.q f45699a = new p068g8.q();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45700a;

        static {
            int[] iArr = new int[L7.h.values().length];
            try {
                iArr[L7.h.BOOLEAN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[L7.h.CHAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[L7.h.BYTE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[L7.h.SHORT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[L7.h.INT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[L7.h.FLOAT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[L7.h.LONG.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[L7.h.DOUBLE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            f45700a = iArr;
        }
    }

    private q() {
    }

    @Override // p068g8.p
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p068g8.o e(p068g8.o oVar) {
        p247y7.AbstractC7350t.f(oVar, "possiblyPrimitiveType");
        if (!(oVar instanceof g8.o.d)) {
            return oVar;
        }
        g8.o.d dVar = (g8.o.d) oVar;
        if (dVar.i() == null) {
            return oVar;
        }
        java.lang.String strF = p228w8.d.c(dVar.i().q()).f();
        p247y7.AbstractC7350t.e(strF, "getInternalName(...)");
        return d(strF);
    }

    @Override // p068g8.p
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public p068g8.o c(java.lang.String str) {
        p228w8.e eVar;
        p068g8.o cVar;
        p247y7.AbstractC7350t.f(str, "representation");
        str.length();
        char cCharAt = str.charAt(0);
        p228w8.e[] eVarArrValues = p228w8.e.values();
        int length = eVarArrValues.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i6];
            if (eVar.m().charAt(0) == cCharAt) {
                break;
            }
            i6++;
        }
        if (eVar != null) {
            return new g8.o.d(eVar);
        }
        if (cCharAt == 'V') {
            return new g8.o.d(null);
        }
        if (cCharAt == '[') {
            java.lang.String strSubstring = str.substring(1);
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            cVar = new g8.o.a(c(strSubstring));
        } else {
            if (cCharAt == 'L') {
                S8.r.f0(str, ';', false, 2, null);
            }
            java.lang.String strSubstring2 = str.substring(1, str.length() - 1);
            p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
            cVar = new g8.o.c(strSubstring2);
        }
        return cVar;
    }

    @Override // p068g8.p
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public g8.o.c d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "internalName");
        return new g8.o.c(str);
    }

    @Override // p068g8.p
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p068g8.o a(L7.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "primitiveType");
        switch (g8.q.a.f45700a[hVar.ordinal()]) {
            case 1:
                return p068g8.o.f45687a.a();
            case 2:
                return p068g8.o.f45687a.c();
            case 3:
                return p068g8.o.f45687a.b();
            case 4:
                return p068g8.o.f45687a.h();
            case 5:
                return p068g8.o.f45687a.f();
            case 6:
                return p068g8.o.f45687a.e();
            case 7:
                return p068g8.o.f45687a.g();
            case 8:
                return p068g8.o.f45687a.d();
            default:
                throw new p087i7.s();
        }
    }

    @Override // p068g8.p
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public p068g8.o f() {
        return d("java/lang/Class");
    }

    @Override // p068g8.p
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public java.lang.String b(p068g8.o oVar) {
        java.lang.StringBuilder sb;
        java.lang.String strM;
        p247y7.AbstractC7350t.f(oVar, "type");
        if (oVar instanceof g8.o.a) {
            sb = new java.lang.StringBuilder();
            sb.append('[');
            sb.append(b(((g8.o.a) oVar).i()));
        } else {
            if (oVar instanceof g8.o.d) {
                p228w8.e eVarI = ((g8.o.d) oVar).i();
                return (eVarI == null || (strM = eVarI.m()) == null) ? "V" : strM;
            }
            if (!(oVar instanceof g8.o.c)) {
                throw new p087i7.s();
            }
            sb = new java.lang.StringBuilder();
            sb.append('L');
            sb.append(((g8.o.c) oVar).i());
            sb.append(';');
        }
        return sb.toString();
    }
}
