.class final LS/b$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/b;->d(Lx7/a;Landroidx/compose/ui/d;Landroidx/compose/ui/window/i;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Lx7/p;


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LS/b$g;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LS/b$g;->E:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 8

    .prologue
    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/n;->A()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.BasicAlertDialog.<anonymous> (AlertDialog.kt:150)"

    const v2, 0x35f59d30

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, LT/x;->a:LT/x$a;

    sget p2, LS/C0;->A:I

    invoke-static {p2}, LT/x;->a(I)I

    move-result p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, LS/b$g;->D:Landroidx/compose/ui/d;

    invoke-static {}, LS/b;->l()F

    move-result v2

    invoke-static {}, LS/b;->k()F

    move-result v4

    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/p;->s(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {p1, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_3

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_4

    :cond_3
    new-instance v4, LS/b$g$a;

    invoke-direct {v4, p2}, LS/b$g$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lx7/l;

    const/4 p2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v4, v3, p2}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p2

    invoke-interface {v1, p2}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v1, p0, LS/b$g;->E:Lx7/p;

    sget-object v2, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v2}, Lh0/c$a;->o()Lh0/c;

    move-result-object v2

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v2

    invoke-static {p1, v0}, LV/k;->a(LV/n;I)I

    move-result v3

    invoke-interface {p1}, LV/n;->F()LV/z;

    move-result-object v4

    invoke-static {p1, p2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    sget-object v5, LF0/g;->a:LF0/g$a;

    invoke-virtual {v5}, LF0/g$a;->a()Lx7/a;

    move-result-object v6

    invoke-interface {p1}, LV/n;->v()LV/g;

    move-result-object v7

    instance-of v7, v7, LV/g;

    if-nez v7, :cond_5

    invoke-static {}, LV/k;->c()V

    :cond_5
    invoke-interface {p1}, LV/n;->t()V

    invoke-interface {p1}, LV/n;->o()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {p1, v6}, LV/n;->B(Lx7/a;)V

    goto :goto_1

    :cond_6
    invoke-interface {p1}, LV/n;->H()V

    :goto_1
    invoke-static {p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v6

    invoke-virtual {v5}, LF0/g$a;->c()Lx7/p;

    move-result-object v7

    invoke-static {v6, v2, v7}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->e()Lx7/p;

    move-result-object v2

    invoke-static {v6, v4, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v6}, LV/n;->o()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-interface {v6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_8
    invoke-virtual {v5}, LF0/g$a;->d()Lx7/p;

    move-result-object v2

    invoke-static {v6, p2, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object p2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_2
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/b$g;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
