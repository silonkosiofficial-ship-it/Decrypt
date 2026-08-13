.class public abstract Lf0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf0/k$a;
    }
.end annotation


# static fields
.field public static final e:Lf0/k$a;

.field public static final f:I


# instance fields
.field private a:Lf0/n;

.field private b:I

.field private c:Z

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf0/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf0/k$a;-><init>(Ly7/k;)V

    sput-object v0, Lf0/k;->e:Lf0/k$a;

    const/16 v0, 0x8

    sput v0, Lf0/k;->f:I

    return-void
.end method

.method private constructor <init>(ILf0/n;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf0/k;->a:Lf0/n;

    iput p1, p0, Lf0/k;->b:I

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lf0/k;->g()Lf0/n;

    move-result-object p2

    invoke-static {p1, p2}, Lf0/p;->c0(ILf0/n;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, Lf0/k;->d:I

    return-void
.end method

.method public synthetic constructor <init>(ILf0/n;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lf0/k;-><init>(ILf0/n;)V

    return-void
.end method

.method public static final synthetic a(Lf0/k;)I
    .locals 0

    iget p0, p0, Lf0/k;->d:I

    return p0
.end method


# virtual methods
.method public final b()V
    .locals 2

    .prologue
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lf0/k;->c()V

    invoke-virtual {p0}, Lf0/k;->r()V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public c()V
    .locals 2

    invoke-static {}, Lf0/p;->j()Lf0/n;

    move-result-object v0

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Lf0/n;->C(I)Lf0/n;

    move-result-object v0

    invoke-static {v0}, Lf0/p;->v(Lf0/n;)V

    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, Lf0/k;->c:Z

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lf0/k;->q()V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lf0/k;->c:Z

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lf0/k;->b:I

    return v0
.end method

.method public g()Lf0/n;
    .locals 1

    iget-object v0, p0, Lf0/k;->a:Lf0/n;

    return-object v0
.end method

.method public abstract h()Lx7/l;
.end method

.method public abstract i()Z
.end method

.method public j()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract k()Lx7/l;
.end method

.method public l()Lf0/k;
    .locals 2

    invoke-static {}, Lf0/p;->k()LV/B1;

    move-result-object v0

    invoke-virtual {v0}, LV/B1;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/k;

    invoke-static {}, Lf0/p;->k()LV/B1;

    move-result-object v1

    invoke-virtual {v1, p0}, LV/B1;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method public abstract m(Lf0/k;)V
.end method

.method public abstract n(Lf0/k;)V
.end method

.method public abstract o()V
.end method

.method public abstract p(Lf0/y;)V
.end method

.method public final q()V
    .locals 1

    .prologue
    iget v0, p0, Lf0/k;->d:I

    if-ltz v0, :cond_0

    invoke-static {v0}, Lf0/p;->Y(I)V

    const/4 v0, -0x1

    iput v0, p0, Lf0/k;->d:I

    :cond_0
    return-void
.end method

.method public r()V
    .locals 0

    invoke-virtual {p0}, Lf0/k;->q()V

    return-void
.end method

.method public s(Lf0/k;)V
    .locals 1

    invoke-static {}, Lf0/p;->k()LV/B1;

    move-result-object v0

    invoke-virtual {v0, p1}, LV/B1;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final t(Z)V
    .locals 0

    iput-boolean p1, p0, Lf0/k;->c:Z

    return-void
.end method

.method public u(I)V
    .locals 0

    iput p1, p0, Lf0/k;->b:I

    return-void
.end method

.method public v(Lf0/n;)V
    .locals 0

    iput-object p1, p0, Lf0/k;->a:Lf0/n;

    return-void
.end method

.method public w(I)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Updating write count is not supported for this snapshot"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract x(Lx7/l;)Lf0/k;
.end method

.method public final y()I
    .locals 2

    iget v0, p0, Lf0/k;->d:I

    const/4 v1, -0x1

    iput v1, p0, Lf0/k;->d:I

    return v0
.end method

.method public final z()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lf0/k;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    const-string v0, "Cannot use a disposed snapshot"

    invoke-static {v0}, LV/I0;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
