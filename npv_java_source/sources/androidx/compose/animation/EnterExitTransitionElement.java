package androidx.compose.animation;

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
@kotlin.Metadata(d1 = {"í"}, d2 = {"î", "ï", "ð", "ñ", "ò", "ó", "ô", "õ", "ö", "÷", "ø", "ù", "ú", "û", "ü", "ý", "þ", "ÿ", "", "Ā", "ā", "Ă", "ă", "Ą", "ą", "Ć", "ć", "Ĉ", "ĉ", "Ċ", "", "ċ", "Č", "", "č", "Ď", "", "ď", "Đ", "đ", "Ē", "ē", "Ĕ", "ĕ", "Ė", "ė", "Ę", "ę", "Ě", "ě", "Ĝ", "ĝ", "Ğ", "ğ", "Ġ", "ġ", "Ģ", "ģ", "Ĥ", "ĥ", "Ħ", "ħ", "Ĩ", "ĩ", "Ī", "ī", "Ĭ", "ĭ", "Į", "į", "İ", "ı", "Ĳ", "ĳ", "Ĵ", "ĵ", "Ķ", "ķ", "ĸ", "Ĺ"}, k = 1, mv = {1, 8, 0})
final class EnterExitTransitionElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p200u.s0 f18660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u.s0.a f18661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u.s0.a f18662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u.s0.a f18663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.compose.animation.h f18664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.compose.animation.j f18665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p237x7.a f18666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p190t.r f18667i;

    public EnterExitTransitionElement(p200u.s0 s0Var, u.s0.a aVar, u.s0.a aVar2, u.s0.a aVar3, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, p237x7.a aVar4, p190t.r rVar) {
        this.f18660b = s0Var;
        this.f18661c = aVar;
        this.f18662d = aVar2;
        this.f18663e = aVar3;
        this.f18664f = hVar;
        this.f18665g = jVar;
        this.f18666h = aVar4;
        this.f18667i = rVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.animation.EnterExitTransitionElement)) {
            return false;
        }
        androidx.compose.animation.EnterExitTransitionElement enterExitTransitionElement = (androidx.compose.animation.EnterExitTransitionElement) obj;
        return p247y7.AbstractC7350t.b(this.f18660b, enterExitTransitionElement.f18660b) && p247y7.AbstractC7350t.b(this.f18661c, enterExitTransitionElement.f18661c) && p247y7.AbstractC7350t.b(this.f18662d, enterExitTransitionElement.f18662d) && p247y7.AbstractC7350t.b(this.f18663e, enterExitTransitionElement.f18663e) && p247y7.AbstractC7350t.b(this.f18664f, enterExitTransitionElement.f18664f) && p247y7.AbstractC7350t.b(this.f18665g, enterExitTransitionElement.f18665g) && p247y7.AbstractC7350t.b(this.f18666h, enterExitTransitionElement.f18666h) && p247y7.AbstractC7350t.b(this.f18667i, enterExitTransitionElement.f18667i);
    }

    public int hashCode() {
        int iHashCode = this.f18660b.hashCode() * 31;
        u.s0.a aVar = this.f18661c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        u.s0.a aVar2 = this.f18662d;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        u.s0.a aVar3 = this.f18663e;
        return ((((((((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.f18664f.hashCode()) * 31) + this.f18665g.hashCode()) * 31) + this.f18666h.hashCode()) * 31) + this.f18667i.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.animation.g g() {
        return new androidx.compose.animation.g(this.f18660b, this.f18661c, this.f18662d, this.f18663e, this.f18664f, this.f18665g, this.f18666h, this.f18667i);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.animation.g gVar) {
        gVar.e2(this.f18660b);
        gVar.c2(this.f18661c);
        gVar.b2(this.f18662d);
        gVar.d2(this.f18663e);
        gVar.X1(this.f18664f);
        gVar.Y1(this.f18665g);
        gVar.W1(this.f18666h);
        gVar.Z1(this.f18667i);
    }

    public java.lang.String toString() {
        return "EnterExitTransitionElement(transition=" + this.f18660b + ", sizeAnimation=" + this.f18661c + ", offsetAnimation=" + this.f18662d + ", slideAnimation=" + this.f18663e + ", enter=" + this.f18664f + ", exit=" + this.f18665g + ", isEnabled=" + this.f18666h + ", graphicsLayerBlock=" + this.f18667i + ')';
    }
}
