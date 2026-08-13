.class final LS/w0$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/w0;->a(LA/L;ZLx7/a;Lx7/p;Landroidx/compose/ui/d;ZLx7/p;ZLS/u0;Lz/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/u0;

.field final synthetic E:Z

.field final synthetic F:Z

.field final synthetic G:Lx7/p;

.field final synthetic H:Z

.field final synthetic I:Lx7/p;


# direct methods
.method constructor <init>(LS/u0;ZZLx7/p;ZLx7/p;)V
    .locals 0

    iput-object p1, p0, LS/w0$f;->D:LS/u0;

    iput-boolean p2, p0, LS/w0$f;->E:Z

    iput-boolean p3, p0, LS/w0$f;->F:Z

    iput-object p4, p0, LS/w0$f;->G:Lx7/p;

    iput-boolean p5, p0, LS/w0$f;->H:Z

    iput-object p6, p0, LS/w0$f;->I:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method

.method private static final e(LV/G1;)J
    .locals 2

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo0/y0;

    invoke-virtual {p0}, Lo0/y0;->w()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 10

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

    const-string v1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:186)"

    const v2, -0x549d0324

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LS/w0$f;->D:LS/u0;

    iget-boolean v0, p0, LS/w0$f;->E:Z

    iget-boolean v1, p0, LS/w0$f;->F:Z

    invoke-virtual {p2, v0, v1}, LS/u0;->b(ZZ)J

    move-result-wide v2

    const/16 p2, 0x64

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static {p2, v1, v4, v0, v4}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v4

    const/16 v8, 0x30

    const/16 v9, 0xc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p1

    invoke-static/range {v2 .. v9}, Lt/w;->a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object p2

    iget-object v0, p0, LS/w0$f;->G:Lx7/p;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, LS/w0$f;->H:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, LS/w0$f;->E:Z

    if-eqz v0, :cond_4

    :cond_3
    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v2, LS/w0$f$a;->D:LS/w0$f$a;

    invoke-static {v0, v2}, LK0/n;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v0

    goto :goto_1

    :cond_4
    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :goto_1
    iget-object v2, p0, LS/w0$f;->I:Lx7/p;

    sget-object v3, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v3}, Lh0/c$a;->o()Lh0/c;

    move-result-object v3

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v3

    invoke-static {p1, v1}, LV/k;->a(LV/n;I)I

    move-result v1

    invoke-interface {p1}, LV/n;->F()LV/z;

    move-result-object v4

    invoke-static {p1, v0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

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

    goto :goto_2

    :cond_6
    invoke-interface {p1}, LV/n;->H()V

    :goto_2
    invoke-static {p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v6

    invoke-virtual {v5}, LF0/g$a;->c()Lx7/p;

    move-result-object v7

    invoke-static {v6, v3, v7}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->e()Lx7/p;

    move-result-object v3

    invoke-static {v6, v4, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->b()Lx7/p;

    move-result-object v3

    invoke-interface {v6}, LV/n;->o()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-interface {v6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v1, v3}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_8
    invoke-virtual {v5}, LF0/g$a;->d()Lx7/p;

    move-result-object v1

    invoke-static {v6, v0, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v0

    invoke-static {p2}, LS/w0$f;->e(LV/G1;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object p2

    invoke-virtual {v0, p2}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object p2

    sget v0, LV/P0;->i:I

    invoke-static {p2, v2, p1, v0}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    invoke-interface {p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_3
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/w0$f;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
