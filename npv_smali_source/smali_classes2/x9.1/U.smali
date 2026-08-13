.class public abstract Lx9/U;
.super Lx9/B0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx9/B0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic X(Lv9/f;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx9/U;->e0(Lv9/f;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected abstract c0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method protected d0(Lv9/f;I)Ljava/lang/String;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lv9/f;->f(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected final e0(Lv9/f;I)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/U;->d0(Lv9/f;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/U;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected final f0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    const-string v0, "nestedName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/B0;->W()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    invoke-virtual {p0, v0, p1}, Lx9/U;->c0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected final g0()Ljava/lang/String;
    .locals 10

    .prologue
    invoke-virtual {p0}, Lx9/B0;->Y()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "$"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lx9/B0;->Y()Ljava/util/ArrayList;

    move-result-object v1

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const-string v2, "."

    const-string v3, "$."

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lj7/v;->r0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
