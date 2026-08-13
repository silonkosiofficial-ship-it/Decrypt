.class final LT/A$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/A;->a(LT/G;Ljava/lang/String;Lx7/p;LS0/g0;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZZZLz/j;LA/B;LS/i1;Lx7/p;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/G1;

.field final synthetic E:J

.field final synthetic F:LM0/P;

.field final synthetic G:Lx7/p;


# direct methods
.method constructor <init>(LV/G1;JLM0/P;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LT/A$g;->D:LV/G1;

    iput-wide p2, p0, LT/A$g;->E:J

    iput-object p4, p0, LT/A$g;->F:LM0/P;

    iput-object p5, p0, LT/A$g;->G:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:178)"

    const v2, 0x105afde6

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    iget-object v0, p0, LT/A$g;->D:LV/G1;

    invoke-interface {p1, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, LT/A$g;->D:LV/G1;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_3

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_4

    :cond_3
    new-instance v2, LT/A$g$a;

    invoke-direct {v2, v1}, LT/A$g$a;-><init>(LV/G1;)V

    invoke-interface {p1, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lx7/l;

    invoke-static {p2, v2}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-wide v0, p0, LT/A$g;->E:J

    iget-object v2, p0, LT/A$g;->F:LM0/P;

    iget-object v3, p0, LT/A$g;->G:Lx7/p;

    sget-object v4, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v4}, Lh0/c$a;->o()Lh0/c;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v4

    invoke-static {p1, v5}, LV/k;->a(LV/n;I)I

    move-result v5

    invoke-interface {p1}, LV/n;->F()LV/z;

    move-result-object v6

    invoke-static {p1, p2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    sget-object v7, LF0/g;->a:LF0/g$a;

    invoke-virtual {v7}, LF0/g$a;->a()Lx7/a;

    move-result-object v8

    invoke-interface {p1}, LV/n;->v()LV/g;

    move-result-object v9

    instance-of v9, v9, LV/g;

    if-nez v9, :cond_5

    invoke-static {}, LV/k;->c()V

    :cond_5
    invoke-interface {p1}, LV/n;->t()V

    invoke-interface {p1}, LV/n;->o()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {p1, v8}, LV/n;->B(Lx7/a;)V

    goto :goto_1

    :cond_6
    invoke-interface {p1}, LV/n;->H()V

    :goto_1
    invoke-static {p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v8

    invoke-virtual {v7}, LF0/g$a;->c()Lx7/p;

    move-result-object v9

    invoke-static {v8, v4, v9}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v7}, LF0/g$a;->e()Lx7/p;

    move-result-object v4

    invoke-static {v8, v6, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v7}, LF0/g$a;->b()Lx7/p;

    move-result-object v4

    invoke-interface {v8}, LV/n;->o()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-interface {v8}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v4}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_8
    invoke-virtual {v7}, LF0/g$a;->d()Lx7/p;

    move-result-object v4

    invoke-static {v8, p2, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object p2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const/4 v5, 0x0

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LT/A;->f(JLM0/P;Lx7/p;LV/n;I)V

    invoke-interface {p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_2
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LT/A$g;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
