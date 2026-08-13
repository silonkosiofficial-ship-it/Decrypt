.class public LR7/p$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/y$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR7/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field protected a:LF8/l0;

.field protected b:LO7/m;

.field protected c:LO7/D;

.field protected d:LO7/u;

.field protected e:LO7/y;

.field protected f:LO7/b$a;

.field protected g:Ljava/util/List;

.field protected h:Ljava/util/List;

.field protected i:LO7/X;

.field protected j:LO7/X;

.field protected k:LF8/E;

.field protected l:Ln8/f;

.field protected m:Z

.field protected n:Z

.field protected o:Z

.field protected p:Z

.field private q:Z

.field private r:Ljava/util/List;

.field private s:LP7/g;

.field private t:Z

.field private u:Ljava/util/Map;

.field private v:Ljava/lang/Boolean;

.field protected w:Z

.field final synthetic x:LR7/p;


# direct methods
.method public constructor <init>(LR7/p;LF8/l0;LO7/m;LO7/D;LO7/u;LO7/b$a;Ljava/util/List;Ljava/util/List;LO7/X;LF8/E;Ln8/f;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    if-nez p2, :cond_0

    invoke-static {v0}, LR7/p$c;->a(I)V

    :cond_0
    const/4 v1, 0x1

    if-nez p3, :cond_1

    invoke-static {v1}, LR7/p$c;->a(I)V

    :cond_1
    if-nez p4, :cond_2

    const/4 v2, 0x2

    invoke-static {v2}, LR7/p$c;->a(I)V

    :cond_2
    if-nez p5, :cond_3

    const/4 v2, 0x3

    invoke-static {v2}, LR7/p$c;->a(I)V

    :cond_3
    if-nez p6, :cond_4

    const/4 v2, 0x4

    invoke-static {v2}, LR7/p$c;->a(I)V

    :cond_4
    if-nez p7, :cond_5

    const/4 v2, 0x5

    invoke-static {v2}, LR7/p$c;->a(I)V

    :cond_5
    if-nez p8, :cond_6

    const/4 v2, 0x6

    invoke-static {v2}, LR7/p$c;->a(I)V

    :cond_6
    if-nez p10, :cond_7

    const/4 v2, 0x7

    invoke-static {v2}, LR7/p$c;->a(I)V

    :cond_7
    iput-object p1, p0, LR7/p$c;->x:LR7/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    iput-object v2, p0, LR7/p$c;->e:LO7/y;

    invoke-static {p1}, LR7/p;->O0(LR7/p;)LO7/X;

    move-result-object v3

    iput-object v3, p0, LR7/p$c;->j:LO7/X;

    iput-boolean v1, p0, LR7/p$c;->m:Z

    iput-boolean v0, p0, LR7/p$c;->n:Z

    iput-boolean v0, p0, LR7/p$c;->o:Z

    iput-boolean v0, p0, LR7/p$c;->p:Z

    invoke-virtual {p1}, LR7/p;->F0()Z

    move-result v1

    iput-boolean v1, p0, LR7/p$c;->q:Z

    iput-object v2, p0, LR7/p$c;->r:Ljava/util/List;

    iput-object v2, p0, LR7/p$c;->s:LP7/g;

    invoke-virtual {p1}, LR7/p;->L0()Z

    move-result p1

    iput-boolean p1, p0, LR7/p$c;->t:Z

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LR7/p$c;->u:Ljava/util/Map;

    iput-object v2, p0, LR7/p$c;->v:Ljava/lang/Boolean;

    iput-boolean v0, p0, LR7/p$c;->w:Z

    iput-object p2, p0, LR7/p$c;->a:LF8/l0;

    iput-object p3, p0, LR7/p$c;->b:LO7/m;

    iput-object p4, p0, LR7/p$c;->c:LO7/D;

    iput-object p5, p0, LR7/p$c;->d:LO7/u;

    iput-object p6, p0, LR7/p$c;->f:LO7/b$a;

    iput-object p7, p0, LR7/p$c;->g:Ljava/util/List;

    iput-object p8, p0, LR7/p$c;->h:Ljava/util/List;

    iput-object p9, p0, LR7/p$c;->i:LO7/X;

    iput-object p10, p0, LR7/p$c;->k:LF8/E;

    iput-object p11, p0, LR7/p$c;->l:Ln8/f;

    return-void
.end method

.method private static synthetic a(I)V
    .locals 17

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

    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    :pswitch_4
    const-string v5, "substitution"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_5
    const-string v5, "userDataKey"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_6
    const-string v5, "additionalAnnotations"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_7
    const-string v5, "contextReceiverParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_8
    const-string v5, "type"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_9
    const-string v5, "parameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_a
    const-string v5, "name"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_b
    const-string v5, "visibility"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_c
    const-string v5, "modality"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_d
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_e
    const-string v5, "owner"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_f
    const-string v5, "newReturnType"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_10
    const-string v5, "newContextReceiverParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_11
    const-string v5, "newValueParameterDescriptors"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_12
    const-string v5, "kind"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_13
    const-string v5, "newVisibility"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_14
    const-string v5, "newModality"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_15
    const-string v5, "newOwner"

    aput-object v5, v2, v4

    :goto_2
    const-string v4, "setOwner"

    const-string v5, "setModality"

    const-string v6, "setVisibility"

    const-string v7, "setKind"

    const-string v8, "setName"

    const-string v9, "setValueParameters"

    const-string v10, "setTypeParameters"

    const-string v11, "setReturnType"

    const-string v12, "setContextReceiverParameters"

    const-string v13, "setAdditionalAnnotations"

    const-string v14, "setSubstitution"

    const-string v15, "putUserData"

    const/16 v16, 0x1

    packed-switch p0, :pswitch_data_3

    :pswitch_16
    aput-object v3, v2, v16

    goto/16 :goto_3

    :pswitch_17
    const-string v3, "setJustForTypeSubstitution"

    aput-object v3, v2, v16

    goto/16 :goto_3

    :pswitch_18
    const-string v3, "getSubstitution"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_19
    aput-object v15, v2, v16

    goto :goto_3

    :pswitch_1a
    aput-object v14, v2, v16

    goto :goto_3

    :pswitch_1b
    aput-object v13, v2, v16

    goto :goto_3

    :pswitch_1c
    const-string v3, "setHiddenForResolutionEverywhereBesideSupercalls"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_1d
    const-string v3, "setHiddenToOvercomeSignatureClash"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_1e
    const-string v3, "setDropOriginalInContainingParts"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_1f
    const-string v3, "setPreserveSourceElement"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_20
    const-string v3, "setSignatureChange"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_21
    const-string v3, "setOriginal"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_22
    const-string v3, "setDispatchReceiverParameter"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_23
    const-string v3, "setExtensionReceiverParameter"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_24
    aput-object v12, v2, v16

    goto :goto_3

    :pswitch_25
    aput-object v11, v2, v16

    goto :goto_3

    :pswitch_26
    aput-object v10, v2, v16

    goto :goto_3

    :pswitch_27
    aput-object v9, v2, v16

    goto :goto_3

    :pswitch_28
    aput-object v8, v2, v16

    goto :goto_3

    :pswitch_29
    const-string v3, "setCopyOverrides"

    aput-object v3, v2, v16

    goto :goto_3

    :pswitch_2a
    aput-object v7, v2, v16

    goto :goto_3

    :pswitch_2b
    aput-object v6, v2, v16

    goto :goto_3

    :pswitch_2c
    aput-object v5, v2, v16

    goto :goto_3

    :pswitch_2d
    aput-object v4, v2, v16

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_2e
    aput-object v15, v2, v1

    goto :goto_4

    :pswitch_2f
    aput-object v14, v2, v1

    goto :goto_4

    :pswitch_30
    aput-object v13, v2, v1

    goto :goto_4

    :pswitch_31
    aput-object v12, v2, v1

    goto :goto_4

    :pswitch_32
    aput-object v11, v2, v1

    goto :goto_4

    :pswitch_33
    aput-object v10, v2, v1

    goto :goto_4

    :pswitch_34
    aput-object v9, v2, v1

    goto :goto_4

    :pswitch_35
    aput-object v8, v2, v1

    goto :goto_4

    :pswitch_36
    aput-object v7, v2, v1

    goto :goto_4

    :pswitch_37
    aput-object v6, v2, v1

    goto :goto_4

    :pswitch_38
    aput-object v5, v2, v1

    goto :goto_4

    :pswitch_39
    aput-object v4, v2, v1

    :goto_4
    :pswitch_3a
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    :pswitch_3b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_3c
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw v1

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_d
        :pswitch_b
        :pswitch_d
        :pswitch_12
        :pswitch_d
        :pswitch_d
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_d
        :pswitch_9
        :pswitch_d
        :pswitch_8
        :pswitch_d
        :pswitch_7
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_6
        :pswitch_d
        :pswitch_4
        :pswitch_d
        :pswitch_5
        :pswitch_d
        :pswitch_d
        :pswitch_d
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x9
        :pswitch_2d
        :pswitch_16
        :pswitch_2c
        :pswitch_16
        :pswitch_2b
        :pswitch_16
        :pswitch_2a
        :pswitch_29
        :pswitch_16
        :pswitch_28
        :pswitch_16
        :pswitch_27
        :pswitch_16
        :pswitch_26
        :pswitch_16
        :pswitch_25
        :pswitch_16
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_16
        :pswitch_1b
        :pswitch_16
        :pswitch_1a
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x8
        :pswitch_39
        :pswitch_3a
        :pswitch_38
        :pswitch_3a
        :pswitch_37
        :pswitch_3a
        :pswitch_36
        :pswitch_3a
        :pswitch_3a
        :pswitch_35
        :pswitch_3a
        :pswitch_34
        :pswitch_3a
        :pswitch_33
        :pswitch_3a
        :pswitch_32
        :pswitch_3a
        :pswitch_31
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_30
        :pswitch_3a
        :pswitch_2f
        :pswitch_3a
        :pswitch_2e
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x9
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
    .end packed-switch
.end method

.method static synthetic b(LR7/p$c;)LP7/g;
    .locals 0

    iget-object p0, p0, LR7/p$c;->s:LP7/g;

    return-object p0
.end method

.method static synthetic c(LR7/p$c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LR7/p$c;->r:Ljava/util/List;

    return-object p0
.end method

.method static synthetic d(LR7/p$c;)Z
    .locals 0

    iget-boolean p0, p0, LR7/p$c;->q:Z

    return p0
.end method

.method static synthetic e(LR7/p$c;)Z
    .locals 0

    iget-boolean p0, p0, LR7/p$c;->t:Z

    return p0
.end method

.method static synthetic f(LR7/p$c;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LR7/p$c;->v:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic g(LR7/p$c;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, LR7/p$c;->u:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic A()LO7/y$a;
    .locals 1

    invoke-virtual {p0}, LR7/p$c;->J()LR7/p$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic B(LO7/X;)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->E(LO7/X;)LR7/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic C()LO7/y$a;
    .locals 1

    invoke-virtual {p0}, LR7/p$c;->S()LR7/p$c;

    move-result-object v0

    return-object v0
.end method

.method public D(Z)LR7/p$c;
    .locals 0

    iput-boolean p1, p0, LR7/p$c;->m:Z

    return-object p0
.end method

.method public E(LO7/X;)LR7/p$c;
    .locals 0

    iput-object p1, p0, LR7/p$c;->j:LO7/X;

    return-object p0
.end method

.method public F()LR7/p$c;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LR7/p$c;->p:Z

    return-object p0
.end method

.method public G(LO7/X;)LR7/p$c;
    .locals 0

    iput-object p1, p0, LR7/p$c;->i:LO7/X;

    return-object p0
.end method

.method public H(Z)LR7/p$c;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, LR7/p$c;->v:Ljava/lang/Boolean;

    return-object p0
.end method

.method public I()LR7/p$c;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LR7/p$c;->t:Z

    return-object p0
.end method

.method public J()LR7/p$c;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LR7/p$c;->q:Z

    return-object p0
.end method

.method public K(Z)LR7/p$c;
    .locals 0

    iput-boolean p1, p0, LR7/p$c;->w:Z

    return-object p0
.end method

.method public L(LO7/b$a;)LR7/p$c;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xe

    invoke-static {v0}, LR7/p$c;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/p$c;->f:LO7/b$a;

    return-object p0
.end method

.method public M(LO7/D;)LR7/p$c;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xa

    invoke-static {v0}, LR7/p$c;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/p$c;->c:LO7/D;

    return-object p0
.end method

.method public N(Ln8/f;)LR7/p$c;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x11

    invoke-static {v0}, LR7/p$c;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/p$c;->l:Ln8/f;

    return-object p0
.end method

.method public O(LO7/b;)LR7/p$c;
    .locals 0

    check-cast p1, LO7/y;

    iput-object p1, p0, LR7/p$c;->e:LO7/y;

    return-object p0
.end method

.method public P(LO7/m;)LR7/p$c;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x8

    invoke-static {v0}, LR7/p$c;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/p$c;->b:LO7/m;

    return-object p0
.end method

.method public Q()LR7/p$c;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LR7/p$c;->o:Z

    return-object p0
.end method

.method public R(LF8/E;)LR7/p$c;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x17

    invoke-static {v0}, LR7/p$c;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/p$c;->k:LF8/E;

    return-object p0
.end method

.method public S()LR7/p$c;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LR7/p$c;->n:Z

    return-object p0
.end method

.method public T(LF8/l0;)LR7/p$c;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x25

    invoke-static {v0}, LR7/p$c;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/p$c;->a:LF8/l0;

    return-object p0
.end method

.method public U(Ljava/util/List;)LR7/p$c;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x15

    invoke-static {v0}, LR7/p$c;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/p$c;->r:Ljava/util/List;

    return-object p0
.end method

.method public V(Ljava/util/List;)LR7/p$c;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x13

    invoke-static {v0}, LR7/p$c;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/p$c;->g:Ljava/util/List;

    return-object p0
.end method

.method public W(LO7/u;)LR7/p$c;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xc

    invoke-static {v0}, LR7/p$c;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/p$c;->d:LO7/u;

    return-object p0
.end method

.method public h(LP7/g;)LR7/p$c;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x23

    invoke-static {v0}, LR7/p$c;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/p$c;->s:LP7/g;

    return-object p0
.end method

.method public i()LO7/y;
    .locals 1

    iget-object v0, p0, LR7/p$c;->x:LR7/p;

    invoke-virtual {v0, p0}, LR7/p;->V0(LR7/p$c;)LO7/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic j()LO7/y$a;
    .locals 1

    invoke-virtual {p0}, LR7/p$c;->F()LR7/p$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic k(LO7/X;)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->G(LO7/X;)LR7/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(LO7/b$a;)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->L(LO7/b$a;)LR7/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/util/List;)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->V(Ljava/util/List;)LR7/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n()LO7/y$a;
    .locals 1

    invoke-virtual {p0}, LR7/p$c;->Q()LR7/p$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o(LO7/m;)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->P(LO7/m;)LR7/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(LP7/g;)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->h(LP7/g;)LR7/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(LF8/E;)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->R(LF8/E;)LR7/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic r(LO7/u;)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->W(LO7/u;)LR7/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ln8/f;)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->N(Ln8/f;)LR7/p$c;

    move-result-object p1

    return-object p1
.end method

.method public t(LO7/a$a;Ljava/lang/Object;)LO7/y$a;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x27

    invoke-static {v0}, LR7/p$c;->a(I)V

    :cond_0
    iget-object v0, p0, LR7/p$c;->u:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public bridge synthetic u()LO7/y$a;
    .locals 1

    invoke-virtual {p0}, LR7/p$c;->I()LR7/p$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v(Z)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->D(Z)LR7/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic w(LF8/l0;)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->T(LF8/l0;)LR7/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic x(LO7/D;)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->M(LO7/D;)LR7/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic y(Ljava/util/List;)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->U(Ljava/util/List;)LR7/p$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic z(LO7/b;)LO7/y$a;
    .locals 0

    invoke-virtual {p0, p1}, LR7/p$c;->O(LO7/b;)LR7/p$c;

    move-result-object p1

    return-object p1
.end method
