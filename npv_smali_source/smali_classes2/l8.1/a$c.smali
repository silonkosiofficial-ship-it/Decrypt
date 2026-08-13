.class public final Ll8/a$c;
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
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/a$c$b;
    }
.end annotation


# static fields
.field private static final J:Ll8/a$c;

.field public static K:Lp8/r;


# instance fields
.field private final D:Lp8/d;

.field private E:I

.field private F:I

.field private G:I

.field private H:B

.field private I:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll8/a$c$a;

    invoke-direct {v0}, Ll8/a$c$a;-><init>()V

    sput-object v0, Ll8/a$c;->K:Lp8/r;

    new-instance v0, Ll8/a$c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll8/a$c;-><init>(Z)V

    sput-object v0, Ll8/a$c;->J:Ll8/a$c;

    invoke-direct {v0}, Ll8/a$c;->A()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 6

    .prologue
    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Ll8/a$c;->H:B

    iput v0, p0, Ll8/a$c;->I:I

    invoke-direct {p0}, Ll8/a$c;->A()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_4

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_3

    const/16 v5, 0x10

    if-eq v4, v5, :cond_2

    invoke-virtual {p0, p1, v2, p2, v4}, Lp8/i;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

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
    iget v4, p0, Ll8/a$c;->E:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Ll8/a$c;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v4

    iput v4, p0, Ll8/a$c;->G:I

    goto :goto_0

    :cond_3
    iget v4, p0, Ll8/a$c;->E:I

    or-int/2addr v4, v1

    iput v4, p0, Ll8/a$c;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v4

    iput v4, p0, Ll8/a$c;->F:I
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

    iput-object p2, p0, Ll8/a$c;->D:Lp8/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Ll8/a$c;->D:Lp8/d;

    throw p1

    :goto_4
    invoke-virtual {p0}, Lp8/i;->m()V

    throw p1

    :cond_4
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Ll8/a$c;->D:Lp8/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Ll8/a$c;->D:Lp8/d;

    throw p1

    :goto_5
    invoke-virtual {p0}, Lp8/i;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Ll8/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ll8/a$c;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$b;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i;-><init>(Lp8/i$b;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Ll8/a$c;->H:B

    iput v0, p0, Ll8/a$c;->I:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Ll8/a$c;->D:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$b;Ll8/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ll8/a$c;-><init>(Lp8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Ll8/a$c;->H:B

    iput p1, p0, Ll8/a$c;->I:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Ll8/a$c;->D:Lp8/d;

    return-void
.end method

.method private A()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll8/a$c;->F:I

    iput v0, p0, Ll8/a$c;->G:I

    return-void
.end method

.method public static B()Ll8/a$c$b;
    .locals 1

    invoke-static {}, Ll8/a$c$b;->n()Ll8/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public static C(Ll8/a$c;)Ll8/a$c$b;
    .locals 1

    invoke-static {}, Ll8/a$c;->B()Ll8/a$c$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll8/a$c$b;->v(Ll8/a$c;)Ll8/a$c$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Ll8/a$c;I)I
    .locals 0

    iput p1, p0, Ll8/a$c;->F:I

    return p1
.end method

.method static synthetic s(Ll8/a$c;I)I
    .locals 0

    iput p1, p0, Ll8/a$c;->G:I

    return p1
.end method

.method static synthetic t(Ll8/a$c;I)I
    .locals 0

    iput p1, p0, Ll8/a$c;->E:I

    return p1
.end method

.method static synthetic u(Ll8/a$c;)Lp8/d;
    .locals 0

    iget-object p0, p0, Ll8/a$c;->D:Lp8/d;

    return-object p0
.end method

.method public static v()Ll8/a$c;
    .locals 1

    sget-object v0, Ll8/a$c;->J:Ll8/a$c;

    return-object v0
.end method


# virtual methods
.method public D()Ll8/a$c$b;
    .locals 1

    invoke-static {}, Ll8/a$c;->B()Ll8/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public E()Ll8/a$c$b;
    .locals 1

    invoke-static {p0}, Ll8/a$c;->C(Ll8/a$c;)Ll8/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 3

    .prologue
    iget v0, p0, Ll8/a$c;->I:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Ll8/a$c;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Ll8/a$c;->F:I

    invoke-static {v1, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Ll8/a$c;->E:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget v1, p0, Ll8/a$c;->G:I

    invoke-static {v2, v1}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Ll8/a$c;->D:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Ll8/a$c;->I:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Ll8/a$c;->D()Ll8/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 2

    .prologue
    iget-byte v0, p0, Ll8/a$c;->H:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    iput-byte v1, p0, Ll8/a$c;->H:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Ll8/a$c;->E()Ll8/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Ll8/a$c;->b()I

    iget v0, p0, Ll8/a$c;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll8/a$c;->F:I

    invoke-virtual {p1, v1, v0}, Lp8/f;->Z(II)V

    :cond_0
    iget v0, p0, Ll8/a$c;->E:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Ll8/a$c;->G:I

    invoke-virtual {p1, v1, v0}, Lp8/f;->Z(II)V

    :cond_1
    iget-object v0, p0, Ll8/a$c;->D:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public w()I
    .locals 1

    iget v0, p0, Ll8/a$c;->G:I

    return v0
.end method

.method public x()I
    .locals 1

    iget v0, p0, Ll8/a$c;->F:I

    return v0
.end method

.method public y()Z
    .locals 2

    .prologue
    iget v0, p0, Ll8/a$c;->E:I

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

.method public z()Z
    .locals 2

    .prologue
    iget v0, p0, Ll8/a$c;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
