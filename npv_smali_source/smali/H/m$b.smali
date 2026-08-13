.class final LH/m$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/m;->a(Landroidx/compose/ui/d;LM0/P;II)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I

.field final synthetic E:I

.field final synthetic F:LM0/P;


# direct methods
.method constructor <init>(IILM0/P;)V
    .locals 0

    iput p1, p0, LH/m$b;->D:I

    iput p2, p0, LH/m$b;->E:I

    iput-object p3, p0, LH/m$b;->F:LM0/P;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method

.method private static final e(LV/G1;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 8

    .prologue
    const p1, 0x1855405a

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)"

    invoke-static {p1, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    iget p1, p0, LH/m$b;->D:I

    iget p3, p0, LH/m$b;->E:I

    invoke-static {p1, p3}, LH/m;->b(II)V

    iget p1, p0, LH/m$b;->D:I

    const p3, 0x7fffffff

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    iget p1, p0, LH/m$b;->E:I

    if-ne p1, p3, :cond_2

    sget-object p1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p2}, LV/n;->J()V

    return-object p1

    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object p1

    invoke-interface {p2, p1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/e;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->g()LV/O0;

    move-result-object v1

    invoke-interface {p2, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LR0/h$b;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->k()LV/O0;

    move-result-object v2

    invoke-interface {p2, v2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/v;

    iget-object v3, p0, LH/m$b;->F:LM0/P;

    invoke-interface {p2, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p2, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, p0, LH/m$b;->F:LM0/P;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_3

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_4

    :cond_3
    invoke-static {v4, v2}, LM0/Q;->d(LM0/P;LY0/v;)LM0/P;

    move-result-object v5

    invoke-interface {p2, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, LM0/P;

    invoke-interface {p2, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p2, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_5

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_9

    :cond_5
    invoke-virtual {v5}, LM0/P;->j()LR0/h;

    move-result-object v3

    invoke-virtual {v5}, LM0/P;->o()LR0/q;

    move-result-object v4

    if-nez v4, :cond_6

    sget-object v4, LR0/q;->D:LR0/q$a;

    invoke-virtual {v4}, LR0/q$a;->d()LR0/q;

    move-result-object v4

    :cond_6
    invoke-virtual {v5}, LM0/P;->m()LR0/o;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {v6}, LR0/o;->i()I

    move-result v6

    goto :goto_0

    :cond_7
    sget-object v6, LR0/o;->b:LR0/o$a;

    invoke-virtual {v6}, LR0/o$a;->b()I

    move-result v6

    :goto_0
    invoke-virtual {v5}, LM0/P;->n()LR0/p;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-virtual {v7}, LR0/p;->k()I

    move-result v7

    goto :goto_1

    :cond_8
    sget-object v7, LR0/p;->b:LR0/p$a;

    invoke-virtual {v7}, LR0/p$a;->a()I

    move-result v7

    :goto_1
    invoke-interface {v1, v3, v4, v6, v7}, LR0/h$b;->a(LR0/h;LR0/q;II)LV/G1;

    move-result-object v4

    invoke-interface {p2, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v4, LV/G1;

    invoke-static {v4}, LH/m$b;->e(LV/G1;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p2, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {p2, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    iget-object v7, p0, LH/m$b;->F:LM0/P;

    invoke-interface {p2, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {p2, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {p2, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v6

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_a

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_b

    :cond_a
    invoke-static {}, LH/I;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, p1, v1, v3, v0}, LH/I;->a(LM0/P;LY0/e;LR0/h$b;Ljava/lang/String;I)J

    move-result-wide v6

    invoke-static {v6, v7}, LY0/t;->f(J)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {p2, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v4}, LH/m$b;->e(LV/G1;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {p2, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    iget-object v7, p0, LH/m$b;->F:LM0/P;

    invoke-interface {p2, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {p2, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v6

    invoke-interface {p2, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_c

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_d

    :cond_c
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LH/I;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0xa

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, LH/I;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x2

    invoke-static {v5, p1, v1, v2, v4}, LH/I;->a(LM0/P;LY0/e;LR0/h$b;Ljava/lang/String;I)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/t;->f(J)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p2, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v1

    sub-int/2addr v1, v3

    iget v2, p0, LH/m$b;->D:I

    const/4 v4, 0x0

    if-ne v2, v0, :cond_e

    move-object v2, v4

    goto :goto_2

    :cond_e
    sub-int/2addr v2, v0

    mul-int/2addr v2, v1

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_2
    iget v5, p0, LH/m$b;->E:I

    if-ne v5, p3, :cond_f

    goto :goto_3

    :cond_f
    sub-int/2addr v5, v0

    mul-int/2addr v1, v5

    add-int/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_3
    sget-object p3, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1, v0}, LY0/e;->o0(I)F

    move-result v0

    goto :goto_4

    :cond_10
    sget-object v0, LY0/i;->D:LY0/i$a;

    invoke-virtual {v0}, LY0/i$a;->c()F

    move-result v0

    :goto_4
    if-eqz v4, :cond_11

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p1, v1}, LY0/e;->o0(I)F

    move-result p1

    goto :goto_5

    :cond_11
    sget-object p1, LY0/i;->D:LY0/i$a;

    invoke-virtual {p1}, LY0/i$a;->c()F

    move-result p1

    :goto_5
    invoke-static {p3, v0, p1}, Landroidx/compose/foundation/layout/p;->h(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_12

    invoke-static {}, LV/q;->P()V

    :cond_12
    invoke-interface {p2}, LV/n;->J()V

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LH/m$b;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
