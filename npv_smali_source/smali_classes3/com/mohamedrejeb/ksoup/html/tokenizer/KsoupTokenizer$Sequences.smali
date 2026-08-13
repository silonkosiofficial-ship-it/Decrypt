.class final Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Sequences"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0c70"
    }
    d2 = {
        "\u0c71",
        "",
        "\u0c72",
        "\u0c73",
        "\u0c74",
        "\u0c75",
        "\u0c76",
        "\u0c77",
        "\u0c78",
        "\u0c79",
        "\u0c7a",
        "\u0c7b",
        "\u0c7c",
        "\u0c7d",
        "\u0c7e",
        "\u0c7f",
        "\u0c80",
        "\u0c81",
        "\u0c82",
        "\u0c83",
        "\u0c84",
        "\u0c85"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation


# static fields
.field private static final Cdata:[B

.field private static final CdataEnd:[B

.field private static final CommentEnd:[B

.field public static final INSTANCE:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;

.field private static final ScriptEnd:[B

.field private static final StyleEnd:[B

.field private static final TextareaEnd:[B

.field private static final TitleEnd:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;

    invoke-direct {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;-><init>()V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->INSTANCE:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;

    const/4 v0, 0x6

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->Cdata:[B

    const/4 v0, 0x3

    new-array v1, v0, [B

    fill-array-data v1, :array_1

    sput-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->CdataEnd:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->CommentEnd:[B

    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_3

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->ScriptEnd:[B

    const/4 v0, 0x7

    new-array v1, v0, [B

    fill-array-data v1, :array_4

    sput-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->StyleEnd:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_5

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->TitleEnd:[B

    const/16 v0, 0xa

    new-array v0, v0, [B

    fill-array-data v0, :array_6

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->TextareaEnd:[B

    return-void

    :array_0
    .array-data 1
        0x43t
        0x44t
        0x41t
        0x54t
        0x41t
        0x5bt
    .end array-data

    nop

    :array_1
    .array-data 1
        0x5dt
        0x5dt
        0x3et
    .end array-data

    :array_2
    .array-data 1
        0x2dt
        0x2dt
        0x3et
    .end array-data

    :array_3
    .array-data 1
        0x3ct
        0x2ft
        0x73t
        0x63t
        0x72t
        0x69t
        0x70t
        0x74t
    .end array-data

    :array_4
    .array-data 1
        0x3ct
        0x2ft
        0x73t
        0x74t
        0x79t
        0x6ct
        0x65t
    .end array-data

    :array_5
    .array-data 1
        0x3ct
        0x2ft
        0x74t
        0x69t
        0x74t
        0x6ct
        0x65t
    .end array-data

    :array_6
    .array-data 1
        0x3ct
        0x2ft
        0x74t
        0x65t
        0x78t
        0x74t
        0x61t
        0x72t
        0x65t
        0x61t
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCdata-TcUX1vc()[B
    .locals 1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->Cdata:[B

    return-object v0
.end method

.method public final getCdataEnd-TcUX1vc()[B
    .locals 1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->CdataEnd:[B

    return-object v0
.end method

.method public final getCommentEnd-TcUX1vc()[B
    .locals 1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->CommentEnd:[B

    return-object v0
.end method

.method public final getScriptEnd-TcUX1vc()[B
    .locals 1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->ScriptEnd:[B

    return-object v0
.end method

.method public final getStyleEnd-TcUX1vc()[B
    .locals 1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->StyleEnd:[B

    return-object v0
.end method

.method public final getTextareaEnd-TcUX1vc()[B
    .locals 1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->TextareaEnd:[B

    return-object v0
.end method

.method public final getTitleEnd-TcUX1vc()[B
    .locals 1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Sequences;->TitleEnd:[B

    return-object v0
.end method
