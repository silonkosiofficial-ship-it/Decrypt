.class public final Lz0/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/I;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz0/L$a;
    }
.end annotation


# instance fields
.field public b:Lx7/l;

.field private c:Lz0/T;

.field private d:Z

.field private final e:Lz0/H;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz0/L$b;

    invoke-direct {v0, p0}, Lz0/L$b;-><init>(Lz0/L;)V

    iput-object v0, p0, Lz0/L;->e:Lz0/H;

    return-void
.end method


# virtual methods
.method public synthetic b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 0

    invoke-static {p0, p1}, Lh0/f;->a(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lh0/g;->b(Landroidx/compose/ui/d$b;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic d(Lx7/l;)Z
    .locals 0

    invoke-static {p0, p1}, Lh0/g;->a(Landroidx/compose/ui/d$b;Lx7/l;)Z

    move-result p1

    return p1
.end method

.method public e()Lz0/H;
    .locals 1

    iget-object v0, p0, Lz0/L;->e:Lz0/H;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lz0/L;->d:Z

    return v0
.end method

.method public final j()Lx7/l;
    .locals 1

    .prologue
    iget-object v0, p0, Lz0/L;->b:Lx7/l;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "onTouchEvent"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final l(Z)V
    .locals 0

    iput-boolean p1, p0, Lz0/L;->d:Z

    return-void
.end method

.method public final m(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lz0/L;->b:Lx7/l;

    return-void
.end method

.method public final n(Lz0/T;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lz0/L;->c:Lz0/T;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lz0/T;->e(Lz0/L;)V

    :goto_0
    iput-object p1, p0, Lz0/L;->c:Lz0/T;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, p0}, Lz0/T;->e(Lz0/L;)V

    :goto_1
    return-void
.end method
