.class public final Li8/q;
.super Lp8/i$d;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/q$c;,
        Li8/q$b;
    }
.end annotation


# static fields
.field private static final W:Li8/q;

.field public static X:Lp8/r;


# instance fields
.field private final E:Lp8/d;

.field private F:I

.field private G:Ljava/util/List;

.field private H:Z

.field private I:I

.field private J:Li8/q;

.field private K:I

.field private L:I

.field private M:I

.field private N:I

.field private O:I

.field private P:Li8/q;

.field private Q:I

.field private R:Li8/q;

.field private S:I

.field private T:I

.field private U:B

.field private V:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/q$a;

    invoke-direct {v0}, Li8/q$a;-><init>()V

    sput-object v0, Li8/q;->X:Lp8/r;

    new-instance v0, Li8/q;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/q;-><init>(Z)V

    sput-object v0, Li8/q;->W:Li8/q;

    invoke-direct {v0}, Li8/q;->x0()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 8

    .prologue
    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/q;->U:B

    iput v0, p0, Li8/q;->V:I

    invoke-direct {p0}, Li8/q;->x0()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    if-nez v3, :cond_9

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v5

    const/4 v6, 0x0

    sparse-switch v5, :sswitch_data_0

    invoke-virtual {p0, p1, v2, p2, v5}, Lp8/i$d;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :sswitch_0
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    :sswitch_1
    iget v5, p0, Li8/q;->F:I

    or-int/lit16 v5, v5, 0x800

    iput v5, p0, Li8/q;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v5

    iput v5, p0, Li8/q;->S:I

    goto :goto_0

    :sswitch_2
    iget v5, p0, Li8/q;->F:I

    const/16 v7, 0x400

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_1

    iget-object v5, p0, Li8/q;->R:Li8/q;

    invoke-virtual {v5}, Li8/q;->B0()Li8/q$c;

    move-result-object v6

    :cond_1
    sget-object v5, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v5, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v5

    check-cast v5, Li8/q;

    iput-object v5, p0, Li8/q;->R:Li8/q;

    if-eqz v6, :cond_2

    invoke-virtual {v6, v5}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v6}, Li8/q$c;->v()Li8/q;

    move-result-object v5

    iput-object v5, p0, Li8/q;->R:Li8/q;

    :cond_2
    iget v5, p0, Li8/q;->F:I

    :goto_1
    or-int/2addr v5, v7

    iput v5, p0, Li8/q;->F:I

    goto :goto_0

    :sswitch_3
    iget v5, p0, Li8/q;->F:I

    or-int/lit16 v5, v5, 0x80

    iput v5, p0, Li8/q;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v5

    iput v5, p0, Li8/q;->O:I

    goto :goto_0

    :sswitch_4
    iget v5, p0, Li8/q;->F:I

    or-int/lit16 v5, v5, 0x200

    iput v5, p0, Li8/q;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v5

    iput v5, p0, Li8/q;->Q:I

    goto :goto_0

    :sswitch_5
    iget v5, p0, Li8/q;->F:I

    const/16 v7, 0x100

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_3

    iget-object v5, p0, Li8/q;->P:Li8/q;

    invoke-virtual {v5}, Li8/q;->B0()Li8/q$c;

    move-result-object v6

    :cond_3
    sget-object v5, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v5, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v5

    check-cast v5, Li8/q;

    iput-object v5, p0, Li8/q;->P:Li8/q;

    if-eqz v6, :cond_4

    invoke-virtual {v6, v5}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v6}, Li8/q$c;->v()Li8/q;

    move-result-object v5

    iput-object v5, p0, Li8/q;->P:Li8/q;

    :cond_4
    iget v5, p0, Li8/q;->F:I

    goto :goto_1

    :sswitch_6
    iget v5, p0, Li8/q;->F:I

    or-int/lit8 v5, v5, 0x40

    iput v5, p0, Li8/q;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v5

    iput v5, p0, Li8/q;->N:I

    goto/16 :goto_0

    :sswitch_7
    iget v5, p0, Li8/q;->F:I

    or-int/lit8 v5, v5, 0x8

    iput v5, p0, Li8/q;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v5

    iput v5, p0, Li8/q;->K:I

    goto/16 :goto_0

    :sswitch_8
    iget v5, p0, Li8/q;->F:I

    or-int/lit8 v5, v5, 0x20

    iput v5, p0, Li8/q;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v5

    iput v5, p0, Li8/q;->M:I

    goto/16 :goto_0

    :sswitch_9
    iget v5, p0, Li8/q;->F:I

    or-int/lit8 v5, v5, 0x10

    iput v5, p0, Li8/q;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v5

    iput v5, p0, Li8/q;->L:I

    goto/16 :goto_0

    :sswitch_a
    iget v5, p0, Li8/q;->F:I

    const/4 v7, 0x4

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_5

    iget-object v5, p0, Li8/q;->J:Li8/q;

    invoke-virtual {v5}, Li8/q;->B0()Li8/q$c;

    move-result-object v6

    :cond_5
    sget-object v5, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v5, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v5

    check-cast v5, Li8/q;

    iput-object v5, p0, Li8/q;->J:Li8/q;

    if-eqz v6, :cond_6

    invoke-virtual {v6, v5}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v6}, Li8/q$c;->v()Li8/q;

    move-result-object v5

    iput-object v5, p0, Li8/q;->J:Li8/q;

    :cond_6
    iget v5, p0, Li8/q;->F:I

    goto/16 :goto_1

    :sswitch_b
    iget v5, p0, Li8/q;->F:I

    or-int/lit8 v5, v5, 0x2

    iput v5, p0, Li8/q;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v5

    iput v5, p0, Li8/q;->I:I

    goto/16 :goto_0

    :sswitch_c
    iget v5, p0, Li8/q;->F:I

    or-int/2addr v5, v1

    iput v5, p0, Li8/q;->F:I

    invoke-virtual {p1}, Lp8/e;->j()Z

    move-result v5

    iput-boolean v5, p0, Li8/q;->H:Z

    goto/16 :goto_0

    :sswitch_d
    if-eq v4, v1, :cond_7

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Li8/q;->G:Ljava/util/List;

    move v4, v1

    :cond_7
    iget-object v5, p0, Li8/q;->G:Ljava/util/List;

    sget-object v6, Li8/q$b;->L:Lp8/r;

    invoke-virtual {p1, v6, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :sswitch_e
    iget v5, p0, Li8/q;->F:I

    or-int/lit16 v5, v5, 0x1000

    iput v5, p0, Li8/q;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v5

    iput v5, p0, Li8/q;->T:I
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :goto_2
    :try_start_1
    new-instance p2, Lp8/k;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lp8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1

    :goto_3
    invoke-virtual {p1, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    if-ne v4, v1, :cond_8

    iget-object p2, p0, Li8/q;->G:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/q;->G:Ljava/util/List;

    :cond_8
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/q;->E:Lp8/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/q;->E:Lp8/d;

    throw p1

    :goto_5
    invoke-virtual {p0}, Lp8/i$d;->m()V

    throw p1

    :cond_9
    if-ne v4, v1, :cond_a

    iget-object p1, p0, Li8/q;->G:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/q;->G:Ljava/util/List;

    :cond_a
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/q;->E:Lp8/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/q;->E:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i$d;->m()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_e
        0x12 -> :sswitch_d
        0x18 -> :sswitch_c
        0x20 -> :sswitch_b
        0x2a -> :sswitch_a
        0x30 -> :sswitch_9
        0x38 -> :sswitch_8
        0x40 -> :sswitch_7
        0x48 -> :sswitch_6
        0x52 -> :sswitch_5
        0x58 -> :sswitch_4
        0x60 -> :sswitch_3
        0x6a -> :sswitch_2
        0x70 -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/q;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$c;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i$d;-><init>(Lp8/i$c;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/q;->U:B

    iput v0, p0, Li8/q;->V:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/q;->E:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$c;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/q;-><init>(Lp8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/q;->U:B

    iput p1, p0, Li8/q;->V:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/q;->E:Lp8/d;

    return-void
.end method

.method static synthetic A(Li8/q;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/q;->G:Ljava/util/List;

    return-object p0
.end method

.method static synthetic B(Li8/q;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/q;->G:Ljava/util/List;

    return-object p1
.end method

.method static synthetic C(Li8/q;Z)Z
    .locals 0

    iput-boolean p1, p0, Li8/q;->H:Z

    return p1
.end method

.method static synthetic D(Li8/q;I)I
    .locals 0

    iput p1, p0, Li8/q;->I:I

    return p1
.end method

.method static synthetic E(Li8/q;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/q;->J:Li8/q;

    return-object p1
.end method

.method static synthetic F(Li8/q;I)I
    .locals 0

    iput p1, p0, Li8/q;->K:I

    return p1
.end method

.method static synthetic G(Li8/q;I)I
    .locals 0

    iput p1, p0, Li8/q;->L:I

    return p1
.end method

.method static synthetic H(Li8/q;I)I
    .locals 0

    iput p1, p0, Li8/q;->M:I

    return p1
.end method

.method static synthetic I(Li8/q;I)I
    .locals 0

    iput p1, p0, Li8/q;->N:I

    return p1
.end method

.method static synthetic J(Li8/q;I)I
    .locals 0

    iput p1, p0, Li8/q;->O:I

    return p1
.end method

.method static synthetic K(Li8/q;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/q;->P:Li8/q;

    return-object p1
.end method

.method static synthetic L(Li8/q;I)I
    .locals 0

    iput p1, p0, Li8/q;->Q:I

    return p1
.end method

.method static synthetic M(Li8/q;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/q;->R:Li8/q;

    return-object p1
.end method

.method static synthetic N(Li8/q;I)I
    .locals 0

    iput p1, p0, Li8/q;->S:I

    return p1
.end method

.method static synthetic O(Li8/q;I)I
    .locals 0

    iput p1, p0, Li8/q;->T:I

    return p1
.end method

.method static synthetic P(Li8/q;I)I
    .locals 0

    iput p1, p0, Li8/q;->F:I

    return p1
.end method

.method static synthetic Q(Li8/q;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/q;->E:Lp8/d;

    return-object p0
.end method

.method public static X()Li8/q;
    .locals 1

    sget-object v0, Li8/q;->W:Li8/q;

    return-object v0
.end method

.method private x0()V
    .locals 2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/q;->G:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Li8/q;->H:Z

    iput v0, p0, Li8/q;->I:I

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v1

    iput-object v1, p0, Li8/q;->J:Li8/q;

    iput v0, p0, Li8/q;->K:I

    iput v0, p0, Li8/q;->L:I

    iput v0, p0, Li8/q;->M:I

    iput v0, p0, Li8/q;->N:I

    iput v0, p0, Li8/q;->O:I

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v1

    iput-object v1, p0, Li8/q;->P:Li8/q;

    iput v0, p0, Li8/q;->Q:I

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v1

    iput-object v1, p0, Li8/q;->R:Li8/q;

    iput v0, p0, Li8/q;->S:I

    iput v0, p0, Li8/q;->T:I

    return-void
.end method

.method public static y0()Li8/q$c;
    .locals 1

    invoke-static {}, Li8/q$c;->t()Li8/q$c;

    move-result-object v0

    return-object v0
.end method

.method public static z0(Li8/q;)Li8/q$c;
    .locals 1

    invoke-static {}, Li8/q;->y0()Li8/q$c;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A0()Li8/q$c;
    .locals 1

    invoke-static {}, Li8/q;->y0()Li8/q$c;

    move-result-object v0

    return-object v0
.end method

.method public B0()Li8/q$c;
    .locals 1

    invoke-static {p0}, Li8/q;->z0(Li8/q;)Li8/q$c;

    move-result-object v0

    return-object v0
.end method

.method public R()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/q;->R:Li8/q;

    return-object v0
.end method

.method public S()I
    .locals 1

    iget v0, p0, Li8/q;->S:I

    return v0
.end method

.method public T(I)Li8/q$b;
    .locals 1

    iget-object v0, p0, Li8/q;->G:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/q$b;

    return-object p1
.end method

.method public U()I
    .locals 1

    iget-object v0, p0, Li8/q;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public V()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/q;->G:Ljava/util/List;

    return-object v0
.end method

.method public W()I
    .locals 1

    iget v0, p0, Li8/q;->L:I

    return v0
.end method

.method public Y()Li8/q;
    .locals 1

    sget-object v0, Li8/q;->W:Li8/q;

    return-object v0
.end method

.method public Z()I
    .locals 1

    iget v0, p0, Li8/q;->T:I

    return v0
.end method

.method public bridge synthetic a()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/q;->Y()Li8/q;

    move-result-object v0

    return-object v0
.end method

.method public a0()I
    .locals 1

    iget v0, p0, Li8/q;->I:I

    return v0
.end method

.method public b()I
    .locals 5

    .prologue
    iget v0, p0, Li8/q;->V:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/q;->F:I

    const/16 v1, 0x1000

    and-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/q;->T:I

    invoke-static {v3, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget-object v1, p0, Li8/q;->G:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v4, 0x2

    if-ge v2, v1, :cond_2

    iget-object v1, p0, Li8/q;->G:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/p;

    invoke-static {v4, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget v1, p0, Li8/q;->F:I

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    iget-boolean v2, p0, Li8/q;->H:Z

    invoke-static {v1, v2}, Lp8/f;->a(IZ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Li8/q;->F:I

    and-int/2addr v1, v4

    const/4 v2, 0x4

    if-ne v1, v4, :cond_4

    iget v1, p0, Li8/q;->I:I

    invoke-static {v2, v1}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Li8/q;->F:I

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x5

    iget-object v2, p0, Li8/q;->J:Li8/q;

    invoke-static {v1, v2}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    const/4 v1, 0x6

    iget v2, p0, Li8/q;->L:I

    invoke-static {v1, v2}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_7

    const/4 v1, 0x7

    iget v2, p0, Li8/q;->M:I

    invoke-static {v1, v2}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_8

    iget v1, p0, Li8/q;->K:I

    invoke-static {v2, v1}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x40

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_9

    const/16 v1, 0x9

    iget v2, p0, Li8/q;->N:I

    invoke-static {v1, v2}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_9
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_a

    const/16 v1, 0xa

    iget-object v2, p0, Li8/q;->P:Li8/q;

    invoke-static {v1, v2}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x200

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_b

    const/16 v1, 0xb

    iget v2, p0, Li8/q;->Q:I

    invoke-static {v1, v2}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x80

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_c

    const/16 v1, 0xc

    iget v2, p0, Li8/q;->O:I

    invoke-static {v1, v2}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_c
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x400

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_d

    const/16 v1, 0xd

    iget-object v2, p0, Li8/q;->R:Li8/q;

    invoke-static {v1, v2}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_d
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x800

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_e

    const/16 v1, 0xe

    iget v2, p0, Li8/q;->S:I

    invoke-static {v1, v2}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_e
    invoke-virtual {p0}, Lp8/i$d;->t()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Li8/q;->E:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/q;->V:I

    return v0
.end method

.method public b0()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/q;->J:Li8/q;

    return-object v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/q;->A0()Li8/q$c;

    move-result-object v0

    return-object v0
.end method

.method public c0()I
    .locals 1

    iget v0, p0, Li8/q;->K:I

    return v0
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/q;->U:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Li8/q;->U()I

    move-result v3

    if-ge v0, v3, :cond_3

    invoke-virtual {p0, v0}, Li8/q;->T(I)Li8/q$b;

    move-result-object v3

    invoke-virtual {v3}, Li8/q$b;->d()Z

    move-result v3

    if-nez v3, :cond_2

    iput-byte v2, p0, Li8/q;->U:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Li8/q;->p0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Li8/q;->b0()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_4

    iput-byte v2, p0, Li8/q;->U:B

    return v2

    :cond_4
    invoke-virtual {p0}, Li8/q;->s0()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Li8/q;->e0()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_5

    iput-byte v2, p0, Li8/q;->U:B

    return v2

    :cond_5
    invoke-virtual {p0}, Li8/q;->k0()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Li8/q;->R()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_6

    iput-byte v2, p0, Li8/q;->U:B

    return v2

    :cond_6
    invoke-virtual {p0}, Lp8/i$d;->s()Z

    move-result v0

    if-nez v0, :cond_7

    iput-byte v2, p0, Li8/q;->U:B

    return v2

    :cond_7
    iput-byte v1, p0, Li8/q;->U:B

    return v1
.end method

.method public d0()Z
    .locals 1

    iget-boolean v0, p0, Li8/q;->H:Z

    return v0
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/q;->B0()Li8/q$c;

    move-result-object v0

    return-object v0
.end method

.method public e0()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/q;->P:Li8/q;

    return-object v0
.end method

.method public f0()I
    .locals 1

    iget v0, p0, Li8/q;->Q:I

    return v0
.end method

.method public h(Lp8/f;)V
    .locals 5

    .prologue
    invoke-virtual {p0}, Li8/q;->b()I

    invoke-virtual {p0}, Lp8/i$d;->y()Lp8/i$d$a;

    move-result-object v0

    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x1000

    and-int/2addr v1, v2

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    iget v1, p0, Li8/q;->T:I

    invoke-virtual {p1, v3, v1}, Lp8/f;->Z(II)V

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Li8/q;->G:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Li8/q;->G:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp8/p;

    invoke-virtual {p1, v4, v2}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget v1, p0, Li8/q;->F:I

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    const/4 v1, 0x3

    iget-boolean v2, p0, Li8/q;->H:Z

    invoke-virtual {p1, v1, v2}, Lp8/f;->K(IZ)V

    :cond_2
    iget v1, p0, Li8/q;->F:I

    and-int/2addr v1, v4

    const/4 v2, 0x4

    if-ne v1, v4, :cond_3

    iget v1, p0, Li8/q;->I:I

    invoke-virtual {p1, v2, v1}, Lp8/f;->Z(II)V

    :cond_3
    iget v1, p0, Li8/q;->F:I

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    const/4 v1, 0x5

    iget-object v2, p0, Li8/q;->J:Li8/q;

    invoke-virtual {p1, v1, v2}, Lp8/f;->c0(ILp8/p;)V

    :cond_4
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x6

    iget v2, p0, Li8/q;->L:I

    invoke-virtual {p1, v1, v2}, Lp8/f;->Z(II)V

    :cond_5
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    const/4 v1, 0x7

    iget v2, p0, Li8/q;->M:I

    invoke-virtual {p1, v1, v2}, Lp8/f;->Z(II)V

    :cond_6
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_7

    iget v1, p0, Li8/q;->K:I

    invoke-virtual {p1, v2, v1}, Lp8/f;->Z(II)V

    :cond_7
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x40

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_8

    const/16 v1, 0x9

    iget v2, p0, Li8/q;->N:I

    invoke-virtual {p1, v1, v2}, Lp8/f;->Z(II)V

    :cond_8
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_9

    const/16 v1, 0xa

    iget-object v2, p0, Li8/q;->P:Li8/q;

    invoke-virtual {p1, v1, v2}, Lp8/f;->c0(ILp8/p;)V

    :cond_9
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x200

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_a

    const/16 v1, 0xb

    iget v2, p0, Li8/q;->Q:I

    invoke-virtual {p1, v1, v2}, Lp8/f;->Z(II)V

    :cond_a
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x80

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_b

    const/16 v1, 0xc

    iget v2, p0, Li8/q;->O:I

    invoke-virtual {p1, v1, v2}, Lp8/f;->Z(II)V

    :cond_b
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x400

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_c

    const/16 v1, 0xd

    iget-object v2, p0, Li8/q;->R:Li8/q;

    invoke-virtual {p1, v1, v2}, Lp8/f;->c0(ILp8/p;)V

    :cond_c
    iget v1, p0, Li8/q;->F:I

    const/16 v2, 0x800

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_d

    const/16 v1, 0xe

    iget v2, p0, Li8/q;->S:I

    invoke-virtual {p1, v1, v2}, Lp8/f;->Z(II)V

    :cond_d
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lp8/i$d$a;->a(ILp8/f;)V

    iget-object v0, p0, Li8/q;->E:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public h0()I
    .locals 1

    iget v0, p0, Li8/q;->O:I

    return v0
.end method

.method public i0()I
    .locals 1

    iget v0, p0, Li8/q;->M:I

    return v0
.end method

.method public j0()I
    .locals 1

    iget v0, p0, Li8/q;->N:I

    return v0
.end method

.method public k0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q;->F:I

    const/16 v1, 0x400

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q;->F:I

    const/16 v1, 0x800

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q;->F:I

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

.method public n0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q;->F:I

    const/16 v1, 0x1000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q;->F:I

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

.method public p0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q;->F:I

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

.method public q0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q;->F:I

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

.method public r0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public s0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q;->F:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q;->F:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q;->F:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public v0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q;->F:I

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

.method public w0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q;->F:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
