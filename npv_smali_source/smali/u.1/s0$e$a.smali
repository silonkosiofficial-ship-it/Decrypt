.class final Lu/s0$e$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/s0$e;->a(LV/N;)LV/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:F

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:Lu/s0;


# direct methods
.method constructor <init>(Lu/s0;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lu/s0$e$a;->J:Lu/s0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu/s0$e$a;->H:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget v1, p0, Lu/s0$e$a;->G:F

    iget-object v3, p0, Lu/s0$e$a;->I:Ljava/lang/Object;

    check-cast v3, LW8/N;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lu/s0$e$a;->I:Ljava/lang/Object;

    check-cast p1, LW8/N;

    invoke-interface {p1}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v1

    invoke-static {v1}, Lu/q0;->n(Lm7/i;)F

    move-result v1

    move-object v3, p1

    :cond_2
    :goto_0
    invoke-static {v3}, LW8/O;->h(LW8/N;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lu/s0$e$a$a;

    iget-object v4, p0, Lu/s0$e$a;->J:Lu/s0;

    invoke-direct {p1, v4, v1}, Lu/s0$e$a$a;-><init>(Lu/s0;F)V

    iput-object v3, p0, Lu/s0$e$a;->I:Ljava/lang/Object;

    iput v1, p0, Lu/s0$e$a;->G:F

    iput v2, p0, Lu/s0$e$a;->H:I

    invoke-static {p1, p0}, LV/l0;->c(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu/s0$e$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lu/s0$e$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lu/s0$e$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lu/s0$e$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Lu/s0$e$a;

    iget-object v1, p0, Lu/s0$e$a;->J:Lu/s0;

    invoke-direct {v0, v1, p2}, Lu/s0$e$a;-><init>(Lu/s0;Lm7/e;)V

    iput-object p1, v0, Lu/s0$e$a;->I:Ljava/lang/Object;

    return-object v0
.end method
