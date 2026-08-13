.class final LC9/p$e$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC9/p$e;->m(LA/g;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LC9/v;

.field final synthetic I:Lx/a;

.field final synthetic J:LV/q0;

.field final synthetic K:LV/w0;

.field final synthetic L:LV/G1;

.field final synthetic M:LV/w0;


# direct methods
.method constructor <init>(LC9/v;Lx/a;LV/q0;LV/w0;LV/G1;LV/w0;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LC9/p$e$b;->H:LC9/v;

    iput-object p3, p0, LC9/p$e$b;->J:LV/q0;

    iput-object p4, p0, LC9/p$e$b;->K:LV/w0;

    iput-object p5, p0, LC9/p$e$b;->L:LV/G1;

    iput-object p6, p0, LC9/p$e$b;->M:LV/w0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LC9/p$e$b;->G:I

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    const/4 v0, 0x2

    if-eq v1, v0, :cond_1

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LC9/p$e$b;->J:LV/q0;

    invoke-static {p1}, LC9/p;->v(LV/q0;)F

    move-result p1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v1

    if-nez p1, :cond_5

    iget-object p1, p0, LC9/p$e$b;->K:LV/w0;

    invoke-static {p1}, LC9/p$e;->k(LV/w0;)Lu/g0;

    move-result-object v7

    iget-object p1, p0, LC9/p$e$b;->L:LV/G1;

    invoke-static {p1}, LC9/p;->B(LV/G1;)LC9/g;

    move-result-object v8

    invoke-static {v8}, Ly7/t;->c(Ljava/lang/Object;)V

    iput v5, p0, LC9/p$e$b;->G:I

    const/4 v9, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v7 .. v12}, Lu/g0;->B(Lu/g0;Ljava/lang/Object;Lu/I;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    iget-object p1, p0, LC9/p$e$b;->M:LV/w0;

    invoke-static {p1, v2}, LC9/p;->y(LV/w0;Z)V

    iget-object p1, p0, LC9/p$e$b;->H:LC9/v;

    invoke-virtual {p1}, LC9/v;->c()V

    goto :goto_2

    :cond_5
    iget-object p1, p0, LC9/p$e$b;->J:LV/q0;

    invoke-static {p1}, LC9/p;->v(LV/q0;)F

    move-result p1

    cmpl-float p1, p1, v6

    if-ltz p1, :cond_6

    iget-object p1, p0, LC9/p$e$b;->K:LV/w0;

    invoke-static {p1}, LC9/p$e;->k(LV/w0;)Lu/g0;

    move-result-object p1

    iget-object v1, p0, LC9/p$e$b;->J:LV/q0;

    invoke-static {v1}, LC9/p;->v(LV/q0;)F

    move-result v1

    iget-object v2, p0, LC9/p$e$b;->L:LV/G1;

    invoke-static {v2}, LC9/p;->B(LV/G1;)LC9/g;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iput v4, p0, LC9/p$e$b;->G:I

    invoke-virtual {p1, v1, v2, p0}, Lu/g0;->O(FLjava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_6
    iget-object p1, p0, LC9/p$e$b;->J:LV/q0;

    invoke-static {p1}, LC9/p;->v(LV/q0;)F

    move-result p1

    const/high16 v1, -0x40800000    # -1.0f

    cmpg-float p1, p1, v1

    if-nez p1, :cond_8

    iget-object p1, p0, LC9/p$e$b;->K:LV/w0;

    invoke-static {p1}, LC9/p$e;->k(LV/w0;)Lu/g0;

    move-result-object p1

    iget-object v1, p0, LC9/p$e$b;->L:LV/G1;

    invoke-static {v1}, LC9/p;->B(LV/G1;)LC9/g;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    iput v3, p0, LC9/p$e$b;->G:I

    invoke-virtual {p1, v6, v1, p0}, Lu/g0;->O(FLjava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_1
    iget-object p1, p0, LC9/p$e$b;->M:LV/w0;

    invoke-static {p1, v2}, LC9/p;->y(LV/w0;Z)V

    :goto_2
    iget-object p1, p0, LC9/p$e$b;->J:LV/q0;

    invoke-static {p1, v6}, LC9/p;->w(LV/q0;F)V

    :cond_8
    :goto_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LC9/p$e$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LC9/p$e$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LC9/p$e$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LC9/p$e$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 8

    new-instance p1, LC9/p$e$b;

    iget-object v1, p0, LC9/p$e$b;->H:LC9/v;

    iget-object v2, p0, LC9/p$e$b;->I:Lx/a;

    iget-object v3, p0, LC9/p$e$b;->J:LV/q0;

    iget-object v4, p0, LC9/p$e$b;->K:LV/w0;

    iget-object v5, p0, LC9/p$e$b;->L:LV/G1;

    iget-object v6, p0, LC9/p$e$b;->M:LV/w0;

    move-object v0, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, LC9/p$e$b;-><init>(LC9/v;Lx/a;LV/q0;LV/w0;LV/G1;LV/w0;Lm7/e;)V

    return-object p1
.end method
