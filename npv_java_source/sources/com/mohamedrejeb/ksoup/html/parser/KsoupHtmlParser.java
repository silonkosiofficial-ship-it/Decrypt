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
@kotlin.Metadata(d1 = {"ᗿ"}, d2 = {"ᘀ", "ᘁ", "ᘂ", "ᘃ", "ᘄ", "ᘅ", "ᘆ", "ᘇ", "", "ᘈ", "", "ᘉ", "ᘊ", "ᘋ", "ᘌ", "ᘍ", "ᘎ", "ᘏ", "ᘐ", "ᘑ", "ᘒ", "ᘓ", "ᘔ", "ᘕ", "", "ᘖ", "ᘗ", "ᘘ", "ᘙ", "ᘚ", "ᘛ", "ᘜ", "ᘝ", "ᘞ", "ᘟ", "ᘠ", "ᘡ", "ᘢ", "ᘣ", "ᘤ", "ᘥ", "ᘦ", "ᘧ", "ᘨ", "ᘩ", "ᘪ", "ᘫ", "ᘬ", "ᘭ", "ᘮ", "ᘯ", "ᘰ", "ᘱ", "ᘲ", "ᘳ", "ᘴ", "ᘵ", "ᘶ", "ᘷ", "ᘸ", "ᘹ", "ᘺ", "ᘻ", "ᘼ", "ᘽ", "ᘾ", "ᘿ", "ᙀ", "ᙁ", "ᙂ", "ᙃ", "ᙄ", "ᙅ", "ᙆ", "ᙇ", "", "ᙈ", "ᙉ", "", "ᙊ", "ᙋ", "ᙌ", "ᙍ", "ᙎ", "ᙏ", "ᙐ", "ᙑ", "ᙒ", "ᙓ", "ᙔ", "ᙕ", "ᙖ", "ᙗ", "ᙘ", "ᙙ", "ᙚ", "ᙛ", "ᙜ"}, k = 1, mv = {2, 0, 0})
public final class KsoupHtmlParser implements com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks {
    private static final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.Companion Companion = new com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.Companion(null);
    private static final java.util.Set<java.lang.String> ddtTags;
    private static final java.util.Set<java.lang.String> foreignContextElements;
    private static final java.util.Set<java.lang.String> formTags;
    private static final java.util.Set<java.lang.String> htmlIntegrationElements;
    private static final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> openImpliesClose;
    private static final java.util.Set<java.lang.String> pTag;
    private static final S8.o reNameEnd;
    private static final java.util.Set<java.lang.String> rtpTags;
    private static final java.util.Set<java.lang.String> tableSectionTags;
    private static final java.util.Set<java.lang.String> voidElements;
    private java.lang.String attribName;
    private java.lang.String attribValue;
    private java.util.Map<java.lang.String, java.lang.String> attribs;
    private int bufferOffset;
    private final java.util.List<java.lang.String> buffers;
    private int endIndex;
    private boolean ended;
    private final java.util.List<java.lang.Boolean> foreignContext;
    private final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler handler;
    private final com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer ksoupTokenizer;
    private int openTagStart;
    private final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions options;
    private final java.util.List<java.lang.String> stack;
    private int startIndex;
    private java.lang.String tagName;
    private int writeIndex;

    @kotlin.Metadata(d1 = {"ఈ"}, d2 = {"ఉ", "", "ఊ", "ఋ", "", "", "ఌ", "\u0c0d", "ఎ", "ఏ", "ఐ", "\u0c11", "", "ఒ", "ఓ", "ఔ", "క", "ఖ", "గ", "ఘ", "ఙ", "చ"}, k = 1, mv = {2, 0, 0})
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"ఛ"}, d2 = {"జ", "", "ఝ", "ఞ", "ట", "ఠ", "డ", "ఢ", "ణ"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum QuoteType {
        NoValue,
        Unquoted,
        Single,
        Double;

        private static final /* synthetic */ p157p7.a $ENTRIES = p157p7.b.a(values());

        public static p157p7.a getEntries() {
            return $ENTRIES;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.QuoteType.values().length];
            try {
                iArr[com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.QuoteType.Double.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.QuoteType.Single.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        java.util.Set<java.lang.String> setG = p097j7.Z.g("input", "option", "optgroup", "select", "button", "datalist", "textarea");
        formTags = setG;
        java.util.Set<java.lang.String> setC = p097j7.Z.c("p");
        pTag = setC;
        java.util.Set<java.lang.String> setG2 = p097j7.Z.g("thead", "tbody");
        tableSectionTags = setG2;
        java.util.Set<java.lang.String> setG3 = p097j7.Z.g("dt", "dd");
        ddtTags = setG3;
        java.util.Set<java.lang.String> setG4 = p097j7.Z.g("rt", "rp");
        rtpTags = setG4;
        openImpliesClose = p097j7.S.k(p087i7.B.a("tr", p097j7.Z.g("tr", "th", "td")), p087i7.B.a("th", p097j7.Z.c("th")), p087i7.B.a("td", p097j7.Z.g("thead", "th", "td")), p087i7.B.a("body", p097j7.Z.g("head", "link", "script")), p087i7.B.a("li", p097j7.Z.c("li")), p087i7.B.a("p", setC), p087i7.B.a("h1", setC), p087i7.B.a("h2", setC), p087i7.B.a("h3", setC), p087i7.B.a("h4", setC), p087i7.B.a("h5", setC), p087i7.B.a("h6", setC), p087i7.B.a("select", setG), p087i7.B.a("input", setG), p087i7.B.a("output", setG), p087i7.B.a("button", setG), p087i7.B.a("datalist", setG), p087i7.B.a("textarea", setG), p087i7.B.a("option", p097j7.Z.c("option")), p087i7.B.a("optgroup", p097j7.Z.g("optgroup", "option")), p087i7.B.a("dd", setG3), p087i7.B.a("dt", setG3), p087i7.B.a("address", setC), p087i7.B.a("article", setC), p087i7.B.a("aside", setC), p087i7.B.a("blockquote", setC), p087i7.B.a("details", setC), p087i7.B.a("div", setC), p087i7.B.a("dl", setC), p087i7.B.a("fieldset", setC), p087i7.B.a("figcaption", setC), p087i7.B.a("figure", setC), p087i7.B.a("footer", setC), p087i7.B.a("form", setC), p087i7.B.a("header", setC), p087i7.B.a("hr", setC), p087i7.B.a("main", setC), p087i7.B.a("menu", setC), p087i7.B.a("nav", setC), p087i7.B.a("ol", setC), p087i7.B.a("pre", setC), p087i7.B.a("section", setC), p087i7.B.a("table", setC), p087i7.B.a("ul", setC), p087i7.B.a("rt", setG4), p087i7.B.a("rp", setG4), p087i7.B.a("tbody", setG2), p087i7.B.a("tfoot", setG2));
        voidElements = p097j7.Z.g("area", "base", "basefont", "br", "col", "command", "embed", "frame", "hr", "img", "input", "isindex", "keygen", "link", "meta", "param", "source", "track", "wbr");
        foreignContextElements = p097j7.Z.g("math", "svg");
        htmlIntegrationElements = p097j7.Z.g("mi", "mo", "mn", "ms", "mtext", "annotation-xml", "foreignobject", "desc", "title");
        reNameEnd = new S8.o("\\s|/");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KsoupHtmlParser() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public KsoupHtmlParser(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler, com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions ksoupHtmlOptions) {
        p247y7.AbstractC7350t.f(ksoupHtmlHandler, "handler");
        p247y7.AbstractC7350t.f(ksoupHtmlOptions, "options");
        this.handler = ksoupHtmlHandler;
        this.options = ksoupHtmlOptions;
        this.tagName = "";
        this.attribName = "";
        this.attribValue = "";
        this.stack = new java.util.ArrayList();
        this.foreignContext = new java.util.ArrayList();
        this.buffers = new java.util.ArrayList();
        this.ksoupTokenizer = new com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer(ksoupHtmlOptions, this);
    }

    public /* synthetic */ KsoupHtmlParser(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler, com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions ksoupHtmlOptions, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler.Default.INSTANCE : ksoupHtmlHandler, (i6 & 2) != 0 ? com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions.Companion.getDefault() : ksoupHtmlOptions);
    }

    private final void closeCurrentTag(boolean z6) {
        java.lang.String str = this.tagName;
        endOpenTag(z6);
        if (this.stack.size() > 0) {
            java.util.List<java.lang.String> list = this.stack;
            if (p247y7.AbstractC7350t.b(list.get(list.size() - 1), str)) {
                this.handler.onCloseTag(str, !z6);
                p097j7.AbstractC6879v.L(this.stack);
            }
        }
    }

    private final void emitOpenTag(java.lang.String str) {
        java.util.List<java.lang.Boolean> list;
        java.lang.Boolean bool;
        this.openTagStart = this.startIndex;
        this.tagName = str;
        java.util.Set<java.lang.String> set = openImpliesClose.get(str);
        if (!this.options.getXmlMode() && set != null) {
            while ((!this.stack.isEmpty()) && set.contains(p097j7.AbstractC6879v.t0(this.stack))) {
                this.handler.onCloseTag((java.lang.String) p097j7.AbstractC6879v.L(this.stack), true);
            }
        }
        if (!isVoidElement(str)) {
            this.stack.add(str);
            if (foreignContextElements.contains(str)) {
                list = this.foreignContext;
                bool = java.lang.Boolean.TRUE;
            } else if (htmlIntegrationElements.contains(str)) {
                list = this.foreignContext;
                bool = java.lang.Boolean.FALSE;
            }
            list.add(bool);
        }
        this.handler.onOpenTagName(str);
        this.attribs = new java.util.LinkedHashMap();
    }

    public static /* synthetic */ void end$default(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser ksoupHtmlParser, java.lang.String str, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            str = null;
        }
        ksoupHtmlParser.end(str);
    }

    private final void endOpenTag(boolean z6) {
        this.startIndex = this.openTagStart;
        java.util.Map<java.lang.String, java.lang.String> map = this.attribs;
        if (map != null) {
            this.handler.onOpenTag(this.tagName, map, z6);
            this.attribs = null;
        }
        if (isVoidElement(this.tagName)) {
            this.handler.onCloseTag(this.tagName, true);
        }
        this.tagName = "";
    }

    private final java.lang.String getInstructionName(java.lang.String str) {
        E7.i iVarD;
        S8.InterfaceC1639l interfaceC1639lB = S8.o.b(reNameEnd, str, 0, 2, null);
        int iIntValue = (interfaceC1639lB == null || (iVarD = interfaceC1639lB.d()) == null) ? -1 : iVarD.M().intValue();
        if (iIntValue >= 0) {
            str = str.substring(0, iIntValue);
            p247y7.AbstractC7350t.e(str, "substring(...)");
        }
        if (!getLowerCaseTagNames()) {
            return str;
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        p247y7.AbstractC7350t.e(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final boolean getLowerCaseAttributeNames() {
        return this.options.getLowerCaseAttributeNames();
    }

    private final boolean getLowerCaseTagNames() {
        return this.options.getLowerCaseTags();
    }

    private final java.lang.String getSlice(int i6, int i10) {
        while (i6 - this.bufferOffset >= ((java.lang.String) p097j7.AbstractC6879v.i0(this.buffers)).length()) {
            shiftBuffer();
        }
        java.lang.String str = (java.lang.String) p097j7.AbstractC6879v.i0(this.buffers);
        int i11 = this.bufferOffset;
        java.lang.String strSubstring = str.substring(i6 - i11, i10 - i11);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        while (i10 - this.bufferOffset > ((java.lang.String) p097j7.AbstractC6879v.i0(this.buffers)).length()) {
            shiftBuffer();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(strSubstring);
            java.lang.String strSubstring2 = ((java.lang.String) p097j7.AbstractC6879v.i0(this.buffers)).substring(0, i10 - this.bufferOffset);
            p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
            sb.append(strSubstring2);
            strSubstring = sb.toString();
        }
        return strSubstring;
    }

    private final boolean isVoidElement(java.lang.String str) {
        return !this.options.getXmlMode() && voidElements.contains(str);
    }

    private final void shiftBuffer() {
        this.bufferOffset += ((java.lang.String) p097j7.AbstractC6879v.i0(this.buffers)).length();
        this.writeIndex--;
        p097j7.AbstractC6879v.J(this.buffers);
    }

    public final void end(java.lang.String str) {
        if (this.ended) {
            this.handler.onError(new java.lang.Exception(".end() after done!"));
            return;
        }
        if (str != null) {
            write(str);
        }
        this.ended = true;
        this.ksoupTokenizer.end();
    }

    public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler getHandler() {
        return this.handler;
    }

    public final com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions getOptions() {
        return this.options;
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onAttribData(int i6, int i10) {
        this.attribValue += getSlice(i6, i10);
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onAttribEnd(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.QuoteType quoteType, int i6) {
        java.lang.String str;
        p247y7.AbstractC7350t.f(quoteType, "quote");
        this.endIndex = i6;
        com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler = this.handler;
        java.lang.String str2 = this.attribName;
        java.lang.String str3 = this.attribValue;
        int i10 = com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.WhenMappings.$EnumSwitchMapping$0[quoteType.ordinal()];
        if (i10 != 1) {
            str = i10 != 2 ? null : "'";
        } else {
            str = "\"";
        }
        ksoupHtmlHandler.onAttribute(str2, str3, str);
        java.util.Map<java.lang.String, java.lang.String> map = this.attribs;
        if (map != null) {
            map.put(this.attribName, this.attribValue);
        }
        this.attribValue = "";
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onAttribEntity(int i6) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.attribValue);
        if (i6 >= 0 && i6 <= 65535) {
            sb.append((char) i6);
            this.attribValue = sb.toString();
        } else {
            throw new java.lang.IllegalArgumentException("Invalid Char code: " + i6);
        }
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onAttribName(int i6, int i10) {
        this.startIndex = i6;
        java.lang.String slice = getSlice(i6, i10);
        if (getLowerCaseAttributeNames()) {
            slice = slice.toLowerCase(java.util.Locale.ROOT);
            p247y7.AbstractC7350t.e(slice, "toLowerCase(...)");
        }
        this.attribName = slice;
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onCData(int i6, int i10, int i11) {
        this.endIndex = i10;
        java.lang.String slice = getSlice(i6, i10 - i11);
        if (this.options.getXmlMode() || this.options.getRecognizeCDATA()) {
            this.handler.onCDataStart();
            this.handler.onText(slice);
            this.handler.onCDataEnd();
        } else {
            this.handler.onComment("[CDATA[" + slice + "]]");
            this.handler.onCommentEnd();
        }
        this.startIndex = i10 + 1;
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onCloseTag(int i6, int i10) {
        this.endIndex = i10;
        java.lang.String slice = getSlice(i6, i10);
        if (getLowerCaseTagNames()) {
            slice = slice.toLowerCase(java.util.Locale.ROOT);
            p247y7.AbstractC7350t.e(slice, "toLowerCase(...)");
        }
        if (foreignContextElements.contains(slice) && htmlIntegrationElements.contains(slice)) {
            p097j7.AbstractC6879v.L(this.foreignContext);
        }
        if (!isVoidElement(slice)) {
            int iLastIndexOf = this.stack.lastIndexOf(slice);
            if (iLastIndexOf != -1) {
                int size = this.stack.size() - iLastIndexOf;
                while (true) {
                    int i11 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    this.handler.onCloseTag((java.lang.String) p097j7.AbstractC6879v.L(this.stack), i11 != 0);
                    size = i11;
                }
            } else if (!this.options.getXmlMode() && p247y7.AbstractC7350t.b(slice, "p")) {
                emitOpenTag("p");
                closeCurrentTag(true);
            }
        } else if (!this.options.getXmlMode() && p247y7.AbstractC7350t.b(slice, "br")) {
            this.handler.onOpenTagName("br");
            this.handler.onOpenTag("br", p097j7.S.h(), true);
            this.handler.onCloseTag("br", false);
        }
        this.startIndex = i10 + 1;
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onComment(int i6, int i10, int i11) {
        this.endIndex = i10;
        this.handler.onComment(getSlice(i6, i10 - i11));
        this.handler.onCommentEnd();
        this.startIndex = i10 + 1;
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onDeclaration(int i6, int i10) {
        this.endIndex = i10;
        java.lang.String slice = getSlice(i6, i10);
        this.handler.onProcessingInstruction(getInstructionName(slice), slice);
        this.startIndex = i10 + 1;
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onEnd() {
        this.endIndex = this.startIndex;
        java.util.Iterator it = p097j7.AbstractC6879v.n(this.stack).iterator();
        while (it.hasNext()) {
            this.handler.onCloseTag(this.stack.get(p097j7.AbstractC6879v.o(this.stack) - ((p097j7.O) it).b()), true);
        }
        this.handler.onEnd();
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onOpenTagEnd(int i6) {
        this.endIndex = i6;
        endOpenTag(false);
        this.startIndex = i6 + 1;
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onOpenTagName(int i6, int i10) {
        this.endIndex = i10;
        java.lang.String slice = getSlice(i6, i10);
        if (getLowerCaseTagNames()) {
            slice = slice.toLowerCase(java.util.Locale.ROOT);
            p247y7.AbstractC7350t.e(slice, "toLowerCase(...)");
        }
        emitOpenTag(slice);
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onProcessingInstruction(int i6, int i10) {
        this.endIndex = i10;
        java.lang.String slice = getSlice(i6, i10);
        this.handler.onProcessingInstruction(getInstructionName(slice), slice);
        this.startIndex = i10 + 1;
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onSelfClosingTag(int i6) {
        this.endIndex = i6;
        if (!this.options.getXmlMode() && !this.options.getRecognizeSelfClosing() && !p247y7.AbstractC7350t.b(p097j7.AbstractC6879v.v0(this.foreignContext), java.lang.Boolean.TRUE)) {
            onOpenTagEnd(i6);
        } else {
            closeCurrentTag(false);
            this.startIndex = i6 + 1;
        }
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onText(int i6, int i10) {
        java.lang.String slice = getSlice(i6, i10);
        this.endIndex = i10 - 1;
        this.handler.onText(slice);
        this.startIndex = i10;
    }

    @Override // com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks
    public void onTextEntity(int i6, int i10) {
        this.endIndex = i10 - 1;
        com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler ksoupHtmlHandler = this.handler;
        if (i6 >= 0 && i6 <= 65535) {
            ksoupHtmlHandler.onText(java.lang.String.valueOf((char) i6));
            this.startIndex = i10;
        } else {
            throw new java.lang.IllegalArgumentException("Invalid Char code: " + i6);
        }
    }

    public final void parseComplete(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "data");
        reset();
        end(str);
    }

    public final void pause() {
        this.ksoupTokenizer.pause();
    }

    public final void reset() {
        this.handler.onReset();
        this.ksoupTokenizer.reset();
        this.tagName = "";
        this.attribName = "";
        this.attribValue = "";
        this.attribs = null;
        this.stack.clear();
        this.startIndex = 0;
        this.endIndex = 0;
        this.handler.onParserInit(this);
        this.buffers.clear();
        this.bufferOffset = 0;
        this.writeIndex = 0;
        this.ended = false;
    }

    public final void resume() {
        this.ksoupTokenizer.resume();
        while (this.ksoupTokenizer.getRunning() && this.writeIndex < this.buffers.size()) {
            com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer ksoupTokenizer = this.ksoupTokenizer;
            java.util.List<java.lang.String> list = this.buffers;
            int i6 = this.writeIndex;
            this.writeIndex = i6 + 1;
            ksoupTokenizer.write(list.get(i6));
        }
        if (this.ended) {
            this.ksoupTokenizer.end();
        }
    }

    public final void write(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "chunk");
        if (this.ended) {
            this.handler.onError(new java.lang.Exception(".write() after done!"));
            return;
        }
        this.buffers.add(str);
        if (this.ksoupTokenizer.getRunning()) {
            this.ksoupTokenizer.write(str);
            this.writeIndex++;
        }
    }
}
