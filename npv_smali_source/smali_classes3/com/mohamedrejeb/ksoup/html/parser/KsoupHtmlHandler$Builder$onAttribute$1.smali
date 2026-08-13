.class public final Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->onAttribute(Lx7/q;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u13c9"
    }
    d2 = {
        "\u13ca",
        "\u13cb",
        "\u13cc",
        "\u13cd",
        "\u13ce",
        "\u13cf",
        "\u13d0",
        "\u13d1",
        "\u13d2",
        "\u13d3",
        "\u13d4",
        "\u13d5",
        "\u13d6",
        "\u13d7",
        "\u13d8",
        "",
        "\u13d9",
        "",
        "\u13da",
        "\u13db",
        "\u13dc",
        "\u13dd",
        "\u13de",
        "",
        "\u13df",
        "\u13e0",
        "\u13e1",
        "\u13e2",
        "\u13e3",
        "\u13e4",
        "\u13e5",
        "\u13e6",
        "\u13e7",
        "\u13e8",
        "\u13e9",
        "\u13ea",
        "\u13eb",
        "\u13ec",
        "\u13ed",
        "\u13ee",
        "\u13ef",
        "\u13f0"
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

.field final synthetic $block:Lx7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/q;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;",
            "Lx7/q;",
            ")V"
        }
    .end annotation

    iput-object p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$block:Lx7/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->access$getHandler$p(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    move-result-object p1

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-void
.end method


# virtual methods
.method public onAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$block:Lx7/q;

    invoke-interface {v0, p1, p2, p3}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onCDataEnd()V
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCDataEnd()V

    return-void
.end method

.method public onCDataStart()V
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCDataStart()V

    return-void
.end method

.method public onCloseTag(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCloseTag(Ljava/lang/String;Z)V

    return-void
.end method

.method public onComment(Ljava/lang/String;)V
    .locals 1

    const-string v0, "comment"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onComment(Ljava/lang/String;)V

    return-void
.end method

.method public onCommentEnd()V
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCommentEnd()V

    return-void
.end method

.method public onEnd()V
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onEnd()V

    return-void
.end method

.method public onError(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

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

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1, p2, p3}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onOpenTag(Ljava/lang/String;Ljava/util/Map;Z)V

    return-void
.end method

.method public onOpenTagName(Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onOpenTagName(Ljava/lang/String;)V

    return-void
.end method

.method public onParserInit(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;)V
    .locals 1

    const-string v0, "ksoupHtmlParser"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onParserInit(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;)V

    return-void
.end method

.method public onProcessingInstruction(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onProcessingInstruction(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onReset()V
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onReset()V

    return-void
.end method

.method public onText(Ljava/lang/String;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;->$$delegate_0:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onText(Ljava/lang/String;)V

    return-void
.end method
