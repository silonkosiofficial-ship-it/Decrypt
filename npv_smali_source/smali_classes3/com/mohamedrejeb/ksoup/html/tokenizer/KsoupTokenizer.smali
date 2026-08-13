.class public final Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;,
        Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;,
        Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;,
        Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;,
        Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;,
        Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0ca5"
    }
    d2 = {
        "\u0ca6",
        "",
        "\u0ca7",
        "\u0ca8",
        "\u0ca9",
        "\u0caa",
        "\u0cab",
        "\u0cac",
        "",
        "\u0cad",
        "\u0cae",
        "\u0caf",
        "\u0cb0",
        "\u0cb1",
        "\u0cb2",
        "\u0cb3",
        "",
        "\u0cb4",
        "\u0cb5",
        "\u0cb6",
        "\u0cb7",
        "\u0cb8",
        "\u0cb9",
        "\u0cba",
        "\u0cbb",
        "\u0cbc",
        "\u0cbd",
        "\u0cbe",
        "\u0cbf",
        "\u0cc0",
        "\u0cc1",
        "\u0cc2",
        "\u0cc3",
        "\u0cc4",
        "\u0cc5",
        "\u0cc6",
        "\u0cc7",
        "\u0cc8",
        "\u0cc9",
        "\u0cca",
        "\u0ccb",
        "\u0ccc",
        "\u0ccd",
        "\u0cce",
        "\u0ccf",
        "\u0cd0",
        "\u0cd1",
        "\u0cd2",
        "\u0cd3",
        "\u0cd4",
        "\u0cd5",
        "\u0cd6",
        "\u0cd7",
        "\u0cd8",
        "\u0cd9",
        "\u0cda",
        "\u0cdb",
        "\u0cdc",
        "\u0cdd",
        "\u0cde",
        "\u0cdf",
        "\u0ce0",
        "\u0ce1",
        "\u0ce2",
        "",
        "\u0ce3",
        "\u0ce4",
        "\u0ce5",
        "\u0ce6",
        "\u0ce7",
        "\u0ce8",
        "\u0ce9",
        "\u0cea",
        "\u0ceb",
        "\u0cec",
        "\u0ced",
        "\u0cee",
        "\u0cef",
        "\u0cf0",
        "\u0cf1",
        "\u0cf2",
        "\u0cf3",
        "\u0cf4",
        "\u0cf5",
        "\u0cf6",
        "\u0cf7",
        "\u0cf8",
        "\u0cf9",
        "\u0cfa",
        "\u0cfb",
        "\u0cfc",
        "\u0cfd",
        "\u0cfe",
        "\u0cff",
        "\u0d00",
        "\u0d01",
        "\u0d02",
        "\u0d03",
        "\u0d04",
        "\u0d05"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation


# static fields
.field private static final Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

.field public static final LONGEST_HTML_ENTITY_LENGTH:I = 0x21
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private baseState:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field private buffer:Ljava/lang/String;

.field private final callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

.field private currentSequence:[B

.field private final decodeEntities:Z

.field private entityStart:I

.field private index:I

.field private isSpecial:Z

.field private offset:I

.field private running:Z

.field private sectionStart:I

.field private sequenceIndex:I

.field private state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field private final xmlMode:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;-><init>(Ly7/k;)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;)V
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callbacks"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    invoke-virtual {p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->getXmlMode()Z

    move-result p2

    iput-boolean p2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->xmlMode:Z

    invoke-virtual {p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->getDecodeEntities()Z

    move-result p1

    iput-boolean p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->decodeEntities:Z

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string p2, ""

    iput-object p2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->buffer:Ljava/lang/String;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->baseState:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->running:Z

    return-void
.end method

.method private final cleanup()V
    .locals 4

    .prologue
    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->running:Z

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    if-eq v0, v1, :cond_3

    iget-object v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v2, v3, :cond_2

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InSpecialTag:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-ne v2, v3, :cond_0

    iget v3, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueDq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v2, v3, :cond_1

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueSq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v2, v3, :cond_1

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueNq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-ne v2, v3, :cond_3

    :cond_1
    iget-object v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    invoke-interface {v2, v0, v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onAttribData(II)V

    :goto_0
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    goto :goto_2

    :cond_2
    :goto_1
    iget-object v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    invoke-interface {v2, v0, v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onText(II)V

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method private final emitCodePoint(II)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->baseState:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InSpecialTag:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->entityStart:I

    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    invoke-interface {v2, v0, v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onAttribData(II)V

    :cond_0
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->entityStart:I

    add-int/2addr v0, p2

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iget-object p2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    invoke-interface {p2, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onAttribEntity(I)V

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->entityStart:I

    if-ge v0, v1, :cond_2

    iget-object v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    invoke-interface {v2, v0, v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onText(II)V

    :cond_2
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->entityStart:I

    add-int/2addr v0, p2

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    add-int/lit8 p2, v0, -0x1

    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iget-object p2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    invoke-interface {p2, p1, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onTextEntity(II)V

    :goto_0
    return-void
.end method

.method private final fastForwardTo(I)Z
    .locals 4

    .prologue
    :goto_0
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->buffer:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->offset:I

    add-int/2addr v1, v2

    const/4 v3, 0x1

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->buffer:Ljava/lang/String;

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, p1, :cond_0

    return v3

    :cond_0
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->buffer:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->offset:I

    add-int/2addr p1, v0

    sub-int/2addr p1, v3

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    const/4 p1, 0x0

    return p1
.end method

.method private final finish()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InEntity:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->baseState:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    :cond_0
    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->handleTrailingData()V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    invoke-interface {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onEnd()V

    return-void
.end method

.method private static synthetic getCurrentSequence--5HJl4c$annotations()V
    .locals 0

    return-void
.end method

.method private final handleInAttributeValue(II)V
    .locals 2

    .prologue
    if-eq p1, p2, :cond_1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->decodeEntities:Z

    if-nez v0, :cond_0

    invoke-direct {p0, p2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->fastForwardTo(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->decodeEntities:Z

    if-eqz p2, :cond_3

    sget-object p2, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Amp:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {p2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result p2

    if-ne p1, p2, :cond_3

    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->startEntity()V

    goto :goto_2

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-interface {p1, v0, v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onAttribData(II)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->DoubleQuote:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p2, v0, :cond_2

    sget-object p2, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->Double:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    goto :goto_1

    :cond_2
    sget-object p2, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->Single:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    :goto_1
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/lit8 v0, v0, 0x1

    invoke-interface {p1, p2, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onAttribEnd(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;I)V

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    :cond_3
    :goto_2
    return-void
.end method

.method private final handleTrailingData()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->buffer:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->offset:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    if-lt v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InCommentLike:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-ne v2, v3, :cond_3

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->currentSequence:[B

    sget-object v2, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->INSTANCE:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;

    invoke-virtual {v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getCdataEnd-TcUX1vc()[B

    move-result-object v2

    const/4 v3, 0x0

    if-nez v1, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    invoke-static {v1, v2}, Li7/D;->D([B[B)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    invoke-interface {v1, v2, v0, v3}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onCData(III)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    invoke-interface {v1, v2, v0, v3}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onComment(III)V

    goto :goto_1

    :cond_3
    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v2, v3, :cond_5

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v2, v3, :cond_5

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeAttributeValue:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v2, v3, :cond_5

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->AfterAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v2, v3, :cond_5

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v2, v3, :cond_5

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueSq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v2, v3, :cond_5

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueDq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v2, v3, :cond_5

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueNq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v2, v3, :cond_5

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InClosingTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-eq v2, v3, :cond_5

    sget-object v3, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InSelfClosingTag:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    if-ne v2, v3, :cond_4

    goto :goto_1

    :cond_4
    iget-object v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    invoke-interface {v2, v1, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onText(II)V

    :cond_5
    :goto_1
    return-void
.end method

.method private final isInEntityChar(I)Z
    .locals 2

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isASCIIAlpha(I)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isDigit(I)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Semi:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private final isTagStartChar(I)Z
    .locals 1

    .prologue
    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->xmlMode:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isEndOfTagSection(I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isASCIIAlpha(I)Z

    move-result p1

    :goto_0
    return p1
.end method

.method private final parse()V
    .locals 3

    .prologue
    :goto_0
    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->shouldContinue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->buffer:Ljava/lang/String;

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->offset:I

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    sget-object v2, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :pswitch_0
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInEntity(I)V

    goto/16 :goto_1

    :pswitch_1
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInProcessingInstruction(I)V

    goto/16 :goto_1

    :pswitch_2
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateBeforeComment(I)V

    goto/16 :goto_1

    :pswitch_3
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateBeforeDeclaration(I)V

    goto/16 :goto_1

    :pswitch_4
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInDeclaration(I)V

    goto :goto_1

    :pswitch_5
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInSelfClosingTag(I)V

    goto :goto_1

    :pswitch_6
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInAttributeValueNoQuotes(I)V

    goto :goto_1

    :pswitch_7
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateBeforeSpecialT(I)V

    goto :goto_1

    :pswitch_8
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateBeforeSpecialS(I)V

    goto :goto_1

    :pswitch_9
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateAfterClosingTagName(I)V

    goto :goto_1

    :pswitch_a
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateBeforeClosingTagName(I)V

    goto :goto_1

    :pswitch_b
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateBeforeAttributeValue(I)V

    goto :goto_1

    :pswitch_c
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInAttributeValueSingleQuotes(I)V

    goto :goto_1

    :pswitch_d
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateAfterAttributeName(I)V

    goto :goto_1

    :pswitch_e
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateBeforeTagName(I)V

    goto :goto_1

    :pswitch_f
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInClosingTagName(I)V

    goto :goto_1

    :pswitch_10
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInTagName(I)V

    goto :goto_1

    :pswitch_11
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateBeforeAttributeName(I)V

    goto :goto_1

    :pswitch_12
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInSpecialComment(I)V

    goto :goto_1

    :pswitch_13
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInCommentLike(I)V

    goto :goto_1

    :pswitch_14
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInAttributeName(I)V

    goto :goto_1

    :pswitch_15
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInAttributeValueDoubleQuotes(I)V

    goto :goto_1

    :pswitch_16
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateCDATASequence(I)V

    goto :goto_1

    :pswitch_17
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInSpecialTag(I)V

    goto :goto_1

    :pswitch_18
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateSpecialStartSequence(I)V

    goto :goto_1

    :pswitch_19
    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateText(I)V

    :goto_1
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    goto/16 :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->cleanup()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final shouldContinue()Z
    .locals 3

    .prologue
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->buffer:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->offset:I

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->running:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final startEntity()V
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->baseState:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InEntity:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->entityStart:I

    return-void
.end method

.method private final startSpecial-rto03Yo([BI)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->isSpecial:Z

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->currentSequence:[B

    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->SpecialStartSequence:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    return-void
.end method

.method private final stateAfterAttributeName(I)V
    .locals 3

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Eq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeAttributeValue:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Slash:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-eq p1, v0, :cond_2

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Gt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isWhitespace(I)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->NoValue:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    invoke-interface {p1, v0, v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onAttribEnd(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;I)V

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->NoValue:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    invoke-interface {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onAttribEnd(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;I)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateBeforeAttributeName(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method private final stateAfterClosingTagName(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Gt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v1

    if-eq p1, v1, :cond_0

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->fastForwardTo(I)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    :cond_1
    return-void
.end method

.method private final stateBeforeAttributeName(I)V
    .locals 1

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Gt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-interface {p1, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onOpenTagEnd(I)V

    iget-boolean p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->isSpecial:Z

    if-eqz p1, :cond_0

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InSpecialTag:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/4 p1, 0x0

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    :goto_0
    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/lit8 p1, p1, 0x1

    :goto_1
    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    goto :goto_2

    :cond_1
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Slash:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_2

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InSelfClosingTag:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    goto :goto_2

    :cond_2
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isWhitespace(I)Z

    move-result p1

    if-nez p1, :cond_3

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method private final stateBeforeAttributeValue(I)V
    .locals 1

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->DoubleQuote:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueDq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    :goto_0
    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->SingleQuote:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_1

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueSq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isWhitespace(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueNq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInAttributeValueNoQuotes(I)V

    :cond_2
    :goto_1
    return-void
.end method

.method private final stateBeforeClosingTagName(I)V
    .locals 1

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isWhitespace(I)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Gt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    goto :goto_1

    :cond_0
    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->isTagStartChar(I)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InClosingTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InSpecialComment:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    :goto_0
    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    :cond_2
    :goto_1
    return-void
.end method

.method private final stateBeforeComment(I)V
    .locals 1

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Dash:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InCommentLike:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->INSTANCE:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;

    invoke-virtual {p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getCommentEnd-TcUX1vc()[B

    move-result-object p1

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->currentSequence:[B

    const/4 p1, 0x2

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InDeclaration:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    :goto_0
    return-void
.end method

.method private final stateBeforeDeclaration(I)V
    .locals 1

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->OpeningSquareBracket:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->CDATASequence:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/4 p1, 0x0

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Dash:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_1

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeComment:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InDeclaration:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    :goto_0
    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    :goto_1
    return-void
.end method

.method private final stateBeforeSpecialS(I)V
    .locals 5

    .prologue
    or-int/lit8 v0, p1, 0x20

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->INSTANCE:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;

    invoke-virtual {v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getScriptEnd-TcUX1vc()[B

    move-result-object v2

    const/4 v3, 0x3

    invoke-static {v2, v3}, Li7/D;->E([BI)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    const/4 v4, 0x4

    if-ne v0, v2, :cond_0

    invoke-virtual {v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getScriptEnd-TcUX1vc()[B

    move-result-object p1

    invoke-direct {p0, p1, v4}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->startSpecial-rto03Yo([BI)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getStyleEnd-TcUX1vc()[B

    move-result-object v2

    invoke-static {v2, v3}, Li7/D;->E([BI)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    if-ne v0, v2, :cond_1

    invoke-virtual {v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getStyleEnd-TcUX1vc()[B

    move-result-object p1

    invoke-direct {p0, p1, v4}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->startSpecial-rto03Yo([BI)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInTagName(I)V

    :goto_0
    return-void
.end method

.method private final stateBeforeSpecialT(I)V
    .locals 5

    .prologue
    or-int/lit8 v0, p1, 0x20

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->INSTANCE:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;

    invoke-virtual {v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getTitleEnd-TcUX1vc()[B

    move-result-object v2

    const/4 v3, 0x3

    invoke-static {v2, v3}, Li7/D;->E([BI)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    const/4 v4, 0x4

    if-ne v0, v2, :cond_0

    invoke-virtual {v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getTitleEnd-TcUX1vc()[B

    move-result-object p1

    invoke-direct {p0, p1, v4}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->startSpecial-rto03Yo([BI)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getTextareaEnd-TcUX1vc()[B

    move-result-object v2

    invoke-static {v2, v3}, Li7/D;->E([BI)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    if-ne v0, v2, :cond_1

    invoke-virtual {v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getTextareaEnd-TcUX1vc()[B

    move-result-object p1

    invoke-direct {p0, p1, v4}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->startSpecial-rto03Yo([BI)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInTagName(I)V

    :goto_0
    return-void
.end method

.method private final stateBeforeTagName(I)V
    .locals 3

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->ExclamationMark:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeDeclaration:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    :goto_0
    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    goto :goto_2

    :cond_0
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->QuestionMark:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_1

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InProcessingInstruction:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->isTagStartChar(I)Z

    move-result v0

    if-eqz v0, :cond_5

    or-int/lit8 p1, p1, 0x20

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->xmlMode:Z

    if-eqz v0, :cond_3

    :cond_2
    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    :goto_1
    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    goto :goto_2

    :cond_3
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->INSTANCE:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getScriptEnd-TcUX1vc()[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Li7/D;->E([BI)B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    if-ne p1, v1, :cond_4

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeSpecialS:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getTitleEnd-TcUX1vc()[B

    move-result-object v0

    invoke-static {v0, v2}, Li7/D;->E([BI)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    if-ne p1, v0, :cond_2

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeSpecialT:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    goto :goto_1

    :cond_5
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Slash:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_6

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeClosingTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    goto :goto_1

    :cond_6
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateText(I)V

    :goto_2
    return-void
.end method

.method private final stateCDATASequence(I)V
    .locals 3

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->INSTANCE:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getCdata-TcUX1vc()[B

    move-result-object v1

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    invoke-static {v1, v2}, Li7/D;->E([BI)B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x0

    if-ne p1, v1, :cond_0

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getCdata-TcUX1vc()[B

    move-result-object v1

    invoke-static {v1}, Li7/D;->N([B)I

    move-result v1

    if-ne p1, v1, :cond_1

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InCommentLike:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getCdataEnd-TcUX1vc()[B

    move-result-object p1

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->currentSequence:[B

    iput v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    goto :goto_0

    :cond_0
    iput v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InDeclaration:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInDeclaration(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final stateInAttributeName(I)V
    .locals 3

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Eq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isEndOfTagSection(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-interface {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onAttribName(II)V

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->AfterAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateAfterAttributeName(I)V

    :cond_1
    return-void
.end method

.method private final stateInAttributeValueDoubleQuotes(I)V
    .locals 1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->DoubleQuote:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->handleInAttributeValue(II)V

    return-void
.end method

.method private final stateInAttributeValueNoQuotes(I)V
    .locals 3

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isWhitespace(I)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Gt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->decodeEntities:Z

    if-eqz v0, :cond_2

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Amp:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_2

    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->startEntity()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-interface {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onAttribData(II)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->Unquoted:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-interface {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onAttribEnd(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;I)V

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateBeforeAttributeName(I)V

    :cond_2
    :goto_1
    return-void
.end method

.method private final stateInAttributeValueSingleQuotes(I)V
    .locals 1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->SingleQuote:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->handleInAttributeValue(II)V

    return-void
.end method

.method private final stateInClosingTagName(I)V
    .locals 3

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Gt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isWhitespace(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-interface {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onCloseTag(II)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->AfterClosingTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateAfterClosingTagName(I)V

    :cond_1
    return-void
.end method

.method private final stateInCommentLike(I)V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->currentSequence:[B

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    invoke-static {v0, v1}, Li7/D;->E([BI)B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne p1, v1, :cond_2

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    add-int/2addr p1, v3

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    invoke-static {v0}, Li7/D;->N([B)I

    move-result v1

    if-ne p1, v1, :cond_4

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->INSTANCE:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;

    invoke-virtual {p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getCdataEnd-TcUX1vc()[B

    move-result-object p1

    invoke-static {v0, p1}, Li7/D;->D([B[B)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget v4, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-interface {p1, v1, v4, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onCData(III)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget v4, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-interface {p1, v1, v4, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onComment(III)V

    :goto_0
    iput v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/2addr p1, v3

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    goto :goto_1

    :cond_2
    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    if-nez v1, :cond_3

    invoke-static {v0, v2}, Li7/D;->E([BI)B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->fastForwardTo(I)Z

    move-result p1

    if-eqz p1, :cond_4

    iput v3, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    goto :goto_1

    :cond_3
    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Li7/D;->E([BI)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    if-eq p1, v0, :cond_4

    iput v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    :cond_4
    :goto_1
    return-void
.end method

.method private final stateInDeclaration(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Gt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v1

    if-eq p1, v1, :cond_0

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->fastForwardTo(I)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-interface {p1, v0, v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onDeclaration(II)V

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    :cond_1
    return-void
.end method

.method private final stateInEntity(I)V
    .locals 5

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Semi:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_1

    sget-object v0, LW5/c;->a:LW5/c;

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->buffer:Ljava/lang/String;

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->entityStart:I

    iget v3, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->offset:I

    sub-int/2addr v2, v3

    iget v4, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    sub-int/2addr v4, v3

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v1, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "substring(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LW5/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->baseState:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->entityStart:I

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    goto :goto_0

    :cond_0
    invoke-static {v0}, LS8/r;->y1(Ljava/lang/CharSequence;)C

    move-result v0

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->entityStart:I

    sub-int/2addr v1, v2

    invoke-direct {p0, v0, v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->emitCodePoint(II)V

    :cond_1
    :goto_0
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->entityStart:I

    sub-int/2addr v0, v1

    const/16 v1, 0x21

    if-gt v0, v1, :cond_2

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->isInEntityChar(I)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->baseState:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->entityStart:I

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    :cond_3
    return-void
.end method

.method private final stateInProcessingInstruction(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Gt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v1

    if-eq p1, v1, :cond_0

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->fastForwardTo(I)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-interface {p1, v0, v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onProcessingInstruction(II)V

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    :cond_1
    return-void
.end method

.method private final stateInSelfClosingTag(I)V
    .locals 1

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Gt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-interface {p1, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onSelfClosingTag(I)V

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->isSpecial:Z

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isWhitespace(I)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateBeforeAttributeName(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final stateInSpecialComment(I)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->currentSequence:[B

    if-eqz v0, :cond_1

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Gt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v1

    if-ne p1, v1, :cond_0

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    invoke-static {v0}, Li7/D;->N([B)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-static {v0}, Li7/D;->N([B)I

    move-result v0

    sub-int/2addr v2, v0

    add-int/lit8 v2, v2, 0x1

    const/4 v0, 0x3

    invoke-interface {p1, v1, v2, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onComment(III)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    invoke-static {v0, v1}, Li7/D;->E([BI)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInTagName(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final stateInSpecialTag(I)V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->currentSequence:[B

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    invoke-static {v0}, Li7/D;->N([B)I

    move-result v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_4

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Gt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v1

    if-eq p1, v1, :cond_2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v1, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isWhitespace(I)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iput v3, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    goto :goto_1

    :cond_2
    :goto_0
    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-static {v0}, Li7/D;->N([B)I

    move-result v0

    sub-int/2addr v1, v0

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    if-ge v0, v1, :cond_3

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iput v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iget-object v4, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    invoke-interface {v4, v0, v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onText(II)V

    iput v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    :cond_3
    iput-boolean v3, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->isSpecial:Z

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInClosingTagName(I)V

    return-void

    :cond_4
    :goto_1
    or-int/lit8 v1, p1, 0x20

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    invoke-static {v0, v2}, Li7/D;->E([BI)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    const/4 v4, 0x1

    if-ne v1, v2, :cond_5

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    add-int/2addr p1, v4

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    goto :goto_2

    :cond_5
    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    if-nez v1, :cond_7

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->INSTANCE:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;

    invoke-virtual {v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->getTitleEnd-TcUX1vc()[B

    move-result-object v1

    invoke-static {v0, v1}, Li7/D;->D([B[B)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->decodeEntities:Z

    if-eqz v0, :cond_9

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Amp:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_9

    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->startEntity()V

    goto :goto_2

    :cond_6
    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Lt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->fastForwardTo(I)Z

    move-result p1

    if-eqz p1, :cond_9

    iput v4, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    goto :goto_2

    :cond_7
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Lt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_8

    move v3, v4

    :cond_8
    iput v3, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    :cond_9
    :goto_2
    return-void
.end method

.method private final stateInTagName(I)V
    .locals 3

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isEndOfTagSection(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    invoke-interface {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onOpenTagName(II)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateBeforeAttributeName(I)V

    :cond_0
    return-void
.end method

.method private final stateSpecialStartSequence(I)V
    .locals 6

    .prologue
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->currentSequence:[B

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    invoke-static {v0}, Li7/D;->N([B)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    move v1, v4

    :goto_0
    if-eqz v1, :cond_2

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->Companion:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isEndOfTagSection(I)Z

    move-result v0

    goto :goto_1

    :cond_2
    or-int/lit8 v2, p1, 0x20

    iget v5, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    invoke-static {v0, v5}, Li7/D;->E([BI)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    if-ne v2, v0, :cond_3

    move v0, v3

    goto :goto_1

    :cond_3
    move v0, v4

    :goto_1
    if-nez v0, :cond_4

    iput-boolean v4, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->isSpecial:Z

    goto :goto_2

    :cond_4
    if-nez v1, :cond_5

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    add-int/2addr p1, v3

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    return-void

    :cond_5
    :goto_2
    iput v4, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sequenceIndex:I

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->stateInTagName(I)V

    return-void
.end method

.method private final stateText(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Lt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v1

    if-eq p1, v1, :cond_1

    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->decodeEntities:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->fastForwardTo(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->decodeEntities:Z

    if-eqz v0, :cond_3

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Amp:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-ne p1, v0, :cond_3

    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->startEntity()V

    goto :goto_1

    :cond_1
    :goto_0
    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    if-le p1, v0, :cond_2

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->callbacks:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;

    invoke-interface {v1, v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;->onText(II)V

    :cond_2
    sget-object p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final end()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->running:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->finish()V

    :cond_0
    return-void
.end method

.method public final getRunning()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->running:Z

    return v0
.end method

.method public final pause()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->running:Z

    return-void
.end method

.method public final reset()V
    .locals 2

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->state:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, ""

    iput-object v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->buffer:Ljava/lang/String;

    const/4 v1, 0x0

    iput v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->sectionStart:I

    iput v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->baseState:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->currentSequence:[B

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->running:Z

    iput v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->offset:I

    return-void
.end method

.method public final resume()V
    .locals 3

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->running:Z

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->index:I

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->buffer:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->offset:I

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->parse()V

    :cond_0
    return-void
.end method

.method public final setRunning(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->running:Z

    return-void
.end method

.method public final write(Ljava/lang/String;)V
    .locals 2

    const-string v0, "chunk"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->offset:I

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->buffer:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->offset:I

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->buffer:Ljava/lang/String;

    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->parse()V

    return-void
.end method
