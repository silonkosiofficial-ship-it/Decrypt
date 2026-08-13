.class public LR7/C;
.super LR7/N;
.source "SourceFile"

# interfaces
.implements LO7/U;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR7/C$a;
    }
.end annotation


# instance fields
.field private final K:LO7/D;

.field private L:LO7/u;

.field private M:Ljava/util/Collection;

.field private final N:LO7/U;

.field private final O:LO7/b$a;

.field private final P:Z

.field private final Q:Z

.field private final R:Z

.field private final S:Z

.field private final T:Z

.field private final U:Z

.field private V:Ljava/util/List;

.field private W:LO7/X;

.field private X:LO7/X;

.field private Y:Ljava/util/List;

.field private Z:LR7/D;

.field private a0:LO7/W;

.field private b0:Z

.field private c0:LO7/w;

.field private d0:LO7/w;


# direct methods
.method protected constructor <init>(LO7/m;LO7/U;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/b$a;LO7/a0;ZZZZZZ)V
    .locals 11

    .prologue
    move-object v7, p0

    move-object v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p8

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_0
    if-nez p3, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_1
    if-nez v8, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_2
    if-nez v9, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_3
    if-nez p7, :cond_4

    const/4 v0, 0x4

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_4
    if-nez v10, :cond_5

    const/4 v0, 0x5

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_5
    if-nez p9, :cond_6

    const/4 v0, 0x6

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_6
    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object/from16 v3, p7

    move/from16 v5, p6

    move-object/from16 v6, p9

    invoke-direct/range {v0 .. v6}, LR7/N;-><init>(LO7/m;LP7/g;Ln8/f;LF8/E;ZLO7/a0;)V

    const/4 v0, 0x0

    iput-object v0, v7, LR7/C;->M:Ljava/util/Collection;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, v7, LR7/C;->V:Ljava/util/List;

    iput-object v8, v7, LR7/C;->K:LO7/D;

    iput-object v9, v7, LR7/C;->L:LO7/u;

    if-nez p2, :cond_7

    move-object v0, v7

    goto :goto_0

    :cond_7
    move-object v0, p2

    :goto_0
    iput-object v0, v7, LR7/C;->N:LO7/U;

    iput-object v10, v7, LR7/C;->O:LO7/b$a;

    move/from16 v0, p10

    iput-boolean v0, v7, LR7/C;->P:Z

    move/from16 v0, p11

    iput-boolean v0, v7, LR7/C;->Q:Z

    move/from16 v0, p12

    iput-boolean v0, v7, LR7/C;->R:Z

    move/from16 v0, p13

    iput-boolean v0, v7, LR7/C;->S:Z

    move/from16 v0, p14

    iput-boolean v0, v7, LR7/C;->T:Z

    move/from16 v0, p15

    iput-boolean v0, v7, LR7/C;->U:Z

    return-void
.end method

.method private static synthetic M(I)V
    .locals 11

    .prologue
    const/16 v0, 0x2a

    const/16 v1, 0x29

    const/16 v2, 0x27

    const/16 v3, 0x26

    const/16 v4, 0x1c

    if-eq p0, v4, :cond_0

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const-string v5, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    :pswitch_0
    const-string v5, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v6, 0x2

    if-eq p0, v4, :cond_1

    if-eq p0, v3, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    packed-switch p0, :pswitch_data_1

    const/4 v7, 0x3

    goto :goto_1

    :cond_1
    :pswitch_1
    move v7, v6

    :goto_1
    new-array v7, v7, [Ljava/lang/Object;

    const-string v8, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl"

    const/4 v9, 0x0

    packed-switch p0, :pswitch_data_2

    :pswitch_2
    const-string v10, "containingDeclaration"

    aput-object v10, v7, v9

    goto/16 :goto_2

    :pswitch_3
    const-string v10, "overriddenDescriptors"

    aput-object v10, v7, v9

    goto/16 :goto_2

    :pswitch_4
    const-string v10, "newName"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_5
    const-string v10, "newVisibility"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_6
    const-string v10, "newModality"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_7
    const-string v10, "newOwner"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_8
    const-string v10, "accessorDescriptor"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_9
    const-string v10, "substitutor"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_a
    const-string v10, "copyConfiguration"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_b
    const-string v10, "originalSubstitutor"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_c
    aput-object v8, v7, v9

    goto :goto_2

    :pswitch_d
    const-string v10, "contextReceiverParameters"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_e
    const-string v10, "typeParameters"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_f
    const-string v10, "outType"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_10
    const-string v10, "inType"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_11
    const-string v10, "source"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_12
    const-string v10, "kind"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_13
    const-string v10, "name"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_14
    const-string v10, "visibility"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_15
    const-string v10, "modality"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_16
    const-string v10, "annotations"

    aput-object v10, v7, v9

    :goto_2
    const/4 v9, 0x1

    if-eq p0, v4, :cond_6

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    packed-switch p0, :pswitch_data_3

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_17
    const-string v8, "getAccessors"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_18
    const-string v8, "getVisibility"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_19
    const-string v8, "getModality"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_1a
    const-string v8, "getReturnType"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_1b
    const-string v8, "getContextReceiverParameters"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_1c
    const-string v8, "getTypeParameters"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_2
    const-string v8, "copy"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_3
    const-string v8, "getOverriddenDescriptors"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_4
    const-string v8, "getKind"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_5
    const-string v8, "getOriginal"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_6
    const-string v8, "getSourceToUseForCopy"

    aput-object v8, v7, v9

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v8, "<init>"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_1d
    const-string v8, "setOverriddenDescriptors"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_1e
    const-string v8, "createSubstitutedCopy"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_1f
    const-string v8, "getSubstitutedInitialSignatureDescriptor"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_20
    const-string v8, "doSubstitute"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_21
    const-string v8, "substitute"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_22
    const-string v8, "setVisibility"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_23
    const-string v8, "setType"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_24
    const-string v8, "setInType"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_25
    const-string v8, "create"

    aput-object v8, v7, v6

    :goto_4
    :pswitch_26
    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    if-eq p0, v4, :cond_7

    if-eq p0, v3, :cond_7

    if-eq p0, v2, :cond_7

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    packed-switch p0, :pswitch_data_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    :pswitch_27
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_2
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_14
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_c
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_12
        :pswitch_4
        :pswitch_11
        :pswitch_c
        :pswitch_c
        :pswitch_3
        :pswitch_c
        :pswitch_c
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x15
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x7
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_22
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_21
        :pswitch_26
        :pswitch_20
        :pswitch_1f
        :pswitch_1f
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_26
        :pswitch_26
        :pswitch_1d
        :pswitch_26
        :pswitch_26
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x15
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
    .end packed-switch
.end method

.method static synthetic V0(LR7/C;)LO7/X;
    .locals 0

    iget-object p0, p0, LR7/C;->W:LO7/X;

    return-object p0
.end method

.method public static X0(LO7/m;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/b$a;LO7/a0;ZZZZZZ)LR7/C;
    .locals 17

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x7

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x8

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_1
    if-nez p2, :cond_2

    const/16 v0, 0x9

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_2
    if-nez p3, :cond_3

    const/16 v0, 0xa

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_3
    if-nez p5, :cond_4

    const/16 v0, 0xb

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_4
    if-nez p6, :cond_5

    const/16 v0, 0xc

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_5
    if-nez p7, :cond_6

    const/16 v0, 0xd

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_6
    new-instance v16, LR7/C;

    const/4 v2, 0x0

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    move/from16 v12, p10

    move/from16 v13, p11

    move/from16 v14, p12

    move/from16 v15, p13

    invoke-direct/range {v0 .. v15}, LR7/C;-><init>(LO7/m;LO7/U;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/b$a;LO7/a0;ZZZZZZ)V

    return-object v16
.end method

.method private b1(ZLO7/U;)LO7/a0;
    .locals 0

    .prologue
    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LR7/C;->a()LO7/U;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, LO7/p;->o()LO7/a0;

    move-result-object p1

    goto :goto_1

    :cond_1
    sget-object p1, LO7/a0;->a:LO7/a0;

    :goto_1
    if-nez p1, :cond_2

    const/16 p2, 0x1c

    invoke-static {p2}, LR7/C;->M(I)V

    :cond_2
    return-object p1
.end method

.method private static c1(LF8/n0;LO7/T;)LO7/y;
    .locals 1

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x1e

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x1f

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_1
    invoke-interface {p1}, LO7/y;->l0()LO7/y;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, LO7/y;->l0()LO7/y;

    move-result-object p1

    invoke-interface {p1, p0}, LO7/y;->c(LF8/n0;)LO7/y;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static h1(LO7/u;LO7/b$a;)LO7/u;
    .locals 1

    .prologue
    sget-object v0, LO7/b$a;->D:LO7/b$a;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, LO7/u;->f()LO7/u;

    move-result-object p1

    invoke-static {p1}, LO7/t;->g(LO7/u;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p0, LO7/t;->h:LO7/u;

    :cond_0
    return-object p0
.end method

.method private static m1(LF8/n0;LO7/U;LO7/X;)LO7/X;
    .locals 4

    .prologue
    invoke-interface {p2}, LO7/i0;->getType()LF8/E;

    move-result-object v0

    sget-object v1, LF8/u0;->H:LF8/u0;

    invoke-virtual {p0, v0, v1}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, LR7/F;

    new-instance v1, Lz8/c;

    invoke-interface {p2}, LO7/X;->getValue()Lz8/g;

    move-result-object v2

    check-cast v2, Lz8/f;

    invoke-interface {v2}, Lz8/f;->a()Ln8/f;

    move-result-object v2

    invoke-interface {p2}, LO7/X;->getValue()Lz8/g;

    move-result-object v3

    invoke-direct {v1, p1, p0, v2, v3}, Lz8/c;-><init>(LO7/a;LF8/E;Ln8/f;Lz8/g;)V

    invoke-interface {p2}, LP7/a;->k()LP7/g;

    move-result-object p0

    invoke-direct {v0, p1, v1, p0}, LR7/F;-><init>(LO7/m;Lz8/g;LP7/g;)V

    return-object v0
.end method

.method private static n1(LF8/n0;LO7/U;LO7/X;)LO7/X;
    .locals 3

    .prologue
    invoke-interface {p2}, LO7/i0;->getType()LF8/E;

    move-result-object v0

    sget-object v1, LF8/u0;->H:LF8/u0;

    invoke-virtual {p0, v0, v1}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, LR7/F;

    new-instance v1, Lz8/d;

    invoke-interface {p2}, LO7/X;->getValue()Lz8/g;

    move-result-object v2

    invoke-direct {v1, p1, p0, v2}, Lz8/d;-><init>(LO7/a;LF8/E;Lz8/g;)V

    invoke-interface {p2}, LP7/a;->k()LP7/g;

    move-result-object p0

    invoke-direct {v0, p1, v1, p0}, LR7/F;-><init>(LO7/m;Lz8/g;LP7/g;)V

    return-object v0
.end method


# virtual methods
.method public A0()Ljava/util/List;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/C;->V:Ljava/util/List;

    if-nez v0, :cond_0

    const/16 v1, 0x16

    invoke-static {v1}, LR7/C;->M(I)V

    :cond_0
    return-object v0
.end method

.method public B()Ljava/util/List;
    .locals 2

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, LR7/C;->Z:LR7/D;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, LR7/C;->a0:LO7/W;

    if-eqz v1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method

.method public B0()Z
    .locals 1

    iget-boolean v0, p0, LR7/C;->P:Z

    return v0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, LR7/C;->T:Z

    return v0
.end method

.method public D(LO7/a$a;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public F()Z
    .locals 1

    iget-boolean v0, p0, LR7/C;->Q:Z

    return v0
.end method

.method public G0(Ljava/util/Collection;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x28

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_0
    iput-object p1, p0, LR7/C;->M:Ljava/util/Collection;

    return-void
.end method

.method public bridge synthetic J0()LO7/p;
    .locals 1

    invoke-virtual {p0}, LR7/C;->a()LO7/U;

    move-result-object v0

    return-object v0
.end method

.method public N0()Z
    .locals 1

    iget-boolean v0, p0, LR7/C;->S:Z

    return v0
.end method

.method public R()Z
    .locals 1

    iget-boolean v0, p0, LR7/C;->R:Z

    return v0
.end method

.method public T()Z
    .locals 1

    iget-boolean v0, p0, LR7/C;->U:Z

    return v0
.end method

.method public W0(LO7/m;LO7/D;LO7/u;LO7/b$a;Z)LO7/U;
    .locals 1

    .prologue
    invoke-virtual {p0}, LR7/C;->g1()LR7/C$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LR7/C$a;->u(LO7/m;)LR7/C$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LR7/C$a;->t(LO7/b;)LR7/C$a;

    move-result-object p1

    invoke-virtual {p1, p2}, LR7/C$a;->s(LO7/D;)LR7/C$a;

    move-result-object p1

    invoke-virtual {p1, p3}, LR7/C$a;->w(LO7/u;)LR7/C$a;

    move-result-object p1

    invoke-virtual {p1, p4}, LR7/C$a;->r(LO7/b$a;)LR7/C$a;

    move-result-object p1

    invoke-virtual {p1, p5}, LR7/C$a;->q(Z)LR7/C$a;

    move-result-object p1

    invoke-virtual {p1}, LR7/C$a;->n()LO7/U;

    move-result-object p1

    if-nez p1, :cond_0

    const/16 p2, 0x2a

    invoke-static {p2}, LR7/C;->M(I)V

    :cond_0
    return-object p1
.end method

.method protected Y0(LO7/m;LO7/D;LO7/u;LO7/U;LO7/b$a;Ln8/f;LO7/a0;)LR7/C;
    .locals 17

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x20

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0x21

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_1
    if-nez p3, :cond_2

    const/16 v0, 0x22

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_2
    if-nez p5, :cond_3

    const/16 v0, 0x23

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_3
    if-nez p6, :cond_4

    const/16 v0, 0x24

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_4
    if-nez p7, :cond_5

    const/16 v0, 0x25

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_5
    new-instance v16, LR7/C;

    invoke-virtual/range {p0 .. p0}, LP7/b;->k()LP7/g;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LR7/N;->t0()Z

    move-result v6

    invoke-virtual/range {p0 .. p0}, LR7/C;->B0()Z

    move-result v10

    invoke-virtual/range {p0 .. p0}, LR7/C;->F()Z

    move-result v11

    invoke-virtual/range {p0 .. p0}, LR7/C;->R()Z

    move-result v12

    invoke-virtual/range {p0 .. p0}, LR7/C;->N0()Z

    move-result v13

    invoke-virtual/range {p0 .. p0}, LR7/C;->C()Z

    move-result v14

    invoke-virtual/range {p0 .. p0}, LR7/C;->T()Z

    move-result v15

    move-object/from16 v0, v16

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v7, p6

    move-object/from16 v8, p5

    move-object/from16 v9, p7

    invoke-direct/range {v0 .. v15}, LR7/C;-><init>(LO7/m;LO7/U;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/b$a;LO7/a0;ZZZZZZ)V

    return-object v16
.end method

.method protected Z0(LR7/C$a;)LO7/U;
    .locals 20

    .prologue
    move-object/from16 v8, p0

    if-nez p1, :cond_0

    const/16 v0, 0x1d

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_0
    invoke-static/range {p1 .. p1}, LR7/C$a;->b(LR7/C$a;)LO7/m;

    move-result-object v1

    invoke-static/range {p1 .. p1}, LR7/C$a;->f(LR7/C$a;)LO7/D;

    move-result-object v2

    invoke-static/range {p1 .. p1}, LR7/C$a;->g(LR7/C$a;)LO7/u;

    move-result-object v3

    invoke-static/range {p1 .. p1}, LR7/C$a;->h(LR7/C$a;)LO7/U;

    move-result-object v4

    invoke-static/range {p1 .. p1}, LR7/C$a;->i(LR7/C$a;)LO7/b$a;

    move-result-object v5

    invoke-static/range {p1 .. p1}, LR7/C$a;->j(LR7/C$a;)Ln8/f;

    move-result-object v6

    invoke-static/range {p1 .. p1}, LR7/C$a;->k(LR7/C$a;)Z

    move-result v0

    invoke-static/range {p1 .. p1}, LR7/C$a;->h(LR7/C$a;)LO7/U;

    move-result-object v7

    invoke-direct {v8, v0, v7}, LR7/C;->b1(ZLO7/U;)LO7/a0;

    move-result-object v7

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v7}, LR7/C;->Y0(LO7/m;LO7/D;LO7/u;LO7/U;LO7/b$a;Ln8/f;LO7/a0;)LR7/C;

    move-result-object v0

    invoke-static/range {p1 .. p1}, LR7/C$a;->l(LR7/C$a;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual/range {p0 .. p0}, LR7/C;->g()Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static/range {p1 .. p1}, LR7/C$a;->l(LR7/C$a;)Ljava/util/List;

    move-result-object v1

    :goto_0
    new-instance v11, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static/range {p1 .. p1}, LR7/C$a;->m(LR7/C$a;)LF8/l0;

    move-result-object v2

    invoke-static {v1, v2, v0, v11}, LF8/s;->b(Ljava/util/List;LF8/l0;LO7/m;Ljava/util/List;)LF8/n0;

    move-result-object v1

    invoke-static/range {p1 .. p1}, LR7/C$a;->c(LR7/C$a;)LF8/E;

    move-result-object v2

    sget-object v3, LF8/u0;->I:LF8/u0;

    invoke-virtual {v1, v2, v3}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object v10

    const/4 v3, 0x0

    if-nez v10, :cond_2

    return-object v3

    :cond_2
    sget-object v4, LF8/u0;->H:LF8/u0;

    invoke-virtual {v1, v2, v4}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, v2}, LR7/C;->i1(LF8/E;)V

    :cond_3
    invoke-static/range {p1 .. p1}, LR7/C$a;->d(LR7/C$a;)LO7/X;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-interface {v2, v1}, LO7/X;->c(LF8/n0;)LO7/X;

    move-result-object v2

    if-nez v2, :cond_4

    return-object v3

    :cond_4
    move-object v12, v2

    goto :goto_1

    :cond_5
    move-object v12, v3

    :goto_1
    iget-object v2, v8, LR7/C;->X:LO7/X;

    if-eqz v2, :cond_6

    invoke-static {v1, v0, v2}, LR7/C;->n1(LF8/n0;LO7/U;LO7/X;)LO7/X;

    move-result-object v2

    move-object v13, v2

    goto :goto_2

    :cond_6
    move-object v13, v3

    :goto_2
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v8, LR7/C;->V:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/X;

    invoke-static {v1, v0, v4}, LR7/C;->m1(LF8/n0;LO7/U;LO7/X;)LO7/X;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-interface {v14, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    move-object v9, v0

    invoke-virtual/range {v9 .. v14}, LR7/C;->k1(LF8/E;Ljava/util/List;LO7/X;LO7/X;Ljava/util/List;)V

    iget-object v2, v8, LR7/C;->Z:LR7/D;

    if-nez v2, :cond_9

    move-object v2, v3

    goto :goto_4

    :cond_9
    new-instance v2, LR7/D;

    iget-object v4, v8, LR7/C;->Z:LR7/D;

    invoke-virtual {v4}, LP7/b;->k()LP7/g;

    move-result-object v11

    invoke-static/range {p1 .. p1}, LR7/C$a;->f(LR7/C$a;)LO7/D;

    move-result-object v12

    iget-object v4, v8, LR7/C;->Z:LR7/D;

    invoke-virtual {v4}, LR7/B;->h()LO7/u;

    move-result-object v4

    invoke-static/range {p1 .. p1}, LR7/C$a;->i(LR7/C$a;)LO7/b$a;

    move-result-object v5

    invoke-static {v4, v5}, LR7/C;->h1(LO7/u;LO7/b$a;)LO7/u;

    move-result-object v13

    iget-object v4, v8, LR7/C;->Z:LR7/D;

    invoke-virtual {v4}, LR7/B;->b0()Z

    move-result v14

    iget-object v4, v8, LR7/C;->Z:LR7/D;

    invoke-virtual {v4}, LR7/B;->C()Z

    move-result v15

    iget-object v4, v8, LR7/C;->Z:LR7/D;

    invoke-virtual {v4}, LR7/B;->m()Z

    move-result v16

    invoke-static/range {p1 .. p1}, LR7/C$a;->i(LR7/C$a;)LO7/b$a;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, LR7/C$a;->o()LO7/V;

    move-result-object v18

    sget-object v19, LO7/a0;->a:LO7/a0;

    move-object v9, v2

    move-object v10, v0

    invoke-direct/range {v9 .. v19}, LR7/D;-><init>(LO7/U;LP7/g;LO7/D;LO7/u;ZZZLO7/b$a;LO7/V;LO7/a0;)V

    :goto_4
    if-eqz v2, :cond_b

    iget-object v4, v8, LR7/C;->Z:LR7/D;

    invoke-virtual {v4}, LR7/D;->l()LF8/E;

    move-result-object v4

    iget-object v5, v8, LR7/C;->Z:LR7/D;

    invoke-static {v1, v5}, LR7/C;->c1(LF8/n0;LO7/T;)LO7/y;

    move-result-object v5

    invoke-virtual {v2, v5}, LR7/B;->V0(LO7/y;)V

    if-eqz v4, :cond_a

    sget-object v5, LF8/u0;->I:LF8/u0;

    invoke-virtual {v1, v4, v5}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object v4

    goto :goto_5

    :cond_a
    move-object v4, v3

    :goto_5
    invoke-virtual {v2, v4}, LR7/D;->Y0(LF8/E;)V

    :cond_b
    iget-object v4, v8, LR7/C;->a0:LO7/W;

    if-nez v4, :cond_c

    move-object v4, v3

    goto :goto_6

    :cond_c
    new-instance v4, LR7/E;

    iget-object v5, v8, LR7/C;->a0:LO7/W;

    invoke-interface {v5}, LP7/a;->k()LP7/g;

    move-result-object v11

    invoke-static/range {p1 .. p1}, LR7/C$a;->f(LR7/C$a;)LO7/D;

    move-result-object v12

    iget-object v5, v8, LR7/C;->a0:LO7/W;

    invoke-interface {v5}, LO7/C;->h()LO7/u;

    move-result-object v5

    invoke-static/range {p1 .. p1}, LR7/C$a;->i(LR7/C$a;)LO7/b$a;

    move-result-object v6

    invoke-static {v5, v6}, LR7/C;->h1(LO7/u;LO7/b$a;)LO7/u;

    move-result-object v13

    iget-object v5, v8, LR7/C;->a0:LO7/W;

    invoke-interface {v5}, LO7/T;->b0()Z

    move-result v14

    iget-object v5, v8, LR7/C;->a0:LO7/W;

    invoke-interface {v5}, LO7/C;->C()Z

    move-result v15

    iget-object v5, v8, LR7/C;->a0:LO7/W;

    invoke-interface {v5}, LO7/y;->m()Z

    move-result v16

    invoke-static/range {p1 .. p1}, LR7/C$a;->i(LR7/C$a;)LO7/b$a;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, LR7/C$a;->p()LO7/W;

    move-result-object v18

    sget-object v19, LO7/a0;->a:LO7/a0;

    move-object v9, v4

    move-object v10, v0

    invoke-direct/range {v9 .. v19}, LR7/E;-><init>(LO7/U;LP7/g;LO7/D;LO7/u;ZZZLO7/b$a;LO7/W;LO7/a0;)V

    :goto_6
    if-eqz v4, :cond_f

    iget-object v5, v8, LR7/C;->a0:LO7/W;

    invoke-interface {v5}, LO7/a;->n()Ljava/util/List;

    move-result-object v13

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v15, 0x0

    move-object v12, v4

    move-object v14, v1

    invoke-static/range {v12 .. v17}, LR7/p;->Y0(LO7/y;Ljava/util/List;LF8/n0;ZZ[Z)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-nez v5, :cond_d

    invoke-virtual {v0, v7}, LR7/C;->j1(Z)V

    invoke-static/range {p1 .. p1}, LR7/C$a;->b(LR7/C$a;)LO7/m;

    move-result-object v5

    invoke-static {v5}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object v5

    invoke-virtual {v5}, LL7/g;->H()LF8/M;

    move-result-object v5

    iget-object v9, v8, LR7/C;->a0:LO7/W;

    invoke-interface {v9}, LO7/a;->n()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LO7/j0;

    invoke-interface {v9}, LP7/a;->k()LP7/g;

    move-result-object v9

    invoke-static {v4, v5, v9}, LR7/E;->X0(LO7/W;LF8/E;LP7/g;)LR7/L;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    :cond_d
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    if-ne v9, v7, :cond_e

    iget-object v7, v8, LR7/C;->a0:LO7/W;

    invoke-static {v1, v7}, LR7/C;->c1(LF8/n0;LO7/T;)LO7/y;

    move-result-object v7

    invoke-virtual {v4, v7}, LR7/B;->V0(LO7/y;)V

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LO7/j0;

    invoke-virtual {v4, v5}, LR7/E;->Z0(LO7/j0;)V

    goto :goto_7

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_f
    :goto_7
    iget-object v5, v8, LR7/C;->c0:LO7/w;

    if-nez v5, :cond_10

    move-object v6, v3

    goto :goto_8

    :cond_10
    new-instance v6, LR7/o;

    invoke-interface {v5}, LP7/a;->k()LP7/g;

    move-result-object v5

    invoke-direct {v6, v5, v0}, LR7/o;-><init>(LP7/g;LO7/U;)V

    :goto_8
    iget-object v5, v8, LR7/C;->d0:LO7/w;

    if-nez v5, :cond_11

    goto :goto_9

    :cond_11
    new-instance v3, LR7/o;

    invoke-interface {v5}, LP7/a;->k()LP7/g;

    move-result-object v5

    invoke-direct {v3, v5, v0}, LR7/o;-><init>(LP7/g;LO7/U;)V

    :goto_9
    invoke-virtual {v0, v2, v4, v6, v3}, LR7/C;->e1(LR7/D;LO7/W;LO7/w;LO7/w;)V

    invoke-static/range {p1 .. p1}, LR7/C$a;->e(LR7/C$a;)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-static {}, LP8/g;->d()LP8/g;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, LR7/C;->f()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/U;

    invoke-interface {v4, v1}, LO7/U;->c(LF8/n0;)LO7/U;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_12
    invoke-virtual {v0, v2}, LR7/C;->G0(Ljava/util/Collection;)V

    :cond_13
    invoke-virtual/range {p0 .. p0}, LR7/C;->F()Z

    move-result v1

    if-eqz v1, :cond_14

    iget-object v1, v8, LR7/N;->J:Lx7/a;

    if-eqz v1, :cond_14

    iget-object v2, v8, LR7/N;->I:LE8/j;

    invoke-virtual {v0, v2, v1}, LR7/N;->T0(LE8/j;Lx7/a;)V

    :cond_14
    return-object v0
.end method

.method public a()LO7/U;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/C;->N:LO7/U;

    if-ne v0, p0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LO7/U;->a()LO7/U;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    const/16 v1, 0x26

    invoke-static {v1}, LR7/C;->M(I)V

    :cond_1
    return-object v0
.end method

.method public bridge synthetic a()LO7/a;
    .locals 1

    invoke-virtual {p0}, LR7/C;->a()LO7/U;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/b;
    .locals 1

    invoke-virtual {p0}, LR7/C;->a()LO7/U;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/m;
    .locals 1

    invoke-virtual {p0}, LR7/C;->a()LO7/U;

    move-result-object v0

    return-object v0
.end method

.method public a1()LR7/D;
    .locals 1

    iget-object v0, p0, LR7/C;->Z:LR7/D;

    return-object v0
.end method

.method public c(LF8/n0;)LO7/U;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x1b

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_0
    invoke-virtual {p1}, LF8/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    invoke-virtual {p0}, LR7/C;->g1()LR7/C$a;

    move-result-object v0

    invoke-virtual {p1}, LF8/n0;->j()LF8/l0;

    move-result-object p1

    invoke-virtual {v0, p1}, LR7/C$a;->v(LF8/l0;)LR7/C$a;

    move-result-object p1

    invoke-virtual {p0}, LR7/C;->a()LO7/U;

    move-result-object v0

    invoke-virtual {p1, v0}, LR7/C$a;->t(LO7/b;)LR7/C$a;

    move-result-object p1

    invoke-virtual {p1}, LR7/C$a;->n()LO7/U;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(LF8/n0;)LO7/n;
    .locals 0

    invoke-virtual {p0, p1}, LR7/C;->c(LF8/n0;)LO7/U;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d()LO7/V;
    .locals 1

    invoke-virtual {p0}, LR7/C;->a1()LR7/D;

    move-result-object v0

    return-object v0
.end method

.method public d1(LR7/D;LO7/W;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, v0}, LR7/C;->e1(LR7/D;LO7/W;LO7/w;LO7/w;)V

    return-void
.end method

.method public e1(LR7/D;LO7/W;LO7/w;LO7/w;)V
    .locals 0

    iput-object p1, p0, LR7/C;->Z:LR7/D;

    iput-object p2, p0, LR7/C;->a0:LO7/W;

    iput-object p3, p0, LR7/C;->c0:LO7/w;

    iput-object p4, p0, LR7/C;->d0:LO7/w;

    return-void
.end method

.method public f()Ljava/util/Collection;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/C;->M:Ljava/util/Collection;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    const/16 v1, 0x29

    invoke-static {v1}, LR7/C;->M(I)V

    :cond_1
    return-object v0
.end method

.method public f1()Z
    .locals 1

    iget-boolean v0, p0, LR7/C;->b0:Z

    return v0
.end method

.method public g()Ljava/util/List;
    .locals 3

    .prologue
    iget-object v0, p0, LR7/C;->Y:Ljava/util/List;

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

.method public g1()LR7/C$a;
    .locals 1

    new-instance v0, LR7/C$a;

    invoke-direct {v0, p0}, LR7/C$a;-><init>(LR7/C;)V

    return-object v0
.end method

.method public h()LO7/u;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/C;->L:LO7/u;

    if-nez v0, :cond_0

    const/16 v1, 0x19

    invoke-static {v1}, LR7/C;->M(I)V

    :cond_0
    return-object v0
.end method

.method public i()LO7/W;
    .locals 1

    iget-object v0, p0, LR7/C;->a0:LO7/W;

    return-object v0
.end method

.method public bridge synthetic i0(LO7/m;LO7/D;LO7/u;LO7/b$a;Z)LO7/b;
    .locals 0

    invoke-virtual/range {p0 .. p5}, LR7/C;->W0(LO7/m;LO7/D;LO7/u;LO7/b$a;Z)LO7/U;

    move-result-object p1

    return-object p1
.end method

.method public i1(LF8/E;)V
    .locals 0

    .prologue
    if-nez p1, :cond_0

    const/16 p1, 0xe

    invoke-static {p1}, LR7/C;->M(I)V

    :cond_0
    return-void
.end method

.method public j()LO7/b$a;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/C;->O:LO7/b$a;

    if-nez v0, :cond_0

    const/16 v1, 0x27

    invoke-static {v1}, LR7/C;->M(I)V

    :cond_0
    return-object v0
.end method

.method public j1(Z)V
    .locals 0

    iput-boolean p1, p0, LR7/C;->b0:Z

    return-void
.end method

.method public k1(LF8/E;Ljava/util/List;LO7/X;LO7/X;Ljava/util/List;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x11

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0x12

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_1
    if-nez p5, :cond_2

    const/16 v0, 0x13

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_2
    invoke-virtual {p0, p1}, LR7/M;->O0(LF8/E;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, LR7/C;->Y:Ljava/util/List;

    iput-object p4, p0, LR7/C;->X:LO7/X;

    iput-object p3, p0, LR7/C;->W:LO7/X;

    iput-object p5, p0, LR7/C;->V:Ljava/util/List;

    return-void
.end method

.method public l()LF8/E;
    .locals 2

    .prologue
    invoke-virtual {p0}, LR7/M;->getType()LF8/E;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x17

    invoke-static {v1}, LR7/C;->M(I)V

    :cond_0
    return-object v0
.end method

.method public l1(LO7/u;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x14

    invoke-static {v0}, LR7/C;->M(I)V

    :cond_0
    iput-object p1, p0, LR7/C;->L:LO7/u;

    return-void
.end method

.method public m0()LO7/X;
    .locals 1

    iget-object v0, p0, LR7/C;->W:LO7/X;

    return-object v0
.end method

.method public q()LO7/D;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/C;->K:LO7/D;

    if-nez v0, :cond_0

    const/16 v1, 0x18

    invoke-static {v1}, LR7/C;->M(I)V

    :cond_0
    return-object v0
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, LO7/o;->h(LO7/U;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public v0()LO7/X;
    .locals 1

    iget-object v0, p0, LR7/C;->X:LO7/X;

    return-object v0
.end method

.method public w0()LO7/w;
    .locals 1

    iget-object v0, p0, LR7/C;->d0:LO7/w;

    return-object v0
.end method

.method public z0()LO7/w;
    .locals 1

    iget-object v0, p0, LR7/C;->c0:LO7/w;

    return-object v0
.end method
