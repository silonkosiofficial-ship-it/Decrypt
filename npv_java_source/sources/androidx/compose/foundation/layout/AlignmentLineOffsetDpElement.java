package androidx.compose.foundation.layout;

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
@kotlin.Metadata(d1 = {"́"}, d2 = {"̂", "̃", "̄", "̅", "̆", "̇", "̈", "̉", "̊", "̋", "̌", "̍", "̎", "̏", "̐", "̑", "̒", "̓", "̔", "", "̕", "", "̖", "̗", "", "̘", "̙", "̚", "̛", "̜", "̝", "̞", "̟", "̠", "̡", "̢", "̣", "̤", "̥", "̦", "̧", "̨"}, k = 1, mv = {1, 8, 0})
final class AlignmentLineOffsetDpElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D0.AbstractC0882a f19177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f19178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f19179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.l f19180e;

    private AlignmentLineOffsetDpElement(D0.AbstractC0882a abstractC0882a, float f6, float f10, p237x7.l lVar) {
        this.f19177b = abstractC0882a;
        this.f19178c = f6;
        this.f19179d = f10;
        this.f19180e = lVar;
        if ((f6 < 0.0f && !Y0.i.s(f6, Y0.i.f16208D.c())) || (f10 < 0.0f && !Y0.i.s(f10, Y0.i.f16208D.c()))) {
            throw new java.lang.IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    public /* synthetic */ AlignmentLineOffsetDpElement(D0.AbstractC0882a abstractC0882a, float f6, float f10, p237x7.l lVar, p247y7.AbstractC7342k abstractC7342k) {
        this(abstractC0882a, f6, f10, lVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        androidx.compose.foundation.layout.AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof androidx.compose.foundation.layout.AlignmentLineOffsetDpElement ? (androidx.compose.foundation.layout.AlignmentLineOffsetDpElement) obj : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return p247y7.AbstractC7350t.b(this.f19177b, alignmentLineOffsetDpElement.f19177b) && Y0.i.s(this.f19178c, alignmentLineOffsetDpElement.f19178c) && Y0.i.s(this.f19179d, alignmentLineOffsetDpElement.f19179d);
    }

    public int hashCode() {
        return (((this.f19177b.hashCode() * 31) + Y0.i.t(this.f19178c)) * 31) + Y0.i.t(this.f19179d);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.b g() {
        return new androidx.compose.foundation.layout.b(this.f19177b, this.f19178c, this.f19179d, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.layout.b bVar) {
        bVar.U1(this.f19177b);
        bVar.V1(this.f19178c);
        bVar.T1(this.f19179d);
    }
}
