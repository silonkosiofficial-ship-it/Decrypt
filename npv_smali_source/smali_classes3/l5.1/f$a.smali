.class public final Ll5/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Ll5/f$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Ll5/f$a;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Ll5/f$a;->j()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ll5/f$a;)Z
    .locals 0

    invoke-direct {p0}, Ll5/f$a;->k()Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(Ll5/f$a;)Z
    .locals 0

    invoke-direct {p0}, Ll5/f$a;->l()Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(Ll5/f$a;)Z
    .locals 0

    invoke-direct {p0}, Ll5/f$a;->m()Z

    move-result p0

    return p0
.end method

.method private final h(Lx7/a;Lx7/a;)V
    .locals 0

    .prologue
    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    invoke-interface {p2}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Lh5/g;->b(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll5/f$a;->i()Z

    :cond_0
    return-void
.end method

.method private final j()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final k()Z
    .locals 5

    invoke-direct {p0}, Ll5/f$a;->j()Ljava/lang/String;

    move-result-object v0

    const-string v1, "threadName"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const-string v3, "Firebase Background Thread #"

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, LS8/r;->c0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final l()Z
    .locals 5

    invoke-direct {p0}, Ll5/f$a;->j()Ljava/lang/String;

    move-result-object v0

    const-string v1, "threadName"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const-string v3, "Firebase Blocking Thread #"

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, LS8/r;->c0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final m()Z
    .locals 1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->isCurrentThread()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method


# virtual methods
.method public final e()V
    .locals 2

    new-instance v0, Ll5/f$a$a;

    invoke-direct {v0, p0}, Ll5/f$a$a;-><init>(Ljava/lang/Object;)V

    sget-object v1, Ll5/f$a$b;->D:Ll5/f$a$b;

    invoke-direct {p0, v0, v1}, Ll5/f$a;->h(Lx7/a;Lx7/a;)V

    return-void
.end method

.method public final f()V
    .locals 2

    new-instance v0, Ll5/f$a$c;

    invoke-direct {v0, p0}, Ll5/f$a$c;-><init>(Ljava/lang/Object;)V

    sget-object v1, Ll5/f$a$d;->D:Ll5/f$a$d;

    invoke-direct {p0, v0, v1}, Ll5/f$a;->h(Lx7/a;Lx7/a;)V

    return-void
.end method

.method public final g()V
    .locals 2

    new-instance v0, Ll5/f$a$e;

    invoke-direct {v0, p0}, Ll5/f$a$e;-><init>(Ljava/lang/Object;)V

    sget-object v1, Ll5/f$a$f;->D:Ll5/f$a$f;

    invoke-direct {p0, v0, v1}, Ll5/f$a;->h(Lx7/a;Lx7/a;)V

    return-void
.end method

.method public final i()Z
    .locals 1

    invoke-static {}, Ll5/f;->a()Z

    move-result v0

    return v0
.end method

.method public final n(Z)V
    .locals 0

    invoke-static {p1}, Ll5/f;->b(Z)V

    return-void
.end method
