.class public final Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0b84"
    }
    d2 = {
        "\u0b85",
        "",
        "\u0b86",
        "\u0b87",
        "\u0b88",
        "\u0b89",
        "\u0b8a",
        "\u0b8b",
        "\u0b8c",
        "\u0b8d",
        "\u0b8e",
        "\u0b8f",
        "\u0b90",
        "\u0b91",
        "\u0b92",
        "\u0b93",
        "\u0b94",
        "\u0b95",
        "",
        "",
        "\u0b96",
        "\u0b97",
        "\u0b98",
        "\u0b99",
        "\u0b9a",
        "\u0b9b",
        "",
        "\u0b9c",
        "\u0b9d",
        "\u0b9e",
        "\u0b9f",
        "\u0ba0",
        "\u0ba1",
        "\u0ba2",
        "\u0ba3",
        "\u0ba4",
        "\u0ba5",
        "\u0ba6",
        "\u0ba7",
        "\u0ba8"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation


# instance fields
.field private handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Default;->INSTANCE:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Default;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-void
.end method

.method public static final synthetic access$getHandler$p(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;
    .locals 0

    iget-object p0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method


# virtual methods
.method public final build()Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object v0
.end method

.method public final onAttribute(Lx7/q;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/q;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onAttribute$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/q;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method

.method public final onCDataEnd(Lx7/a;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/a;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onCDataEnd$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onCDataEnd$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/a;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method

.method public final onCDataStart(Lx7/a;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/a;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onCDataStart$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onCDataStart$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/a;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method

.method public final onCloseTag(Lx7/p;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/p;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onCloseTag$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onCloseTag$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/p;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method

.method public final onComment(Lx7/l;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onComment$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onComment$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/l;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method

.method public final onCommentEnd(Lx7/a;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/a;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onCommentEnd$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onCommentEnd$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/a;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method

.method public final onEnd(Lx7/a;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/a;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onEnd$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onEnd$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/a;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method

.method public final onError(Lx7/l;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onError$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onError$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/l;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method

.method public final onOpenTag(Lx7/q;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/q;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTag$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTag$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/q;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method

.method public final onOpenTagName(Lx7/l;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onOpenTagName$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/l;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method

.method public final onParserInit(Lx7/l;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onParserInit$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onParserInit$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/l;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method

.method public final onProcessingInstruction(Lx7/p;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/p;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onProcessingInstruction$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onProcessingInstruction$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/p;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method

.method public final onReset(Lx7/a;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/a;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onReset$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onReset$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/a;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method

.method public final onText(Lx7/l;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")",
            "Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onText$1;

    invoke-direct {v0, p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder$onText$1;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;Lx7/l;)V

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object p0
.end method
