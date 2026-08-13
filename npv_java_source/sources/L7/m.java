package L7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'F' uses external variables
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
public final class m {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final L7.m f6426F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final L7.m f6427G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final L7.m f6428H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final L7.m f6429I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ L7.m[] f6430J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f6431K;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p138n8.b f6432C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p138n8.f f6433D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p138n8.b f6434E;

    static {
        p138n8.b bVarE = p138n8.b.e("kotlin/UByte");
        p247y7.AbstractC7350t.e(bVarE, "fromString(...)");
        f6426F = new L7.m("UBYTE", 0, bVarE);
        p138n8.b bVarE2 = p138n8.b.e("kotlin/UShort");
        p247y7.AbstractC7350t.e(bVarE2, "fromString(...)");
        f6427G = new L7.m("USHORT", 1, bVarE2);
        p138n8.b bVarE3 = p138n8.b.e("kotlin/UInt");
        p247y7.AbstractC7350t.e(bVarE3, "fromString(...)");
        f6428H = new L7.m("UINT", 2, bVarE3);
        p138n8.b bVarE4 = p138n8.b.e("kotlin/ULong");
        p247y7.AbstractC7350t.e(bVarE4, "fromString(...)");
        f6429I = new L7.m("ULONG", 3, bVarE4);
        L7.m[] mVarArrE = e();
        f6430J = mVarArrE;
        f6431K = p157p7.b.a(mVarArrE);
    }

    private m(java.lang.String str, int i6, p138n8.b bVar) {
        super(str, i6);
        this.f6432C = bVar;
        p138n8.f fVarJ = bVar.j();
        p247y7.AbstractC7350t.e(fVarJ, "getShortClassName(...)");
        this.f6433D = fVarJ;
        this.f6434E = new p138n8.b(bVar.h(), p138n8.f.o(fVarJ.g() + "Array"));
    }

    private static final /* synthetic */ L7.m[] e() {
        return new L7.m[]{f6426F, f6427G, f6428H, f6429I};
    }

    public static L7.m valueOf(java.lang.String str) {
        return (L7.m) java.lang.Enum.valueOf(L7.m.class, str);
    }

    public static L7.m[] values() {
        return (L7.m[]) f6430J.clone();
    }

    public final p138n8.b g() {
        return this.f6434E;
    }

    public final p138n8.b i() {
        return this.f6432C;
    }

    public final p138n8.f m() {
        return this.f6433D;
    }
}
