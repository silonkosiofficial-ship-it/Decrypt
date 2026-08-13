.class final Lu/a$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/a;->p(Lu/e;Ljava/lang/Object;Lx7/l;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field final synthetic J:Lu/a;

.field final synthetic K:Ljava/lang/Object;

.field final synthetic L:Lu/e;

.field final synthetic M:J

.field final synthetic N:Lx7/l;


# direct methods
.method constructor <init>(Lu/a;Ljava/lang/Object;Lu/e;JLx7/l;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lu/a$a;->J:Lu/a;

    iput-object p2, p0, Lu/a$a;->K:Ljava/lang/Object;

    iput-object p3, p0, Lu/a$a;->L:Lu/e;

    iput-wide p4, p0, Lu/a$a;->M:J

    iput-object p6, p0, Lu/a$a;->N:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p7}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .prologue
    move-object/from16 v7, p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, v7, Lu/a$a;->I:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, v7, Lu/a$a;->H:Ljava/lang/Object;

    check-cast v0, Ly7/K;

    iget-object v1, v7, Lu/a$a;->G:Ljava/lang/Object;

    check-cast v1, Lu/l;

    :try_start_0
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object v1, v7, Lu/a$a;->J:Lu/a;

    invoke-virtual {v1}, Lu/a;->j()Lu/l;

    move-result-object v1

    iget-object v3, v7, Lu/a$a;->J:Lu/a;

    invoke-virtual {v3}, Lu/a;->l()Lu/x0;

    move-result-object v3

    invoke-interface {v3}, Lu/x0;->a()Lx7/l;

    move-result-object v3

    iget-object v4, v7, Lu/a$a;->K:Ljava/lang/Object;

    invoke-interface {v3, v4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu/r;

    invoke-virtual {v1, v3}, Lu/l;->w(Lu/r;)V

    iget-object v1, v7, Lu/a$a;->J:Lu/a;

    iget-object v3, v7, Lu/a$a;->L:Lu/e;

    invoke-interface {v3}, Lu/e;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Lu/a;->d(Lu/a;Ljava/lang/Object;)V

    iget-object v1, v7, Lu/a$a;->J:Lu/a;

    invoke-static {v1, v2}, Lu/a;->c(Lu/a;Z)V

    iget-object v1, v7, Lu/a$a;->J:Lu/a;

    invoke-virtual {v1}, Lu/a;->j()Lu/l;

    move-result-object v8

    const/16 v16, 0x17

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/high16 v13, -0x8000000000000000L

    const/4 v15, 0x0

    invoke-static/range {v8 .. v17}, Lu/m;->h(Lu/l;Ljava/lang/Object;Lu/r;JJZILjava/lang/Object;)Lu/l;

    move-result-object v8

    new-instance v9, Ly7/K;

    invoke-direct {v9}, Ly7/K;-><init>()V

    iget-object v3, v7, Lu/a$a;->L:Lu/e;

    iget-wide v4, v7, Lu/a$a;->M:J

    new-instance v6, Lu/a$a$a;

    iget-object v1, v7, Lu/a$a;->J:Lu/a;

    iget-object v10, v7, Lu/a$a;->N:Lx7/l;

    invoke-direct {v6, v1, v8, v10, v9}, Lu/a$a$a;-><init>(Lu/a;Lu/l;Lx7/l;Ly7/K;)V

    iput-object v8, v7, Lu/a$a;->G:Ljava/lang/Object;

    iput-object v9, v7, Lu/a$a;->H:Ljava/lang/Object;

    iput v2, v7, Lu/a$a;->I:I

    move-object v1, v8

    move-object v2, v3

    move-wide v3, v4

    move-object v5, v6

    move-object/from16 v6, p0

    invoke-static/range {v1 .. v6}, Lu/q0;->c(Lu/l;Lu/e;JLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v1, v8

    move-object v0, v9

    :goto_0
    iget-boolean v0, v0, Ly7/K;->C:Z

    if-eqz v0, :cond_3

    sget-object v0, Lu/f;->C:Lu/f;

    goto :goto_1

    :cond_3
    sget-object v0, Lu/f;->D:Lu/f;

    :goto_1
    iget-object v2, v7, Lu/a$a;->J:Lu/a;

    invoke-static {v2}, Lu/a;->b(Lu/a;)V

    new-instance v2, Lu/h;

    invoke-direct {v2, v1, v0}, Lu/h;-><init>(Lu/l;Lu/f;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v2

    :goto_2
    iget-object v1, v7, Lu/a$a;->J:Lu/a;

    invoke-static {v1}, Lu/a;->b(Lu/a;)V

    throw v0
.end method

.method public final H(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lu/a$a;->y(Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lu/a$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p1, v0}, Lu/a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm7/e;

    invoke-virtual {p0, p1}, Lu/a$a;->H(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lm7/e;)Lm7/e;
    .locals 9

    new-instance v8, Lu/a$a;

    iget-object v1, p0, Lu/a$a;->J:Lu/a;

    iget-object v2, p0, Lu/a$a;->K:Ljava/lang/Object;

    iget-object v3, p0, Lu/a$a;->L:Lu/e;

    iget-wide v4, p0, Lu/a$a;->M:J

    iget-object v6, p0, Lu/a$a;->N:Lx7/l;

    move-object v0, v8

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lu/a$a;-><init>(Lu/a;Ljava/lang/Object;Lu/e;JLx7/l;Lm7/e;)V

    return-object v8
.end method
