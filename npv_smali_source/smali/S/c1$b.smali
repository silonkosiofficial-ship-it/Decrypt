.class final LS/c1$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/c1;->a(Landroidx/compose/ui/d;Lo0/e2;JJFFLv/g;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Lo0/e2;

.field final synthetic F:J

.field final synthetic G:F

.field final synthetic H:Lv/g;

.field final synthetic I:F

.field final synthetic J:Lx7/p;


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;Lo0/e2;JFLv/g;FLx7/p;)V
    .locals 0

    iput-object p1, p0, LS/c1$b;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LS/c1$b;->E:Lo0/e2;

    iput-wide p3, p0, LS/c1$b;->F:J

    iput p5, p0, LS/c1$b;->G:F

    iput-object p6, p0, LS/c1$b;->H:Lv/g;

    iput p7, p0, LS/c1$b;->I:F

    iput-object p8, p0, LS/c1$b;->J:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 9

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

    const-string v1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)"

    const v2, -0x43a11cd

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v3, p0, LS/c1$b;->D:Landroidx/compose/ui/d;

    iget-object v4, p0, LS/c1$b;->E:Lo0/e2;

    iget-wide v0, p0, LS/c1$b;->F:J

    iget p2, p0, LS/c1$b;->G:F

    const/4 v2, 0x0

    invoke-static {v0, v1, p2, p1, v2}, LS/c1;->e(JFLV/n;I)J

    move-result-wide v5

    iget-object v7, p0, LS/c1$b;->H:Lv/g;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p2

    iget v0, p0, LS/c1$b;->I:F

    check-cast p2, LY0/e;

    invoke-interface {p2, v0}, LY0/e;->B0(F)F

    move-result v8

    invoke-static/range {v3 .. v8}, LS/c1;->d(Landroidx/compose/ui/d;Lo0/e2;JLv/g;F)Landroidx/compose/ui/d;

    move-result-object p2

    sget-object v0, LS/c1$b$a;->D:LS/c1$b$a;

    invoke-static {p2, v2, v0}, LK0/n;->c(Landroidx/compose/ui/d;ZLx7/l;)Landroidx/compose/ui/d;

    move-result-object p2

    sget-object v0, Li7/M;->a:Li7/M;

    new-instance v1, LS/c1$b$b;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, LS/c1$b$b;-><init>(Lm7/e;)V

    invoke-static {p2, v0, v1}, Lz0/U;->d(Landroidx/compose/ui/d;Ljava/lang/Object;Lx7/p;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LS/c1$b;->J:Lx7/p;

    sget-object v1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v1}, Lh0/c$a;->o()Lh0/c;

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v1

    invoke-static {p1, v2}, LV/k;->a(LV/n;I)I

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

    if-nez v7, :cond_3

    invoke-static {}, LV/k;->c()V

    :cond_3
    invoke-interface {p1}, LV/n;->t()V

    invoke-interface {p1}, LV/n;->o()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {p1, v6}, LV/n;->B(Lx7/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LV/n;->H()V

    :goto_1
    invoke-static {p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v6

    invoke-virtual {v5}, LF0/g$a;->c()Lx7/p;

    move-result-object v7

    invoke-static {v6, v1, v7}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->e()Lx7/p;

    move-result-object v1

    invoke-static {v6, v4, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->b()Lx7/p;

    move-result-object v1

    invoke-interface {v6}, LV/n;->o()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v1}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_6
    invoke-virtual {v5}, LF0/g$a;->d()Lx7/p;

    move-result-object v1

    invoke-static {v6, p2, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object p2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LS/c1$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
