.class public final Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Default;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Default"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u15f9"
    }
    d2 = {
        "\u15fa",
        "\u15fb",
        "\u15fc",
        "\u15fd",
        "\u15fe"
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
.field public static final INSTANCE:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Default;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Default;

    invoke-direct {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Default;-><init>()V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Default;->INSTANCE:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Default;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onAttribute(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onCDataEnd()V
    .locals 0

    invoke-static {p0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onCDataEnd(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;)V

    return-void
.end method

.method public onCDataStart()V
    .locals 0

    invoke-static {p0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onCDataStart(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;)V

    return-void
.end method

.method public onCloseTag(Ljava/lang/String;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onCloseTag(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;Z)V

    return-void
.end method

.method public onComment(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onComment(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;)V

    return-void
.end method

.method public onCommentEnd()V
    .locals 0

    invoke-static {p0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onCommentEnd(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;)V

    return-void
.end method

.method public onEnd()V
    .locals 0

    invoke-static {p0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onEnd(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;)V

    return-void
.end method

.method public onError(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onError(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/Exception;)V

    return-void
.end method

.method public onOpenTag(Ljava/lang/String;Ljava/util/Map;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onOpenTag(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;Ljava/util/Map;Z)V

    return-void
.end method

.method public onOpenTagName(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onOpenTagName(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;)V

    return-void
.end method

.method public onParserInit(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onParserInit(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;)V

    return-void
.end method

.method public onProcessingInstruction(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onProcessingInstruction(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onReset()V
    .locals 0

    invoke-static {p0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onReset(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;)V

    return-void
.end method

.method public onText(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;->onText(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;)V

    return-void
.end method
