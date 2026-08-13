package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class G5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3107a1 f27662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f27663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f27666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f27670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f27672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f27673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f27674m;

    public G5(com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1) {
        this.f27662a = interfaceC3107a1;
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
    private final void f(int i6) {
        long j6 = this.f27673l;
        if (j6 == -9223372036854775807L) {
            return;
        }
        boolean z6 = this.f27674m;
        long j10 = this.f27663b - this.f27672k;
        this.f27662a.b(j6, z6 ? 1 : 0, (int) j10, i6, null);
    }

    public final void a(long j6) {
        this.f27674m = this.f27664c;
        f((int) (j6 - this.f27663b));
        this.f27672k = this.f27663b;
        this.f27663b = j6;
        f(0);
        this.f27670i = false;
    }

    public final void b(long j6, int i6, boolean z6) {
        if (this.f27671j && this.f27668g) {
            this.f27674m = this.f27664c;
            this.f27671j = false;
        } else if (this.f27669h || this.f27668g) {
            if (z6 && this.f27670i) {
                f(i6 + ((int) (j6 - this.f27663b)));
            }
            this.f27672k = this.f27663b;
            this.f27673l = this.f27666e;
            this.f27674m = this.f27664c;
            this.f27670i = true;
        }
    }

    public final void c(byte[] bArr, int i6, int i10) {
        if (this.f27667f) {
            int i11 = this.f27665d;
            int i12 = (i6 + 2) - i11;
            if (i12 >= i10) {
                this.f27665d = i11 + (i10 - i6);
            } else {
                this.f27668g = (bArr[i12] & 128) != 0;
                this.f27667f = false;
            }
        }
    }

    public final void d() {
        this.f27667f = false;
        this.f27668g = false;
        this.f27669h = false;
        this.f27670i = false;
        this.f27671j = false;
    }

    public final void e(long j6, int i6, int i10, long j10, boolean z6) {
        this.f27668g = false;
        this.f27669h = false;
        this.f27666e = j10;
        this.f27665d = 0;
        this.f27663b = j6;
        if (i10 >= 32 && i10 != 40) {
            if (this.f27670i && !this.f27671j) {
                if (z6) {
                    f(i6);
                }
                this.f27670i = false;
            }
            if (i10 <= 35 || i10 == 39) {
                this.f27669h = !this.f27671j;
                this.f27671j = true;
            }
        }
        boolean z10 = i10 >= 16 && i10 <= 21;
        this.f27664c = z10;
        this.f27667f = z10 || i10 <= 9;
    }
}
