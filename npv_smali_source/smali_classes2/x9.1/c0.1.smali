.class public final Lx9/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Ljava/util/List;

.field private final c:Li7/n;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "serialName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "objectInstance"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lx9/c0;->a:Ljava/lang/Object;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lx9/c0;->b:Ljava/util/List;

    sget-object p2, Li7/r;->D:Li7/r;

    new-instance v0, Lx9/a0;

    invoke-direct {v0, p1, p0}, Lx9/a0;-><init>(Ljava/lang/String;Lx9/c0;)V

    invoke-static {p2, v0}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, Lx9/c0;->c:Li7/n;

    return-void
.end method

.method public static synthetic f(Lx9/c0;Lv9/a;)Li7/M;
    .locals 0

    invoke-static {p0, p1}, Lx9/c0;->i(Lx9/c0;Lv9/a;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;Lx9/c0;)Lv9/f;
    .locals 0

    invoke-static {p0, p1}, Lx9/c0;->h(Ljava/lang/String;Lx9/c0;)Lv9/f;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ljava/lang/String;Lx9/c0;)Lv9/f;
    .locals 3

    sget-object v0, Lv9/n$d;->a:Lv9/n$d;

    const/4 v1, 0x0

    new-array v1, v1, [Lv9/f;

    new-instance v2, Lx9/b0;

    invoke-direct {v2, p1}, Lx9/b0;-><init>(Lx9/c0;)V

    invoke-static {p0, v0, v1, v2}, Lv9/l;->c(Ljava/lang/String;Lv9/m;[Lv9/f;Lx7/l;)Lv9/f;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lx9/c0;Lv9/a;)Li7/M;
    .locals 1

    const-string v0, "$this$buildSerialDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lx9/c0;->b:Ljava/util/List;

    invoke-virtual {p1, p0}, Lv9/a;->h(Ljava/util/List;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method


# virtual methods
.method public a()Lv9/f;
    .locals 1

    iget-object v0, p0, Lx9/c0;->c:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv9/f;

    return-object v0
.end method

.method public b(Lw9/h;)Ljava/lang/Object;
    .locals 3

    .prologue
    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/c0;->a()Lv9/f;

    move-result-object v0

    invoke-interface {p1, v0}, Lw9/h;->a(Lv9/f;)Lw9/d;

    move-result-object p1

    invoke-interface {p1}, Lw9/d;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lx9/c0;->a()Lv9/f;

    move-result-object v1

    invoke-interface {p1, v1}, Lw9/d;->r(Lv9/f;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    :goto_0
    sget-object v1, Li7/M;->a:Li7/M;

    invoke-interface {p1, v0}, Lw9/d;->b(Lv9/f;)V

    iget-object p1, p0, Lx9/c0;->a:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Lt9/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected index "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lt9/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Lw9/j;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/c0;->a()Lv9/f;

    move-result-object p2

    invoke-interface {p1, p2}, Lw9/j;->a(Lv9/f;)Lw9/f;

    move-result-object p1

    invoke-virtual {p0}, Lx9/c0;->a()Lv9/f;

    move-result-object p2

    invoke-interface {p1, p2}, Lw9/f;->b(Lv9/f;)V

    return-void
.end method
