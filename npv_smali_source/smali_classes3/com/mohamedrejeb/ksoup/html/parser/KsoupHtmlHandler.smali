.class public interface abstract Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Builder;,
        Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Default;,
        Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0ba9"
    }
    d2 = {
        "\u0baa",
        "",
        "\u0bab",
        "\u0bac",
        "\u0bad",
        "\u0bae",
        "\u0baf",
        "\u0bb0",
        "\u0bb1",
        "\u0bb2",
        "\u0bb3",
        "\u0bb4",
        "\u0bb5",
        "\u0bb6",
        "\u0bb7",
        "",
        "\u0bb8",
        "",
        "\u0bb9",
        "\u0bba",
        "\u0bbb",
        "\u0bbc",
        "\u0bbd",
        "\u0bbe",
        "\u0bbf",
        "\u0bc0",
        "\u0bc1",
        "",
        "\u0bc2",
        "\u0bc3",
        "\u0bc4",
        "\u0bc5",
        "\u0bc6",
        "\u0bc7",
        "\u0bc8",
        "\u0bc9",
        "\u0bca",
        "\u0bcb",
        "\u0bcc",
        "\u0bcd",
        "\u0bce",
        "\u0bcf",
        "\u0bd0",
        "\u0bd1"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation


# virtual methods
.method public abstract onAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onCDataEnd()V
.end method

.method public abstract onCDataStart()V
.end method

.method public abstract onCloseTag(Ljava/lang/String;Z)V
.end method

.method public abstract onComment(Ljava/lang/String;)V
.end method

.method public abstract onCommentEnd()V
.end method

.method public abstract onEnd()V
.end method

.method public abstract onError(Ljava/lang/Exception;)V
.end method

.method public abstract onOpenTag(Ljava/lang/String;Ljava/util/Map;Z)V
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
.end method

.method public abstract onOpenTagName(Ljava/lang/String;)V
.end method

.method public abstract onParserInit(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;)V
.end method

.method public abstract onProcessingInstruction(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onReset()V
.end method

.method public abstract onText(Ljava/lang/String;)V
.end method
