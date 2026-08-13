.class final LS/q1$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->b(LS/t1;LS/o1;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/t1;

.field final synthetic E:LS/o1;


# direct methods
.method constructor <init>(LS/t1;LS/o1;)V
    .locals 0

    iput-object p1, p0, LS/q1$c;->D:LS/t1;

    iput-object p2, p0, LS/q1$c;->E:LS/o1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 11

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

    const-string v1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1132)"

    const v2, -0x1c7c60b5

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LS/q1$c;->D:LS/t1;

    iget-object v0, p0, LS/q1$c;->E:LS/o1;

    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v2, LA/b;->a:LA/b;

    invoke-virtual {v2}, LA/b;->f()LA/b$e;

    move-result-object v2

    sget-object v3, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v3}, Lh0/c$a;->l()Lh0/c$c;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, p1, v4}, LA/I;->b(LA/b$e;Lh0/c$c;LV/n;I)LD0/I;

    move-result-object v2

    invoke-static {p1, v4}, LV/k;->a(LV/n;I)I

    move-result v3

    invoke-interface {p1}, LV/n;->F()LV/z;

    move-result-object v4

    invoke-static {p1, v1}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v5

    sget-object v6, LF0/g;->a:LF0/g$a;

    invoke-virtual {v6}, LF0/g$a;->a()Lx7/a;

    move-result-object v7

    invoke-interface {p1}, LV/n;->v()LV/g;

    move-result-object v8

    instance-of v8, v8, LV/g;

    if-nez v8, :cond_3

    invoke-static {}, LV/k;->c()V

    :cond_3
    invoke-interface {p1}, LV/n;->t()V

    invoke-interface {p1}, LV/n;->o()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {p1, v7}, LV/n;->B(Lx7/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LV/n;->H()V

    :goto_1
    invoke-static {p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v7

    invoke-virtual {v6}, LF0/g$a;->c()Lx7/p;

    move-result-object v8

    invoke-static {v7, v2, v8}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v6}, LF0/g$a;->e()Lx7/p;

    move-result-object v2

    invoke-static {v7, v4, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v6}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v7}, LV/n;->o()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_6
    invoke-virtual {v6}, LF0/g$a;->d()Lx7/p;

    move-result-object v2

    invoke-static {v7, v5, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v2, LA/M;->a:LA/M;

    sget-object v2, LU/E;->a:LU/E;

    invoke-virtual {v2}, LU/E;->w()F

    move-result v3

    invoke-virtual {v2}, LU/E;->u()F

    move-result v4

    invoke-static {v1, v3, v4}, Landroidx/compose/foundation/layout/p;->q(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;

    move-result-object v3

    invoke-static {p2}, LS/q1;->W(LS/t1;)I

    move-result v4

    sget-object v10, LS/s1;->b:LS/s1$a;

    invoke-virtual {v10}, LS/s1$a;->a()I

    move-result v6

    const/16 v9, 0xc06

    move-object v5, p2

    move-object v7, v0

    move-object v8, p1

    invoke-static/range {v3 .. v9}, LS/q1;->F(Landroidx/compose/ui/d;ILS/t1;ILS/o1;LV/n;I)V

    invoke-static {}, LS/q1;->K()F

    move-result v3

    invoke-virtual {v2}, LU/E;->s()F

    move-result v4

    invoke-static {v1, v3, v4}, Landroidx/compose/foundation/layout/p;->q(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v3, p1, v4}, LS/q1;->B(Landroidx/compose/ui/d;LV/n;I)V

    invoke-virtual {v2}, LU/E;->w()F

    move-result v3

    invoke-virtual {v2}, LU/E;->u()F

    move-result v2

    invoke-static {v1, v3, v2}, Landroidx/compose/foundation/layout/p;->q(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;

    move-result-object v3

    invoke-interface {p2}, LS/t1;->a()I

    move-result v4

    invoke-virtual {v10}, LS/s1$a;->b()I

    move-result v6

    invoke-static/range {v3 .. v9}, LS/q1;->F(Landroidx/compose/ui/d;ILS/t1;ILS/o1;LV/n;I)V

    invoke-interface {p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    :goto_2
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/q1$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
