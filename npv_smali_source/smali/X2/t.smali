.class public abstract LX2/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX2/t$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()LX2/t$a;
    .locals 1

    new-instance v0, LX2/j$b;

    invoke-direct {v0}, LX2/j$b;-><init>()V

    return-object v0
.end method

.method public static k(Ljava/lang/String;)LX2/t$a;
    .locals 1

    invoke-static {}, LX2/t;->a()LX2/t$a;

    move-result-object v0

    invoke-virtual {v0, p0}, LX2/t$a;->i(Ljava/lang/String;)LX2/t$a;

    move-result-object p0

    return-object p0
.end method

.method public static l([B)LX2/t$a;
    .locals 1

    invoke-static {}, LX2/t;->a()LX2/t$a;

    move-result-object v0

    invoke-virtual {v0, p0}, LX2/t$a;->h([B)LX2/t$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()LX2/p;
.end method

.method public abstract c()Ljava/lang/Integer;
.end method

.method public abstract d()J
.end method

.method public abstract e()J
.end method

.method public abstract f()LX2/q;
.end method

.method public abstract g()LX2/w;
.end method

.method public abstract h()[B
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public abstract j()J
.end method
