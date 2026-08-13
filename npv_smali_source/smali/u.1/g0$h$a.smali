.class final Lu/g0$h$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/g0$h;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Ljava/lang/Object;

.field final synthetic J:Ljava/lang/Object;

.field final synthetic K:Lu/g0;

.field final synthetic L:Lu/s0;

.field final synthetic M:F


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lu/g0;Lu/s0;FLm7/e;)V
    .locals 0

    iput-object p1, p0, Lu/g0$h$a;->I:Ljava/lang/Object;

    iput-object p2, p0, Lu/g0$h$a;->J:Ljava/lang/Object;

    iput-object p3, p0, Lu/g0$h$a;->K:Lu/g0;

    iput-object p4, p0, Lu/g0$h$a;->L:Lu/s0;

    iput p5, p0, Lu/g0$h$a;->M:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu/g0$h$a;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lu/g0$h$a;->H:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, LW8/N;

    iget-object p1, p0, Lu/g0$h$a;->I:Ljava/lang/Object;

    iget-object v1, p0, Lu/g0$h$a;->J:Ljava/lang/Object;

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_2

    iget-object p1, p0, Lu/g0$h$a;->K:Lu/g0;

    invoke-static {p1}, Lu/g0;->q(Lu/g0;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lu/g0$h$a;->K:Lu/g0;

    invoke-static {p1, v1}, Lu/g0;->u(Lu/g0;Lu/g0$b;)V

    iget-object p1, p0, Lu/g0$h$a;->K:Lu/g0;

    invoke-virtual {p1}, Lu/g0;->a()Ljava/lang/Object;

    move-result-object p1

    iget-object v4, p0, Lu/g0$h$a;->I:Ljava/lang/Object;

    invoke-static {p1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_3
    :goto_0
    iget-object p1, p0, Lu/g0$h$a;->I:Ljava/lang/Object;

    iget-object v4, p0, Lu/g0$h$a;->J:Ljava/lang/Object;

    invoke-static {p1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lu/g0$h$a;->L:Lu/s0;

    iget-object v4, p0, Lu/g0$h$a;->I:Ljava/lang/Object;

    invoke-virtual {p1, v4}, Lu/s0;->R(Ljava/lang/Object;)V

    iget-object p1, p0, Lu/g0$h$a;->L:Lu/s0;

    const-wide/16 v4, 0x0

    invoke-virtual {p1, v4, v5}, Lu/s0;->J(J)V

    iget-object p1, p0, Lu/g0$h$a;->K:Lu/g0;

    iget-object v4, p0, Lu/g0$h$a;->I:Ljava/lang/Object;

    invoke-virtual {p1, v4}, Lu/g0;->T(Ljava/lang/Object;)V

    iget-object p1, p0, Lu/g0$h$a;->L:Lu/s0;

    iget v4, p0, Lu/g0$h$a;->M:F

    invoke-virtual {p1, v4}, Lu/s0;->E(F)V

    :cond_4
    iget-object p1, p0, Lu/g0$h$a;->K:Lu/g0;

    iget v4, p0, Lu/g0$h$a;->M:F

    invoke-static {p1, v4}, Lu/g0;->v(Lu/g0;F)V

    iget-object p1, p0, Lu/g0$h$a;->K:Lu/g0;

    invoke-static {p1}, Lu/g0;->l(Lu/g0;)Lr/I;

    move-result-object p1

    invoke-virtual {p1}, Lr/P;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance v6, Lu/g0$h$a$a;

    iget-object p1, p0, Lu/g0$h$a;->K:Lu/g0;

    invoke-direct {v6, p1, v1}, Lu/g0$h$a$a;-><init>(Lu/g0;Lm7/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lu/g0$h$a;->K:Lu/g0;

    const-wide/high16 v3, -0x8000000000000000L

    invoke-static {p1, v3, v4}, Lu/g0;->w(Lu/g0;J)V

    :goto_1
    iget-object p1, p0, Lu/g0$h$a;->K:Lu/g0;

    iput v2, p0, Lu/g0$h$a;->G:I

    invoke-static {p1, p0}, Lu/g0;->y(Lu/g0;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_2
    iget-object p1, p0, Lu/g0$h$a;->K:Lu/g0;

    invoke-static {p1}, Lu/g0;->t(Lu/g0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu/g0$h$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lu/g0$h$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lu/g0$h$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lu/g0$h$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 8

    new-instance v7, Lu/g0$h$a;

    iget-object v1, p0, Lu/g0$h$a;->I:Ljava/lang/Object;

    iget-object v2, p0, Lu/g0$h$a;->J:Ljava/lang/Object;

    iget-object v3, p0, Lu/g0$h$a;->K:Lu/g0;

    iget-object v4, p0, Lu/g0$h$a;->L:Lu/s0;

    iget v5, p0, Lu/g0$h$a;->M:F

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lu/g0$h$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lu/g0;Lu/s0;FLm7/e;)V

    iput-object p1, v7, Lu/g0$h$a;->H:Ljava/lang/Object;

    return-object v7
.end method
