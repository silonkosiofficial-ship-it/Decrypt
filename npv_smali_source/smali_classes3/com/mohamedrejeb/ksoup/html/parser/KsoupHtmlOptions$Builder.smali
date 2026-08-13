.class public final Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0bd2"
    }
    d2 = {
        "\u0bd3",
        "",
        "\u0bd4",
        "\u0bd5",
        "\u0bd6",
        "\u0bd7",
        "\u0bd8",
        "",
        "\u0bd9",
        "\u0bda",
        "\u0bdb",
        "\u0bdc",
        "\u0bdd",
        "\u0bde",
        "\u0bdf"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;


# direct methods
.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v9, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;-><init>(ZZZZZZILy7/k;)V

    iput-object v9, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    return-void
.end method


# virtual methods
.method public final build()Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    return-object v0
.end method

.method public final decodeEntities(Z)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;
    .locals 9

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    const/16 v7, 0x3d

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v2, p1

    invoke-static/range {v0 .. v8}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->copy$default(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;ZZZZZZILjava/lang/Object;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    move-result-object p1

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    return-object p0
.end method

.method public final lowerCaseAttributeNames(Z)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;
    .locals 9

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    const/16 v7, 0x37

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p1

    invoke-static/range {v0 .. v8}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->copy$default(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;ZZZZZZILjava/lang/Object;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    move-result-object p1

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    return-object p0
.end method

.method public final lowerCaseTags(Z)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;
    .locals 9

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    const/16 v7, 0x3b

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v3, p1

    invoke-static/range {v0 .. v8}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->copy$default(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;ZZZZZZILjava/lang/Object;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    move-result-object p1

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    return-object p0
.end method

.method public final recognizeCDATA(Z)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;
    .locals 9

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    const/16 v7, 0x2f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move v5, p1

    invoke-static/range {v0 .. v8}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->copy$default(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;ZZZZZZILjava/lang/Object;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    move-result-object p1

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    return-object p0
.end method

.method public final recognizeSelfClosing(Z)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;
    .locals 9

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    const/16 v7, 0x1f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p1

    invoke-static/range {v0 .. v8}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->copy$default(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;ZZZZZZILjava/lang/Object;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    move-result-object p1

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    return-object p0
.end method

.method public final xmlMode(Z)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;
    .locals 9

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v1, p1

    invoke-static/range {v0 .. v8}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->copy$default(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;ZZZZZZILjava/lang/Object;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    move-result-object p1

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    return-object p0
.end method
