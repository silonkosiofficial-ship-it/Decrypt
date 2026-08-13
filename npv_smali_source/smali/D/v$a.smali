.class final LD/v$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/v;->a(Lx7/a;Landroidx/compose/ui/d;Landroidx/compose/foundation/lazy/layout/d;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/lazy/layout/d;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:Lx7/p;

.field final synthetic G:LV/G1;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/layout/d;Landroidx/compose/ui/d;Lx7/p;LV/G1;)V
    .locals 0

    iput-object p1, p0, LD/v$a;->D:Landroidx/compose/foundation/lazy/layout/d;

    iput-object p2, p0, LD/v$a;->E:Landroidx/compose/ui/d;

    iput-object p3, p0, LD/v$a;->F:Lx7/p;

    iput-object p4, p0, LD/v$a;->G:LV/G1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/d;LV/n;I)V
    .locals 9

    .prologue
    const/4 v0, 0x0

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)"

    const v3, -0x58c04be3

    invoke-static {v3, p3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p3, p0, LD/v$a;->G:LV/G1;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_1

    new-instance v1, LD/q;

    new-instance v3, LD/v$a$c;

    invoke-direct {v3, p3}, LD/v$a$c;-><init>(LV/G1;)V

    invoke-direct {v1, p1, v3}, LD/q;-><init>(Le0/d;Lx7/a;)V

    invoke-interface {p2, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, LD/q;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_2

    new-instance p1, LD0/i0;

    new-instance p3, LD/u;

    invoke-direct {p3, v1}, LD/u;-><init>(LD/q;)V

    invoke-direct {p1, p3}, LD0/i0;-><init>(LD0/k0;)V

    invoke-interface {p2, p1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v3, p1

    check-cast v3, LD0/i0;

    iget-object p1, p0, LD/v$a;->D:Landroidx/compose/foundation/lazy/layout/d;

    if-eqz p1, :cond_6

    const p1, 0xc3c1857

    invoke-interface {p2, p1}, LV/n;->T(I)V

    iget-object p1, p0, LD/v$a;->D:Landroidx/compose/foundation/lazy/layout/d;

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/layout/d;->d()LD/P;

    move-result-object p1

    if-nez p1, :cond_3

    const p1, 0x650ec3

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-static {p2, v0}, LD/Q;->a(LV/n;I)LD/P;

    move-result-object p1

    :goto_0
    invoke-interface {p2}, LV/n;->J()V

    goto :goto_1

    :cond_3
    const p3, 0x650a86

    invoke-interface {p2, p3}, LV/n;->T(I)V

    goto :goto_0

    :goto_1
    iget-object p3, p0, LD/v$a;->D:Landroidx/compose/foundation/lazy/layout/d;

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p3, v4, v0

    const/4 p3, 0x1

    aput-object v1, v4, p3

    const/4 p3, 0x2

    aput-object v3, v4, p3

    const/4 p3, 0x3

    aput-object p1, v4, p3

    iget-object p3, p0, LD/v$a;->D:Landroidx/compose/foundation/lazy/layout/d;

    invoke-interface {p2, p3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr p3, v5

    invoke-interface {p2, v3}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr p3, v5

    invoke-interface {p2, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr p3, v5

    iget-object v5, p0, LD/v$a;->D:Landroidx/compose/foundation/lazy/layout/d;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez p3, :cond_4

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v6, p3, :cond_5

    :cond_4
    new-instance v6, LD/v$a$a;

    invoke-direct {v6, v5, v1, v3, p1}, LD/v$a$a;-><init>(Landroidx/compose/foundation/lazy/layout/d;LD/q;LD0/i0;LD/P;)V

    invoke-interface {p2, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lx7/l;

    invoke-static {v4, v6, p2, v0}, LV/Q;->c([Ljava/lang/Object;Lx7/l;LV/n;I)V

    :goto_2
    invoke-interface {p2}, LV/n;->J()V

    goto :goto_3

    :cond_6
    const p1, 0xc452841

    invoke-interface {p2, p1}, LV/n;->T(I)V

    goto :goto_2

    :goto_3
    iget-object p1, p0, LD/v$a;->E:Landroidx/compose/ui/d;

    iget-object p3, p0, LD/v$a;->D:Landroidx/compose/foundation/lazy/layout/d;

    invoke-static {p1, p3}, Landroidx/compose/foundation/lazy/layout/e;->b(Landroidx/compose/ui/d;Landroidx/compose/foundation/lazy/layout/d;)Landroidx/compose/ui/d;

    move-result-object v4

    invoke-interface {p2, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p1

    iget-object p3, p0, LD/v$a;->F:Lx7/p;

    invoke-interface {p2, p3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p1, p3

    iget-object p3, p0, LD/v$a;->F:Lx7/p;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_7

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_8

    :cond_7
    new-instance v0, LD/v$a$b;

    invoke-direct {v0, v1, p3}, LD/v$a$b;-><init>(LD/q;Lx7/p;)V

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v5, v0

    check-cast v5, Lx7/p;

    sget v7, LD0/i0;->f:I

    const/4 v8, 0x0

    move-object v6, p2

    invoke-static/range {v3 .. v8}, LD0/g0;->a(LD0/i0;Landroidx/compose/ui/d;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/d;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LD/v$a;->a(Le0/d;LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
