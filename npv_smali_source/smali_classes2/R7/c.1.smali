.class public abstract LR7/c;
.super LR7/j;
.source "SourceFile"

# interfaces
.implements LO7/X;


# direct methods
.method public constructor <init>(LP7/g;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LR7/c;->M(I)V

    :cond_0
    sget-object v0, Ln8/h;->h:Ln8/f;

    invoke-direct {p0, p1, v0}, LR7/j;-><init>(LP7/g;Ln8/f;)V

    return-void
.end method

.method public constructor <init>(LP7/g;Ln8/f;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, LR7/c;->M(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x2

    invoke-static {v0}, LR7/c;->M(I)V

    :cond_1
    invoke-direct {p0, p1, p2}, LR7/j;-><init>(LP7/g;Ln8/f;)V

    return-void
.end method

.method private static synthetic M(I)V
    .locals 6

    .prologue
    packed-switch p0, :pswitch_data_0

    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :pswitch_0
    const-string v0, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v1, 0x2

    packed-switch p0, :pswitch_data_1

    const/4 v2, 0x3

    goto :goto_1

    :pswitch_1
    move v2, v1

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    const-string v5, "annotations"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_2
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_3
    const-string v5, "substitutor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_4
    const-string v5, "name"

    aput-object v5, v2, v4

    :goto_2
    const/4 v4, 0x1

    packed-switch p0, :pswitch_data_3

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_5
    const-string v3, "getSource"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_6
    const-string v3, "getOriginal"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_7
    const-string v3, "getVisibility"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_8
    const-string v3, "getOverriddenDescriptors"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_9
    const-string v3, "getValueParameters"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_a
    const-string v3, "getType"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_b
    const-string v3, "getTypeParameters"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_c
    const-string v3, "getContextReceiverParameters"

    aput-object v3, v2, v4

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_d
    const-string v3, "substitute"

    aput-object v3, v2, v1

    :goto_4
    :pswitch_e
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_f
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x4
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x3
        :pswitch_d
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x4
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
    .end packed-switch
.end method


# virtual methods
.method public J0()LO7/Q;
    .locals 0

    return-object p0
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic a()LO7/a;
    .locals 1

    invoke-virtual {p0}, LR7/c;->J0()LO7/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/m;
    .locals 1

    invoke-virtual {p0}, LR7/c;->J0()LO7/Q;

    move-result-object v0

    return-object v0
.end method

.method public c(LF8/n0;)LO7/X;
    .locals 3

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, LR7/c;->M(I)V

    :cond_0
    invoke-virtual {p1}, LF8/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    invoke-interface {p0}, LO7/i0;->b()LO7/m;

    move-result-object v0

    instance-of v0, v0, LO7/e;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LR7/c;->getType()LF8/E;

    move-result-object v0

    sget-object v1, LF8/u0;->I:LF8/u0;

    :goto_0
    invoke-virtual {p1, v0, v1}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, LR7/c;->getType()LF8/E;

    move-result-object v0

    sget-object v1, LF8/u0;->G:LF8/u0;

    goto :goto_0

    :goto_1
    if-nez p1, :cond_3

    const/4 p1, 0x0

    return-object p1

    :cond_3
    invoke-virtual {p0}, LR7/c;->getType()LF8/E;

    move-result-object v0

    if-ne p1, v0, :cond_4

    return-object p0

    :cond_4
    new-instance v0, LR7/F;

    invoke-interface {p0}, LO7/i0;->b()LO7/m;

    move-result-object v1

    new-instance v2, Lz8/i;

    invoke-direct {v2, p1}, Lz8/i;-><init>(LF8/E;)V

    invoke-virtual {p0}, LP7/b;->k()LP7/g;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, LR7/F;-><init>(LO7/m;Lz8/g;LP7/g;)V

    return-object v0
.end method

.method public bridge synthetic c(LF8/n0;)LO7/n;
    .locals 0

    invoke-virtual {p0, p1}, LR7/c;->c(LF8/n0;)LO7/X;

    move-result-object p1

    return-object p1
.end method

.method public f()Ljava/util/Collection;
    .locals 2

    .prologue
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x8

    invoke-static {v1}, LR7/c;->M(I)V

    :cond_0
    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 2

    .prologue
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x5

    invoke-static {v1}, LR7/c;->M(I)V

    :cond_0
    return-object v0
.end method

.method public getType()LF8/E;
    .locals 2

    .prologue
    invoke-interface {p0}, LO7/X;->getValue()Lz8/g;

    move-result-object v0

    invoke-interface {v0}, Lz8/g;->getType()LF8/E;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x6

    invoke-static {v1}, LR7/c;->M(I)V

    :cond_0
    return-object v0
.end method

.method public h()LO7/u;
    .locals 2

    .prologue
    sget-object v0, LO7/t;->f:LO7/u;

    if-nez v0, :cond_0

    const/16 v1, 0x9

    invoke-static {v1}, LR7/c;->M(I)V

    :cond_0
    return-object v0
.end method

.method public l()LF8/E;
    .locals 1

    invoke-virtual {p0}, LR7/c;->getType()LF8/E;

    move-result-object v0

    return-object v0
.end method

.method public m0()LO7/X;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 2

    .prologue
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x7

    invoke-static {v1}, LR7/c;->M(I)V

    :cond_0
    return-object v0
.end method

.method public o()LO7/a0;
    .locals 2

    .prologue
    sget-object v0, LO7/a0;->a:LO7/a0;

    if-nez v0, :cond_0

    const/16 v1, 0xb

    invoke-static {v1}, LR7/c;->M(I)V

    :cond_0
    return-object v0
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, LO7/o;->f(LO7/X;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public v0()LO7/X;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
