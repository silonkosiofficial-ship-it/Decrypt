.class final Lu/u0$f;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/u0;->f(Lu/v0;Ljava/lang/String;LV/n;II)Lu/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field final synthetic J:Lu/v0;


# direct methods
.method constructor <init>(Lu/v0;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lu/u0$f;->J:Lu/v0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu/u0$f;->I:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lu/u0$f;->H:Ljava/lang/Object;

    check-cast v0, Lu/v0;

    iget-object v1, p0, Lu/u0$f;->G:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lu/u0$f;->J:Lu/v0;

    check-cast p1, Lu/g0;

    invoke-virtual {p1}, Lu/g0;->K()V

    iget-object p1, p0, Lu/u0$f;->J:Lu/v0;

    check-cast p1, Lu/g0;

    invoke-virtual {p1}, Lu/g0;->G()Lf9/a;

    move-result-object v1

    iget-object p1, p0, Lu/u0$f;->J:Lu/v0;

    iput-object v1, p0, Lu/u0$f;->G:Ljava/lang/Object;

    iput-object p1, p0, Lu/u0$f;->H:Ljava/lang/Object;

    iput v2, p0, Lu/u0$f;->I:I

    invoke-interface {v1, v3, p0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    :goto_0
    :try_start_0
    move-object p1, v0

    check-cast p1, Lu/g0;

    invoke-virtual {v0}, Lu/v0;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Lu/g0;->Q(Ljava/lang/Object;)V

    move-object p1, v0

    check-cast p1, Lu/g0;

    invoke-virtual {p1}, Lu/g0;->F()LW8/l;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object v2, Li7/w;->D:Li7/w$a;

    invoke-virtual {v0}, Lu/v0;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Lm7/e;->t(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_3
    :goto_1
    check-cast v0, Lu/g0;

    invoke-virtual {v0, v3}, Lu/g0;->R(LW8/l;)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_2
    invoke-interface {v1, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu/u0$f;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lu/u0$f;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lu/u0$f;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lu/u0$f;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 1

    new-instance p1, Lu/u0$f;

    iget-object v0, p0, Lu/u0$f;->J:Lu/v0;

    invoke-direct {p1, v0, p2}, Lu/u0$f;-><init>(Lu/v0;Lm7/e;)V

    return-object p1
.end method
