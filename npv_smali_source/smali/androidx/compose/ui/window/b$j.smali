.class final Landroidx/compose/ui/window/b$j;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/r;Lx7/a;Landroidx/compose/ui/window/s;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/window/l;

.field final synthetic E:LV/G1;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/l;LV/G1;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/b$j;->D:Landroidx/compose/ui/window/l;

    iput-object p2, p0, Landroidx/compose/ui/window/b$j;->E:LV/G1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 7

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

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:321)"

    const v2, 0x4da88f2f    # 3.53494496E8f

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v0, Landroidx/compose/ui/window/b$j$a;->D:Landroidx/compose/ui/window/b$j$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p2, v2, v0, v3, v1}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, Landroidx/compose/ui/window/b$j;->D:Landroidx/compose/ui/window/l;

    invoke-interface {p1, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/window/b$j;->D:Landroidx/compose/ui/window/l;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_3

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_4

    :cond_3
    new-instance v4, Landroidx/compose/ui/window/b$j$b;

    invoke-direct {v4, v1}, Landroidx/compose/ui/window/b$j$b;-><init>(Landroidx/compose/ui/window/l;)V

    invoke-interface {p1, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lx7/l;

    invoke-static {p2, v4}, Landroidx/compose/ui/layout/e;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, Landroidx/compose/ui/window/b$j;->D:Landroidx/compose/ui/window/l;

    invoke-virtual {v0}, Landroidx/compose/ui/window/l;->getCanCalculatePosition()Z

    move-result v0

    if-eqz v0, :cond_5

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    invoke-static {p2, v0}, Ll0/a;->a(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object p2

    new-instance v0, Landroidx/compose/ui/window/b$j$c;

    iget-object v1, p0, Landroidx/compose/ui/window/b$j;->E:LV/G1;

    invoke-direct {v0, v1}, Landroidx/compose/ui/window/b$j$c;-><init>(LV/G1;)V

    const/16 v1, 0x36

    const v4, 0x24266c85

    invoke-static {v4, v3, v0, p1, v1}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/window/c;->a:Landroidx/compose/ui/window/c;

    invoke-static {p1, v2}, LV/k;->a(LV/n;I)I

    move-result v2

    invoke-interface {p1}, LV/n;->F()LV/z;

    move-result-object v3

    invoke-static {p1, p2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    sget-object v4, LF0/g;->a:LF0/g$a;

    invoke-virtual {v4}, LF0/g$a;->a()Lx7/a;

    move-result-object v5

    invoke-interface {p1}, LV/n;->v()LV/g;

    move-result-object v6

    instance-of v6, v6, LV/g;

    if-nez v6, :cond_6

    invoke-static {}, LV/k;->c()V

    :cond_6
    invoke-interface {p1}, LV/n;->t()V

    invoke-interface {p1}, LV/n;->o()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {p1, v5}, LV/n;->B(Lx7/a;)V

    goto :goto_2

    :cond_7
    invoke-interface {p1}, LV/n;->H()V

    :goto_2
    invoke-static {p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v5

    invoke-virtual {v4}, LF0/g$a;->c()Lx7/p;

    move-result-object v6

    invoke-static {v5, v1, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->e()Lx7/p;

    move-result-object v1

    invoke-static {v5, v3, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->b()Lx7/p;

    move-result-object v1

    invoke-interface {v5}, LV/n;->o()Z

    move-result v3

    if-nez v3, :cond_8

    invoke-interface {v5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, v1}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_9
    invoke-virtual {v4}, LF0/g$a;->d()Lx7/p;

    move-result-object v1

    invoke-static {v5, p2, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    const/4 p2, 0x6

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, LV/q;->P()V

    :cond_a
    :goto_3
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/b$j;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
