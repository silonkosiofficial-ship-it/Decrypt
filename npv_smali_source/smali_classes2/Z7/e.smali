.class public LZ7/e;
.super LR7/G;
.source "SourceFile"

# interfaces
.implements LZ7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ7/e$c;
    }
.end annotation


# static fields
.field public static final i0:LO7/a$a;

.field public static final j0:LO7/a$a;


# instance fields
.field private g0:LZ7/e$c;

.field private final h0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZ7/e$a;

    invoke-direct {v0}, LZ7/e$a;-><init>()V

    sput-object v0, LZ7/e;->i0:LO7/a$a;

    new-instance v0, LZ7/e$b;

    invoke-direct {v0}, LZ7/e$b;-><init>()V

    sput-object v0, LZ7/e;->j0:LO7/a$a;

    return-void
.end method

.method protected constructor <init>(LO7/m;LO7/Z;LP7/g;Ln8/f;LO7/b$a;LO7/a0;Z)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_0
    if-nez p3, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_1
    if-nez p4, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_2
    if-nez p5, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_3
    if-nez p6, :cond_4

    const/4 v0, 0x4

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_4
    invoke-direct/range {p0 .. p6}, LR7/G;-><init>(LO7/m;LO7/Z;LP7/g;Ln8/f;LO7/b$a;LO7/a0;)V

    const/4 p1, 0x0

    iput-object p1, p0, LZ7/e;->g0:LZ7/e$c;

    iput-boolean p7, p0, LZ7/e;->h0:Z

    return-void
.end method

.method private static synthetic M(I)V
    .locals 11

    .prologue
    const/16 v0, 0x15

    const/16 v1, 0x12

    const/16 v2, 0xd

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v3, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v3, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v4, 0x2

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v5, 0x3

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor"

    const/4 v7, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v8, "containingDeclaration"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_1
    const-string v8, "enhancedReturnType"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_2
    const-string v8, "enhancedValueParameterTypes"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_3
    const-string v8, "newOwner"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_4
    aput-object v6, v5, v7

    goto :goto_2

    :pswitch_5
    const-string v8, "visibility"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_6
    const-string v8, "unsubstitutedValueParameters"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_7
    const-string v8, "typeParameters"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_8
    const-string v8, "contextReceiverParameters"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_9
    const-string v8, "source"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_a
    const-string v8, "kind"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_b
    const-string v8, "name"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_c
    const-string v8, "annotations"

    aput-object v8, v5, v7

    :goto_2
    const-string v7, "initialize"

    const-string v8, "createSubstitutedCopy"

    const-string v9, "enhance"

    const/4 v10, 0x1

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v6, v5, v10

    goto :goto_3

    :cond_2
    aput-object v9, v5, v10

    goto :goto_3

    :cond_3
    aput-object v8, v5, v10

    goto :goto_3

    :cond_4
    aput-object v7, v5, v10

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v6, "<init>"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_d
    aput-object v9, v5, v4

    goto :goto_4

    :pswitch_e
    aput-object v8, v5, v4

    goto :goto_4

    :pswitch_f
    aput-object v7, v5, v4

    goto :goto_4

    :pswitch_10
    const-string v6, "createJavaMethod"

    aput-object v6, v5, v4

    :goto_4
    :pswitch_11
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eq p0, v2, :cond_5

    if-eq p0, v1, :cond_5

    if-eq p0, v0, :cond_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_a
        :pswitch_c
        :pswitch_9
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x5
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_11
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_11
        :pswitch_d
        :pswitch_d
        :pswitch_11
    .end packed-switch
.end method

.method public static y1(LO7/m;LP7/g;Ln8/f;LO7/a0;Z)LZ7/e;
    .locals 9

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x5

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x6

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_1
    if-nez p2, :cond_2

    const/4 v0, 0x7

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_2
    if-nez p3, :cond_3

    const/16 v0, 0x8

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_3
    new-instance v0, LZ7/e;

    const/4 v3, 0x0

    sget-object v6, LO7/b$a;->C:LO7/b$a;

    move-object v1, v0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v1 .. v8}, LZ7/e;-><init>(LO7/m;LO7/Z;LP7/g;Ln8/f;LO7/b$a;LO7/a0;Z)V

    return-object v0
.end method


# virtual methods
.method public A1(LF8/E;Ljava/util/List;LF8/E;Li7/u;)LZ7/e;
    .locals 1

    .prologue
    if-nez p2, :cond_0

    const/16 v0, 0x13

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_0
    if-nez p3, :cond_1

    const/16 v0, 0x14

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_1
    invoke-virtual {p0}, LR7/p;->n()Ljava/util/List;

    move-result-object v0

    invoke-static {p2, v0, p0}, LZ7/h;->a(Ljava/util/Collection;Ljava/util/Collection;LO7/a;)Ljava/util/List;

    move-result-object p2

    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lr8/e;->i(LO7/a;LF8/E;LP7/g;)LO7/X;

    move-result-object p1

    :goto_0
    invoke-virtual {p0}, LR7/G;->z()LO7/y$a;

    move-result-object v0

    invoke-interface {v0, p2}, LO7/y$a;->m(Ljava/util/List;)LO7/y$a;

    move-result-object p2

    invoke-interface {p2, p3}, LO7/y$a;->q(LF8/E;)LO7/y$a;

    move-result-object p2

    invoke-interface {p2, p1}, LO7/y$a;->k(LO7/X;)LO7/y$a;

    move-result-object p1

    invoke-interface {p1}, LO7/y$a;->j()LO7/y$a;

    move-result-object p1

    invoke-interface {p1}, LO7/y$a;->n()LO7/y$a;

    move-result-object p1

    invoke-interface {p1}, LO7/y$a;->i()LO7/y;

    move-result-object p1

    check-cast p1, LZ7/e;

    if-eqz p4, :cond_3

    invoke-virtual {p4}, Li7/u;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LO7/a$a;

    invoke-virtual {p4}, Li7/u;->d()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LR7/p;->d1(LO7/a$a;Ljava/lang/Object;)V

    :cond_3
    if-nez p1, :cond_4

    const/16 p2, 0x15

    invoke-static {p2}, LZ7/e;->M(I)V

    :cond_4
    return-object p1
.end method

.method public B1(ZZ)V
    .locals 0

    invoke-static {p1, p2}, LZ7/e$c;->g(ZZ)LZ7/e$c;

    move-result-object p1

    iput-object p1, p0, LZ7/e;->g0:LZ7/e$c;

    return-void
.end method

.method public L()Z
    .locals 1

    iget-object v0, p0, LZ7/e;->g0:LZ7/e$c;

    iget-boolean v0, v0, LZ7/e$c;->D:Z

    return v0
.end method

.method protected bridge synthetic U0(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LR7/p;
    .locals 0

    invoke-virtual/range {p0 .. p6}, LZ7/e;->z1(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LZ7/e;

    move-result-object p1

    return-object p1
.end method

.method public Z0()Z
    .locals 1

    iget-object v0, p0, LZ7/e;->g0:LZ7/e$c;

    iget-boolean v0, v0, LZ7/e$c;->C:Z

    return v0
.end method

.method public bridge synthetic n0(LF8/E;Ljava/util/List;LF8/E;Li7/u;)LZ7/a;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LZ7/e;->A1(LF8/E;Ljava/util/List;LF8/E;Li7/u;)LZ7/e;

    move-result-object p1

    return-object p1
.end method

.method public x1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;Ljava/util/Map;)LR7/G;
    .locals 1

    .prologue
    if-nez p3, :cond_0

    const/16 v0, 0x9

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_0
    if-nez p4, :cond_1

    const/16 v0, 0xa

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_1
    if-nez p5, :cond_2

    const/16 v0, 0xb

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_2
    if-nez p8, :cond_3

    const/16 v0, 0xc

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_3
    invoke-super/range {p0 .. p9}, LR7/G;->x1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;Ljava/util/Map;)LR7/G;

    move-result-object p1

    sget-object p2, LM8/p;->a:LM8/p;

    invoke-virtual {p2, p1}, LM8/b;->a(LO7/y;)LM8/g;

    move-result-object p2

    invoke-virtual {p2}, LM8/g;->a()Z

    move-result p2

    invoke-virtual {p0, p2}, LR7/p;->o1(Z)V

    if-nez p1, :cond_4

    const/16 p2, 0xd

    invoke-static {p2}, LZ7/e;->M(I)V

    :cond_4
    return-object p1
.end method

.method protected z1(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LZ7/e;
    .locals 9

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xe

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_0
    if-nez p3, :cond_1

    const/16 v0, 0xf

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_1
    if-nez p5, :cond_2

    const/16 v0, 0x10

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_2
    if-nez p6, :cond_3

    const/16 v0, 0x11

    invoke-static {v0}, LZ7/e;->M(I)V

    :cond_3
    new-instance v0, LZ7/e;

    move-object v3, p2

    check-cast v3, LO7/Z;

    if-eqz p4, :cond_4

    :goto_0
    move-object v5, p4

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LR7/j;->getName()Ln8/f;

    move-result-object p4

    goto :goto_0

    :goto_1
    iget-boolean v8, p0, LZ7/e;->h0:Z

    move-object v1, v0

    move-object v2, p1

    move-object v4, p5

    move-object v6, p3

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, LZ7/e;-><init>(LO7/m;LO7/Z;LP7/g;Ln8/f;LO7/b$a;LO7/a0;Z)V

    invoke-virtual {p0}, LZ7/e;->Z0()Z

    move-result p1

    invoke-virtual {p0}, LZ7/e;->L()Z

    move-result p2

    invoke-virtual {v0, p1, p2}, LZ7/e;->B1(ZZ)V

    return-object v0
.end method
