.class public abstract Lr0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lq0/g;Lr0/c;)V
    .locals 1

    invoke-interface {p0}, Lq0/g;->F0()Lq0/d;

    move-result-object v0

    invoke-interface {v0}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-interface {p0}, Lq0/g;->F0()Lq0/d;

    move-result-object p0

    invoke-interface {p0}, Lq0/d;->f()Lr0/c;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Lr0/c;->h(Lo0/q0;Lr0/c;)V

    return-void
.end method

.method public static final b(Lr0/c;Lo0/L1;)V
    .locals 8

    .prologue
    instance-of v0, p1, Lo0/L1$b;

    if-eqz v0, :cond_0

    check-cast p1, Lo0/L1$b;

    invoke-virtual {p1}, Lo0/L1$b;->b()Ln0/i;

    move-result-object v0

    invoke-virtual {v0}, Ln0/i;->i()F

    move-result v0

    invoke-virtual {p1}, Lo0/L1$b;->b()Ln0/i;

    move-result-object v1

    invoke-virtual {v1}, Ln0/i;->l()F

    move-result v1

    invoke-static {v0, v1}, Ln0/h;->a(FF)J

    move-result-wide v0

    invoke-virtual {p1}, Lo0/L1$b;->b()Ln0/i;

    move-result-object v2

    invoke-virtual {v2}, Ln0/i;->n()F

    move-result v2

    invoke-virtual {p1}, Lo0/L1$b;->b()Ln0/i;

    move-result-object p1

    invoke-virtual {p1}, Ln0/i;->h()F

    move-result p1

    invoke-static {v2, p1}, Ln0/n;->a(FF)J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lr0/c;->R(JJ)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lo0/L1$a;

    if-eqz v0, :cond_1

    check-cast p1, Lo0/L1$a;

    invoke-virtual {p1}, Lo0/L1$a;->b()Lo0/Q1;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lr0/c;->O(Lo0/Q1;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lo0/L1$c;

    if-eqz v0, :cond_3

    check-cast p1, Lo0/L1$c;

    invoke-virtual {p1}, Lo0/L1$c;->c()Lo0/Q1;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lo0/L1$c;->c()Lo0/Q1;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lo0/L1$c;->b()Ln0/k;

    move-result-object p1

    invoke-virtual {p1}, Ln0/k;->e()F

    move-result v0

    invoke-virtual {p1}, Ln0/k;->g()F

    move-result v1

    invoke-static {v0, v1}, Ln0/h;->a(FF)J

    move-result-wide v3

    invoke-virtual {p1}, Ln0/k;->j()F

    move-result v0

    invoke-virtual {p1}, Ln0/k;->d()F

    move-result v1

    invoke-static {v0, v1}, Ln0/n;->a(FF)J

    move-result-wide v5

    invoke-virtual {p1}, Ln0/k;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/a;->d(J)F

    move-result v7

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lr0/c;->W(JJF)V

    :cond_3
    :goto_1
    return-void
.end method
