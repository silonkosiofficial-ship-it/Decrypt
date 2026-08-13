.class public final Landroidx/compose/ui/focus/FocusTargetNode;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/h;
.implements Lm0/p;
.implements LF0/i0;
.implements LE0/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;,
        Landroidx/compose/ui/focus/FocusTargetNode$a;
    }
.end annotation


# instance fields
.field private P:Z

.field private Q:Z

.field private R:Lm0/o;

.field private final S:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    return-void
.end method

.method public static final synthetic T1(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->Q:Z

    return p0
.end method

.method public static final synthetic U1(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->P:Z

    return p0
.end method

.method public static final synthetic V1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/focus/FocusTargetNode;->Q:Z

    return-void
.end method

.method public static final synthetic W1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/focus/FocusTargetNode;->P:Z

    return-void
.end method

.method private final b2()V
    .locals 2

    .prologue
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->e2(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    invoke-static {p0}, Lm0/r;->d(Landroidx/compose/ui/focus/FocusTargetNode;)Lm0/s;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Lm0/s;->e(Lm0/s;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lm0/s;->b(Lm0/s;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-static {v0}, Lm0/s;->a(Lm0/s;)V

    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->d2(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->c2(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lm0/o;->D:Lm0/o;

    goto :goto_1

    :cond_1
    sget-object v1, Lm0/o;->F:Lm0/o;

    :goto_1
    invoke-virtual {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->g2(Lm0/o;)V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lm0/s;->c(Lm0/s;)V

    return-void

    :goto_2
    invoke-static {v0}, Lm0/s;->c(Lm0/s;)V

    throw v1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Re-initializing focus target node."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final c2(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 12

    .prologue
    const/16 v0, 0x400

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "visitSubtreeIf called on an unattached node"

    invoke-static {v1}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    new-instance v1, LX/b;

    const/16 v2, 0x10

    new-array v3, v2, [Landroidx/compose/ui/d$c;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, LX/b;-><init>([Ljava/lang/Object;I)V

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object p0

    :cond_1
    invoke-static {v1, p0}, LF0/k;->a(LX/b;Landroidx/compose/ui/d$c;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v3}, LX/b;->d(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v1}, LX/b;->x()Z

    move-result p0

    if-eqz p0, :cond_e

    invoke-virtual {v1}, LX/b;->t()I

    move-result p0

    const/4 v3, 0x1

    sub-int/2addr p0, v3

    invoke-virtual {v1, p0}, LX/b;->D(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/d$c;

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->q1()I

    move-result v5

    and-int/2addr v5, v0

    if-eqz v5, :cond_1

    move-object v5, p0

    :goto_1
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v6

    and-int/2addr v6, v0

    if-eqz v6, :cond_d

    const/4 v6, 0x0

    move-object v7, v5

    move-object v8, v6

    :goto_2
    if-eqz v7, :cond_d

    instance-of v9, v7, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v9, :cond_6

    check-cast v7, Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v7}, Landroidx/compose/ui/focus/FocusTargetNode;->e2(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    move-result v9

    if-nez v9, :cond_3

    goto :goto_6

    :cond_3
    invoke-virtual {v7}, Landroidx/compose/ui/focus/FocusTargetNode;->a2()Lm0/o;

    move-result-object p0

    sget-object v0, Landroidx/compose/ui/focus/FocusTargetNode$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    if-eq p0, v3, :cond_5

    const/4 v0, 0x2

    if-eq p0, v0, :cond_5

    const/4 v0, 0x3

    if-eq p0, v0, :cond_5

    const/4 v0, 0x4

    if-ne p0, v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_5
    move v4, v3

    :goto_3
    return v4

    :cond_6
    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->v1()I

    move-result v9

    and-int/2addr v9, v0

    if-eqz v9, :cond_c

    instance-of v9, v7, LF0/m;

    if-eqz v9, :cond_c

    move-object v9, v7

    check-cast v9, LF0/m;

    invoke-virtual {v9}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v9

    move v10, v4

    :goto_4
    if-eqz v9, :cond_b

    invoke-virtual {v9}, Landroidx/compose/ui/d$c;->v1()I

    move-result v11

    and-int/2addr v11, v0

    if-eqz v11, :cond_a

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v3, :cond_7

    move-object v7, v9

    goto :goto_5

    :cond_7
    if-nez v8, :cond_8

    new-instance v8, LX/b;

    new-array v11, v2, [Landroidx/compose/ui/d$c;

    invoke-direct {v8, v11, v4}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_8
    if-eqz v7, :cond_9

    invoke-virtual {v8, v7}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v7, v6

    :cond_9
    invoke-virtual {v8, v9}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_a
    :goto_5
    invoke-virtual {v9}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v9

    goto :goto_4

    :cond_b
    if-ne v10, v3, :cond_c

    goto :goto_2

    :cond_c
    :goto_6
    invoke-static {v8}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v7

    goto :goto_2

    :cond_d
    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v5

    goto/16 :goto_1

    :cond_e
    return v4
.end method

.method private static final d2(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 10

    .prologue
    const/16 v0, 0x400

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p0

    :goto_0
    const/4 v2, 0x0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, LF0/J;->k0()LF0/b0;

    move-result-object v3

    invoke-virtual {v3}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->q1()I

    move-result v3

    and-int/2addr v3, v0

    const/4 v4, 0x0

    if-eqz v3, :cond_b

    :goto_1
    if-eqz v1, :cond_b

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_a

    move-object v3, v1

    move-object v5, v4

    :goto_2
    if-eqz v3, :cond_a

    instance-of v6, v3, Landroidx/compose/ui/focus/FocusTargetNode;

    const/4 v7, 0x1

    if-eqz v6, :cond_3

    check-cast v3, Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v3}, Landroidx/compose/ui/focus/FocusTargetNode;->e2(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusTargetNode;->a2()Lm0/o;

    move-result-object p0

    sget-object v0, Landroidx/compose/ui/focus/FocusTargetNode$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    if-eq p0, v7, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    goto :goto_3

    :cond_0
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_1
    move v2, v7

    :cond_2
    :goto_3
    return v2

    :cond_3
    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->v1()I

    move-result v6

    and-int/2addr v6, v0

    if-eqz v6, :cond_9

    instance-of v6, v3, LF0/m;

    if-eqz v6, :cond_9

    move-object v6, v3

    check-cast v6, LF0/m;

    invoke-virtual {v6}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v6

    move v8, v2

    :goto_4
    if-eqz v6, :cond_8

    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->v1()I

    move-result v9

    and-int/2addr v9, v0

    if-eqz v9, :cond_7

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v7, :cond_4

    move-object v3, v6

    goto :goto_5

    :cond_4
    if-nez v5, :cond_5

    new-instance v5, LX/b;

    const/16 v9, 0x10

    new-array v9, v9, [Landroidx/compose/ui/d$c;

    invoke-direct {v5, v9, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_5
    if-eqz v3, :cond_6

    invoke-virtual {v5, v3}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v3, v4

    :cond_6
    invoke-virtual {v5, v6}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_7
    :goto_5
    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v6

    goto :goto_4

    :cond_8
    if-ne v8, v7, :cond_9

    goto :goto_2

    :cond_9
    invoke-static {v5}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v3

    goto :goto_2

    :cond_a
    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    goto/16 :goto_1

    :cond_b
    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object p0

    if-eqz p0, :cond_c

    invoke-virtual {p0}, LF0/J;->k0()LF0/b0;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, LF0/b0;->o()Landroidx/compose/ui/d$c;

    move-result-object v1

    goto/16 :goto_0

    :cond_c
    move-object v1, v4

    goto/16 :goto_0

    :cond_d
    return v2

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "visitAncestors called on an unattached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final e2(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 0

    .prologue
    iget-object p0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->R:Lm0/o;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public synthetic D0(LE0/c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LE0/h;->a(LE0/i;LE0/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public E1()V
    .locals 4

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->a2()Lm0/o;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/FocusTargetNode$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p0}, Lm0/r;->d(Landroidx/compose/ui/focus/FocusTargetNode;)Lm0/s;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Lm0/s;->e(Lm0/s;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lm0/s;->b(Lm0/s;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {v0}, Lm0/s;->a(Lm0/s;)V

    sget-object v1, Lm0/o;->F:Lm0/o;

    invoke-virtual {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->g2(Lm0/o;)V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lm0/s;->c(Lm0/s;)V

    goto :goto_2

    :goto_1
    invoke-static {v0}, Lm0/s;->c(Lm0/s;)V

    throw v1

    :cond_2
    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->getFocusOwner()Lm0/i;

    move-result-object v0

    sget-object v2, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v2}, Landroidx/compose/ui/focus/d$a;->c()I

    move-result v2

    const/4 v3, 0x0

    invoke-interface {v0, v1, v1, v3, v2}, Lm0/i;->e(ZZZI)Z

    invoke-static {p0}, Lm0/r;->c(Landroidx/compose/ui/focus/FocusTargetNode;)V

    :goto_2
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->R:Lm0/o;

    return-void
.end method

.method public L0()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->a2()Lm0/o;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->f2()V

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->a2()Lm0/o;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-static {p0}, Lm0/c;->c(Landroidx/compose/ui/focus/FocusTargetNode;)V

    :cond_0
    return-void
.end method

.method public final X1()V
    .locals 1

    .prologue
    invoke-static {p0}, Lm0/r;->d(Landroidx/compose/ui/focus/FocusTargetNode;)Lm0/s;

    move-result-object v0

    invoke-virtual {v0, p0}, Lm0/s;->i(Landroidx/compose/ui/focus/FocusTargetNode;)Lm0/o;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->R:Lm0/o;

    return-void

    :cond_0
    const-string v0, "committing a node that was not updated in the current transaction"

    invoke-static {v0}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public final Y1()Landroidx/compose/ui/focus/j;
    .locals 15

    .prologue
    new-instance v0, Landroidx/compose/ui/focus/k;

    invoke-direct {v0}, Landroidx/compose/ui/focus/k;-><init>()V

    const/16 v1, 0x800

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    const/16 v2, 0x400

    invoke-static {v2}, LF0/f0;->a(I)I

    move-result v2

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v3

    or-int v4, v1, v2

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v5

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object v6

    :goto_0
    if-eqz v6, :cond_b

    invoke-virtual {v6}, LF0/J;->k0()LF0/b0;

    move-result-object v7

    invoke-virtual {v7}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->q1()I

    move-result v7

    and-int/2addr v7, v4

    const/4 v8, 0x0

    if-eqz v7, :cond_9

    :goto_1
    if-eqz v5, :cond_9

    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v7

    and-int/2addr v7, v4

    if-eqz v7, :cond_8

    if-eq v5, v3, :cond_0

    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v7

    and-int/2addr v7, v2

    if-eqz v7, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v7

    and-int/2addr v7, v1

    if-eqz v7, :cond_8

    move-object v7, v5

    move-object v9, v8

    :goto_2
    if-eqz v7, :cond_8

    instance-of v10, v7, Lm0/j;

    if-eqz v10, :cond_1

    check-cast v7, Lm0/j;

    invoke-interface {v7, v0}, Lm0/j;->Y(Landroidx/compose/ui/focus/j;)V

    goto :goto_5

    :cond_1
    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->v1()I

    move-result v10

    and-int/2addr v10, v1

    if-eqz v10, :cond_7

    instance-of v10, v7, LF0/m;

    if-eqz v10, :cond_7

    move-object v10, v7

    check-cast v10, LF0/m;

    invoke-virtual {v10}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v10

    const/4 v11, 0x0

    move v12, v11

    :goto_3
    const/4 v13, 0x1

    if-eqz v10, :cond_6

    invoke-virtual {v10}, Landroidx/compose/ui/d$c;->v1()I

    move-result v14

    and-int/2addr v14, v1

    if-eqz v14, :cond_5

    add-int/lit8 v12, v12, 0x1

    if-ne v12, v13, :cond_2

    move-object v7, v10

    goto :goto_4

    :cond_2
    if-nez v9, :cond_3

    new-instance v9, LX/b;

    const/16 v13, 0x10

    new-array v13, v13, [Landroidx/compose/ui/d$c;

    invoke-direct {v9, v13, v11}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_3
    if-eqz v7, :cond_4

    invoke-virtual {v9, v7}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v7, v8

    :cond_4
    invoke-virtual {v9, v10}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_5
    :goto_4
    invoke-virtual {v10}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v10

    goto :goto_3

    :cond_6
    if-ne v12, v13, :cond_7

    goto :goto_2

    :cond_7
    :goto_5
    invoke-static {v9}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v7

    goto :goto_2

    :cond_8
    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v5

    goto :goto_1

    :cond_9
    invoke-virtual {v6}, LF0/J;->o0()LF0/J;

    move-result-object v6

    if-eqz v6, :cond_a

    invoke-virtual {v6}, LF0/J;->k0()LF0/b0;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v5}, LF0/b0;->o()Landroidx/compose/ui/d$c;

    move-result-object v5

    goto/16 :goto_0

    :cond_a
    move-object v5, v8

    goto/16 :goto_0

    :cond_b
    :goto_6
    return-object v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "visitAncestors called on an unattached node"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final Z1()LD0/e;
    .locals 1

    invoke-static {}, LD0/f;->a()LE0/m;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->D0(LE0/c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD0/e;

    return-object v0
.end method

.method public a2()Lm0/o;
    .locals 1

    .prologue
    invoke-static {p0}, Lm0/r;->a(Landroidx/compose/ui/focus/FocusTargetNode;)Lm0/s;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lm0/s;->i(Landroidx/compose/ui/focus/FocusTargetNode;)Lm0/o;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->R:Lm0/o;

    if-nez v0, :cond_1

    sget-object v0, Lm0/o;->F:Lm0/o;

    :cond_1
    return-object v0
.end method

.method public final f2()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->R:Lm0/o;

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->b2()V

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->a2()Lm0/o;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/FocusTargetNode$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    new-instance v2, Landroidx/compose/ui/focus/FocusTargetNode$b;

    invoke-direct {v2, v0, p0}, Landroidx/compose/ui/focus/FocusTargetNode$b;-><init>(Ly7/O;Landroidx/compose/ui/focus/FocusTargetNode;)V

    invoke-static {p0, v2}, LF0/j0;->a(Landroidx/compose/ui/d$c;Lx7/a;)V

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    if-nez v0, :cond_2

    const-string v0, "focusProperties"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    check-cast v0, Landroidx/compose/ui/focus/j;

    :goto_0
    invoke-interface {v0}, Landroidx/compose/ui/focus/j;->p()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->getFocusOwner()Lm0/i;

    move-result-object v0

    invoke-interface {v0, v1}, Lm0/f;->n(Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public g2(Lm0/o;)V
    .locals 1

    invoke-static {p0}, Lm0/r;->d(Landroidx/compose/ui/focus/FocusTargetNode;)Lm0/s;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lm0/s;->j(Landroidx/compose/ui/focus/FocusTargetNode;Lm0/o;)V

    return-void
.end method

.method public synthetic s0()LE0/g;
    .locals 1

    invoke-static {p0}, LE0/h;->b(LE0/i;)LE0/g;

    move-result-object v0

    return-object v0
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->S:Z

    return v0
.end method
