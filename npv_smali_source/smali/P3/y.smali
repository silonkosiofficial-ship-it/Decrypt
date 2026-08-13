.class public final LP3/y;
.super Lk4/d;
.source "SourceFile"

# interfaces
.implements LO3/f$a;
.implements LO3/f$b;


# static fields
.field private static final J:LO3/a$a;


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Landroid/os/Handler;

.field private final E:LO3/a$a;

.field private final F:Ljava/util/Set;

.field private final G:LQ3/d;

.field private H:Lj4/e;

.field private I:LP3/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lj4/d;->c:LO3/a$a;

    sput-object v0, LP3/y;->J:LO3/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;LQ3/d;)V
    .locals 1

    sget-object v0, LP3/y;->J:LO3/a$a;

    invoke-direct {p0}, Lk4/d;-><init>()V

    iput-object p1, p0, LP3/y;->C:Landroid/content/Context;

    iput-object p2, p0, LP3/y;->D:Landroid/os/Handler;

    const-string p1, "ClientSettings must not be null"

    invoke-static {p3, p1}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LQ3/d;

    iput-object p1, p0, LP3/y;->G:LQ3/d;

    invoke-virtual {p3}, LQ3/d;->g()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LP3/y;->F:Ljava/util/Set;

    iput-object v0, p0, LP3/y;->E:LO3/a$a;

    return-void
.end method

.method static bridge synthetic T2(LP3/y;Lk4/l;)V
    .locals 4

    .prologue
    invoke-virtual {p1}, Lk4/l;->e()LN3/b;

    move-result-object v0

    invoke-virtual {v0}, LN3/b;->C()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lk4/l;->f()LQ3/O;

    move-result-object p1

    invoke-static {p1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LQ3/O;

    invoke-virtual {p1}, LQ3/O;->e()LN3/b;

    move-result-object v0

    invoke-virtual {v0}, LN3/b;->C()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    const-string v2, "SignInCoordinator"

    const-string v3, "Sign-in succeeded with resolve account failure: "

    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    nop

    :cond_0
    iget-object p1, p0, LP3/y;->I:LP3/x;

    invoke-interface {p1, v0}, LP3/x;->c(LN3/b;)V

    :goto_0
    iget-object p0, p0, LP3/y;->H:Lj4/e;

    invoke-interface {p0}, LO3/a$f;->h()V

    return-void

    :cond_1
    iget-object v0, p0, LP3/y;->I:LP3/x;

    invoke-virtual {p1}, LQ3/O;->f()LQ3/j;

    move-result-object p1

    iget-object v1, p0, LP3/y;->F:Ljava/util/Set;

    invoke-interface {v0, p1, v1}, LP3/x;->b(LQ3/j;Ljava/util/Set;)V

    goto :goto_0
.end method

.method static bridge synthetic d2(LP3/y;)LP3/x;
    .locals 0

    iget-object p0, p0, LP3/y;->I:LP3/x;

    return-object p0
.end method


# virtual methods
.method public final L0(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, LP3/y;->H:Lj4/e;

    invoke-interface {p1, p0}, Lj4/e;->b(Lk4/f;)V

    return-void
.end method

.method public final V3(Lk4/l;)V
    .locals 1

    new-instance v0, LP3/w;

    invoke-direct {v0, p0, p1}, LP3/w;-><init>(LP3/y;Lk4/l;)V

    iget-object p1, p0, LP3/y;->D:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final f3(LP3/x;)V
    .locals 9

    .prologue
    iget-object v0, p0, LP3/y;->H:Lj4/e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LO3/a$f;->h()V

    :cond_0
    iget-object v0, p0, LP3/y;->G:LQ3/d;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, LQ3/d;->k(Ljava/lang/Integer;)V

    iget-object v2, p0, LP3/y;->E:LO3/a$a;

    iget-object v3, p0, LP3/y;->C:Landroid/content/Context;

    iget-object v0, p0, LP3/y;->D:Landroid/os/Handler;

    iget-object v5, p0, LP3/y;->G:LQ3/d;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-virtual {v5}, LQ3/d;->h()Lj4/a;

    move-result-object v6

    move-object v7, p0

    move-object v8, p0

    invoke-virtual/range {v2 .. v8}, LO3/a$a;->a(Landroid/content/Context;Landroid/os/Looper;LQ3/d;Ljava/lang/Object;LO3/f$a;LO3/f$b;)LO3/a$f;

    move-result-object v0

    iput-object v0, p0, LP3/y;->H:Lj4/e;

    iput-object p1, p0, LP3/y;->I:LP3/x;

    iget-object p1, p0, LP3/y;->F:Ljava/util/Set;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LP3/y;->H:Lj4/e;

    invoke-interface {p1}, Lj4/e;->p()V

    return-void

    :cond_2
    :goto_0
    iget-object p1, p0, LP3/y;->D:Landroid/os/Handler;

    new-instance v0, LP3/v;

    invoke-direct {v0, p0}, LP3/v;-><init>(LP3/y;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final p4()V
    .locals 1

    .prologue
    iget-object v0, p0, LP3/y;->H:Lj4/e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LO3/a$f;->h()V

    :cond_0
    return-void
.end method

.method public final q0(LN3/b;)V
    .locals 1

    iget-object v0, p0, LP3/y;->I:LP3/x;

    invoke-interface {v0, p1}, LP3/x;->c(LN3/b;)V

    return-void
.end method

.method public final y0(I)V
    .locals 1

    iget-object v0, p0, LP3/y;->I:LP3/x;

    invoke-interface {v0, p1}, LP3/x;->d(I)V

    return-void
.end method
