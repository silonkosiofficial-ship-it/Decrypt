.class final Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0c65"
    }
    d2 = {
        "\u0c66",
        "",
        "\u0c67",
        "\u0c68",
        "\u0c69",
        "",
        "\u0c6a",
        "",
        "\u0c6b",
        "\u0c6c",
        "\u0c6d",
        "\u0c6e",
        "\u0c6f"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final isASCIIAlpha(I)Z
    .locals 1

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->LowerA:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-lt p1, v0, :cond_0

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->LowerZ:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-le p1, v0, :cond_1

    :cond_0
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->UpperA:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-lt p1, v0, :cond_2

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->UpperZ:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-gt p1, v0, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final isDigit(I)Z
    .locals 1

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Zero:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-lt p1, v0, :cond_0

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Nine:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final isEndOfTagSection(I)Z
    .locals 1

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Slash:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Gt:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-eq p1, v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Companion;->isWhitespace(I)Z

    move-result p1

    if-eqz p1, :cond_0

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

.method public final isWhitespace(I)Z
    .locals 1

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Space:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->NewLine:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->Tab:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->FormFeed:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->getCode()I

    move-result v0

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;->CarriageReturn:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$CharCodes;

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
