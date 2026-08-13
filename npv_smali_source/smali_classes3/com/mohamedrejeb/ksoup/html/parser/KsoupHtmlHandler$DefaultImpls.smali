.class public final Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static onAttribute(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const-string p0, "name"

    invoke-static {p1, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "value"

    invoke-static {p2, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic onAttribute$default(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onAttribute"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static onCDataEnd(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;)V
    .locals 0

    return-void
.end method

.method public static onCDataStart(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;)V
    .locals 0

    return-void
.end method

.method public static onCloseTag(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;Z)V
    .locals 0

    const-string p0, "name"

    invoke-static {p1, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static onComment(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;)V
    .locals 0

    const-string p0, "comment"

    invoke-static {p1, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static onCommentEnd(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;)V
    .locals 0

    return-void
.end method

.method public static onEnd(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;)V
    .locals 0

    return-void
.end method

.method public static onError(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/Exception;)V
    .locals 0

    const-string p0, "error"

    invoke-static {p1, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static onOpenTag(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;Ljava/util/Map;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    const-string p0, "name"

    invoke-static {p1, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "attributes"

    invoke-static {p2, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static onOpenTagName(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;)V
    .locals 0

    const-string p0, "name"

    invoke-static {p1, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static onParserInit(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;)V
    .locals 0

    const-string p0, "ksoupHtmlParser"

    invoke-static {p1, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static onProcessingInstruction(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const-string p0, "name"

    invoke-static {p1, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "data"

    invoke-static {p2, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static onReset(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;)V
    .locals 0

    return-void
.end method

.method public static onText(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Ljava/lang/String;)V
    .locals 0

    const-string p0, "text"

    invoke-static {p1, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
