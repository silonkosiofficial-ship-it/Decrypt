.class public final Li8/b$b;
.super Lp8/i;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/b$b$b;,
        Li8/b$b$c;
    }
.end annotation


# static fields
.field private static final J:Li8/b$b;

.field public static K:Lp8/r;


# instance fields
.field private final D:Lp8/d;

.field private E:I

.field private F:I

.field private G:Li8/b$b$c;

.field private H:B

.field private I:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/b$b$a;

    invoke-direct {v0}, Li8/b$b$a;-><init>()V

    sput-object v0, Li8/b$b;->K:Lp8/r;

    new-instance v0, Li8/b$b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/b$b;-><init>(Z)V

    sput-object v0, Li8/b$b;->J:Li8/b$b;

    invoke-direct {v0}, Li8/b$b;->A()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 7

    .prologue
    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/b$b;->H:B

    iput v0, p0, Li8/b$b;->I:I

    invoke-direct {p0}, Li8/b$b;->A()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_6

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_5

    const/16 v5, 0x12

    if-eq v4, v5, :cond_2

    invoke-virtual {p0, p1, v2, p2, v4}, Lp8/i;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_2
    iget v4, p0, Li8/b$b;->E:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_3

    iget-object v4, p0, Li8/b$b;->G:Li8/b$b$c;

    invoke-virtual {v4}, Li8/b$b$c;->i0()Li8/b$b$c$b;

    move-result-object v4

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_1
    sget-object v6, Li8/b$b$c;->T:Lp8/r;

    invoke-virtual {p1, v6, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v6

    check-cast v6, Li8/b$b$c;

    iput-object v6, p0, Li8/b$b;->G:Li8/b$b$c;

    if-eqz v4, :cond_4

    invoke-virtual {v4, v6}, Li8/b$b$c$b;->x(Li8/b$b$c;)Li8/b$b$c$b;

    invoke-virtual {v4}, Li8/b$b$c$b;->q()Li8/b$b$c;

    move-result-object v4

    iput-object v4, p0, Li8/b$b;->G:Li8/b$b$c;

    :cond_4
    iget v4, p0, Li8/b$b;->E:I

    or-int/2addr v4, v5

    iput v4, p0, Li8/b$b;->E:I

    goto :goto_0

    :cond_5
    iget v4, p0, Li8/b$b;->E:I

    or-int/2addr v4, v1

    iput v4, p0, Li8/b$b;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v4

    iput v4, p0, Li8/b$b;->F:I
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

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

    iput-object p2, p0, Li8/b$b;->D:Lp8/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/b$b;->D:Lp8/d;

    throw p1

    :goto_5
    invoke-virtual {p0}, Lp8/i;->m()V

    throw p1

    :cond_6
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/b$b;->D:Lp8/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/b$b;->D:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/b$b;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$b;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i;-><init>(Lp8/i$b;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/b$b;->H:B

    iput v0, p0, Li8/b$b;->I:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/b$b;->D:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$b;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/b$b;-><init>(Lp8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/b$b;->H:B

    iput p1, p0, Li8/b$b;->I:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/b$b;->D:Lp8/d;

    return-void
.end method

.method private A()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li8/b$b;->F:I

    invoke-static {}, Li8/b$b$c;->L()Li8/b$b$c;

    move-result-object v0

    iput-object v0, p0, Li8/b$b;->G:Li8/b$b$c;

    return-void
.end method

.method public static B()Li8/b$b$b;
    .locals 1

    invoke-static {}, Li8/b$b$b;->n()Li8/b$b$b;

    move-result-object v0

    return-object v0
.end method

.method public static C(Li8/b$b;)Li8/b$b$b;
    .locals 1

    invoke-static {}, Li8/b$b;->B()Li8/b$b$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/b$b$b;->v(Li8/b$b;)Li8/b$b$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Li8/b$b;I)I
    .locals 0

    iput p1, p0, Li8/b$b;->F:I

    return p1
.end method

.method static synthetic s(Li8/b$b;Li8/b$b$c;)Li8/b$b$c;
    .locals 0

    iput-object p1, p0, Li8/b$b;->G:Li8/b$b$c;

    return-object p1
.end method

.method static synthetic t(Li8/b$b;I)I
    .locals 0

    iput p1, p0, Li8/b$b;->E:I

    return p1
.end method

.method static synthetic u(Li8/b$b;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/b$b;->D:Lp8/d;

    return-object p0
.end method

.method public static v()Li8/b$b;
    .locals 1

    sget-object v0, Li8/b$b;->J:Li8/b$b;

    return-object v0
.end method


# virtual methods
.method public D()Li8/b$b$b;
    .locals 1

    invoke-static {}, Li8/b$b;->B()Li8/b$b$b;

    move-result-object v0

    return-object v0
.end method

.method public E()Li8/b$b$b;
    .locals 1

    invoke-static {p0}, Li8/b$b;->C(Li8/b$b;)Li8/b$b$b;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 3

    .prologue
    iget v0, p0, Li8/b$b;->I:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/b$b;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/b$b;->F:I

    invoke-static {v1, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Li8/b$b;->E:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Li8/b$b;->G:Li8/b$b$c;

    invoke-static {v2, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Li8/b$b;->D:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/b$b;->I:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/b$b;->D()Li8/b$b$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 3

    .prologue
    iget-byte v0, p0, Li8/b$b;->H:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Li8/b$b;->y()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Li8/b$b;->H:B

    return v2

    :cond_2
    invoke-virtual {p0}, Li8/b$b;->z()Z

    move-result v0

    if-nez v0, :cond_3

    iput-byte v2, p0, Li8/b$b;->H:B

    return v2

    :cond_3
    invoke-virtual {p0}, Li8/b$b;->x()Li8/b$b$c;

    move-result-object v0

    invoke-virtual {v0}, Li8/b$b$c;->d()Z

    move-result v0

    if-nez v0, :cond_4

    iput-byte v2, p0, Li8/b$b;->H:B

    return v2

    :cond_4
    iput-byte v1, p0, Li8/b$b;->H:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/b$b;->E()Li8/b$b$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/b$b;->b()I

    iget v0, p0, Li8/b$b;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Li8/b$b;->F:I

    invoke-virtual {p1, v1, v0}, Lp8/f;->Z(II)V

    :cond_0
    iget v0, p0, Li8/b$b;->E:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Li8/b$b;->G:Li8/b$b$c;

    invoke-virtual {p1, v1, v0}, Lp8/f;->c0(ILp8/p;)V

    :cond_1
    iget-object v0, p0, Li8/b$b;->D:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public w()I
    .locals 1

    iget v0, p0, Li8/b$b;->F:I

    return v0
.end method

.method public x()Li8/b$b$c;
    .locals 1

    iget-object v0, p0, Li8/b$b;->G:Li8/b$b$c;

    return-object v0
.end method

.method public y()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/b$b;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public z()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/b$b;->E:I

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
