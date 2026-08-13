.class public abstract Lo2/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lo2/n;

.field private final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final c:Li7/n;


# direct methods
.method public constructor <init>(Lo2/n;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/w;->a:Lo2/n;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lo2/w;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Lo2/w$a;

    invoke-direct {p1, p0}, Lo2/w$a;-><init>(Lo2/w;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, Lo2/w;->c:Li7/n;

    return-void
.end method

.method public static final synthetic a(Lo2/w;)Lz2/h;
    .locals 0

    invoke-direct {p0}, Lo2/w;->d()Lz2/h;

    move-result-object p0

    return-object p0
.end method

.method private final d()Lz2/h;
    .locals 2

    invoke-virtual {p0}, Lo2/w;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo2/w;->a:Lo2/n;

    invoke-virtual {v1, v0}, Lo2/n;->h(Ljava/lang/String;)Lz2/h;

    move-result-object v0

    return-object v0
.end method

.method private final f()Lz2/h;
    .locals 1

    iget-object v0, p0, Lo2/w;->c:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/h;

    return-object v0
.end method

.method private final g(Z)Lz2/h;
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    invoke-direct {p0}, Lo2/w;->f()Lz2/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lo2/w;->d()Lz2/h;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public b()Lz2/h;
    .locals 3

    invoke-virtual {p0}, Lo2/w;->c()V

    iget-object v0, p0, Lo2/w;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    invoke-direct {p0, v0}, Lo2/w;->g(Z)Lz2/h;

    move-result-object v0

    return-object v0
.end method

.method protected c()V
    .locals 1

    iget-object v0, p0, Lo2/w;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->e()V

    return-void
.end method

.method protected abstract e()Ljava/lang/String;
.end method

.method public h(Lz2/h;)V
    .locals 1

    .prologue
    const-string v0, "statement"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lo2/w;->f()Lz2/h;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lo2/w;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method
