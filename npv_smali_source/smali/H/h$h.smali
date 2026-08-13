.class final LH/h$h;
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

.field final synthetic E:LS0/V;

.field final synthetic F:LS0/L;


# direct methods
.method constructor <init>(LH/w;LS0/V;LS0/L;)V
    .locals 0

    iput-object p1, p0, LH/h$h;->D:LH/w;

    iput-object p2, p0, LH/h$h;->E:LS0/V;

    iput-object p3, p0, LH/h$h;->F:LS0/L;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/g;)V
    .locals 13

    .prologue
    iget-object v0, p0, LH/h$h;->D:LH/w;

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v3, p0, LH/h$h;->E:LS0/V;

    iget-object v1, p0, LH/h$h;->D:LH/w;

    iget-object v8, p0, LH/h$h;->F:LS0/L;

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object p1

    invoke-interface {p1}, Lq0/d;->h()Lo0/q0;

    move-result-object v2

    sget-object p1, LH/H;->a:LH/H$a;

    invoke-virtual {v1}, LH/w;->q()J

    move-result-wide v4

    invoke-virtual {v1}, LH/w;->c()J

    move-result-wide v6

    invoke-virtual {v0}, LH/V;->f()LM0/K;

    move-result-object v9

    invoke-virtual {v1}, LH/w;->f()Lo0/N1;

    move-result-object v10

    invoke-virtual {v1}, LH/w;->p()J

    move-result-wide v11

    move-object v1, p1

    invoke-virtual/range {v1 .. v12}, LH/H$a;->b(Lo0/q0;LS0/V;JJLS0/L;LM0/K;Lo0/N1;J)V

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/g;

    invoke-virtual {p0, p1}, LH/h$h;->a(Lq0/g;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
