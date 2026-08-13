.class public final LV/h;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result p1

    return p1
.end method

.method public b()B
    .locals 1

    invoke-virtual {p0}, LV/h;->intValue()I

    move-result v0

    int-to-byte v0, v0

    return v0
.end method

.method public final bridge byteValue()B
    .locals 1

    invoke-virtual {p0}, LV/h;->b()B

    move-result v0

    return v0
.end method

.method public bridge c()D
    .locals 2

    invoke-super {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public bridge d()F
    .locals 1

    invoke-super {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->floatValue()F

    move-result v0

    return v0
.end method

.method public final bridge doubleValue()D
    .locals 2

    invoke-virtual {p0}, LV/h;->c()D

    move-result-wide v0

    return-wide v0
.end method

.method public bridge e()I
    .locals 1

    invoke-super {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    move-result v0

    return v0
.end method

.method public bridge f()J
    .locals 2

    invoke-super {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final bridge floatValue()F
    .locals 1

    invoke-virtual {p0}, LV/h;->d()F

    move-result v0

    return v0
.end method

.method public g()S
    .locals 1

    invoke-virtual {p0}, LV/h;->intValue()I

    move-result v0

    int-to-short v0, v0

    return v0
.end method

.method public final bridge intValue()I
    .locals 1

    invoke-virtual {p0}, LV/h;->e()I

    move-result v0

    return v0
.end method

.method public final bridge longValue()J
    .locals 2

    invoke-virtual {p0}, LV/h;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public final bridge shortValue()S
    .locals 1

    invoke-virtual {p0}, LV/h;->g()S

    move-result v0

    return v0
.end method
