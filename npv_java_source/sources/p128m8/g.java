package p128m8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g implements p108k8.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m8.g.a f51220d = new m8.g.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.String f51221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.List f51222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.Map f51223g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String[] f51224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Set f51225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f51226c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51227a;

        static {
            int[] iArr = new int[l8.a.e.c.EnumC0643c.values().length];
            try {
                iArr[l8.a.e.c.EnumC0643c.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[l8.a.e.c.EnumC0643c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[l8.a.e.c.EnumC0643c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f51227a = iArr;
        }
    }

    static {
        java.lang.String strR0 = p097j7.AbstractC6879v.r0(p097j7.AbstractC6879v.p('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        f51221e = strR0;
        java.util.List listP = p097j7.AbstractC6879v.p(strR0 + "/Any", strR0 + "/Nothing", strR0 + "/Unit", strR0 + "/Throwable", strR0 + "/Number", strR0 + "/Byte", strR0 + "/Double", strR0 + "/Float", strR0 + "/Int", strR0 + "/Long", strR0 + "/Short", strR0 + "/Boolean", strR0 + "/Char", strR0 + "/CharSequence", strR0 + "/String", strR0 + "/Comparable", strR0 + "/Enum", strR0 + "/Array", strR0 + "/ByteArray", strR0 + "/DoubleArray", strR0 + "/FloatArray", strR0 + "/IntArray", strR0 + "/LongArray", strR0 + "/ShortArray", strR0 + "/BooleanArray", strR0 + "/CharArray", strR0 + "/Cloneable", strR0 + "/Annotation", strR0 + "/collections/Iterable", strR0 + "/collections/MutableIterable", strR0 + "/collections/Collection", strR0 + "/collections/MutableCollection", strR0 + "/collections/List", strR0 + "/collections/MutableList", strR0 + "/collections/Set", strR0 + "/collections/MutableSet", strR0 + "/collections/Map", strR0 + "/collections/MutableMap", strR0 + "/collections/Map.Entry", strR0 + "/collections/MutableMap.MutableEntry", strR0 + "/collections/Iterator", strR0 + "/collections/MutableIterator", strR0 + "/collections/ListIterator", strR0 + "/collections/MutableListIterator");
        f51222f = listP;
        java.lang.Iterable<p097j7.L> iterableA1 = p097j7.AbstractC6879v.a1(listP);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(iterableA1, 10)), 16));
        for (p097j7.L l6 : iterableA1) {
            linkedHashMap.put((java.lang.String) l6.d(), java.lang.Integer.valueOf(l6.c()));
        }
        f51223g = linkedHashMap;
    }

    public g(java.lang.String[] strArr, java.util.Set set, java.util.List list) {
        p247y7.AbstractC7350t.f(strArr, "strings");
        p247y7.AbstractC7350t.f(set, "localNameIndices");
        p247y7.AbstractC7350t.f(list, "records");
        this.f51224a = strArr;
        this.f51225b = set;
        this.f51226c = list;
    }

    @Override // p108k8.c
    public java.lang.String a(int i6) {
        return getString(i6);
    }

    @Override // p108k8.c
    public boolean b(int i6) {
        return this.f51225b.contains(java.lang.Integer.valueOf(i6));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    @Override // p108k8.c
    public java.lang.String getString(int i6) {
        java.lang.String strSubstring;
        l8.a.e.c cVar = (l8.a.e.c) this.f51226c.get(i6);
        if (cVar.P()) {
            strSubstring = cVar.I();
        } else if (cVar.N()) {
            java.util.List list = f51222f;
            int size = list.size();
            int iE = cVar.E();
            if (iE < 0 || iE >= size) {
                strSubstring = this.f51224a[i6];
            } else {
                strSubstring = (java.lang.String) list.get(cVar.E());
            }
        } else {
            strSubstring = this.f51224a[i6];
        }
        if (cVar.K() >= 2) {
            java.util.List listL = cVar.L();
            p247y7.AbstractC7350t.c(listL);
            java.lang.Integer num = (java.lang.Integer) listL.get(0);
            java.lang.Integer num2 = (java.lang.Integer) listL.get(1);
            p247y7.AbstractC7350t.c(num);
            if (num.intValue() >= 0) {
                int iIntValue = num.intValue();
                p247y7.AbstractC7350t.c(num2);
                if (iIntValue <= num2.intValue() && num2.intValue() <= strSubstring.length()) {
                    p247y7.AbstractC7350t.c(strSubstring);
                    strSubstring = strSubstring.substring(num.intValue(), num2.intValue());
                    p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
                }
            }
        }
        java.lang.String strQ = strSubstring;
        if (cVar.G() >= 2) {
            java.util.List listH = cVar.H();
            p247y7.AbstractC7350t.c(listH);
            java.lang.Integer num3 = (java.lang.Integer) listH.get(0);
            java.lang.Integer num4 = (java.lang.Integer) listH.get(1);
            p247y7.AbstractC7350t.c(strQ);
            strQ = S8.r.Q(strQ, (char) num3.intValue(), (char) num4.intValue(), false, 4, null);
        }
        java.lang.String strQ2 = strQ;
        l8.a.e.c.EnumC0643c enumC0643cD = cVar.D();
        if (enumC0643cD == null) {
            enumC0643cD = l8.a.e.c.EnumC0643c.NONE;
        }
        int i10 = m8.g.b.f51227a[enumC0643cD.ordinal()];
        if (i10 == 2) {
            p247y7.AbstractC7350t.c(strQ2);
            strQ2 = S8.r.Q(strQ2, '$', '.', false, 4, null);
        } else if (i10 == 3) {
            if (strQ2.length() >= 2) {
                p247y7.AbstractC7350t.c(strQ2);
                strQ2 = strQ2.substring(1, strQ2.length() - 1);
                p247y7.AbstractC7350t.e(strQ2, "substring(...)");
            }
            java.lang.String str = strQ2;
            p247y7.AbstractC7350t.c(str);
            strQ2 = S8.r.Q(str, '$', '.', false, 4, null);
        }
        p247y7.AbstractC7350t.c(strQ2);
        return strQ2;
    }
}
