.class public LR7/s;
.super LR7/t;
.source "SourceFile"


# instance fields
.field private final D:LR7/t;

.field private final E:LF8/n0;

.field private F:LF8/n0;

.field private G:Ljava/util/List;

.field private H:Ljava/util/List;

.field private I:LF8/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LR7/t;LF8/n0;)V
    .locals 0

    invoke-direct {p0}, LR7/t;-><init>()V

    iput-object p1, p0, LR7/s;->D:LR7/t;

    iput-object p2, p0, LR7/s;->E:LF8/n0;

    return-void
.end method

.method private static synthetic J0(I)V
    .locals 15

    .prologue
    const/16 v0, 0x17

    const/16 v1, 0xd

    const/16 v2, 0xa

    const/16 v3, 0x8

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x2

    if-eq p0, v7, :cond_0

    if-eq p0, v6, :cond_0

    if-eq p0, v5, :cond_0

    if-eq p0, v4, :cond_0

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v8, "@NotNull method %s.%s must not return null"

    goto :goto_0

    :cond_0
    const-string v8, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    :goto_0
    if-eq p0, v7, :cond_1

    if-eq p0, v6, :cond_1

    if-eq p0, v5, :cond_1

    if-eq p0, v4, :cond_1

    if-eq p0, v3, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v9, v7

    goto :goto_1

    :cond_1
    move v9, v6

    :goto_1
    new-array v9, v9, [Ljava/lang/Object;

    const-string v10, "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor"

    const/4 v11, 0x0

    if-eq p0, v7, :cond_5

    if-eq p0, v6, :cond_4

    if-eq p0, v5, :cond_3

    if-eq p0, v4, :cond_4

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_3

    if-eq p0, v1, :cond_4

    if-eq p0, v0, :cond_2

    aput-object v10, v9, v11

    goto :goto_2

    :cond_2
    const-string v12, "substitutor"

    aput-object v12, v9, v11

    goto :goto_2

    :cond_3
    const-string v12, "typeSubstitution"

    aput-object v12, v9, v11

    goto :goto_2

    :cond_4
    const-string v12, "kotlinTypeRefiner"

    aput-object v12, v9, v11

    goto :goto_2

    :cond_5
    const-string v12, "typeArguments"

    aput-object v12, v9, v11

    :goto_2
    const-string v11, "getMemberScope"

    const-string v12, "getUnsubstitutedMemberScope"

    const-string v13, "substitute"

    const/4 v14, 0x1

    packed-switch p0, :pswitch_data_0

    const-string v10, "getTypeConstructor"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_0
    const-string v10, "getSealedSubclasses"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_1
    const-string v10, "getDeclaredTypeParameters"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_2
    const-string v10, "getSource"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_3
    const-string v10, "getUnsubstitutedInnerClassesScope"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_4
    const-string v10, "getVisibility"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_5
    const-string v10, "getModality"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_6
    const-string v10, "getKind"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_7
    aput-object v13, v9, v14

    goto :goto_3

    :pswitch_8
    const-string v10, "getContainingDeclaration"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_9
    const-string v10, "getOriginal"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_a
    const-string v10, "getName"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_b
    const-string v10, "getAnnotations"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_c
    const-string v10, "getConstructors"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_d
    const-string v10, "getContextReceivers"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_e
    const-string v10, "getDefaultType"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_f
    const-string v10, "getStaticScope"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_10
    aput-object v12, v9, v14

    goto :goto_3

    :pswitch_11
    aput-object v11, v9, v14

    goto :goto_3

    :pswitch_12
    aput-object v10, v9, v14

    :goto_3
    if-eq p0, v7, :cond_8

    if-eq p0, v6, :cond_8

    if-eq p0, v5, :cond_8

    if-eq p0, v4, :cond_8

    if-eq p0, v3, :cond_8

    if-eq p0, v2, :cond_8

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_6

    goto :goto_4

    :cond_6
    aput-object v13, v9, v7

    goto :goto_4

    :cond_7
    aput-object v12, v9, v7

    goto :goto_4

    :cond_8
    aput-object v11, v9, v7

    :goto_4
    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    if-eq p0, v7, :cond_9

    if-eq p0, v6, :cond_9

    if-eq p0, v5, :cond_9

    if-eq p0, v4, :cond_9

    if-eq p0, v3, :cond_9

    if-eq p0, v2, :cond_9

    if-eq p0, v1, :cond_9

    if-eq p0, v0, :cond_9

    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_12
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_12
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic O0(LR7/s;LF8/M;)LF8/M;
    .locals 0

    invoke-direct {p0, p1}, LR7/s;->V0(LF8/M;)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method private T0()LF8/n0;
    .locals 3

    .prologue
    iget-object v0, p0, LR7/s;->F:LF8/n0;

    if-nez v0, :cond_1

    iget-object v0, p0, LR7/s;->E:LF8/n0;

    invoke-virtual {v0}, LF8/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LR7/s;->E:LF8/n0;

    iput-object v0, p0, LR7/s;->F:LF8/n0;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->x()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, LR7/s;->G:Ljava/util/List;

    iget-object v1, p0, LR7/s;->E:LF8/n0;

    invoke-virtual {v1}, LF8/n0;->j()LF8/l0;

    move-result-object v1

    iget-object v2, p0, LR7/s;->G:Ljava/util/List;

    invoke-static {v0, v1, p0, v2}, LF8/s;->b(Ljava/util/List;LF8/l0;LO7/m;Ljava/util/List;)LF8/n0;

    move-result-object v0

    iput-object v0, p0, LR7/s;->F:LF8/n0;

    iget-object v0, p0, LR7/s;->G:Ljava/util/List;

    new-instance v1, LR7/s$a;

    invoke-direct {v1, p0}, LR7/s$a;-><init>(LR7/s;)V

    invoke-static {v0, v1}, Lj7/v;->e0(Ljava/lang/Iterable;Lx7/l;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LR7/s;->H:Ljava/util/List;

    :cond_1
    :goto_0
    iget-object v0, p0, LR7/s;->F:LF8/n0;

    return-object v0
.end method

.method private V0(LF8/M;)LF8/M;
    .locals 2

    .prologue
    if-eqz p1, :cond_1

    iget-object v0, p0, LR7/s;->E:LF8/n0;

    invoke-virtual {v0}, LF8/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LR7/s;->T0()LF8/n0;

    move-result-object v0

    sget-object v1, LF8/u0;->G:LF8/u0;

    invoke-virtual {v0, p1, v1}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object p1

    check-cast p1, LF8/M;

    :cond_1
    :goto_0
    return-object p1
.end method


# virtual methods
.method public A()Ljava/util/List;
    .locals 2

    .prologue
    invoke-direct {p0}, LR7/s;->T0()LF8/n0;

    iget-object v0, p0, LR7/s;->H:Ljava/util/List;

    if-nez v0, :cond_0

    const/16 v1, 0x1e

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public C()Z
    .locals 1

    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/C;->C()Z

    move-result v0

    return v0
.end method

.method public E()Z
    .locals 1

    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->E()Z

    move-result v0

    return v0
.end method

.method public H0()Ly8/h;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->H0()Ly8/h;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x1c

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public I()Z
    .locals 1

    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->I()Z

    move-result v0

    return v0
.end method

.method public I0()LO7/h0;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->I0()LO7/h0;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, LR7/s$b;

    invoke-direct {v1, p0}, LR7/s$b;-><init>(LR7/s;)V

    invoke-virtual {v0, v1}, LO7/h0;->c(Lx7/l;)LO7/h0;

    move-result-object v0

    return-object v0
.end method

.method public M(LF8/l0;LG8/g;)Ly8/h;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x5

    invoke-static {v0}, LR7/s;->J0(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x6

    invoke-static {v0}, LR7/s;->J0(I)V

    :cond_1
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-virtual {v0, p1, p2}, LR7/t;->M(LF8/l0;LG8/g;)Ly8/h;

    move-result-object p1

    iget-object p2, p0, LR7/s;->E:LF8/n0;

    invoke-virtual {p2}, LF8/n0;->k()Z

    move-result p2

    if-eqz p2, :cond_3

    if-nez p1, :cond_2

    const/4 p2, 0x7

    invoke-static {p2}, LR7/s;->J0(I)V

    :cond_2
    return-object p1

    :cond_3
    new-instance p2, Ly8/m;

    invoke-direct {p0}, LR7/s;->T0()LF8/n0;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Ly8/m;-><init>(Ly8/h;LF8/n0;)V

    return-object p2
.end method

.method public M0()Ly8/h;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-static {v0}, Lr8/f;->g(LO7/m;)LO7/G;

    move-result-object v0

    invoke-static {v0}, Lv8/c;->o(LO7/G;)LG8/g;

    move-result-object v0

    invoke-virtual {p0, v0}, LR7/s;->Q(LG8/g;)Ly8/h;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0xc

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public N0()Z
    .locals 1

    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/C;->N0()Z

    move-result v0

    return v0
.end method

.method public O()Ljava/util/Collection;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->O()Ljava/util/Collection;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x1f

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public P()Z
    .locals 1

    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->P()Z

    move-result v0

    return v0
.end method

.method public P0()Ljava/util/List;
    .locals 2

    .prologue
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x11

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public Q(LG8/g;)Ly8/h;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xd

    invoke-static {v0}, LR7/s;->J0(I)V

    :cond_0
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-virtual {v0, p1}, LR7/t;->Q(LG8/g;)Ly8/h;

    move-result-object p1

    iget-object v0, p0, LR7/s;->E:LF8/n0;

    invoke-virtual {v0}, LF8/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    const/16 v0, 0xe

    invoke-static {v0}, LR7/s;->J0(I)V

    :cond_1
    return-object p1

    :cond_2
    new-instance v0, Ly8/m;

    invoke-direct {p0}, LR7/s;->T0()LF8/n0;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ly8/m;-><init>(Ly8/h;LF8/n0;)V

    return-object v0
.end method

.method public R()Z
    .locals 1

    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/C;->R()Z

    move-result v0

    return v0
.end method

.method public R0()Z
    .locals 1

    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->R0()Z

    move-result v0

    return v0
.end method

.method public S()Z
    .locals 1

    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/i;->S()Z

    move-result v0

    return v0
.end method

.method public S0()LO7/X;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public U0(LF8/n0;)LO7/e;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x17

    invoke-static {v0}, LR7/s;->J0(I)V

    :cond_0
    invoke-virtual {p1}, LF8/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    new-instance v0, LR7/s;

    invoke-virtual {p1}, LF8/n0;->j()LF8/l0;

    move-result-object p1

    invoke-direct {p0}, LR7/s;->T0()LF8/n0;

    move-result-object v1

    invoke-virtual {v1}, LF8/n0;->j()LF8/l0;

    move-result-object v1

    invoke-static {p1, v1}, LF8/n0;->h(LF8/l0;LF8/l0;)LF8/n0;

    move-result-object p1

    invoke-direct {v0, p0, p1}, LR7/s;-><init>(LR7/t;LF8/n0;)V

    return-object v0
.end method

.method public X()LO7/d;
    .locals 1

    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->X()LO7/d;

    move-result-object v0

    return-object v0
.end method

.method public Y()Ly8/h;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->Y()Ly8/h;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0xf

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public a()LO7/e;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->a()LO7/e;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x15

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic a()LO7/h;
    .locals 1

    invoke-virtual {p0}, LR7/s;->a()LO7/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/m;
    .locals 1

    invoke-virtual {p0}, LR7/s;->a()LO7/e;

    move-result-object v0

    return-object v0
.end method

.method public a0()LO7/e;
    .locals 1

    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->a0()LO7/e;

    move-result-object v0

    return-object v0
.end method

.method public b()LO7/m;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->b()LO7/m;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x16

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic c(LF8/n0;)LO7/n;
    .locals 0

    invoke-virtual {p0, p1}, LR7/s;->U0(LF8/n0;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method public f0(LF8/l0;)Ly8/h;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xa

    invoke-static {v0}, LR7/s;->J0(I)V

    :cond_0
    invoke-static {p0}, Lr8/f;->g(LO7/m;)LO7/G;

    move-result-object v0

    invoke-static {v0}, Lv8/c;->o(LO7/G;)LG8/g;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LR7/s;->M(LF8/l0;LG8/g;)Ly8/h;

    move-result-object p1

    if-nez p1, :cond_1

    const/16 v0, 0xb

    invoke-static {v0}, LR7/s;->J0(I)V

    :cond_1
    return-object p1
.end method

.method public getName()Ln8/f;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x14

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public h()LO7/u;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->h()LO7/u;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x1b

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public j()LO7/f;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->j()LO7/f;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x19

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public k()LP7/g;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LP7/a;->k()LP7/g;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x13

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->m()Z

    move-result v0

    return v0
.end method

.method public o()LO7/a0;
    .locals 2

    .prologue
    sget-object v0, LO7/a0;->a:LO7/a0;

    if-nez v0, :cond_0

    const/16 v1, 0x1d

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public p()LF8/e0;
    .locals 5

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object v0

    iget-object v1, p0, LR7/s;->E:LF8/n0;

    invoke-virtual {v1}, LF8/n0;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    const/4 v1, 0x0

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0

    :cond_1
    iget-object v1, p0, LR7/s;->I:LF8/e0;

    if-nez v1, :cond_3

    invoke-direct {p0}, LR7/s;->T0()LF8/n0;

    move-result-object v1

    invoke-interface {v0}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF8/E;

    sget-object v4, LF8/u0;->G:LF8/u0;

    invoke-virtual {v1, v3, v4}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, LF8/k;

    iget-object v1, p0, LR7/s;->G:Ljava/util/List;

    sget-object v3, LE8/f;->e:LE8/n;

    invoke-direct {v0, p0, v1, v2, v3}, LF8/k;-><init>(LO7/e;Ljava/util/List;Ljava/util/Collection;LE8/n;)V

    iput-object v0, p0, LR7/s;->I:LF8/e0;

    :cond_3
    iget-object v0, p0, LR7/s;->I:LF8/e0;

    if-nez v0, :cond_4

    const/4 v1, 0x1

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_4
    return-object v0
.end method

.method public q()LO7/D;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->q()LO7/D;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x1a

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public r()Ljava/util/Collection;
    .locals 5

    .prologue
    iget-object v0, p0, LR7/s;->D:LR7/t;

    invoke-interface {v0}, LO7/e;->r()Ljava/util/Collection;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/d;

    invoke-interface {v2}, LO7/y;->z()LO7/y$a;

    move-result-object v3

    invoke-interface {v2}, LO7/d;->a()LO7/d;

    move-result-object v4

    invoke-interface {v3, v4}, LO7/y$a;->z(LO7/b;)LO7/y$a;

    move-result-object v3

    invoke-interface {v2}, LO7/C;->q()LO7/D;

    move-result-object v4

    invoke-interface {v3, v4}, LO7/y$a;->x(LO7/D;)LO7/y$a;

    move-result-object v3

    invoke-interface {v2}, LO7/C;->h()LO7/u;

    move-result-object v4

    invoke-interface {v3, v4}, LO7/y$a;->r(LO7/u;)LO7/y$a;

    move-result-object v3

    invoke-interface {v2}, LO7/b;->j()LO7/b$a;

    move-result-object v2

    invoke-interface {v3, v2}, LO7/y$a;->l(LO7/b$a;)LO7/y$a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, LO7/y$a;->v(Z)LO7/y$a;

    move-result-object v2

    invoke-interface {v2}, LO7/y$a;->i()LO7/y;

    move-result-object v2

    check-cast v2, LO7/d;

    invoke-direct {p0}, LR7/s;->T0()LF8/n0;

    move-result-object v3

    invoke-interface {v2, v3}, LO7/d;->c(LF8/n0;)LO7/d;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, LO7/o;->l(LO7/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public w()LF8/M;
    .locals 5

    .prologue
    invoke-virtual {p0}, LR7/s;->p()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->x()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LF8/q0;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sget-object v1, LF8/n;->a:LF8/n;

    invoke-virtual {p0}, LR7/s;->k()LP7/g;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3}, LF8/n;->a(LP7/g;LF8/e0;LO7/m;)LF8/a0;

    move-result-object v1

    invoke-virtual {p0}, LR7/s;->p()LF8/e0;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0}, LR7/s;->M0()Ly8/h;

    move-result-object v4

    invoke-static {v1, v2, v0, v3, v4}, LF8/F;->m(LF8/a0;LF8/e0;Ljava/util/List;ZLy8/h;)LF8/M;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x10

    invoke-static {v1}, LR7/s;->J0(I)V

    :cond_0
    return-object v0
.end method
