.class public abstract Lf0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/y;


# instance fields
.field private final C:LV/h;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LV/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LV/h;-><init>(I)V

    iput-object v0, p0, Lf0/z;->C:LV/h;

    return-void
.end method


# virtual methods
.method public final q(I)Z
    .locals 1

    .prologue
    iget-object v0, p0, Lf0/z;->C:LV/h;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-static {v0}, Lf0/g;->a(I)I

    move-result v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final r(I)V
    .locals 3

    .prologue
    :cond_0
    iget-object v0, p0, Lf0/z;->C:LV/h;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-static {v0}, Lf0/g;->a(I)I

    move-result v0

    and-int v1, v0, p1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    or-int v1, v0, p1

    invoke-static {v1}, Lf0/g;->a(I)I

    move-result v1

    iget-object v2, p0, Lf0/z;->C:LV/h;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public synthetic s(Lf0/A;Lf0/A;Lf0/A;)Lf0/A;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lf0/x;->a(Lf0/y;Lf0/A;Lf0/A;Lf0/A;)Lf0/A;

    move-result-object p1

    return-object p1
.end method
