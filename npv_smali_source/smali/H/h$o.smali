.class final LH/h$o;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


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

.field final synthetic F:LS0/s;

.field final synthetic G:LK/q0;


# direct methods
.method constructor <init>(LH/w;Landroidx/compose/ui/focus/n;LS0/s;LK/q0;)V
    .locals 0

    iput-object p1, p0, LH/h$o;->D:LH/w;

    iput-object p2, p0, LH/h$o;->E:Landroidx/compose/ui/focus/n;

    iput-object p3, p0, LH/h$o;->F:LS0/s;

    iput-object p4, p0, LH/h$o;->G:LK/q0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 3

    .prologue
    iget-object v0, p0, LH/h$o;->D:LH/w;

    invoke-virtual {v0}, LH/w;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LH/h$o;->E:Landroidx/compose/ui/focus/n;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n;->f()V

    :cond_0
    iget-object v0, p0, LH/h$o;->F:LS0/s;

    invoke-virtual {v0}, LS0/s;->f()I

    move-result v0

    sget-object v1, LS0/y;->b:LS0/y$a;

    invoke-virtual {v1}, LS0/y$a;->f()I

    move-result v2

    invoke-static {v0, v2}, LS0/y;->n(II)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LH/h$o;->F:LS0/s;

    invoke-virtual {v0}, LS0/s;->f()I

    move-result v0

    invoke-virtual {v1}, LS0/y$a;->e()I

    move-result v1

    invoke-static {v0, v1}, LS0/y;->n(II)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LH/h$o;->G:LK/q0;

    invoke-virtual {v0}, LK/q0;->k()V

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LH/h$o;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
