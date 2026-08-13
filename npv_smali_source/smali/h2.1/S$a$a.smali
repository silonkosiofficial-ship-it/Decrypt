.class final Lh2/S$a$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/S$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:LZ8/g;

.field final synthetic K:Lx7/p;


# direct methods
.method constructor <init>(LZ8/g;Lx7/p;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/S$a$a;->J:LZ8/g;

    iput-object p2, p0, Lh2/S$a$a;->K:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/S$a$a;->H:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lh2/S$a$a;->G:Ljava/lang/Object;

    check-cast v1, LY8/l;

    iget-object v5, p0, Lh2/S$a$a;->I:Ljava/lang/Object;

    check-cast v5, LW8/z0;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    :cond_0
    move-object p1, v1

    move-object v1, v5

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, p0, Lh2/S$a$a;->G:Ljava/lang/Object;

    check-cast v1, LY8/l;

    iget-object v5, p0, Lh2/S$a$a;->I:Ljava/lang/Object;

    check-cast v5, LW8/z0;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/S$a$a;->I:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, LW8/N;

    const/4 p1, 0x0

    const/4 v1, 0x6

    invoke-static {p1, v4, v4, v1, v4}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object p1

    new-instance v8, Lh2/S$a$a$a;

    iget-object v1, p0, Lh2/S$a$a;->K:Lx7/p;

    invoke-direct {v8, p1, v1, v4}, Lh2/S$a$a$a;-><init>(LY8/j;Lx7/p;Lm7/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object v1

    invoke-interface {p1}, LY8/B;->iterator()LY8/l;

    move-result-object p1

    :goto_0
    iput-object v1, p0, Lh2/S$a$a;->I:Ljava/lang/Object;

    iput-object p1, p0, Lh2/S$a$a;->G:Ljava/lang/Object;

    iput v3, p0, Lh2/S$a$a;->H:I

    invoke-interface {p1, p0}, LY8/l;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_4

    return-object v0

    :cond_4
    move-object v11, v1

    move-object v1, p1

    move-object p1, v5

    move-object v5, v11

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v1}, LY8/l;->next()Ljava/lang/Object;

    move-result-object p1

    iget-object v6, p0, Lh2/S$a$a;->J:LZ8/g;

    iput-object v5, p0, Lh2/S$a$a;->I:Ljava/lang/Object;

    iput-object v1, p0, Lh2/S$a$a;->G:Ljava/lang/Object;

    iput v2, p0, Lh2/S$a$a;->H:I

    invoke-interface {v6, p1, p0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    return-object v0

    :cond_5
    invoke-static {v5, v4, v3, v4}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/S$a$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/S$a$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/S$a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/S$a$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Lh2/S$a$a;

    iget-object v1, p0, Lh2/S$a$a;->J:LZ8/g;

    iget-object v2, p0, Lh2/S$a$a;->K:Lx7/p;

    invoke-direct {v0, v1, v2, p2}, Lh2/S$a$a;-><init>(LZ8/g;Lx7/p;Lm7/e;)V

    iput-object p1, v0, Lh2/S$a$a;->I:Ljava/lang/Object;

    return-object v0
.end method
