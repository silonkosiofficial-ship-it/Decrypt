.class public LX4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV4/a;


# static fields
.field private static final f:Ljava/lang/String;


# instance fields
.field private final a:LY4/m;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Ljava/util/concurrent/Executor;

.field private final d:LY4/n;

.field private final e:Ll4/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "X4.e"

    sput-object v0, LX4/e;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LQ4/f;LF5/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LY4/m;

    invoke-direct {v0, p1}, LY4/m;-><init>(LQ4/f;)V

    iput-object v0, p0, LX4/e;->a:LY4/m;

    iput-object p3, p0, LX4/e;->b:Ljava/util/concurrent/Executor;

    iput-object p5, p0, LX4/e;->c:Ljava/util/concurrent/Executor;

    new-instance p3, LY4/n;

    invoke-direct {p3}, LY4/n;-><init>()V

    iput-object p3, p0, LX4/e;->d:LY4/n;

    invoke-interface {p2}, LF5/b;->get()Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_0

    invoke-static {p1, p4}, LX4/e;->f(LQ4/f;Ljava/util/concurrent/Executor;)Ll4/l;

    move-result-object p1

    iput-object p1, p0, LX4/e;->e:Ll4/l;

    return-void

    :cond_0
    invoke-interface {p2}, LF5/b;->get()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static synthetic b(LX4/e;Ljava/lang/String;)Ll4/l;
    .locals 0

    invoke-direct {p0, p1}, LX4/e;->i(Ljava/lang/String;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LX4/e;LX4/f;)LY4/a;
    .locals 0

    invoke-direct {p0, p1}, LX4/e;->h(LX4/f;)LY4/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LY4/a;)Ll4/l;
    .locals 0

    invoke-static {p0}, LX4/e;->j(LY4/a;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LQ4/f;Ll4/m;)V
    .locals 0

    invoke-static {p0, p1}, LX4/e;->g(LQ4/f;Ll4/m;)V

    return-void
.end method

.method static f(LQ4/f;Ljava/util/concurrent/Executor;)Ll4/l;
    .locals 2

    new-instance v0, Ll4/m;

    invoke-direct {v0}, Ll4/m;-><init>()V

    new-instance v1, LX4/a;

    invoke-direct {v1, p0, v0}, LX4/a;-><init>(LQ4/f;Ll4/m;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ll4/m;->a()Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic g(LQ4/f;Ll4/m;)V
    .locals 3

    .prologue
    new-instance v0, LX4/g;

    invoke-virtual {p0}, LQ4/f;->k()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, LQ4/f;->o()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LX4/g;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, LX4/g;->a()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, LX4/g;->b(Ljava/lang/String;)V

    :cond_0
    sget-object v0, LX4/e;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter this debug secret into the allow list in the Firebase Console for your project: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    nop

    invoke-virtual {p1, p0}, Ll4/m;->c(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic h(LX4/f;)LY4/a;
    .locals 3

    iget-object v0, p0, LX4/e;->a:LY4/m;

    invoke-virtual {p1}, LX4/f;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v1, 0x2

    iget-object v2, p0, LX4/e;->d:LY4/n;

    invoke-virtual {v0, p1, v1, v2}, LY4/m;->b([BILY4/n;)LY4/a;

    move-result-object p1

    return-object p1
.end method

.method private synthetic i(Ljava/lang/String;)Ll4/l;
    .locals 2

    new-instance v0, LX4/f;

    invoke-direct {v0, p1}, LX4/f;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, LX4/e;->c:Ljava/util/concurrent/Executor;

    new-instance v1, LX4/d;

    invoke-direct {v1, p0, v0}, LX4/d;-><init>(LX4/e;LX4/f;)V

    invoke-static {p1, v1}, Ll4/o;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic j(LY4/a;)Ll4/l;
    .locals 0

    invoke-static {p0}, LY4/b;->c(LY4/a;)LY4/b;

    move-result-object p0

    invoke-static {p0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ll4/l;
    .locals 3

    iget-object v0, p0, LX4/e;->e:Ll4/l;

    iget-object v1, p0, LX4/e;->b:Ljava/util/concurrent/Executor;

    new-instance v2, LX4/b;

    invoke-direct {v2, p0}, LX4/b;-><init>(LX4/e;)V

    invoke-virtual {v0, v1, v2}, Ll4/l;->p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;

    move-result-object v0

    iget-object v1, p0, LX4/e;->b:Ljava/util/concurrent/Executor;

    new-instance v2, LX4/c;

    invoke-direct {v2}, LX4/c;-><init>()V

    invoke-virtual {v0, v1, v2}, Ll4/l;->p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;

    move-result-object v0

    return-object v0
.end method
