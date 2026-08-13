.class final Lz/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/l;


# instance fields
.field private final a:LZ8/x;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LY8/d;->D:LY8/d;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v4, 0x10

    invoke-static {v3, v4, v0, v1, v2}, LZ8/E;->b(IILY8/d;ILjava/lang/Object;)LZ8/x;

    move-result-object v0

    iput-object v0, p0, Lz/m;->a:LZ8/x;

    return-void
.end method


# virtual methods
.method public a(Lz/i;)Z
    .locals 1

    invoke-virtual {p0}, Lz/m;->d()LZ8/x;

    move-result-object v0

    invoke-interface {v0, p1}, LZ8/x;->n(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b()LZ8/f;
    .locals 1

    invoke-virtual {p0}, Lz/m;->d()LZ8/x;

    move-result-object v0

    return-object v0
.end method

.method public c(Lz/i;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-virtual {p0}, Lz/m;->d()LZ8/x;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LZ8/x;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public d()LZ8/x;
    .locals 1

    iget-object v0, p0, Lz/m;->a:LZ8/x;

    return-object v0
.end method
