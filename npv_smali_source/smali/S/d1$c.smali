.class final LS/d1$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/d1;->a(ZLx7/a;Landroidx/compose/ui/d;ZJJLz/l;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Z

.field final synthetic F:Lz/l;

.field final synthetic G:Lv/G;

.field final synthetic H:Z

.field final synthetic I:Lx7/a;

.field final synthetic J:Lx7/q;


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;ZLz/l;Lv/G;ZLx7/a;Lx7/q;)V
    .locals 0

    iput-object p1, p0, LS/d1$c;->D:Landroidx/compose/ui/d;

    iput-boolean p2, p0, LS/d1$c;->E:Z

    iput-object p3, p0, LS/d1$c;->F:Lz/l;

    iput-object p4, p0, LS/d1$c;->G:Lv/G;

    iput-boolean p5, p0, LS/d1$c;->H:Z

    iput-object p6, p0, LS/d1$c;->I:Lx7/a;

    iput-object p7, p0, LS/d1$c;->J:Lx7/q;

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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:249)"

    const v2, -0x20e5444c

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, LK0/h;->b:LK0/h$a;

    invoke-virtual {p2}, LK0/h$a;->g()I

    move-result p2

    iget-object v0, p0, LS/d1$c;->D:Landroidx/compose/ui/d;

    iget-boolean v1, p0, LS/d1$c;->E:Z

    iget-object v2, p0, LS/d1$c;->F:Lz/l;

    iget-object v3, p0, LS/d1$c;->G:Lv/G;

    iget-boolean v4, p0, LS/d1$c;->H:Z

    invoke-static {p2}, LK0/h;->h(I)LK0/h;

    move-result-object v5

    iget-object v6, p0, LS/d1$c;->I:Lx7/a;

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/selection/a;->a(Landroidx/compose/ui/d;ZLz/l;Lv/G;ZLK0/h;Lx7/a;)Landroidx/compose/ui/d;

    move-result-object p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v1}, Landroidx/compose/foundation/layout/p;->f(Landroidx/compose/ui/d;FILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p2

    sget-object v0, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v0}, Lh0/c$a;->g()Lh0/c$b;

    move-result-object v0

    sget-object v1, LA/b;->a:LA/b;

    invoke-virtual {v1}, LA/b;->b()LA/b$f;

    move-result-object v1

    iget-object v2, p0, LS/d1$c;->J:Lx7/q;

    const/16 v3, 0x36

    invoke-static {v1, v0, p1, v3}, LA/i;->a(LA/b$m;Lh0/c$b;LV/n;I)LD0/I;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v1}, LV/k;->a(LV/n;I)I

    move-result v1

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

    if-nez v6, :cond_3

    invoke-static {}, LV/k;->c()V

    :cond_3
    invoke-interface {p1}, LV/n;->t()V

    invoke-interface {p1}, LV/n;->o()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p1, v5}, LV/n;->B(Lx7/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LV/n;->H()V

    :goto_1
    invoke-static {p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v5

    invoke-virtual {v4}, LF0/g$a;->c()Lx7/p;

    move-result-object v6

    invoke-static {v5, v0, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->e()Lx7/p;

    move-result-object v0

    invoke-static {v5, v3, v0}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->b()Lx7/p;

    move-result-object v0

    invoke-interface {v5}, LV/n;->o()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v1, v0}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_6
    invoke-virtual {v4}, LF0/g$a;->d()Lx7/p;

    move-result-object v0

    invoke-static {v5, p2, v0}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object p2, LA/l;->a:LA/l;

    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, p2, p1, v0}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LS/d1$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
