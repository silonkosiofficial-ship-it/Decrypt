.class final LS/s0$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/s0;->d(Lx7/p;Lx7/a;Landroidx/compose/ui/d;Lx7/p;Lx7/p;ZLS/r0;LA/B;Lz/l;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:LS/r0;

.field final synthetic F:Z

.field final synthetic G:Lx7/p;

.field final synthetic H:LA/L;

.field final synthetic I:Lx7/p;


# direct methods
.method constructor <init>(Lx7/p;LS/r0;ZLx7/p;LA/L;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LS/s0$f;->D:Lx7/p;

    iput-object p2, p0, LS/s0$f;->E:LS/r0;

    iput-boolean p3, p0, LS/s0$f;->F:Z

    iput-object p4, p0, LS/s0$f;->G:Lx7/p;

    iput-object p5, p0, LS/s0$f;->H:LA/L;

    iput-object p6, p0, LS/s0$f;->I:Lx7/p;

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

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:473)"

    const v2, 0x3f7b66ec

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    const p2, 0x4b618bb8    # 1.4781368E7f

    invoke-interface {p1, p2}, LV/n;->T(I)V

    iget-object p2, p0, LS/s0$f;->D:Lx7/p;

    const/16 v0, 0x36

    const/4 v1, 0x1

    if-eqz p2, :cond_3

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object p2

    iget-object v2, p0, LS/s0$f;->E:LS/r0;

    iget-boolean v3, p0, LS/s0$f;->F:Z

    invoke-virtual {v2, v3}, LS/r0;->a(Z)J

    move-result-wide v2

    invoke-static {v2, v3}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v2

    invoke-virtual {p2, v2}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object p2

    new-instance v2, LS/s0$f$a;

    iget-object v3, p0, LS/s0$f;->D:Lx7/p;

    invoke-direct {v2, v3}, LS/s0$f$a;-><init>(Lx7/p;)V

    const v3, 0x79540fc7

    invoke-static {v3, v1, v2, p1, v0}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v2

    sget v3, LV/P0;->i:I

    or-int/lit8 v3, v3, 0x30

    invoke-static {p2, v2, p1, v3}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    :cond_3
    invoke-interface {p1}, LV/n;->J()V

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object p2

    iget-object v2, p0, LS/s0$f;->E:LS/r0;

    iget-boolean v3, p0, LS/s0$f;->F:Z

    invoke-virtual {v2, v3}, LS/r0;->b(Z)J

    move-result-wide v2

    invoke-static {v2, v3}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v2

    invoke-virtual {p2, v2}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object p2

    new-instance v2, LS/s0$f$b;

    iget-object v3, p0, LS/s0$f;->H:LA/L;

    iget-object v4, p0, LS/s0$f;->D:Lx7/p;

    iget-object v5, p0, LS/s0$f;->G:Lx7/p;

    iget-object v6, p0, LS/s0$f;->I:Lx7/p;

    invoke-direct {v2, v3, v4, v5, v6}, LS/s0$f$b;-><init>(LA/L;Lx7/p;Lx7/p;Lx7/p;)V

    const v3, -0x670cd454

    invoke-static {v3, v1, v2, p1, v0}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v2

    sget v3, LV/P0;->i:I

    or-int/lit8 v4, v3, 0x30

    invoke-static {p2, v2, p1, v4}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    iget-object p2, p0, LS/s0$f;->G:Lx7/p;

    if-eqz p2, :cond_4

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object p2

    iget-object v2, p0, LS/s0$f;->E:LS/r0;

    iget-boolean v4, p0, LS/s0$f;->F:Z

    invoke-virtual {v2, v4}, LS/r0;->c(Z)J

    move-result-wide v4

    invoke-static {v4, v5}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v2

    invoke-virtual {p2, v2}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object p2

    new-instance v2, LS/s0$f$c;

    iget-object v4, p0, LS/s0$f;->G:Lx7/p;

    invoke-direct {v2, v4}, LS/s0$f$c;-><init>(Lx7/p;)V

    const v4, 0x2296dbfe

    invoke-static {v4, v1, v2, p1, v0}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    or-int/lit8 v1, v3, 0x30

    invoke-static {p2, v0, p1, v1}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    :cond_4
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/s0$f;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
