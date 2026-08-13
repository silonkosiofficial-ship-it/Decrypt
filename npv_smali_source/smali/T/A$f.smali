.class final LT/A$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


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

    iput-object p1, p0, LT/A$f;->D:LV/G1;

    iput-wide p2, p0, LT/A$f;->E:J

    iput-object p4, p0, LT/A$f;->F:LM0/P;

    iput-object p5, p0, LT/A$f;->G:Lx7/p;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;LV/n;I)V
    .locals 9

    .prologue
    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LV/n;->A()V

    goto/16 :goto_3

    :cond_3
    :goto_1
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)"

    const v2, -0x275ecc34

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object p3, p0, LT/A$f;->D:LV/G1;

    invoke-interface {p2, p3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p3

    iget-object v0, p0, LT/A$f;->D:LV/G1;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_5

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_6

    :cond_5
    new-instance v1, LT/A$f$a;

    invoke-direct {v1, v0}, LT/A$f$a;-><init>(LV/G1;)V

    invoke-interface {p2, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lx7/l;

    invoke-static {p1, v1}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p1

    iget-wide v0, p0, LT/A$f;->E:J

    iget-object v2, p0, LT/A$f;->F:LM0/P;

    iget-object v3, p0, LT/A$f;->G:Lx7/p;

    sget-object p3, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {p3}, Lh0/c$a;->o()Lh0/c;

    move-result-object p3

    const/4 v4, 0x0

    invoke-static {p3, v4}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object p3

    invoke-static {p2, v4}, LV/k;->a(LV/n;I)I

    move-result v4

    invoke-interface {p2}, LV/n;->F()LV/z;

    move-result-object v5

    invoke-static {p2, p1}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    sget-object v6, LF0/g;->a:LF0/g$a;

    invoke-virtual {v6}, LF0/g$a;->a()Lx7/a;

    move-result-object v7

    invoke-interface {p2}, LV/n;->v()LV/g;

    move-result-object v8

    instance-of v8, v8, LV/g;

    if-nez v8, :cond_7

    invoke-static {}, LV/k;->c()V

    :cond_7
    invoke-interface {p2}, LV/n;->t()V

    invoke-interface {p2}, LV/n;->o()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {p2, v7}, LV/n;->B(Lx7/a;)V

    goto :goto_2

    :cond_8
    invoke-interface {p2}, LV/n;->H()V

    :goto_2
    invoke-static {p2}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v7

    invoke-virtual {v6}, LF0/g$a;->c()Lx7/p;

    move-result-object v8

    invoke-static {v7, p3, v8}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v6}, LF0/g$a;->e()Lx7/p;

    move-result-object p3

    invoke-static {v7, v5, p3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v6}, LF0/g$a;->b()Lx7/p;

    move-result-object p3

    invoke-interface {v7}, LV/n;->o()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, p3}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_a
    invoke-virtual {v6}, LF0/g$a;->d()Lx7/p;

    move-result-object p3

    invoke-static {v7, p1, p3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object p1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const/4 v5, 0x0

    move-object v4, p2

    invoke-static/range {v0 .. v5}, LT/A;->f(JLM0/P;Lx7/p;LV/n;I)V

    invoke-interface {p2}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, LV/q;->P()V

    :cond_b
    :goto_3
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LT/A$f;->a(Landroidx/compose/ui/d;LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
