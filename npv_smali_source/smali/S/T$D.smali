.class final LS/T$D;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->k(Landroidx/compose/ui/d;ZZZLjava/lang/String;Lx7/a;Lx7/a;Lx7/a;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/a;

.field final synthetic E:Z

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Lx7/a;

.field final synthetic H:Z

.field final synthetic I:Lx7/a;

.field final synthetic J:Z


# direct methods
.method constructor <init>(Lx7/a;ZLjava/lang/String;Lx7/a;ZLx7/a;Z)V
    .locals 0

    iput-object p1, p0, LS/T$D;->D:Lx7/a;

    iput-boolean p2, p0, LS/T$D;->E:Z

    iput-object p3, p0, LS/T$D;->F:Ljava/lang/String;

    iput-object p4, p0, LS/T$D;->G:Lx7/a;

    iput-boolean p5, p0, LS/T$D;->H:Z

    iput-object p6, p0, LS/T$D;->I:Lx7/a;

    iput-boolean p7, p0, LS/T$D;->J:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 12

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

    const-string v1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2163)"

    const v2, -0x39633dce

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v3, p0, LS/T$D;->D:Lx7/a;

    iget-boolean v4, p0, LS/T$D;->E:Z

    new-instance p2, LS/T$D$a;

    iget-object v0, p0, LS/T$D;->F:Ljava/lang/String;

    invoke-direct {p2, v0}, LS/T$D$a;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x36

    const v1, 0x521783e6

    const/4 v2, 0x1

    invoke-static {v1, v2, p2, p1, v0}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v6

    const/16 v8, 0xc00

    const/4 v9, 0x4

    const/4 v5, 0x0

    move-object v7, p1

    invoke-static/range {v3 .. v9}, LS/T;->z(Lx7/a;ZLandroidx/compose/ui/d;Lx7/p;LV/n;II)V

    iget-boolean p2, p0, LS/T$D;->E:Z

    if-nez p2, :cond_7

    iget-object v0, p0, LS/T$D;->G:Lx7/a;

    iget-boolean v2, p0, LS/T$D;->H:Z

    iget-object p2, p0, LS/T$D;->I:Lx7/a;

    iget-boolean v9, p0, LS/T$D;->J:Z

    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v3, LA/b;->a:LA/b;

    invoke-virtual {v3}, LA/b;->f()LA/b$e;

    move-result-object v3

    sget-object v4, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v4}, Lh0/c$a;->l()Lh0/c$c;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v3, v4, p1, v5}, LA/I;->b(LA/b$e;Lh0/c$c;LV/n;I)LD0/I;

    move-result-object v3

    invoke-static {p1, v5}, LV/k;->a(LV/n;I)I

    move-result v4

    invoke-interface {p1}, LV/n;->F()LV/z;

    move-result-object v5

    invoke-static {p1, v1}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

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

    invoke-static {v7, v3, v8}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v6}, LF0/g$a;->e()Lx7/p;

    move-result-object v3

    invoke-static {v7, v5, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v6}, LF0/g$a;->b()Lx7/p;

    move-result-object v3

    invoke-interface {v7}, LV/n;->o()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v3}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_6
    invoke-virtual {v6}, LF0/g$a;->d()Lx7/p;

    move-result-object v3

    invoke-static {v7, v1, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v1, LA/M;->a:LA/M;

    sget-object v10, LS/D;->a:LS/D;

    invoke-virtual {v10}, LS/D;->c()Lx7/p;

    move-result-object v5

    const/high16 v7, 0x30000

    const/16 v8, 0x1a

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, p1

    invoke-static/range {v0 .. v8}, LS/h0;->a(Lx7/a;Landroidx/compose/ui/d;ZLS/f0;Lz/l;Lx7/p;LV/n;II)V

    invoke-virtual {v10}, LS/D;->d()Lx7/p;

    move-result-object v8

    const/high16 v10, 0x30000

    const/16 v11, 0x1a

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p2

    move v5, v9

    move-object v9, p1

    invoke-static/range {v3 .. v11}, LS/h0;->a(Lx7/a;Landroidx/compose/ui/d;ZLS/f0;Lz/l;Lx7/p;LV/n;II)V

    invoke-interface {p1}, LV/n;->Q()V

    :cond_7
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LV/q;->P()V

    :cond_8
    :goto_2
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$D;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
