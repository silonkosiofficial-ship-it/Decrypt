.class public LR7/C$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR7/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private a:LO7/m;

.field private b:LO7/D;

.field private c:LO7/u;

.field private d:LO7/U;

.field private e:Z

.field private f:LO7/b$a;

.field private g:LF8/l0;

.field private h:Z

.field private i:LO7/X;

.field private j:Ljava/util/List;

.field private k:Ln8/f;

.field private l:LF8/E;

.field final synthetic m:LR7/C;


# direct methods
.method public constructor <init>(LR7/C;)V
    .locals 2

    iput-object p1, p0, LR7/C$a;->m:LR7/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LR7/k;->b()LO7/m;

    move-result-object v0

    iput-object v0, p0, LR7/C$a;->a:LO7/m;

    invoke-virtual {p1}, LR7/C;->q()LO7/D;

    move-result-object v0

    iput-object v0, p0, LR7/C$a;->b:LO7/D;

    invoke-virtual {p1}, LR7/C;->h()LO7/u;

    move-result-object v0

    iput-object v0, p0, LR7/C$a;->c:LO7/u;

    const/4 v0, 0x0

    iput-object v0, p0, LR7/C$a;->d:LO7/U;

    const/4 v1, 0x0

    iput-boolean v1, p0, LR7/C$a;->e:Z

    invoke-virtual {p1}, LR7/C;->j()LO7/b$a;

    move-result-object v1

    iput-object v1, p0, LR7/C$a;->f:LO7/b$a;

    sget-object v1, LF8/l0;->b:LF8/l0;

    iput-object v1, p0, LR7/C$a;->g:LF8/l0;

    const/4 v1, 0x1

    iput-boolean v1, p0, LR7/C$a;->h:Z

    invoke-static {p1}, LR7/C;->V0(LR7/C;)LO7/X;

    move-result-object v1

    iput-object v1, p0, LR7/C$a;->i:LO7/X;

    iput-object v0, p0, LR7/C$a;->j:Ljava/util/List;

    invoke-virtual {p1}, LR7/j;->getName()Ln8/f;

    move-result-object v0

    iput-object v0, p0, LR7/C$a;->k:Ln8/f;

    invoke-virtual {p1}, LR7/M;->getType()LF8/E;

    move-result-object p1

    iput-object p1, p0, LR7/C$a;->l:LF8/E;

    return-void
.end method

.method private static synthetic a(I)V
    .locals 24

    .prologue
    move/from16 v0, p0

    const/16 v1, 0x11

    const/16 v2, 0x10

    const/16 v3, 0xe

    const/16 v4, 0xd

    const/16 v5, 0x13

    const/16 v6, 0xb

    const/16 v7, 0x9

    const/4 v8, 0x7

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eq v0, v12, :cond_0

    if-eq v0, v11, :cond_0

    if-eq v0, v10, :cond_0

    if-eq v0, v9, :cond_0

    if-eq v0, v8, :cond_0

    if-eq v0, v7, :cond_0

    if-eq v0, v6, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v3, :cond_0

    if-eq v0, v2, :cond_0

    if-eq v0, v1, :cond_0

    const-string v13, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v13, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq v0, v12, :cond_1

    if-eq v0, v11, :cond_1

    if-eq v0, v10, :cond_1

    if-eq v0, v9, :cond_1

    if-eq v0, v8, :cond_1

    if-eq v0, v7, :cond_1

    if-eq v0, v6, :cond_1

    if-eq v0, v5, :cond_1

    if-eq v0, v4, :cond_1

    if-eq v0, v3, :cond_1

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_1

    move v14, v10

    goto :goto_1

    :cond_1
    move v14, v11

    :goto_1
    new-array v14, v14, [Ljava/lang/Object;

    const-string v15, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration"

    const/16 v16, 0x0

    packed-switch v0, :pswitch_data_0

    const-string v17, "owner"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_0
    const-string v17, "name"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_1
    const-string v17, "substitution"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_2
    const-string v17, "typeParameters"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_3
    const-string v17, "kind"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_4
    const-string v17, "visibility"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_5
    const-string v17, "modality"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_6
    const-string v17, "type"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_7
    aput-object v15, v14, v16

    :goto_2
    const-string v16, "setOwner"

    const-string v17, "setReturnType"

    const-string v18, "setModality"

    const-string v19, "setVisibility"

    const-string v20, "setKind"

    const-string v21, "setTypeParameters"

    const-string v22, "setSubstitution"

    const-string v23, "setName"

    if-eq v0, v12, :cond_d

    if-eq v0, v11, :cond_c

    if-eq v0, v10, :cond_b

    if-eq v0, v9, :cond_a

    if-eq v0, v8, :cond_9

    if-eq v0, v7, :cond_8

    if-eq v0, v6, :cond_7

    if-eq v0, v5, :cond_6

    if-eq v0, v4, :cond_5

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    aput-object v15, v14, v12

    goto :goto_3

    :cond_2
    const-string v15, "setCopyOverrides"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_3
    aput-object v22, v14, v12

    goto :goto_3

    :cond_4
    const-string v15, "setDispatchReceiverParameter"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_5
    aput-object v21, v14, v12

    goto :goto_3

    :cond_6
    aput-object v23, v14, v12

    goto :goto_3

    :cond_7
    aput-object v20, v14, v12

    goto :goto_3

    :cond_8
    aput-object v19, v14, v12

    goto :goto_3

    :cond_9
    aput-object v18, v14, v12

    goto :goto_3

    :cond_a
    aput-object v17, v14, v12

    goto :goto_3

    :cond_b
    const-string v15, "setPreserveSourceElement"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_c
    const-string v15, "setOriginal"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_d
    aput-object v16, v14, v12

    :goto_3
    packed-switch v0, :pswitch_data_1

    aput-object v16, v14, v11

    goto :goto_4

    :pswitch_8
    aput-object v23, v14, v11

    goto :goto_4

    :pswitch_9
    aput-object v22, v14, v11

    goto :goto_4

    :pswitch_a
    aput-object v21, v14, v11

    goto :goto_4

    :pswitch_b
    aput-object v20, v14, v11

    goto :goto_4

    :pswitch_c
    aput-object v19, v14, v11

    goto :goto_4

    :pswitch_d
    aput-object v18, v14, v11

    goto :goto_4

    :pswitch_e
    aput-object v17, v14, v11

    :goto_4
    :pswitch_f
    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    if-eq v0, v12, :cond_e

    if-eq v0, v11, :cond_e

    if-eq v0, v10, :cond_e

    if-eq v0, v9, :cond_e

    if-eq v0, v8, :cond_e

    if-eq v0, v7, :cond_e

    if-eq v0, v6, :cond_e

    if-eq v0, v5, :cond_e

    if-eq v0, v4, :cond_e

    if-eq v0, v3, :cond_e

    if-eq v0, v2, :cond_e

    if-eq v0, v1, :cond_e

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_7
        :pswitch_2
        :pswitch_7
        :pswitch_7
        :pswitch_1
        :pswitch_7
        :pswitch_7
        :pswitch_0
        :pswitch_7
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_d
        :pswitch_f
        :pswitch_c
        :pswitch_f
        :pswitch_b
        :pswitch_f
        :pswitch_a
        :pswitch_f
        :pswitch_f
        :pswitch_9
        :pswitch_f
        :pswitch_f
        :pswitch_8
        :pswitch_f
    .end packed-switch
.end method

.method static synthetic b(LR7/C$a;)LO7/m;
    .locals 0

    iget-object p0, p0, LR7/C$a;->a:LO7/m;

    return-object p0
.end method

.method static synthetic c(LR7/C$a;)LF8/E;
    .locals 0

    iget-object p0, p0, LR7/C$a;->l:LF8/E;

    return-object p0
.end method

.method static synthetic d(LR7/C$a;)LO7/X;
    .locals 0

    iget-object p0, p0, LR7/C$a;->i:LO7/X;

    return-object p0
.end method

.method static synthetic e(LR7/C$a;)Z
    .locals 0

    iget-boolean p0, p0, LR7/C$a;->h:Z

    return p0
.end method

.method static synthetic f(LR7/C$a;)LO7/D;
    .locals 0

    iget-object p0, p0, LR7/C$a;->b:LO7/D;

    return-object p0
.end method

.method static synthetic g(LR7/C$a;)LO7/u;
    .locals 0

    iget-object p0, p0, LR7/C$a;->c:LO7/u;

    return-object p0
.end method

.method static synthetic h(LR7/C$a;)LO7/U;
    .locals 0

    iget-object p0, p0, LR7/C$a;->d:LO7/U;

    return-object p0
.end method

.method static synthetic i(LR7/C$a;)LO7/b$a;
    .locals 0

    iget-object p0, p0, LR7/C$a;->f:LO7/b$a;

    return-object p0
.end method

.method static synthetic j(LR7/C$a;)Ln8/f;
    .locals 0

    iget-object p0, p0, LR7/C$a;->k:Ln8/f;

    return-object p0
.end method

.method static synthetic k(LR7/C$a;)Z
    .locals 0

    iget-boolean p0, p0, LR7/C$a;->e:Z

    return p0
.end method

.method static synthetic l(LR7/C$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LR7/C$a;->j:Ljava/util/List;

    return-object p0
.end method

.method static synthetic m(LR7/C$a;)LF8/l0;
    .locals 0

    iget-object p0, p0, LR7/C$a;->g:LF8/l0;

    return-object p0
.end method


# virtual methods
.method public n()LO7/U;
    .locals 1

    iget-object v0, p0, LR7/C$a;->m:LR7/C;

    invoke-virtual {v0, p0}, LR7/C;->Z0(LR7/C$a;)LO7/U;

    move-result-object v0

    return-object v0
.end method

.method o()LO7/V;
    .locals 1

    .prologue
    iget-object v0, p0, LR7/C$a;->d:LO7/U;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, LO7/U;->d()LO7/V;

    move-result-object v0

    return-object v0
.end method

.method p()LO7/W;
    .locals 1

    .prologue
    iget-object v0, p0, LR7/C$a;->d:LO7/U;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, LO7/U;->i()LO7/W;

    move-result-object v0

    return-object v0
.end method

.method public q(Z)LR7/C$a;
    .locals 0

    iput-boolean p1, p0, LR7/C$a;->h:Z

    return-object p0
.end method

.method public r(LO7/b$a;)LR7/C$a;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xa

    invoke-static {v0}, LR7/C$a;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/C$a;->f:LO7/b$a;

    return-object p0
.end method

.method public s(LO7/D;)LR7/C$a;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x6

    invoke-static {v0}, LR7/C$a;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/C$a;->b:LO7/D;

    return-object p0
.end method

.method public t(LO7/b;)LR7/C$a;
    .locals 0

    check-cast p1, LO7/U;

    iput-object p1, p0, LR7/C$a;->d:LO7/U;

    return-object p0
.end method

.method public u(LO7/m;)LR7/C$a;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LR7/C$a;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/C$a;->a:LO7/m;

    return-object p0
.end method

.method public v(LF8/l0;)LR7/C$a;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xf

    invoke-static {v0}, LR7/C$a;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/C$a;->g:LF8/l0;

    return-object p0
.end method

.method public w(LO7/u;)LR7/C$a;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x8

    invoke-static {v0}, LR7/C$a;->a(I)V

    :cond_0
    iput-object p1, p0, LR7/C$a;->c:LO7/u;

    return-object p0
.end method
