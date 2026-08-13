.class public final Lio/ktor/client/engine/okhttp/OkHttpEngineContainer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC6/k;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u1738"
    }
    d2 = {
        "\u1739",
        "\u173a",
        "\u173b",
        "\u173c",
        "",
        "\u173d",
        "\u173e",
        "\u173f",
        "\u1740",
        "\u1741",
        "\u1742",
        "\u1743",
        "\u1744"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation


# instance fields
.field private final a:LF6/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LG6/a;->a:LG6/a;

    iput-object v0, p0, Lio/ktor/client/engine/okhttp/OkHttpEngineContainer;->a:LF6/k;

    return-void
.end method


# virtual methods
.method public a()LF6/k;
    .locals 1

    iget-object v0, p0, Lio/ktor/client/engine/okhttp/OkHttpEngineContainer;->a:LF6/k;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "OkHttp"

    return-object v0
.end method
