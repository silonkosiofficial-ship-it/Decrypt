.class public abstract LM8/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lj$/util/concurrent/ConcurrentHashMap;

.field private final b:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LM8/s;->a:Lj$/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, LM8/s;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static final synthetic a(LM8/s;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, LM8/s;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method


# virtual methods
.method public abstract b(Lj$/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lx7/l;)I
.end method

.method public final c(LF7/c;)LM8/n;
    .locals 1

    const-string v0, "kClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LM8/n;

    invoke-virtual {p0, p1}, LM8/s;->d(LF7/c;)I

    move-result p1

    invoke-direct {v0, p1}, LM8/n;-><init>(I)V

    return-object v0
.end method

.method public final d(LF7/c;)I
    .locals 1

    const-string v0, "kClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LF7/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, LM8/s;->e(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final e(Ljava/lang/String;)I
    .locals 2

    const-string v0, "keyQualifiedName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM8/s;->a:Lj$/util/concurrent/ConcurrentHashMap;

    new-instance v1, LM8/s$a;

    invoke-direct {v1, p0}, LM8/s$a;-><init>(LM8/s;)V

    invoke-virtual {p0, v0, p1, v1}, LM8/s;->b(Lj$/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lx7/l;)I

    move-result p1

    return p1
.end method

.method protected final f()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, LM8/s;->a:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lj$/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
