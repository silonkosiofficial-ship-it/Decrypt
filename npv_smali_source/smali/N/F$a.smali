.class public final LN/F$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/F;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/F;->r()LH/F;
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

    iput-object p1, p0, LN/F$a;->a:LN/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    return-void
.end method

.method public b(J)V
    .locals 2

    .prologue
    iget-object p1, p0, LN/F$a;->a:LN/F;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, LN/F;->G(Z)J

    move-result-wide p1

    invoke-static {p1, p2}, LN/v;->a(J)J

    move-result-wide p1

    iget-object v0, p0, LN/F$a;->a:LN/F;

    invoke-virtual {v0}, LN/F;->L()LH/w;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, LH/V;->k(J)J

    move-result-wide p1

    iget-object v0, p0, LN/F$a;->a:LN/F;

    invoke-static {v0, p1, p2}, LN/F;->g(LN/F;J)V

    iget-object v0, p0, LN/F$a;->a:LN/F;

    invoke-static {p1, p2}, Ln0/g;->d(J)Ln0/g;

    move-result-object p1

    invoke-static {v0, p1}, LN/F;->e(LN/F;Ln0/g;)V

    iget-object p1, p0, LN/F$a;->a:LN/F;

    sget-object p2, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p2}, Ln0/g$a;->c()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, LN/F;->h(LN/F;J)V

    iget-object p1, p0, LN/F$a;->a:LN/F;

    sget-object p2, LH/k;->C:LH/k;

    invoke-static {p1, p2}, LN/F;->i(LN/F;LH/k;)V

    iget-object p1, p0, LN/F$a;->a:LN/F;

    const/4 p2, 0x0

    invoke-static {p1, p2}, LN/F;->l(LN/F;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, LN/F$a;->a:LN/F;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LN/F;->i(LN/F;LH/k;)V

    iget-object v0, p0, LN/F$a;->a:LN/F;

    invoke-static {v0, v1}, LN/F;->e(LN/F;Ln0/g;)V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, LN/F$a;->a:LN/F;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LN/F;->i(LN/F;LH/k;)V

    iget-object v0, p0, LN/F$a;->a:LN/F;

    invoke-static {v0, v1}, LN/F;->e(LN/F;Ln0/g;)V

    return-void
.end method

.method public e(J)V
    .locals 6

    .prologue
    iget-object v0, p0, LN/F$a;->a:LN/F;

    invoke-static {v0}, LN/F;->d(LN/F;)J

    move-result-wide v1

    invoke-static {v1, v2, p1, p2}, Ln0/g;->r(JJ)J

    move-result-wide p1

    invoke-static {v0, p1, p2}, LN/F;->h(LN/F;J)V

    iget-object p1, p0, LN/F$a;->a:LN/F;

    invoke-virtual {p1}, LN/F;->L()LH/w;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LH/w;->j()LH/V;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object p1, p0, LN/F$a;->a:LN/F;

    invoke-static {p1}, LN/F;->c(LN/F;)J

    move-result-wide v1

    invoke-static {p1}, LN/F;->d(LN/F;)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ln0/g;->r(JJ)J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/g;->d(J)Ln0/g;

    move-result-object p2

    invoke-static {p1, p2}, LN/F;->e(LN/F;Ln0/g;)V

    invoke-virtual {p1}, LN/F;->J()LS0/L;

    move-result-object p2

    invoke-virtual {p1}, LN/F;->A()Ln0/g;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ln0/g;->v()J

    move-result-wide v1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LH/V;->e(LH/V;JZILjava/lang/Object;)I

    move-result v0

    invoke-interface {p2, v0}, LS0/L;->a(I)I

    move-result p2

    invoke-static {p2, p2}, LM0/O;->b(II)J

    move-result-wide v0

    invoke-virtual {p1}, LN/F;->O()LS0/V;

    move-result-object p2

    invoke-virtual {p2}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LM0/N;->g(JJ)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LN/F;->L()LH/w;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LH/w;->y()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LN/F;->H()Lv0/a;

    move-result-object p2

    if-eqz p2, :cond_2

    sget-object v2, Lv0/b;->a:Lv0/b$a;

    invoke-virtual {v2}, Lv0/b$a;->b()I

    move-result v2

    invoke-interface {p2, v2}, Lv0/a;->a(I)V

    :cond_2
    :goto_0
    invoke-virtual {p1}, LN/F;->K()Lx7/l;

    move-result-object p2

    invoke-virtual {p1}, LN/F;->O()LS0/V;

    move-result-object v2

    invoke-virtual {v2}, LS0/V;->f()LM0/d;

    move-result-object v2

    invoke-static {p1, v2, v0, v1}, LN/F;->a(LN/F;LM0/d;J)LS0/V;

    move-result-object p1

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public onCancel()V
    .locals 0

    return-void
.end method
