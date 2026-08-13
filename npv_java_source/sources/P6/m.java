package P6;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends U6.b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f8345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T6.C1660h f8346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f8347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f8348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f8349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f8351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.lang.Long f8352h;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f8353F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f8354G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f8355H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f8356I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f8357J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f8359L;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f8357J = obj;
            this.f8359L |= Integer.MIN_VALUE;
            return P6.m.this.d(null, this);
        }
    }

    public m(java.util.List list, java.lang.String str, T6.C1660h c1660h) {
        P6.n.b bVar;
        p247y7.AbstractC7350t.f(list, "parts");
        p247y7.AbstractC7350t.f(str, "boundary");
        p247y7.AbstractC7350t.f(c1660h, "contentType");
        this.f8345a = str;
        this.f8346b = c1660h;
        java.lang.Long l6 = null;
        byte[] bArrD = p037d7.e.d("--" + str + "\r\n", null, 1, null);
        this.f8347c = bArrD;
        byte[] bArrD2 = p037d7.e.d("--" + str + "--\r\n", null, 1, null);
        this.f8348d = bArrD2;
        this.f8349e = bArrD2.length;
        this.f8350f = (P6.b.f8337a.length * 2) + bArrD.length;
        java.util.List<U6.e> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        for (U6.e eVar : list2) {
            p149o9.p pVarA = p037d7.c.a();
            for (java.util.Map.Entry entry : eVar.e().a()) {
                p037d7.e.f(pVarA, ((java.lang.String) entry.getKey()) + ": " + p097j7.AbstractC6879v.r0((java.util.List) entry.getValue(), "; ", null, null, 0, null, null, 62, null), 0, 0, null, 14, null);
                p037d7.c.e(pVarA, P6.b.f8337a, 0, 0, 6, null);
            }
            T6.InterfaceC1668p interfaceC1668pE = eVar.e();
            T6.C1673v c1673v = T6.C1673v.f13241a;
            java.lang.String strD = interfaceC1668pE.d(c1673v.g());
            java.lang.Long lValueOf = strD != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(strD)) : null;
            if (eVar instanceof U6.e.a) {
                byte[] bArrA = p149o9.r.a(p037d7.c.b(pVarA));
                bVar = new P6.n.b(bArrA, ((U6.e.a) eVar).f(), lValueOf != null ? java.lang.Long.valueOf(lValueOf.longValue() + ((long) this.f8350f) + ((long) bArrA.length)) : null);
            } else {
                if (!(eVar instanceof U6.e.b)) {
                    throw new p087i7.s();
                }
                p149o9.a aVar = new p149o9.a();
                p037d7.e.f(aVar, ((U6.e.b) eVar).f(), 0, 0, null, 14, null);
                final byte[] bArrA2 = p149o9.r.a(aVar);
                p237x7.a aVar2 = new p237x7.a() { // from class: P6.l
                    @Override // p237x7.a
                    public final java.lang.Object b() {
                        return P6.m.f(bArrA2);
                    }
                };
                if (lValueOf == null) {
                    p037d7.e.f(pVarA, c1673v.g() + ": " + bArrA2.length, 0, 0, null, 14, null);
                    p037d7.c.e(pVarA, P6.b.f8337a, 0, 0, 6, null);
                }
                byte[] bArrA3 = p149o9.r.a(p037d7.c.b(pVarA));
                bVar = new P6.n.b(bArrA3, aVar2, java.lang.Long.valueOf(bArrA2.length + this.f8350f + bArrA3.length));
            }
            arrayList.add(bVar);
        }
        this.f8351g = arrayList;
        java.lang.Long lValueOf2 = 0L;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                l6 = lValueOf2;
                break;
            }
            java.lang.Long lB = ((P6.n) it.next()).b();
            if (lB == null) {
                break;
            } else {
                lValueOf2 = lValueOf2 != null ? java.lang.Long.valueOf(lValueOf2.longValue() + lB.longValue()) : null;
            }
        }
        this.f8352h = l6 != null ? java.lang.Long.valueOf(l6.longValue() + ((long) this.f8349e)) : l6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ m(java.util.List list, java.lang.String str, T6.C1660h c1660h, int i6, p247y7.AbstractC7342k abstractC7342k) {
        str = (i6 & 2) != 0 ? P6.b.e() : str;
        this(list, str, (i6 & 4) != 0 ? T6.C1660h.c.f13156a.a().g("boundary", str) : c1660h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p149o9.q f(byte[] bArr) {
        p149o9.a aVar = new p149o9.a();
        p037d7.c.e(aVar, bArr, 0, 0, 6, null);
        return aVar;
    }

    @Override // U6.b
    public java.lang.Long a() {
        return this.f8352h;
    }

    @Override // U6.b
    public T6.C1660h b() {
        return this.f8346b;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[Catch: all -> 0x018e, TryCatch #8 {all -> 0x018e, blocks: (B:47:0x00f7, B:49:0x00fd, B:53:0x0120, B:56:0x0141, B:59:0x0162, B:61:0x0166, B:66:0x018a, B:84:0x01c8, B:75:0x0196, B:76:0x0199, B:77:0x019a, B:79:0x019e, B:88:0x01e8, B:89:0x01ed, B:90:0x01ee, B:72:0x0193), top: B:124:0x00f7, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0161 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x019a A[Catch: all -> 0x018e, TryCatch #8 {all -> 0x018e, blocks: (B:47:0x00f7, B:49:0x00fd, B:53:0x0120, B:56:0x0141, B:59:0x0162, B:61:0x0166, B:66:0x018a, B:84:0x01c8, B:75:0x0196, B:76:0x0199, B:77:0x019a, B:79:0x019e, B:88:0x01e8, B:89:0x01ed, B:90:0x01ee, B:72:0x0193), top: B:124:0x00f7, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x019e A[Catch: all -> 0x018e, TryCatch #8 {all -> 0x018e, blocks: (B:47:0x00f7, B:49:0x00fd, B:53:0x0120, B:56:0x0141, B:59:0x0162, B:61:0x0166, B:66:0x018a, B:84:0x01c8, B:75:0x0196, B:76:0x0199, B:77:0x019a, B:79:0x019e, B:88:0x01e8, B:89:0x01ed, B:90:0x01ee, B:72:0x0193), top: B:124:0x00f7, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x01e4  */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0066: MOVE (r2 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:23:0x0065 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00b8: MOVE (r2 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:37:0x00b7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01e4 -> B:124:0x00f7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // U6.b.d
    public java.lang.Object d(io.ktor.utils.io.g r24, p127m7.e r25) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P6.m.d(io.ktor.utils.io.g, m7.e):java.lang.Object");
    }
}
