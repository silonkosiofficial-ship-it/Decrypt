.class public final Landroidx/compose/ui/focus/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/n$a;
    }
.end annotation


# static fields
.field public static final b:Landroidx/compose/ui/focus/n$a;

.field private static final c:Landroidx/compose/ui/focus/n;

.field private static final d:Landroidx/compose/ui/focus/n;


# instance fields
.field private final a:LX/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/focus/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/focus/n$a;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/ui/focus/n;->b:Landroidx/compose/ui/focus/n$a;

    new-instance v0, Landroidx/compose/ui/focus/n;

    invoke-direct {v0}, Landroidx/compose/ui/focus/n;-><init>()V

    sput-object v0, Landroidx/compose/ui/focus/n;->c:Landroidx/compose/ui/focus/n;

    new-instance v0, Landroidx/compose/ui/focus/n;

    invoke-direct {v0}, Landroidx/compose/ui/focus/n;-><init>()V

    sput-object v0, Landroidx/compose/ui/focus/n;->d:Landroidx/compose/ui/focus/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LX/b;

    const/16 v1, 0x10

    new-array v1, v1, [Lm0/m;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, Landroidx/compose/ui/focus/n;->a:LX/b;

    return-void
.end method

.method public static final synthetic a()Landroidx/compose/ui/focus/n;
    .locals 1

    sget-object v0, Landroidx/compose/ui/focus/n;->d:Landroidx/compose/ui/focus/n;

    return-object v0
.end method

.method public static final synthetic b()Landroidx/compose/ui/focus/n;
    .locals 1

    sget-object v0, Landroidx/compose/ui/focus/n;->c:Landroidx/compose/ui/focus/n;

    return-object v0
.end method


# virtual methods
.method public final c(Lx7/l;)Z
    .locals 17

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Landroidx/compose/ui/focus/n;->b:Landroidx/compose/ui/focus/n$a;

    invoke-virtual {v2}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object v3

    const-string v4, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    if-eq v0, v3, :cond_14

    invoke-virtual {v2}, Landroidx/compose/ui/focus/n$a;->a()Landroidx/compose/ui/focus/n;

    move-result-object v2

    if-eq v0, v2, :cond_13

    iget-object v2, v0, Landroidx/compose/ui/focus/n;->a:LX/b;

    invoke-virtual {v2}, LX/b;->x()Z

    move-result v2

    if-eqz v2, :cond_12

    iget-object v2, v0, Landroidx/compose/ui/focus/n;->a:LX/b;

    invoke-virtual {v2}, LX/b;->t()I

    move-result v3

    const/4 v4, 0x0

    if-lez v3, :cond_11

    invoke-virtual {v2}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v2

    move v5, v4

    move v6, v5

    :cond_0
    aget-object v7, v2, v5

    check-cast v7, Lm0/m;

    const/16 v8, 0x400

    invoke-static {v8}, LF0/f0;->a(I)I

    move-result v8

    invoke-interface {v7}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v9

    if-eqz v9, :cond_10

    new-instance v9, LX/b;

    const/16 v10, 0x10

    new-array v11, v10, [Landroidx/compose/ui/d$c;

    invoke-direct {v9, v11, v4}, LX/b;-><init>([Ljava/lang/Object;I)V

    invoke-interface {v7}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v11

    if-nez v11, :cond_1

    invoke-interface {v7}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v7

    :goto_0
    invoke-static {v9, v7}, LF0/k;->a(LX/b;Landroidx/compose/ui/d$c;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9, v11}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    invoke-virtual {v9}, LX/b;->x()Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-virtual {v9}, LX/b;->t()I

    move-result v7

    const/4 v11, 0x1

    sub-int/2addr v7, v11

    invoke-virtual {v9, v7}, LX/b;->D(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/d$c;

    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->q1()I

    move-result v12

    and-int/2addr v12, v8

    if-nez v12, :cond_3

    goto :goto_0

    :cond_3
    :goto_2
    if-eqz v7, :cond_2

    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->v1()I

    move-result v12

    and-int/2addr v12, v8

    if-eqz v12, :cond_e

    const/4 v13, 0x0

    :goto_3
    if-eqz v7, :cond_2

    instance-of v14, v7, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v14, :cond_5

    check-cast v7, Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {v7}, Landroidx/compose/ui/focus/FocusTargetNode;->Y1()Landroidx/compose/ui/focus/j;

    move-result-object v14

    invoke-interface {v14}, Landroidx/compose/ui/focus/j;->p()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v1, v7}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    goto :goto_4

    :cond_4
    sget-object v14, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v14}, Landroidx/compose/ui/focus/d$a;->b()I

    move-result v14

    invoke-static {v7, v14, v1}, Landroidx/compose/ui/focus/v;->k(Landroidx/compose/ui/focus/FocusTargetNode;ILx7/l;)Z

    move-result v7

    :goto_4
    if-eqz v7, :cond_d

    move v6, v11

    goto :goto_9

    :cond_5
    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->v1()I

    move-result v14

    and-int/2addr v14, v8

    if-eqz v14, :cond_6

    move v14, v11

    goto :goto_5

    :cond_6
    move v14, v4

    :goto_5
    if-eqz v14, :cond_d

    instance-of v14, v7, LF0/m;

    if-eqz v14, :cond_d

    move-object v14, v7

    check-cast v14, LF0/m;

    invoke-virtual {v14}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v14

    move v15, v4

    :goto_6
    if-eqz v14, :cond_c

    invoke-virtual {v14}, Landroidx/compose/ui/d$c;->v1()I

    move-result v16

    and-int v16, v16, v8

    if-eqz v16, :cond_7

    move/from16 v16, v11

    goto :goto_7

    :cond_7
    move/from16 v16, v4

    :goto_7
    if-eqz v16, :cond_b

    add-int/lit8 v15, v15, 0x1

    if-ne v15, v11, :cond_8

    move-object v7, v14

    goto :goto_8

    :cond_8
    if-nez v13, :cond_9

    new-instance v13, LX/b;

    new-array v12, v10, [Landroidx/compose/ui/d$c;

    invoke-direct {v13, v12, v4}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_9
    if-eqz v7, :cond_a

    invoke-virtual {v13, v7}, LX/b;->d(Ljava/lang/Object;)Z

    const/4 v7, 0x0

    :cond_a
    invoke-virtual {v13, v14}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_b
    :goto_8
    invoke-virtual {v14}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v14

    goto :goto_6

    :cond_c
    if-ne v15, v11, :cond_d

    goto :goto_3

    :cond_d
    invoke-static {v13}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v7

    goto :goto_3

    :cond_e
    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v7

    goto/16 :goto_2

    :cond_f
    :goto_9
    add-int/lit8 v5, v5, 0x1

    if-lt v5, v3, :cond_0

    move v4, v6

    goto :goto_a

    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "visitChildren called on an unattached node"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_11
    :goto_a
    return v4

    :cond_12
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_13
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_14
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final d()Z
    .locals 1

    sget-object v0, Landroidx/compose/ui/focus/n$b;->D:Landroidx/compose/ui/focus/n$b;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/n;->c(Lx7/l;)Z

    move-result v0

    return v0
.end method

.method public final e()LX/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/n;->a:LX/b;

    return-object v0
.end method

.method public final f()V
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/focus/n;->d()Z

    return-void
.end method
