.class public abstract LR7/p;
.super LR7/k;
.source "SourceFile"

# interfaces
.implements LO7/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR7/p$c;
    }
.end annotation


# instance fields
.field private G:Ljava/util/List;

.field private H:Ljava/util/List;

.field private I:LF8/E;

.field private J:Ljava/util/List;

.field private K:LO7/X;

.field private L:LO7/X;

.field private M:LO7/D;

.field private N:LO7/u;

.field private O:Z

.field private P:Z

.field private Q:Z

.field private R:Z

.field private S:Z

.field private T:Z

.field private U:Z

.field private V:Z

.field private W:Z

.field private X:Z

.field private Y:Z

.field private Z:Z

.field private a0:Ljava/util/Collection;

.field private volatile b0:Lx7/a;

.field private final c0:LO7/y;

.field private final d0:LO7/b$a;

.field private e0:LO7/y;

.field protected f0:Ljava/util/Map;


# direct methods
.method protected constructor <init>(LO7/m;LO7/y;LP7/g;Ln8/f;LO7/b$a;LO7/a0;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {v0}, LR7/p;->M(I)V

    :cond_0
    const/4 v1, 0x1

    if-nez p3, :cond_1

    invoke-static {v1}, LR7/p;->M(I)V

    :cond_1
    if-nez p4, :cond_2

    const/4 v2, 0x2

    invoke-static {v2}, LR7/p;->M(I)V

    :cond_2
    if-nez p5, :cond_3

    const/4 v2, 0x3

    invoke-static {v2}, LR7/p;->M(I)V

    :cond_3
    if-nez p6, :cond_4

    const/4 v2, 0x4

    invoke-static {v2}, LR7/p;->M(I)V

    :cond_4
    invoke-direct {p0, p1, p3, p4, p6}, LR7/k;-><init>(LO7/m;LP7/g;Ln8/f;LO7/a0;)V

    sget-object p1, LO7/t;->i:LO7/u;

    iput-object p1, p0, LR7/p;->N:LO7/u;

    iput-boolean v0, p0, LR7/p;->O:Z

    iput-boolean v0, p0, LR7/p;->P:Z

    iput-boolean v0, p0, LR7/p;->Q:Z

    iput-boolean v0, p0, LR7/p;->R:Z

    iput-boolean v0, p0, LR7/p;->S:Z

    iput-boolean v0, p0, LR7/p;->T:Z

    iput-boolean v0, p0, LR7/p;->U:Z

    iput-boolean v0, p0, LR7/p;->V:Z

    iput-boolean v0, p0, LR7/p;->W:Z

    iput-boolean v0, p0, LR7/p;->X:Z

    iput-boolean v1, p0, LR7/p;->Y:Z

    iput-boolean v0, p0, LR7/p;->Z:Z

    const/4 p1, 0x0

    iput-object p1, p0, LR7/p;->a0:Ljava/util/Collection;

    iput-object p1, p0, LR7/p;->b0:Lx7/a;

    iput-object p1, p0, LR7/p;->e0:LO7/y;

    iput-object p1, p0, LR7/p;->f0:Ljava/util/Map;

    if-nez p2, :cond_5

    move-object p2, p0

    :cond_5
    iput-object p2, p0, LR7/p;->c0:LO7/y;

    iput-object p5, p0, LR7/p;->d0:LO7/b$a;

    return-void
.end method

.method private static synthetic M(I)V
    .locals 7

    .prologue
    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :pswitch_1
    const-string v0, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v1, 0x2

    packed-switch p0, :pswitch_data_1

    :pswitch_2
    const/4 v2, 0x3

    goto :goto_1

    :pswitch_3
    move v2, v1

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    const-string v5, "containingDeclaration"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_4
    const-string v5, "configuration"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_5
    const-string v5, "substitutor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_6
    const-string v5, "originalSubstitutor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_7
    const-string v5, "overriddenDescriptors"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_8
    const-string v5, "extensionReceiverParameter"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_9
    const-string v5, "unsubstitutedReturnType"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_a
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_b
    const-string v5, "visibility"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_c
    const-string v5, "unsubstitutedValueParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_d
    const-string v5, "typeParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_e
    const-string v5, "contextReceiverParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_f
    const-string v5, "source"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_10
    const-string v5, "kind"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_11
    const-string v5, "name"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_12
    const-string v5, "annotations"

    aput-object v5, v2, v4

    :goto_2
    const-string v4, "initialize"

    const-string v5, "newCopyBuilder"

    const/4 v6, 0x1

    packed-switch p0, :pswitch_data_3

    :pswitch_13
    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_14
    const-string v3, "getSourceToUseForCopy"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_15
    const-string v3, "copy"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_16
    aput-object v5, v2, v6

    goto :goto_3

    :pswitch_17
    const-string v3, "getKind"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_18
    const-string v3, "getOriginal"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_19
    const-string v3, "getValueParameters"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1a
    const-string v3, "getTypeParameters"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1b
    const-string v3, "getVisibility"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1c
    const-string v3, "getModality"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1d
    const-string v3, "getOverriddenDescriptors"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1e
    const-string v3, "getContextReceiverParameters"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1f
    aput-object v4, v2, v6

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_20
    const-string v3, "getSubstitutedValueParameters"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_21
    const-string v3, "doSubstitute"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_22
    aput-object v5, v2, v1

    goto :goto_4

    :pswitch_23
    const-string v3, "substitute"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_24
    const-string v3, "setOverriddenDescriptors"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_25
    const-string v3, "setExtensionReceiverParameter"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_26
    const-string v3, "setReturnType"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_27
    const-string v3, "setVisibility"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_28
    aput-object v4, v2, v1

    :goto_4
    :pswitch_29
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    :pswitch_2a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_2b
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_b
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_7
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_6
        :pswitch_a
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_a
        :pswitch_c
        :pswitch_5
        :pswitch_c
        :pswitch_5
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x9
        :pswitch_1f
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_13
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_13
        :pswitch_16
        :pswitch_13
        :pswitch_13
        :pswitch_15
        :pswitch_14
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x5
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_29
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_24
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_23
        :pswitch_29
        :pswitch_22
        :pswitch_21
        :pswitch_29
        :pswitch_29
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x9
        :pswitch_2b
        :pswitch_2a
        :pswitch_2a
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2a
        :pswitch_2b
        :pswitch_2a
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
    .end packed-switch
.end method

.method static synthetic O0(LR7/p;)LO7/X;
    .locals 0

    iget-object p0, p0, LR7/p;->L:LO7/X;

    return-object p0
.end method

.method private W0(ZLO7/y;)LO7/a0;
    .locals 0

    .prologue
    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LR7/p;->a()LO7/y;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, LO7/p;->o()LO7/a0;

    move-result-object p1

    goto :goto_1

    :cond_1
    sget-object p1, LO7/a0;->a:LO7/a0;

    :goto_1
    if-nez p1, :cond_2

    const/16 p2, 0x1b

    invoke-static {p2}, LR7/p;->M(I)V

    :cond_2
    return-object p1
.end method

.method public static X0(LO7/y;Ljava/util/List;LF8/n0;)Ljava/util/List;
    .locals 7

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x1c

    invoke-static {v0}, LR7/p;->M(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0x1d

    invoke-static {v0}, LR7/p;->M(I)V

    :cond_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, LR7/p;->Y0(LO7/y;Ljava/util/List;LF8/n0;ZZ[Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static Y0(LO7/y;Ljava/util/List;LF8/n0;ZZ[Z)Ljava/util/List;
    .locals 18

    .prologue
    move-object/from16 v0, p2

    if-nez p1, :cond_0

    const/16 v1, 0x1e

    invoke-static {v1}, LR7/p;->M(I)V

    :cond_0
    if-nez v0, :cond_1

    const/16 v1, 0x1f

    invoke-static {v1}, LR7/p;->M(I)V

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/j0;

    invoke-interface {v3}, LO7/i0;->getType()LF8/E;

    move-result-object v4

    sget-object v5, LF8/u0;->H:LF8/u0;

    invoke-virtual {v0, v4, v5}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object v11

    invoke-interface {v3}, LO7/j0;->u0()LF8/E;

    move-result-object v4

    const/4 v6, 0x0

    if-nez v4, :cond_2

    move-object v15, v6

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v4, v5}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object v5

    move-object v15, v5

    :goto_1
    if-nez v11, :cond_3

    return-object v6

    :cond_3
    invoke-interface {v3}, LO7/i0;->getType()LF8/E;

    move-result-object v5

    if-ne v11, v5, :cond_4

    if-eq v4, v15, :cond_5

    :cond_4
    if-eqz p5, :cond_5

    const/4 v4, 0x0

    const/4 v5, 0x1

    aput-boolean v5, p5, v4

    :cond_5
    instance-of v4, v3, LR7/L$b;

    if-eqz v4, :cond_6

    move-object v4, v3

    check-cast v4, LR7/L$b;

    invoke-virtual {v4}, LR7/L$b;->W0()Ljava/util/List;

    move-result-object v4

    new-instance v5, LR7/p$b;

    invoke-direct {v5, v4}, LR7/p$b;-><init>(Ljava/util/List;)V

    move-object/from16 v17, v5

    goto :goto_2

    :cond_6
    move-object/from16 v17, v6

    :goto_2
    if-eqz p3, :cond_7

    move-object v7, v6

    goto :goto_3

    :cond_7
    move-object v7, v3

    :goto_3
    invoke-interface {v3}, LO7/j0;->getIndex()I

    move-result v8

    invoke-interface {v3}, LP7/a;->k()LP7/g;

    move-result-object v9

    invoke-interface {v3}, LO7/I;->getName()Ln8/f;

    move-result-object v10

    invoke-interface {v3}, LO7/j0;->D0()Z

    move-result v12

    invoke-interface {v3}, LO7/j0;->j0()Z

    move-result v13

    invoke-interface {v3}, LO7/j0;->e0()Z

    move-result v14

    if-eqz p4, :cond_8

    invoke-interface {v3}, LO7/p;->o()LO7/a0;

    move-result-object v3

    :goto_4
    move-object/from16 v16, v3

    goto :goto_5

    :cond_8
    sget-object v3, LO7/a0;->a:LO7/a0;

    goto :goto_4

    :goto_5
    move-object/from16 v6, p0

    invoke-static/range {v6 .. v17}, LR7/L;->T0(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;Lx7/a;)LR7/L;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_9
    return-object v1
.end method

.method private c1()V
    .locals 1

    .prologue
    iget-object v0, p0, LR7/p;->b0:Lx7/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iput-object v0, p0, LR7/p;->a0:Ljava/util/Collection;

    const/4 v0, 0x0

    iput-object v0, p0, LR7/p;->b0:Lx7/a;

    :cond_0
    return-void
.end method

.method private j1(Z)V
    .locals 0

    iput-boolean p1, p0, LR7/p;->W:Z

    return-void
.end method

.method private k1(Z)V
    .locals 0

    iput-boolean p1, p0, LR7/p;->V:Z

    return-void
.end method

.method private m1(LO7/y;)V
    .locals 0

    iput-object p1, p0, LR7/p;->e0:LO7/y;

    return-void
.end method


# virtual methods
.method public A0()Ljava/util/List;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/p;->J:Ljava/util/List;

    if-nez v0, :cond_0

    const/16 v1, 0xd

    invoke-static {v1}, LR7/p;->M(I)V

    :cond_0
    return-object v0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, LR7/p;->Q:Z

    return v0
.end method

.method public D(LO7/a$a;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, LR7/p;->f0:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public F0()Z
    .locals 1

    iget-boolean v0, p0, LR7/p;->V:Z

    return v0
.end method

.method public G0(Ljava/util/Collection;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x11

    invoke-static {v0}, LR7/p;->M(I)V

    :cond_0
    iput-object p1, p0, LR7/p;->a0:Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/y;

    invoke-interface {v0}, LO7/y;->L0()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, LR7/p;->W:Z

    :cond_2
    return-void
.end method

.method public L()Z
    .locals 1

    iget-boolean v0, p0, LR7/p;->Z:Z

    return v0
.end method

.method public L0()Z
    .locals 1

    iget-boolean v0, p0, LR7/p;->W:Z

    return v0
.end method

.method public N0()Z
    .locals 1

    iget-boolean v0, p0, LR7/p;->U:Z

    return v0
.end method

.method public Q0()Z
    .locals 3

    .prologue
    iget-boolean v0, p0, LR7/p;->P:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, LR7/p;->a()LO7/y;

    move-result-object v0

    invoke-interface {v0}, LO7/y;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/y;

    invoke-interface {v2}, LO7/y;->Q0()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public R()Z
    .locals 1

    iget-boolean v0, p0, LR7/p;->T:Z

    return v0
.end method

.method public T0(LO7/m;LO7/D;LO7/u;LO7/b$a;Z)LO7/y;
    .locals 1

    .prologue
    invoke-virtual {p0}, LR7/p;->z()LO7/y$a;

    move-result-object v0

    invoke-interface {v0, p1}, LO7/y$a;->o(LO7/m;)LO7/y$a;

    move-result-object p1

    invoke-interface {p1, p2}, LO7/y$a;->x(LO7/D;)LO7/y$a;

    move-result-object p1

    invoke-interface {p1, p3}, LO7/y$a;->r(LO7/u;)LO7/y$a;

    move-result-object p1

    invoke-interface {p1, p4}, LO7/y$a;->l(LO7/b$a;)LO7/y$a;

    move-result-object p1

    invoke-interface {p1, p5}, LO7/y$a;->v(Z)LO7/y$a;

    move-result-object p1

    invoke-interface {p1}, LO7/y$a;->i()LO7/y;

    move-result-object p1

    if-nez p1, :cond_0

    const/16 p2, 0x1a

    invoke-static {p2}, LR7/p;->M(I)V

    :cond_0
    return-object p1
.end method

.method protected abstract U0(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LR7/p;
.end method

.method public V()Z
    .locals 1

    iget-boolean v0, p0, LR7/p;->S:Z

    return v0
.end method

.method protected V0(LR7/p$c;)LO7/y;
    .locals 20

    .prologue
    move-object/from16 v7, p0

    move-object/from16 v8, p1

    if-nez v8, :cond_0

    const/16 v0, 0x19

    invoke-static {v0}, LR7/p;->M(I)V

    :cond_0
    const/4 v9, 0x1

    new-array v10, v9, [Z

    invoke-static/range {p1 .. p1}, LR7/p$c;->b(LR7/p$c;)LP7/g;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, LP7/b;->k()LP7/g;

    move-result-object v0

    invoke-static/range {p1 .. p1}, LR7/p$c;->b(LR7/p$c;)LP7/g;

    move-result-object v1

    invoke-static {v0, v1}, LP7/i;->a(LP7/g;LP7/g;)LP7/g;

    move-result-object v0

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_1
    invoke-virtual/range {p0 .. p0}, LP7/b;->k()LP7/g;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v1, v8, LR7/p$c;->b:LO7/m;

    iget-object v2, v8, LR7/p$c;->e:LO7/y;

    iget-object v3, v8, LR7/p$c;->f:LO7/b$a;

    iget-object v4, v8, LR7/p$c;->l:Ln8/f;

    iget-boolean v0, v8, LR7/p$c;->o:Z

    invoke-direct {v7, v0, v2}, LR7/p;->W0(ZLO7/y;)LO7/a0;

    move-result-object v6

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, LR7/p;->U0(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LR7/p;

    move-result-object v6

    invoke-static/range {p1 .. p1}, LR7/p$c;->c(LR7/p$c;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual/range {p0 .. p0}, LR7/p;->g()Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, LR7/p$c;->c(LR7/p$c;)Ljava/util/List;

    move-result-object v0

    :goto_2
    const/4 v11, 0x0

    aget-boolean v1, v10, v11

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v9

    or-int/2addr v1, v2

    aput-boolean v1, v10, v11

    new-instance v15, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, v8, LR7/p$c;->a:LF8/l0;

    invoke-static {v0, v1, v6, v15, v10}, LF8/s;->c(Ljava/util/List;LF8/l0;LO7/m;Ljava/util/List;[Z)LF8/n0;

    move-result-object v14

    const/4 v12, 0x0

    if-nez v14, :cond_3

    return-object v12

    :cond_3
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, v8, LR7/p$c;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, v8, LR7/p$c;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v1, v11

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/X;

    invoke-interface {v2}, LO7/i0;->getType()LF8/E;

    move-result-object v3

    sget-object v4, LF8/u0;->H:LF8/u0;

    invoke-virtual {v14, v3, v4}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object v3

    if-nez v3, :cond_4

    return-object v12

    :cond_4
    invoke-interface {v2}, LO7/X;->getValue()Lz8/g;

    move-result-object v4

    check-cast v4, Lz8/f;

    invoke-interface {v4}, Lz8/f;->a()Ln8/f;

    move-result-object v4

    invoke-interface {v2}, LP7/a;->k()LP7/g;

    move-result-object v5

    add-int/lit8 v16, v1, 0x1

    invoke-static {v6, v3, v4, v5, v1}, Lr8/e;->b(LO7/a;LF8/E;Ln8/f;LP7/g;I)LO7/X;

    move-result-object v1

    invoke-interface {v13, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    aget-boolean v1, v10, v11

    invoke-interface {v2}, LO7/i0;->getType()LF8/E;

    move-result-object v2

    if-eq v3, v2, :cond_5

    move v2, v9

    goto :goto_4

    :cond_5
    move v2, v11

    :goto_4
    or-int/2addr v1, v2

    aput-boolean v1, v10, v11

    move/from16 v1, v16

    goto :goto_3

    :cond_6
    iget-object v0, v8, LR7/p$c;->i:LO7/X;

    if-eqz v0, :cond_9

    invoke-interface {v0}, LO7/i0;->getType()LF8/E;

    move-result-object v0

    sget-object v1, LF8/u0;->H:LF8/u0;

    invoke-virtual {v14, v0, v1}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object v0

    if-nez v0, :cond_7

    return-object v12

    :cond_7
    new-instance v1, LR7/F;

    new-instance v2, Lz8/d;

    iget-object v3, v8, LR7/p$c;->i:LO7/X;

    invoke-interface {v3}, LO7/X;->getValue()Lz8/g;

    move-result-object v3

    invoke-direct {v2, v6, v0, v3}, Lz8/d;-><init>(LO7/a;LF8/E;Lz8/g;)V

    iget-object v3, v8, LR7/p$c;->i:LO7/X;

    invoke-interface {v3}, LP7/a;->k()LP7/g;

    move-result-object v3

    invoke-direct {v1, v6, v2, v3}, LR7/F;-><init>(LO7/m;Lz8/g;LP7/g;)V

    aget-boolean v2, v10, v11

    iget-object v3, v8, LR7/p$c;->i:LO7/X;

    invoke-interface {v3}, LO7/i0;->getType()LF8/E;

    move-result-object v3

    if-eq v0, v3, :cond_8

    move v0, v9

    goto :goto_5

    :cond_8
    move v0, v11

    :goto_5
    or-int/2addr v0, v2

    aput-boolean v0, v10, v11

    move-object/from16 v16, v1

    goto :goto_6

    :cond_9
    move-object/from16 v16, v12

    :goto_6
    iget-object v0, v8, LR7/p$c;->j:LO7/X;

    if-eqz v0, :cond_c

    invoke-interface {v0, v14}, LO7/X;->c(LF8/n0;)LO7/X;

    move-result-object v0

    if-nez v0, :cond_a

    return-object v12

    :cond_a
    aget-boolean v1, v10, v11

    iget-object v2, v8, LR7/p$c;->j:LO7/X;

    if-eq v0, v2, :cond_b

    move v2, v9

    goto :goto_7

    :cond_b
    move v2, v11

    :goto_7
    or-int/2addr v1, v2

    aput-boolean v1, v10, v11

    move-object/from16 v17, v0

    goto :goto_8

    :cond_c
    move-object/from16 v17, v12

    :goto_8
    iget-object v1, v8, LR7/p$c;->g:Ljava/util/List;

    iget-boolean v3, v8, LR7/p$c;->p:Z

    iget-boolean v4, v8, LR7/p$c;->o:Z

    move-object v0, v6

    move-object v2, v14

    move-object v5, v10

    invoke-static/range {v0 .. v5}, LR7/p;->Y0(LO7/y;Ljava/util/List;LF8/n0;ZZ[Z)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_d

    return-object v12

    :cond_d
    iget-object v1, v8, LR7/p$c;->k:LF8/E;

    sget-object v2, LF8/u0;->I:LF8/u0;

    invoke-virtual {v14, v1, v2}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object v1

    if-nez v1, :cond_e

    return-object v12

    :cond_e
    aget-boolean v2, v10, v11

    iget-object v3, v8, LR7/p$c;->k:LF8/E;

    if-eq v1, v3, :cond_f

    move v3, v9

    goto :goto_9

    :cond_f
    move v3, v11

    :goto_9
    or-int/2addr v2, v3

    aput-boolean v2, v10, v11

    if-nez v2, :cond_10

    iget-boolean v2, v8, LR7/p$c;->w:Z

    if-eqz v2, :cond_10

    return-object v7

    :cond_10
    iget-object v2, v8, LR7/p$c;->c:LO7/D;

    iget-object v3, v8, LR7/p$c;->d:LO7/u;

    move-object v11, v6

    move-object/from16 v12, v16

    move-object v4, v13

    move-object/from16 v13, v17

    move-object v5, v14

    move-object v14, v4

    move-object/from16 v16, v0

    move-object/from16 v17, v1

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    invoke-virtual/range {v11 .. v19}, LR7/p;->a1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;)LR7/p;

    iget-boolean v0, v7, LR7/p;->O:Z

    invoke-virtual {v6, v0}, LR7/p;->o1(Z)V

    iget-boolean v0, v7, LR7/p;->P:Z

    invoke-virtual {v6, v0}, LR7/p;->l1(Z)V

    iget-boolean v0, v7, LR7/p;->Q:Z

    invoke-virtual {v6, v0}, LR7/p;->g1(Z)V

    iget-boolean v0, v7, LR7/p;->R:Z

    invoke-virtual {v6, v0}, LR7/p;->n1(Z)V

    iget-boolean v0, v7, LR7/p;->S:Z

    invoke-virtual {v6, v0}, LR7/p;->r1(Z)V

    iget-boolean v0, v7, LR7/p;->X:Z

    invoke-virtual {v6, v0}, LR7/p;->q1(Z)V

    iget-boolean v0, v7, LR7/p;->T:Z

    invoke-virtual {v6, v0}, LR7/p;->f1(Z)V

    iget-boolean v0, v7, LR7/p;->U:Z

    invoke-virtual {v6, v0}, LR7/p;->e1(Z)V

    iget-boolean v0, v7, LR7/p;->Y:Z

    invoke-virtual {v6, v0}, LR7/p;->h1(Z)V

    invoke-static/range {p1 .. p1}, LR7/p$c;->d(LR7/p$c;)Z

    move-result v0

    invoke-direct {v6, v0}, LR7/p;->k1(Z)V

    invoke-static/range {p1 .. p1}, LR7/p$c;->e(LR7/p$c;)Z

    move-result v0

    invoke-direct {v6, v0}, LR7/p;->j1(Z)V

    invoke-static/range {p1 .. p1}, LR7/p$c;->f(LR7/p$c;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-static/range {p1 .. p1}, LR7/p$c;->f(LR7/p$c;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_a

    :cond_11
    iget-boolean v0, v7, LR7/p;->Z:Z

    :goto_a
    invoke-virtual {v6, v0}, LR7/p;->i1(Z)V

    invoke-static/range {p1 .. p1}, LR7/p$c;->g(LR7/p$c;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, v7, LR7/p;->f0:Ljava/util/Map;

    if-eqz v0, :cond_16

    :cond_12
    invoke-static/range {p1 .. p1}, LR7/p$c;->g(LR7/p$c;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, v7, LR7/p;->f0:Ljava/util/Map;

    if-eqz v1, :cond_14

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_13
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_14
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    if-ne v1, v9, :cond_15

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    :cond_15
    iput-object v0, v6, LR7/p;->f0:Ljava/util/Map;

    :cond_16
    iget-boolean v0, v8, LR7/p$c;->n:Z

    if-nez v0, :cond_17

    invoke-virtual/range {p0 .. p0}, LR7/p;->l0()LO7/y;

    move-result-object v0

    if-eqz v0, :cond_19

    :cond_17
    invoke-virtual/range {p0 .. p0}, LR7/p;->l0()LO7/y;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-virtual/range {p0 .. p0}, LR7/p;->l0()LO7/y;

    move-result-object v0

    goto :goto_c

    :cond_18
    move-object v0, v7

    :goto_c
    invoke-interface {v0, v5}, LO7/y;->c(LF8/n0;)LO7/y;

    move-result-object v0

    invoke-direct {v6, v0}, LR7/p;->m1(LO7/y;)V

    :cond_19
    iget-boolean v0, v8, LR7/p$c;->m:Z

    if-eqz v0, :cond_1c

    invoke-virtual/range {p0 .. p0}, LR7/p;->a()LO7/y;

    move-result-object v0

    invoke-interface {v0}, LO7/y;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1c

    iget-object v0, v8, LR7/p$c;->a:LF8/l0;

    invoke-virtual {v0}, LF8/l0;->f()Z

    move-result v0

    if-eqz v0, :cond_1b

    iget-object v0, v7, LR7/p;->b0:Lx7/a;

    if-eqz v0, :cond_1a

    goto :goto_d

    :cond_1a
    invoke-virtual/range {p0 .. p0}, LR7/p;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v6, v0}, LR7/p;->G0(Ljava/util/Collection;)V

    goto :goto_e

    :cond_1b
    new-instance v0, LR7/p$a;

    invoke-direct {v0, v7, v5}, LR7/p$a;-><init>(LR7/p;LF8/n0;)V

    :goto_d
    iput-object v0, v6, LR7/p;->b0:Lx7/a;

    :cond_1c
    :goto_e
    return-object v6
.end method

.method public W()Z
    .locals 3

    .prologue
    iget-boolean v0, p0, LR7/p;->O:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, LR7/p;->a()LO7/y;

    move-result-object v0

    invoke-interface {v0}, LO7/y;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/y;

    invoke-interface {v2}, LO7/y;->W()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public Z0()Z
    .locals 1

    iget-boolean v0, p0, LR7/p;->Y:Z

    return v0
.end method

.method public a()LO7/y;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/p;->c0:LO7/y;

    if-ne v0, p0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LO7/y;->a()LO7/y;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    const/16 v1, 0x14

    invoke-static {v1}, LR7/p;->M(I)V

    :cond_1
    return-object v0
.end method

.method public a1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;)LR7/p;
    .locals 1

    .prologue
    if-nez p3, :cond_0

    const/4 v0, 0x5

    invoke-static {v0}, LR7/p;->M(I)V

    :cond_0
    if-nez p4, :cond_1

    const/4 v0, 0x6

    invoke-static {v0}, LR7/p;->M(I)V

    :cond_1
    if-nez p5, :cond_2

    const/4 v0, 0x7

    invoke-static {v0}, LR7/p;->M(I)V

    :cond_2
    if-nez p8, :cond_3

    const/16 v0, 0x8

    invoke-static {v0}, LR7/p;->M(I)V

    :cond_3
    invoke-static {p4}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LR7/p;->G:Ljava/util/List;

    invoke-static {p5}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LR7/p;->H:Ljava/util/List;

    iput-object p6, p0, LR7/p;->I:LF8/E;

    iput-object p7, p0, LR7/p;->M:LO7/D;

    iput-object p8, p0, LR7/p;->N:LO7/u;

    iput-object p1, p0, LR7/p;->K:LO7/X;

    iput-object p2, p0, LR7/p;->L:LO7/X;

    iput-object p3, p0, LR7/p;->J:Ljava/util/List;

    const/4 p1, 0x0

    move p2, p1

    :goto_0
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p3

    const-string p6, " but position is "

    if-ge p2, p3, :cond_5

    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LO7/f0;

    invoke-interface {p3}, LO7/f0;->getIndex()I

    move-result p7

    if-ne p7, p2, :cond_4

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p5, " index is "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, LO7/f0;->getIndex()I

    move-result p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_7

    invoke-interface {p5, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LO7/j0;

    invoke-interface {p2}, LO7/j0;->getIndex()I

    move-result p3

    if-ne p3, p1, :cond_6

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_6
    new-instance p3, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p5, "index is "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, LO7/j0;->getIndex()I

    move-result p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_7
    return-object p0
.end method

.method protected b1(LF8/n0;)LR7/p$c;
    .locals 13

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x18

    invoke-static {v0}, LR7/p;->M(I)V

    :cond_0
    new-instance v0, LR7/p$c;

    invoke-virtual {p1}, LF8/n0;->j()LF8/l0;

    move-result-object v3

    invoke-virtual {p0}, LR7/k;->b()LO7/m;

    move-result-object v4

    invoke-virtual {p0}, LR7/p;->q()LO7/D;

    move-result-object v5

    invoke-virtual {p0}, LR7/p;->h()LO7/u;

    move-result-object v6

    invoke-virtual {p0}, LR7/p;->j()LO7/b$a;

    move-result-object v7

    invoke-virtual {p0}, LR7/p;->n()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0}, LR7/p;->A0()Ljava/util/List;

    move-result-object v9

    invoke-virtual {p0}, LR7/p;->v0()LO7/X;

    move-result-object v10

    invoke-virtual {p0}, LR7/p;->l()LF8/E;

    move-result-object v11

    const/4 v12, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v12}, LR7/p$c;-><init>(LR7/p;LF8/l0;LO7/m;LO7/D;LO7/u;LO7/b$a;Ljava/util/List;Ljava/util/List;LO7/X;LF8/E;Ln8/f;)V

    return-object v0
.end method

.method public bridge synthetic c(LF8/n0;)LO7/n;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p;->c(LF8/n0;)LO7/y;

    move-result-object p1

    return-object p1
.end method

.method public c(LF8/n0;)LO7/y;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x16

    invoke-static {v0}, LR7/p;->M(I)V

    :cond_0
    invoke-virtual {p1}, LF8/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    invoke-virtual {p0, p1}, LR7/p;->b1(LF8/n0;)LR7/p$c;

    move-result-object p1

    invoke-virtual {p0}, LR7/p;->a()LO7/y;

    move-result-object v0

    invoke-virtual {p1, v0}, LR7/p$c;->O(LO7/b;)LR7/p$c;

    move-result-object p1

    invoke-virtual {p1}, LR7/p$c;->Q()LR7/p$c;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LR7/p$c;->K(Z)LR7/p$c;

    move-result-object p1

    invoke-virtual {p1}, LR7/p$c;->i()LO7/y;

    move-result-object p1

    return-object p1
.end method

.method public d1(LO7/a$a;Ljava/lang/Object;)V
    .locals 1

    .prologue
    iget-object v0, p0, LR7/p;->f0:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LR7/p;->f0:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, LR7/p;->f0:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public e1(Z)V
    .locals 0

    iput-boolean p1, p0, LR7/p;->U:Z

    return-void
.end method

.method public f()Ljava/util/Collection;
    .locals 2

    .prologue
    invoke-direct {p0}, LR7/p;->c1()V

    iget-object v0, p0, LR7/p;->a0:Ljava/util/Collection;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    const/16 v1, 0xe

    invoke-static {v1}, LR7/p;->M(I)V

    :cond_1
    return-object v0
.end method

.method public f1(Z)V
    .locals 0

    iput-boolean p1, p0, LR7/p;->T:Z

    return-void
.end method

.method public g()Ljava/util/List;
    .locals 3

    .prologue
    iget-object v0, p0, LR7/p;->G:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "typeParameters == null for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g1(Z)V
    .locals 0

    iput-boolean p1, p0, LR7/p;->Q:Z

    return-void
.end method

.method public h()LO7/u;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/p;->N:LO7/u;

    if-nez v0, :cond_0

    const/16 v1, 0x10

    invoke-static {v1}, LR7/p;->M(I)V

    :cond_0
    return-object v0
.end method

.method public h1(Z)V
    .locals 0

    iput-boolean p1, p0, LR7/p;->Y:Z

    return-void
.end method

.method public i1(Z)V
    .locals 0

    iput-boolean p1, p0, LR7/p;->Z:Z

    return-void
.end method

.method public j()LO7/b$a;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/p;->d0:LO7/b$a;

    if-nez v0, :cond_0

    const/16 v1, 0x15

    invoke-static {v1}, LR7/p;->M(I)V

    :cond_0
    return-object v0
.end method

.method public l()LF8/E;
    .locals 1

    iget-object v0, p0, LR7/p;->I:LF8/E;

    return-object v0
.end method

.method public l0()LO7/y;
    .locals 1

    iget-object v0, p0, LR7/p;->e0:LO7/y;

    return-object v0
.end method

.method public l1(Z)V
    .locals 0

    iput-boolean p1, p0, LR7/p;->P:Z

    return-void
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, LR7/p;->R:Z

    return v0
.end method

.method public m0()LO7/X;
    .locals 1

    iget-object v0, p0, LR7/p;->L:LO7/X;

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/p;->H:Ljava/util/List;

    if-nez v0, :cond_0

    const/16 v1, 0x13

    invoke-static {v1}, LR7/p;->M(I)V

    :cond_0
    return-object v0
.end method

.method public n1(Z)V
    .locals 0

    iput-boolean p1, p0, LR7/p;->R:Z

    return-void
.end method

.method public o1(Z)V
    .locals 0

    iput-boolean p1, p0, LR7/p;->O:Z

    return-void
.end method

.method public p1(LF8/E;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xb

    invoke-static {v0}, LR7/p;->M(I)V

    :cond_0
    iput-object p1, p0, LR7/p;->I:LF8/E;

    return-void
.end method

.method public q()LO7/D;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/p;->M:LO7/D;

    if-nez v0, :cond_0

    const/16 v1, 0xf

    invoke-static {v1}, LR7/p;->M(I)V

    :cond_0
    return-object v0
.end method

.method public q1(Z)V
    .locals 0

    iput-boolean p1, p0, LR7/p;->X:Z

    return-void
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, LO7/o;->d(LO7/y;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public r1(Z)V
    .locals 0

    iput-boolean p1, p0, LR7/p;->S:Z

    return-void
.end method

.method public s1(LO7/u;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xa

    invoke-static {v0}, LR7/p;->M(I)V

    :cond_0
    iput-object p1, p0, LR7/p;->N:LO7/u;

    return-void
.end method

.method public v0()LO7/X;
    .locals 1

    iget-object v0, p0, LR7/p;->K:LO7/X;

    return-object v0
.end method

.method public y()Z
    .locals 1

    iget-boolean v0, p0, LR7/p;->X:Z

    return v0
.end method

.method public z()LO7/y$a;
    .locals 2

    .prologue
    sget-object v0, LF8/n0;->b:LF8/n0;

    invoke-virtual {p0, v0}, LR7/p;->b1(LF8/n0;)LR7/p$c;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x17

    invoke-static {v1}, LR7/p;->M(I)V

    :cond_0
    return-object v0
.end method
