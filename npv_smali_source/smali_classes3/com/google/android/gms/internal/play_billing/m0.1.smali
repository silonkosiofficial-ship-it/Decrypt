.class public abstract Lcom/google/android/gms/internal/play_billing/m0;
.super Lcom/google/android/gms/internal/play_billing/l0;
.source "SourceFile"

# interfaces
.implements Ljava/util/NavigableSet;
.implements Lcom/google/android/gms/internal/play_billing/L0;
.implements Lj$/util/SortedSet;


# instance fields
.field final transient E:Ljava/util/Comparator;

.field transient F:Lcom/google/android/gms/internal/play_billing/m0;


# direct methods
.method constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/l0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/m0;->E:Ljava/util/Comparator;

    return-void
.end method

.method static R(Ljava/util/Comparator;)Lcom/google/android/gms/internal/play_billing/I0;
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/play_billing/t0;->C:Lcom/google/android/gms/internal/play_billing/t0;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/play_billing/I0;->H:Lcom/google/android/gms/internal/play_billing/I0;

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/play_billing/I0;

    sget v1, Lcom/google/android/gms/internal/play_billing/e0;->E:I

    sget-object v1, Lcom/google/android/gms/internal/play_billing/B0;->H:Lcom/google/android/gms/internal/play_billing/e0;

    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/internal/play_billing/I0;-><init>(Lcom/google/android/gms/internal/play_billing/e0;Ljava/util/Comparator;)V

    return-object v0
.end method


# virtual methods
.method abstract M()Lcom/google/android/gms/internal/play_billing/m0;
.end method

.method abstract N(Ljava/lang/Object;Z)Lcom/google/android/gms/internal/play_billing/m0;
.end method

.method public final O(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/android/gms/internal/play_billing/m0;
    .locals 1

    .prologue
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/m0;->E:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/play_billing/m0;->P(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/android/gms/internal/play_billing/m0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method abstract P(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/android/gms/internal/play_billing/m0;
.end method

.method abstract Q(Ljava/lang/Object;Z)Lcom/google/android/gms/internal/play_billing/m0;
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/m0;->E:Ljava/util/Comparator;

    return-object v0
.end method

.method public final bridge synthetic descendingSet()Ljava/util/NavigableSet;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/m0;->F:Lcom/google/android/gms/internal/play_billing/m0;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/m0;->M()Lcom/google/android/gms/internal/play_billing/m0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/m0;->F:Lcom/google/android/gms/internal/play_billing/m0;

    iput-object p0, v0, Lcom/google/android/gms/internal/play_billing/m0;->F:Lcom/google/android/gms/internal/play_billing/m0;

    :cond_0
    return-object v0
.end method

.method public final synthetic headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/m0;->N(Ljava/lang/Object;Z)Lcom/google/android/gms/internal/play_billing/m0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/m0;->N(Ljava/lang/Object;Z)Lcom/google/android/gms/internal/play_billing/m0;

    move-result-object p1

    return-object p1
.end method

.method public final pollFirst()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLast()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final bridge synthetic subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/play_billing/m0;->O(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/android/gms/internal/play_billing/m0;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, p2, v1}, Lcom/google/android/gms/internal/play_billing/m0;->O(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/android/gms/internal/play_billing/m0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/m0;->Q(Ljava/lang/Object;Z)Lcom/google/android/gms/internal/play_billing/m0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/m0;->Q(Ljava/lang/Object;Z)Lcom/google/android/gms/internal/play_billing/m0;

    move-result-object p1

    return-object p1
.end method
