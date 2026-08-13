.class public final Li8/h;
.super Lp8/i;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/h$b;,
        Li8/h$c;
    }
.end annotation


# static fields
.field private static final O:Li8/h;

.field public static P:Lp8/r;


# instance fields
.field private final D:Lp8/d;

.field private E:I

.field private F:I

.field private G:I

.field private H:Li8/h$c;

.field private I:Li8/q;

.field private J:I

.field private K:Ljava/util/List;

.field private L:Ljava/util/List;

.field private M:B

.field private N:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/h$a;

    invoke-direct {v0}, Li8/h$a;-><init>()V

    sput-object v0, Li8/h;->P:Lp8/r;

    new-instance v0, Li8/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/h;-><init>(Z)V

    sput-object v0, Li8/h;->O:Li8/h;

    invoke-direct {v0}, Li8/h;->R()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 11

    .prologue
    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/h;->M:B

    iput v0, p0, Li8/h;->N:I

    invoke-direct {p0}, Li8/h;->R()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x20

    const/16 v6, 0x40

    if-nez v3, :cond_10

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v7

    if-eqz v7, :cond_1

    const/16 v8, 0x8

    if-eq v7, v8, :cond_d

    const/16 v9, 0x10

    if-eq v7, v9, :cond_c

    const/16 v10, 0x18

    if-eq v7, v10, :cond_a

    const/16 v10, 0x22

    if-eq v7, v10, :cond_7

    const/16 v8, 0x28

    if-eq v7, v8, :cond_6

    const/16 v8, 0x32

    if-eq v7, v8, :cond_4

    const/16 v8, 0x3a

    if-eq v7, v8, :cond_2

    invoke-virtual {p0, p1, v2, p2, v7}, Lp8/i;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :catch_1
    move-exception p1

    goto/16 :goto_4

    :cond_2
    and-int/lit8 v7, v4, 0x40

    if-eq v7, v6, :cond_3

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Li8/h;->L:Ljava/util/List;

    or-int/lit8 v4, v4, 0x40

    :cond_3
    iget-object v7, p0, Li8/h;->L:Ljava/util/List;

    sget-object v8, Li8/h;->P:Lp8/r;

    invoke-virtual {p1, v8, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v8

    :goto_1
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    and-int/lit8 v7, v4, 0x20

    if-eq v7, v5, :cond_5

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Li8/h;->K:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    :cond_5
    iget-object v7, p0, Li8/h;->K:Ljava/util/List;

    sget-object v8, Li8/h;->P:Lp8/r;

    invoke-virtual {p1, v8, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v8

    goto :goto_1

    :cond_6
    iget v7, p0, Li8/h;->E:I

    or-int/2addr v7, v9

    iput v7, p0, Li8/h;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v7

    iput v7, p0, Li8/h;->J:I

    goto :goto_0

    :cond_7
    iget v7, p0, Li8/h;->E:I

    and-int/2addr v7, v8

    if-ne v7, v8, :cond_8

    iget-object v7, p0, Li8/h;->I:Li8/q;

    invoke-virtual {v7}, Li8/q;->B0()Li8/q$c;

    move-result-object v7

    goto :goto_2

    :cond_8
    const/4 v7, 0x0

    :goto_2
    sget-object v9, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v9, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v9

    check-cast v9, Li8/q;

    iput-object v9, p0, Li8/h;->I:Li8/q;

    if-eqz v7, :cond_9

    invoke-virtual {v7, v9}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v7}, Li8/q$c;->v()Li8/q;

    move-result-object v7

    iput-object v7, p0, Li8/h;->I:Li8/q;

    :cond_9
    iget v7, p0, Li8/h;->E:I

    or-int/2addr v7, v8

    iput v7, p0, Li8/h;->E:I

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p1}, Lp8/e;->m()I

    move-result v8

    invoke-static {v8}, Li8/h$c;->e(I)Li8/h$c;

    move-result-object v9

    if-nez v9, :cond_b

    invoke-virtual {v2, v7}, Lp8/f;->n0(I)V

    invoke-virtual {v2, v8}, Lp8/f;->n0(I)V

    goto/16 :goto_0

    :cond_b
    iget v7, p0, Li8/h;->E:I

    or-int/lit8 v7, v7, 0x4

    iput v7, p0, Li8/h;->E:I

    iput-object v9, p0, Li8/h;->H:Li8/h$c;

    goto/16 :goto_0

    :cond_c
    iget v7, p0, Li8/h;->E:I

    or-int/lit8 v7, v7, 0x2

    iput v7, p0, Li8/h;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v7

    iput v7, p0, Li8/h;->G:I

    goto/16 :goto_0

    :cond_d
    iget v7, p0, Li8/h;->E:I

    or-int/2addr v7, v1

    iput v7, p0, Li8/h;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v7

    iput v7, p0, Li8/h;->F:I
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :goto_3
    :try_start_1
    new-instance p2, Lp8/k;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lp8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1

    :goto_4
    invoke-virtual {p1, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_5
    and-int/lit8 p2, v4, 0x20

    if-ne p2, v5, :cond_e

    iget-object p2, p0, Li8/h;->K:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/h;->K:Ljava/util/List;

    :cond_e
    and-int/lit8 p2, v4, 0x40

    if-ne p2, v6, :cond_f

    iget-object p2, p0, Li8/h;->L:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/h;->L:Ljava/util/List;

    :cond_f
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/h;->D:Lp8/d;

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/h;->D:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i;->m()V

    throw p1

    :cond_10
    and-int/lit8 p1, v4, 0x20

    if-ne p1, v5, :cond_11

    iget-object p1, p0, Li8/h;->K:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/h;->K:Ljava/util/List;

    :cond_11
    and-int/lit8 p1, v4, 0x40

    if-ne p1, v6, :cond_12

    iget-object p1, p0, Li8/h;->L:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/h;->L:Ljava/util/List;

    :cond_12
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/h;->D:Lp8/d;

    goto :goto_7

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/h;->D:Lp8/d;

    throw p1

    :goto_7
    invoke-virtual {p0}, Lp8/i;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/h;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$b;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i;-><init>(Lp8/i$b;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/h;->M:B

    iput v0, p0, Li8/h;->N:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/h;->D:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$b;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/h;-><init>(Lp8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/h;->M:B

    iput p1, p0, Li8/h;->N:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/h;->D:Lp8/d;

    return-void
.end method

.method static synthetic A(Li8/h;I)I
    .locals 0

    iput p1, p0, Li8/h;->E:I

    return p1
.end method

.method static synthetic B(Li8/h;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/h;->D:Lp8/d;

    return-object p0
.end method

.method public static F()Li8/h;
    .locals 1

    sget-object v0, Li8/h;->O:Li8/h;

    return-object v0
.end method

.method private R()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Li8/h;->F:I

    iput v0, p0, Li8/h;->G:I

    sget-object v1, Li8/h$c;->D:Li8/h$c;

    iput-object v1, p0, Li8/h;->H:Li8/h$c;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v1

    iput-object v1, p0, Li8/h;->I:Li8/q;

    iput v0, p0, Li8/h;->J:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/h;->K:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/h;->L:Ljava/util/List;

    return-void
.end method

.method public static S()Li8/h$b;
    .locals 1

    invoke-static {}, Li8/h$b;->n()Li8/h$b;

    move-result-object v0

    return-object v0
.end method

.method public static T(Li8/h;)Li8/h$b;
    .locals 1

    invoke-static {}, Li8/h;->S()Li8/h$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/h$b;->x(Li8/h;)Li8/h$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Li8/h;I)I
    .locals 0

    iput p1, p0, Li8/h;->F:I

    return p1
.end method

.method static synthetic s(Li8/h;I)I
    .locals 0

    iput p1, p0, Li8/h;->G:I

    return p1
.end method

.method static synthetic t(Li8/h;Li8/h$c;)Li8/h$c;
    .locals 0

    iput-object p1, p0, Li8/h;->H:Li8/h$c;

    return-object p1
.end method

.method static synthetic u(Li8/h;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/h;->I:Li8/q;

    return-object p1
.end method

.method static synthetic v(Li8/h;I)I
    .locals 0

    iput p1, p0, Li8/h;->J:I

    return p1
.end method

.method static synthetic w(Li8/h;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/h;->K:Ljava/util/List;

    return-object p0
.end method

.method static synthetic x(Li8/h;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/h;->K:Ljava/util/List;

    return-object p1
.end method

.method static synthetic y(Li8/h;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/h;->L:Ljava/util/List;

    return-object p0
.end method

.method static synthetic z(Li8/h;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/h;->L:Ljava/util/List;

    return-object p1
.end method


# virtual methods
.method public C(I)Li8/h;
    .locals 1

    iget-object v0, p0, Li8/h;->K:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/h;

    return-object p1
.end method

.method public D()I
    .locals 1

    iget-object v0, p0, Li8/h;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public E()Li8/h$c;
    .locals 1

    iget-object v0, p0, Li8/h;->H:Li8/h$c;

    return-object v0
.end method

.method public G()I
    .locals 1

    iget v0, p0, Li8/h;->F:I

    return v0
.end method

.method public H()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/h;->I:Li8/q;

    return-object v0
.end method

.method public I()I
    .locals 1

    iget v0, p0, Li8/h;->J:I

    return v0
.end method

.method public J(I)Li8/h;
    .locals 1

    iget-object v0, p0, Li8/h;->L:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/h;

    return-object p1
.end method

.method public K()I
    .locals 1

    iget-object v0, p0, Li8/h;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public L()I
    .locals 1

    iget v0, p0, Li8/h;->G:I

    return v0
.end method

.method public M()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/h;->E:I

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

.method public N()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/h;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public O()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/h;->E:I

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

.method public P()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/h;->E:I

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

.method public Q()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/h;->E:I

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

.method public U()Li8/h$b;
    .locals 1

    invoke-static {}, Li8/h;->S()Li8/h$b;

    move-result-object v0

    return-object v0
.end method

.method public V()Li8/h$b;
    .locals 1

    invoke-static {p0}, Li8/h;->T(Li8/h;)Li8/h$b;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 5

    .prologue
    iget v0, p0, Li8/h;->N:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/h;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/h;->F:I

    invoke-static {v1, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v1, p0, Li8/h;->E:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget v1, p0, Li8/h;->G:I

    invoke-static {v3, v1}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Li8/h;->E:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Li8/h;->H:Li8/h$c;

    invoke-virtual {v1}, Li8/h$c;->c()I

    move-result v1

    const/4 v4, 0x3

    invoke-static {v4, v1}, Lp8/f;->h(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Li8/h;->E:I

    const/16 v4, 0x8

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_4

    iget-object v1, p0, Li8/h;->I:Li8/q;

    invoke-static {v3, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Li8/h;->E:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_5

    const/4 v1, 0x5

    iget v3, p0, Li8/h;->J:I

    invoke-static {v1, v3}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    move v1, v2

    :goto_1
    iget-object v3, p0, Li8/h;->K:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_6

    iget-object v3, p0, Li8/h;->K:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    const/4 v4, 0x6

    invoke-static {v4, v3}, Lp8/f;->r(ILp8/p;)I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    :goto_2
    iget-object v1, p0, Li8/h;->L:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_7

    iget-object v1, p0, Li8/h;->L:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/p;

    const/4 v3, 0x7

    invoke-static {v3, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    iget-object v1, p0, Li8/h;->D:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/h;->N:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/h;->U()Li8/h$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/h;->M:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Li8/h;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Li8/h;->H()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Li8/h;->M:B

    return v2

    :cond_2
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Li8/h;->D()I

    move-result v3

    if-ge v0, v3, :cond_4

    invoke-virtual {p0, v0}, Li8/h;->C(I)Li8/h;

    move-result-object v3

    invoke-virtual {v3}, Li8/h;->d()Z

    move-result v3

    if-nez v3, :cond_3

    iput-byte v2, p0, Li8/h;->M:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    move v0, v2

    :goto_1
    invoke-virtual {p0}, Li8/h;->K()I

    move-result v3

    if-ge v0, v3, :cond_6

    invoke-virtual {p0, v0}, Li8/h;->J(I)Li8/h;

    move-result-object v3

    invoke-virtual {v3}, Li8/h;->d()Z

    move-result v3

    if-nez v3, :cond_5

    iput-byte v2, p0, Li8/h;->M:B

    return v2

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    iput-byte v1, p0, Li8/h;->M:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/h;->V()Li8/h$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 4

    .prologue
    invoke-virtual {p0}, Li8/h;->b()I

    iget v0, p0, Li8/h;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Li8/h;->F:I

    invoke-virtual {p1, v1, v0}, Lp8/f;->Z(II)V

    :cond_0
    iget v0, p0, Li8/h;->E:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/h;->G:I

    invoke-virtual {p1, v1, v0}, Lp8/f;->Z(II)V

    :cond_1
    iget v0, p0, Li8/h;->E:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Li8/h;->H:Li8/h$c;

    invoke-virtual {v0}, Li8/h$c;->c()I

    move-result v0

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v0}, Lp8/f;->R(II)V

    :cond_2
    iget v0, p0, Li8/h;->E:I

    const/16 v2, 0x8

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Li8/h;->I:Li8/q;

    invoke-virtual {p1, v1, v0}, Lp8/f;->c0(ILp8/p;)V

    :cond_3
    iget v0, p0, Li8/h;->E:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x5

    iget v1, p0, Li8/h;->J:I

    invoke-virtual {p1, v0, v1}, Lp8/f;->Z(II)V

    :cond_4
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Li8/h;->K:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_5

    iget-object v2, p0, Li8/h;->K:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp8/p;

    const/4 v3, 0x6

    invoke-virtual {p1, v3, v2}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    iget-object v1, p0, Li8/h;->L:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_6

    iget-object v1, p0, Li8/h;->L:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/p;

    const/4 v2, 0x7

    invoke-virtual {p1, v2, v1}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    iget-object v0, p0, Li8/h;->D:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method
