.class public final LN/F$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/h;


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

    iput-object p1, p0, LN/F$c;->a:LN/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JLN/q;)Z
    .locals 7

    .prologue
    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->E()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->L()LH/w;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->F()Landroidx/compose/ui/focus/n;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n;->f()V

    :cond_2
    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-static {v0, p1, p2}, LN/F;->g(LN/F;J)V

    iget-object p1, p0, LN/F$c;->a:LN/F;

    const/4 p2, -0x1

    invoke-static {p1, p2}, LN/F;->k(LN/F;I)V

    iget-object p1, p0, LN/F$c;->a:LN/F;

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-static {p1, v1, v0, p2}, LN/F;->w(LN/F;ZILjava/lang/Object;)V

    iget-object p1, p0, LN/F$c;->a:LN/F;

    invoke-virtual {p1}, LN/F;->O()LS0/V;

    move-result-object v2

    iget-object p1, p0, LN/F$c;->a:LN/F;

    invoke-static {p1}, LN/F;->c(LN/F;)J

    move-result-wide v3

    const/4 v5, 0x1

    move-object v1, p0

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, LN/F$c;->f(LS0/V;JZLN/q;)V

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public b(J)Z
    .locals 7

    .prologue
    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->E()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->L()LH/w;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->O()LS0/V;

    move-result-object v2

    sget-object v0, LN/q;->a:LN/q$a;

    invoke-virtual {v0}, LN/q$a;->l()LN/q;

    move-result-object v6

    const/4 v5, 0x0

    move-object v1, p0

    move-wide v3, p1

    invoke-virtual/range {v1 .. v6}, LN/F$c;->f(LS0/V;JZLN/q;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public c(JLN/q;)Z
    .locals 7

    .prologue
    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->E()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->L()LH/w;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->O()LS0/V;

    move-result-object v2

    const/4 v5, 0x0

    move-object v1, p0

    move-wide v3, p1

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, LN/F$c;->f(LS0/V;JZLN/q;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(J)Z
    .locals 7

    .prologue
    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->L()LH/w;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->E()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, LN/F$c;->a:LN/F;

    const/4 v1, -0x1

    invoke-static {v0, v1}, LN/F;->k(LN/F;I)V

    iget-object v0, p0, LN/F$c;->a:LN/F;

    invoke-virtual {v0}, LN/F;->O()LS0/V;

    move-result-object v2

    sget-object v0, LN/q;->a:LN/q$a;

    invoke-virtual {v0}, LN/q$a;->l()LN/q;

    move-result-object v6

    const/4 v5, 0x0

    move-object v1, p0

    move-wide v3, p1

    invoke-virtual/range {v1 .. v6}, LN/F$c;->f(LS0/V;JZLN/q;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public final f(LS0/V;JZLN/q;)V
    .locals 8

    .prologue
    iget-object v0, p0, LN/F$c;->a:LN/F;

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v6, p5

    invoke-static/range {v0 .. v7}, LN/F;->m(LN/F;LS0/V;JZZLN/q;Z)J

    move-result-wide p1

    iget-object p3, p0, LN/F$c;->a:LN/F;

    invoke-static {p1, p2}, LM0/N;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LH/l;->E:LH/l;

    goto :goto_0

    :cond_0
    sget-object p1, LH/l;->D:LH/l;

    :goto_0
    invoke-static {p3, p1}, LN/F;->j(LN/F;LH/l;)V

    return-void
.end method
