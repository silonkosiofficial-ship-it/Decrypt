.class public LR7/y;
.super LR7/g;
.source "SourceFile"


# instance fields
.field private final K:LO7/f;

.field private final L:Z

.field private M:LO7/D;

.field private N:LO7/u;

.field private O:LF8/e0;

.field private P:Ljava/util/List;

.field private final Q:Ljava/util/Collection;

.field private final R:LE8/n;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LO7/m;LO7/f;ZZLn8/f;LO7/a0;LE8/n;)V
    .locals 6

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LR7/y;->J0(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LR7/y;->J0(I)V

    :cond_1
    if-nez p5, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LR7/y;->J0(I)V

    :cond_2
    if-nez p6, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LR7/y;->J0(I)V

    :cond_3
    if-nez p7, :cond_4

    const/4 v0, 0x4

    invoke-static {v0}, LR7/y;->J0(I)V

    :cond_4
    move-object v0, p0

    move-object v1, p7

    move-object v2, p1

    move-object v3, p5

    move-object v4, p6

    move v5, p4

    invoke-direct/range {v0 .. v5}, LR7/g;-><init>(LE8/n;LO7/m;Ln8/f;LO7/a0;Z)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LR7/y;->Q:Ljava/util/Collection;

    iput-object p7, p0, LR7/y;->R:LE8/n;

    iput-object p2, p0, LR7/y;->K:LO7/f;

    iput-boolean p3, p0, LR7/y;->L:Z

    return-void
.end method

.method private static synthetic J0(I)V
    .locals 6

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

    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    const-string v5, "containingDeclaration"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_4
    const-string v5, "kotlinTypeRefiner"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_5
    const-string v5, "typeParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_6
    const-string v5, "supertype"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_7
    const-string v5, "visibility"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_8
    const-string v5, "modality"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_9
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_a
    const-string v5, "storageManager"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_b
    const-string v5, "source"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_c
    const-string v5, "name"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_d
    const-string v5, "kind"

    aput-object v5, v2, v4

    :goto_2
    const-string v4, "getUnsubstitutedMemberScope"

    const/4 v5, 0x1

    packed-switch p0, :pswitch_data_3

    :pswitch_e
    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_f
    const-string v3, "getSealedSubclasses"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_10
    const-string v3, "getStaticScope"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_11
    aput-object v4, v2, v5

    goto :goto_3

    :pswitch_12
    const-string v3, "getDeclaredTypeParameters"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_13
    const-string v3, "getConstructors"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_14
    const-string v3, "getTypeConstructor"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_15
    const-string v3, "getVisibility"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_16
    const-string v3, "getKind"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_17
    const-string v3, "getModality"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_18
    const-string v3, "getAnnotations"

    aput-object v3, v2, v5

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_19
    aput-object v4, v2, v1

    goto :goto_4

    :pswitch_1a
    const-string v3, "setTypeParameterDescriptors"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_1b
    const-string v3, "addSupertype"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_1c
    const-string v3, "setVisibility"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_1d
    const-string v3, "setModality"

    aput-object v3, v2, v1

    :goto_4
    :pswitch_1e
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    :pswitch_1f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_20
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_0
        :pswitch_1
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
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x5
        :pswitch_3
        :pswitch_2
        :pswitch_3
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
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_9
        :pswitch_9
        :pswitch_7
        :pswitch_9
        :pswitch_9
        :pswitch_6
        :pswitch_9
        :pswitch_5
        :pswitch_9
        :pswitch_4
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x5
        :pswitch_18
        :pswitch_e
        :pswitch_17
        :pswitch_16
        :pswitch_e
        :pswitch_15
        :pswitch_14
        :pswitch_e
        :pswitch_13
        :pswitch_e
        :pswitch_12
        :pswitch_e
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x5
        :pswitch_1e
        :pswitch_1d
        :pswitch_1e
        :pswitch_1e
        :pswitch_1c
        :pswitch_1e
        :pswitch_1e
        :pswitch_1b
        :pswitch_1e
        :pswitch_1a
        :pswitch_1e
        :pswitch_19
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x5
        :pswitch_20
        :pswitch_1f
        :pswitch_20
        :pswitch_20
        :pswitch_1f
        :pswitch_20
        :pswitch_20
        :pswitch_1f
        :pswitch_20
        :pswitch_1f
        :pswitch_20
        :pswitch_1f
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch
.end method


# virtual methods
.method public A()Ljava/util/List;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/y;->P:Ljava/util/List;

    if-nez v0, :cond_0

    const/16 v1, 0xf

    invoke-static {v1}, LR7/y;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public E()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public I()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public I0()LO7/h0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public N0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public O()Ljava/util/Collection;
    .locals 2

    .prologue
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x13

    invoke-static {v1}, LR7/y;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public P()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public Q(LG8/g;)Ly8/h;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 p1, 0x10

    invoke-static {p1}, LR7/y;->J0(I)V

    :cond_0
    sget-object p1, Ly8/h$b;->b:Ly8/h$b;

    if-nez p1, :cond_1

    const/16 v0, 0x11

    invoke-static {v0}, LR7/y;->J0(I)V

    :cond_1
    return-object p1
.end method

.method public R()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public R0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public S()Z
    .locals 1

    iget-boolean v0, p0, LR7/y;->L:Z

    return v0
.end method

.method public T0()V
    .locals 4

    .prologue
    new-instance v0, LF8/k;

    iget-object v1, p0, LR7/y;->P:Ljava/util/List;

    iget-object v2, p0, LR7/y;->Q:Ljava/util/Collection;

    iget-object v3, p0, LR7/y;->R:LE8/n;

    invoke-direct {v0, p0, v1, v2, v3}, LF8/k;-><init>(LO7/e;Ljava/util/List;Ljava/util/Collection;LE8/n;)V

    iput-object v0, p0, LR7/y;->O:LF8/e0;

    invoke-virtual {p0}, LR7/y;->U0()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/y;

    check-cast v1, LR7/f;

    invoke-virtual {p0}, LR7/a;->w()LF8/M;

    move-result-object v2

    invoke-virtual {v1, v2}, LR7/p;->p1(LF8/E;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public U0()Ljava/util/Set;
    .locals 2

    .prologue
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0xd

    invoke-static {v1}, LR7/y;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public V0(LO7/D;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x6

    invoke-static {v0}, LR7/y;->J0(I)V

    :cond_0
    iput-object p1, p0, LR7/y;->M:LO7/D;

    return-void
.end method

.method public W0(Ljava/util/List;)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xe

    invoke-static {v0}, LR7/y;->J0(I)V

    :cond_0
    iget-object v0, p0, LR7/y;->P:Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LR7/y;->P:Ljava/util/List;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Type parameters are already set for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LR7/a;->getName()Ln8/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public X()LO7/d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public X0(LO7/u;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x9

    invoke-static {v0}, LR7/y;->J0(I)V

    :cond_0
    iput-object p1, p0, LR7/y;->N:LO7/u;

    return-void
.end method

.method public Y()Ly8/h;
    .locals 2

    .prologue
    sget-object v0, Ly8/h$b;->b:Ly8/h$b;

    if-nez v0, :cond_0

    const/16 v1, 0x12

    invoke-static {v1}, LR7/y;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public a0()LO7/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public h()LO7/u;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/y;->N:LO7/u;

    if-nez v0, :cond_0

    const/16 v1, 0xa

    invoke-static {v1}, LR7/y;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public j()LO7/f;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/y;->K:LO7/f;

    if-nez v0, :cond_0

    const/16 v1, 0x8

    invoke-static {v1}, LR7/y;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public k()LP7/g;
    .locals 2

    .prologue
    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x5

    invoke-static {v1}, LR7/y;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public p()LF8/e0;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/y;->O:LF8/e0;

    if-nez v0, :cond_0

    const/16 v1, 0xb

    invoke-static {v1}, LR7/y;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public q()LO7/D;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/y;->M:LO7/D;

    if-nez v0, :cond_0

    const/4 v1, 0x7

    invoke-static {v1}, LR7/y;->J0(I)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic r()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LR7/y;->U0()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LR7/j;->Q(LO7/m;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
