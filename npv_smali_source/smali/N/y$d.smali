.class final LN/y$d;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/y;->f(Lx7/a;LV/n;I)LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LV/G1;

.field final synthetic J:Lu/a;


# direct methods
.method constructor <init>(LV/G1;Lu/a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LN/y$d;->I:LV/G1;

    iput-object p2, p0, LN/y$d;->J:Lu/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LN/y$d;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LN/y$d;->H:Ljava/lang/Object;

    check-cast p1, LW8/N;

    new-instance v1, LN/y$d$a;

    iget-object v3, p0, LN/y$d;->I:LV/G1;

    invoke-direct {v1, v3}, LN/y$d$a;-><init>(LV/G1;)V

    invoke-static {v1}, LV/v1;->o(Lx7/a;)LZ8/f;

    move-result-object v1

    new-instance v3, LN/y$d$b;

    iget-object v4, p0, LN/y$d;->J:Lu/a;

    invoke-direct {v3, v4, p1}, LN/y$d$b;-><init>(Lu/a;LW8/N;)V

    iput v2, p0, LN/y$d;->G:I

    invoke-interface {v1, v3, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN/y$d;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LN/y$d;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LN/y$d;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LN/y$d;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, LN/y$d;

    iget-object v1, p0, LN/y$d;->I:LV/G1;

    iget-object v2, p0, LN/y$d;->J:Lu/a;

    invoke-direct {v0, v1, v2, p2}, LN/y$d;-><init>(LV/G1;Lu/a;Lm7/e;)V

    iput-object p1, v0, LN/y$d;->H:Ljava/lang/Object;

    return-object v0
.end method
