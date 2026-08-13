.class public abstract LV/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LV/H0;LV/w;)Z
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final b(LV/H0;LV/w;)Ljava/lang/Object;
    .locals 1

    .prologue
    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LV/w;->a()LV/M1;

    move-result-object v0

    :cond_0
    check-cast v0, LV/M1;

    invoke-interface {v0, p0}, LV/M1;->a(LV/H0;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c([LV/P0;LV/H0;LV/H0;)LV/H0;
    .locals 7

    .prologue
    invoke-static {}, Ld0/f;->a()Ld0/e;

    move-result-object v0

    invoke-virtual {v0}, Ld0/e;->z()Ld0/e$a;

    move-result-object v0

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    invoke-virtual {v3}, LV/P0;->b()LV/w;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>"

    invoke-static {v4, v5}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, LV/O0;

    invoke-virtual {v3}, LV/P0;->a()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {p1, v4}, LV/A;->a(LV/H0;LV/w;)Z

    move-result v5

    if-nez v5, :cond_1

    :cond_0
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LV/M1;

    const-string v6, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>"

    invoke-static {v3, v6}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v3, v5}, LV/O0;->b(LV/P0;LV/M1;)LV/M1;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v0}, LV/H0$a;->i()LV/H0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d([LV/P0;LV/H0;LV/H0;ILjava/lang/Object;)LV/H0;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    invoke-static {}, Ld0/f;->a()Ld0/e;

    move-result-object p2

    :cond_0
    invoke-static {p0, p1, p2}, LV/A;->c([LV/P0;LV/H0;LV/H0;)LV/H0;

    move-result-object p0

    return-object p0
.end method
