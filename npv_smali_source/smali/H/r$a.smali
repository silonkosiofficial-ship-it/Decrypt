.class public final LH/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/r;->a(Lx7/l;)LH/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx7/l;


# direct methods
.method constructor <init>(Lx7/l;)V
    .locals 0

    iput-object p1, p0, LH/r$a;->a:Lx7/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/KeyEvent;)LH/o;
    .locals 6

    .prologue
    iget-object v0, p0, LH/r$a;->a:Lx7/l;

    invoke-static {p1}, Lx0/b;->a(Landroid/view/KeyEvent;)Lx0/b;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lx0/d;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object p1, LH/y;->a:LH/y;

    invoke-virtual {p1}, LH/y;->x()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_20

    :goto_0
    sget-object v1, LH/o;->x0:LH/o;

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, LH/r$a;->a:Lx7/l;

    invoke-static {p1}, Lx0/b;->a(Landroid/view/KeyEvent;)Lx0/b;

    move-result-object v2

    invoke-interface {v0, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object p1, LH/y;->a:LH/y;

    invoke-virtual {p1}, LH/y;->d()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LH/y;->n()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    :goto_1
    if-eqz v0, :cond_2

    :goto_2
    sget-object v1, LH/o;->T:LH/o;

    goto/16 :goto_5

    :cond_2
    invoke-virtual {p1}, LH/y;->u()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_3
    sget-object v1, LH/o;->U:LH/o;

    goto/16 :goto_5

    :cond_3
    invoke-virtual {p1}, LH/y;->v()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_4
    sget-object v1, LH/o;->V:LH/o;

    goto/16 :goto_5

    :cond_4
    invoke-virtual {p1}, LH/y;->a()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v1, LH/o;->c0:LH/o;

    goto/16 :goto_5

    :cond_5
    invoke-virtual {p1}, LH/y;->w()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, LH/y;->x()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_20

    sget-object v1, LH/o;->w0:LH/o;

    goto/16 :goto_5

    :cond_7
    invoke-static {p1}, Lx0/d;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto/16 :goto_5

    :cond_8
    invoke-static {p1}, Lx0/d;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object p1, LH/y;->a:LH/y;

    invoke-virtual {p1}, LH/y;->i()J

    move-result-wide v4

    if-eqz v0, :cond_11

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v1, LH/o;->d0:LH/o;

    goto/16 :goto_5

    :cond_9
    invoke-virtual {p1}, LH/y;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v1, LH/o;->e0:LH/o;

    goto/16 :goto_5

    :cond_a
    invoke-virtual {p1}, LH/y;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v1, LH/o;->f0:LH/o;

    goto/16 :goto_5

    :cond_b
    invoke-virtual {p1}, LH/y;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object v1, LH/o;->g0:LH/o;

    goto/16 :goto_5

    :cond_c
    invoke-virtual {p1}, LH/y;->r()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object v1, LH/o;->h0:LH/o;

    goto/16 :goto_5

    :cond_d
    invoke-virtual {p1}, LH/y;->q()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object v1, LH/o;->i0:LH/o;

    goto/16 :goto_5

    :cond_e
    invoke-virtual {p1}, LH/y;->p()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, LH/o;->p0:LH/o;

    goto/16 :goto_5

    :cond_f
    invoke-virtual {p1}, LH/y;->o()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_10

    sget-object v1, LH/o;->q0:LH/o;

    goto/16 :goto_5

    :cond_10
    invoke-virtual {p1}, LH/y;->n()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_20

    goto/16 :goto_3

    :cond_11
    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_12

    sget-object v1, LH/o;->D:LH/o;

    goto/16 :goto_5

    :cond_12
    invoke-virtual {p1}, LH/y;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_13

    sget-object v1, LH/o;->E:LH/o;

    goto/16 :goto_5

    :cond_13
    invoke-virtual {p1}, LH/y;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_14

    sget-object v1, LH/o;->N:LH/o;

    goto/16 :goto_5

    :cond_14
    invoke-virtual {p1}, LH/y;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_15

    sget-object v1, LH/o;->O:LH/o;

    goto/16 :goto_5

    :cond_15
    invoke-virtual {p1}, LH/y;->r()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_16

    sget-object v1, LH/o;->P:LH/o;

    goto/16 :goto_5

    :cond_16
    invoke-virtual {p1}, LH/y;->q()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_17

    sget-object v1, LH/o;->Q:LH/o;

    goto/16 :goto_5

    :cond_17
    invoke-virtual {p1}, LH/y;->p()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_18

    sget-object v1, LH/o;->J:LH/o;

    goto :goto_5

    :cond_18
    invoke-virtual {p1}, LH/y;->o()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_19

    sget-object v1, LH/o;->K:LH/o;

    goto :goto_5

    :cond_19
    invoke-virtual {p1}, LH/y;->l()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1a

    sget-object v1, LH/o;->u0:LH/o;

    goto :goto_5

    :cond_1a
    invoke-virtual {p1}, LH/y;->c()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1b

    sget-object v1, LH/o;->W:LH/o;

    goto :goto_5

    :cond_1b
    invoke-virtual {p1}, LH/y;->g()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1c

    sget-object v1, LH/o;->X:LH/o;

    goto :goto_5

    :cond_1c
    invoke-virtual {p1}, LH/y;->s()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1d

    goto/16 :goto_3

    :cond_1d
    invoke-virtual {p1}, LH/y;->f()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1e

    goto/16 :goto_4

    :cond_1e
    invoke-virtual {p1}, LH/y;->e()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1f

    goto/16 :goto_2

    :cond_1f
    invoke-virtual {p1}, LH/y;->t()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_20

    sget-object v1, LH/o;->v0:LH/o;

    :cond_20
    :goto_5
    return-object v1
.end method
