.class public abstract LN4/t;
.super LN4/u;
.source "SourceFile"

# interfaces
.implements Ljava/util/NavigableSet;
.implements LN4/O;


# instance fields
.field final transient E:Ljava/util/Comparator;

.field transient F:LN4/t;


# direct methods
.method constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0}, LN4/u;-><init>()V

    iput-object p1, p0, LN4/t;->E:Ljava/util/Comparator;

    return-void
.end method

.method static varargs R(Ljava/util/Comparator;I[Ljava/lang/Object;)LN4/t;
    .locals 4

    .prologue
    if-nez p1, :cond_0

    invoke-static {p0}, LN4/t;->W(Ljava/util/Comparator;)LN4/L;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p2, p1}, LN4/F;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p2, v0, p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    if-ge v0, p1, :cond_2

    aget-object v2, p2, v0

    add-int/lit8 v3, v1, -0x1

    aget-object v3, p2, v3

    invoke-interface {p0, v2, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v3, v1, 0x1

    aput-object v2, p2, v1

    move v1, v3

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    invoke-static {p2, v1, p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    array-length p1, p2

    div-int/lit8 p1, p1, 0x2

    if-ge v1, p1, :cond_3

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    :cond_3
    new-instance p1, LN4/L;

    invoke-static {p2, v1}, LN4/o;->s([Ljava/lang/Object;I)LN4/o;

    move-result-object p2

    invoke-direct {p1, p2, p0}, LN4/L;-><init>(LN4/o;Ljava/util/Comparator;)V

    return-object p1
.end method

.method public static S(Ljava/util/Comparator;Ljava/lang/Iterable;)LN4/t;
    .locals 2

    .prologue
    invoke-static {p0}, LM4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0, p1}, LN4/P;->b(Ljava/util/Comparator;Ljava/lang/Iterable;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, LN4/t;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LN4/t;

    invoke-virtual {v0}, LN4/n;->n()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {p1}, LN4/v;->b(Ljava/lang/Iterable;)[Ljava/lang/Object;

    move-result-object p1

    array-length v0, p1

    invoke-static {p0, v0, p1}, LN4/t;->R(Ljava/util/Comparator;I[Ljava/lang/Object;)LN4/t;

    move-result-object p0

    return-object p0
.end method

.method public static T(Ljava/util/Comparator;Ljava/util/Collection;)LN4/t;
    .locals 0

    invoke-static {p0, p1}, LN4/t;->S(Ljava/util/Comparator;Ljava/lang/Iterable;)LN4/t;

    move-result-object p0

    return-object p0
.end method

.method static W(Ljava/util/Comparator;)LN4/L;
    .locals 2

    .prologue
    invoke-static {}, LN4/G;->c()LN4/G;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, LN4/L;->H:LN4/L;

    return-object p0

    :cond_0
    new-instance v0, LN4/L;

    invoke-static {}, LN4/o;->M()LN4/o;

    move-result-object v1

    invoke-direct {v0, v1, p0}, LN4/L;-><init>(LN4/o;Ljava/util/Comparator;)V

    return-object v0
.end method

.method static h0(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method


# virtual methods
.method abstract U()LN4/t;
.end method

.method public V()LN4/t;
    .locals 1

    .prologue
    iget-object v0, p0, LN4/t;->F:LN4/t;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LN4/t;->U()LN4/t;

    move-result-object v0

    iput-object v0, p0, LN4/t;->F:LN4/t;

    iput-object p0, v0, LN4/t;->F:LN4/t;

    :cond_0
    return-object v0
.end method

.method public X(Ljava/lang/Object;)LN4/t;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LN4/t;->Y(Ljava/lang/Object;Z)LN4/t;

    move-result-object p1

    return-object p1
.end method

.method public Y(Ljava/lang/Object;Z)LN4/t;
    .locals 0

    invoke-static {p1}, LM4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LN4/t;->Z(Ljava/lang/Object;Z)LN4/t;

    move-result-object p1

    return-object p1
.end method

.method abstract Z(Ljava/lang/Object;Z)LN4/t;
.end method

.method public a0(Ljava/lang/Object;Ljava/lang/Object;)LN4/t;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, p2, v1}, LN4/t;->b0(Ljava/lang/Object;ZLjava/lang/Object;Z)LN4/t;

    move-result-object p1

    return-object p1
.end method

.method public b0(Ljava/lang/Object;ZLjava/lang/Object;Z)LN4/t;
    .locals 1

    .prologue
    invoke-static {p1}, LM4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LM4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LN4/t;->E:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LM4/h;->d(Z)V

    invoke-virtual {p0, p1, p2, p3, p4}, LN4/t;->c0(Ljava/lang/Object;ZLjava/lang/Object;Z)LN4/t;

    move-result-object p1

    return-object p1
.end method

.method abstract c0(Ljava/lang/Object;ZLjava/lang/Object;Z)LN4/t;
.end method

.method public comparator()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, LN4/t;->E:Ljava/util/Comparator;

    return-object v0
.end method

.method public d0(Ljava/lang/Object;)LN4/t;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LN4/t;->e0(Ljava/lang/Object;Z)LN4/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic descendingSet()Ljava/util/NavigableSet;
    .locals 1

    invoke-virtual {p0}, LN4/t;->V()LN4/t;

    move-result-object v0

    return-object v0
.end method

.method public e0(Ljava/lang/Object;Z)LN4/t;
    .locals 0

    invoke-static {p1}, LM4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LN4/t;->f0(Ljava/lang/Object;Z)LN4/t;

    move-result-object p1

    return-object p1
.end method

.method abstract f0(Ljava/lang/Object;Z)LN4/t;
.end method

.method g0(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LN4/t;->E:Ljava/util/Comparator;

    invoke-static {v0, p1, p2}, LN4/t;->h0(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN4/t;->Y(Ljava/lang/Object;Z)LN4/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    invoke-virtual {p0, p1}, LN4/t;->X(Ljava/lang/Object;)LN4/t;

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

.method public bridge synthetic subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LN4/t;->b0(Ljava/lang/Object;ZLjava/lang/Object;Z)LN4/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN4/t;->a0(Ljava/lang/Object;Ljava/lang/Object;)LN4/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN4/t;->e0(Ljava/lang/Object;Z)LN4/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    invoke-virtual {p0, p1}, LN4/t;->d0(Ljava/lang/Object;)LN4/t;

    move-result-object p1

    return-object p1
.end method
