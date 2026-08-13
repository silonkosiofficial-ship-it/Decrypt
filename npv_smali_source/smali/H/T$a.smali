.class final LH/T$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/T;->a(Landroidx/compose/ui/d;LM0/P;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LM0/P;


# direct methods
.method constructor <init>(LM0/P;)V
    .locals 0

    iput-object p1, p0, LH/T$a;->D:LM0/P;

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
    .locals 11

    .prologue
    const p1, 0x5e56a525

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)"

    invoke-static {p1, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object p1

    invoke-interface {p2, p1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/e;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->g()LV/O0;

    move-result-object p3

    invoke-interface {p2, p3}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LR0/h$b;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->k()LV/O0;

    move-result-object v0

    invoke-interface {p2, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LY0/v;

    iget-object v0, p0, LH/T$a;->D:LM0/P;

    invoke-interface {p2, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2, v6}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    iget-object v1, p0, LH/T$a;->D:LM0/P;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_2

    :cond_1
    invoke-static {v1, v6}, LM0/Q;->d(LM0/P;LY0/v;)LM0/P;

    move-result-object v2

    invoke-interface {p2, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v7, v2

    check-cast v7, LM0/P;

    invoke-interface {p2, p3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_3

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_7

    :cond_3
    invoke-virtual {v7}, LM0/P;->j()LR0/h;

    move-result-object v0

    invoke-virtual {v7}, LM0/P;->o()LR0/q;

    move-result-object v1

    if-nez v1, :cond_4

    sget-object v1, LR0/q;->D:LR0/q$a;

    invoke-virtual {v1}, LR0/q$a;->d()LR0/q;

    move-result-object v1

    :cond_4
    invoke-virtual {v7}, LM0/P;->m()LR0/o;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, LR0/o;->i()I

    move-result v2

    goto :goto_0

    :cond_5
    sget-object v2, LR0/o;->b:LR0/o$a;

    invoke-virtual {v2}, LR0/o$a;->b()I

    move-result v2

    :goto_0
    invoke-virtual {v7}, LM0/P;->n()LR0/p;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, LR0/p;->k()I

    move-result v3

    goto :goto_1

    :cond_6
    sget-object v3, LR0/p;->b:LR0/p$a;

    invoke-virtual {v3}, LR0/p$a;->a()I

    move-result v3

    :goto_1
    invoke-interface {p3, v0, v1, v2, v3}, LR0/h$b;->a(LR0/h;LR0/q;II)LV/G1;

    move-result-object v1

    invoke-interface {p2, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v8, v1

    check-cast v8, LV/G1;

    iget-object v4, p0, LH/T$a;->D:LM0/P;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v9, LV/n;->a:LV/n$a;

    invoke-virtual {v9}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_8

    new-instance v10, LH/S;

    invoke-static {v8}, LH/T$a;->e(LV/G1;)Ljava/lang/Object;

    move-result-object v5

    move-object v0, v10

    move-object v1, v6

    move-object v2, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, LH/S;-><init>(LY0/v;LY0/e;LR0/h$b;LM0/P;Ljava/lang/Object;)V

    invoke-interface {p2, v10}, LV/n;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v10, v0

    check-cast v10, LH/S;

    invoke-static {v8}, LH/T$a;->e(LV/G1;)Ljava/lang/Object;

    move-result-object v5

    move-object v0, v10

    move-object v1, v6

    move-object v2, p1

    move-object v3, p3

    move-object v4, v7

    invoke-virtual/range {v0 .. v5}, LH/S;->c(LY0/v;LY0/e;LR0/h$b;LM0/P;Ljava/lang/Object;)V

    sget-object p1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {p2, v10}, LV/n;->l(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_9

    invoke-virtual {v9}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_a

    :cond_9
    new-instance v0, LH/T$a$a;

    invoke-direct {v0, v10}, LH/T$a$a;-><init>(LH/S;)V

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v0, Lx7/q;

    invoke-static {p1, v0}, Landroidx/compose/ui/layout/b;->a(Landroidx/compose/ui/d;Lx7/q;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_b

    invoke-static {}, LV/q;->P()V

    :cond_b
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

    invoke-virtual {p0, p1, p2, p3}, LH/T$a;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
