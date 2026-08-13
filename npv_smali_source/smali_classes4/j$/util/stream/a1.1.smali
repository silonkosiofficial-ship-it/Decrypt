.class final Lj$/util/stream/a1;
.super Lj$/util/stream/e1;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/E0;


# virtual methods
.method public final synthetic a([Ljava/lang/Double;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/stream/y0;->n(Lj$/util/stream/E0;[Ljava/lang/Double;I)V

    return-void
.end method

.method public final b(I)Lj$/util/stream/J0;
    .locals 0

    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic b(I)Lj$/util/stream/K0;
    .locals 0

    invoke-virtual {p0, p1}, Lj$/util/stream/a1;->b(I)Lj$/util/stream/J0;

    const/4 p1, 0x0

    throw p1
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lj$/util/stream/y0;->x()[D

    move-result-object v0

    return-object v0
.end method

.method public final synthetic f(JJLjava/util/function/IntFunction;)Lj$/util/stream/E0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lj$/util/stream/y0;->t(Lj$/util/stream/E0;JJ)Lj$/util/stream/E0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/y0;->q(Lj$/util/stream/E0;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final bridge synthetic g(JJLjava/util/function/IntFunction;)Lj$/util/stream/K0;
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lj$/util/stream/a1;->f(JJLjava/util/function/IntFunction;)Lj$/util/stream/E0;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic h([Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, [Ljava/lang/Double;

    invoke-virtual {p0, p1, p2}, Lj$/util/stream/a1;->a([Ljava/lang/Double;I)V

    return-void
.end method

.method public final spliterator()Lj$/util/Spliterator;
    .locals 1

    invoke-static {}, Lj$/util/Spliterators;->b()Lj$/util/U;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Lj$/util/d0;
    .locals 1

    invoke-static {}, Lj$/util/Spliterators;->b()Lj$/util/U;

    move-result-object v0

    return-object v0
.end method
