.class final LS/q1$e$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1$e$b;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lr/l;

.field final synthetic E:LS/c;

.field final synthetic F:Z


# direct methods
.method constructor <init>(Lr/l;LS/c;Z)V
    .locals 0

    iput-object p1, p0, LS/q1$e$b$a;->D:Lr/l;

    iput-object p2, p0, LS/q1$e$b$a;->E:LS/c;

    iput-boolean p3, p0, LS/q1$e$b$a;->F:Z

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

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)"

    const v2, 0x76c8d1d0

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    const p2, 0x5c360fd6

    invoke-interface {p1, p2}, LV/n;->T(I)V

    iget-object p2, p0, LS/q1$e$b$a;->D:Lr/l;

    invoke-virtual {p2}, Lr/l;->b()I

    move-result p2

    iget-object v6, p0, LS/q1$e$b$a;->E:LS/c;

    iget-object v7, p0, LS/q1$e$b$a;->D:Lr/l;

    iget-boolean v8, p0, LS/q1$e$b$a;->F:Z

    const/4 v9, 0x0

    move v10, v9

    :goto_1
    const/4 v0, 0x1

    if-ge v10, p2, :cond_7

    invoke-virtual {v6}, LS/c;->h()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v6}, LS/c;->g()I

    move-result v1

    sget-object v2, LS/s1;->b:LS/s1$a;

    invoke-virtual {v2}, LS/s1$a;->b()I

    move-result v2

    invoke-static {v1, v2}, LS/s1;->f(II)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v7, v10}, Lr/l;->a(I)I

    move-result v1

    rem-int/lit8 v1, v1, 0xc

    :goto_2
    move v2, v1

    goto :goto_4

    :cond_4
    :goto_3
    invoke-virtual {v7, v10}, Lr/l;->a(I)I

    move-result v1

    goto :goto_2

    :goto_4
    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {p1, v10}, LV/n;->i(I)Z

    move-result v3

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_5

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_6

    :cond_5
    new-instance v4, LS/q1$e$b$a$a;

    invoke-direct {v4, v10}, LS/q1$e$b$a$a;-><init>(I)V

    invoke-interface {p1, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lx7/l;

    const/4 v3, 0x0

    invoke-static {v1, v9, v4, v0, v3}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    const/4 v5, 0x0

    move-object v1, v6

    move v3, v8

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LS/q1;->w(Landroidx/compose/ui/d;LS/c;IZLV/n;I)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_7
    invoke-interface {p1}, LV/n;->J()V

    iget-object p2, p0, LS/q1$e$b$a;->E:LS/c;

    invoke-virtual {p2}, LS/c;->g()I

    move-result p2

    sget-object v1, LS/s1;->b:LS/s1$a;

    invoke-virtual {v1}, LS/s1$a;->a()I

    move-result v1

    invoke-static {p2, v1}, LS/s1;->f(II)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, p0, LS/q1$e$b$a;->E:LS/c;

    invoke-virtual {p2}, LS/c;->h()Z

    move-result p2

    if-eqz p2, :cond_8

    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v1, LS/l0;->D:LS/l0;

    invoke-static {p2, v1}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p2

    sget-object v1, LU/E;->a:LU/E;

    invoke-virtual {v1}, LU/E;->b()F

    move-result v1

    invoke-static {p2, v1}, Landroidx/compose/foundation/layout/p;->p(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object p2

    invoke-static {}, LG/g;->e()LG/f;

    move-result-object v1

    sget-object v2, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v2}, Lo0/y0$a;->f()J

    move-result-wide v2

    invoke-static {p2, v2, v3, v1}, Landroidx/compose/foundation/b;->a(Landroidx/compose/ui/d;JLo0/e2;)Landroidx/compose/ui/d;

    move-result-object v4

    invoke-static {}, LS/q1;->N()F

    move-result v5

    new-instance p2, LS/q1$e$b$a$b;

    iget-object v1, p0, LS/q1$e$b$a;->E:LS/c;

    iget-boolean v2, p0, LS/q1$e$b$a;->F:Z

    invoke-direct {p2, v1, v2}, LS/q1$e$b$a$b;-><init>(LS/c;Z)V

    const/16 v1, 0x36

    const v2, -0xc3f235d

    invoke-static {v2, v0, p2, p1, v1}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v6

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    move-object v7, p1

    invoke-static/range {v4 .. v9}, LS/q1;->u(Landroidx/compose/ui/d;FLx7/p;LV/n;II)V

    :cond_8
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_5
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/q1$e$b$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
