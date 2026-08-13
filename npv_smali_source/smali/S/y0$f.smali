.class final LS/y0$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/y0;->l(Landroidx/compose/ui/d;Lx7/a;LA/B;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS/y0$f$a;
    }
.end annotation


# instance fields
.field final synthetic D:Lx7/a;

.field final synthetic E:LA/B;


# direct methods
.method constructor <init>(Lx7/a;LA/B;)V
    .locals 0

    iput-object p1, p0, LS/y0$f;->D:Lx7/a;

    iput-object p2, p0, LS/y0$f;->E:LA/B;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/c;)V
    .locals 17

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, LS/y0$f;->D:Lx7/a;

    invoke-interface {v2}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/m;

    invoke-virtual {v2}, Ln0/m;->m()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->i(J)F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v6, v4, v5

    if-lez v6, :cond_2

    invoke-static {}, LS/y0;->f()F

    move-result v6

    invoke-interface {v0, v6}, LY0/e;->B0(F)F

    move-result v6

    iget-object v7, v1, LS/y0$f;->E:LA/B;

    invoke-interface/range {p1 .. p1}, Lq0/g;->getLayoutDirection()LY0/v;

    move-result-object v8

    invoke-interface {v7, v8}, LA/B;->a(LY0/v;)F

    move-result v7

    invoke-interface {v0, v7}, LY0/e;->B0(F)F

    move-result v7

    sub-float/2addr v7, v6

    add-float/2addr v4, v7

    const/4 v8, 0x2

    int-to-float v8, v8

    mul-float/2addr v6, v8

    add-float/2addr v4, v6

    invoke-interface/range {p1 .. p1}, Lq0/g;->getLayoutDirection()LY0/v;

    move-result-object v6

    sget-object v9, LS/y0$f$a;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v9, v6

    const/4 v10, 0x1

    if-ne v6, v10, :cond_0

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v11

    invoke-static {v11, v12}, Ln0/m;->i(J)F

    move-result v6

    sub-float/2addr v6, v4

    :goto_0
    move v12, v6

    goto :goto_1

    :cond_0
    invoke-static {v7, v5}, LE7/j;->c(FF)F

    move-result v6

    goto :goto_0

    :goto_1
    invoke-interface/range {p1 .. p1}, Lq0/g;->getLayoutDirection()LY0/v;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v9, v6

    if-ne v6, v10, :cond_1

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v9

    invoke-static {v9, v10}, Ln0/m;->i(J)F

    move-result v4

    invoke-static {v7, v5}, LE7/j;->c(FF)F

    move-result v5

    sub-float/2addr v4, v5

    :cond_1
    move v14, v4

    invoke-static {v2, v3}, Ln0/m;->g(J)F

    move-result v2

    neg-float v3, v2

    div-float v13, v3, v8

    div-float v15, v2, v8

    sget-object v2, Lo0/x0;->a:Lo0/x0$a;

    invoke-virtual {v2}, Lo0/x0$a;->a()I

    move-result v16

    invoke-interface/range {p1 .. p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v2

    invoke-interface {v2}, Lq0/d;->i()J

    move-result-wide v3

    invoke-interface {v2}, Lq0/d;->h()Lo0/q0;

    move-result-object v5

    invoke-interface {v5}, Lo0/q0;->m()V

    :try_start_0
    invoke-interface {v2}, Lq0/d;->c()Lq0/j;

    move-result-object v11

    invoke-interface/range {v11 .. v16}, Lq0/j;->c(FFFFI)V

    invoke-interface/range {p1 .. p1}, Lq0/c;->l1()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-interface {v0}, Lo0/q0;->s()V

    invoke-interface {v2, v3, v4}, Lq0/d;->d(J)V

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-interface {v2}, Lq0/d;->h()Lo0/q0;

    move-result-object v5

    invoke-interface {v5}, Lo0/q0;->s()V

    invoke-interface {v2, v3, v4}, Lq0/d;->d(J)V

    throw v0

    :cond_2
    invoke-interface/range {p1 .. p1}, Lq0/c;->l1()V

    :goto_2
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/c;

    invoke-virtual {p0, p1}, LS/y0$f;->a(Lq0/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
