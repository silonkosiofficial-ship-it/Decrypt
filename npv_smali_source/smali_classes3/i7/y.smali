.class final Li7/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/n;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/y$a;
    }
.end annotation


# static fields
.field public static final F:Li7/y$a;

.field private static final G:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile C:Lx7/a;

.field private volatile D:Ljava/lang/Object;

.field private final E:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li7/y$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li7/y$a;-><init>(Ly7/k;)V

    sput-object v0, Li7/y;->F:Li7/y$a;

    const-class v0, Ljava/lang/Object;

    const-string v1, "D"

    const-class v2, Li7/y;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Li7/y;->G:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lx7/a;)V
    .locals 1

    const-string v0, "initializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li7/y;->C:Lx7/a;

    sget-object p1, Li7/I;->a:Li7/I;

    iput-object p1, p0, Li7/y;->D:Ljava/lang/Object;

    iput-object p1, p0, Li7/y;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public d()Z
    .locals 2

    .prologue
    iget-object v0, p0, Li7/y;->D:Ljava/lang/Object;

    sget-object v1, Li7/I;->a:Li7/I;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, Li7/y;->D:Ljava/lang/Object;

    sget-object v1, Li7/I;->a:Li7/I;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Li7/y;->C:Lx7/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Li7/y;->G:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    iput-object v1, p0, Li7/y;->C:Lx7/a;

    return-object v0

    :cond_1
    iget-object v0, p0, Li7/y;->D:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    invoke-virtual {p0}, Li7/y;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li7/y;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    :goto_0
    return-object v0
.end method
