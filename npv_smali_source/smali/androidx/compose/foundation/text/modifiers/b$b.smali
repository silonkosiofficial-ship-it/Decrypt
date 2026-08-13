.class final Landroidx/compose/foundation/text/modifiers/b$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/modifiers/b;->M0(LK0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/text/modifiers/b;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text/modifiers/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b$b;->D:Landroidx/compose/foundation/text/modifiers/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/lang/Boolean;
    .locals 37

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/text/modifiers/b$b;->D:Landroidx/compose/foundation/text/modifiers/b;

    invoke-static {v1}, Landroidx/compose/foundation/text/modifiers/b;->T1(Landroidx/compose/foundation/text/modifiers/b;)LM/e;

    move-result-object v1

    invoke-virtual {v1}, LM/e;->b()LM0/K;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v1, LM0/J;

    invoke-virtual {v2}, LM0/K;->l()LM0/J;

    move-result-object v3

    invoke-virtual {v3}, LM0/J;->j()LM0/d;

    move-result-object v4

    iget-object v3, v0, Landroidx/compose/foundation/text/modifiers/b$b;->D:Landroidx/compose/foundation/text/modifiers/b;

    invoke-static {v3}, Landroidx/compose/foundation/text/modifiers/b;->W1(Landroidx/compose/foundation/text/modifiers/b;)LM0/P;

    move-result-object v5

    iget-object v3, v0, Landroidx/compose/foundation/text/modifiers/b$b;->D:Landroidx/compose/foundation/text/modifiers/b;

    invoke-static {v3}, Landroidx/compose/foundation/text/modifiers/b;->V1(Landroidx/compose/foundation/text/modifiers/b;)Lo0/B0;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v3}, Lo0/B0;->a()J

    move-result-wide v6

    goto :goto_0

    :cond_0
    sget-object v3, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v3}, Lo0/y0$a;->g()J

    move-result-wide v6

    :goto_0
    const v35, 0xfffffe

    const/16 v36, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-static/range {v5 .. v36}, LM0/P;->K(LM0/P;JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;Lq0/h;IIJLX0/r;LX0/h;IILM0/A;LX0/t;ILjava/lang/Object;)LM0/P;

    move-result-object v5

    invoke-virtual {v2}, LM0/K;->l()LM0/J;

    move-result-object v3

    invoke-virtual {v3}, LM0/J;->g()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v2}, LM0/K;->l()LM0/J;

    move-result-object v3

    invoke-virtual {v3}, LM0/J;->e()I

    move-result v7

    invoke-virtual {v2}, LM0/K;->l()LM0/J;

    move-result-object v3

    invoke-virtual {v3}, LM0/J;->h()Z

    move-result v8

    invoke-virtual {v2}, LM0/K;->l()LM0/J;

    move-result-object v3

    invoke-virtual {v3}, LM0/J;->f()I

    move-result v9

    invoke-virtual {v2}, LM0/K;->l()LM0/J;

    move-result-object v3

    invoke-virtual {v3}, LM0/J;->b()LY0/e;

    move-result-object v10

    invoke-virtual {v2}, LM0/K;->l()LM0/J;

    move-result-object v3

    invoke-virtual {v3}, LM0/J;->d()LY0/v;

    move-result-object v11

    invoke-virtual {v2}, LM0/K;->l()LM0/J;

    move-result-object v3

    invoke-virtual {v3}, LM0/J;->c()LR0/h$b;

    move-result-object v12

    invoke-virtual {v2}, LM0/K;->l()LM0/J;

    move-result-object v3

    invoke-virtual {v3}, LM0/J;->a()J

    move-result-wide v13

    const/4 v15, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v15}, LM0/J;-><init>(LM0/d;LM0/P;Ljava/util/List;IZILY0/e;LY0/v;LR0/h$b;JLy7/k;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, LM0/K;->b(LM0/K;LM0/J;JILjava/lang/Object;)LM0/K;

    move-result-object v1

    if-eqz v1, :cond_1

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/modifiers/b$b;->a(Ljava/util/List;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
