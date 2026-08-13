.class final Lt/d$j;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/d;->g(Lu/s0;Lx7/l;Landroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lx7/q;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;

.field final synthetic E:Lu/s0;


# direct methods
.method constructor <init>(Lx7/l;Lu/s0;)V
    .locals 0

    iput-object p1, p0, Lt/d$j;->D:Lx7/l;

    iput-object p2, p0, Lt/d$j;->E:Lu/s0;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/M;LD0/G;J)LD0/K;
    .locals 7

    .prologue
    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-interface {p1}, LD0/o;->A0()Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lt/d$j;->D:Lx7/l;

    iget-object p4, p0, Lt/d$j;->E:Lu/s0;

    invoke-virtual {p4}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3, p4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_0

    sget-object p3, LY0/t;->b:LY0/t$a;

    invoke-virtual {p3}, LY0/t$a;->a()J

    move-result-wide p3

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LD0/X;->I0()I

    move-result p3

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result p4

    invoke-static {p3, p4}, LY0/u;->a(II)J

    move-result-wide p3

    :goto_0
    invoke-static {p3, p4}, LY0/t;->g(J)I

    move-result v1

    invoke-static {p3, p4}, LY0/t;->f(J)I

    move-result v2

    new-instance v4, Lt/d$j$a;

    invoke-direct {v4, p2}, Lt/d$j$a;-><init>(LD0/X;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LD0/M;

    check-cast p2, LD0/G;

    check-cast p3, LY0/b;

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Lt/d$j;->a(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    return-object p1
.end method
