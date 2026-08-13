.class public abstract LR7/a;
.super LR7/t;
.source "SourceFile"


# instance fields
.field private final D:Ln8/f;

.field protected final E:LE8/i;

.field private final F:LE8/i;

.field private final G:LE8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE8/n;Ln8/f;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LR7/a;->J0(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LR7/a;->J0(I)V

    :cond_1
    invoke-direct {p0}, LR7/t;-><init>()V

    iput-object p2, p0, LR7/a;->D:Ln8/f;

    new-instance p2, LR7/a$a;

    invoke-direct {p2, p0}, LR7/a$a;-><init>(LR7/a;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, LR7/a;->E:LE8/i;

    new-instance p2, LR7/a$b;

    invoke-direct {p2, p0}, LR7/a$b;-><init>(LR7/a;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, LR7/a;->F:LE8/i;

    new-instance p2, LR7/a$c;

    invoke-direct {p2, p0}, LR7/a$c;-><init>(LR7/a;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LR7/a;->G:LE8/i;

    return-void
.end method

.method private static synthetic J0(I)V
    .locals 19

    .prologue
    move/from16 v0, p0

    const/16 v1, 0x14

    const/16 v2, 0x13

    const/16 v3, 0x11

    const/16 v4, 0x10

    const/16 v5, 0xe

    const/16 v6, 0xc

    const/16 v7, 0x9

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v12, 0x2

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

    move v14, v11

    goto :goto_1

    :cond_1
    move v14, v12

    :goto_1
    new-array v14, v14, [Ljava/lang/Object;

    const-string v15, "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor"

    const/16 v16, 0x0

    packed-switch v0, :pswitch_data_0

    const-string v17, "storageManager"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_0
    const-string v17, "substitutor"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_1
    const-string v17, "typeSubstitution"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_2
    const-string v17, "kotlinTypeRefiner"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_3
    const-string v17, "typeArguments"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_4
    aput-object v15, v14, v16

    goto :goto_2

    :pswitch_5
    const-string v17, "name"

    aput-object v17, v14, v16

    :goto_2
    const-string v16, "getMemberScope"

    const-string v17, "substitute"

    const/16 v18, 0x1

    if-eq v0, v12, :cond_a

    if-eq v0, v11, :cond_9

    if-eq v0, v10, :cond_8

    if-eq v0, v9, :cond_7

    if-eq v0, v8, :cond_6

    if-eq v0, v7, :cond_5

    if-eq v0, v6, :cond_5

    if-eq v0, v5, :cond_5

    if-eq v0, v4, :cond_5

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    aput-object v15, v14, v18

    goto :goto_3

    :cond_2
    const-string v15, "getDefaultType"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_3
    aput-object v17, v14, v18

    goto :goto_3

    :cond_4
    const-string v15, "getUnsubstitutedMemberScope"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_5
    aput-object v16, v14, v18

    goto :goto_3

    :cond_6
    const-string v15, "getContextReceivers"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_7
    const-string v15, "getThisAsReceiverParameter"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_8
    const-string v15, "getUnsubstitutedInnerClassesScope"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_9
    const-string v15, "getOriginal"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_a
    const-string v15, "getName"

    aput-object v15, v14, v18

    :goto_3
    packed-switch v0, :pswitch_data_1

    const-string v15, "<init>"

    aput-object v15, v14, v12

    goto :goto_4

    :pswitch_6
    aput-object v17, v14, v12

    goto :goto_4

    :pswitch_7
    aput-object v16, v14, v12

    :goto_4
    :pswitch_8
    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    if-eq v0, v12, :cond_b

    if-eq v0, v11, :cond_b

    if-eq v0, v10, :cond_b

    if-eq v0, v9, :cond_b

    if-eq v0, v8, :cond_b

    if-eq v0, v7, :cond_b

    if-eq v0, v6, :cond_b

    if-eq v0, v5, :cond_b

    if-eq v0, v4, :cond_b

    if-eq v0, v3, :cond_b

    if-eq v0, v2, :cond_b

    if-eq v0, v1, :cond_b

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_6
        :pswitch_8
        :pswitch_8
    .end packed-switch
.end method


# virtual methods
.method public H0()Ly8/h;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/a;->F:LE8/i;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly8/h;

    if-nez v0, :cond_0

    const/4 v1, 0x4

    invoke-static {v1}, LR7/a;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public M(LF8/l0;LG8/g;)Ly8/h;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xa

    invoke-static {v0}, LR7/a;->J0(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0xb

    invoke-static {v0}, LR7/a;->J0(I)V

    :cond_1
    invoke-virtual {p1}, LF8/l0;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p2}, LR7/t;->Q(LG8/g;)Ly8/h;

    move-result-object p1

    if-nez p1, :cond_2

    const/16 p2, 0xc

    invoke-static {p2}, LR7/a;->J0(I)V

    :cond_2
    return-object p1

    :cond_3
    invoke-static {p1}, LF8/n0;->g(LF8/l0;)LF8/n0;

    move-result-object p1

    new-instance v0, Ly8/m;

    invoke-virtual {p0, p2}, LR7/t;->Q(LG8/g;)Ly8/h;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ly8/m;-><init>(Ly8/h;LF8/n0;)V

    return-object v0
.end method

.method public M0()Ly8/h;
    .locals 2

    .prologue
    invoke-static {p0}, Lr8/f;->g(LO7/m;)LO7/G;

    move-result-object v0

    invoke-static {v0}, Lv8/c;->o(LO7/G;)LG8/g;

    move-result-object v0

    invoke-virtual {p0, v0}, LR7/t;->Q(LG8/g;)Ly8/h;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x11

    invoke-static {v1}, LR7/a;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public O0(LF8/n0;)LO7/e;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x12

    invoke-static {v0}, LR7/a;->J0(I)V

    :cond_0
    invoke-virtual {p1}, LF8/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    new-instance v0, LR7/s;

    invoke-direct {v0, p0, p1}, LR7/s;-><init>(LR7/t;LF8/n0;)V

    return-object v0
.end method

.method public P0()Ljava/util/List;
    .locals 2

    .prologue
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x6

    invoke-static {v1}, LR7/a;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public S0()LO7/X;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/a;->G:LE8/i;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/X;

    if-nez v0, :cond_0

    const/4 v1, 0x5

    invoke-static {v1}, LR7/a;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public a()LO7/e;
    .locals 0

    return-object p0
.end method

.method public bridge synthetic a()LO7/h;
    .locals 1

    invoke-virtual {p0}, LR7/a;->a()LO7/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/m;
    .locals 1

    invoke-virtual {p0}, LR7/a;->a()LO7/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(LF8/n0;)LO7/n;
    .locals 0

    invoke-virtual {p0, p1}, LR7/a;->O0(LF8/n0;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method public f0(LF8/l0;)Ly8/h;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xf

    invoke-static {v0}, LR7/a;->J0(I)V

    :cond_0
    invoke-static {p0}, Lr8/f;->g(LO7/m;)LO7/G;

    move-result-object v0

    invoke-static {v0}, Lv8/c;->o(LO7/G;)LG8/g;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LR7/a;->M(LF8/l0;LG8/g;)Ly8/h;

    move-result-object p1

    if-nez p1, :cond_1

    const/16 v0, 0x10

    invoke-static {v0}, LR7/a;->J0(I)V

    :cond_1
    return-object p1
.end method

.method public getName()Ln8/f;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/a;->D:Ln8/f;

    if-nez v0, :cond_0

    const/4 v1, 0x2

    invoke-static {v1}, LR7/a;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, LO7/o;->l(LO7/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public w()LF8/M;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/a;->E:LE8/i;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/M;

    if-nez v0, :cond_0

    const/16 v1, 0x14

    invoke-static {v1}, LR7/a;->J0(I)V

    :cond_0
    return-object v0
.end method
