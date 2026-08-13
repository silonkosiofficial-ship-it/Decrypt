.class public final Lp2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp2/b$a;
    }
.end annotation


# static fields
.field public static final c:Lp2/b$a;

.field private static final d:Ljava/util/Map;


# instance fields
.field private final a:Ljava/util/concurrent/locks/ReentrantLock;

.field private final b:Lp2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp2/b$a;-><init>(Ly7/k;)V

    sput-object v0, Lp2/b;->c:Lp2/b$a;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lp2/b;->d:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    const-string v0, "filename"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lp2/b;->c:Lp2/b$a;

    invoke-static {v0, p1}, Lp2/b$a;->b(Lp2/b$a;Ljava/lang/String;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v1

    iput-object v1, p0, Lp2/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    if-eqz p2, :cond_0

    invoke-static {v0, p1}, Lp2/b$a;->a(Lp2/b$a;Ljava/lang/String;)Lp2/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lp2/b;->b:Lp2/c;

    return-void
.end method

.method public static final synthetic a()Ljava/util/Map;
    .locals 1

    sget-object v0, Lp2/b;->d:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public final b(Lx7/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lp2/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v0, p0, Lp2/b;->b:Lp2/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp2/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    :try_start_1
    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v0, p0, Lp2/b;->b:Lp2/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lp2/c;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    iget-object v0, p0, Lp2/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object p1

    :catchall_1
    move-exception p1

    :try_start_3
    iget-object v0, p0, Lp2/b;->b:Lp2/c;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lp2/c;->b()V

    :cond_2
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    iget-object v0, p0, Lp2/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method
