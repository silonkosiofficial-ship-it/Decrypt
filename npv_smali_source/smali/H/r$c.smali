.class public final LH/r$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LH/q;


# direct methods
.method constructor <init>(LH/q;)V
    .locals 0

    iput-object p1, p0, LH/r$c;->a:LH/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/KeyEvent;)LH/o;
    .locals 6

    .prologue
    invoke-static {p1}, Lx0/d;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lx0/d;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LH/y;->a:LH/y;

    invoke-virtual {v0}, LH/y;->i()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v1, LH/o;->l0:LH/o;

    goto/16 :goto_0

    :cond_0
    invoke-virtual {v0}, LH/y;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v1, LH/o;->m0:LH/o;

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v0}, LH/y;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v1, LH/o;->o0:LH/o;

    goto/16 :goto_0

    :cond_2
    invoke-virtual {v0}, LH/y;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, LH/o;->n0:LH/o;

    goto/16 :goto_0

    :cond_3
    invoke-static {p1}, Lx0/d;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LH/y;->a:LH/y;

    invoke-virtual {v0}, LH/y;->i()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v1, LH/o;->G:LH/o;

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v0}, LH/y;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object v1, LH/o;->F:LH/o;

    goto/16 :goto_0

    :cond_5
    invoke-virtual {v0}, LH/y;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v1, LH/o;->I:LH/o;

    goto/16 :goto_0

    :cond_6
    invoke-virtual {v0}, LH/y;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_7

    sget-object v1, LH/o;->H:LH/o;

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v0}, LH/y;->m()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_8

    sget-object v1, LH/o;->W:LH/o;

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v0}, LH/y;->g()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_9

    sget-object v1, LH/o;->Z:LH/o;

    goto :goto_0

    :cond_9
    invoke-virtual {v0}, LH/y;->c()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_a

    sget-object v1, LH/o;->Y:LH/o;

    goto :goto_0

    :cond_a
    invoke-virtual {v0}, LH/y;->b()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, LH/o;->t0:LH/o;

    goto :goto_0

    :cond_b
    invoke-static {p1}, Lx0/d;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LH/y;->a:LH/y;

    invoke-virtual {v0}, LH/y;->p()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_c

    sget-object v1, LH/o;->r0:LH/o;

    goto :goto_0

    :cond_c
    invoke-virtual {v0}, LH/y;->o()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, LH/o;->s0:LH/o;

    goto :goto_0

    :cond_d
    invoke-static {p1}, Lx0/d;->d(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LH/y;->a:LH/y;

    invoke-virtual {v0}, LH/y;->c()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v1, LH/o;->a0:LH/o;

    goto :goto_0

    :cond_e
    invoke-virtual {v0}, LH/y;->g()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, LH/o;->b0:LH/o;

    :cond_f
    :goto_0
    if-nez v1, :cond_10

    iget-object v0, p0, LH/r$c;->a:LH/q;

    invoke-interface {v0, p1}, LH/q;->a(Landroid/view/KeyEvent;)LH/o;

    move-result-object v1

    :cond_10
    return-object v1
.end method
