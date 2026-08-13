.class final Lv2/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv2/c$b$a;
    }
.end annotation


# static fields
.field public static final J:Lv2/c$b$a;


# instance fields
.field private final C:Ljava/lang/String;

.field private final D:Lv2/b;

.field private E:[I

.field private F:[J

.field private G:[D

.field private H:[Ljava/lang/String;

.field private I:[[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv2/c$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv2/c$b$a;-><init>(Ly7/k;)V

    sput-object v0, Lv2/c$b;->J:Lv2/c$b$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lv2/b;)V
    .locals 1

    const-string v0, "sql"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCloser"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/c$b;->C:Ljava/lang/String;

    iput-object p2, p0, Lv2/c$b;->D:Lv2/b;

    const/4 p1, 0x0

    new-array p2, p1, [I

    iput-object p2, p0, Lv2/c$b;->E:[I

    new-array p2, p1, [J

    iput-object p2, p0, Lv2/c$b;->F:[J

    new-array p2, p1, [D

    iput-object p2, p0, Lv2/c$b;->G:[D

    new-array p2, p1, [Ljava/lang/String;

    iput-object p2, p0, Lv2/c$b;->H:[Ljava/lang/String;

    new-array p1, p1, [[B

    iput-object p1, p0, Lv2/c$b;->I:[[B

    return-void
.end method

.method public static final synthetic a(Lv2/c$b;Lz2/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lv2/c$b;->g(Lz2/f;)V

    return-void
.end method

.method public static final synthetic f(Lv2/c$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lv2/c$b;->C:Ljava/lang/String;

    return-object p0
.end method

.method private final g(Lz2/f;)V
    .locals 6

    .prologue
    iget-object v0, p0, Lv2/c$b;->E:[I

    array-length v0, v0

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_5

    iget-object v3, p0, Lv2/c$b;->E:[I

    aget v3, v3, v2

    if-eq v3, v1, :cond_4

    const/4 v4, 0x2

    if-eq v3, v4, :cond_3

    const/4 v4, 0x3

    if-eq v3, v4, :cond_2

    const/4 v4, 0x4

    if-eq v3, v4, :cond_1

    const/4 v4, 0x5

    if-eq v3, v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1, v2}, Lz2/f;->M0(I)V

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lv2/c$b;->I:[[B

    aget-object v3, v3, v2

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, v2, v3}, Lz2/f;->p0(I[B)V

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lv2/c$b;->H:[Ljava/lang/String;

    aget-object v3, v3, v2

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, v2, v3}, Lz2/f;->C(ILjava/lang/String;)V

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lv2/c$b;->G:[D

    aget-wide v4, v3, v2

    invoke-interface {p1, v2, v4, v5}, Lz2/f;->P(ID)V

    goto :goto_1

    :cond_4
    iget-object v3, p0, Lv2/c$b;->F:[J

    aget-wide v4, v3, v2

    invoke-interface {p1, v2, v4, v5}, Lz2/f;->l(IJ)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method private final o(II)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    add-int/2addr p2, v0

    iget-object v1, p0, Lv2/c$b;->E:[I

    array-length v2, v1

    const-string v3, "copyOf(this, newSize)"

    if-ge v2, p2, :cond_0

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    invoke-static {v1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lv2/c$b;->E:[I

    :cond_0
    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lv2/c$b;->I:[[B

    array-length v0, p1

    if-ge v0, p2, :cond_5

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [[B

    iput-object p1, p0, Lv2/c$b;->I:[[B

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lv2/c$b;->H:[Ljava/lang/String;

    array-length v0, p1

    if-ge v0, p2, :cond_5

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Lv2/c$b;->H:[Ljava/lang/String;

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lv2/c$b;->G:[D

    array-length v0, p1

    if-ge v0, p2, :cond_5

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object p1

    invoke-static {p1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lv2/c$b;->G:[D

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lv2/c$b;->F:[J

    array-length v0, p1

    if-ge v0, p2, :cond_5

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    invoke-static {p1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lv2/c$b;->F:[J

    :cond_5
    :goto_0
    return-void
.end method

.method private final r(Lx7/l;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lv2/c$b;->D:Lv2/b;

    new-instance v1, Lv2/c$b$e;

    invoke-direct {v1, p0, p1}, Lv2/c$b$e;-><init>(Lv2/c$b;Lx7/l;)V

    invoke-virtual {v0, v1}, Lv2/b;->h(Lx7/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public C(ILjava/lang/String;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lv2/c$b;->o(II)V

    iget-object v1, p0, Lv2/c$b;->E:[I

    aput v0, v1, p1

    iget-object v0, p0, Lv2/c$b;->H:[Ljava/lang/String;

    aput-object p2, v0, p1

    return-void
.end method

.method public I()I
    .locals 1

    sget-object v0, Lv2/c$b$d;->D:Lv2/c$b$d;

    invoke-direct {p0, v0}, Lv2/c$b;->r(Lx7/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public M0(I)V
    .locals 2

    const/4 v0, 0x5

    invoke-direct {p0, v0, p1}, Lv2/c$b;->o(II)V

    iget-object v1, p0, Lv2/c$b;->E:[I

    aput v0, v1, p1

    return-void
.end method

.method public P(ID)V
    .locals 2

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lv2/c$b;->o(II)V

    iget-object v1, p0, Lv2/c$b;->E:[I

    aput v0, v1, p1

    iget-object v0, p0, Lv2/c$b;->G:[D

    aput-wide p2, v0, p1

    return-void
.end method

.method public close()V
    .locals 0

    invoke-virtual {p0}, Lv2/c$b;->i()V

    return-void
.end method

.method public i()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [I

    iput-object v1, p0, Lv2/c$b;->E:[I

    new-array v1, v0, [J

    iput-object v1, p0, Lv2/c$b;->F:[J

    new-array v1, v0, [D

    iput-object v1, p0, Lv2/c$b;->G:[D

    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Lv2/c$b;->H:[Ljava/lang/String;

    new-array v0, v0, [[B

    iput-object v0, p0, Lv2/c$b;->I:[[B

    return-void
.end method

.method public l(IJ)V
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lv2/c$b;->o(II)V

    iget-object v1, p0, Lv2/c$b;->E:[I

    aput v0, v1, p1

    iget-object v0, p0, Lv2/c$b;->F:[J

    aput-wide p2, v0, p1

    return-void
.end method

.method public n()V
    .locals 1

    sget-object v0, Lv2/c$b$b;->D:Lv2/c$b$b;

    invoke-direct {p0, v0}, Lv2/c$b;->r(Lx7/l;)Ljava/lang/Object;

    return-void
.end method

.method public o1()J
    .locals 2

    sget-object v0, Lv2/c$b$c;->D:Lv2/c$b$c;

    invoke-direct {p0, v0}, Lv2/c$b;->r(Lx7/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public p0(I[B)V
    .locals 2

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1}, Lv2/c$b;->o(II)V

    iget-object v1, p0, Lv2/c$b;->E:[I

    aput v0, v1, p1

    iget-object v0, p0, Lv2/c$b;->I:[[B

    aput-object p2, v0, p1

    return-void
.end method
