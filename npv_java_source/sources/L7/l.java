package L7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'E' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final L7.l f6418E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final L7.l f6419F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final L7.l f6420G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final L7.l f6421H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ L7.l[] f6422I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f6423J;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p138n8.b f6424C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p138n8.f f6425D;

    static {
        p138n8.b bVarE = p138n8.b.e("kotlin/UByteArray");
        p247y7.AbstractC7350t.e(bVarE, "fromString(...)");
        f6418E = new L7.l("UBYTEARRAY", 0, bVarE);
        p138n8.b bVarE2 = p138n8.b.e("kotlin/UShortArray");
        p247y7.AbstractC7350t.e(bVarE2, "fromString(...)");
        f6419F = new L7.l("USHORTARRAY", 1, bVarE2);
        p138n8.b bVarE3 = p138n8.b.e("kotlin/UIntArray");
        p247y7.AbstractC7350t.e(bVarE3, "fromString(...)");
        f6420G = new L7.l("UINTARRAY", 2, bVarE3);
        p138n8.b bVarE4 = p138n8.b.e("kotlin/ULongArray");
        p247y7.AbstractC7350t.e(bVarE4, "fromString(...)");
        f6421H = new L7.l("ULONGARRAY", 3, bVarE4);
        L7.l[] lVarArrE = e();
        f6422I = lVarArrE;
        f6423J = p157p7.b.a(lVarArrE);
    }

    private l(java.lang.String str, int i6, p138n8.b bVar) {
        super(str, i6);
        this.f6424C = bVar;
        p138n8.f fVarJ = bVar.j();
        p247y7.AbstractC7350t.e(fVarJ, "getShortClassName(...)");
        this.f6425D = fVarJ;
    }

    private static final /* synthetic */ L7.l[] e() {
        return new L7.l[]{f6418E, f6419F, f6420G, f6421H};
    }

    public static L7.l valueOf(java.lang.String str) {
        return (L7.l) java.lang.Enum.valueOf(L7.l.class, str);
    }

    public static L7.l[] values() {
        return (L7.l[]) f6422I.clone();
    }

    public final p138n8.f g() {
        return this.f6425D;
    }
}
