package androidx.compose.ui.draw;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: java.lang.NullPointerException: parseDelimitedFrom(...) must not be null
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"݅"}, d2 = {"݆", "݇", "݈", "݉", "݊", "\u074b", "\u074c", "", "ݍ", "ݎ", "ݏ", "ݐ", "ݑ", "ݒ", "ݓ", "ݔ", "ݕ", "ݖ", "ݗ", "ݘ", "ݙ", "ݚ", "ݛ", "ݜ", "", "ݝ", "ݞ", "", "ݟ", "ݠ", "", "ݡ", "ݢ", "ݣ", "ݤ", "ݥ", "ݦ", "ݧ", "ݨ", "ݩ", "ݪ", "ݫ", "ݬ", "ݭ", "ݮ", "ݯ", "ݰ", "ݱ", "ݲ", "ݳ", "ݴ", "ݵ", "ݶ"}, k = 1, mv = {1, 8, 0})
public final class ShadowGraphicsLayerElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f19610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p141o0.e2 f19611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f19613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f19614f;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            cVar.p(cVar.B0(androidx.compose.ui.draw.ShadowGraphicsLayerElement.this.p()));
            cVar.l0(androidx.compose.ui.draw.ShadowGraphicsLayerElement.this.q());
            cVar.A(androidx.compose.ui.draw.ShadowGraphicsLayerElement.this.o());
            cVar.w(androidx.compose.ui.draw.ShadowGraphicsLayerElement.this.n());
            cVar.D(androidx.compose.ui.draw.ShadowGraphicsLayerElement.this.r());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return p087i7.M.f46721a;
        }
    }

    private ShadowGraphicsLayerElement(float f6, p141o0.e2 e2Var, boolean z6, long j6, long j10) {
        this.f19610b = f6;
        this.f19611c = e2Var;
        this.f19612d = z6;
        this.f19613e = j6;
        this.f19614f = j10;
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f6, p141o0.e2 e2Var, boolean z6, long j6, long j10, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, e2Var, z6, j6, j10);
    }

    private final p237x7.l m() {
        return new androidx.compose.ui.draw.ShadowGraphicsLayerElement.a();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.draw.ShadowGraphicsLayerElement)) {
            return false;
        }
        androidx.compose.ui.draw.ShadowGraphicsLayerElement shadowGraphicsLayerElement = (androidx.compose.ui.draw.ShadowGraphicsLayerElement) obj;
        return Y0.i.s(this.f19610b, shadowGraphicsLayerElement.f19610b) && p247y7.AbstractC7350t.b(this.f19611c, shadowGraphicsLayerElement.f19611c) && this.f19612d == shadowGraphicsLayerElement.f19612d && p141o0.C7016y0.o(this.f19613e, shadowGraphicsLayerElement.f19613e) && p141o0.C7016y0.o(this.f19614f, shadowGraphicsLayerElement.f19614f);
    }

    public int hashCode() {
        return (((((((Y0.i.t(this.f19610b) * 31) + this.f19611c.hashCode()) * 31) + p190t.h.a(this.f19612d)) * 31) + p141o0.C7016y0.u(this.f19613e)) * 31) + p141o0.C7016y0.u(this.f19614f);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p141o0.C6981m0 g() {
        return new p141o0.C6981m0(m());
    }

    public final long n() {
        return this.f19613e;
    }

    public final boolean o() {
        return this.f19612d;
    }

    public final float p() {
        return this.f19610b;
    }

    public final p141o0.e2 q() {
        return this.f19611c;
    }

    public final long r() {
        return this.f19614f;
    }

    public java.lang.String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((java.lang.Object) Y0.i.u(this.f19610b)) + ", shape=" + this.f19611c + ", clip=" + this.f19612d + ", ambientColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f19613e)) + ", spotColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f19614f)) + ')';
    }

    @Override // F0.W
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void j(p141o0.C6981m0 c6981m0) {
        c6981m0.V1(m());
        c6981m0.U1();
    }
}
