.class final Landroidx/compose/ui/platform/P1$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/P1$a;->a(Landroidx/compose/ui/platform/r$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/platform/P1;

.field final synthetic E:Lx7/p;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/P1;Lx7/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/P1$a$a;->D:Landroidx/compose/ui/platform/P1;

    iput-object p2, p0, Landroidx/compose/ui/platform/P1$a$a;->E:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 6

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

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:134)"

    const v2, -0x773f589e

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Landroidx/compose/ui/platform/P1$a$a;->D:Landroidx/compose/ui/platform/P1;

    invoke-virtual {p2}, Landroidx/compose/ui/platform/P1;->G()Landroidx/compose/ui/platform/r;

    move-result-object p2

    sget v0, Lh0/l;->K:I

    invoke-virtual {p2, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ly7/W;->o(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p2, Ljava/util/Set;

    goto :goto_1

    :cond_3
    move-object p2, v1

    :goto_1
    if-nez p2, :cond_7

    iget-object p2, p0, Landroidx/compose/ui/platform/P1$a$a;->D:Landroidx/compose/ui/platform/P1;

    invoke-virtual {p2}, Landroidx/compose/ui/platform/P1;->G()Landroidx/compose/ui/platform/r;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of v0, p2, Landroid/view/View;

    if-eqz v0, :cond_4

    check-cast p2, Landroid/view/View;

    goto :goto_2

    :cond_4
    move-object p2, v1

    :goto_2
    if-eqz p2, :cond_5

    sget v0, Lh0/l;->K:I

    invoke-virtual {p2, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p2

    goto :goto_3

    :cond_5
    move-object p2, v1

    :goto_3
    invoke-static {p2}, Ly7/W;->o(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    check-cast p2, Ljava/util/Set;

    goto :goto_4

    :cond_6
    move-object p2, v1

    :cond_7
    :goto_4
    if-eqz p2, :cond_8

    invoke-interface {p1}, LV/n;->k()Lg0/a;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, LV/n;->a()V

    :cond_8
    iget-object v0, p0, Landroidx/compose/ui/platform/P1$a$a;->D:Landroidx/compose/ui/platform/P1;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/P1;->G()Landroidx/compose/ui/platform/r;

    move-result-object v0

    iget-object v2, p0, Landroidx/compose/ui/platform/P1$a$a;->D:Landroidx/compose/ui/platform/P1;

    invoke-interface {p1, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, Landroidx/compose/ui/platform/P1$a$a;->D:Landroidx/compose/ui/platform/P1;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_9

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_a

    :cond_9
    new-instance v4, Landroidx/compose/ui/platform/P1$a$a$a;

    invoke-direct {v4, v3, v1}, Landroidx/compose/ui/platform/P1$a$a$a;-><init>(Landroidx/compose/ui/platform/P1;Lm7/e;)V

    invoke-interface {p1, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lx7/p;

    const/4 v2, 0x0

    invoke-static {v0, v4, p1, v2}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    iget-object v0, p0, Landroidx/compose/ui/platform/P1$a$a;->D:Landroidx/compose/ui/platform/P1;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/P1;->G()Landroidx/compose/ui/platform/r;

    move-result-object v0

    iget-object v3, p0, Landroidx/compose/ui/platform/P1$a$a;->D:Landroidx/compose/ui/platform/P1;

    invoke-interface {p1, v3}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, p0, Landroidx/compose/ui/platform/P1$a$a;->D:Landroidx/compose/ui/platform/P1;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_b

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_c

    :cond_b
    new-instance v5, Landroidx/compose/ui/platform/P1$a$a$b;

    invoke-direct {v5, v4, v1}, Landroidx/compose/ui/platform/P1$a$a$b;-><init>(Landroidx/compose/ui/platform/P1;Lm7/e;)V

    invoke-interface {p1, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lx7/p;

    invoke-static {v0, v5, p1, v2}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-static {}, Lg0/d;->a()LV/O0;

    move-result-object v0

    invoke-virtual {v0, p2}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object p2

    new-instance v0, Landroidx/compose/ui/platform/P1$a$a$c;

    iget-object v1, p0, Landroidx/compose/ui/platform/P1$a$a;->D:Landroidx/compose/ui/platform/P1;

    iget-object v2, p0, Landroidx/compose/ui/platform/P1$a$a;->E:Lx7/p;

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/platform/P1$a$a$c;-><init>(Landroidx/compose/ui/platform/P1;Lx7/p;)V

    const/16 v1, 0x36

    const v2, -0x4722c3de

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p1, v1}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    sget v1, LV/P0;->i:I

    or-int/lit8 v1, v1, 0x30

    invoke-static {p2, v0, p1, v1}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-static {}, LV/q;->P()V

    :cond_d
    :goto_5
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/P1$a$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
