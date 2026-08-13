.class final LN/a$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/a$b;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:J

.field final synthetic E:Z

.field final synthetic F:Landroidx/compose/ui/d;

.field final synthetic G:LN/i;


# direct methods
.method constructor <init>(JZLandroidx/compose/ui/d;LN/i;)V
    .locals 0

    iput-wide p1, p0, LN/a$b$a;->D:J

    iput-boolean p3, p0, LN/a$b$a;->E:Z

    iput-object p4, p0, LN/a$b$a;->F:Landroidx/compose/ui/d;

    iput-object p5, p0, LN/a$b$a;->G:LN/i;

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

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:83)"

    const v2, -0x5505aa6f

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-wide v0, p0, LN/a$b$a;->D:J

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p2, v0, v2

    const/4 v0, 0x0

    if-eqz p2, :cond_a

    const p2, -0x31eeb398    # -6.0942592E8f

    invoke-interface {p1, p2}, LV/n;->T(I)V

    iget-boolean p2, p0, LN/a$b$a;->E:Z

    if-eqz p2, :cond_3

    sget-object p2, LA/b$a;->a:LA/b$a;

    invoke-virtual {p2}, LA/b$a;->b()LA/b$e;

    move-result-object p2

    goto :goto_1

    :cond_3
    sget-object p2, LA/b$a;->a:LA/b$a;

    invoke-virtual {p2}, LA/b$a;->a()LA/b$e;

    move-result-object p2

    :goto_1
    iget-object v1, p0, LN/a$b$a;->F:Landroidx/compose/ui/d;

    iget-wide v2, p0, LN/a$b$a;->D:J

    invoke-static {v2, v3}, LY0/l;->h(J)F

    move-result v2

    iget-wide v3, p0, LN/a$b$a;->D:J

    invoke-static {v3, v4}, LY0/l;->g(J)F

    move-result v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/p;->n(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    iget-object v2, p0, LN/a$b$a;->G:LN/i;

    iget-boolean v3, p0, LN/a$b$a;->E:Z

    sget-object v4, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v4}, Lh0/c$a;->l()Lh0/c$c;

    move-result-object v4

    invoke-static {p2, v4, p1, v0}, LA/I;->b(LA/b$e;Lh0/c$c;LV/n;I)LD0/I;

    move-result-object p2

    invoke-static {p1, v0}, LV/k;->a(LV/n;I)I

    move-result v0

    invoke-interface {p1}, LV/n;->F()LV/z;

    move-result-object v4

    invoke-static {p1, v1}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    sget-object v5, LF0/g;->a:LF0/g$a;

    invoke-virtual {v5}, LF0/g$a;->a()Lx7/a;

    move-result-object v6

    invoke-interface {p1}, LV/n;->v()LV/g;

    move-result-object v7

    instance-of v7, v7, LV/g;

    if-nez v7, :cond_4

    invoke-static {}, LV/k;->c()V

    :cond_4
    invoke-interface {p1}, LV/n;->t()V

    invoke-interface {p1}, LV/n;->o()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {p1, v6}, LV/n;->B(Lx7/a;)V

    goto :goto_2

    :cond_5
    invoke-interface {p1}, LV/n;->H()V

    :goto_2
    invoke-static {p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v6

    invoke-virtual {v5}, LF0/g$a;->c()Lx7/p;

    move-result-object v7

    invoke-static {v6, p2, v7}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->e()Lx7/p;

    move-result-object p2

    invoke-static {v6, v4, p2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->b()Lx7/p;

    move-result-object p2

    invoke-interface {v6}, LV/n;->o()Z

    move-result v4

    if-nez v4, :cond_6

    invoke-interface {v6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    :cond_6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0, p2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_7
    invoke-virtual {v5}, LF0/g$a;->d()Lx7/p;

    move-result-object p2

    invoke-static {v6, v1, p2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object p2, LA/M;->a:LA/M;

    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {p1, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_8

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_9

    :cond_8
    new-instance v1, LN/a$b$a$a;

    invoke-direct {v1, v2}, LN/a$b$a$a;-><init>(LN/i;)V

    invoke-interface {p1, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, Lx7/a;

    const/4 v0, 0x6

    invoke-static {p2, v1, v3, p1, v0}, LN/a;->c(Landroidx/compose/ui/d;Lx7/a;ZLV/n;I)V

    invoke-interface {p1}, LV/n;->Q()V

    :goto_3
    invoke-interface {p1}, LV/n;->J()V

    goto :goto_4

    :cond_a
    const p2, -0x31e194f0

    invoke-interface {p1, p2}, LV/n;->T(I)V

    iget-object p2, p0, LN/a$b$a;->F:Landroidx/compose/ui/d;

    iget-object v1, p0, LN/a$b$a;->G:LN/i;

    invoke-interface {p1, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, LN/a$b$a;->G:LN/i;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_b

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_c

    :cond_b
    new-instance v3, LN/a$b$a$b;

    invoke-direct {v3, v2}, LN/a$b$a$b;-><init>(LN/i;)V

    invoke-interface {p1, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v3, Lx7/a;

    iget-boolean v1, p0, LN/a$b$a;->E:Z

    invoke-static {p2, v3, v1, p1, v0}, LN/a;->c(Landroidx/compose/ui/d;Lx7/a;ZLV/n;I)V

    goto :goto_3

    :goto_4
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

    invoke-virtual {p0, p1, p2}, LN/a$b$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
