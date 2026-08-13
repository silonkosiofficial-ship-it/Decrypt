package j$.util.stream;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class EnumC6756f3 {
    public static final j$.util.stream.EnumC6756f3 DISTINCT;
    public static final j$.util.stream.EnumC6756f3 ORDERED;
    public static final j$.util.stream.EnumC6756f3 SHORT_CIRCUIT;
    public static final j$.util.stream.EnumC6756f3 SIZED;
    public static final j$.util.stream.EnumC6756f3 SORTED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f48448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f48449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f48450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f48451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f48452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f48453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f48454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f48455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f48456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f48457o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f48458p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f48459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f48460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f48461s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f48462t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final int f48463u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ j$.util.stream.EnumC6756f3[] f48464v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f48465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f48469e;

    static {
        j$.util.stream.EnumC6751e3 enumC6751e3 = j$.util.stream.EnumC6751e3.SPLITERATOR;
        j$.util.stream.C6746d3 c6746d3Y = y(enumC6751e3);
        j$.util.stream.EnumC6751e3 enumC6751e4 = j$.util.stream.EnumC6751e3.STREAM;
        c6746d3Y.a(enumC6751e4);
        j$.util.stream.EnumC6751e3 enumC6751e5 = j$.util.stream.EnumC6751e3.OP;
        c6746d3Y.f48434a.put(enumC6751e5, 3);
        j$.util.stream.EnumC6756f3 enumC6756f3 = new j$.util.stream.EnumC6756f3("DISTINCT", 0, 0, c6746d3Y);
        DISTINCT = enumC6756f3;
        j$.util.stream.C6746d3 c6746d3Y2 = y(enumC6751e3);
        c6746d3Y2.a(enumC6751e4);
        c6746d3Y2.f48434a.put(enumC6751e5, 3);
        j$.util.stream.EnumC6756f3 enumC6756f4 = new j$.util.stream.EnumC6756f3("SORTED", 1, 1, c6746d3Y2);
        SORTED = enumC6756f4;
        j$.util.stream.C6746d3 c6746d3Y3 = y(enumC6751e3);
        c6746d3Y3.a(enumC6751e4);
        java.util.Map map = c6746d3Y3.f48434a;
        map.put(enumC6751e5, 3);
        j$.util.stream.EnumC6751e3 enumC6751e6 = j$.util.stream.EnumC6751e3.TERMINAL_OP;
        map.put(enumC6751e6, 2);
        j$.util.stream.EnumC6751e3 enumC6751e7 = j$.util.stream.EnumC6751e3.UPSTREAM_TERMINAL_OP;
        map.put(enumC6751e7, 2);
        j$.util.stream.EnumC6756f3 enumC6756f5 = new j$.util.stream.EnumC6756f3("ORDERED", 2, 2, c6746d3Y3);
        ORDERED = enumC6756f5;
        j$.util.stream.C6746d3 c6746d3Y4 = y(enumC6751e3);
        c6746d3Y4.a(enumC6751e4);
        c6746d3Y4.f48434a.put(enumC6751e5, 2);
        j$.util.stream.EnumC6756f3 enumC6756f6 = new j$.util.stream.EnumC6756f3("SIZED", 3, 3, c6746d3Y4);
        SIZED = enumC6756f6;
        j$.util.stream.C6746d3 c6746d3Y5 = y(enumC6751e5);
        c6746d3Y5.a(enumC6751e6);
        j$.util.stream.EnumC6756f3 enumC6756f7 = new j$.util.stream.EnumC6756f3("SHORT_CIRCUIT", 4, 12, c6746d3Y5);
        SHORT_CIRCUIT = enumC6756f7;
        f48464v = new j$.util.stream.EnumC6756f3[]{enumC6756f3, enumC6756f4, enumC6756f5, enumC6756f6, enumC6756f7};
        f48448f = p(enumC6751e3);
        f48449g = p(enumC6751e4);
        f48450h = p(enumC6751e5);
        p(enumC6751e6);
        p(enumC6751e7);
        int i6 = 0;
        for (j$.util.stream.EnumC6756f3 enumC6756f8 : values()) {
            i6 |= enumC6756f8.f48469e;
        }
        f48451i = i6;
        int i10 = f48449g;
        f48452j = i10;
        int i11 = i10 << 1;
        f48453k = i11;
        f48454l = i10 | i11;
        j$.util.stream.EnumC6756f3 enumC6756f9 = DISTINCT;
        f48455m = enumC6756f9.f48467c;
        f48456n = enumC6756f9.f48468d;
        j$.util.stream.EnumC6756f3 enumC6756f10 = SORTED;
        f48457o = enumC6756f10.f48467c;
        f48458p = enumC6756f10.f48468d;
        j$.util.stream.EnumC6756f3 enumC6756f11 = ORDERED;
        f48459q = enumC6756f11.f48467c;
        f48460r = enumC6756f11.f48468d;
        j$.util.stream.EnumC6756f3 enumC6756f12 = SIZED;
        f48461s = enumC6756f12.f48467c;
        f48462t = enumC6756f12.f48468d;
        f48463u = SHORT_CIRCUIT.f48467c;
    }

    private EnumC6756f3(java.lang.String str, int i6, int i10, j$.util.stream.C6746d3 c6746d3) {
        super(str, i6);
        j$.util.stream.EnumC6751e3[] enumC6751e3ArrValues = j$.util.stream.EnumC6751e3.values();
        int length = enumC6751e3ArrValues.length;
        int i11 = 0;
        while (true) {
            java.util.Map map = c6746d3.f48434a;
            if (i11 >= length) {
                this.f48465a = map;
                int i12 = i10 * 2;
                this.f48466b = i12;
                this.f48467c = 1 << i12;
                this.f48468d = 2 << i12;
                this.f48469e = 3 << i12;
                return;
            }
            j$.util.Map.EL.b(map, enumC6751e3ArrValues[i11], 0);
            i11++;
        }
    }

    static int M(int i6) {
        return i6 & ((~i6) >> 1) & f48452j;
    }

    static int n(int i6, int i10) {
        return i6 | (i10 & (i6 == 0 ? f48451i : ~(((f48452j & i6) << 1) | i6 | ((f48453k & i6) >> 1))));
    }

    private static int p(j$.util.stream.EnumC6751e3 enumC6751e3) {
        int iIntValue = 0;
        for (j$.util.stream.EnumC6756f3 enumC6756f3 : values()) {
            iIntValue |= ((java.lang.Integer) enumC6756f3.f48465a.get(enumC6751e3)).intValue() << enumC6756f3.f48466b;
        }
        return iIntValue;
    }

    static int q(j$.util.Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i6 = iCharacteristics & 4;
        int i10 = f48448f;
        return (i6 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i10 : iCharacteristics & i10 & (-5);
    }

    public static j$.util.stream.EnumC6756f3 valueOf(java.lang.String str) {
        return (j$.util.stream.EnumC6756f3) java.lang.Enum.valueOf(j$.util.stream.EnumC6756f3.class, str);
    }

    public static j$.util.stream.EnumC6756f3[] values() {
        return (j$.util.stream.EnumC6756f3[]) f48464v.clone();
    }

    private static j$.util.stream.C6746d3 y(j$.util.stream.EnumC6751e3 enumC6751e3) {
        j$.util.stream.C6746d3 c6746d3 = new j$.util.stream.C6746d3(new java.util.EnumMap(j$.util.stream.EnumC6751e3.class));
        c6746d3.a(enumC6751e3);
        return c6746d3;
    }

    final boolean u(int i6) {
        return (i6 & this.f48469e) == this.f48467c;
    }

    final boolean x(int i6) {
        int i10 = this.f48469e;
        return (i6 & i10) == i10;
    }
}
