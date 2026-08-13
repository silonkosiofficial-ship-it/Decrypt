.class final LH/h$l;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h;->a(LS0/V;Lx7/l;Landroidx/compose/ui/d;LM0/P;LS0/g0;Lx7/l;Lz/l;Lo0/n0;ZIILS0/s;LH/u;ZZLx7/q;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/w;

.field final synthetic E:Landroidx/compose/ui/focus/n;

.field final synthetic F:Z

.field final synthetic G:Z

.field final synthetic H:LN/F;

.field final synthetic I:LS0/L;


# direct methods
.method constructor <init>(LH/w;Landroidx/compose/ui/focus/n;ZZLN/F;LS0/L;)V
    .locals 0

    iput-object p1, p0, LH/h$l;->D:LH/w;

    iput-object p2, p0, LH/h$l;->E:Landroidx/compose/ui/focus/n;

    iput-boolean p3, p0, LH/h$l;->F:Z

    iput-boolean p4, p0, LH/h$l;->G:Z

    iput-object p5, p0, LH/h$l;->H:LN/F;

    iput-object p6, p0, LH/h$l;->I:LS0/L;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 8

    .prologue
    iget-object v0, p0, LH/h$l;->D:LH/w;

    iget-object v1, p0, LH/h$l;->E:Landroidx/compose/ui/focus/n;

    iget-boolean v2, p0, LH/h$l;->F:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v0, v1, v2}, LH/h;->l(LH/w;Landroidx/compose/ui/focus/n;Z)V

    iget-object v0, p0, LH/h$l;->D:LH/w;

    invoke-virtual {v0}, LH/w;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LH/h$l;->G:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LH/h$l;->D:LH/w;

    invoke-virtual {v0}, LH/w;->d()LH/l;

    move-result-object v0

    sget-object v1, LH/l;->D:LH/l;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LH/h$l;->D:LH/w;

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v0, p0, LH/h$l;->D:LH/w;

    iget-object v6, p0, LH/h$l;->I:LS0/L;

    sget-object v1, LH/H;->a:LH/H$a;

    invoke-virtual {v0}, LH/w;->n()LS0/k;

    move-result-object v5

    invoke-virtual {v0}, LH/w;->m()Lx7/l;

    move-result-object v7

    move-wide v2, p1

    invoke-virtual/range {v1 .. v7}, LH/H$a;->j(JLH/V;LS0/k;LS0/L;Lx7/l;)V

    invoke-virtual {v0}, LH/w;->v()LH/D;

    move-result-object p1

    invoke-virtual {p1}, LH/D;->k()LM0/d;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_1

    sget-object p1, LH/l;->E:LH/l;

    invoke-virtual {v0, p1}, LH/w;->B(LH/l;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LH/h$l;->H:LN/F;

    invoke-static {p1, p2}, Ln0/g;->d(J)Ln0/g;

    move-result-object p1

    invoke-virtual {v0, p1}, LN/F;->t(Ln0/g;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LH/h$l;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
