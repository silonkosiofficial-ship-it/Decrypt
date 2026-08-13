package com.mohamedrejeb.ksoup.html.tokenizer;

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
@kotlin.Metadata(d1 = {"ಥ"}, d2 = {"ದ", "", "ಧ", "ನ", "\u0ca9", "ಪ", "ಫ", "ಬ", "", "ಭ", "ಮ", "ಯ", "ರ", "ಱ", "ಲ", "ಳ", "", "\u0cb4", "ವ", "ಶ", "ಷ", "ಸ", "ಹ", "\u0cba", "\u0cbb", "಼", "ಽ", "ಾ", "ಿ", "ೀ", "ು", "ೂ", "ೃ", "ೄ", "\u0cc5", "ೆ", "ೇ", "ೈ", "\u0cc9", "ೊ", "ೋ", "ೌ", "್", "\u0cce", "\u0ccf", "\u0cd0", "\u0cd1", "\u0cd2", "\u0cd3", "\u0cd4", "ೕ", "ೖ", "\u0cd7", "\u0cd8", "\u0cd9", "\u0cda", "\u0cdb", "\u0cdc", "\u0cdd", "ೞ", "\u0cdf", "ೠ", "ೡ", "ೢ", "", "ೣ", "\u0ce4", "\u0ce5", "೦", "೧", "೨", "೩", "೪", "೫", "೬", "೭", "೮", "೯", "\u0cf0", "ೱ", "ೲ", "\u0cf3", "\u0cf4", "\u0cf5", "\u0cf6", "\u0cf7", "\u0cf8", "\u0cf9", "\u0cfa", "\u0cfb", "\u0cfc", "\u0cfd", "\u0cfe", "\u0cff", "ഀ", "ഁ", "ം", "ഃ", "ഄ", "അ"}, k = 1, mv = {2, 0, 0})
public final class KsoupTokenizer {
    private static final com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Companion Companion = new com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Companion(null);

    @java.lang.Deprecated
    public static final int LONGEST_HTML_ENTITY_LENGTH = 33;
    private com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State baseState;
    private java.lang.String buffer;
    private final com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks callbacks;
    private byte[] currentSequence;
    private final boolean decodeEntities;
    private int entityStart;
    private int index;
    private boolean isSpecial;
    private int offset;
    private boolean running;
    private int sectionStart;
    private int sequenceIndex;
    private com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State state;
    private final boolean xmlMode;

    @kotlin.Metadata(d1 = {"త"}, d2 = {"థ", "", "", "ద", "ధ", "న", "\u0c29", "ప", "ఫ", "బ", "భ", "మ", "య", "ర", "ఱ", "ల", "ళ", "ఴ", "వ", "శ", "ష", "స", "హ", "\u0c3a", "\u0c3b", "\u0c3c", "ఽ", "ా", "ి", "ీ", "ు"}, k = 1, mv = {2, 0, 0})
    public interface Callbacks {
        void onAttribData(int i6, int i10);

        void onAttribEnd(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.QuoteType quoteType, int i6);

        void onAttribEntity(int i6);

        void onAttribName(int i6, int i10);

        void onCData(int i6, int i10, int i11);

        void onCloseTag(int i6, int i10);

        void onComment(int i6, int i10, int i11);

        void onDeclaration(int i6, int i10);

        void onEnd();

        void onOpenTagEnd(int i6);

        void onOpenTagName(int i6, int i10);

        void onProcessingInstruction(int i6, int i10);

        void onSelfClosingTag(int i6);

        void onText(int i6, int i10);

        void onTextEntity(int i6, int i10);
    }

    @kotlin.Metadata(d1 = {"ూ"}, d2 = {"ృ", "", "ౄ", "", "\u0c45", "ె", "ే", "ై", "\u0c49", "ొ", "ో", "ౌ", "్", "\u0c4e", "\u0c4f", "\u0c50", "\u0c51", "\u0c52", "\u0c53", "\u0c54", "ౕ", "ౖ", "\u0c57", "ౘ", "ౙ", "ౚ", "\u0c5b", "\u0c5c", "\u0c5d", "\u0c5e", "\u0c5f", "ౠ", "ౡ", "ౢ", "ౣ", "\u0c64"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum CharCodes {
        Tab(9),
        NewLine(10),
        FormFeed(12),
        CarriageReturn(13),
        Space(32),
        ExclamationMark(33),
        Number(35),
        Amp(38),
        SingleQuote(39),
        DoubleQuote(34),
        Dash(45),
        Slash(47),
        Zero(48),
        Nine(57),
        Semi(59),
        Lt(60),
        Eq(61),
        Gt(62),
        QuestionMark(63),
        UpperA(65),
        LowerA(97),
        UpperF(70),
        LowerF(102),
        UpperZ(90),
        LowerZ(122),
        LowerX(120),
        OpeningSquareBracket(91);

        private static final /* synthetic */ p157p7.a $ENTRIES = p157p7.b.a(values());
        private final int code;

        CharCodes(int i6) {
            this.code = i6;
        }

        public static p157p7.a getEntries() {
            return $ENTRIES;
        }

        public final int getCode() {
            return this.code;
        }
    }

    @kotlin.Metadata(d1 = {"\u0c65"}, d2 = {"౦", "", "౧", "౨", "౩", "", "౪", "", "౫", "౬", "౭", "౮", "౯"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final boolean isASCIIAlpha(int i6) {
            return (i6 >= com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.LowerA.getCode() && i6 <= com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.LowerZ.getCode()) || (i6 >= com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.UpperA.getCode() && i6 <= com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.UpperZ.getCode());
        }

        public final boolean isDigit(int i6) {
            return i6 >= com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Zero.getCode() && i6 <= com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Nine.getCode();
        }

        public final boolean isEndOfTagSection(int i6) {
            return i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Slash.getCode() || i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Gt.getCode() || isWhitespace(i6);
        }

        public final boolean isWhitespace(int i6) {
            return i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Space.getCode() || i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.NewLine.getCode() || i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Tab.getCode() || i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.FormFeed.getCode() || i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.CarriageReturn.getCode();
        }
    }

    @kotlin.Metadata(d1 = {"\u0c70"}, d2 = {"\u0c71", "", "\u0c72", "\u0c73", "\u0c74", "\u0c75", "\u0c76", "౷", "౸", "౹", "౺", "౻", "౼", "౽", "౾", "౿", "ಀ", "ಁ", "ಂ", "ಃ", "಄", "ಅ"}, k = 1, mv = {2, 0, 0})
    private static final class Sequences {
        public static final com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences INSTANCE = new com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences();
        private static final byte[] Cdata = {67, 68, 65, 84, 65, 91};
        private static final byte[] CdataEnd = {93, 93, 62};
        private static final byte[] CommentEnd = {45, 45, 62};
        private static final byte[] ScriptEnd = {60, 47, 115, 99, 114, 105, 112, 116};
        private static final byte[] StyleEnd = {60, 47, 115, 116, 121, 108, 101};
        private static final byte[] TitleEnd = {60, 47, 116, 105, 116, 108, 101};
        private static final byte[] TextareaEnd = {60, 47, 116, 101, 120, 116, 97, 114, 101, 97};

        private Sequences() {
        }

        /* JADX INFO: renamed from: getCdata-TcUX1vc, reason: not valid java name */
        public final byte[] m6getCdataTcUX1vc() {
            return Cdata;
        }

        /* JADX INFO: renamed from: getCdataEnd-TcUX1vc, reason: not valid java name */
        public final byte[] m7getCdataEndTcUX1vc() {
            return CdataEnd;
        }

        /* JADX INFO: renamed from: getCommentEnd-TcUX1vc, reason: not valid java name */
        public final byte[] m8getCommentEndTcUX1vc() {
            return CommentEnd;
        }

        /* JADX INFO: renamed from: getScriptEnd-TcUX1vc, reason: not valid java name */
        public final byte[] m9getScriptEndTcUX1vc() {
            return ScriptEnd;
        }

        /* JADX INFO: renamed from: getStyleEnd-TcUX1vc, reason: not valid java name */
        public final byte[] m10getStyleEndTcUX1vc() {
            return StyleEnd;
        }

        /* JADX INFO: renamed from: getTextareaEnd-TcUX1vc, reason: not valid java name */
        public final byte[] m11getTextareaEndTcUX1vc() {
            return TextareaEnd;
        }

        /* JADX INFO: renamed from: getTitleEnd-TcUX1vc, reason: not valid java name */
        public final byte[] m12getTitleEndTcUX1vc() {
            return TitleEnd;
        }
    }

    @kotlin.Metadata(d1 = {"ಆ"}, d2 = {"ಇ", "", "ಈ", "ಉ", "ಊ", "ಋ", "ಌ", "\u0c8d", "ಎ", "ಏ", "ಐ", "\u0c91", "ಒ", "ಓ", "ಔ", "ಕ", "ಖ", "ಗ", "ಘ", "ಙ", "ಚ", "ಛ", "ಜ", "ಝ", "ಞ", "ಟ", "ಠ", "ಡ", "ಢ", "ಣ", "ತ"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum State {
        Text,
        BeforeTagName,
        InTagName,
        InSelfClosingTag,
        BeforeClosingTagName,
        InClosingTagName,
        AfterClosingTagName,
        BeforeAttributeName,
        InAttributeName,
        AfterAttributeName,
        BeforeAttributeValue,
        InAttributeValueDq,
        InAttributeValueSq,
        InAttributeValueNq,
        BeforeDeclaration,
        InDeclaration,
        InProcessingInstruction,
        BeforeComment,
        CDATASequence,
        InSpecialComment,
        InCommentLike,
        BeforeSpecialS,
        BeforeSpecialT,
        SpecialStartSequence,
        InSpecialTag,
        InEntity;

        private static final /* synthetic */ p157p7.a $ENTRIES = p157p7.b.a(values());

        public static p157p7.a getEntries() {
            return $ENTRIES;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.values().length];
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.SpecialStartSequence.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InSpecialTag.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.CDATASequence.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeValueDq.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeName.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InCommentLike.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InSpecialComment.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeAttributeName.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InTagName.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InClosingTagName.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeTagName.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.AfterAttributeName.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeValueSq.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeAttributeValue.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeClosingTagName.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.AfterClosingTagName.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeSpecialS.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeSpecialT.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeValueNq.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InSelfClosingTag.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InDeclaration.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeDeclaration.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeComment.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InProcessingInstruction.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InEntity.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KsoupTokenizer(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions ksoupHtmlOptions, com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Callbacks callbacks) {
        p247y7.AbstractC7350t.f(ksoupHtmlOptions, "options");
        p247y7.AbstractC7350t.f(callbacks, "callbacks");
        this.callbacks = callbacks;
        this.xmlMode = ksoupHtmlOptions.getXmlMode();
        this.decodeEntities = ksoupHtmlOptions.getDecodeEntities();
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text;
        this.state = state;
        this.buffer = "";
        this.baseState = state;
        this.running = true;
    }

    private final void cleanup() {
        int i6;
        int i10;
        if (!this.running || (i6 = this.sectionStart) == (i10 = this.index)) {
            return;
        }
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State state = this.state;
        if (state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text || (state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InSpecialTag && this.sequenceIndex == 0)) {
            this.callbacks.onText(i6, i10);
        } else if (state != com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeValueDq && state != com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeValueSq && state != com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeValueNq) {
            return;
        } else {
            this.callbacks.onAttribData(i6, i10);
        }
        this.sectionStart = this.index;
    }

    private final void emitCodePoint(int i6, int i10) {
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State state = this.baseState;
        if (state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text || state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InSpecialTag) {
            int i11 = this.sectionStart;
            int i12 = this.entityStart;
            if (i11 < i12) {
                this.callbacks.onText(i11, i12);
            }
            int i13 = this.entityStart + i10;
            this.sectionStart = i13;
            this.index = i13 - 1;
            this.callbacks.onTextEntity(i6, i13);
            return;
        }
        int i14 = this.sectionStart;
        int i15 = this.entityStart;
        if (i14 < i15) {
            this.callbacks.onAttribData(i14, i15);
        }
        int i16 = this.entityStart + i10;
        this.sectionStart = i16;
        this.index = i16 - 1;
        this.callbacks.onAttribEntity(i6);
    }

    private final boolean fastForwardTo(int i6) {
        while (true) {
            int i10 = this.index;
            int length = this.buffer.length();
            int i11 = this.offset;
            if (i10 >= length + i11) {
                this.index = (this.buffer.length() + this.offset) - 1;
                return false;
            }
            if (this.buffer.charAt(this.index - i11) == i6) {
                return true;
            }
            this.index++;
        }
    }

    private final void finish() {
        if (this.state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InEntity) {
            this.state = this.baseState;
        }
        handleTrailingData();
        this.callbacks.onEnd();
    }

    /* JADX INFO: renamed from: getCurrentSequence--5HJl4c$annotations, reason: not valid java name */
    private static /* synthetic */ void m4getCurrentSequence5HJl4c$annotations() {
    }

    private final void handleInAttributeValue(int i6, int i10) {
        if (i6 == i10 || (!this.decodeEntities && fastForwardTo(i10))) {
            this.callbacks.onAttribData(this.sectionStart, this.index);
            this.sectionStart = -1;
            this.callbacks.onAttribEnd(i10 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.DoubleQuote.getCode() ? com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.QuoteType.Double : com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.QuoteType.Single, this.index + 1);
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeAttributeName;
            return;
        }
        if (this.decodeEntities && i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Amp.getCode()) {
            startEntity();
        }
    }

    private final void handleTrailingData() {
        int length = this.buffer.length() + this.offset;
        int i6 = this.sectionStart;
        if (i6 >= length) {
            return;
        }
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State state = this.state;
        if (state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InCommentLike) {
            byte[] bArr = this.currentSequence;
            if (bArr == null ? false : p087i7.D.D(bArr, com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences.INSTANCE.m7getCdataEndTcUX1vc())) {
                this.callbacks.onCData(this.sectionStart, length, 0);
                return;
            } else {
                this.callbacks.onComment(this.sectionStart, length, 0);
                return;
            }
        }
        if (state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InTagName || state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeAttributeName || state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeAttributeValue || state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.AfterAttributeName || state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeName || state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeValueSq || state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeValueDq || state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeValueNq || state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InClosingTagName || state == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InSelfClosingTag) {
            return;
        }
        this.callbacks.onText(i6, length);
    }

    private final boolean isInEntityChar(int i6) {
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Companion companion = Companion;
        return companion.isASCIIAlpha(i6) || companion.isDigit(i6) || i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Semi.getCode();
    }

    private final boolean isTagStartChar(int i6) {
        if (this.xmlMode) {
            return !Companion.isEndOfTagSection(i6);
        }
        return Companion.isASCIIAlpha(i6);
    }

    private final void parse() {
        while (shouldContinue()) {
            char cCharAt = this.buffer.charAt(this.index - this.offset);
            switch (com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
                case 1:
                    stateText(cCharAt);
                    break;
                case 2:
                    stateSpecialStartSequence(cCharAt);
                    break;
                case 3:
                    stateInSpecialTag(cCharAt);
                    break;
                case 4:
                    stateCDATASequence(cCharAt);
                    break;
                case 5:
                    stateInAttributeValueDoubleQuotes(cCharAt);
                    break;
                case 6:
                    stateInAttributeName(cCharAt);
                    break;
                case 7:
                    stateInCommentLike(cCharAt);
                    break;
                case 8:
                    stateInSpecialComment(cCharAt);
                    break;
                case 9:
                    stateBeforeAttributeName(cCharAt);
                    break;
                case 10:
                    stateInTagName(cCharAt);
                    break;
                case 11:
                    stateInClosingTagName(cCharAt);
                    break;
                case 12:
                    stateBeforeTagName(cCharAt);
                    break;
                case 13:
                    stateAfterAttributeName(cCharAt);
                    break;
                case 14:
                    stateInAttributeValueSingleQuotes(cCharAt);
                    break;
                case 15:
                    stateBeforeAttributeValue(cCharAt);
                    break;
                case 16:
                    stateBeforeClosingTagName(cCharAt);
                    break;
                case 17:
                    stateAfterClosingTagName(cCharAt);
                    break;
                case 18:
                    stateBeforeSpecialS(cCharAt);
                    break;
                case 19:
                    stateBeforeSpecialT(cCharAt);
                    break;
                case 20:
                    stateInAttributeValueNoQuotes(cCharAt);
                    break;
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    stateInSelfClosingTag(cCharAt);
                    break;
                case 22:
                    stateInDeclaration(cCharAt);
                    break;
                case 23:
                    stateBeforeDeclaration(cCharAt);
                    break;
                case 24:
                    stateBeforeComment(cCharAt);
                    break;
                case 25:
                    stateInProcessingInstruction(cCharAt);
                    break;
                case 26:
                    stateInEntity(cCharAt);
                    break;
                default:
                    throw new p087i7.s();
            }
            this.index++;
        }
        cleanup();
    }

    private final boolean shouldContinue() {
        return this.index < this.buffer.length() + this.offset && this.running;
    }

    private final void startEntity() {
        this.baseState = this.state;
        this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InEntity;
        this.entityStart = this.index;
    }

    /* JADX INFO: renamed from: startSpecial-rto03Yo, reason: not valid java name */
    private final void m5startSpecialrto03Yo(byte[] bArr, int i6) {
        this.isSpecial = true;
        this.currentSequence = bArr;
        this.sequenceIndex = i6;
        this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.SpecialStartSequence;
    }

    private final void stateAfterAttributeName(int i6) {
        if (i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Eq.getCode()) {
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeAttributeValue;
            return;
        }
        if (i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Slash.getCode() || i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Gt.getCode()) {
            this.callbacks.onAttribEnd(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.QuoteType.NoValue, this.sectionStart);
            this.sectionStart = -1;
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeAttributeName;
            stateBeforeAttributeName(i6);
            return;
        }
        if (Companion.isWhitespace(i6)) {
            return;
        }
        this.callbacks.onAttribEnd(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.QuoteType.NoValue, this.sectionStart);
        this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeName;
        this.sectionStart = this.index;
    }

    private final void stateAfterClosingTagName(int i6) {
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes charCodes = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Gt;
        if (i6 == charCodes.getCode() || fastForwardTo(charCodes.getCode())) {
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text;
            this.sectionStart = this.index + 1;
        }
    }

    private final void stateBeforeAttributeName(int i6) {
        int i10;
        if (i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Gt.getCode()) {
            this.callbacks.onOpenTagEnd(this.index);
            if (this.isSpecial) {
                this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InSpecialTag;
                this.sequenceIndex = 0;
            } else {
                this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text;
            }
            i10 = this.index + 1;
        } else if (i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Slash.getCode()) {
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InSelfClosingTag;
            return;
        } else {
            if (Companion.isWhitespace(i6)) {
                return;
            }
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeName;
            i10 = this.index;
        }
        this.sectionStart = i10;
    }

    private final void stateBeforeAttributeValue(int i6) {
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State state;
        if (i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.DoubleQuote.getCode()) {
            state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeValueDq;
        } else {
            if (i6 != com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.SingleQuote.getCode()) {
                if (Companion.isWhitespace(i6)) {
                    return;
                }
                this.sectionStart = this.index;
                this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeValueNq;
                stateInAttributeValueNoQuotes(i6);
                return;
            }
            state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InAttributeValueSq;
        }
        this.state = state;
        this.sectionStart = this.index + 1;
    }

    private final void stateBeforeClosingTagName(int i6) {
        if (Companion.isWhitespace(i6)) {
            return;
        }
        if (i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Gt.getCode()) {
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text;
        } else {
            this.state = isTagStartChar(i6) ? com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InClosingTagName : com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InSpecialComment;
            this.sectionStart = this.index;
        }
    }

    private final void stateBeforeComment(int i6) {
        if (i6 != com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Dash.getCode()) {
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InDeclaration;
            return;
        }
        this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InCommentLike;
        this.currentSequence = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences.INSTANCE.m8getCommentEndTcUX1vc();
        this.sequenceIndex = 2;
        this.sectionStart = this.index + 1;
    }

    private final void stateBeforeDeclaration(int i6) {
        if (i6 != com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.OpeningSquareBracket.getCode()) {
            this.state = i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Dash.getCode() ? com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeComment : com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InDeclaration;
        } else {
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.CDATASequence;
            this.sequenceIndex = 0;
        }
    }

    private final void stateBeforeSpecialS(int i6) {
        int i10 = i6 | 32;
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences sequences = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences.INSTANCE;
        if (i10 == (p087i7.D.E(sequences.m9getScriptEndTcUX1vc(), 3) & 255)) {
            m5startSpecialrto03Yo(sequences.m9getScriptEndTcUX1vc(), 4);
        } else if (i10 == (p087i7.D.E(sequences.m10getStyleEndTcUX1vc(), 3) & 255)) {
            m5startSpecialrto03Yo(sequences.m10getStyleEndTcUX1vc(), 4);
        } else {
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InTagName;
            stateInTagName(i6);
        }
    }

    private final void stateBeforeSpecialT(int i6) {
        int i10 = i6 | 32;
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences sequences = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences.INSTANCE;
        if (i10 == (p087i7.D.E(sequences.m12getTitleEndTcUX1vc(), 3) & 255)) {
            m5startSpecialrto03Yo(sequences.m12getTitleEndTcUX1vc(), 4);
        } else if (i10 == (p087i7.D.E(sequences.m11getTextareaEndTcUX1vc(), 3) & 255)) {
            m5startSpecialrto03Yo(sequences.m11getTextareaEndTcUX1vc(), 4);
        } else {
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InTagName;
            stateInTagName(i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    private final void stateBeforeTagName(int i6) {
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State state;
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State state2;
        if (i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.ExclamationMark.getCode()) {
            state2 = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeDeclaration;
        } else {
            if (i6 != com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.QuestionMark.getCode()) {
                if (isTagStartChar(i6)) {
                    int i10 = i6 | 32;
                    this.sectionStart = this.index;
                    if (this.xmlMode) {
                        state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InTagName;
                    } else {
                        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences sequences = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences.INSTANCE;
                        if (i10 == (p087i7.D.E(sequences.m9getScriptEndTcUX1vc(), 2) & 255)) {
                            state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeSpecialS;
                        } else if (i10 == (p087i7.D.E(sequences.m12getTitleEndTcUX1vc(), 2) & 255)) {
                            state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeSpecialT;
                        } else {
                            state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InTagName;
                        }
                    }
                } else {
                    if (i6 != com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Slash.getCode()) {
                        this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text;
                        stateText(i6);
                        return;
                    }
                    state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeClosingTagName;
                }
                this.state = state;
                return;
            }
            state2 = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InProcessingInstruction;
        }
        this.state = state2;
        this.sectionStart = this.index + 1;
    }

    private final void stateCDATASequence(int i6) {
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences sequences = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences.INSTANCE;
        if (i6 != (p087i7.D.E(sequences.m6getCdataTcUX1vc(), this.sequenceIndex) & 255)) {
            this.sequenceIndex = 0;
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InDeclaration;
            stateInDeclaration(i6);
            return;
        }
        int i10 = this.sequenceIndex + 1;
        this.sequenceIndex = i10;
        if (i10 == p087i7.D.N(sequences.m6getCdataTcUX1vc())) {
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InCommentLike;
            this.currentSequence = sequences.m7getCdataEndTcUX1vc();
            this.sequenceIndex = 0;
            this.sectionStart = this.index + 1;
        }
    }

    private final void stateInAttributeName(int i6) {
        if (i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Eq.getCode() || Companion.isEndOfTagSection(i6)) {
            this.callbacks.onAttribName(this.sectionStart, this.index);
            this.sectionStart = this.index;
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.AfterAttributeName;
            stateAfterAttributeName(i6);
        }
    }

    private final void stateInAttributeValueDoubleQuotes(int i6) {
        handleInAttributeValue(i6, com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.DoubleQuote.getCode());
    }

    private final void stateInAttributeValueNoQuotes(int i6) {
        if (!Companion.isWhitespace(i6) && i6 != com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Gt.getCode()) {
            if (this.decodeEntities && i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Amp.getCode()) {
                startEntity();
                return;
            }
            return;
        }
        this.callbacks.onAttribData(this.sectionStart, this.index);
        this.sectionStart = -1;
        this.callbacks.onAttribEnd(com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.QuoteType.Unquoted, this.index);
        this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeAttributeName;
        stateBeforeAttributeName(i6);
    }

    private final void stateInAttributeValueSingleQuotes(int i6) {
        handleInAttributeValue(i6, com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.SingleQuote.getCode());
    }

    private final void stateInClosingTagName(int i6) {
        if (i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Gt.getCode() || Companion.isWhitespace(i6)) {
            this.callbacks.onCloseTag(this.sectionStart, this.index);
            this.sectionStart = -1;
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.AfterClosingTagName;
            stateAfterClosingTagName(i6);
        }
    }

    private final void stateInCommentLike(int i6) {
        byte[] bArr = this.currentSequence;
        if (bArr == null) {
            return;
        }
        if (i6 != (p087i7.D.E(bArr, this.sequenceIndex) & 255)) {
            int i10 = this.sequenceIndex;
            if (i10 == 0) {
                if (fastForwardTo(p087i7.D.E(bArr, 0) & 255)) {
                    this.sequenceIndex = 1;
                    return;
                }
                return;
            } else {
                if (i6 != (p087i7.D.E(bArr, i10 - 1) & 255)) {
                    this.sequenceIndex = 0;
                    return;
                }
                return;
            }
        }
        int i11 = this.sequenceIndex + 1;
        this.sequenceIndex = i11;
        if (i11 == p087i7.D.N(bArr)) {
            if (p087i7.D.D(bArr, com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences.INSTANCE.m7getCdataEndTcUX1vc())) {
                this.callbacks.onCData(this.sectionStart, this.index, 2);
            } else {
                this.callbacks.onComment(this.sectionStart, this.index, 2);
            }
            this.sequenceIndex = 0;
            this.sectionStart = this.index + 1;
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text;
        }
    }

    private final void stateInDeclaration(int i6) {
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes charCodes = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Gt;
        if (i6 == charCodes.getCode() || fastForwardTo(charCodes.getCode())) {
            this.callbacks.onDeclaration(this.sectionStart, this.index);
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text;
            this.sectionStart = this.index + 1;
        }
    }

    private final void stateInEntity(int i6) {
        if (i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Semi.getCode()) {
            W5.c cVar = W5.c.f15351a;
            java.lang.String str = this.buffer;
            int i10 = this.entityStart;
            int i11 = this.offset;
            java.lang.String strSubstring = str.substring(i10 - i11, (this.index - i11) + 1);
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            java.lang.String strA = cVar.a(strSubstring);
            this.state = this.baseState;
            if (strA.length() == 0) {
                this.index = this.entityStart;
            } else {
                emitCodePoint(S8.r.y1(strA), (this.index + 1) - this.entityStart);
            }
        }
        if ((this.index + 1) - this.entityStart > 33 || !isInEntityChar(i6)) {
            this.state = this.baseState;
            this.index = this.entityStart;
        }
    }

    private final void stateInProcessingInstruction(int i6) {
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes charCodes = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Gt;
        if (i6 == charCodes.getCode() || fastForwardTo(charCodes.getCode())) {
            this.callbacks.onProcessingInstruction(this.sectionStart, this.index);
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text;
            this.sectionStart = this.index + 1;
        }
    }

    private final void stateInSelfClosingTag(int i6) {
        if (i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Gt.getCode()) {
            this.callbacks.onSelfClosingTag(this.index);
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text;
            this.sectionStart = this.index + 1;
            this.isSpecial = false;
            return;
        }
        if (Companion.isWhitespace(i6)) {
            return;
        }
        this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeAttributeName;
        stateBeforeAttributeName(i6);
    }

    private final void stateInSpecialComment(int i6) {
        byte[] bArr = this.currentSequence;
        if (bArr != null) {
            if (i6 != com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Gt.getCode()) {
                if (i6 != (p087i7.D.E(bArr, this.sequenceIndex) & 255)) {
                    this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InTagName;
                    stateInTagName(i6);
                    return;
                }
                return;
            }
            if (this.sequenceIndex == p087i7.D.N(bArr) - 1) {
                this.callbacks.onComment(this.sectionStart, (this.index - p087i7.D.N(bArr)) + 1, 3);
                this.sectionStart = -1;
                this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text;
            }
        }
    }

    private final void stateInSpecialTag(int i6) {
        byte[] bArr = this.currentSequence;
        if (bArr == null) {
            return;
        }
        if (this.sequenceIndex == p087i7.D.N(bArr)) {
            if (i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Gt.getCode() || Companion.isWhitespace(i6)) {
                int iN = this.index - p087i7.D.N(bArr);
                int i10 = this.sectionStart;
                if (i10 < iN) {
                    int i11 = this.index;
                    this.index = iN;
                    this.callbacks.onText(i10, iN);
                    this.index = i11;
                }
                this.isSpecial = false;
                this.sectionStart = iN + 2;
                stateInClosingTagName(i6);
                return;
            }
            this.sequenceIndex = 0;
        }
        if ((i6 | 32) == (p087i7.D.E(bArr, this.sequenceIndex) & 255)) {
            this.sequenceIndex++;
            return;
        }
        if (this.sequenceIndex != 0) {
            this.sequenceIndex = i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Lt.getCode() ? 1 : 0;
            return;
        }
        if (!p087i7.D.D(bArr, com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.Sequences.INSTANCE.m12getTitleEndTcUX1vc())) {
            if (fastForwardTo(com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Lt.getCode())) {
                this.sequenceIndex = 1;
            }
        } else if (this.decodeEntities && i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Amp.getCode()) {
            startEntity();
        }
    }

    private final void stateInTagName(int i6) {
        if (Companion.isEndOfTagSection(i6)) {
            this.callbacks.onOpenTagName(this.sectionStart, this.index);
            this.sectionStart = -1;
            this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeAttributeName;
            stateBeforeAttributeName(i6);
        }
    }

    private final void stateSpecialStartSequence(int i6) {
        boolean zIsEndOfTagSection;
        byte[] bArr = this.currentSequence;
        if (bArr == null) {
            return;
        }
        boolean z6 = this.sequenceIndex == p087i7.D.N(bArr);
        if (z6) {
            zIsEndOfTagSection = Companion.isEndOfTagSection(i6);
        } else {
            zIsEndOfTagSection = (i6 | 32) == (p087i7.D.E(bArr, this.sequenceIndex) & 255);
        }
        if (!zIsEndOfTagSection) {
            this.isSpecial = false;
        } else if (!z6) {
            this.sequenceIndex++;
            return;
        }
        this.sequenceIndex = 0;
        this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.InTagName;
        stateInTagName(i6);
    }

    private final void stateText(int i6) {
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes charCodes = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Lt;
        if (i6 != charCodes.getCode() && (this.decodeEntities || !fastForwardTo(charCodes.getCode()))) {
            if (this.decodeEntities && i6 == com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.CharCodes.Amp.getCode()) {
                startEntity();
                return;
            }
            return;
        }
        int i10 = this.index;
        int i11 = this.sectionStart;
        if (i10 > i11) {
            this.callbacks.onText(i11, i10);
        }
        this.state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.BeforeTagName;
        this.sectionStart = this.index;
    }

    public final void end() {
        if (this.running) {
            finish();
        }
    }

    public final boolean getRunning() {
        return this.running;
    }

    public final void pause() {
        this.running = false;
    }

    public final void reset() {
        com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State state = com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.State.Text;
        this.state = state;
        this.buffer = "";
        this.sectionStart = 0;
        this.index = 0;
        this.baseState = state;
        this.currentSequence = null;
        this.running = true;
        this.offset = 0;
    }

    public final void resume() {
        this.running = true;
        if (this.index < this.buffer.length() + this.offset) {
            parse();
        }
    }

    public final void setRunning(boolean z6) {
        this.running = z6;
    }

    public final void write(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "chunk");
        this.offset += this.buffer.length();
        this.buffer = str;
        parse();
    }
}
