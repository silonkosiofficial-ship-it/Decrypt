.class final LH/G$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/G;->a(Landroidx/compose/ui/d;LH/w;LS0/V;LS0/L;Lo0/n0;Z)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lo0/n0;

.field final synthetic E:LH/w;

.field final synthetic F:LS0/V;

.field final synthetic G:LS0/L;


# direct methods
.method constructor <init>(Lo0/n0;LH/w;LS0/V;LS0/L;)V
    .locals 0

    iput-object p1, p0, LH/G$a;->D:Lo0/n0;

    iput-object p2, p0, LH/G$a;->E:LH/w;

    iput-object p3, p0, LH/G$a;->F:LS0/V;

    iput-object p4, p0, LH/G$a;->G:LS0/L;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 8

    .prologue
    const v0, -0x5097aed    # -6.4000205E35f

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)"

    invoke-static {v0, p3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p3, v1, :cond_1

    new-instance p3, LK/o;

    invoke-direct {p3}, LK/o;-><init>()V

    invoke-interface {p2, p3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1
    move-object v2, p3

    check-cast v2, LK/o;

    iget-object p3, p0, LH/G$a;->D:Lo0/n0;

    instance-of v1, p3, Lo0/f2;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    check-cast p3, Lo0/f2;

    invoke-virtual {p3}, Lo0/f2;->b()J

    move-result-wide v4

    const-wide/16 v6, 0x10

    cmp-long p3, v4, v6

    if-nez p3, :cond_2

    move p3, v3

    goto :goto_0

    :cond_2
    const/4 p3, 0x1

    :goto_0
    invoke-static {}, Landroidx/compose/ui/platform/p0;->s()LV/O0;

    move-result-object v1

    invoke-interface {p2, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/platform/J1;

    invoke-interface {v1}, Landroidx/compose/ui/platform/J1;->a()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, LH/G$a;->E:LH/w;

    invoke-virtual {v1}, LH/w;->e()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, LH/G$a;->F:LS0/V;

    invoke-virtual {v1}, LS0/V;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LM0/N;->h(J)Z

    move-result v1

    if-eqz v1, :cond_7

    if-eqz p3, :cond_7

    const p3, 0x302dfc9d

    invoke-interface {p2, p3}, LV/n;->T(I)V

    iget-object p3, p0, LH/G$a;->F:LS0/V;

    invoke-virtual {p3}, LS0/V;->f()LM0/d;

    move-result-object p3

    iget-object v1, p0, LH/G$a;->F:LS0/V;

    invoke-virtual {v1}, LS0/V;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LM0/N;->b(J)LM0/N;

    move-result-object v1

    invoke-interface {p2, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_3

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_4

    :cond_3
    new-instance v5, LH/G$a$a;

    const/4 v4, 0x0

    invoke-direct {v5, v2, v4}, LH/G$a$a;-><init>(LK/o;Lm7/e;)V

    invoke-interface {p2, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lx7/p;

    invoke-static {p3, v1, v5, p2, v3}, LV/Q;->d(Ljava/lang/Object;Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-interface {p2, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result p3

    iget-object v1, p0, LH/G$a;->G:LS0/L;

    invoke-interface {p2, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    iget-object v1, p0, LH/G$a;->F:LS0/V;

    invoke-interface {p2, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    iget-object v1, p0, LH/G$a;->E:LH/w;

    invoke-interface {p2, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    iget-object v1, p0, LH/G$a;->D:Lo0/n0;

    invoke-interface {p2, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    iget-object v3, p0, LH/G$a;->G:LS0/L;

    iget-object v4, p0, LH/G$a;->F:LS0/V;

    iget-object v5, p0, LH/G$a;->E:LH/w;

    iget-object v6, p0, LH/G$a;->D:Lo0/n0;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_5

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_6

    :cond_5
    new-instance p3, LH/G$a$b;

    move-object v1, p3

    invoke-direct/range {v1 .. v6}, LH/G$a$b;-><init>(LK/o;LS0/L;LS0/V;LH/w;Lo0/n0;)V

    invoke-interface {p2, p3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lx7/l;

    invoke-static {p1, v1}, Landroidx/compose/ui/draw/b;->d(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-interface {p2}, LV/n;->J()V

    goto :goto_1

    :cond_7
    const p1, 0x3040856e

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-interface {p2}, LV/n;->J()V

    sget-object p1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :goto_1
    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-static {}, LV/q;->P()V

    :cond_8
    invoke-interface {p2}, LV/n;->J()V

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LH/G$a;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
