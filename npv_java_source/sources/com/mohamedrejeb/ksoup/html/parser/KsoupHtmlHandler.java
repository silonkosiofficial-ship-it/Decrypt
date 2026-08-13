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
@kotlin.Metadata(d1 = {"ன"}, d2 = {"ப", "", "\u0bab", "\u0bac", "\u0bad", "ம", "ய", "ர", "ற", "ல", "ள", "ழ", "வ", "ஶ", "ஷ", "", "ஸ", "", "ஹ", "\u0bba", "\u0bbb", "\u0bbc", "\u0bbd", "ா", "ி", "ீ", "ு", "", "ூ", "\u0bc3", "\u0bc4", "\u0bc5", "ெ", "ே", "ை", "\u0bc9", "ொ", "ோ", "ௌ", "்", "\u0bce", "\u0bcf", "ௐ", "\u0bd1"}, k = 1, mv = {2, 0, 0})
public interface KsoupHtmlHandler {

    @kotlin.Metadata(d1 = {"\u0b84"}, d2 = {"அ", "", "ஆ", "இ", "ஈ", "உ", "ஊ", "\u0b8b", "\u0b8c", "\u0b8d", "எ", "ஏ", "ஐ", "\u0b91", "ஒ", "ஓ", "ஔ", "க", "", "", "\u0b96", "\u0b97", "\u0b98", "ங", "ச", "\u0b9b", "", "ஜ", "\u0b9d", "ஞ", "ட", "\u0ba0", "\u0ba1", "\u0ba2", "ண", "த", "\u0ba5", "\u0ba6", "\u0ba7", "ந"}, k = 1, mv = {2, 0, 0})
    public static final class Builder {
        private com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler handler = com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Default.INSTANCE;

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler build() {
            return this.handler;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onAttribute(final p237x7.q qVar) {
            p247y7.AbstractC7350t.f(qVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onAttribute$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    qVar.j(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    this.$$delegate_0.onCDataEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    this.$$delegate_0.onCDataStart();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onCloseTag(str, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    this.$$delegate_0.onComment(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    this.$$delegate_0.onCommentEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    this.$$delegate_0.onEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    this.$$delegate_0.onError(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    this.$$delegate_0.onOpenTag(str, map, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onOpenTagName(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    this.$$delegate_0.onParserInit(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    this.$$delegate_0.onProcessingInstruction(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    this.$$delegate_0.onReset();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    this.$$delegate_0.onText(str);
                }
            };
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onCDataEnd(final p237x7.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onCDataEnd$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    this.$$delegate_0.onAttribute(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    aVar.b();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    this.$$delegate_0.onCDataStart();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onCloseTag(str, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    this.$$delegate_0.onComment(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    this.$$delegate_0.onCommentEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    this.$$delegate_0.onEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    this.$$delegate_0.onError(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    this.$$delegate_0.onOpenTag(str, map, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onOpenTagName(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    this.$$delegate_0.onParserInit(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    this.$$delegate_0.onProcessingInstruction(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    this.$$delegate_0.onReset();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    this.$$delegate_0.onText(str);
                }
            };
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onCDataStart(final p237x7.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onCDataStart$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    this.$$delegate_0.onAttribute(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    this.$$delegate_0.onCDataEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    aVar.b();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onCloseTag(str, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    this.$$delegate_0.onComment(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    this.$$delegate_0.onCommentEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    this.$$delegate_0.onEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    this.$$delegate_0.onError(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    this.$$delegate_0.onOpenTag(str, map, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onOpenTagName(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    this.$$delegate_0.onParserInit(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    this.$$delegate_0.onProcessingInstruction(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    this.$$delegate_0.onReset();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    this.$$delegate_0.onText(str);
                }
            };
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onCloseTag(final p237x7.p pVar) {
            p247y7.AbstractC7350t.f(pVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onCloseTag$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    this.$$delegate_0.onAttribute(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    this.$$delegate_0.onCDataEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    this.$$delegate_0.onCDataStart();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    pVar.u(str, java.lang.Boolean.valueOf(z6));
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    this.$$delegate_0.onComment(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    this.$$delegate_0.onCommentEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    this.$$delegate_0.onEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    this.$$delegate_0.onError(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    this.$$delegate_0.onOpenTag(str, map, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onOpenTagName(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    this.$$delegate_0.onParserInit(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    this.$$delegate_0.onProcessingInstruction(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    this.$$delegate_0.onReset();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    this.$$delegate_0.onText(str);
                }
            };
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onComment(final p237x7.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onComment$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    this.$$delegate_0.onAttribute(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    this.$$delegate_0.onCDataEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    this.$$delegate_0.onCDataStart();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onCloseTag(str, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    lVar.l(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    this.$$delegate_0.onCommentEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    this.$$delegate_0.onEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    this.$$delegate_0.onError(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    this.$$delegate_0.onOpenTag(str, map, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onOpenTagName(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    this.$$delegate_0.onParserInit(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    this.$$delegate_0.onProcessingInstruction(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    this.$$delegate_0.onReset();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    this.$$delegate_0.onText(str);
                }
            };
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onCommentEnd(final p237x7.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onCommentEnd$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    this.$$delegate_0.onAttribute(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    this.$$delegate_0.onCDataEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    this.$$delegate_0.onCDataStart();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onCloseTag(str, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    this.$$delegate_0.onComment(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    aVar.b();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    this.$$delegate_0.onEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    this.$$delegate_0.onError(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    this.$$delegate_0.onOpenTag(str, map, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onOpenTagName(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    this.$$delegate_0.onParserInit(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    this.$$delegate_0.onProcessingInstruction(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    this.$$delegate_0.onReset();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    this.$$delegate_0.onText(str);
                }
            };
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onEnd(final p237x7.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onEnd$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    this.$$delegate_0.onAttribute(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    this.$$delegate_0.onCDataEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    this.$$delegate_0.onCDataStart();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onCloseTag(str, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    this.$$delegate_0.onComment(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    this.$$delegate_0.onCommentEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    aVar.b();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    this.$$delegate_0.onError(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    this.$$delegate_0.onOpenTag(str, map, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onOpenTagName(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    this.$$delegate_0.onParserInit(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    this.$$delegate_0.onProcessingInstruction(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    this.$$delegate_0.onReset();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    this.$$delegate_0.onText(str);
                }
            };
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onError(final p237x7.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onError$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    this.$$delegate_0.onAttribute(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    this.$$delegate_0.onCDataEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    this.$$delegate_0.onCDataStart();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onCloseTag(str, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    this.$$delegate_0.onComment(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    this.$$delegate_0.onCommentEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    this.$$delegate_0.onEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    lVar.l(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    this.$$delegate_0.onOpenTag(str, map, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onOpenTagName(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    this.$$delegate_0.onParserInit(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    this.$$delegate_0.onProcessingInstruction(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    this.$$delegate_0.onReset();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    this.$$delegate_0.onText(str);
                }
            };
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onOpenTag(final p237x7.q qVar) {
            p247y7.AbstractC7350t.f(qVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onOpenTag$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    this.$$delegate_0.onAttribute(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    this.$$delegate_0.onCDataEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    this.$$delegate_0.onCDataStart();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onCloseTag(str, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    this.$$delegate_0.onComment(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    this.$$delegate_0.onCommentEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    this.$$delegate_0.onEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    this.$$delegate_0.onError(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    qVar.j(str, map, java.lang.Boolean.valueOf(z6));
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onOpenTagName(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    this.$$delegate_0.onParserInit(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    this.$$delegate_0.onProcessingInstruction(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    this.$$delegate_0.onReset();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    this.$$delegate_0.onText(str);
                }
            };
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onOpenTagName(final p237x7.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onOpenTagName$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    this.$$delegate_0.onAttribute(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    this.$$delegate_0.onCDataEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    this.$$delegate_0.onCDataStart();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onCloseTag(str, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    this.$$delegate_0.onComment(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    this.$$delegate_0.onCommentEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    this.$$delegate_0.onEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    this.$$delegate_0.onError(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    this.$$delegate_0.onOpenTag(str, map, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    lVar.l(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    this.$$delegate_0.onParserInit(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    this.$$delegate_0.onProcessingInstruction(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    this.$$delegate_0.onReset();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    this.$$delegate_0.onText(str);
                }
            };
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onParserInit(final p237x7.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onParserInit$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    this.$$delegate_0.onAttribute(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    this.$$delegate_0.onCDataEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    this.$$delegate_0.onCDataStart();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onCloseTag(str, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    this.$$delegate_0.onComment(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    this.$$delegate_0.onCommentEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    this.$$delegate_0.onEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    this.$$delegate_0.onError(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    this.$$delegate_0.onOpenTag(str, map, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onOpenTagName(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    lVar.l(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    this.$$delegate_0.onProcessingInstruction(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    this.$$delegate_0.onReset();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    this.$$delegate_0.onText(str);
                }
            };
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onProcessingInstruction(final p237x7.p pVar) {
            p247y7.AbstractC7350t.f(pVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onProcessingInstruction$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    this.$$delegate_0.onAttribute(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    this.$$delegate_0.onCDataEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    this.$$delegate_0.onCDataStart();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onCloseTag(str, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    this.$$delegate_0.onComment(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    this.$$delegate_0.onCommentEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    this.$$delegate_0.onEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    this.$$delegate_0.onError(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    this.$$delegate_0.onOpenTag(str, map, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onOpenTagName(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    this.$$delegate_0.onParserInit(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    pVar.u(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    this.$$delegate_0.onReset();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    this.$$delegate_0.onText(str);
                }
            };
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onReset(final p237x7.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onReset$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    this.$$delegate_0.onAttribute(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    this.$$delegate_0.onCDataEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    this.$$delegate_0.onCDataStart();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onCloseTag(str, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    this.$$delegate_0.onComment(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    this.$$delegate_0.onCommentEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    this.$$delegate_0.onEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    this.$$delegate_0.onError(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    this.$$delegate_0.onOpenTag(str, map, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onOpenTagName(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    this.$$delegate_0.onParserInit(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    this.$$delegate_0.onProcessingInstruction(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    aVar.b();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    this.$$delegate_0.onText(str);
                }
            };
            return this;
        }

        public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Builder onText(final p237x7.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "block");
            this.handler = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler(this) { // from class: com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler$Builder$onText$1
                private final /* synthetic */ com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler $$delegate_0;

                {
                    this.$$delegate_0 = this.handler;
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "value");
                    this.$$delegate_0.onAttribute(str, str2, str3);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataEnd() {
                    this.$$delegate_0.onCDataEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCDataStart() {
                    this.$$delegate_0.onCDataStart();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCloseTag(java.lang.String str, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onCloseTag(str, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onComment(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "comment");
                    this.$$delegate_0.onComment(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onCommentEnd() {
                    this.$$delegate_0.onCommentEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onEnd() {
                    this.$$delegate_0.onEnd();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onError(java.lang.Exception exc) {
                    p247y7.AbstractC7350t.f(exc, "error");
                    this.$$delegate_0.onError(exc);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(map, "attributes");
                    this.$$delegate_0.onOpenTag(str, map, z6);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onOpenTagName(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "name");
                    this.$$delegate_0.onOpenTagName(str);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
                    p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
                    this.$$delegate_0.onParserInit(ksoupHtmlParser);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
                    p247y7.AbstractC7350t.f(str, "name");
                    p247y7.AbstractC7350t.f(str2, "data");
                    this.$$delegate_0.onProcessingInstruction(str, str2);
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onReset() {
                    this.$$delegate_0.onReset();
                }

                @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
                public void onText(java.lang.String str) {
                    p247y7.AbstractC7350t.f(str, "text");
                    lVar.l(str);
                }
            };
            return this;
        }
    }

    @kotlin.Metadata(d1 = {"ᗹ"}, d2 = {"ᗺ", "ᗻ", "ᗼ", "ᗽ", "ᗾ"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default implements com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler {
        public static final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Default INSTANCE = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Default();

        private Default() {
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onAttribute(this, str, str2, str3);
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onCDataEnd() {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onCDataEnd(this);
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onCDataStart() {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onCDataStart(this);
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onCloseTag(java.lang.String str, boolean z6) {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onCloseTag(this, str, z6);
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onComment(java.lang.String str) {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onComment(this, str);
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onCommentEnd() {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onCommentEnd(this);
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onEnd() {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onEnd(this);
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onError(java.lang.Exception exc) {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onError(this, exc);
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onOpenTag(this, str, map, z6);
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onOpenTagName(java.lang.String str) {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onOpenTagName(this, str);
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onParserInit(this, ksoupHtmlParser);
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onProcessingInstruction(java.lang.String str, java.lang.String str2) {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onProcessingInstruction(this, str, str2);
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onReset() {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onReset(this);
        }

        @Override // com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
        public void onText(java.lang.String str) {
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.DefaultImpls.onText(this, str);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAttribute(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "value");
        }

        public static /* synthetic */ void onAttribute$default(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler, java.lang.String str, java.lang.String str2, java.lang.String str3, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAttribute");
            }
            if ((i6 & 4) != 0) {
                str3 = null;
            }
            ksoupHtmlHandler.onAttribute(str, str2, str3);
        }

        public static void onCDataEnd(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler) {
        }

        public static void onCDataStart(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler) {
        }

        public static void onCloseTag(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler, java.lang.String str, boolean z6) {
            p247y7.AbstractC7350t.f(str, "name");
        }

        public static void onComment(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler, java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "comment");
        }

        public static void onCommentEnd(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler) {
        }

        public static void onEnd(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler) {
        }

        public static void onError(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler, java.lang.Exception exc) {
            p247y7.AbstractC7350t.f(exc, "error");
        }

        public static void onOpenTag(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(map, "attributes");
        }

        public static void onOpenTagName(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler, java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "name");
        }

        public static void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler, com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser) {
            p247y7.AbstractC7350t.f(ksoupHtmlParser, "ksoupHtmlParser");
        }

        public static void onProcessingInstruction(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler, java.lang.String str, java.lang.String str2) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "data");
        }

        public static void onReset(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler) {
        }

        public static void onText(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler, java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "text");
        }
    }

    void onAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void onCDataEnd();

    void onCDataStart();

    void onCloseTag(java.lang.String str, boolean z6);

    void onComment(java.lang.String str);

    void onCommentEnd();

    void onEnd();

    void onError(java.lang.Exception exc);

    void onOpenTag(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z6);

    void onOpenTagName(java.lang.String str);

    void onParserInit(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser);

    void onProcessingInstruction(java.lang.String str, java.lang.String str2);

    void onReset();

    void onText(java.lang.String str);
}
