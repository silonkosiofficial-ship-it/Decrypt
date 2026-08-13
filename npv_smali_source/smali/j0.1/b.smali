.class public final Lj0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj0/m;
.implements Landroidx/lifecycle/e;
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj0/b$a;,
        Lj0/b$b;
    }
.end annotation


# instance fields
.field private final C:Landroidx/compose/ui/platform/r;

.field private D:Lx7/a;

.field private E:Landroidx/compose/ui/platform/coreshims/d;

.field private final F:Lr/C;

.field private final G:Lr/D;

.field private H:J

.field private I:Lj0/b$a;

.field private J:Z

.field private final K:Lr/b;

.field private final L:LY8/j;

.field private final M:Landroid/os/Handler;

.field private N:Lr/n;

.field private O:J

.field private P:Lr/C;

.field private Q:Landroidx/compose/ui/platform/o1;

.field private R:Z

.field private final S:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/r;Lx7/a;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj0/b;->C:Landroidx/compose/ui/platform/r;

    iput-object p2, p0, Lj0/b;->D:Lx7/a;

    new-instance p2, Lr/C;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p2, v0, v1, v2}, Lr/C;-><init>(IILy7/k;)V

    iput-object p2, p0, Lj0/b;->F:Lr/C;

    new-instance p2, Lr/D;

    invoke-direct {p2, v0, v1, v2}, Lr/D;-><init>(IILy7/k;)V

    iput-object p2, p0, Lj0/b;->G:Lr/D;

    const-wide/16 v3, 0x64

    iput-wide v3, p0, Lj0/b;->H:J

    sget-object p2, Lj0/b$a;->C:Lj0/b$a;

    iput-object p2, p0, Lj0/b;->I:Lj0/b$a;

    iput-boolean v1, p0, Lj0/b;->J:Z

    new-instance p2, Lr/b;

    invoke-direct {p2, v0, v1, v2}, Lr/b;-><init>(IILy7/k;)V

    iput-object p2, p0, Lj0/b;->K:Lr/b;

    const/4 p2, 0x6

    invoke-static {v1, v2, v2, p2, v2}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object p2

    iput-object p2, p0, Lj0/b;->L:LY8/j;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lj0/b;->M:Landroid/os/Handler;

    invoke-static {}, Lr/o;->a()Lr/n;

    move-result-object p2

    iput-object p2, p0, Lj0/b;->N:Lr/n;

    invoke-static {}, Lr/o;->b()Lr/C;

    move-result-object p2

    iput-object p2, p0, Lj0/b;->P:Lr/C;

    new-instance p2, Landroidx/compose/ui/platform/o1;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LK0/q;

    move-result-object p1

    invoke-virtual {p1}, LK0/q;->a()LK0/o;

    move-result-object p1

    invoke-static {}, Lr/o;->a()Lr/n;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Landroidx/compose/ui/platform/o1;-><init>(LK0/o;Lr/n;)V

    iput-object p2, p0, Lj0/b;->Q:Landroidx/compose/ui/platform/o1;

    new-instance p1, Lj0/a;

    invoke-direct {p1, p0}, Lj0/a;-><init>(Lj0/b;)V

    iput-object p1, p0, Lj0/b;->S:Ljava/lang/Runnable;

    return-void
.end method

.method private final A(ILjava/lang/String;)V
    .locals 3

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lj0/b;->E:Landroidx/compose/ui/platform/coreshims/d;

    if-nez v0, :cond_1

    return-void

    :cond_1
    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/coreshims/d;->a(J)Landroid/view/autofill/AutofillId;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/coreshims/d;->c(Landroid/view/autofill/AutofillId;Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    const-string p1, "Invalid content capture ID"

    invoke-static {p1}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method private final B(LK0/o;Landroidx/compose/ui/platform/o1;)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    new-instance v1, Lr/D;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Lr/D;-><init>(IILy7/k;)V

    invoke-virtual/range {p1 .. p1}, LK0/o;->t()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_2

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LK0/o;

    invoke-virtual/range {p0 .. p0}, Lj0/b;->k()Lr/n;

    move-result-object v7

    invoke-virtual {v6}, LK0/o;->o()I

    move-result v8

    invoke-virtual {v7, v8}, Lr/n;->a(I)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/platform/o1;->a()Lr/D;

    move-result-object v7

    invoke-virtual {v6}, LK0/o;->o()I

    move-result v8

    invoke-virtual {v7, v8}, Lr/p;->a(I)Z

    move-result v7

    if-nez v7, :cond_0

    :goto_1
    invoke-virtual/range {p1 .. p1}, LK0/o;->q()LF0/J;

    move-result-object v1

    invoke-direct {v0, v1}, Lj0/b;->q(LF0/J;)V

    return-void

    :cond_0
    invoke-virtual {v6}, LK0/o;->o()I

    move-result v6

    invoke-virtual {v1, v6}, Lr/D;->f(I)Z

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/platform/o1;->a()Lr/D;

    move-result-object v2

    iget-object v3, v2, Lr/p;->b:[I

    iget-object v2, v2, Lr/p;->a:[J

    array-length v5, v2

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_6

    move v6, v4

    :goto_2
    aget-wide v7, v2, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_5

    sub-int v9, v6, v5

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    move v11, v4

    :goto_3
    if-ge v11, v9, :cond_4

    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    const-wide/16 v14, 0x80

    cmp-long v12, v12, v14

    if-gez v12, :cond_3

    shl-int/lit8 v12, v6, 0x3

    add-int/2addr v12, v11

    aget v12, v3, v12

    invoke-virtual {v1, v12}, Lr/p;->a(I)Z

    move-result v12

    if-nez v12, :cond_3

    goto :goto_1

    :cond_3
    shr-long/2addr v7, v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_4
    if-ne v9, v10, :cond_6

    :cond_5
    if-eq v6, v5, :cond_6

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_6
    invoke-virtual/range {p1 .. p1}, LK0/o;->t()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_4
    if-ge v4, v2, :cond_9

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LK0/o;

    invoke-virtual/range {p0 .. p0}, Lj0/b;->k()Lr/n;

    move-result-object v5

    invoke-virtual {v3}, LK0/o;->o()I

    move-result v6

    invoke-virtual {v5, v6}, Lr/n;->a(I)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v5, v0, Lj0/b;->P:Lr/C;

    invoke-virtual {v3}, LK0/o;->o()I

    move-result v6

    invoke-virtual {v5, v6}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_7

    check-cast v5, Landroidx/compose/ui/platform/o1;

    invoke-direct {v0, v3, v5}, Lj0/b;->B(LK0/o;Landroidx/compose/ui/platform/o1;)V

    goto :goto_5

    :cond_7
    const-string v1, "node not present in pruned tree before this change"

    invoke-static {v1}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Li7/k;

    invoke-direct {v1}, Li7/k;-><init>()V

    throw v1

    :cond_8
    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_9
    return-void
.end method

.method private final C()V
    .locals 14

    .prologue
    invoke-virtual {p0}, Lj0/b;->k()Lr/n;

    move-result-object v0

    iget-object v1, v0, Lr/n;->c:[Ljava/lang/Object;

    iget-object v0, v0, Lr/n;->a:[J

    array-length v2, v0

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_3

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    aget-wide v5, v0, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_2

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_1

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_0

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    aget-object v10, v1, v10

    check-cast v10, Landroidx/compose/ui/platform/p1;

    invoke-virtual {v10}, Landroidx/compose/ui/platform/p1;->b()LK0/o;

    move-result-object v10

    invoke-virtual {v10}, LK0/o;->w()LK0/k;

    move-result-object v10

    sget-object v11, LK0/r;->a:LK0/r;

    invoke-virtual {v11}, LK0/r;->r()LK0/v;

    move-result-object v11

    invoke-static {v10, v11}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v11, v12}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    sget-object v11, LK0/j;->a:LK0/j;

    invoke-virtual {v11}, LK0/j;->A()LK0/v;

    move-result-object v11

    invoke-static {v10, v11}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LK0/a;

    if-eqz v10, :cond_0

    invoke-virtual {v10}, LK0/a;->a()Li7/i;

    move-result-object v10

    check-cast v10, Lx7/l;

    if-eqz v10, :cond_0

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v10, v11}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    :cond_0
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    if-ne v7, v8, :cond_3

    :cond_2
    if-eq v4, v2, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private final E(LK0/o;)Landroidx/compose/ui/platform/coreshims/f;
    .locals 13

    .prologue
    iget-object v0, p0, Lj0/b;->E:Landroidx/compose/ui/platform/coreshims/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-ge v2, v3, :cond_1

    return-object v1

    :cond_1
    iget-object v2, p0, Lj0/b;->C:Landroidx/compose/ui/platform/r;

    invoke-static {v2}, Landroidx/compose/ui/platform/coreshims/e;->a(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/b;

    move-result-object v2

    if-nez v2, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p1}, LK0/o;->r()LK0/o;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, LK0/o;->o()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3}, Landroidx/compose/ui/platform/coreshims/d;->a(J)Landroid/view/autofill/AutofillId;

    move-result-object v2

    if-nez v2, :cond_4

    return-object v1

    :cond_3
    invoke-virtual {v2}, Landroidx/compose/ui/platform/coreshims/b;->a()Landroid/view/autofill/AutofillId;

    move-result-object v2

    :cond_4
    invoke-virtual {p1}, LK0/o;->o()I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v0, v2, v3, v4}, Landroidx/compose/ui/platform/coreshims/d;->b(Landroid/view/autofill/AutofillId;J)Landroidx/compose/ui/platform/coreshims/f;

    move-result-object v0

    if-nez v0, :cond_5

    return-object v1

    :cond_5
    invoke-virtual {p1}, LK0/o;->w()LK0/k;

    move-result-object v2

    sget-object v3, LK0/r;->a:LK0/r;

    invoke-virtual {v3}, LK0/r;->w()LK0/v;

    move-result-object v4

    invoke-virtual {v2, v4}, LK0/k;->f(LK0/v;)Z

    move-result v4

    if-eqz v4, :cond_6

    return-object v1

    :cond_6
    invoke-virtual {v0}, Landroidx/compose/ui/platform/coreshims/f;->a()Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_7

    const-string v5, "android.view.contentcapture.EventTimestamp"

    iget-wide v6, p0, Lj0/b;->O:J

    invoke-virtual {v4, v5, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_7
    invoke-virtual {v3}, LK0/r;->C()LK0/v;

    move-result-object v4

    invoke-static {v2, v4}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_8

    invoke-virtual {p1}, LK0/o;->o()I

    move-result v5

    invoke-virtual {v0, v5, v1, v1, v4}, Landroidx/compose/ui/platform/coreshims/f;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    invoke-virtual {v3}, LK0/r;->D()LK0/v;

    move-result-object v1

    invoke-static {v2, v1}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_9

    const-string v1, "android.widget.TextView"

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/coreshims/f;->b(Ljava/lang/String;)V

    const/16 v11, 0x3e

    const/4 v12, 0x0

    const-string v5, "\n"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, La1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/coreshims/f;->f(Ljava/lang/CharSequence;)V

    :cond_9
    invoke-virtual {v3}, LK0/r;->g()LK0/v;

    move-result-object v1

    invoke-static {v2, v1}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM0/d;

    if-eqz v1, :cond_a

    const-string v4, "android.widget.EditText"

    invoke-virtual {v0, v4}, Landroidx/compose/ui/platform/coreshims/f;->b(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/coreshims/f;->f(Ljava/lang/CharSequence;)V

    :cond_a
    invoke-virtual {v3}, LK0/r;->d()LK0/v;

    move-result-object v1

    invoke-static {v2, v1}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_b

    const/16 v11, 0x3e

    const/4 v12, 0x0

    const-string v5, "\n"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, La1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/coreshims/f;->c(Ljava/lang/CharSequence;)V

    :cond_b
    invoke-virtual {v3}, LK0/r;->y()LK0/v;

    move-result-object v1

    invoke-static {v2, v1}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LK0/h;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, LK0/h;->n()I

    move-result v1

    invoke-static {v1}, Landroidx/compose/ui/platform/q1;->i(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/coreshims/f;->b(Ljava/lang/String;)V

    :cond_c
    invoke-static {v2}, Landroidx/compose/ui/platform/q1;->e(LK0/k;)LM0/K;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v1}, LM0/K;->l()LM0/J;

    move-result-object v1

    invoke-virtual {v1}, LM0/J;->i()LM0/P;

    move-result-object v2

    invoke-virtual {v2}, LM0/P;->l()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/x;->h(J)F

    move-result v2

    invoke-virtual {v1}, LM0/J;->b()LY0/e;

    move-result-object v3

    invoke-interface {v3}, LY0/e;->getDensity()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {v1}, LM0/J;->b()LY0/e;

    move-result-object v1

    invoke-interface {v1}, LY0/n;->v0()F

    move-result v1

    mul-float/2addr v2, v1

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1, v1, v1}, Landroidx/compose/ui/platform/coreshims/f;->g(FIII)V

    :cond_d
    invoke-virtual {p1}, LK0/o;->h()Ln0/i;

    move-result-object p1

    invoke-virtual {p1}, Ln0/i;->i()F

    move-result v1

    float-to-int v6, v1

    invoke-virtual {p1}, Ln0/i;->l()F

    move-result v1

    float-to-int v7, v1

    invoke-virtual {p1}, Ln0/i;->n()F

    move-result v1

    float-to-int v10, v1

    invoke-virtual {p1}, Ln0/i;->h()F

    move-result p1

    float-to-int v11, p1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, v0

    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/platform/coreshims/f;->d(IIIIII)V

    return-object v0
.end method

.method private final F(LK0/o;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Lj0/b;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lj0/b;->J(LK0/o;)V

    invoke-virtual {p1}, LK0/o;->o()I

    move-result v0

    invoke-direct {p0, p1}, Lj0/b;->E(LK0/o;)Landroidx/compose/ui/platform/coreshims/f;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lj0/b;->c(ILandroidx/compose/ui/platform/coreshims/f;)V

    invoke-virtual {p1}, LK0/o;->t()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LK0/o;

    invoke-direct {p0, v2}, Lj0/b;->F(LK0/o;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final G(LK0/o;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Lj0/b;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LK0/o;->o()I

    move-result v0

    invoke-direct {p0, v0}, Lj0/b;->d(I)V

    invoke-virtual {p1}, LK0/o;->t()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LK0/o;

    invoke-direct {p0, v2}, Lj0/b;->G(LK0/o;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final I()V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lj0/b;->P:Lr/C;

    invoke-virtual {v1}, Lr/C;->i()V

    invoke-virtual/range {p0 .. p0}, Lj0/b;->k()Lr/n;

    move-result-object v1

    iget-object v2, v1, Lr/n;->b:[I

    iget-object v3, v1, Lr/n;->c:[Ljava/lang/Object;

    iget-object v1, v1, Lr/n;->a:[J

    array-length v4, v1

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_3

    const/4 v6, 0x0

    :goto_0
    aget-wide v7, v1, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_2

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v9, :cond_1

    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    const-wide/16 v14, 0x80

    cmp-long v12, v12, v14

    if-gez v12, :cond_0

    shl-int/lit8 v12, v6, 0x3

    add-int/2addr v12, v11

    aget v13, v2, v12

    aget-object v12, v3, v12

    check-cast v12, Landroidx/compose/ui/platform/p1;

    iget-object v14, v0, Lj0/b;->P:Lr/C;

    new-instance v15, Landroidx/compose/ui/platform/o1;

    invoke-virtual {v12}, Landroidx/compose/ui/platform/p1;->b()LK0/o;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lj0/b;->k()Lr/n;

    move-result-object v5

    invoke-direct {v15, v12, v5}, Landroidx/compose/ui/platform/o1;-><init>(LK0/o;Lr/n;)V

    invoke-virtual {v14, v13, v15}, Lr/C;->s(ILjava/lang/Object;)V

    :cond_0
    shr-long/2addr v7, v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    if-ne v9, v10, :cond_3

    :cond_2
    if-eq v6, v4, :cond_3

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    new-instance v1, Landroidx/compose/ui/platform/o1;

    iget-object v2, v0, Lj0/b;->C:Landroidx/compose/ui/platform/r;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LK0/q;

    move-result-object v2

    invoke-virtual {v2}, LK0/q;->a()LK0/o;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lj0/b;->k()Lr/n;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/platform/o1;-><init>(LK0/o;Lr/n;)V

    iput-object v1, v0, Lj0/b;->Q:Landroidx/compose/ui/platform/o1;

    return-void
.end method

.method private final J(LK0/o;)V
    .locals 3

    .prologue
    invoke-virtual {p1}, LK0/o;->w()LK0/k;

    move-result-object p1

    sget-object v0, LK0/r;->a:LK0/r;

    invoke-virtual {v0}, LK0/r;->r()LK0/v;

    move-result-object v0

    invoke-static {p1, v0}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    iget-object v1, p0, Lj0/b;->I:Lj0/b$a;

    sget-object v2, Lj0/b$a;->C:Lj0/b$a;

    if-ne v1, v2, :cond_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, LK0/j;->a:LK0/j;

    invoke-virtual {v0}, LK0/j;->A()LK0/v;

    move-result-object v0

    invoke-static {p1, v0}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LK0/a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LK0/a;->a()Li7/i;

    move-result-object p1

    check-cast p1, Lx7/l;

    if-eqz p1, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lj0/b;->I:Lj0/b$a;

    sget-object v2, Lj0/b$a;->D:Lj0/b$a;

    if-ne v1, v2, :cond_1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LK0/j;->a:LK0/j;

    invoke-virtual {v0}, LK0/j;->A()LK0/v;

    move-result-object v0

    invoke-static {p1, v0}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LK0/a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LK0/a;->a()Li7/i;

    move-result-object p1

    check-cast p1, Lx7/l;

    if-eqz p1, :cond_1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static synthetic a(Lj0/b;)V
    .locals 0

    invoke-static {p0}, Lj0/b;->j(Lj0/b;)V

    return-void
.end method

.method private final c(ILandroidx/compose/ui/platform/coreshims/f;)V
    .locals 1

    .prologue
    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lj0/b;->G:Lr/D;

    invoke-virtual {v0, p1}, Lr/p;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p0, Lj0/b;->G:Lr/D;

    invoke-virtual {p2, p1}, Lr/D;->q(I)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lj0/b;->F:Lr/C;

    invoke-virtual {v0, p1, p2}, Lr/C;->s(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private final d(I)V
    .locals 1

    .prologue
    iget-object v0, p0, Lj0/b;->F:Lr/C;

    invoke-virtual {v0, p1}, Lr/n;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj0/b;->F:Lr/C;

    invoke-virtual {v0, p1}, Lr/C;->p(I)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj0/b;->G:Lr/D;

    invoke-virtual {v0, p1}, Lr/D;->f(I)Z

    :goto_0
    return-void
.end method

.method private final e(Lr/n;)V
    .locals 17

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, Lr/n;->b:[I

    iget-object v3, v1, Lr/n;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_d

    const/4 v6, 0x0

    :goto_0
    aget-wide v7, v3, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_c

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v9, :cond_b

    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    const-wide/16 v14, 0x80

    cmp-long v12, v12, v14

    if-gez v12, :cond_a

    shl-int/lit8 v12, v6, 0x3

    add-int/2addr v12, v11

    aget v12, v2, v12

    iget-object v13, v0, Lj0/b;->P:Lr/C;

    invoke-virtual {v13, v12}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/compose/ui/platform/o1;

    invoke-virtual {v1, v12}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/ui/platform/p1;

    if-eqz v12, :cond_0

    invoke-virtual {v12}, Landroidx/compose/ui/platform/p1;->b()LK0/o;

    move-result-object v12

    goto :goto_2

    :cond_0
    const/4 v12, 0x0

    :goto_2
    if-eqz v12, :cond_9

    if-nez v13, :cond_3

    invoke-virtual {v12}, LK0/o;->w()LK0/k;

    move-result-object v13

    invoke-virtual {v13}, LK0/k;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_1
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/Map$Entry;

    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v15

    sget-object v16, LK0/r;->a:LK0/r;

    invoke-virtual/range {v16 .. v16}, LK0/r;->D()LK0/v;

    move-result-object v5

    invoke-static {v15, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v12}, LK0/o;->w()LK0/k;

    move-result-object v5

    invoke-virtual/range {v16 .. v16}, LK0/r;->D()LK0/v;

    move-result-object v15

    invoke-static {v5, v15}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_2

    invoke-static {v5}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LM0/d;

    goto :goto_4

    :cond_2
    const/4 v5, 0x0

    :goto_4
    invoke-virtual {v12}, LK0/o;->o()I

    move-result v15

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v15, v5}, Lj0/b;->A(ILjava/lang/String;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v12}, LK0/o;->w()LK0/k;

    move-result-object v5

    invoke-virtual {v5}, LK0/k;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/Map$Entry;

    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LK0/v;

    sget-object v16, LK0/r;->a:LK0/r;

    invoke-virtual/range {v16 .. v16}, LK0/r;->D()LK0/v;

    move-result-object v14

    invoke-static {v15, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-virtual {v13}, Landroidx/compose/ui/platform/o1;->b()LK0/k;

    move-result-object v14

    invoke-virtual/range {v16 .. v16}, LK0/r;->D()LK0/v;

    move-result-object v15

    invoke-static {v14, v15}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    if-eqz v14, :cond_5

    invoke-static {v14}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LM0/d;

    goto :goto_6

    :cond_5
    const/4 v14, 0x0

    :goto_6
    invoke-virtual {v12}, LK0/o;->w()LK0/k;

    move-result-object v15

    invoke-virtual/range {v16 .. v16}, LK0/r;->D()LK0/v;

    move-result-object v10

    invoke-static {v15, v10}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    if-eqz v10, :cond_6

    invoke-static {v10}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LM0/d;

    goto :goto_7

    :cond_6
    const/4 v10, 0x0

    :goto_7
    invoke-static {v14, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_7

    invoke-virtual {v12}, LK0/o;->o()I

    move-result v14

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0, v14, v10}, Lj0/b;->A(ILjava/lang/String;)V

    :cond_7
    const/16 v10, 0x8

    goto :goto_5

    :cond_8
    const/16 v5, 0x8

    goto :goto_8

    :cond_9
    const-string v1, "no value for specified key"

    invoke-static {v1}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Li7/k;

    invoke-direct {v1}, Li7/k;-><init>()V

    throw v1

    :cond_a
    move v5, v10

    :goto_8
    shr-long/2addr v7, v5

    add-int/lit8 v11, v11, 0x1

    move v10, v5

    goto/16 :goto_1

    :cond_b
    move v5, v10

    if-ne v9, v5, :cond_d

    :cond_c
    if-eq v6, v4, :cond_d

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_d
    return-void
.end method

.method private final h()V
    .locals 14

    .prologue
    invoke-virtual {p0}, Lj0/b;->k()Lr/n;

    move-result-object v0

    iget-object v1, v0, Lr/n;->c:[Ljava/lang/Object;

    iget-object v0, v0, Lr/n;->a:[J

    array-length v2, v0

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_3

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    aget-wide v5, v0, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_2

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_1

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_0

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    aget-object v10, v1, v10

    check-cast v10, Landroidx/compose/ui/platform/p1;

    invoke-virtual {v10}, Landroidx/compose/ui/platform/p1;->b()LK0/o;

    move-result-object v10

    invoke-virtual {v10}, LK0/o;->w()LK0/k;

    move-result-object v10

    sget-object v11, LK0/r;->a:LK0/r;

    invoke-virtual {v11}, LK0/r;->r()LK0/v;

    move-result-object v11

    invoke-static {v10, v11}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_0

    sget-object v11, LK0/j;->a:LK0/j;

    invoke-virtual {v11}, LK0/j;->a()LK0/v;

    move-result-object v11

    invoke-static {v10, v11}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LK0/a;

    if-eqz v10, :cond_0

    invoke-virtual {v10}, LK0/a;->a()Li7/i;

    move-result-object v10

    check-cast v10, Lx7/a;

    if-eqz v10, :cond_0

    invoke-interface {v10}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    :cond_0
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    if-ne v7, v8, :cond_3

    :cond_2
    if-eq v4, v2, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private static final j(Lj0/b;)V
    .locals 4

    .prologue
    invoke-virtual {p0}, Lj0/b;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lj0/b;->C:Landroidx/compose/ui/platform/r;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LF0/n0;->c(LF0/o0;ZILjava/lang/Object;)V

    iget-object v0, p0, Lj0/b;->C:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LK0/q;

    move-result-object v0

    invoke-virtual {v0}, LK0/q;->a()LK0/o;

    move-result-object v0

    iget-object v1, p0, Lj0/b;->Q:Landroidx/compose/ui/platform/o1;

    invoke-direct {p0, v0, v1}, Lj0/b;->B(LK0/o;Landroidx/compose/ui/platform/o1;)V

    iget-object v0, p0, Lj0/b;->C:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LK0/q;

    move-result-object v0

    invoke-virtual {v0}, LK0/q;->a()LK0/o;

    move-result-object v0

    iget-object v1, p0, Lj0/b;->Q:Landroidx/compose/ui/platform/o1;

    invoke-direct {p0, v0, v1}, Lj0/b;->z(LK0/o;Landroidx/compose/ui/platform/o1;)V

    invoke-virtual {p0}, Lj0/b;->k()Lr/n;

    move-result-object v0

    invoke-direct {p0, v0}, Lj0/b;->e(Lr/n;)V

    invoke-direct {p0}, Lj0/b;->I()V

    iput-boolean v3, p0, Lj0/b;->R:Z

    return-void
.end method

.method private final m()V
    .locals 14

    .prologue
    invoke-virtual {p0}, Lj0/b;->k()Lr/n;

    move-result-object v0

    iget-object v1, v0, Lr/n;->c:[Ljava/lang/Object;

    iget-object v0, v0, Lr/n;->a:[J

    array-length v2, v0

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_3

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    aget-wide v5, v0, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_2

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_1

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_0

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    aget-object v10, v1, v10

    check-cast v10, Landroidx/compose/ui/platform/p1;

    invoke-virtual {v10}, Landroidx/compose/ui/platform/p1;->b()LK0/o;

    move-result-object v10

    invoke-virtual {v10}, LK0/o;->w()LK0/k;

    move-result-object v10

    sget-object v11, LK0/r;->a:LK0/r;

    invoke-virtual {v11}, LK0/r;->r()LK0/v;

    move-result-object v11

    invoke-static {v10, v11}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v11, v12}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    sget-object v11, LK0/j;->a:LK0/j;

    invoke-virtual {v11}, LK0/j;->A()LK0/v;

    move-result-object v11

    invoke-static {v10, v11}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LK0/a;

    if-eqz v10, :cond_0

    invoke-virtual {v10}, LK0/a;->a()Li7/i;

    move-result-object v10

    check-cast v10, Lx7/l;

    if-eqz v10, :cond_0

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v10, v11}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    :cond_0
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    if-ne v7, v8, :cond_3

    :cond_2
    if-eq v4, v2, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private final p()V
    .locals 22

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lj0/b;->E:Landroidx/compose/ui/platform/coreshims/d;

    if-nez v1, :cond_0

    return-void

    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-ge v2, v3, :cond_1

    return-void

    :cond_1
    iget-object v2, v0, Lj0/b;->F:Lr/C;

    invoke-virtual {v2}, Lr/n;->g()Z

    move-result v2

    const-wide/16 v5, 0xff

    const/4 v7, 0x7

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v10, 0x8

    if-eqz v2, :cond_7

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v12, v0, Lj0/b;->F:Lr/C;

    iget-object v13, v12, Lr/n;->c:[Ljava/lang/Object;

    iget-object v12, v12, Lr/n;->a:[J

    array-length v14, v12

    add-int/lit8 v14, v14, -0x2

    if-ltz v14, :cond_5

    const/4 v15, 0x0

    :goto_0
    aget-wide v3, v12, v15

    move-object/from16 v18, v12

    not-long v11, v3

    shl-long/2addr v11, v7

    and-long/2addr v11, v3

    and-long/2addr v11, v8

    cmp-long v11, v11, v8

    if-eqz v11, :cond_4

    sub-int v11, v15, v14

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    rsub-int/lit8 v11, v11, 0x8

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v11, :cond_3

    and-long v19, v3, v5

    const-wide/16 v16, 0x80

    cmp-long v19, v19, v16

    if-gez v19, :cond_2

    shl-int/lit8 v19, v15, 0x3

    add-int v19, v19, v12

    aget-object v19, v13, v19

    move-object/from16 v5, v19

    check-cast v5, Landroidx/compose/ui/platform/coreshims/f;

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    shr-long/2addr v3, v10

    add-int/lit8 v12, v12, 0x1

    const-wide/16 v5, 0xff

    goto :goto_1

    :cond_3
    if-ne v11, v10, :cond_5

    :cond_4
    if-eq v15, v14, :cond_5

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v12, v18

    const-wide/16 v5, 0xff

    goto :goto_0

    :cond_5
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_6

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/platform/coreshims/f;

    invoke-virtual {v6}, Landroidx/compose/ui/platform/coreshims/f;->h()Landroid/view/ViewStructure;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_6
    invoke-virtual {v1, v3}, Landroidx/compose/ui/platform/coreshims/d;->d(Ljava/util/List;)V

    iget-object v2, v0, Lj0/b;->F:Lr/C;

    invoke-virtual {v2}, Lr/C;->i()V

    :cond_7
    iget-object v2, v0, Lj0/b;->G:Lr/D;

    invoke-virtual {v2}, Lr/p;->c()Z

    move-result v2

    if-eqz v2, :cond_d

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v0, Lj0/b;->G:Lr/D;

    iget-object v4, v3, Lr/p;->b:[I

    iget-object v3, v3, Lr/p;->a:[J

    array-length v5, v3

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_b

    const/4 v6, 0x0

    :goto_3
    aget-wide v11, v3, v6

    not-long v13, v11

    shl-long/2addr v13, v7

    and-long/2addr v13, v11

    and-long/2addr v13, v8

    cmp-long v13, v13, v8

    if-eqz v13, :cond_a

    sub-int v13, v6, v5

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    rsub-int/lit8 v13, v13, 0x8

    const/4 v14, 0x0

    :goto_4
    if-ge v14, v13, :cond_9

    const-wide/16 v18, 0xff

    and-long v20, v11, v18

    const-wide/16 v15, 0x80

    cmp-long v17, v20, v15

    if-gez v17, :cond_8

    shl-int/lit8 v17, v6, 0x3

    add-int v17, v17, v14

    aget v17, v4, v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    shr-long/2addr v11, v10

    add-int/lit8 v14, v14, 0x1

    const/4 v7, 0x7

    goto :goto_4

    :cond_9
    const-wide/16 v15, 0x80

    const-wide/16 v18, 0xff

    if-ne v13, v10, :cond_b

    goto :goto_5

    :cond_a
    const-wide/16 v15, 0x80

    const-wide/16 v18, 0xff

    :goto_5
    if-eq v6, v5, :cond_b

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x7

    goto :goto_3

    :cond_b
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v11, 0x0

    :goto_6
    if-ge v11, v4, :cond_c

    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    int-to-long v5, v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    :cond_c
    invoke-static {v3}, Lj7/v;->U0(Ljava/util/Collection;)[J

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/compose/ui/platform/coreshims/d;->e([J)V

    iget-object v1, v0, Lj0/b;->G:Lr/D;

    invoke-virtual {v1}, Lr/D;->h()V

    :cond_d
    return-void
.end method

.method private final q(LF0/J;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lj0/b;->K:Lr/b;

    invoke-virtual {v0, p1}, Lr/b;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lj0/b;->L:LY8/j;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-interface {p1, v0}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final z(LK0/o;Landroidx/compose/ui/platform/o1;)V
    .locals 13

    .prologue
    invoke-virtual {p1}, LK0/o;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LK0/o;

    invoke-virtual {p0}, Lj0/b;->k()Lr/n;

    move-result-object v5

    invoke-virtual {v4}, LK0/o;->o()I

    move-result v6

    invoke-virtual {v5, v6}, Lr/n;->a(I)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p2}, Landroidx/compose/ui/platform/o1;->a()Lr/D;

    move-result-object v5

    invoke-virtual {v4}, LK0/o;->o()I

    move-result v6

    invoke-virtual {v5, v6}, Lr/p;->a(I)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-direct {p0, v4}, Lj0/b;->F(LK0/o;)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lj0/b;->P:Lr/C;

    iget-object v0, p2, Lr/n;->b:[I

    iget-object p2, p2, Lr/n;->a:[J

    array-length v1, p2

    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_5

    move v3, v2

    :goto_1
    aget-wide v4, p2, v3

    not-long v6, v4

    const/4 v8, 0x7

    shl-long/2addr v6, v8

    and-long/2addr v6, v4

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v6, v8

    cmp-long v6, v6, v8

    if-eqz v6, :cond_4

    sub-int v6, v3, v1

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    move v8, v2

    :goto_2
    if-ge v8, v6, :cond_3

    const-wide/16 v9, 0xff

    and-long/2addr v9, v4

    const-wide/16 v11, 0x80

    cmp-long v9, v9, v11

    if-gez v9, :cond_2

    shl-int/lit8 v9, v3, 0x3

    add-int/2addr v9, v8

    aget v9, v0, v9

    invoke-virtual {p0}, Lj0/b;->k()Lr/n;

    move-result-object v10

    invoke-virtual {v10, v9}, Lr/n;->a(I)Z

    move-result v10

    if-nez v10, :cond_2

    invoke-direct {p0, v9}, Lj0/b;->d(I)V

    :cond_2
    shr-long/2addr v4, v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_3
    if-ne v6, v7, :cond_5

    :cond_4
    if-eq v3, v1, :cond_5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, LK0/o;->t()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    :goto_3
    if-ge v2, p2, :cond_8

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK0/o;

    invoke-virtual {p0}, Lj0/b;->k()Lr/n;

    move-result-object v1

    invoke-virtual {v0}, LK0/o;->o()I

    move-result v3

    invoke-virtual {v1, v3}, Lr/n;->a(I)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lj0/b;->P:Lr/C;

    invoke-virtual {v0}, LK0/o;->o()I

    move-result v3

    invoke-virtual {v1, v3}, Lr/n;->a(I)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lj0/b;->P:Lr/C;

    invoke-virtual {v0}, LK0/o;->o()I

    move-result v3

    invoke-virtual {v1, v3}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_6

    check-cast v1, Landroidx/compose/ui/platform/o1;

    invoke-direct {p0, v0, v1}, Lj0/b;->z(LK0/o;Landroidx/compose/ui/platform/o1;)V

    goto :goto_4

    :cond_6
    const-string p1, "node not present in pruned tree before this change"

    invoke-static {p1}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_7
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_8
    return-void
.end method


# virtual methods
.method public synthetic D(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->b(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method

.method public H(Landroidx/lifecycle/r;)V
    .locals 0

    iget-object p1, p0, Lj0/b;->D:Lx7/a;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/coreshims/d;

    iput-object p1, p0, Lj0/b;->E:Landroidx/compose/ui/platform/coreshims/d;

    iget-object p1, p0, Lj0/b;->C:Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LK0/q;

    move-result-object p1

    invoke-virtual {p1}, LK0/q;->a()LK0/o;

    move-result-object p1

    invoke-direct {p0, p1}, Lj0/b;->F(LK0/o;)V

    invoke-direct {p0}, Lj0/b;->p()V

    return-void
.end method

.method public final b(Lm7/e;)Ljava/lang/Object;
    .locals 9

    .prologue
    instance-of v0, p1, Lj0/b$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lj0/b$c;

    iget v1, v0, Lj0/b$c;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lj0/b$c;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lj0/b$c;

    invoke-direct {v0, p0, p1}, Lj0/b$c;-><init>(Lj0/b;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lj0/b$c;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lj0/b$c;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    iget-object v2, v0, Lj0/b$c;->G:Ljava/lang/Object;

    check-cast v2, LY8/l;

    iget-object v5, v0, Lj0/b$c;->F:Ljava/lang/Object;

    check-cast v5, Lj0/b;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object p1, v2

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object v2, v0, Lj0/b$c;->G:Ljava/lang/Object;

    check-cast v2, LY8/l;

    iget-object v5, v0, Lj0/b$c;->F:Ljava/lang/Object;

    check-cast v5, Lj0/b;

    :try_start_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_4
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lj0/b;->L:LY8/j;

    invoke-interface {p1}, LY8/B;->iterator()LY8/l;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v5, p0

    :goto_1
    :try_start_3
    iput-object v5, v0, Lj0/b$c;->F:Ljava/lang/Object;

    iput-object p1, v0, Lj0/b$c;->G:Ljava/lang/Object;

    iput v4, v0, Lj0/b$c;->J:I

    invoke-interface {p1, v0}, LY8/l;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v8, v2

    move-object v2, p1

    move-object p1, v8

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-interface {v2}, LY8/l;->next()Ljava/lang/Object;

    invoke-virtual {v5}, Lj0/b;->n()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-direct {v5}, Lj0/b;->p()V

    :cond_6
    iget-boolean p1, v5, Lj0/b;->R:Z

    if-nez p1, :cond_7

    iput-boolean v4, v5, Lj0/b;->R:Z

    iget-object p1, v5, Lj0/b;->M:Landroid/os/Handler;

    iget-object v6, v5, Lj0/b;->S:Ljava/lang/Runnable;

    invoke-virtual {p1, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_7
    iget-object p1, v5, Lj0/b;->K:Lr/b;

    invoke-virtual {p1}, Lr/b;->clear()V

    iget-wide v6, v5, Lj0/b;->H:J

    iput-object v5, v0, Lj0/b$c;->F:Ljava/lang/Object;

    iput-object v2, v0, Lj0/b$c;->G:Ljava/lang/Object;

    iput v3, v0, Lj0/b$c;->J:I

    invoke-static {v6, v7, v0}, LW8/Y;->a(JLm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne p1, v1, :cond_1

    return-object v1

    :cond_8
    iget-object p1, v5, Lj0/b;->K:Lr/b;

    invoke-virtual {p1}, Lr/b;->clear()V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v5, p0

    :goto_3
    iget-object v0, v5, Lj0/b;->K:Lr/b;

    invoke-virtual {v0}, Lr/b;->clear()V

    throw p1
.end method

.method public synthetic f(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->d(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method

.method public synthetic g(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->a(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method

.method public final k()Lr/n;
    .locals 2

    .prologue
    iget-boolean v0, p0, Lj0/b;->J:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj0/b;->J:Z

    iget-object v0, p0, Lj0/b;->C:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LK0/q;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/platform/q1;->b(LK0/q;)Lr/n;

    move-result-object v0

    iput-object v0, p0, Lj0/b;->N:Lr/n;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lj0/b;->O:J

    :cond_0
    iget-object v0, p0, Lj0/b;->N:Lr/n;

    return-object v0
.end method

.method public final l()Landroidx/compose/ui/platform/r;
    .locals 1

    iget-object v0, p0, Lj0/b;->C:Landroidx/compose/ui/platform/r;

    return-object v0
.end method

.method public final n()Z
    .locals 1

    .prologue
    sget-object v0, Lj0/m;->z:Lj0/m$a;

    invoke-virtual {v0}, Lj0/m$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj0/b;->E:Landroidx/compose/ui/platform/coreshims/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public synthetic o(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->c(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lj0/b;->M:Landroid/os/Handler;

    iget-object v0, p0, Lj0/b;->S:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lj0/b;->E:Landroidx/compose/ui/platform/coreshims/d;

    return-void
.end method

.method public final r()V
    .locals 1

    sget-object v0, Lj0/b$a;->C:Lj0/b$a;

    iput-object v0, p0, Lj0/b;->I:Lj0/b$a;

    invoke-direct {p0}, Lj0/b;->h()V

    return-void
.end method

.method public final s([J[ILjava/util/function/Consumer;)V
    .locals 1

    sget-object v0, Lj0/b$b;->a:Lj0/b$b;

    invoke-virtual {v0, p0, p1, p2, p3}, Lj0/b$b;->c(Lj0/b;[J[ILjava/util/function/Consumer;)V

    return-void
.end method

.method public final t()V
    .locals 1

    sget-object v0, Lj0/b$a;->C:Lj0/b$a;

    iput-object v0, p0, Lj0/b;->I:Lj0/b$a;

    invoke-direct {p0}, Lj0/b;->m()V

    return-void
.end method

.method public final u(LF0/J;)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj0/b;->J:Z

    invoke-virtual {p0}, Lj0/b;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lj0/b;->q(LF0/J;)V

    :cond_0
    return-void
.end method

.method public final v()V
    .locals 2

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj0/b;->J:Z

    invoke-virtual {p0}, Lj0/b;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lj0/b;->R:Z

    if-nez v1, :cond_0

    iput-boolean v0, p0, Lj0/b;->R:Z

    iget-object v0, p0, Lj0/b;->M:Landroid/os/Handler;

    iget-object v1, p0, Lj0/b;->S:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final w()V
    .locals 1

    sget-object v0, Lj0/b$a;->D:Lj0/b$a;

    iput-object v0, p0, Lj0/b;->I:Lj0/b$a;

    invoke-direct {p0}, Lj0/b;->C()V

    return-void
.end method

.method public final x(Lj0/b;Landroid/util/LongSparseArray;)V
    .locals 1

    sget-object v0, Lj0/b$b;->a:Lj0/b$b;

    invoke-virtual {v0, p1, p2}, Lj0/b$b;->d(Lj0/b;Landroid/util/LongSparseArray;)V

    return-void
.end method

.method public y(Landroidx/lifecycle/r;)V
    .locals 0

    iget-object p1, p0, Lj0/b;->C:Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LK0/q;

    move-result-object p1

    invoke-virtual {p1}, LK0/q;->a()LK0/o;

    move-result-object p1

    invoke-direct {p0, p1}, Lj0/b;->G(LK0/o;)V

    invoke-direct {p0}, Lj0/b;->p()V

    const/4 p1, 0x0

    iput-object p1, p0, Lj0/b;->E:Landroidx/compose/ui/platform/coreshims/d;

    return-void
.end method
