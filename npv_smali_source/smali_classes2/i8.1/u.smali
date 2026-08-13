.class public final Li8/u;
.super Lp8/i$d;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/u$b;
    }
.end annotation


# static fields
.field private static final O:Li8/u;

.field public static P:Lp8/r;


# instance fields
.field private final E:Lp8/d;

.field private F:I

.field private G:I

.field private H:I

.field private I:Li8/q;

.field private J:I

.field private K:Li8/q;

.field private L:I

.field private M:B

.field private N:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/u$a;

    invoke-direct {v0}, Li8/u$a;-><init>()V

    sput-object v0, Li8/u;->P:Lp8/r;

    new-instance v0, Li8/u;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/u;-><init>(Z)V

    sput-object v0, Li8/u;->O:Li8/u;

    invoke-direct {v0}, Li8/u;->W()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 9

    .prologue
    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/u;->M:B

    iput v0, p0, Li8/u;->N:I

    invoke-direct {p0}, Li8/u;->W()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_c

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_b

    const/16 v6, 0x10

    if-eq v4, v6, :cond_a

    const/16 v7, 0x1a

    const/4 v8, 0x0

    if-eq v4, v7, :cond_7

    const/16 v7, 0x22

    if-eq v4, v7, :cond_4

    const/16 v6, 0x28

    if-eq v4, v6, :cond_3

    const/16 v5, 0x30

    if-eq v4, v5, :cond_2

    invoke-virtual {p0, p1, v2, p2, v4}, Lp8/i$d;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_2

    :cond_2
    iget v4, p0, Li8/u;->F:I

    or-int/lit8 v4, v4, 0x20

    iput v4, p0, Li8/u;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v4

    iput v4, p0, Li8/u;->L:I

    goto :goto_0

    :cond_3
    iget v4, p0, Li8/u;->F:I

    or-int/2addr v4, v5

    iput v4, p0, Li8/u;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v4

    iput v4, p0, Li8/u;->J:I

    goto :goto_0

    :cond_4
    iget v4, p0, Li8/u;->F:I

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_5

    iget-object v4, p0, Li8/u;->K:Li8/q;

    invoke-virtual {v4}, Li8/q;->B0()Li8/q$c;

    move-result-object v8

    :cond_5
    sget-object v4, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v4, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v4

    check-cast v4, Li8/q;

    iput-object v4, p0, Li8/u;->K:Li8/q;

    if-eqz v8, :cond_6

    invoke-virtual {v8, v4}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v8}, Li8/q$c;->v()Li8/q;

    move-result-object v4

    iput-object v4, p0, Li8/u;->K:Li8/q;

    :cond_6
    iget v4, p0, Li8/u;->F:I

    or-int/2addr v4, v6

    iput v4, p0, Li8/u;->F:I

    goto :goto_0

    :cond_7
    iget v4, p0, Li8/u;->F:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_8

    iget-object v4, p0, Li8/u;->I:Li8/q;

    invoke-virtual {v4}, Li8/q;->B0()Li8/q$c;

    move-result-object v8

    :cond_8
    sget-object v4, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v4, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v4

    check-cast v4, Li8/q;

    iput-object v4, p0, Li8/u;->I:Li8/q;

    if-eqz v8, :cond_9

    invoke-virtual {v8, v4}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v8}, Li8/q$c;->v()Li8/q;

    move-result-object v4

    iput-object v4, p0, Li8/u;->I:Li8/q;

    :cond_9
    iget v4, p0, Li8/u;->F:I

    or-int/2addr v4, v5

    iput v4, p0, Li8/u;->F:I

    goto/16 :goto_0

    :cond_a
    iget v4, p0, Li8/u;->F:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Li8/u;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v4

    iput v4, p0, Li8/u;->H:I

    goto/16 :goto_0

    :cond_b
    iget v4, p0, Li8/u;->F:I

    or-int/2addr v4, v1

    iput v4, p0, Li8/u;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v4

    iput v4, p0, Li8/u;->G:I
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :goto_1
    :try_start_1
    new-instance p2, Lp8/k;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lp8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1

    :goto_2
    invoke-virtual {p1, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/u;->E:Lp8/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/u;->E:Lp8/d;

    throw p1

    :goto_4
    invoke-virtual {p0}, Lp8/i$d;->m()V

    throw p1

    :cond_c
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/u;->E:Lp8/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/u;->E:Lp8/d;

    throw p1

    :goto_5
    invoke-virtual {p0}, Lp8/i$d;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/u;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$c;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i$d;-><init>(Lp8/i$c;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/u;->M:B

    iput v0, p0, Li8/u;->N:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/u;->E:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$c;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/u;-><init>(Lp8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/u;->M:B

    iput p1, p0, Li8/u;->N:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/u;->E:Lp8/d;

    return-void
.end method

.method static synthetic A(Li8/u;I)I
    .locals 0

    iput p1, p0, Li8/u;->G:I

    return p1
.end method

.method static synthetic B(Li8/u;I)I
    .locals 0

    iput p1, p0, Li8/u;->H:I

    return p1
.end method

.method static synthetic C(Li8/u;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/u;->I:Li8/q;

    return-object p1
.end method

.method static synthetic D(Li8/u;I)I
    .locals 0

    iput p1, p0, Li8/u;->J:I

    return p1
.end method

.method static synthetic E(Li8/u;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/u;->K:Li8/q;

    return-object p1
.end method

.method static synthetic F(Li8/u;I)I
    .locals 0

    iput p1, p0, Li8/u;->L:I

    return p1
.end method

.method static synthetic G(Li8/u;I)I
    .locals 0

    iput p1, p0, Li8/u;->F:I

    return p1
.end method

.method static synthetic H(Li8/u;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/u;->E:Lp8/d;

    return-object p0
.end method

.method public static I()Li8/u;
    .locals 1

    sget-object v0, Li8/u;->O:Li8/u;

    return-object v0
.end method

.method private W()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Li8/u;->G:I

    iput v0, p0, Li8/u;->H:I

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v1

    iput-object v1, p0, Li8/u;->I:Li8/q;

    iput v0, p0, Li8/u;->J:I

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v1

    iput-object v1, p0, Li8/u;->K:Li8/q;

    iput v0, p0, Li8/u;->L:I

    return-void
.end method

.method public static X()Li8/u$b;
    .locals 1

    invoke-static {}, Li8/u$b;->t()Li8/u$b;

    move-result-object v0

    return-object v0
.end method

.method public static Y(Li8/u;)Li8/u$b;
    .locals 1

    invoke-static {}, Li8/u;->X()Li8/u$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/u$b;->z(Li8/u;)Li8/u$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public J()Li8/u;
    .locals 1

    sget-object v0, Li8/u;->O:Li8/u;

    return-object v0
.end method

.method public K()I
    .locals 1

    iget v0, p0, Li8/u;->G:I

    return v0
.end method

.method public L()I
    .locals 1

    iget v0, p0, Li8/u;->H:I

    return v0
.end method

.method public M()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/u;->I:Li8/q;

    return-object v0
.end method

.method public N()I
    .locals 1

    iget v0, p0, Li8/u;->J:I

    return v0
.end method

.method public O()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/u;->K:Li8/q;

    return-object v0
.end method

.method public P()I
    .locals 1

    iget v0, p0, Li8/u;->L:I

    return v0
.end method

.method public Q()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/u;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public R()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/u;->F:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public S()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/u;->F:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public T()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/u;->F:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public U()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/u;->F:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public V()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/u;->F:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public Z()Li8/u$b;
    .locals 1

    invoke-static {}, Li8/u;->X()Li8/u$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/u;->J()Li8/u;

    move-result-object v0

    return-object v0
.end method

.method public a0()Li8/u$b;
    .locals 1

    invoke-static {p0}, Li8/u;->Y(Li8/u;)Li8/u$b;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 4

    .prologue
    iget v0, p0, Li8/u;->N:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/u;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/u;->G:I

    invoke-static {v1, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Li8/u;->F:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget v1, p0, Li8/u;->H:I

    invoke-static {v2, v1}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Li8/u;->F:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    const/4 v1, 0x3

    iget-object v3, p0, Li8/u;->I:Li8/q;

    invoke-static {v1, v3}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Li8/u;->F:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_4

    iget-object v1, p0, Li8/u;->K:Li8/q;

    invoke-static {v2, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Li8/u;->F:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x5

    iget v2, p0, Li8/u;->J:I

    invoke-static {v1, v2}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, Li8/u;->F:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    const/4 v1, 0x6

    iget v2, p0, Li8/u;->L:I

    invoke-static {v1, v2}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    invoke-virtual {p0}, Lp8/i$d;->t()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Li8/u;->E:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/u;->N:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/u;->Z()Li8/u$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 3

    .prologue
    iget-byte v0, p0, Li8/u;->M:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Li8/u;->R()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Li8/u;->M:B

    return v2

    :cond_2
    invoke-virtual {p0}, Li8/u;->S()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Li8/u;->M()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_3

    iput-byte v2, p0, Li8/u;->M:B

    return v2

    :cond_3
    invoke-virtual {p0}, Li8/u;->U()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Li8/u;->O()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_4

    iput-byte v2, p0, Li8/u;->M:B

    return v2

    :cond_4
    invoke-virtual {p0}, Lp8/i$d;->s()Z

    move-result v0

    if-nez v0, :cond_5

    iput-byte v2, p0, Li8/u;->M:B

    return v2

    :cond_5
    iput-byte v1, p0, Li8/u;->M:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/u;->a0()Li8/u$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 4

    .prologue
    invoke-virtual {p0}, Li8/u;->b()I

    invoke-virtual {p0}, Lp8/i$d;->y()Lp8/i$d$a;

    move-result-object v0

    iget v1, p0, Li8/u;->F:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Li8/u;->G:I

    invoke-virtual {p1, v2, v1}, Lp8/f;->Z(II)V

    :cond_0
    iget v1, p0, Li8/u;->F:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget v1, p0, Li8/u;->H:I

    invoke-virtual {p1, v2, v1}, Lp8/f;->Z(II)V

    :cond_1
    iget v1, p0, Li8/u;->F:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x3

    iget-object v3, p0, Li8/u;->I:Li8/q;

    invoke-virtual {p1, v1, v3}, Lp8/f;->c0(ILp8/p;)V

    :cond_2
    iget v1, p0, Li8/u;->F:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Li8/u;->K:Li8/q;

    invoke-virtual {p1, v2, v1}, Lp8/f;->c0(ILp8/p;)V

    :cond_3
    iget v1, p0, Li8/u;->F:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    const/4 v1, 0x5

    iget v2, p0, Li8/u;->J:I

    invoke-virtual {p1, v1, v2}, Lp8/f;->Z(II)V

    :cond_4
    iget v1, p0, Li8/u;->F:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x6

    iget v2, p0, Li8/u;->L:I

    invoke-virtual {p1, v1, v2}, Lp8/f;->Z(II)V

    :cond_5
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lp8/i$d$a;->a(ILp8/f;)V

    iget-object v0, p0, Li8/u;->E:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method
