.class public final Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->onOpenTagName(Lx7/l;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u1531"
    }
    d2 = {
        "\u1532",
        "\u1533",
        "\u1534",
        "\u1535",
        "\u1536",
        "\u1537",
        "\u1538",
        "\u1539",
        "\u153a",
        "\u153b",
        "\u153c",
        "\u153d",
        "\u153e",
        "\u153f",
        "\u1540",
        "",
        "\u1541",
        "",
        "\u1542",
        "\u1543",
        "\u1544",
        "\u1545",
        "\u1546",
        "\u1547",
        "\u1548",
        "",
        "\u1549",
        "\u154a",
        "\u154b",
        "\u154c",
        "\u154d",
        "\u154e",
        "\u154f",
        "\u1550",
        "\u1551",
        "\u1552",
        "\u1553",
        "\u1554",
        "\u1555",
        "\u1556",
        "\u1557",
        "\u1558"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation


# instance fields
.field private final synthetic $$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

.field final synthetic $block:Lx7/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/l;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    iput-object p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$block:Lx7/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->access$getHandler$p(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    move-result-object p1

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-void
.end method


# virtual methods
.method public onAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1, p2, p3}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onCDataEnd()V
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCDataEnd()V

    return-void
.end method

.method public onCDataStart()V
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCDataStart()V

    return-void
.end method

.method public onCloseTag(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCloseTag(Ljava/lang/String;Z)V

    return-void
.end method

.method public onComment(Ljava/lang/String;)V
    .locals 1

    const-string v0, "comment"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onComment(Ljava/lang/String;)V

    return-void
.end method

.method public onCommentEnd()V
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCommentEnd()V

    return-void
.end method

.method public onEnd()V
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onEnd()V

    return-void
.end method

.method public onError(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onError(Ljava/lang/Exception;)V

    return-void
.end method

.method public onOpenTag(Ljava/lang/String;Ljava/util/Map;Z)V
    .locals 1
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

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1, p2, p3}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onOpenTag(Ljava/lang/String;Ljava/util/Map;Z)V

    return-void
.end method

.method public onOpenTagName(Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$block:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onParserInit(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;)V
    .locals 1

    const-string v0, "ksoupHtmlParser"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onParserInit(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;)V

    return-void
.end method

.method public onProcessingInstruction(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onProcessingInstruction(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onReset()V
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onReset()V

    return-void
.end method

.method public onText(Ljava/lang/String;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onText(Ljava/lang/String;)V

    return-void
.end method
