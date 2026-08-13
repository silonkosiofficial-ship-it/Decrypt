package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class C5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3107a1 f26139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f26145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f26146h;

    public C5(com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1) {
        this.f26139a = interfaceC3107a1;
    }

    public final void a(byte[] bArr, int i6, int i10) {
        if (this.f26141c) {
            int i11 = this.f26144f;
            int i12 = (i6 + 1) - i11;
            if (i12 >= i10) {
                this.f26144f = i11 + (i10 - i6);
            } else {
                this.f26142d = ((bArr[i12] & 192) >> 6) == 0;
                this.f26141c = false;
            }
        }
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
    public final void b(long j6, int i6, boolean z6) {
        com.google.android.gms.internal.ads.LC.f(this.f26146h != -9223372036854775807L);
        if (this.f26143e == 182 && z6 && this.f26140b) {
            this.f26139a.b(this.f26146h, this.f26142d ? 1 : 0, (int) (j6 - this.f26145g), i6, null);
        }
        if (this.f26143e != 179) {
            this.f26145g = j6;
        }
    }

    public final void c(int i6, long j6) {
        boolean z6;
        this.f26143e = i6;
        this.f26142d = false;
        if (i6 == 182) {
            z6 = true;
        } else if (i6 == 179) {
            i6 = 179;
            z6 = true;
        } else {
            z6 = false;
        }
        this.f26140b = z6;
        this.f26141c = i6 == 182;
        this.f26144f = 0;
        this.f26146h = j6;
    }

    public final void d() {
        this.f26140b = false;
        this.f26141c = false;
        this.f26142d = false;
        this.f26143e = -1;
    }
}
