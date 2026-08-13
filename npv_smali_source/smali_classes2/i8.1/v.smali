.class public final Li8/v;
.super Lp8/i;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/v$b;,
        Li8/v$d;,
        Li8/v$c;
    }
.end annotation


# static fields
.field private static final N:Li8/v;

.field public static O:Lp8/r;


# instance fields
.field private final D:Lp8/d;

.field private E:I

.field private F:I

.field private G:I

.field private H:Li8/v$c;

.field private I:I

.field private J:I

.field private K:Li8/v$d;

.field private L:B

.field private M:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/v$a;

    invoke-direct {v0}, Li8/v$a;-><init>()V

    sput-object v0, Li8/v;->O:Lp8/r;

    new-instance v0, Li8/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/v;-><init>(Z)V

    sput-object v0, Li8/v;->N:Li8/v;

    invoke-direct {v0}, Li8/v;->M()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 8

    .prologue
    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/v;->L:B

    iput v0, p0, Li8/v;->M:I

    invoke-direct {p0}, Li8/v;->M()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_a

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_9

    const/16 v6, 0x10

    if-eq v4, v6, :cond_8

    const/16 v7, 0x18

    if-eq v4, v7, :cond_6

    const/16 v7, 0x20

    if-eq v4, v7, :cond_5

    const/16 v5, 0x28

    if-eq v4, v5, :cond_4

    const/16 v5, 0x30

    if-eq v4, v5, :cond_2

    invoke-virtual {p0, p1, v2, p2, v4}, Lp8/i;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    :cond_2
    invoke-virtual {p1}, Lp8/e;->m()I

    move-result v5

    invoke-static {v5}, Li8/v$d;->e(I)Li8/v$d;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-virtual {v2, v4}, Lp8/f;->n0(I)V

    :goto_1
    invoke-virtual {v2, v5}, Lp8/f;->n0(I)V

    goto :goto_0

    :cond_3
    iget v4, p0, Li8/v;->E:I

    or-int/2addr v4, v7

    iput v4, p0, Li8/v;->E:I

    iput-object v6, p0, Li8/v;->K:Li8/v$d;

    goto :goto_0

    :cond_4
    iget v4, p0, Li8/v;->E:I

    or-int/2addr v4, v6

    iput v4, p0, Li8/v;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v4

    iput v4, p0, Li8/v;->J:I

    goto :goto_0

    :cond_5
    iget v4, p0, Li8/v;->E:I

    or-int/2addr v4, v5

    iput v4, p0, Li8/v;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v4

    iput v4, p0, Li8/v;->I:I

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, Lp8/e;->m()I

    move-result v5

    invoke-static {v5}, Li8/v$c;->e(I)Li8/v$c;

    move-result-object v6

    if-nez v6, :cond_7

    invoke-virtual {v2, v4}, Lp8/f;->n0(I)V

    goto :goto_1

    :cond_7
    iget v4, p0, Li8/v;->E:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, Li8/v;->E:I

    iput-object v6, p0, Li8/v;->H:Li8/v$c;

    goto :goto_0

    :cond_8
    iget v4, p0, Li8/v;->E:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Li8/v;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v4

    iput v4, p0, Li8/v;->G:I

    goto/16 :goto_0

    :cond_9
    iget v4, p0, Li8/v;->E:I

    or-int/2addr v4, v1

    iput v4, p0, Li8/v;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v4

    iput v4, p0, Li8/v;->F:I
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
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/v;->D:Lp8/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/v;->D:Lp8/d;

    throw p1

    :goto_5
    invoke-virtual {p0}, Lp8/i;->m()V

    throw p1

    :cond_a
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/v;->D:Lp8/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/v;->D:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/v;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$b;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i;-><init>(Lp8/i$b;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/v;->L:B

    iput v0, p0, Li8/v;->M:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/v;->D:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$b;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/v;-><init>(Lp8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/v;->L:B

    iput p1, p0, Li8/v;->M:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/v;->D:Lp8/d;

    return-void
.end method

.method private M()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Li8/v;->F:I

    iput v0, p0, Li8/v;->G:I

    sget-object v1, Li8/v$c;->E:Li8/v$c;

    iput-object v1, p0, Li8/v;->H:Li8/v$c;

    iput v0, p0, Li8/v;->I:I

    iput v0, p0, Li8/v;->J:I

    sget-object v0, Li8/v$d;->D:Li8/v$d;

    iput-object v0, p0, Li8/v;->K:Li8/v$d;

    return-void
.end method

.method public static N()Li8/v$b;
    .locals 1

    invoke-static {}, Li8/v$b;->n()Li8/v$b;

    move-result-object v0

    return-object v0
.end method

.method public static O(Li8/v;)Li8/v$b;
    .locals 1

    invoke-static {}, Li8/v;->N()Li8/v$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/v$b;->v(Li8/v;)Li8/v$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Li8/v;I)I
    .locals 0

    iput p1, p0, Li8/v;->F:I

    return p1
.end method

.method static synthetic s(Li8/v;I)I
    .locals 0

    iput p1, p0, Li8/v;->G:I

    return p1
.end method

.method static synthetic t(Li8/v;Li8/v$c;)Li8/v$c;
    .locals 0

    iput-object p1, p0, Li8/v;->H:Li8/v$c;

    return-object p1
.end method

.method static synthetic u(Li8/v;I)I
    .locals 0

    iput p1, p0, Li8/v;->I:I

    return p1
.end method

.method static synthetic v(Li8/v;I)I
    .locals 0

    iput p1, p0, Li8/v;->J:I

    return p1
.end method

.method static synthetic w(Li8/v;Li8/v$d;)Li8/v$d;
    .locals 0

    iput-object p1, p0, Li8/v;->K:Li8/v$d;

    return-object p1
.end method

.method static synthetic x(Li8/v;I)I
    .locals 0

    iput p1, p0, Li8/v;->E:I

    return p1
.end method

.method static synthetic y(Li8/v;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/v;->D:Lp8/d;

    return-object p0
.end method

.method public static z()Li8/v;
    .locals 1

    sget-object v0, Li8/v;->N:Li8/v;

    return-object v0
.end method


# virtual methods
.method public A()I
    .locals 1

    iget v0, p0, Li8/v;->I:I

    return v0
.end method

.method public B()Li8/v$c;
    .locals 1

    iget-object v0, p0, Li8/v;->H:Li8/v$c;

    return-object v0
.end method

.method public C()I
    .locals 1

    iget v0, p0, Li8/v;->J:I

    return v0
.end method

.method public D()I
    .locals 1

    iget v0, p0, Li8/v;->F:I

    return v0
.end method

.method public E()I
    .locals 1

    iget v0, p0, Li8/v;->G:I

    return v0
.end method

.method public F()Li8/v$d;
    .locals 1

    iget-object v0, p0, Li8/v;->K:Li8/v$d;

    return-object v0
.end method

.method public G()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/v;->E:I

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

.method public H()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/v;->E:I

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

.method public I()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/v;->E:I

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

.method public J()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/v;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public K()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/v;->E:I

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

.method public L()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/v;->E:I

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

.method public P()Li8/v$b;
    .locals 1

    invoke-static {}, Li8/v;->N()Li8/v$b;

    move-result-object v0

    return-object v0
.end method

.method public Q()Li8/v$b;
    .locals 1

    invoke-static {p0}, Li8/v;->O(Li8/v;)Li8/v$b;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 4

    .prologue
    iget v0, p0, Li8/v;->M:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/v;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/v;->F:I

    invoke-static {v1, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Li8/v;->E:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget v1, p0, Li8/v;->G:I

    invoke-static {v2, v1}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Li8/v;->E:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Li8/v;->H:Li8/v$c;

    invoke-virtual {v1}, Li8/v$c;->c()I

    move-result v1

    const/4 v3, 0x3

    invoke-static {v3, v1}, Lp8/f;->h(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Li8/v;->E:I

    const/16 v3, 0x8

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_4

    iget v1, p0, Li8/v;->I:I

    invoke-static {v2, v1}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Li8/v;->E:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x5

    iget v2, p0, Li8/v;->J:I

    invoke-static {v1, v2}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, Li8/v;->E:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    iget-object v1, p0, Li8/v;->K:Li8/v$d;

    invoke-virtual {v1}, Li8/v$d;->c()I

    move-result v1

    const/4 v2, 0x6

    invoke-static {v2, v1}, Lp8/f;->h(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget-object v1, p0, Li8/v;->D:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/v;->M:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/v;->P()Li8/v$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 2

    .prologue
    iget-byte v0, p0, Li8/v;->L:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    iput-byte v1, p0, Li8/v;->L:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/v;->Q()Li8/v$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Li8/v;->b()I

    iget v0, p0, Li8/v;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Li8/v;->F:I

    invoke-virtual {p1, v1, v0}, Lp8/f;->Z(II)V

    :cond_0
    iget v0, p0, Li8/v;->E:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/v;->G:I

    invoke-virtual {p1, v1, v0}, Lp8/f;->Z(II)V

    :cond_1
    iget v0, p0, Li8/v;->E:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Li8/v;->H:Li8/v$c;

    invoke-virtual {v0}, Li8/v$c;->c()I

    move-result v0

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v0}, Lp8/f;->R(II)V

    :cond_2
    iget v0, p0, Li8/v;->E:I

    const/16 v2, 0x8

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_3

    iget v0, p0, Li8/v;->I:I

    invoke-virtual {p1, v1, v0}, Lp8/f;->Z(II)V

    :cond_3
    iget v0, p0, Li8/v;->E:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x5

    iget v1, p0, Li8/v;->J:I

    invoke-virtual {p1, v0, v1}, Lp8/f;->Z(II)V

    :cond_4
    iget v0, p0, Li8/v;->E:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Li8/v;->K:Li8/v$d;

    invoke-virtual {v0}, Li8/v$d;->c()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lp8/f;->R(II)V

    :cond_5
    iget-object v0, p0, Li8/v;->D:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method
