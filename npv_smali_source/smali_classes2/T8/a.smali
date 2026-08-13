.class public final LT8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT8/a$a;
    }
.end annotation


# static fields
.field public static final D:LT8/a$a;

.field private static final E:J

.field private static final F:J

.field private static final G:J


# instance fields
.field private final C:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT8/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT8/a$a;-><init>(Ly7/k;)V

    sput-object v0, LT8/a;->D:LT8/a$a;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, LT8/a;->s(J)J

    move-result-wide v0

    sput-wide v0, LT8/a;->E:J

    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    invoke-static {v0, v1}, LT8/c;->b(J)J

    move-result-wide v0

    sput-wide v0, LT8/a;->F:J

    const-wide v0, -0x3fffffffffffffffL    # -2.0000000000000004

    invoke-static {v0, v1}, LT8/c;->b(J)J

    move-result-wide v0

    sput-wide v0, LT8/a;->G:J

    return-void
.end method

.method private synthetic constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LT8/a;->C:J

    return-void
.end method

.method public static final A(J)J
    .locals 1

    sget-object v0, LT8/d;->H:LT8/d;

    invoke-static {p0, p1, v0}, LT8/a;->Q(JLT8/d;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final B(J)J
    .locals 1

    sget-object v0, LT8/d;->G:LT8/d;

    invoke-static {p0, p1, v0}, LT8/a;->Q(JLT8/d;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final C(J)I
    .locals 2

    .prologue
    invoke-static {p0, p1}, LT8/a;->L(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LT8/a;->A(J)J

    move-result-wide p0

    const/16 v0, 0x3c

    int-to-long v0, v0

    rem-long/2addr p0, v0

    long-to-int p0, p0

    :goto_0
    return p0
.end method

.method public static final D(J)I
    .locals 2

    .prologue
    invoke-static {p0, p1}, LT8/a;->L(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_1

    :cond_0
    invoke-static {p0, p1}, LT8/a;->J(J)Z

    move-result v0

    invoke-static {p0, p1}, LT8/a;->G(J)J

    move-result-wide p0

    if-eqz v0, :cond_1

    const/16 v0, 0x3e8

    int-to-long v0, v0

    rem-long/2addr p0, v0

    invoke-static {p0, p1}, LT8/c;->f(J)J

    move-result-wide p0

    :goto_0
    long-to-int p0, p0

    goto :goto_1

    :cond_1
    const v0, 0x3b9aca00

    int-to-long v0, v0

    rem-long/2addr p0, v0

    goto :goto_0

    :goto_1
    return p0
.end method

.method public static final E(J)I
    .locals 2

    .prologue
    invoke-static {p0, p1}, LT8/a;->L(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LT8/a;->B(J)J

    move-result-wide p0

    const/16 v0, 0x3c

    int-to-long v0, v0

    rem-long/2addr p0, v0

    long-to-int p0, p0

    :goto_0
    return p0
.end method

.method private static final F(J)LT8/d;
    .locals 0

    .prologue
    invoke-static {p0, p1}, LT8/a;->K(J)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, LT8/d;->D:LT8/d;

    goto :goto_0

    :cond_0
    sget-object p0, LT8/d;->F:LT8/d;

    :goto_0
    return-object p0
.end method

.method private static final G(J)J
    .locals 1

    const/4 v0, 0x1

    shr-long/2addr p0, v0

    return-wide p0
.end method

.method public static H(J)I
    .locals 0

    invoke-static {p0, p1}, Lr/r;->a(J)I

    move-result p0

    return p0
.end method

.method public static final I(J)Z
    .locals 0

    invoke-static {p0, p1}, LT8/a;->L(J)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final J(J)Z
    .locals 0

    .prologue
    long-to-int p0, p0

    const/4 p1, 0x1

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private static final K(J)Z
    .locals 0

    .prologue
    long-to-int p0, p0

    const/4 p1, 0x1

    and-int/2addr p0, p1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static final L(J)Z
    .locals 2

    .prologue
    sget-wide v0, LT8/a;->F:J

    cmp-long v0, p0, v0

    if-eqz v0, :cond_1

    sget-wide v0, LT8/a;->G:J

    cmp-long p0, p0, v0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final M(J)Z
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final N(J)Z
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final O(JJ)J
    .locals 7

    .prologue
    invoke-static {p0, p1}, LT8/a;->L(J)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2, p3}, LT8/a;->I(J)Z

    move-result v0

    if-nez v0, :cond_1

    xor-long/2addr p2, p0

    const-wide/16 v0, 0x0

    cmp-long p2, p2, v0

    if-ltz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Summing infinite durations of different signs yields an undefined result."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-wide p0

    :cond_2
    invoke-static {p2, p3}, LT8/a;->L(J)Z

    move-result v0

    if-eqz v0, :cond_3

    return-wide p2

    :cond_3
    long-to-int v0, p0

    and-int/lit8 v0, v0, 0x1

    long-to-int v1, p2

    and-int/lit8 v1, v1, 0x1

    if-ne v0, v1, :cond_5

    invoke-static {p0, p1}, LT8/a;->G(J)J

    move-result-wide v0

    invoke-static {p2, p3}, LT8/a;->G(J)J

    move-result-wide p2

    add-long/2addr v0, p2

    invoke-static {p0, p1}, LT8/a;->K(J)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {v0, v1}, LT8/c;->e(J)J

    move-result-wide p0

    goto :goto_1

    :cond_4
    invoke-static {v0, v1}, LT8/c;->c(J)J

    move-result-wide p0

    goto :goto_1

    :cond_5
    invoke-static {p0, p1}, LT8/a;->J(J)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p0, p1}, LT8/a;->G(J)J

    move-result-wide v3

    invoke-static {p2, p3}, LT8/a;->G(J)J

    move-result-wide v5

    move-wide v1, p0

    invoke-static/range {v1 .. v6}, LT8/a;->m(JJJ)J

    move-result-wide p0

    goto :goto_1

    :cond_6
    invoke-static {p2, p3}, LT8/a;->G(J)J

    move-result-wide v2

    invoke-static {p0, p1}, LT8/a;->G(J)J

    move-result-wide v4

    move-wide v0, p0

    invoke-static/range {v0 .. v5}, LT8/a;->m(JJJ)J

    move-result-wide p0

    :goto_1
    return-wide p0
.end method

.method public static final P(J)Ljava/lang/String;
    .locals 11

    .prologue
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, LT8/a;->M(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x2d

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    const-string v0, "PT"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, LT8/a;->v(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LT8/a;->y(J)J

    move-result-wide v2

    invoke-static {v0, v1}, LT8/a;->C(J)I

    move-result v4

    invoke-static {v0, v1}, LT8/a;->E(J)I

    move-result v5

    invoke-static {v0, v1}, LT8/a;->D(J)I

    move-result v6

    invoke-static {p0, p1}, LT8/a;->L(J)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide v2, 0x9184e729fffL

    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    const/4 v1, 0x0

    const/4 v7, 0x1

    if-eqz v0, :cond_2

    move v0, v7

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    if-nez v5, :cond_4

    if-eqz v6, :cond_3

    goto :goto_1

    :cond_3
    move v9, v1

    goto :goto_2

    :cond_4
    :goto_1
    move v9, v7

    :goto_2
    if-nez v4, :cond_5

    if-eqz v9, :cond_6

    if-eqz v0, :cond_6

    :cond_5
    move v1, v7

    :cond_6
    if-eqz v0, :cond_7

    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v2, 0x48

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_7
    if-eqz v1, :cond_8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x4d

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_8
    if-nez v9, :cond_9

    if-nez v0, :cond_a

    if-nez v1, :cond_a

    :cond_9
    const-string v7, "S"

    const/4 v9, 0x1

    const/16 v10, 0x9

    move-wide v0, p0

    move-object v2, v8

    move v3, v5

    move v4, v6

    move v5, v10

    move-object v6, v7

    move v7, v9

    invoke-static/range {v0 .. v7}, LT8/a;->n(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V

    :cond_a
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final Q(JLT8/d;)J
    .locals 2

    .prologue
    const-string v0, "unit"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-wide v0, LT8/a;->F:J

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const-wide p0, 0x7fffffffffffffffL

    goto :goto_0

    :cond_0
    sget-wide v0, LT8/a;->G:J

    cmp-long v0, p0, v0

    if-nez v0, :cond_1

    const-wide/high16 p0, -0x8000000000000000L

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, LT8/a;->G(J)J

    move-result-wide v0

    invoke-static {p0, p1}, LT8/a;->F(J)LT8/d;

    move-result-object p0

    invoke-static {v0, v1, p0, p2}, LT8/e;->b(JLT8/d;LT8/d;)J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public static R(J)Ljava/lang/String;
    .locals 14

    .prologue
    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-nez v2, :cond_0

    const-string p0, "0s"

    goto/16 :goto_9

    :cond_0
    sget-wide v2, LT8/a;->F:J

    cmp-long v2, p0, v2

    if-nez v2, :cond_1

    const-string p0, "Infinity"

    goto/16 :goto_9

    :cond_1
    sget-wide v2, LT8/a;->G:J

    cmp-long v2, p0, v2

    if-nez v2, :cond_2

    const-string p0, "-Infinity"

    goto/16 :goto_9

    :cond_2
    invoke-static {p0, p1}, LT8/a;->M(J)Z

    move-result v2

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v2, :cond_3

    const/16 v3, 0x2d

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    invoke-static {p0, p1}, LT8/a;->v(J)J

    move-result-wide v3

    invoke-static {v3, v4}, LT8/a;->x(J)J

    move-result-wide v5

    invoke-static {v3, v4}, LT8/a;->w(J)I

    move-result v7

    invoke-static {v3, v4}, LT8/a;->C(J)I

    move-result v8

    invoke-static {v3, v4}, LT8/a;->E(J)I

    move-result v9

    invoke-static {v3, v4}, LT8/a;->D(J)I

    move-result v10

    cmp-long v0, v5, v0

    const/4 v1, 0x0

    const/4 v12, 0x1

    if-eqz v0, :cond_4

    move v0, v12

    goto :goto_0

    :cond_4
    move v0, v1

    :goto_0
    if-eqz v7, :cond_5

    move v3, v12

    goto :goto_1

    :cond_5
    move v3, v1

    :goto_1
    if-eqz v8, :cond_6

    move v4, v12

    goto :goto_2

    :cond_6
    move v4, v1

    :goto_2
    if-nez v9, :cond_8

    if-eqz v10, :cond_7

    goto :goto_3

    :cond_7
    move v13, v1

    goto :goto_4

    :cond_8
    :goto_3
    move v13, v12

    :goto_4
    if-eqz v0, :cond_9

    invoke-virtual {v11, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v1, v12

    :cond_9
    const/16 v5, 0x20

    if-nez v3, :cond_a

    if-eqz v0, :cond_c

    if-nez v4, :cond_a

    if-eqz v13, :cond_c

    :cond_a
    add-int/lit8 v6, v1, 0x1

    if-lez v1, :cond_b

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_b
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x68

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v1, v6

    :cond_c
    if-nez v4, :cond_d

    if-eqz v13, :cond_f

    if-nez v3, :cond_d

    if-eqz v0, :cond_f

    :cond_d
    add-int/lit8 v6, v1, 0x1

    if-lez v1, :cond_e

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_e
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x6d

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v1, v6

    :cond_f
    if-eqz v13, :cond_15

    add-int/lit8 v13, v1, 0x1

    if-lez v1, :cond_10

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_10
    if-nez v9, :cond_14

    if-nez v0, :cond_14

    if-nez v3, :cond_14

    if-eqz v4, :cond_11

    goto :goto_7

    :cond_11
    const v0, 0xf4240

    if-lt v10, v0, :cond_12

    div-int v6, v10, v0

    rem-int v7, v10, v0

    const-string v9, "ms"

    const/4 v10, 0x0

    const/4 v8, 0x6

    :goto_5
    move-wide v3, p0

    move-object v5, v11

    :goto_6
    invoke-static/range {v3 .. v10}, LT8/a;->n(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V

    goto :goto_8

    :cond_12
    const/16 v0, 0x3e8

    if-lt v10, v0, :cond_13

    div-int/lit16 v6, v10, 0x3e8

    rem-int/lit16 v7, v10, 0x3e8

    const-string v9, "us"

    const/4 v10, 0x0

    const/4 v8, 0x3

    goto :goto_5

    :cond_13
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "ns"

    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_14
    :goto_7
    const-string v0, "s"

    const/4 v1, 0x0

    const/16 v8, 0x9

    move-wide v3, p0

    move-object v5, v11

    move v6, v9

    move v7, v10

    move-object v9, v0

    move v10, v1

    goto :goto_6

    :goto_8
    move v1, v13

    :cond_15
    if-eqz v2, :cond_16

    if-le v1, v12, :cond_16

    const/16 p0, 0x28

    invoke-virtual {v11, v12, p0}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    move-result-object p0

    const/16 p1, 0x29

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_16
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_9
    return-object p0
.end method

.method public static final S(J)J
    .locals 2

    invoke-static {p0, p1}, LT8/a;->G(J)J

    move-result-wide v0

    neg-long v0, v0

    long-to-int p0, p0

    and-int/lit8 p0, p0, 0x1

    invoke-static {v0, v1, p0}, LT8/c;->a(JI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic e()J
    .locals 2

    sget-wide v0, LT8/a;->F:J

    return-wide v0
.end method

.method public static final synthetic g()J
    .locals 2

    sget-wide v0, LT8/a;->G:J

    return-wide v0
.end method

.method public static final synthetic i()J
    .locals 2

    sget-wide v0, LT8/a;->E:J

    return-wide v0
.end method

.method private static final m(JJJ)J
    .locals 6

    .prologue
    invoke-static {p4, p5}, LT8/c;->g(J)J

    move-result-wide p0

    add-long v0, p2, p0

    const-wide p2, -0x431bde82d7aL

    cmp-long p2, p2, v0

    if-gtz p2, :cond_0

    const-wide p2, 0x431bde82d7bL

    cmp-long p2, v0, p2

    if-gez p2, :cond_0

    invoke-static {p0, p1}, LT8/c;->f(J)J

    move-result-wide p0

    sub-long/2addr p4, p0

    invoke-static {v0, v1}, LT8/c;->f(J)J

    move-result-wide p0

    add-long/2addr p0, p4

    invoke-static {p0, p1}, LT8/c;->d(J)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    const-wide v2, -0x3fffffffffffffffL    # -2.0000000000000004

    const-wide v4, 0x3fffffffffffffffL    # 1.9999999999999998

    invoke-static/range {v0 .. v5}, LE7/j;->l(JJJ)J

    move-result-wide p0

    invoke-static {p0, p1}, LT8/c;->b(J)J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method private static final n(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V
    .locals 1

    .prologue
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_4

    const/16 p0, 0x2e

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0x30

    invoke-static {p0, p5, p1}, LS8/r;->B0(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p3

    const/4 p4, -0x1

    add-int/2addr p3, p4

    if-ltz p3, :cond_2

    :goto_0
    add-int/lit8 p5, p3, -0x1

    invoke-interface {p0, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    if-eq v0, p1, :cond_0

    move p4, p3

    goto :goto_1

    :cond_0
    if-gez p5, :cond_1

    goto :goto_1

    :cond_1
    move p3, p5

    goto :goto_0

    :cond_2
    :goto_1
    add-int/lit8 p1, p4, 0x1

    const-string p3, "append(...)"

    const/4 p5, 0x0

    const/4 v0, 0x3

    if-nez p7, :cond_3

    if-ge p1, v0, :cond_3

    invoke-virtual {p2, p0, p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :goto_2
    invoke-static {p2, p3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    add-int/2addr p4, v0

    div-int/2addr p4, v0

    mul-int/2addr p4, v0

    invoke-virtual {p2, p0, p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    :goto_3
    invoke-virtual {p2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static final synthetic o(J)LT8/a;
    .locals 1

    new-instance v0, LT8/a;

    invoke-direct {v0, p0, p1}, LT8/a;-><init>(J)V

    return-object v0
.end method

.method public static r(JJ)I
    .locals 4

    .prologue
    xor-long v0, p0, p2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_2

    long-to-int v0, v0

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    long-to-int v0, p0

    and-int/lit8 v0, v0, 0x1

    long-to-int p2, p2

    and-int/lit8 p2, p2, 0x1

    sub-int/2addr v0, p2

    invoke-static {p0, p1}, LT8/a;->M(J)Z

    move-result p0

    if-eqz p0, :cond_1

    neg-int v0, v0

    :cond_1
    return v0

    :cond_2
    :goto_0
    invoke-static {p0, p1, p2, p3}, Ly7/t;->h(JJ)I

    move-result p0

    return p0
.end method

.method public static s(J)J
    .locals 4

    .prologue
    invoke-static {}, LT8/b;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p0, p1}, LT8/a;->K(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1}, LT8/a;->G(J)J

    move-result-wide v0

    const-wide v2, -0x3ffffffffffa14bfL    # -2.0000000001722644

    cmp-long v2, v2, v0

    if-gtz v2, :cond_0

    const-wide v2, 0x3ffffffffffa14c0L    # 1.999999999913868

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, LT8/a;->G(J)J

    move-result-wide p0

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ns is out of nanoseconds range"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    invoke-static {p0, p1}, LT8/a;->G(J)J

    move-result-wide v0

    const-wide v2, -0x3fffffffffffffffL    # -2.0000000000000004

    cmp-long v2, v2, v0

    if-gtz v2, :cond_3

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    invoke-static {p0, p1}, LT8/a;->G(J)J

    move-result-wide v0

    const-wide v2, -0x431bde82d7aL

    cmp-long v2, v2, v0

    if-gtz v2, :cond_4

    const-wide v2, 0x431bde82d7bL

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, LT8/a;->G(J)J

    move-result-wide p0

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms is denormalized"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, LT8/a;->G(J)J

    move-result-wide p0

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms is out of milliseconds range"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_4
    :goto_0
    return-wide p0
.end method

.method public static t(JLjava/lang/Object;)Z
    .locals 4

    .prologue
    instance-of v0, p2, LT8/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p2, LT8/a;

    invoke-virtual {p2}, LT8/a;->T()J

    move-result-wide v2

    cmp-long p0, p0, v2

    if-eqz p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final u(JJ)Z
    .locals 0

    .prologue
    cmp-long p0, p0, p2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final v(J)J
    .locals 1

    .prologue
    invoke-static {p0, p1}, LT8/a;->M(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, LT8/a;->S(J)J

    move-result-wide p0

    :cond_0
    return-wide p0
.end method

.method public static final w(J)I
    .locals 2

    .prologue
    invoke-static {p0, p1}, LT8/a;->L(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LT8/a;->y(J)J

    move-result-wide p0

    const/16 v0, 0x18

    int-to-long v0, v0

    rem-long/2addr p0, v0

    long-to-int p0, p0

    :goto_0
    return p0
.end method

.method public static final x(J)J
    .locals 1

    sget-object v0, LT8/d;->J:LT8/d;

    invoke-static {p0, p1, v0}, LT8/a;->Q(JLT8/d;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final y(J)J
    .locals 1

    sget-object v0, LT8/d;->I:LT8/d;

    invoke-static {p0, p1, v0}, LT8/a;->Q(JLT8/d;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final z(J)J
    .locals 1

    .prologue
    invoke-static {p0, p1}, LT8/a;->J(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, LT8/a;->I(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, LT8/a;->G(J)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    sget-object v0, LT8/d;->F:LT8/d;

    invoke-static {p0, p1, v0}, LT8/a;->Q(JLT8/d;)J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method


# virtual methods
.method public final synthetic T()J
    .locals 2

    iget-wide v0, p0, LT8/a;->C:J

    return-wide v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, LT8/a;

    invoke-virtual {p1}, LT8/a;->T()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LT8/a;->q(J)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    iget-wide v0, p0, LT8/a;->C:J

    invoke-static {v0, v1, p1}, LT8/a;->t(JLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, LT8/a;->C:J

    invoke-static {v0, v1}, LT8/a;->H(J)I

    move-result v0

    return v0
.end method

.method public q(J)I
    .locals 2

    iget-wide v0, p0, LT8/a;->C:J

    invoke-static {v0, v1, p1, p2}, LT8/a;->r(JJ)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, LT8/a;->C:J

    invoke-static {v0, v1}, LT8/a;->R(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
