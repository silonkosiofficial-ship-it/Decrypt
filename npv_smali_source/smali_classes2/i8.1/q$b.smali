.class public final Li8/q$b;
.super Lp8/i;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/q$b$b;,
        Li8/q$b$c;
    }
.end annotation


# static fields
.field private static final K:Li8/q$b;

.field public static L:Lp8/r;


# instance fields
.field private final D:Lp8/d;

.field private E:I

.field private F:Li8/q$b$c;

.field private G:Li8/q;

.field private H:I

.field private I:B

.field private J:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/q$b$a;

    invoke-direct {v0}, Li8/q$b$a;-><init>()V

    sput-object v0, Li8/q$b;->L:Lp8/r;

    new-instance v0, Li8/q$b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/q$b;-><init>(Z)V

    sput-object v0, Li8/q$b;->K:Li8/q$b;

    invoke-direct {v0}, Li8/q$b;->D()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 7

    .prologue
    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/q$b;->I:B

    iput v0, p0, Li8/q$b;->J:I

    invoke-direct {p0}, Li8/q$b;->D()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_8

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_6

    const/16 v5, 0x12

    if-eq v4, v5, :cond_3

    const/16 v5, 0x18

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
    iget v4, p0, Li8/q$b;->E:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, Li8/q$b;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v4

    iput v4, p0, Li8/q$b;->H:I

    goto :goto_0

    :cond_3
    iget v4, p0, Li8/q$b;->E:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_4

    iget-object v4, p0, Li8/q$b;->G:Li8/q;

    invoke-virtual {v4}, Li8/q;->B0()Li8/q$c;

    move-result-object v4

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    :goto_1
    sget-object v6, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v6, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v6

    check-cast v6, Li8/q;

    iput-object v6, p0, Li8/q$b;->G:Li8/q;

    if-eqz v4, :cond_5

    invoke-virtual {v4, v6}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v4}, Li8/q$c;->v()Li8/q;

    move-result-object v4

    iput-object v4, p0, Li8/q$b;->G:Li8/q;

    :cond_5
    iget v4, p0, Li8/q$b;->E:I

    or-int/2addr v4, v5

    iput v4, p0, Li8/q$b;->E:I

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, Lp8/e;->m()I

    move-result v5

    invoke-static {v5}, Li8/q$b$c;->e(I)Li8/q$b$c;

    move-result-object v6

    if-nez v6, :cond_7

    invoke-virtual {v2, v4}, Lp8/f;->n0(I)V

    invoke-virtual {v2, v5}, Lp8/f;->n0(I)V

    goto :goto_0

    :cond_7
    iget v4, p0, Li8/q$b;->E:I

    or-int/2addr v4, v1

    iput v4, p0, Li8/q$b;->E:I

    iput-object v6, p0, Li8/q$b;->F:Li8/q$b$c;
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

    iput-object p2, p0, Li8/q$b;->D:Lp8/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/q$b;->D:Lp8/d;

    throw p1

    :goto_5
    invoke-virtual {p0}, Lp8/i;->m()V

    throw p1

    :cond_8
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/q$b;->D:Lp8/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/q$b;->D:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/q$b;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$b;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i;-><init>(Lp8/i$b;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/q$b;->I:B

    iput v0, p0, Li8/q$b;->J:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/q$b;->D:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$b;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/q$b;-><init>(Lp8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/q$b;->I:B

    iput p1, p0, Li8/q$b;->J:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/q$b;->D:Lp8/d;

    return-void
.end method

.method private D()V
    .locals 1

    sget-object v0, Li8/q$b$c;->F:Li8/q$b$c;

    iput-object v0, p0, Li8/q$b;->F:Li8/q$b$c;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    iput-object v0, p0, Li8/q$b;->G:Li8/q;

    const/4 v0, 0x0

    iput v0, p0, Li8/q$b;->H:I

    return-void
.end method

.method public static E()Li8/q$b$b;
    .locals 1

    invoke-static {}, Li8/q$b$b;->n()Li8/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public static F(Li8/q$b;)Li8/q$b$b;
    .locals 1

    invoke-static {}, Li8/q$b;->E()Li8/q$b$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/q$b$b;->v(Li8/q$b;)Li8/q$b$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Li8/q$b;Li8/q$b$c;)Li8/q$b$c;
    .locals 0

    iput-object p1, p0, Li8/q$b;->F:Li8/q$b$c;

    return-object p1
.end method

.method static synthetic s(Li8/q$b;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/q$b;->G:Li8/q;

    return-object p1
.end method

.method static synthetic t(Li8/q$b;I)I
    .locals 0

    iput p1, p0, Li8/q$b;->H:I

    return p1
.end method

.method static synthetic u(Li8/q$b;I)I
    .locals 0

    iput p1, p0, Li8/q$b;->E:I

    return p1
.end method

.method static synthetic v(Li8/q$b;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/q$b;->D:Lp8/d;

    return-object p0
.end method

.method public static w()Li8/q$b;
    .locals 1

    sget-object v0, Li8/q$b;->K:Li8/q$b;

    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q$b;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public B()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q$b;->E:I

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

.method public C()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/q$b;->E:I

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

.method public G()Li8/q$b$b;
    .locals 1

    invoke-static {}, Li8/q$b;->E()Li8/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public H()Li8/q$b$b;
    .locals 1

    invoke-static {p0}, Li8/q$b;->F(Li8/q$b;)Li8/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 3

    .prologue
    iget v0, p0, Li8/q$b;->J:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/q$b;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Li8/q$b;->F:Li8/q$b$c;

    invoke-virtual {v0}, Li8/q$b$c;->c()I

    move-result v0

    invoke-static {v1, v0}, Lp8/f;->h(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Li8/q$b;->E:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Li8/q$b;->G:Li8/q;

    invoke-static {v2, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Li8/q$b;->E:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    const/4 v1, 0x3

    iget v2, p0, Li8/q$b;->H:I

    invoke-static {v1, v2}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget-object v1, p0, Li8/q$b;->D:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/q$b;->J:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/q$b;->G()Li8/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 3

    .prologue
    iget-byte v0, p0, Li8/q$b;->I:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Li8/q$b;->B()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Li8/q$b;->y()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Li8/q$b;->I:B

    return v2

    :cond_2
    iput-byte v1, p0, Li8/q$b;->I:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/q$b;->H()Li8/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/q$b;->b()I

    iget v0, p0, Li8/q$b;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/q$b;->F:Li8/q$b$c;

    invoke-virtual {v0}, Li8/q$b$c;->c()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lp8/f;->R(II)V

    :cond_0
    iget v0, p0, Li8/q$b;->E:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Li8/q$b;->G:Li8/q;

    invoke-virtual {p1, v1, v0}, Lp8/f;->c0(ILp8/p;)V

    :cond_1
    iget v0, p0, Li8/q$b;->E:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x3

    iget v1, p0, Li8/q$b;->H:I

    invoke-virtual {p1, v0, v1}, Lp8/f;->Z(II)V

    :cond_2
    iget-object v0, p0, Li8/q$b;->D:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public x()Li8/q$b$c;
    .locals 1

    iget-object v0, p0, Li8/q$b;->F:Li8/q$b$c;

    return-object v0
.end method

.method public y()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/q$b;->G:Li8/q;

    return-object v0
.end method

.method public z()I
    .locals 1

    iget v0, p0, Li8/q$b;->H:I

    return v0
.end method
