.class public final Li8/g;
.super Lp8/i$d;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/g$b;
    }
.end annotation


# static fields
.field private static final J:Li8/g;

.field public static K:Lp8/r;


# instance fields
.field private final E:Lp8/d;

.field private F:I

.field private G:I

.field private H:B

.field private I:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/g$a;

    invoke-direct {v0}, Li8/g$a;-><init>()V

    sput-object v0, Li8/g;->K:Lp8/r;

    new-instance v0, Li8/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/g;-><init>(Z)V

    sput-object v0, Li8/g;->J:Li8/g;

    invoke-direct {v0}, Li8/g;->H()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 6

    .prologue
    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/g;->H:B

    iput v0, p0, Li8/g;->I:I

    invoke-direct {p0}, Li8/g;->H()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_3

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_2

    invoke-virtual {p0, p1, v2, p2, v4}, Lp8/i$d;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_2
    iget v4, p0, Li8/g;->F:I

    or-int/2addr v4, v1

    iput v4, p0, Li8/g;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v4

    iput v4, p0, Li8/g;->G:I
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

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

    iput-object p2, p0, Li8/g;->E:Lp8/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/g;->E:Lp8/d;

    throw p1

    :goto_4
    invoke-virtual {p0}, Lp8/i$d;->m()V

    throw p1

    :cond_3
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/g;->E:Lp8/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/g;->E:Lp8/d;

    throw p1

    :goto_5
    invoke-virtual {p0}, Lp8/i$d;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/g;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$c;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i$d;-><init>(Lp8/i$c;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/g;->H:B

    iput v0, p0, Li8/g;->I:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/g;->E:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$c;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/g;-><init>(Lp8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/g;->H:B

    iput p1, p0, Li8/g;->I:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/g;->E:Lp8/d;

    return-void
.end method

.method static synthetic A(Li8/g;I)I
    .locals 0

    iput p1, p0, Li8/g;->G:I

    return p1
.end method

.method static synthetic B(Li8/g;I)I
    .locals 0

    iput p1, p0, Li8/g;->F:I

    return p1
.end method

.method static synthetic C(Li8/g;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/g;->E:Lp8/d;

    return-object p0
.end method

.method public static D()Li8/g;
    .locals 1

    sget-object v0, Li8/g;->J:Li8/g;

    return-object v0
.end method

.method private H()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li8/g;->G:I

    return-void
.end method

.method public static I()Li8/g$b;
    .locals 1

    invoke-static {}, Li8/g$b;->t()Li8/g$b;

    move-result-object v0

    return-object v0
.end method

.method public static J(Li8/g;)Li8/g$b;
    .locals 1

    invoke-static {}, Li8/g;->I()Li8/g$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/g$b;->z(Li8/g;)Li8/g$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public E()Li8/g;
    .locals 1

    sget-object v0, Li8/g;->J:Li8/g;

    return-object v0
.end method

.method public F()I
    .locals 1

    iget v0, p0, Li8/g;->G:I

    return v0
.end method

.method public G()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/g;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public K()Li8/g$b;
    .locals 1

    invoke-static {}, Li8/g;->I()Li8/g$b;

    move-result-object v0

    return-object v0
.end method

.method public L()Li8/g$b;
    .locals 1

    invoke-static {p0}, Li8/g;->J(Li8/g;)Li8/g$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/g;->E()Li8/g;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 2

    .prologue
    iget v0, p0, Li8/g;->I:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/g;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/g;->G:I

    invoke-static {v1, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lp8/i$d;->t()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Li8/g;->E:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/g;->I:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/g;->K()Li8/g$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 3

    .prologue
    iget-byte v0, p0, Li8/g;->H:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lp8/i$d;->s()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Li8/g;->H:B

    return v2

    :cond_2
    iput-byte v1, p0, Li8/g;->H:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/g;->L()Li8/g$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Li8/g;->b()I

    invoke-virtual {p0}, Lp8/i$d;->y()Lp8/i$d$a;

    move-result-object v0

    iget v1, p0, Li8/g;->F:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Li8/g;->G:I

    invoke-virtual {p1, v2, v1}, Lp8/f;->Z(II)V

    :cond_0
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lp8/i$d$a;->a(ILp8/f;)V

    iget-object v0, p0, Li8/g;->E:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method
