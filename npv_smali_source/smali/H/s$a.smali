.class public final LH/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

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

    invoke-static {p1}, Lx0/d;->d(Landroid/view/KeyEvent;)Z

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

    sget-object v1, LH/o;->r0:LH/o;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LH/y;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v1, LH/o;->s0:LH/o;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LH/y;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v1, LH/o;->j0:LH/o;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LH/y;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v1, LH/o;->k0:LH/o;

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lx0/d;->d(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LH/y;->a:LH/y;

    invoke-virtual {v0}, LH/y;->i()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v1, LH/o;->L:LH/o;

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, LH/y;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object v1, LH/o;->M:LH/o;

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, LH/y;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v1, LH/o;->R:LH/o;

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, LH/y;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v1, LH/o;->S:LH/o;

    :cond_7
    :goto_0
    if-nez v1, :cond_8

    invoke-static {}, LH/r;->b()LH/q;

    move-result-object v0

    invoke-interface {v0, p1}, LH/q;->a(Landroid/view/KeyEvent;)LH/o;

    move-result-object v1

    :cond_8
    return-object v1
.end method
