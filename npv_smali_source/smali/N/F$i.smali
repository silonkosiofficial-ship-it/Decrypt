.class public final LN/F$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/F;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/F;-><init>(LH/Y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/F;


# direct methods
.method constructor <init>(LN/F;)V
    .locals 0

    iput-object p1, p0, LN/F$i;->a:LN/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final f()V
    .locals 5

    .prologue
    iget-object v0, p0, LN/F$i;->a:LN/F;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LN/F;->i(LN/F;LH/k;)V

    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-static {v0, v1}, LN/F;->e(LN/F;Ln0/g;)V

    iget-object v0, p0, LN/F$i;->a:LN/F;

    const/4 v2, 0x1

    invoke-static {v0, v2}, LN/F;->l(LN/F;Z)V

    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-static {v0, v1}, LN/F;->f(LN/F;Ljava/lang/Integer;)V

    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result v0

    iget-object v1, p0, LN/F$i;->a:LN/F;

    if-eqz v0, :cond_0

    sget-object v3, LH/l;->E:LH/l;

    goto :goto_0

    :cond_0
    sget-object v3, LH/l;->D:LH/l;

    :goto_0
    invoke-static {v1, v3}, LN/F;->j(LN/F;LH/l;)V

    iget-object v1, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v1}, LN/F;->L()LH/w;

    move-result-object v1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    if-nez v0, :cond_2

    iget-object v4, p0, LN/F$i;->a:LN/F;

    invoke-static {v4, v2}, LN/G;->c(LN/F;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_1

    :cond_2
    move v4, v3

    :goto_1
    invoke-virtual {v1, v4}, LH/w;->M(Z)V

    :goto_2
    iget-object v1, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v1}, LN/F;->L()LH/w;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_4

    :cond_3
    if-nez v0, :cond_4

    iget-object v4, p0, LN/F$i;->a:LN/F;

    invoke-static {v4, v3}, LN/G;->c(LN/F;Z)Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v2

    goto :goto_3

    :cond_4
    move v4, v3

    :goto_3
    invoke-virtual {v1, v4}, LH/w;->L(Z)V

    :goto_4
    iget-object v1, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v1}, LN/F;->L()LH/w;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_6

    :cond_5
    if-eqz v0, :cond_6

    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-static {v0, v2}, LN/G;->c(LN/F;Z)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_5

    :cond_6
    move v2, v3

    :goto_5
    invoke-virtual {v1, v2}, LH/w;->J(Z)V

    :goto_6
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    return-void
.end method

.method public b(J)V
    .locals 10

    .prologue
    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v0}, LN/F;->E()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v0}, LN/F;->C()LH/k;

    move-result-object v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, LN/F$i;->a:LN/F;

    sget-object v1, LH/k;->E:LH/k;

    invoke-static {v0, v1}, LN/F;->i(LN/F;LH/k;)V

    iget-object v0, p0, LN/F$i;->a:LN/F;

    const/4 v1, -0x1

    invoke-static {v0, v1}, LN/F;->k(LN/F;I)V

    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v0}, LN/F;->R()V

    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v0}, LN/F;->L()LH/w;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1, p2}, LH/V;->g(J)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v0, v1}, LN/F;->v(Z)V

    iget-object v2, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v2}, LN/F;->O()LS0/V;

    move-result-object v3

    sget-object v0, LM0/N;->b:LM0/N$a;

    invoke-virtual {v0}, LM0/N$a;->a()J

    move-result-wide v5

    const/4 v8, 0x5

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, LS0/V;->d(LS0/V;LM0/d;JLM0/N;ILjava/lang/Object;)LS0/V;

    move-result-object v3

    sget-object v0, LN/q;->a:LN/q$a;

    invoke-virtual {v0}, LN/q$a;->n()LN/q;

    move-result-object v8

    const/4 v9, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-wide v4, p1

    invoke-static/range {v2 .. v9}, LN/F;->m(LN/F;LS0/V;JZZLN/q;Z)J

    move-result-wide v0

    iget-object v2, p0, LN/F$i;->a:LN/F;

    invoke-static {v0, v1}, LM0/N;->n(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2, v0}, LN/F;->f(LN/F;Ljava/lang/Integer;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v0}, LN/F;->L()LH/w;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v0, p0, LN/F$i;->a:LN/F;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-wide v3, p1

    invoke-static/range {v2 .. v7}, LH/V;->e(LH/V;JZILjava/lang/Object;)I

    move-result v2

    invoke-virtual {v0}, LN/F;->J()LS0/L;

    move-result-object v3

    invoke-interface {v3, v2}, LS0/L;->a(I)I

    move-result v2

    invoke-virtual {v0}, LN/F;->O()LS0/V;

    move-result-object v3

    invoke-virtual {v3}, LS0/V;->f()LM0/d;

    move-result-object v3

    invoke-static {v2, v2}, LM0/O;->b(II)J

    move-result-wide v4

    invoke-static {v0, v3, v4, v5}, LN/F;->a(LN/F;LM0/d;J)LS0/V;

    move-result-object v2

    invoke-virtual {v0, v1}, LN/F;->v(Z)V

    invoke-virtual {v0}, LN/F;->H()Lv0/a;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v3, Lv0/b;->a:Lv0/b$a;

    invoke-virtual {v3}, Lv0/b$a;->b()I

    move-result v3

    invoke-interface {v1, v3}, Lv0/a;->a(I)V

    :cond_3
    invoke-virtual {v0}, LN/F;->K()Lx7/l;

    move-result-object v0

    invoke-interface {v0, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_0
    iget-object v0, p0, LN/F$i;->a:LN/F;

    sget-object v1, LH/l;->C:LH/l;

    invoke-static {v0, v1}, LN/F;->j(LN/F;LH/l;)V

    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-static {v0, p1, p2}, LN/F;->g(LN/F;J)V

    iget-object p1, p0, LN/F$i;->a:LN/F;

    invoke-static {p1}, LN/F;->c(LN/F;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->d(J)Ln0/g;

    move-result-object p2

    invoke-static {p1, p2}, LN/F;->e(LN/F;Ln0/g;)V

    iget-object p1, p0, LN/F$i;->a:LN/F;

    sget-object p2, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p2}, Ln0/g$a;->c()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, LN/F;->h(LN/F;J)V

    :cond_5
    :goto_1
    return-void
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, LN/F$i;->f()V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(J)V
    .locals 9

    .prologue
    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v0}, LN/F;->E()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-virtual {v0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v0, p0, LN/F$i;->a:LN/F;

    invoke-static {v0}, LN/F;->d(LN/F;)J

    move-result-wide v1

    invoke-static {v1, v2, p1, p2}, Ln0/g;->r(JJ)J

    move-result-wide p1

    invoke-static {v0, p1, p2}, LN/F;->h(LN/F;J)V

    iget-object p1, p0, LN/F$i;->a:LN/F;

    invoke-virtual {p1}, LN/F;->L()LH/w;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_5

    invoke-virtual {p1}, LH/w;->j()LH/V;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v6, p0, LN/F$i;->a:LN/F;

    invoke-static {v6}, LN/F;->c(LN/F;)J

    move-result-wide v0

    invoke-static {v6}, LN/F;->d(LN/F;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ln0/g;->r(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->d(J)Ln0/g;

    move-result-object v0

    invoke-static {v6, v0}, LN/F;->e(LN/F;Ln0/g;)V

    invoke-static {v6}, LN/F;->b(LN/F;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {v6}, LN/F;->A()Ln0/g;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, LH/V;->g(J)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v6}, LN/F;->J()LS0/L;

    move-result-object v7

    invoke-static {v6}, LN/F;->c(LN/F;)J

    move-result-wide v1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LH/V;->e(LH/V;JZILjava/lang/Object;)I

    move-result v0

    invoke-interface {v7, v0}, LS0/L;->a(I)I

    move-result v7

    invoke-virtual {v6}, LN/F;->J()LS0/L;

    move-result-object v8

    invoke-virtual {v6}, LN/F;->A()Ln0/g;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln0/g;->v()J

    move-result-wide v1

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LH/V;->e(LH/V;JZILjava/lang/Object;)I

    move-result p1

    invoke-interface {v8, p1}, LS0/L;->a(I)I

    move-result p1

    if-ne v7, p1, :cond_1

    sget-object p1, LN/q;->a:LN/q$a;

    invoke-virtual {p1}, LN/q$a;->l()LN/q;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, LN/q;->a:LN/q$a;

    invoke-virtual {p1}, LN/q$a;->n()LN/q;

    move-result-object p1

    :goto_0
    invoke-virtual {v6}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-virtual {v6}, LN/F;->A()Ln0/g;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln0/g;->v()J

    move-result-wide v2

    const/4 v5, 0x0

    const/4 v7, 0x1

    const/4 v4, 0x0

    :goto_1
    move-object v0, v6

    move-object v6, p1

    invoke-static/range {v0 .. v7}, LN/F;->m(LN/F;LS0/V;JZZLN/q;Z)J

    move-result-wide v0

    goto :goto_3

    :cond_2
    invoke-static {v6}, LN/F;->b(LN/F;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_3
    invoke-static {v6}, LN/F;->c(LN/F;)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1, p2}, LH/V;->d(JZ)I

    move-result v0

    :goto_2
    invoke-virtual {v6}, LN/F;->A()Ln0/g;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ln0/g;->v()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2, p2}, LH/V;->d(JZ)I

    move-result p1

    invoke-static {v6}, LN/F;->b(LN/F;)Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_4

    if-ne v0, p1, :cond_4

    return-void

    :cond_4
    invoke-virtual {v6}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-virtual {v6}, LN/F;->A()Ln0/g;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v2

    sget-object p1, LN/q;->a:LN/q$a;

    invoke-virtual {p1}, LN/q$a;->n()LN/q;

    move-result-object p1

    const/4 v7, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    goto :goto_1

    :goto_3
    invoke-static {v0, v1}, LM0/N;->b(J)LM0/N;

    :cond_5
    iget-object p1, p0, LN/F$i;->a:LN/F;

    invoke-static {p1, p2}, LN/F;->l(LN/F;Z)V

    :cond_6
    :goto_4
    return-void
.end method

.method public onCancel()V
    .locals 0

    invoke-direct {p0}, LN/F$i;->f()V

    return-void
.end method
