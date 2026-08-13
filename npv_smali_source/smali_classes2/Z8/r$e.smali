.class public final LZ8/r$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/r;->c(LZ8/f;Lx7/p;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LZ8/f;

.field final synthetic D:Lx7/p;


# direct methods
.method public constructor <init>(LZ8/f;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LZ8/r$e;->C:LZ8/f;

    iput-object p2, p0, LZ8/r$e;->D:Lx7/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, LZ8/r$e$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/r$e$a;

    iget v1, v0, LZ8/r$e$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/r$e$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/r$e$a;

    invoke-direct {v0, p0, p2}, LZ8/r$e$a;-><init>(LZ8/r$e;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/r$e$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/r$e$a;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LZ8/r$e$a;->I:Ljava/lang/Object;

    check-cast p1, LZ8/r$f;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch La9/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LZ8/r$e;->C:LZ8/f;

    new-instance v2, LZ8/r$f;

    iget-object v4, p0, LZ8/r$e;->D:Lx7/p;

    invoke-direct {v2, v4, p1}, LZ8/r$f;-><init>(Lx7/p;LZ8/g;)V

    :try_start_1
    iput-object v2, v0, LZ8/r$e$a;->I:Ljava/lang/Object;

    iput v3, v0, LZ8/r$e$a;->G:I

    invoke-interface {p2, v2, v0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch La9/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_3

    return-object v1

    :catch_1
    move-exception p2

    move-object p1, v2

    :goto_1
    invoke-static {p2, p1}, La9/p;->a(La9/a;Ljava/lang/Object;)V

    :cond_3
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
