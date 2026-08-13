.class final LS5/k$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS5/k;-><init>(LQ4/f;LU5/f;Lm7/i;LS5/F;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LS5/k;

.field final synthetic I:Lm7/i;

.field final synthetic J:LS5/F;


# direct methods
.method constructor <init>(LS5/k;Lm7/i;LS5/F;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS5/k$a;->H:LS5/k;

    iput-object p2, p0, LS5/k$a;->I:Lm7/i;

    iput-object p3, p0, LS5/k$a;->J:LS5/F;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LS5/k$a;->G:I

    const-string v2, "FirebaseSessions"

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    sget-object p1, LT5/a;->a:LT5/a;

    iput v4, p0, LS5/k$a;->G:I

    invoke-virtual {p1, p0}, LT5/a;->c(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_4

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT5/b;

    invoke-interface {v1}, LT5/b;->a()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object p1, p0, LS5/k$a;->H:LS5/k;

    invoke-static {p1}, LS5/k;->b(LS5/k;)LU5/f;

    move-result-object p1

    iput v3, p0, LS5/k$a;->G:I

    invoke-virtual {p1, p0}, LU5/f;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_1
    iget-object p1, p0, LS5/k$a;->H:LS5/k;

    invoke-static {p1}, LS5/k;->b(LS5/k;)LU5/f;

    move-result-object p1

    invoke-virtual {p1}, LU5/f;->d()Z

    move-result p1

    if-nez p1, :cond_7

    const-string p1, "Sessions SDK disabled. Not listening to lifecycle events."

    :goto_2
    nop

    goto :goto_4

    :cond_7
    new-instance p1, LS5/D;

    iget-object v0, p0, LS5/k$a;->I:Lm7/i;

    invoke-direct {p1, v0}, LS5/D;-><init>(Lm7/i;)V

    iget-object v0, p0, LS5/k$a;->J:LS5/F;

    invoke-virtual {p1, v0}, LS5/D;->i(LS5/F;)V

    sget-object v0, LS5/H;->C:LS5/H;

    invoke-virtual {v0, p1}, LS5/H;->a(LS5/D;)V

    iget-object p1, p0, LS5/k$a;->H:LS5/k;

    invoke-static {p1}, LS5/k;->a(LS5/k;)LQ4/f;

    move-result-object p1

    new-instance v0, LS5/j;

    invoke-direct {v0}, LS5/j;-><init>()V

    invoke-virtual {p1, v0}, LQ4/f;->h(LQ4/g;)V

    goto :goto_4

    :cond_8
    :goto_3
    const-string p1, "No Sessions subscribers. Not listening to lifecycle events."

    goto :goto_2

    :goto_4
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS5/k$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS5/k$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS5/k$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS5/k$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, LS5/k$a;

    iget-object v0, p0, LS5/k$a;->H:LS5/k;

    iget-object v1, p0, LS5/k$a;->I:Lm7/i;

    iget-object v2, p0, LS5/k$a;->J:LS5/F;

    invoke-direct {p1, v0, v1, v2, p2}, LS5/k$a;-><init>(LS5/k;Lm7/i;LS5/F;Lm7/e;)V

    return-object p1
.end method
