.class public final LS5/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/sessions/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS5/x$c;,
        LS5/x$d;
    }
.end annotation


# static fields
.field private static final f:LS5/x$c;

.field private static final g:LB7/c;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lm7/i;

.field private final d:Ljava/util/concurrent/atomic/AtomicReference;

.field private final e:LZ8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LS5/x$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS5/x$c;-><init>(Ly7/k;)V

    sput-object v0, LS5/x;->f:LS5/x$c;

    sget-object v0, LS5/w;->a:LS5/w;

    invoke-virtual {v0}, LS5/w;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, LN1/b;

    sget-object v0, LS5/x$b;->D:LS5/x$b;

    invoke-direct {v2, v0}, LN1/b;-><init>(Lx7/l;)V

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LP1/a;->b(Ljava/lang/String;LN1/b;Lx7/l;LW8/N;ILjava/lang/Object;)LB7/c;

    move-result-object v0

    sput-object v0, LS5/x;->g:LB7/c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm7/i;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS5/x;->b:Landroid/content/Context;

    iput-object p2, p0, LS5/x;->c:Lm7/i;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, LS5/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, LS5/x;->f:LS5/x$c;

    invoke-static {v0, p1}, LS5/x$c;->a(LS5/x$c;Landroid/content/Context;)LM1/h;

    move-result-object p1

    invoke-interface {p1}, LM1/h;->getData()LZ8/f;

    move-result-object p1

    new-instance v0, LS5/x$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS5/x$e;-><init>(Lm7/e;)V

    invoke-static {p1, v0}, LZ8/h;->f(LZ8/f;Lx7/q;)LZ8/f;

    move-result-object p1

    new-instance v0, LS5/x$f;

    invoke-direct {v0, p1, p0}, LS5/x$f;-><init>(LZ8/f;LS5/x;)V

    iput-object v0, p0, LS5/x;->e:LZ8/f;

    invoke-static {p2}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v2

    new-instance v5, LS5/x$a;

    invoke-direct {v5, p0, v1}, LS5/x$a;-><init>(LS5/x;Lm7/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method

.method public static final synthetic c()LS5/x$c;
    .locals 1

    sget-object v0, LS5/x;->f:LS5/x$c;

    return-object v0
.end method

.method public static final synthetic d(LS5/x;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LS5/x;->b:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic e(LS5/x;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, LS5/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static final synthetic f()LB7/c;
    .locals 1

    sget-object v0, LS5/x;->g:LB7/c;

    return-object v0
.end method

.method public static final synthetic g(LS5/x;)LZ8/f;
    .locals 0

    iget-object p0, p0, LS5/x;->e:LZ8/f;

    return-object p0
.end method

.method public static final synthetic h(LS5/x;LQ1/f;)LS5/l;
    .locals 0

    invoke-direct {p0, p1}, LS5/x;->i(LQ1/f;)LS5/l;

    move-result-object p0

    return-object p0
.end method

.method private final i(LQ1/f;)LS5/l;
    .locals 2

    new-instance v0, LS5/l;

    sget-object v1, LS5/x$d;->a:LS5/x$d;

    invoke-virtual {v1}, LS5/x$d;->a()LQ1/f$a;

    move-result-object v1

    invoke-virtual {p1, v1}, LQ1/f;->b(LQ1/f$a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, p1}, LS5/l;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    iget-object v0, p0, LS5/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS5/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LS5/l;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 7

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LS5/x;->c:Lm7/i;

    invoke-static {v0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v1

    new-instance v4, LS5/x$g;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, LS5/x$g;-><init>(LS5/x;Ljava/lang/String;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method
