package com.mohamedrejeb.ksoup.html.parser;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    Caused by: java.lang.NullPointerException: parseDelimitedFrom(...) must not be null
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"௩"}, d2 = {"௪", "", "௫", "", "௬", "௭", "௮", "௯", "௰", "௱", "௲", "௳", "௴", "௵", "௶", "௷", "௸", "௹", "௺", "\u0bfb", "\u0bfc", "\u0bfd", "\u0bfe", "\u0bff", "ఀ", "ఁ", "ం", "ః", "", "ఄ", "", "అ", "ఆ", "ఇ"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KsoupHtmlOptions {
    public static final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.Companion Companion = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.Companion(null);
    private static final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions Default = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions(false, false, false, false, false, false, 63, null);
    private final boolean decodeEntities;
    private final boolean lowerCaseAttributeNames;
    private final boolean lowerCaseTags;
    private final boolean recognizeCDATA;
    private final boolean recognizeSelfClosing;
    private final boolean xmlMode;

    @kotlin.Metadata(d1 = {"\u0bd2"}, d2 = {"\u0bd3", "", "\u0bd4", "\u0bd5", "\u0bd6", "ௗ", "\u0bd8", "", "\u0bd9", "\u0bda", "\u0bdb", "\u0bdc", "\u0bdd", "\u0bde", "\u0bdf"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions options = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions(false, false, false, false, false, false, 63, null);

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions build() {
            return this.options;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.Builder decodeEntities(boolean z6) {
            this.options = com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.copy$default(this.options, false, z6, false, false, false, false, 61, null);
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.Builder lowerCaseAttributeNames(boolean z6) {
            this.options = com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.copy$default(this.options, false, false, false, z6, false, false, 55, null);
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.Builder lowerCaseTags(boolean z6) {
            this.options = com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.copy$default(this.options, false, false, z6, false, false, false, 59, null);
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.Builder recognizeCDATA(boolean z6) {
            this.options = com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.copy$default(this.options, false, false, false, false, z6, false, 47, null);
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.Builder recognizeSelfClosing(boolean z6) {
            this.options = com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.copy$default(this.options, false, false, false, false, false, z6, 31, null);
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.Builder xmlMode(boolean z6) {
            this.options = com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.copy$default(this.options, z6, false, false, false, false, false, 62, null);
            return this;
        }
    }

    @kotlin.Metadata(d1 = {"\u0be0"}, d2 = {"\u0be1", "", "\u0be2", "\u0be3", "\u0be4", "\u0be5", "௦", "௧", "௨"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions getDefault() {
            return com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.Default;
        }
    }

    public KsoupHtmlOptions() {
        this(false, false, false, false, false, false, 63, null);
    }

    public KsoupHtmlOptions(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.xmlMode = z6;
        this.decodeEntities = z10;
        this.lowerCaseTags = z11;
        this.lowerCaseAttributeNames = z12;
        this.recognizeCDATA = z13;
        this.recognizeSelfClosing = z14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KsoupHtmlOptions(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i6, p247y7.AbstractC7342k abstractC7342k) {
        z6 = (i6 & 1) != 0 ? false : z6;
        this(z6, (i6 & 2) != 0 ? true : z10, (i6 & 4) != 0 ? !z6 : z11, (i6 & 8) != 0 ? !z6 : z12, (i6 & 16) != 0 ? z6 : z13, (i6 & 32) != 0 ? z6 : z14);
    }

    public static /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions copy$default(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions ksoupHtmlOptions, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = ksoupHtmlOptions.xmlMode;
        }
        if ((i6 & 2) != 0) {
            z10 = ksoupHtmlOptions.decodeEntities;
        }
        boolean z15 = z10;
        if ((i6 & 4) != 0) {
            z11 = ksoupHtmlOptions.lowerCaseTags;
        }
        boolean z16 = z11;
        if ((i6 & 8) != 0) {
            z12 = ksoupHtmlOptions.lowerCaseAttributeNames;
        }
        boolean z17 = z12;
        if ((i6 & 16) != 0) {
            z13 = ksoupHtmlOptions.recognizeCDATA;
        }
        boolean z18 = z13;
        if ((i6 & 32) != 0) {
            z14 = ksoupHtmlOptions.recognizeSelfClosing;
        }
        return ksoupHtmlOptions.copy(z6, z15, z16, z17, z18, z14);
    }

    public final boolean component1() {
        return this.xmlMode;
    }

    public final boolean component2() {
        return this.decodeEntities;
    }

    public final boolean component3() {
        return this.lowerCaseTags;
    }

    public final boolean component4() {
        return this.lowerCaseAttributeNames;
    }

    public final boolean component5() {
        return this.recognizeCDATA;
    }

    public final boolean component6() {
        return this.recognizeSelfClosing;
    }

    public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions copy(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions(z6, z10, z11, z12, z13, z14);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions)) {
            return false;
        }
        com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions ksoupHtmlOptions = (com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions) obj;
        return this.xmlMode == ksoupHtmlOptions.xmlMode && this.decodeEntities == ksoupHtmlOptions.decodeEntities && this.lowerCaseTags == ksoupHtmlOptions.lowerCaseTags && this.lowerCaseAttributeNames == ksoupHtmlOptions.lowerCaseAttributeNames && this.recognizeCDATA == ksoupHtmlOptions.recognizeCDATA && this.recognizeSelfClosing == ksoupHtmlOptions.recognizeSelfClosing;
    }

    public final boolean getDecodeEntities() {
        return this.decodeEntities;
    }

    public final boolean getLowerCaseAttributeNames() {
        return this.lowerCaseAttributeNames;
    }

    public final boolean getLowerCaseTags() {
        return this.lowerCaseTags;
    }

    public final boolean getRecognizeCDATA() {
        return this.recognizeCDATA;
    }

    public final boolean getRecognizeSelfClosing() {
        return this.recognizeSelfClosing;
    }

    public final boolean getXmlMode() {
        return this.xmlMode;
    }

    public int hashCode() {
        return (((((((((p190t.h.a(this.xmlMode) * 31) + p190t.h.a(this.decodeEntities)) * 31) + p190t.h.a(this.lowerCaseTags)) * 31) + p190t.h.a(this.lowerCaseAttributeNames)) * 31) + p190t.h.a(this.recognizeCDATA)) * 31) + p190t.h.a(this.recognizeSelfClosing);
    }

    public java.lang.String toString() {
        return "KsoupHtmlOptions(xmlMode=" + this.xmlMode + ", decodeEntities=" + this.decodeEntities + ", lowerCaseTags=" + this.lowerCaseTags + ", lowerCaseAttributeNames=" + this.lowerCaseAttributeNames + ", recognizeCDATA=" + this.recognizeCDATA + ", recognizeSelfClosing=" + this.recognizeSelfClosing + ')';
    }
}
