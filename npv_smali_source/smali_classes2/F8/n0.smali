.class public LF8/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/n0$d;,
        LF8/n0$c;
    }
.end annotation


# static fields
.field public static final b:LF8/n0;


# instance fields
.field private final a:LF8/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LF8/l0;->b:LF8/l0;

    invoke-static {v0}, LF8/n0;->g(LF8/l0;)LF8/n0;

    move-result-object v0

    sput-object v0, LF8/n0;->b:LF8/n0;

    return-void
.end method

.method protected constructor <init>(LF8/l0;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x7

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF8/n0;->a:LF8/l0;

    return-void
.end method

.method private static synthetic a(I)V
    .locals 13

    .prologue
    const/16 v0, 0x25

    const/16 v1, 0x22

    const/16 v2, 0x8

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq p0, v3, :cond_0

    if-eq p0, v4, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    packed-switch p0, :pswitch_data_3

    const-string v5, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    :pswitch_0
    const-string v5, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq p0, v3, :cond_1

    if-eq p0, v4, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    packed-switch p0, :pswitch_data_4

    packed-switch p0, :pswitch_data_5

    packed-switch p0, :pswitch_data_6

    packed-switch p0, :pswitch_data_7

    const/4 v6, 0x3

    goto :goto_1

    :cond_1
    :pswitch_1
    move v6, v4

    :goto_1
    new-array v6, v6, [Ljava/lang/Object;

    const-string v7, "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor"

    const/4 v8, 0x0

    packed-switch p0, :pswitch_data_8

    :pswitch_2
    const-string v9, "substitution"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_3
    const-string v9, "projectionKind"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_4
    const-string v9, "typeParameterVariance"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_5
    const-string v9, "annotations"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_6
    const-string v9, "substituted"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_7
    const-string v9, "originalType"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_8
    const-string v9, "originalProjection"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_9
    const-string v9, "typeProjection"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_a
    const-string v9, "howThisTypeIsUsed"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_b
    const-string v9, "type"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_c
    const-string v9, "context"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_d
    const-string v9, "substitutionContext"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_e
    const-string v9, "second"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_f
    const-string v9, "first"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_10
    aput-object v7, v6, v8

    :goto_2
    const-string v8, "safeSubstitute"

    const-string v9, "unsafeSubstitute"

    const-string v10, "projectedTypeForConflictedTypeWithUnsafeVariance"

    const-string v11, "filterOutUnsafeVariance"

    const-string v12, "combine"

    if-eq p0, v3, :cond_6

    if-eq p0, v4, :cond_5

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    packed-switch p0, :pswitch_data_9

    packed-switch p0, :pswitch_data_a

    packed-switch p0, :pswitch_data_b

    packed-switch p0, :pswitch_data_c

    aput-object v7, v6, v3

    goto :goto_3

    :pswitch_11
    aput-object v10, v6, v3

    goto :goto_3

    :pswitch_12
    aput-object v9, v6, v3

    goto :goto_3

    :pswitch_13
    aput-object v8, v6, v3

    goto :goto_3

    :cond_2
    :pswitch_14
    aput-object v12, v6, v3

    goto :goto_3

    :cond_3
    aput-object v11, v6, v3

    goto :goto_3

    :cond_4
    const-string v7, "getSubstitution"

    aput-object v7, v6, v3

    goto :goto_3

    :cond_5
    const-string v7, "replaceWithContravariantApproximatingSubstitution"

    aput-object v7, v6, v3

    goto :goto_3

    :cond_6
    const-string v7, "replaceWithNonApproximatingSubstitution"

    aput-object v7, v6, v3

    :goto_3
    packed-switch p0, :pswitch_data_d

    :pswitch_15
    const-string v7, "create"

    aput-object v7, v6, v4

    goto :goto_4

    :pswitch_16
    aput-object v12, v6, v4

    goto :goto_4

    :pswitch_17
    aput-object v11, v6, v4

    goto :goto_4

    :pswitch_18
    aput-object v10, v6, v4

    goto :goto_4

    :pswitch_19
    aput-object v9, v6, v4

    goto :goto_4

    :pswitch_1a
    const-string v7, "substituteWithoutApproximation"

    aput-object v7, v6, v4

    goto :goto_4

    :pswitch_1b
    const-string v7, "substitute"

    aput-object v7, v6, v4

    goto :goto_4

    :pswitch_1c
    aput-object v8, v6, v4

    goto :goto_4

    :pswitch_1d
    const-string v7, "<init>"

    aput-object v7, v6, v4

    goto :goto_4

    :pswitch_1e
    const-string v7, "createChainedSubstitutor"

    aput-object v7, v6, v4

    :goto_4
    :pswitch_1f
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    if-eq p0, v3, :cond_7

    if-eq p0, v4, :cond_7

    if-eq p0, v2, :cond_7

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    packed-switch p0, :pswitch_data_e

    packed-switch p0, :pswitch_data_f

    packed-switch p0, :pswitch_data_10

    packed-switch p0, :pswitch_data_11

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    :pswitch_20
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x13
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1d
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x28
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0xb
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x13
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x1d
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x28
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x1
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_2
        :pswitch_10
        :pswitch_b
        :pswitch_a
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_7
        :pswitch_6
        :pswitch_8
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_5
        :pswitch_10
        :pswitch_4
        :pswitch_9
        :pswitch_10
        :pswitch_4
        :pswitch_3
        :pswitch_10
        :pswitch_10
        :pswitch_10
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0xb
        :pswitch_13
        :pswitch_13
        :pswitch_13
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x13
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x1d
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
    .end packed-switch

    :pswitch_data_c
    .packed-switch 0x28
        :pswitch_14
        :pswitch_14
        :pswitch_14
    .end packed-switch

    :pswitch_data_d
    .packed-switch 0x1
        :pswitch_1f
        :pswitch_1f
        :pswitch_1e
        :pswitch_1e
        :pswitch_15
        :pswitch_15
        :pswitch_1d
        :pswitch_1f
        :pswitch_1c
        :pswitch_1c
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_17
        :pswitch_1f
        :pswitch_16
        :pswitch_16
        :pswitch_1f
        :pswitch_16
        :pswitch_16
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
    .end packed-switch

    :pswitch_data_e
    .packed-switch 0xb
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_f
    .packed-switch 0x13
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_10
    .packed-switch 0x1d
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_11
    .packed-switch 0x28
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch
.end method

.method private static b(ILF8/i0;LF8/l0;)V
    .locals 2

    .prologue
    const/16 v0, 0x64

    if-gt p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Recursion too deep. Most likely infinite loop while substituting "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LF8/n0;->o(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "; substitution: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, LF8/n0;->o(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(LF8/u0;LF8/i0;)LF8/u0;
    .locals 1

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x23

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x24

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_1
    invoke-interface {p1}, LF8/i0;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, LF8/u0;->I:LF8/u0;

    if-nez p0, :cond_2

    const/16 p1, 0x25

    invoke-static {p1}, LF8/n0;->a(I)V

    :cond_2
    return-object p0

    :cond_3
    invoke-interface {p1}, LF8/i0;->a()LF8/u0;

    move-result-object p1

    invoke-static {p0, p1}, LF8/n0;->d(LF8/u0;LF8/u0;)LF8/u0;

    move-result-object p0

    return-object p0
.end method

.method public static d(LF8/u0;LF8/u0;)LF8/u0;
    .locals 3

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x26

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x27

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_1
    sget-object v0, LF8/u0;->G:LF8/u0;

    if-ne p0, v0, :cond_3

    if-nez p1, :cond_2

    const/16 p0, 0x28

    invoke-static {p0}, LF8/n0;->a(I)V

    :cond_2
    return-object p1

    :cond_3
    if-ne p1, v0, :cond_5

    if-nez p0, :cond_4

    const/16 p1, 0x29

    invoke-static {p1}, LF8/n0;->a(I)V

    :cond_4
    return-object p0

    :cond_5
    if-ne p0, p1, :cond_7

    if-nez p1, :cond_6

    const/16 p0, 0x2a

    invoke-static {p0}, LF8/n0;->a(I)V

    :cond_6
    return-object p1

    :cond_7
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Variance conflict: type parameter variance \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' and projection kind \'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' cannot be combined"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method private static e(LF8/u0;LF8/u0;)LF8/n0$d;
    .locals 2

    .prologue
    sget-object v0, LF8/u0;->H:LF8/u0;

    if-ne p0, v0, :cond_0

    sget-object v1, LF8/u0;->I:LF8/u0;

    if-ne p1, v1, :cond_0

    sget-object p0, LF8/n0$d;->E:LF8/n0$d;

    return-object p0

    :cond_0
    sget-object v1, LF8/u0;->I:LF8/u0;

    if-ne p0, v1, :cond_1

    if-ne p1, v0, :cond_1

    sget-object p0, LF8/n0$d;->D:LF8/n0$d;

    return-object p0

    :cond_1
    sget-object p0, LF8/n0$d;->C:LF8/n0$d;

    return-object p0
.end method

.method public static f(LF8/E;)LF8/n0;
    .locals 1

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x6

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_0
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object p0

    invoke-static {v0, p0}, LF8/f0;->i(LF8/e0;Ljava/util/List;)LF8/l0;

    move-result-object p0

    invoke-static {p0}, LF8/n0;->g(LF8/l0;)LF8/n0;

    move-result-object p0

    return-object p0
.end method

.method public static g(LF8/l0;)LF8/n0;
    .locals 1

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_0
    new-instance v0, LF8/n0;

    invoke-direct {v0, p0}, LF8/n0;-><init>(LF8/l0;)V

    return-object v0
.end method

.method public static h(LF8/l0;LF8/l0;)LF8/n0;
    .locals 1

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x4

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_1
    invoke-static {p0, p1}, LF8/t;->i(LF8/l0;LF8/l0;)LF8/l0;

    move-result-object p0

    invoke-static {p0}, LF8/n0;->g(LF8/l0;)LF8/n0;

    move-result-object p0

    return-object p0
.end method

.method private static i(LP7/g;)LP7/g;
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x21

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_0
    sget-object v0, LL7/j$a;->Q:Ln8/c;

    invoke-interface {p0, v0}, LP7/g;->H(Ln8/c;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object p0

    :cond_1
    new-instance v0, LP7/l;

    new-instance v1, LF8/n0$a;

    invoke-direct {v1}, LF8/n0$a;-><init>()V

    invoke-direct {v0, p0, v1}, LP7/l;-><init>(LP7/g;Lx7/l;)V

    return-object v0
.end method

.method private static l(LF8/E;LF8/i0;LO7/f0;LF8/i0;)LF8/i0;
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x1a

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x1b

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_1
    if-nez p3, :cond_2

    const/16 v0, 0x1c

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_2
    invoke-virtual {p0}, LF8/E;->k()LP7/g;

    move-result-object p0

    sget-object v0, LL7/j$a;->Q:Ln8/c;

    invoke-interface {p0, v0}, LP7/g;->H(Ln8/c;)Z

    move-result p0

    if-nez p0, :cond_4

    if-nez p1, :cond_3

    const/16 p0, 0x1d

    invoke-static {p0}, LF8/n0;->a(I)V

    :cond_3
    return-object p1

    :cond_4
    invoke-interface {p1}, LF8/i0;->getType()LF8/E;

    move-result-object p0

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    instance-of v0, p0, LG8/j;

    if-nez v0, :cond_5

    return-object p1

    :cond_5
    check-cast p0, LG8/j;

    invoke-virtual {p0}, LG8/j;->a()LF8/i0;

    move-result-object p0

    invoke-interface {p0}, LF8/i0;->a()LF8/u0;

    move-result-object v0

    invoke-interface {p3}, LF8/i0;->a()LF8/u0;

    move-result-object p3

    invoke-static {p3, v0}, LF8/n0;->e(LF8/u0;LF8/u0;)LF8/n0$d;

    move-result-object p3

    sget-object v1, LF8/n0$d;->E:LF8/n0$d;

    if-ne p3, v1, :cond_6

    new-instance p1, LF8/k0;

    invoke-interface {p0}, LF8/i0;->getType()LF8/E;

    move-result-object p0

    invoke-direct {p1, p0}, LF8/k0;-><init>(LF8/E;)V

    return-object p1

    :cond_6
    if-nez p2, :cond_7

    return-object p1

    :cond_7
    invoke-interface {p2}, LO7/f0;->s()LF8/u0;

    move-result-object p2

    invoke-static {p2, v0}, LF8/n0;->e(LF8/u0;LF8/u0;)LF8/n0$d;

    move-result-object p2

    if-ne p2, v1, :cond_8

    new-instance p1, LF8/k0;

    invoke-interface {p0}, LF8/i0;->getType()LF8/E;

    move-result-object p0

    invoke-direct {p1, p0}, LF8/k0;-><init>(LF8/E;)V

    :cond_8
    return-object p1
.end method

.method private static o(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .prologue
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, LP8/d;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Exception while computing toString(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0
.end method

.method private r(LF8/i0;I)LF8/i0;
    .locals 4

    .prologue
    invoke-interface {p1}, LF8/i0;->getType()LF8/E;

    move-result-object v0

    invoke-interface {p1}, LF8/i0;->a()LF8/u0;

    move-result-object v1

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v2

    invoke-interface {v2}, LF8/e0;->w()LO7/h;

    move-result-object v2

    instance-of v2, v2, LO7/f0;

    if-eqz v2, :cond_0

    return-object p1

    :cond_0
    invoke-static {v0}, LF8/Q;->b(LF8/E;)LF8/M;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LF8/n0;->m()LF8/n0;

    move-result-object v2

    sget-object v3, LF8/u0;->G:LF8/u0;

    invoke-virtual {v2, p1, v3}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v2

    invoke-interface {v2}, LF8/e0;->x()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v3

    invoke-direct {p0, v2, v3, p2}, LF8/n0;->s(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;

    move-result-object p2

    iget-object v2, p0, LF8/n0;->a:LF8/l0;

    invoke-virtual {v0}, LF8/E;->k()LP7/g;

    move-result-object v3

    invoke-virtual {v2, v3}, LF8/l0;->d(LP7/g;)LP7/g;

    move-result-object v2

    invoke-static {v0, p2, v2}, LF8/m0;->b(LF8/E;Ljava/util/List;LP7/g;)LF8/E;

    move-result-object p2

    instance-of v0, p2, LF8/M;

    if-eqz v0, :cond_2

    instance-of v0, p1, LF8/M;

    if-eqz v0, :cond_2

    check-cast p2, LF8/M;

    check-cast p1, LF8/M;

    invoke-static {p2, p1}, LF8/Q;->j(LF8/M;LF8/M;)LF8/M;

    move-result-object p2

    :cond_2
    new-instance p1, LF8/k0;

    invoke-direct {p1, v1, p2}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object p1
.end method

.method private s(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;
    .locals 10

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_4

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/f0;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF8/i0;

    const/4 v5, 0x1

    add-int/lit8 v6, p3, 0x1

    invoke-direct {p0, v4, v3, v6}, LF8/n0;->u(LF8/i0;LO7/f0;I)LF8/i0;

    move-result-object v6

    sget-object v7, LF8/n0$b;->a:[I

    invoke-interface {v3}, LO7/f0;->s()LF8/u0;

    move-result-object v8

    invoke-interface {v6}, LF8/i0;->a()LF8/u0;

    move-result-object v9

    invoke-static {v8, v9}, LF8/n0;->e(LF8/u0;LF8/u0;)LF8/n0$d;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v7, v7, v8

    if-eq v7, v5, :cond_1

    const/4 v8, 0x2

    if-eq v7, v8, :cond_1

    const/4 v8, 0x3

    if-eq v7, v8, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v3}, LO7/f0;->s()LF8/u0;

    move-result-object v3

    sget-object v7, LF8/u0;->G:LF8/u0;

    if-eq v3, v7, :cond_2

    invoke-interface {v6}, LF8/i0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v3, LF8/k0;

    invoke-interface {v6}, LF8/i0;->getType()LF8/E;

    move-result-object v6

    invoke-direct {v3, v7, v6}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    move-object v6, v3

    goto :goto_1

    :cond_1
    invoke-static {v3}, LF8/q0;->s(LO7/f0;)LF8/i0;

    move-result-object v6

    :cond_2
    :goto_1
    if-eq v6, v4, :cond_3

    move v2, v5

    :cond_3
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-nez v2, :cond_5

    return-object p2

    :cond_5
    return-object v0
.end method

.method private u(LF8/i0;LO7/f0;I)LF8/i0;
    .locals 7

    .prologue
    const/4 v0, 0x2

    const/4 v1, 0x1

    if-nez p1, :cond_0

    const/16 v2, 0x12

    invoke-static {v2}, LF8/n0;->a(I)V

    :cond_0
    iget-object v2, p0, LF8/n0;->a:LF8/l0;

    invoke-static {p3, p1, v2}, LF8/n0;->b(ILF8/i0;LF8/l0;)V

    invoke-interface {p1}, LF8/i0;->b()Z

    move-result v2

    if-eqz v2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {p1}, LF8/i0;->getType()LF8/E;

    move-result-object v2

    instance-of v3, v2, LF8/r0;

    if-eqz v3, :cond_3

    check-cast v2, LF8/r0;

    invoke-interface {v2}, LF8/r0;->O0()LF8/t0;

    move-result-object v0

    invoke-interface {v2}, LF8/r0;->M()LF8/E;

    move-result-object v2

    new-instance v3, LF8/k0;

    invoke-interface {p1}, LF8/i0;->a()LF8/u0;

    move-result-object v4

    invoke-direct {v3, v4, v0}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    add-int/2addr p3, v1

    invoke-direct {p0, v3, p2, p3}, LF8/n0;->u(LF8/i0;LO7/f0;I)LF8/i0;

    move-result-object p2

    invoke-interface {p2}, LF8/i0;->b()Z

    move-result p3

    if-eqz p3, :cond_2

    return-object p2

    :cond_2
    invoke-interface {p1}, LF8/i0;->a()LF8/u0;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object p1

    invoke-interface {p2}, LF8/i0;->getType()LF8/E;

    move-result-object p3

    invoke-virtual {p3}, LF8/E;->Z0()LF8/t0;

    move-result-object p3

    invoke-static {p3, p1}, LF8/s0;->d(LF8/t0;LF8/E;)LF8/t0;

    move-result-object p1

    new-instance p3, LF8/k0;

    invoke-interface {p2}, LF8/i0;->a()LF8/u0;

    move-result-object p2

    invoke-direct {p3, p2, p1}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object p3

    :cond_3
    invoke-static {v2}, LF8/u;->a(LF8/E;)Z

    move-result v3

    if-nez v3, :cond_11

    invoke-virtual {v2}, LF8/E;->Z0()LF8/t0;

    move-result-object v3

    instance-of v3, v3, LF8/L;

    if-eqz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    iget-object v3, p0, LF8/n0;->a:LF8/l0;

    invoke-virtual {v3, v2}, LF8/l0;->e(LF8/E;)LF8/i0;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-static {v2, v3, p2, p1}, LF8/n0;->l(LF8/E;LF8/i0;LO7/f0;LF8/i0;)LF8/i0;

    move-result-object v3

    goto :goto_0

    :cond_5
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, LF8/i0;->a()LF8/u0;

    move-result-object v4

    if-nez v3, :cond_7

    invoke-static {v2}, LF8/B;->b(LF8/E;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-static {v2}, LF8/c0;->b(LF8/E;)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-static {v2}, LF8/B;->a(LF8/E;)LF8/y;

    move-result-object v0

    new-instance v2, LF8/k0;

    invoke-virtual {v0}, LF8/y;->e1()LF8/M;

    move-result-object v3

    invoke-direct {v2, v4, v3}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    add-int/2addr p3, v1

    invoke-direct {p0, v2, p2, p3}, LF8/n0;->u(LF8/i0;LO7/f0;I)LF8/i0;

    move-result-object v1

    new-instance v2, LF8/k0;

    invoke-virtual {v0}, LF8/y;->f1()LF8/M;

    move-result-object v3

    invoke-direct {v2, v4, v3}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    invoke-direct {p0, v2, p2, p3}, LF8/n0;->u(LF8/i0;LO7/f0;I)LF8/i0;

    move-result-object p2

    invoke-interface {v1}, LF8/i0;->a()LF8/u0;

    move-result-object p3

    invoke-interface {v1}, LF8/i0;->getType()LF8/E;

    move-result-object v2

    invoke-virtual {v0}, LF8/y;->e1()LF8/M;

    move-result-object v3

    if-ne v2, v3, :cond_6

    invoke-interface {p2}, LF8/i0;->getType()LF8/E;

    move-result-object v2

    invoke-virtual {v0}, LF8/y;->f1()LF8/M;

    move-result-object v0

    if-ne v2, v0, :cond_6

    return-object p1

    :cond_6
    invoke-interface {v1}, LF8/i0;->getType()LF8/E;

    move-result-object p1

    invoke-static {p1}, LF8/m0;->a(LF8/E;)LF8/M;

    move-result-object p1

    invoke-interface {p2}, LF8/i0;->getType()LF8/E;

    move-result-object p2

    invoke-static {p2}, LF8/m0;->a(LF8/E;)LF8/M;

    move-result-object p2

    invoke-static {p1, p2}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object p1

    new-instance p2, LF8/k0;

    invoke-direct {p2, p3, p1}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object p2

    :cond_7
    invoke-static {v2}, LL7/g;->n0(LF8/E;)Z

    move-result p2

    if-nez p2, :cond_11

    invoke-static {v2}, LF8/G;->a(LF8/E;)Z

    move-result p2

    if-eqz p2, :cond_8

    goto/16 :goto_3

    :cond_8
    if-eqz v3, :cond_10

    invoke-interface {v3}, LF8/i0;->a()LF8/u0;

    move-result-object p1

    invoke-static {v4, p1}, LF8/n0;->e(LF8/u0;LF8/u0;)LF8/n0$d;

    move-result-object p1

    invoke-static {v2}, Ls8/d;->d(LF8/E;)Z

    move-result p2

    if-nez p2, :cond_b

    sget-object p2, LF8/n0$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p2, p2, p3

    if-eq p2, v1, :cond_a

    if-eq p2, v0, :cond_9

    goto :goto_1

    :cond_9
    new-instance p1, LF8/k0;

    sget-object p2, LF8/u0;->I:LF8/u0;

    invoke-virtual {v2}, LF8/E;->W0()LF8/e0;

    move-result-object p3

    invoke-interface {p3}, LF8/e0;->t()LL7/g;

    move-result-object p3

    invoke-virtual {p3}, LL7/g;->I()LF8/M;

    move-result-object p3

    invoke-direct {p1, p2, p3}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object p1

    :cond_a
    new-instance p1, LF8/n0$c;

    const-string p2, "Out-projection in in-position"

    invoke-direct {p1, p2}, LF8/n0$c;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    :goto_1
    invoke-static {v2}, LF8/c0;->a(LF8/E;)LF8/m;

    move-result-object p2

    invoke-interface {v3}, LF8/i0;->b()Z

    move-result p3

    if-eqz p3, :cond_c

    return-object v3

    :cond_c
    if-eqz p2, :cond_d

    invoke-interface {v3}, LF8/i0;->getType()LF8/E;

    move-result-object p3

    invoke-interface {p2, p3}, LF8/m;->Q(LF8/E;)LF8/E;

    move-result-object p2

    goto :goto_2

    :cond_d
    invoke-interface {v3}, LF8/i0;->getType()LF8/E;

    move-result-object p2

    invoke-virtual {v2}, LF8/E;->X0()Z

    move-result p3

    invoke-static {p2, p3}, LF8/q0;->q(LF8/E;Z)LF8/E;

    move-result-object p2

    :goto_2
    invoke-virtual {v2}, LF8/E;->k()LP7/g;

    move-result-object p3

    invoke-interface {p3}, LP7/g;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_e

    iget-object p3, p0, LF8/n0;->a:LF8/l0;

    invoke-virtual {v2}, LF8/E;->k()LP7/g;

    move-result-object v2

    invoke-virtual {p3, v2}, LF8/l0;->d(LP7/g;)LP7/g;

    move-result-object p3

    invoke-static {p3}, LF8/n0;->i(LP7/g;)LP7/g;

    move-result-object p3

    new-instance v2, LP7/k;

    invoke-virtual {p2}, LF8/E;->k()LP7/g;

    move-result-object v5

    new-array v0, v0, [LP7/g;

    const/4 v6, 0x0

    aput-object v5, v0, v6

    aput-object p3, v0, v1

    invoke-direct {v2, v0}, LP7/k;-><init>([LP7/g;)V

    invoke-static {p2, v2}, LK8/a;->x(LF8/E;LP7/g;)LF8/E;

    move-result-object p2

    :cond_e
    sget-object p3, LF8/n0$d;->C:LF8/n0$d;

    if-ne p1, p3, :cond_f

    invoke-interface {v3}, LF8/i0;->a()LF8/u0;

    move-result-object p1

    invoke-static {v4, p1}, LF8/n0;->d(LF8/u0;LF8/u0;)LF8/u0;

    move-result-object v4

    :cond_f
    new-instance p1, LF8/k0;

    invoke-direct {p1, v4, p2}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object p1

    :cond_10
    invoke-direct {p0, p1, p3}, LF8/n0;->r(LF8/i0;I)LF8/i0;

    move-result-object p1

    if-nez p1, :cond_11

    const/16 p2, 0x19

    invoke-static {p2}, LF8/n0;->a(I)V

    :cond_11
    :goto_3
    return-object p1
.end method


# virtual methods
.method public j()LF8/l0;
    .locals 2

    .prologue
    iget-object v0, p0, LF8/n0;->a:LF8/l0;

    if-nez v0, :cond_0

    const/16 v1, 0x8

    invoke-static {v1}, LF8/n0;->a(I)V

    :cond_0
    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, LF8/n0;->a:LF8/l0;

    invoke-virtual {v0}, LF8/l0;->f()Z

    move-result v0

    return v0
.end method

.method public m()LF8/n0;
    .locals 5

    .prologue
    iget-object v0, p0, LF8/n0;->a:LF8/l0;

    instance-of v1, v0, LF8/C;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LF8/l0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LF8/n0;

    new-instance v1, LF8/C;

    iget-object v2, p0, LF8/n0;->a:LF8/l0;

    check-cast v2, LF8/C;

    invoke-virtual {v2}, LF8/C;->j()[LO7/f0;

    move-result-object v2

    iget-object v3, p0, LF8/n0;->a:LF8/l0;

    check-cast v3, LF8/C;

    invoke-virtual {v3}, LF8/C;->i()[LF8/i0;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, LF8/C;-><init>([LO7/f0;[LF8/i0;Z)V

    invoke-direct {v0, v1}, LF8/n0;-><init>(LF8/l0;)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public n(LF8/E;LF8/u0;)LF8/E;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x9

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0xa

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_1
    invoke-virtual {p0}, LF8/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p1, :cond_2

    const/16 p2, 0xb

    invoke-static {p2}, LF8/n0;->a(I)V

    :cond_2
    return-object p1

    :cond_3
    :try_start_0
    new-instance v0, LF8/k0;

    invoke-direct {v0, p2, p1}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-direct {p0, v0, p1, p2}, LF8/n0;->u(LF8/i0;LO7/f0;I)LF8/i0;

    move-result-object p1

    invoke-interface {p1}, LF8/i0;->getType()LF8/E;

    move-result-object p1
    :try_end_0
    .catch LF8/n0$c; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_4

    const/16 p2, 0xc

    invoke-static {p2}, LF8/n0;->a(I)V

    :cond_4
    return-object p1

    :catch_0
    move-exception p1

    sget-object p2, LH8/j;->f0:LH8/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object p1

    if-nez p1, :cond_5

    const/16 p2, 0xd

    invoke-static {p2}, LF8/n0;->a(I)V

    :cond_5
    return-object p1
.end method

.method public p(LF8/E;LF8/u0;)LF8/E;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0xe

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0xf

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_1
    new-instance v0, LF8/k0;

    invoke-virtual {p0}, LF8/n0;->j()LF8/l0;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, LF8/l0;->g(LF8/E;LF8/u0;)LF8/E;

    move-result-object p1

    invoke-direct {v0, p2, p1}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    invoke-virtual {p0, v0}, LF8/n0;->q(LF8/i0;)LF8/i0;

    move-result-object p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    invoke-interface {p1}, LF8/i0;->getType()LF8/E;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public q(LF8/i0;)LF8/i0;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x10

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_0
    invoke-virtual {p0, p1}, LF8/n0;->t(LF8/i0;)LF8/i0;

    move-result-object p1

    iget-object v0, p0, LF8/n0;->a:LF8/l0;

    invoke-virtual {v0}, LF8/l0;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LF8/n0;->a:LF8/l0;

    invoke-virtual {v0}, LF8/l0;->b()Z

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    iget-object v0, p0, LF8/n0;->a:LF8/l0;

    invoke-virtual {v0}, LF8/l0;->b()Z

    move-result v0

    invoke-static {p1, v0}, LL8/b;->c(LF8/i0;Z)LF8/i0;

    move-result-object p1

    return-object p1
.end method

.method public t(LF8/i0;)LF8/i0;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x11

    invoke-static {v0}, LF8/n0;->a(I)V

    :cond_0
    invoke-virtual {p0}, LF8/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-direct {p0, p1, v1, v0}, LF8/n0;->u(LF8/i0;LO7/f0;I)LF8/i0;

    move-result-object p1
    :try_end_0
    .catch LF8/n0$c; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v1
.end method
