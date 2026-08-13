.class public final LZ8/p$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/p;->e(LZ8/f;Lx7/p;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:Lx7/p;

.field final synthetic D:LZ8/f;


# direct methods
.method public constructor <init>(Lx7/p;LZ8/f;)V
    .locals 0

    iput-object p1, p0, LZ8/p$c;->C:Lx7/p;

    iput-object p2, p0, LZ8/p$c;->D:LZ8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p2, LZ8/p$c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/p$c$a;

    iget v1, v0, LZ8/p$c$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/p$c$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/p$c$a;

    invoke-direct {v0, p0, p2}, LZ8/p$c$a;-><init>(LZ8/p$c;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/p$c$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/p$c$a;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LZ8/p$c$a;->K:Ljava/lang/Object;

    check-cast p1, La9/v;

    iget-object v2, v0, LZ8/p$c$a;->J:Ljava/lang/Object;

    check-cast v2, LZ8/g;

    iget-object v4, v0, LZ8/p$c$a;->I:Ljava/lang/Object;

    check-cast v4, LZ8/p$c;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance p2, La9/v;

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v2

    invoke-direct {p2, p1, v2}, La9/v;-><init>(LZ8/g;Lm7/i;)V

    :try_start_1
    iget-object v2, p0, LZ8/p$c;->C:Lx7/p;

    iput-object p0, v0, LZ8/p$c$a;->I:Ljava/lang/Object;

    iput-object p1, v0, LZ8/p$c$a;->J:Ljava/lang/Object;

    iput-object p2, v0, LZ8/p$c$a;->K:Ljava/lang/Object;

    iput v4, v0, LZ8/p$c$a;->G:I

    const/4 v4, 0x6

    invoke-static {v4}, Ly7/r;->a(I)V

    invoke-interface {v2, p2, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x7

    invoke-static {v4}, Ly7/r;->a(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v4, p0

    move-object v2, p1

    move-object p1, p2

    :goto_1
    invoke-virtual {p1}, La9/v;->D()V

    iget-object p1, v4, LZ8/p$c;->D:LZ8/f;

    const/4 p2, 0x0

    iput-object p2, v0, LZ8/p$c$a;->I:Ljava/lang/Object;

    iput-object p2, v0, LZ8/p$c$a;->J:Ljava/lang/Object;

    iput-object p2, v0, LZ8/p$c$a;->K:Ljava/lang/Object;

    iput v3, v0, LZ8/p$c$a;->G:I

    invoke-interface {p1, v2, v0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v5, p2

    move-object p2, p1

    move-object p1, v5

    :goto_3
    invoke-virtual {p1}, La9/v;->D()V

    throw p2
.end method
