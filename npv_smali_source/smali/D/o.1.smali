.class public abstract LD/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD/o$a;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(I)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LD/o;->f()LD/d;

    move-result-object v0

    invoke-interface {v0, p1}, LD/d;->get(I)LD/d$a;

    move-result-object v0

    invoke-virtual {v0}, LD/d$a;->b()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-virtual {v0}, LD/d$a;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD/o$a;

    invoke-interface {v0}, LD/o$a;->getType()Lx7/l;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract f()LD/d;
.end method

.method public final g()I
    .locals 1

    invoke-virtual {p0}, LD/o;->f()LD/d;

    move-result-object v0

    invoke-interface {v0}, LD/d;->a()I

    move-result v0

    return v0
.end method

.method public final h(I)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p0}, LD/o;->f()LD/d;

    move-result-object v0

    invoke-interface {v0, p1}, LD/d;->get(I)LD/d$a;

    move-result-object v0

    invoke-virtual {v0}, LD/d$a;->b()I

    move-result v1

    sub-int v1, p1, v1

    invoke-virtual {v0}, LD/d$a;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD/o$a;

    invoke-interface {v0}, LD/o$a;->getKey()Lx7/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {p1}, LD/H;->a(I)Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method
