.class public final Ll8/a$d;
.super Lp8/i;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/a$d$b;
    }
.end annotation


# static fields
.field private static final M:Ll8/a$d;

.field public static N:Lp8/r;


# instance fields
.field private final D:Lp8/d;

.field private E:I

.field private F:Ll8/a$b;

.field private G:Ll8/a$c;

.field private H:Ll8/a$c;

.field private I:Ll8/a$c;

.field private J:Ll8/a$c;

.field private K:B

.field private L:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll8/a$d$a;

    invoke-direct {v0}, Ll8/a$d$a;-><init>()V

    sput-object v0, Ll8/a$d;->N:Lp8/r;

    new-instance v0, Ll8/a$d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll8/a$d;-><init>(Z)V

    sput-object v0, Ll8/a$d;->M:Ll8/a$d;

    invoke-direct {v0}, Ll8/a$d;->J()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 7

    .prologue
    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Ll8/a$d;->K:B

    iput v0, p0, Ll8/a$d;->L:I

    invoke-direct {p0}, Ll8/a$d;->J()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_11

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0xa

    const/4 v6, 0x0

    if-eq v4, v5, :cond_e

    const/16 v5, 0x12

    if-eq v4, v5, :cond_b

    const/16 v5, 0x1a

    if-eq v4, v5, :cond_8

    const/16 v5, 0x22

    if-eq v4, v5, :cond_5

    const/16 v5, 0x2a

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

    goto/16 :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    :cond_2
    iget v4, p0, Ll8/a$d;->E:I

    const/16 v5, 0x10

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_3

    iget-object v4, p0, Ll8/a$d;->J:Ll8/a$c;

    invoke-virtual {v4}, Ll8/a$c;->E()Ll8/a$c$b;

    move-result-object v6

    :cond_3
    sget-object v4, Ll8/a$c;->K:Lp8/r;

    invoke-virtual {p1, v4, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v4

    check-cast v4, Ll8/a$c;

    iput-object v4, p0, Ll8/a$d;->J:Ll8/a$c;

    if-eqz v6, :cond_4

    invoke-virtual {v6, v4}, Ll8/a$c$b;->v(Ll8/a$c;)Ll8/a$c$b;

    invoke-virtual {v6}, Ll8/a$c$b;->q()Ll8/a$c;

    move-result-object v4

    iput-object v4, p0, Ll8/a$d;->J:Ll8/a$c;

    :cond_4
    iget v4, p0, Ll8/a$d;->E:I

    :goto_1
    or-int/2addr v4, v5

    iput v4, p0, Ll8/a$d;->E:I

    goto :goto_0

    :cond_5
    iget v4, p0, Ll8/a$d;->E:I

    const/16 v5, 0x8

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_6

    iget-object v4, p0, Ll8/a$d;->I:Ll8/a$c;

    invoke-virtual {v4}, Ll8/a$c;->E()Ll8/a$c$b;

    move-result-object v6

    :cond_6
    sget-object v4, Ll8/a$c;->K:Lp8/r;

    invoke-virtual {p1, v4, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v4

    check-cast v4, Ll8/a$c;

    iput-object v4, p0, Ll8/a$d;->I:Ll8/a$c;

    if-eqz v6, :cond_7

    invoke-virtual {v6, v4}, Ll8/a$c$b;->v(Ll8/a$c;)Ll8/a$c$b;

    invoke-virtual {v6}, Ll8/a$c$b;->q()Ll8/a$c;

    move-result-object v4

    iput-object v4, p0, Ll8/a$d;->I:Ll8/a$c;

    :cond_7
    iget v4, p0, Ll8/a$d;->E:I

    goto :goto_1

    :cond_8
    iget v4, p0, Ll8/a$d;->E:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_9

    iget-object v4, p0, Ll8/a$d;->H:Ll8/a$c;

    invoke-virtual {v4}, Ll8/a$c;->E()Ll8/a$c$b;

    move-result-object v6

    :cond_9
    sget-object v4, Ll8/a$c;->K:Lp8/r;

    invoke-virtual {p1, v4, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v4

    check-cast v4, Ll8/a$c;

    iput-object v4, p0, Ll8/a$d;->H:Ll8/a$c;

    if-eqz v6, :cond_a

    invoke-virtual {v6, v4}, Ll8/a$c$b;->v(Ll8/a$c;)Ll8/a$c$b;

    invoke-virtual {v6}, Ll8/a$c$b;->q()Ll8/a$c;

    move-result-object v4

    iput-object v4, p0, Ll8/a$d;->H:Ll8/a$c;

    :cond_a
    iget v4, p0, Ll8/a$d;->E:I

    goto :goto_1

    :cond_b
    iget v4, p0, Ll8/a$d;->E:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_c

    iget-object v4, p0, Ll8/a$d;->G:Ll8/a$c;

    invoke-virtual {v4}, Ll8/a$c;->E()Ll8/a$c$b;

    move-result-object v6

    :cond_c
    sget-object v4, Ll8/a$c;->K:Lp8/r;

    invoke-virtual {p1, v4, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v4

    check-cast v4, Ll8/a$c;

    iput-object v4, p0, Ll8/a$d;->G:Ll8/a$c;

    if-eqz v6, :cond_d

    invoke-virtual {v6, v4}, Ll8/a$c$b;->v(Ll8/a$c;)Ll8/a$c$b;

    invoke-virtual {v6}, Ll8/a$c$b;->q()Ll8/a$c;

    move-result-object v4

    iput-object v4, p0, Ll8/a$d;->G:Ll8/a$c;

    :cond_d
    iget v4, p0, Ll8/a$d;->E:I

    goto :goto_1

    :cond_e
    iget v4, p0, Ll8/a$d;->E:I

    and-int/2addr v4, v1

    if-ne v4, v1, :cond_f

    iget-object v4, p0, Ll8/a$d;->F:Ll8/a$b;

    invoke-virtual {v4}, Ll8/a$b;->E()Ll8/a$b$b;

    move-result-object v6

    :cond_f
    sget-object v4, Ll8/a$b;->K:Lp8/r;

    invoke-virtual {p1, v4, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v4

    check-cast v4, Ll8/a$b;

    iput-object v4, p0, Ll8/a$d;->F:Ll8/a$b;

    if-eqz v6, :cond_10

    invoke-virtual {v6, v4}, Ll8/a$b$b;->v(Ll8/a$b;)Ll8/a$b$b;

    invoke-virtual {v6}, Ll8/a$b$b;->q()Ll8/a$b;

    move-result-object v4

    iput-object v4, p0, Ll8/a$d;->F:Ll8/a$b;

    :cond_10
    iget v4, p0, Ll8/a$d;->E:I

    or-int/2addr v4, v1

    iput v4, p0, Ll8/a$d;->E:I
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

    iput-object p2, p0, Ll8/a$d;->D:Lp8/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Ll8/a$d;->D:Lp8/d;

    throw p1

    :goto_5
    invoke-virtual {p0}, Lp8/i;->m()V

    throw p1

    :cond_11
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Ll8/a$d;->D:Lp8/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Ll8/a$d;->D:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Ll8/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ll8/a$d;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$b;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i;-><init>(Lp8/i$b;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Ll8/a$d;->K:B

    iput v0, p0, Ll8/a$d;->L:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Ll8/a$d;->D:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$b;Ll8/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ll8/a$d;-><init>(Lp8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Ll8/a$d;->K:B

    iput p1, p0, Ll8/a$d;->L:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Ll8/a$d;->D:Lp8/d;

    return-void
.end method

.method private J()V
    .locals 1

    invoke-static {}, Ll8/a$b;->v()Ll8/a$b;

    move-result-object v0

    iput-object v0, p0, Ll8/a$d;->F:Ll8/a$b;

    invoke-static {}, Ll8/a$c;->v()Ll8/a$c;

    move-result-object v0

    iput-object v0, p0, Ll8/a$d;->G:Ll8/a$c;

    invoke-static {}, Ll8/a$c;->v()Ll8/a$c;

    move-result-object v0

    iput-object v0, p0, Ll8/a$d;->H:Ll8/a$c;

    invoke-static {}, Ll8/a$c;->v()Ll8/a$c;

    move-result-object v0

    iput-object v0, p0, Ll8/a$d;->I:Ll8/a$c;

    invoke-static {}, Ll8/a$c;->v()Ll8/a$c;

    move-result-object v0

    iput-object v0, p0, Ll8/a$d;->J:Ll8/a$c;

    return-void
.end method

.method public static K()Ll8/a$d$b;
    .locals 1

    invoke-static {}, Ll8/a$d$b;->n()Ll8/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public static L(Ll8/a$d;)Ll8/a$d$b;
    .locals 1

    invoke-static {}, Ll8/a$d;->K()Ll8/a$d$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll8/a$d$b;->x(Ll8/a$d;)Ll8/a$d$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Ll8/a$d;Ll8/a$b;)Ll8/a$b;
    .locals 0

    iput-object p1, p0, Ll8/a$d;->F:Ll8/a$b;

    return-object p1
.end method

.method static synthetic s(Ll8/a$d;Ll8/a$c;)Ll8/a$c;
    .locals 0

    iput-object p1, p0, Ll8/a$d;->G:Ll8/a$c;

    return-object p1
.end method

.method static synthetic t(Ll8/a$d;Ll8/a$c;)Ll8/a$c;
    .locals 0

    iput-object p1, p0, Ll8/a$d;->H:Ll8/a$c;

    return-object p1
.end method

.method static synthetic u(Ll8/a$d;Ll8/a$c;)Ll8/a$c;
    .locals 0

    iput-object p1, p0, Ll8/a$d;->I:Ll8/a$c;

    return-object p1
.end method

.method static synthetic v(Ll8/a$d;Ll8/a$c;)Ll8/a$c;
    .locals 0

    iput-object p1, p0, Ll8/a$d;->J:Ll8/a$c;

    return-object p1
.end method

.method static synthetic w(Ll8/a$d;I)I
    .locals 0

    iput p1, p0, Ll8/a$d;->E:I

    return p1
.end method

.method static synthetic x(Ll8/a$d;)Lp8/d;
    .locals 0

    iget-object p0, p0, Ll8/a$d;->D:Lp8/d;

    return-object p0
.end method

.method public static y()Ll8/a$d;
    .locals 1

    sget-object v0, Ll8/a$d;->M:Ll8/a$d;

    return-object v0
.end method


# virtual methods
.method public A()Ll8/a$b;
    .locals 1

    iget-object v0, p0, Ll8/a$d;->F:Ll8/a$b;

    return-object v0
.end method

.method public B()Ll8/a$c;
    .locals 1

    iget-object v0, p0, Ll8/a$d;->H:Ll8/a$c;

    return-object v0
.end method

.method public C()Ll8/a$c;
    .locals 1

    iget-object v0, p0, Ll8/a$d;->I:Ll8/a$c;

    return-object v0
.end method

.method public D()Ll8/a$c;
    .locals 1

    iget-object v0, p0, Ll8/a$d;->G:Ll8/a$c;

    return-object v0
.end method

.method public E()Z
    .locals 2

    .prologue
    iget v0, p0, Ll8/a$d;->E:I

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

.method public F()Z
    .locals 2

    .prologue
    iget v0, p0, Ll8/a$d;->E:I

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
    iget v0, p0, Ll8/a$d;->E:I

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

.method public H()Z
    .locals 2

    .prologue
    iget v0, p0, Ll8/a$d;->E:I

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

.method public I()Z
    .locals 2

    .prologue
    iget v0, p0, Ll8/a$d;->E:I

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

.method public M()Ll8/a$d$b;
    .locals 1

    invoke-static {}, Ll8/a$d;->K()Ll8/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public N()Ll8/a$d$b;
    .locals 1

    invoke-static {p0}, Ll8/a$d;->L(Ll8/a$d;)Ll8/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 4

    .prologue
    iget v0, p0, Ll8/a$d;->L:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Ll8/a$d;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ll8/a$d;->F:Ll8/a$b;

    invoke-static {v1, v0}, Lp8/f;->r(ILp8/p;)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Ll8/a$d;->E:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Ll8/a$d;->G:Ll8/a$c;

    invoke-static {v2, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Ll8/a$d;->E:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    const/4 v1, 0x3

    iget-object v3, p0, Ll8/a$d;->H:Ll8/a$c;

    invoke-static {v1, v3}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Ll8/a$d;->E:I

    const/16 v3, 0x8

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_4

    iget-object v1, p0, Ll8/a$d;->I:Ll8/a$c;

    invoke-static {v2, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Ll8/a$d;->E:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x5

    iget-object v2, p0, Ll8/a$d;->J:Ll8/a$c;

    invoke-static {v1, v2}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Ll8/a$d;->D:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Ll8/a$d;->L:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Ll8/a$d;->M()Ll8/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 2

    .prologue
    iget-byte v0, p0, Ll8/a$d;->K:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    iput-byte v1, p0, Ll8/a$d;->K:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Ll8/a$d;->N()Ll8/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Ll8/a$d;->b()I

    iget v0, p0, Ll8/a$d;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll8/a$d;->F:Ll8/a$b;

    invoke-virtual {p1, v1, v0}, Lp8/f;->c0(ILp8/p;)V

    :cond_0
    iget v0, p0, Ll8/a$d;->E:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ll8/a$d;->G:Ll8/a$c;

    invoke-virtual {p1, v1, v0}, Lp8/f;->c0(ILp8/p;)V

    :cond_1
    iget v0, p0, Ll8/a$d;->E:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x3

    iget-object v2, p0, Ll8/a$d;->H:Ll8/a$c;

    invoke-virtual {p1, v0, v2}, Lp8/f;->c0(ILp8/p;)V

    :cond_2
    iget v0, p0, Ll8/a$d;->E:I

    const/16 v2, 0x8

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Ll8/a$d;->I:Ll8/a$c;

    invoke-virtual {p1, v1, v0}, Lp8/f;->c0(ILp8/p;)V

    :cond_3
    iget v0, p0, Ll8/a$d;->E:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x5

    iget-object v1, p0, Ll8/a$d;->J:Ll8/a$c;

    invoke-virtual {p1, v0, v1}, Lp8/f;->c0(ILp8/p;)V

    :cond_4
    iget-object v0, p0, Ll8/a$d;->D:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public z()Ll8/a$c;
    .locals 1

    iget-object v0, p0, Ll8/a$d;->J:Ll8/a$c;

    return-object v0
.end method
