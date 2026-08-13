.class public final enum Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "QuoteType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0c1b"
    }
    d2 = {
        "\u0c1c",
        "",
        "\u0c1d",
        "\u0c1e",
        "\u0c1f",
        "\u0c20",
        "\u0c21",
        "\u0c22",
        "\u0c23"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lp7/a;

.field private static final synthetic $VALUES:[Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

.field public static final enum Double:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

.field public static final enum NoValue:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

.field public static final enum Single:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

.field public static final enum Unquoted:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;


# direct methods
.method private static final synthetic $values()[Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->NoValue:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->Unquoted:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->Single:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->Double:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    const-string v1, "NoValue"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->NoValue:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    const-string v1, "Unquoted"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->Unquoted:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    const-string v1, "Single"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->Single:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    const-string v1, "Double"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->Double:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    invoke-static {}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->$values()[Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    move-result-object v0

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->$VALUES:[Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->$ENTRIES:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lp7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp7/a;"
        }
    .end annotation

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->$ENTRIES:Lp7/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;
    .locals 1

    const-class v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    return-object p0
.end method

.method public static values()[Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;
    .locals 1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;->$VALUES:[Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;

    return-object v0
.end method
