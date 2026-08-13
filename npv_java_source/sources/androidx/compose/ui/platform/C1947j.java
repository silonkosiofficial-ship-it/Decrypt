package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1947j implements androidx.compose.ui.platform.InterfaceC1944i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.compose.ui.platform.C1947j.a f20122b = new androidx.compose.ui.platform.C1947j.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f20123c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.accessibility.AccessibilityManager f20124a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.j$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public C1947j(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("accessibility");
        p247y7.AbstractC7350t.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f20124a = (android.view.accessibility.AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.platform.InterfaceC1944i
    public long a(long j6, boolean z6, boolean z10, boolean z11) {
        int i6;
        int i10 = z6;
        if (j6 >= 2147483647L) {
            return j6;
        }
        if (z10) {
            i6 = (z6 ? 1 : 0) | 2;
        }
        if (z11) {
            i10 = i6;
            i10 = (i10 == true ? 1 : 0) | 4;
        }
        i10 = i6;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            int iA = androidx.compose.ui.platform.C1939g0.f20111a.a(this.f20124a, (int) j6, i10);
            if (iA != Integer.MAX_VALUE) {
                return iA;
            }
        } else if (!z11 || !this.f20124a.isTouchExplorationEnabled()) {
            return j6;
        }
        return Long.MAX_VALUE;
    }
}
