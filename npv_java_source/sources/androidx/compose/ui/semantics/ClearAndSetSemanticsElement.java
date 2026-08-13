package androidx.compose.ui.semantics;

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
@kotlin.Metadata(d1 = {"\u098e"}, d2 = {"এ", "ঐ", "\u0991", "\u0992", "ও", "ঔ", "ক", "খ", "গ", "ঘ", "ঙ", "চ", "ছ", "জ", "ঝ", "", "ঞ", "ট", "", "ঠ", "ড", "", "ঢ", "", "ণ", "ত", "থ", "দ", "ধ", "ন", "\u09a9", "প", "ফ", "ব", "ভ"}, k = 1, mv = {1, 8, 0})
public final class ClearAndSetSemanticsElement extends F0.W implements K0.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f20460b;

    public ClearAndSetSemanticsElement(p237x7.l lVar) {
        this.f20460b = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.compose.ui.semantics.ClearAndSetSemanticsElement) && p247y7.AbstractC7350t.b(this.f20460b, ((androidx.compose.ui.semantics.ClearAndSetSemanticsElement) obj).f20460b);
    }

    public int hashCode() {
        return this.f20460b.hashCode();
    }

    @Override // K0.m
    public K0.k i() {
        K0.k kVar = new K0.k();
        kVar.P(false);
        kVar.O(true);
        this.f20460b.l(kVar);
        return kVar;
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public K0.c g() {
        return new K0.c(false, true, this.f20460b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(K0.c cVar) {
        cVar.U1(this.f20460b);
    }

    public java.lang.String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f20460b + ')';
    }
}
