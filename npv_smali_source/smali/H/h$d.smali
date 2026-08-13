.class final LH/h$d;
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

.field final synthetic E:LS0/X;

.field final synthetic F:LS0/V;

.field final synthetic G:LS0/s;


# direct methods
.method constructor <init>(LH/w;LS0/X;LS0/V;LS0/s;)V
    .locals 0

    iput-object p1, p0, LH/h$d;->D:LH/w;

    iput-object p2, p0, LH/h$d;->E:LS0/X;

    iput-object p3, p0, LH/h$d;->F:LS0/V;

    iput-object p4, p0, LH/h$d;->G:LS0/s;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 7

    .prologue
    iget-object p1, p0, LH/h$d;->D:LH/w;

    invoke-virtual {p1}, LH/w;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LH/h$d;->D:LH/w;

    sget-object v0, LH/H;->a:LH/H$a;

    iget-object v1, p0, LH/h$d;->E:LS0/X;

    iget-object v2, p0, LH/h$d;->F:LS0/V;

    invoke-virtual {p1}, LH/w;->n()LS0/k;

    move-result-object v3

    iget-object v4, p0, LH/h$d;->G:LS0/s;

    iget-object v5, p0, LH/h$d;->D:LH/w;

    invoke-virtual {v5}, LH/w;->m()Lx7/l;

    move-result-object v5

    iget-object v6, p0, LH/h$d;->D:LH/w;

    invoke-virtual {v6}, LH/w;->l()Lx7/l;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, LH/H$a;->i(LS0/X;LS0/V;LS0/k;LS0/s;Lx7/l;Lx7/l;)LS0/d0;

    move-result-object v0

    invoke-virtual {p1, v0}, LH/w;->E(LS0/d0;)V

    :cond_0
    new-instance p1, LH/h$d$a;

    invoke-direct {p1}, LH/h$d$a;-><init>()V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, LH/h$d;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
