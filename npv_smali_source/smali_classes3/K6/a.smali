.class public final LK6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK6/a$a;
    }
.end annotation


# static fields
.field private static final synthetic b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private final a:Lio/ktor/utils/io/d;

.field private volatile synthetic content:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "content"

    const-class v2, LK6/a;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LK6/a;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lio/ktor/utils/io/d;)V
    .locals 1

    const-string v0, "origin"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/a;->a:Lio/ktor/utils/io/d;

    const/4 p1, 0x0

    iput-object p1, p0, LK6/a;->content:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic a(LK6/a;)Lio/ktor/utils/io/d;
    .locals 0

    iget-object p0, p0, LK6/a;->a:Lio/ktor/utils/io/d;

    return-object p0
.end method


# virtual methods
.method public final b()Lio/ktor/utils/io/d;
    .locals 7

    .prologue
    iget-object v0, p0, LK6/a;->a:Lio/ktor/utils/io/d;

    invoke-interface {v0}, Lio/ktor/utils/io/d;->a()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    iget-object v1, p0, LK6/a;->content:Ljava/lang/Object;

    iput-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    new-instance v1, LK6/a$a;

    const/4 v3, 0x1

    invoke-direct {v1, p0, v2, v3, v2}, LK6/a$a;-><init>(LK6/a;LW8/v;ILy7/k;)V

    iput-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    sget-object v3, LK6/a;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, v2, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LK6/a;->content:Ljava/lang/Object;

    iput-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v0, LK6/a$a;

    invoke-virtual {v0}, LK6/a$a;->f()Lio/ktor/utils/io/d;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    sget-object v1, LW8/t0;->C:LW8/t0;

    new-instance v4, LK6/a$b;

    invoke-direct {v4, v0, v2}, LK6/a$b;-><init>(Ly7/O;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lio/ktor/utils/io/k;->m(LW8/N;Lm7/i;ZLx7/p;ILjava/lang/Object;)Lio/ktor/utils/io/s;

    move-result-object v0

    invoke-virtual {v0}, Lio/ktor/utils/io/s;->b()Lio/ktor/utils/io/d;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v0, p0, LK6/a;->a:Lio/ktor/utils/io/d;

    invoke-interface {v0}, Lio/ktor/utils/io/d;->a()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    throw v0
.end method
