.class public final Li8/f;
.super Lp8/i;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/f$b;,
        Li8/f$d;,
        Li8/f$c;
    }
.end annotation


# static fields
.field private static final L:Li8/f;

.field public static M:Lp8/r;


# instance fields
.field private final D:Lp8/d;

.field private E:I

.field private F:Li8/f$c;

.field private G:Ljava/util/List;

.field private H:Li8/h;

.field private I:Li8/f$d;

.field private J:B

.field private K:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/f$a;

    invoke-direct {v0}, Li8/f$a;-><init>()V

    sput-object v0, Li8/f;->M:Lp8/r;

    new-instance v0, Li8/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/f;-><init>(Z)V

    sput-object v0, Li8/f;->L:Li8/f;

    invoke-direct {v0}, Li8/f;->H()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 9

    .prologue
    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/f;->J:B

    iput v0, p0, Li8/f;->K:I

    invoke-direct {p0}, Li8/f;->H()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/4 v5, 0x2

    if-nez v3, :cond_c

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0x8

    if-eq v6, v7, :cond_9

    const/16 v7, 0x12

    if-eq v6, v7, :cond_7

    const/16 v7, 0x1a

    if-eq v6, v7, :cond_4

    const/16 v7, 0x20

    if-eq v6, v7, :cond_2

    invoke-virtual {p0, p1, v2, p2, v6}, Lp8/i;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

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
    invoke-virtual {p1}, Lp8/e;->m()I

    move-result v7

    invoke-static {v7}, Li8/f$d;->e(I)Li8/f$d;

    move-result-object v8

    if-nez v8, :cond_3

    invoke-virtual {v2, v6}, Lp8/f;->n0(I)V

    :goto_1
    invoke-virtual {v2, v7}, Lp8/f;->n0(I)V

    goto :goto_0

    :cond_3
    iget v6, p0, Li8/f;->E:I

    or-int/lit8 v6, v6, 0x4

    iput v6, p0, Li8/f;->E:I

    iput-object v8, p0, Li8/f;->I:Li8/f$d;

    goto :goto_0

    :cond_4
    iget v6, p0, Li8/f;->E:I

    and-int/2addr v6, v5

    if-ne v6, v5, :cond_5

    iget-object v6, p0, Li8/f;->H:Li8/h;

    invoke-virtual {v6}, Li8/h;->V()Li8/h$b;

    move-result-object v6

    goto :goto_2

    :cond_5
    const/4 v6, 0x0

    :goto_2
    sget-object v7, Li8/h;->P:Lp8/r;

    invoke-virtual {p1, v7, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v7

    check-cast v7, Li8/h;

    iput-object v7, p0, Li8/f;->H:Li8/h;

    if-eqz v6, :cond_6

    invoke-virtual {v6, v7}, Li8/h$b;->x(Li8/h;)Li8/h$b;

    invoke-virtual {v6}, Li8/h$b;->q()Li8/h;

    move-result-object v6

    iput-object v6, p0, Li8/f;->H:Li8/h;

    :cond_6
    iget v6, p0, Li8/f;->E:I

    or-int/2addr v6, v5

    iput v6, p0, Li8/f;->E:I

    goto :goto_0

    :cond_7
    and-int/lit8 v6, v4, 0x2

    if-eq v6, v5, :cond_8

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Li8/f;->G:Ljava/util/List;

    move v4, v5

    :cond_8
    iget-object v6, p0, Li8/f;->G:Ljava/util/List;

    sget-object v7, Li8/h;->P:Lp8/r;

    invoke-virtual {p1, v7, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_9
    invoke-virtual {p1}, Lp8/e;->m()I

    move-result v7

    invoke-static {v7}, Li8/f$c;->e(I)Li8/f$c;

    move-result-object v8

    if-nez v8, :cond_a

    invoke-virtual {v2, v6}, Lp8/f;->n0(I)V

    goto :goto_1

    :cond_a
    iget v6, p0, Li8/f;->E:I

    or-int/2addr v6, v1

    iput v6, p0, Li8/f;->E:I

    iput-object v8, p0, Li8/f;->F:Li8/f$c;
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
    and-int/lit8 p2, v4, 0x2

    if-ne p2, v5, :cond_b

    iget-object p2, p0, Li8/f;->G:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/f;->G:Ljava/util/List;

    :cond_b
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/f;->D:Lp8/d;

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/f;->D:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i;->m()V

    throw p1

    :cond_c
    and-int/lit8 p1, v4, 0x2

    if-ne p1, v5, :cond_d

    iget-object p1, p0, Li8/f;->G:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/f;->G:Ljava/util/List;

    :cond_d
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/f;->D:Lp8/d;

    goto :goto_7

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/f;->D:Lp8/d;

    throw p1

    :goto_7
    invoke-virtual {p0}, Lp8/i;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/f;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$b;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i;-><init>(Lp8/i$b;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/f;->J:B

    iput v0, p0, Li8/f;->K:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/f;->D:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$b;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/f;-><init>(Lp8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/f;->J:B

    iput p1, p0, Li8/f;->K:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/f;->D:Lp8/d;

    return-void
.end method

.method private H()V
    .locals 1

    sget-object v0, Li8/f$c;->D:Li8/f$c;

    iput-object v0, p0, Li8/f;->F:Li8/f$c;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/f;->G:Ljava/util/List;

    invoke-static {}, Li8/h;->F()Li8/h;

    move-result-object v0

    iput-object v0, p0, Li8/f;->H:Li8/h;

    sget-object v0, Li8/f$d;->D:Li8/f$d;

    iput-object v0, p0, Li8/f;->I:Li8/f$d;

    return-void
.end method

.method public static I()Li8/f$b;
    .locals 1

    invoke-static {}, Li8/f$b;->n()Li8/f$b;

    move-result-object v0

    return-object v0
.end method

.method public static J(Li8/f;)Li8/f$b;
    .locals 1

    invoke-static {}, Li8/f;->I()Li8/f$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/f$b;->x(Li8/f;)Li8/f$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Li8/f;Li8/f$c;)Li8/f$c;
    .locals 0

    iput-object p1, p0, Li8/f;->F:Li8/f$c;

    return-object p1
.end method

.method static synthetic s(Li8/f;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/f;->G:Ljava/util/List;

    return-object p0
.end method

.method static synthetic t(Li8/f;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/f;->G:Ljava/util/List;

    return-object p1
.end method

.method static synthetic u(Li8/f;Li8/h;)Li8/h;
    .locals 0

    iput-object p1, p0, Li8/f;->H:Li8/h;

    return-object p1
.end method

.method static synthetic v(Li8/f;Li8/f$d;)Li8/f$d;
    .locals 0

    iput-object p1, p0, Li8/f;->I:Li8/f$d;

    return-object p1
.end method

.method static synthetic w(Li8/f;I)I
    .locals 0

    iput p1, p0, Li8/f;->E:I

    return p1
.end method

.method static synthetic x(Li8/f;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/f;->D:Lp8/d;

    return-object p0
.end method

.method public static z()Li8/f;
    .locals 1

    sget-object v0, Li8/f;->L:Li8/f;

    return-object v0
.end method


# virtual methods
.method public A(I)Li8/h;
    .locals 1

    iget-object v0, p0, Li8/f;->G:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/h;

    return-object p1
.end method

.method public B()I
    .locals 1

    iget-object v0, p0, Li8/f;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public C()Li8/f$c;
    .locals 1

    iget-object v0, p0, Li8/f;->F:Li8/f$c;

    return-object v0
.end method

.method public D()Li8/f$d;
    .locals 1

    iget-object v0, p0, Li8/f;->I:Li8/f$d;

    return-object v0
.end method

.method public E()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/f;->E:I

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

.method public F()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/f;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public G()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/f;->E:I

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

.method public K()Li8/f$b;
    .locals 1

    invoke-static {}, Li8/f;->I()Li8/f$b;

    move-result-object v0

    return-object v0
.end method

.method public L()Li8/f$b;
    .locals 1

    invoke-static {p0}, Li8/f;->J(Li8/f;)Li8/f$b;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 4

    .prologue
    iget v0, p0, Li8/f;->K:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/f;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Li8/f;->F:Li8/f$c;

    invoke-virtual {v0}, Li8/f$c;->c()I

    move-result v0

    invoke-static {v1, v0}, Lp8/f;->h(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget-object v1, p0, Li8/f;->G:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x2

    if-ge v2, v1, :cond_2

    iget-object v1, p0, Li8/f;->G:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/p;

    invoke-static {v3, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget v1, p0, Li8/f;->E:I

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    iget-object v2, p0, Li8/f;->H:Li8/h;

    invoke-static {v1, v2}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Li8/f;->E:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Li8/f;->I:Li8/f$d;

    invoke-virtual {v1}, Li8/f$d;->c()I

    move-result v1

    invoke-static {v2, v1}, Lp8/f;->h(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Li8/f;->D:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/f;->K:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/f;->K()Li8/f$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/f;->J:B

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
    invoke-virtual {p0}, Li8/f;->B()I

    move-result v3

    if-ge v0, v3, :cond_3

    invoke-virtual {p0, v0}, Li8/f;->A(I)Li8/h;

    move-result-object v3

    invoke-virtual {v3}, Li8/h;->d()Z

    move-result v3

    if-nez v3, :cond_2

    iput-byte v2, p0, Li8/f;->J:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Li8/f;->E()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Li8/f;->y()Li8/h;

    move-result-object v0

    invoke-virtual {v0}, Li8/h;->d()Z

    move-result v0

    if-nez v0, :cond_4

    iput-byte v2, p0, Li8/f;->J:B

    return v2

    :cond_4
    iput-byte v1, p0, Li8/f;->J:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/f;->L()Li8/f$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Li8/f;->b()I

    iget v0, p0, Li8/f;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/f;->F:Li8/f$c;

    invoke-virtual {v0}, Li8/f$c;->c()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lp8/f;->R(II)V

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Li8/f;->G:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Li8/f;->G:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/p;

    invoke-virtual {p1, v2, v1}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Li8/f;->E:I

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_2

    const/4 v0, 0x3

    iget-object v1, p0, Li8/f;->H:Li8/h;

    invoke-virtual {p1, v0, v1}, Lp8/f;->c0(ILp8/p;)V

    :cond_2
    iget v0, p0, Li8/f;->E:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Li8/f;->I:Li8/f$d;

    invoke-virtual {v0}, Li8/f$d;->c()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lp8/f;->R(II)V

    :cond_3
    iget-object v0, p0, Li8/f;->D:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public y()Li8/h;
    .locals 1

    iget-object v0, p0, Li8/f;->H:Li8/h;

    return-object v0
.end method
