.class public final LN/F$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/F;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/F;->Q(Z)LH/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/F;

.field final synthetic b:Z


# direct methods
.method constructor <init>(LN/F;Z)V
    .locals 0

    iput-object p1, p0, LN/F$b;->a:LN/F;

    iput-boolean p2, p0, LN/F$b;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 2

    .prologue
    iget-object p1, p0, LN/F$b;->a:LN/F;

    iget-boolean p2, p0, LN/F$b;->b:Z

    if-eqz p2, :cond_0

    sget-object p2, LH/k;->D:LH/k;

    goto :goto_0

    :cond_0
    sget-object p2, LH/k;->E:LH/k;

    :goto_0
    invoke-static {p1, p2}, LN/F;->i(LN/F;LH/k;)V

    iget-object p1, p0, LN/F$b;->a:LN/F;

    iget-boolean p2, p0, LN/F$b;->b:Z

    invoke-virtual {p1, p2}, LN/F;->G(Z)J

    move-result-wide p1

    invoke-static {p1, p2}, LN/v;->a(J)J

    move-result-wide p1

    iget-object v0, p0, LN/F$b;->a:LN/F;

    invoke-virtual {v0}, LN/F;->L()LH/w;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0, p1, p2}, LH/V;->k(J)J

    move-result-wide p1

    iget-object v0, p0, LN/F$b;->a:LN/F;

    invoke-static {v0, p1, p2}, LN/F;->g(LN/F;J)V

    iget-object v0, p0, LN/F$b;->a:LN/F;

    invoke-static {p1, p2}, Ln0/g;->d(J)Ln0/g;

    move-result-object p1

    invoke-static {v0, p1}, LN/F;->e(LN/F;Ln0/g;)V

    iget-object p1, p0, LN/F$b;->a:LN/F;

    sget-object p2, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p2}, Ln0/g$a;->c()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, LN/F;->h(LN/F;J)V

    iget-object p1, p0, LN/F$b;->a:LN/F;

    const/4 p2, -0x1

    invoke-static {p1, p2}, LN/F;->k(LN/F;I)V

    iget-object p1, p0, LN/F$b;->a:LN/F;

    invoke-virtual {p1}, LN/F;->L()LH/w;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 p2, 0x1

    invoke-virtual {p1, p2}, LH/w;->D(Z)V

    :goto_1
    iget-object p1, p0, LN/F$b;->a:LN/F;

    const/4 p2, 0x0

    invoke-static {p1, p2}, LN/F;->l(LN/F;Z)V

    :cond_3
    :goto_2
    return-void
.end method

.method public b(J)V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, LN/F$b;->a:LN/F;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LN/F;->i(LN/F;LH/k;)V

    iget-object v0, p0, LN/F$b;->a:LN/F;

    invoke-static {v0, v1}, LN/F;->e(LN/F;Ln0/g;)V

    iget-object v0, p0, LN/F$b;->a:LN/F;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LN/F;->l(LN/F;Z)V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, LN/F$b;->a:LN/F;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LN/F;->i(LN/F;LH/k;)V

    iget-object v0, p0, LN/F$b;->a:LN/F;

    invoke-static {v0, v1}, LN/F;->e(LN/F;Ln0/g;)V

    iget-object v0, p0, LN/F$b;->a:LN/F;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LN/F;->l(LN/F;Z)V

    return-void
.end method

.method public e(J)V
    .locals 8

    iget-object v0, p0, LN/F$b;->a:LN/F;

    invoke-static {v0}, LN/F;->d(LN/F;)J

    move-result-wide v1

    invoke-static {v1, v2, p1, p2}, Ln0/g;->r(JJ)J

    move-result-wide p1

    invoke-static {v0, p1, p2}, LN/F;->h(LN/F;J)V

    iget-object p1, p0, LN/F$b;->a:LN/F;

    invoke-static {p1}, LN/F;->c(LN/F;)J

    move-result-wide v0

    iget-object p2, p0, LN/F$b;->a:LN/F;

    invoke-static {p2}, LN/F;->d(LN/F;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ln0/g;->r(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->d(J)Ln0/g;

    move-result-object p2

    invoke-static {p1, p2}, LN/F;->e(LN/F;Ln0/g;)V

    iget-object v0, p0, LN/F$b;->a:LN/F;

    invoke-virtual {v0}, LN/F;->O()LS0/V;

    move-result-object v1

    iget-object p1, p0, LN/F$b;->a:LN/F;

    invoke-virtual {p1}, LN/F;->A()Ln0/g;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v2

    iget-boolean v5, p0, LN/F$b;->b:Z

    sget-object p1, LN/q;->a:LN/q$a;

    invoke-virtual {p1}, LN/q$a;->k()LN/q;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, LN/F;->m(LN/F;LS0/V;JZZLN/q;Z)J

    iget-object p1, p0, LN/F$b;->a:LN/F;

    const/4 p2, 0x0

    invoke-static {p1, p2}, LN/F;->l(LN/F;Z)V

    return-void
.end method

.method public onCancel()V
    .locals 0

    return-void
.end method
