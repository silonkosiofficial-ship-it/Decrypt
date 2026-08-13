.class public final LZ8/p$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/p;->d(LZ8/f;Lx7/q;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LZ8/f;

.field final synthetic D:Lx7/q;


# direct methods
.method public constructor <init>(LZ8/f;Lx7/q;)V
    .locals 0

    iput-object p1, p0, LZ8/p$b;->C:LZ8/f;

    iput-object p2, p0, LZ8/p$b;->D:Lx7/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    instance-of v0, p2, LZ8/p$b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/p$b$a;

    iget v1, v0, LZ8/p$b$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/p$b$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/p$b$a;

    invoke-direct {v0, p0, p2}, LZ8/p$b$a;-><init>(LZ8/p$b;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/p$b$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/p$b$a;->G:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LZ8/p$b$a;->I:Ljava/lang/Object;

    check-cast p1, La9/v;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LZ8/p$b$a;->I:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_5

    :cond_3
    iget-object p1, v0, LZ8/p$b$a;->J:Ljava/lang/Object;

    check-cast p1, LZ8/g;

    iget-object v2, v0, LZ8/p$b$a;->I:Ljava/lang/Object;

    check-cast v2, LZ8/p$b;

    :try_start_1
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_4
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_2
    iget-object p2, p0, LZ8/p$b;->C:LZ8/f;

    iput-object p0, v0, LZ8/p$b$a;->I:Ljava/lang/Object;

    iput-object p1, v0, LZ8/p$b$a;->J:Ljava/lang/Object;

    iput v5, v0, LZ8/p$b$a;->G:I

    invoke-interface {p2, p1, v0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v2, p0

    :goto_1
    new-instance p2, La9/v;

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v4

    invoke-direct {p2, p1, v4}, La9/v;-><init>(LZ8/g;Lm7/i;)V

    :try_start_3
    iget-object p1, v2, LZ8/p$b;->D:Lx7/q;

    iput-object p2, v0, LZ8/p$b$a;->I:Ljava/lang/Object;

    iput-object v6, v0, LZ8/p$b$a;->J:Ljava/lang/Object;

    iput v3, v0, LZ8/p$b$a;->G:I

    const/4 v2, 0x6

    invoke-static {v2}, Ly7/r;->a(I)V

    invoke-interface {p1, p2, v6, v0}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x7

    invoke-static {v0}, Ly7/r;->a(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object p1, p2

    :goto_2
    invoke-virtual {p1}, La9/v;->D()V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_2
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_3
    invoke-virtual {p1}, La9/v;->D()V

    throw p2

    :catchall_3
    move-exception p1

    move-object v2, p0

    :goto_4
    new-instance p2, LZ8/U;

    invoke-direct {p2, p1}, LZ8/U;-><init>(Ljava/lang/Throwable;)V

    iget-object v2, v2, LZ8/p$b;->D:Lx7/q;

    iput-object p1, v0, LZ8/p$b$a;->I:Ljava/lang/Object;

    iput-object v6, v0, LZ8/p$b$a;->J:Ljava/lang/Object;

    iput v4, v0, LZ8/p$b$a;->G:I

    invoke-static {p2, v2, p1, v0}, LZ8/p;->a(LZ8/g;Lx7/q;Ljava/lang/Throwable;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    :goto_5
    throw p1
.end method
