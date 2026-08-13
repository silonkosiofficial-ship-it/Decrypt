.class abstract synthetic LZ8/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lx7/l;

.field private static final b:Lx7/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZ8/m;

    invoke-direct {v0}, LZ8/m;-><init>()V

    sput-object v0, LZ8/o;->a:Lx7/l;

    new-instance v0, LZ8/n;

    invoke-direct {v0}, LZ8/n;-><init>()V

    sput-object v0, LZ8/o;->b:Lx7/p;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LZ8/o;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, LZ8/o;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static final e(LZ8/f;)LZ8/f;
    .locals 2

    .prologue
    instance-of v0, p0, LZ8/N;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LZ8/o;->a:Lx7/l;

    sget-object v1, LZ8/o;->b:Lx7/p;

    invoke-static {p0, v0, v1}, LZ8/o;->f(LZ8/f;Lx7/l;Lx7/p;)LZ8/f;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final f(LZ8/f;Lx7/l;Lx7/p;)LZ8/f;
    .locals 2

    .prologue
    instance-of v0, p0, LZ8/e;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LZ8/e;

    iget-object v1, v0, LZ8/e;->D:Lx7/l;

    if-ne v1, p1, :cond_0

    iget-object v0, v0, LZ8/e;->E:Lx7/p;

    if-ne v0, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/e;

    invoke-direct {v0, p0, p1, p2}, LZ8/e;-><init>(LZ8/f;Lx7/l;Lx7/p;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
