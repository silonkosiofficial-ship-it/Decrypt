package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class E5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3107a1 f26885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.util.SparseArray f26886b = new android.util.SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.util.SparseArray f26887c = new android.util.SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f26888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f26890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f26891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f26892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f26893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f26894j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f26896l;

    public E5(com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1, boolean z6, boolean z10) {
        this.f26885a = interfaceC3107a1;
        byte[] bArr = new byte[128];
        this.f26888d = bArr;
        new com.google.android.gms.internal.ads.C2597Mb0(bArr, 0, 0);
        this.f26892h = false;
    }

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
    private final void g(int i6) {
        long j6 = this.f26894j;
        if (j6 == -9223372036854775807L) {
            return;
        }
        boolean z6 = this.f26895k;
        long j10 = this.f26890f - this.f26893i;
        this.f26885a.b(j6, z6 ? 1 : 0, (int) j10, i6, null);
    }

    private final void h() {
        boolean z6 = this.f26896l;
        boolean z10 = this.f26895k;
        int i6 = this.f26889e;
        boolean z11 = true;
        if (i6 != 5 && (!z6 || i6 != 1)) {
            z11 = false;
        }
        this.f26895k = z10 | z11;
    }

    public final void a(long j6) {
        h();
        this.f26890f = j6;
        g(0);
        this.f26892h = false;
    }

    public final void b(com.google.android.gms.internal.ads.C4149ja0 c4149ja0) {
        this.f26887c.append(c4149ja0.f36697a, c4149ja0);
    }

    public final void c(com.google.android.gms.internal.ads.C2522Ka0 c2522Ka0) {
        this.f26886b.append(c2522Ka0.f28964d, c2522Ka0);
    }

    public final void d() {
        this.f26892h = false;
    }

    public final void e(long j6, int i6, long j10, boolean z6) {
        this.f26889e = i6;
        this.f26891g = j10;
        this.f26890f = j6;
        this.f26896l = z6;
    }

    public final boolean f(long j6, int i6, boolean z6) {
        if (this.f26889e == 9) {
            if (z6 && this.f26892h) {
                g(i6 + ((int) (j6 - this.f26890f)));
            }
            this.f26893i = this.f26890f;
            this.f26894j = this.f26891g;
            this.f26895k = false;
            this.f26892h = true;
        }
        h();
        return this.f26895k;
    }
}
