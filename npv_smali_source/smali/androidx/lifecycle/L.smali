.class public abstract Landroidx/lifecycle/L;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc2/a$b;

.field public static final b:Lc2/a$b;

.field public static final c:Lc2/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/L$b;

    invoke-direct {v0}, Landroidx/lifecycle/L$b;-><init>()V

    sput-object v0, Landroidx/lifecycle/L;->a:Lc2/a$b;

    new-instance v0, Landroidx/lifecycle/L$c;

    invoke-direct {v0}, Landroidx/lifecycle/L$c;-><init>()V

    sput-object v0, Landroidx/lifecycle/L;->b:Lc2/a$b;

    new-instance v0, Landroidx/lifecycle/L$a;

    invoke-direct {v0}, Landroidx/lifecycle/L$a;-><init>()V

    sput-object v0, Landroidx/lifecycle/L;->c:Lc2/a$b;

    return-void
.end method

.method public static final a(Lc2/a;)Landroidx/lifecycle/I;
    .locals 4

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/L;->a:Lc2/a$b;

    invoke-virtual {p0, v0}, Lc2/a;->a(Lc2/a$b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx2/f;

    if-eqz v0, :cond_2

    sget-object v1, Landroidx/lifecycle/L;->b:Lc2/a$b;

    invoke-virtual {p0, v1}, Lc2/a;->a(Lc2/a$b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/Y;

    if-eqz v1, :cond_1

    sget-object v2, Landroidx/lifecycle/L;->c:Lc2/a$b;

    invoke-virtual {p0, v2}, Lc2/a;->a(Lc2/a$b;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    sget-object v3, Landroidx/lifecycle/V$d;->c:Lc2/a$b;

    invoke-virtual {p0, v3}, Lc2/a;->a(Lc2/a$b;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-static {v0, v1, p0, v2}, Landroidx/lifecycle/L;->b(Lx2/f;Landroidx/lifecycle/Y;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/I;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final b(Lx2/f;Landroidx/lifecycle/Y;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/I;
    .locals 1

    .prologue
    invoke-static {p0}, Landroidx/lifecycle/L;->d(Lx2/f;)Landroidx/lifecycle/M;

    move-result-object p0

    invoke-static {p1}, Landroidx/lifecycle/L;->e(Landroidx/lifecycle/Y;)Landroidx/lifecycle/N;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/N;->h()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/I;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/lifecycle/I;->f:Landroidx/lifecycle/I$a;

    invoke-virtual {p0, p2}, Landroidx/lifecycle/M;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0, p3}, Landroidx/lifecycle/I$a;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/I;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/lifecycle/N;->h()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public static final c(Lx2/f;)V
    .locals 4

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->D:Landroidx/lifecycle/k$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/k$b;->E:Landroidx/lifecycle/k$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Lx2/f;->p()Lx2/d;

    move-result-object v0

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v0, v1}, Lx2/d;->c(Ljava/lang/String;)Lx2/d$c;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Landroidx/lifecycle/M;

    invoke-interface {p0}, Lx2/f;->p()Lx2/d;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Landroidx/lifecycle/Y;

    invoke-direct {v0, v2, v3}, Landroidx/lifecycle/M;-><init>(Lx2/d;Landroidx/lifecycle/Y;)V

    invoke-interface {p0}, Lx2/f;->p()Lx2/d;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lx2/d;->h(Ljava/lang/String;Lx2/d$c;)V

    invoke-interface {p0}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object p0

    new-instance v1, Landroidx/lifecycle/J;

    invoke-direct {v1, v0}, Landroidx/lifecycle/J;-><init>(Landroidx/lifecycle/M;)V

    invoke-virtual {p0, v1}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    :cond_2
    return-void
.end method

.method public static final d(Lx2/f;)Landroidx/lifecycle/M;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lx2/f;->p()Lx2/d;

    move-result-object p0

    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {p0, v0}, Lx2/d;->c(Ljava/lang/String;)Lx2/d$c;

    move-result-object p0

    instance-of v0, p0, Landroidx/lifecycle/M;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/lifecycle/M;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final e(Landroidx/lifecycle/Y;)Landroidx/lifecycle/N;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/V;

    new-instance v1, Landroidx/lifecycle/L$d;

    invoke-direct {v1}, Landroidx/lifecycle/L$d;-><init>()V

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/V;-><init>(Landroidx/lifecycle/Y;Landroidx/lifecycle/V$c;)V

    const-string p0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    const-class v1, Landroidx/lifecycle/N;

    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/V;->d(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/T;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/N;

    return-object p0
.end method
