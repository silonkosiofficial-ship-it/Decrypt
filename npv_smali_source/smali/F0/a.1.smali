.class public abstract LF0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF0/b;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:LF0/b;

.field private final i:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LF0/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/a;->a:LF0/b;

    const/4 p1, 0x1

    iput-boolean p1, p0, LF0/a;->b:Z

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LF0/a;->i:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(LF0/b;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1}, LF0/a;-><init>(LF0/b;)V

    return-void
.end method

.method public static final synthetic a(LF0/a;LD0/a;ILF0/d0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LF0/a;->c(LD0/a;ILF0/d0;)V

    return-void
.end method

.method public static final synthetic b(LF0/a;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, LF0/a;->i:Ljava/util/Map;

    return-object p0
.end method

.method private final c(LD0/a;ILF0/d0;)V
    .locals 2

    .prologue
    :goto_0
    int-to-float p2, p2

    invoke-static {p2, p2}, Ln0/h;->a(FF)J

    move-result-wide v0

    :cond_0
    invoke-virtual {p0, p3, v0, v1}, LF0/a;->d(LF0/d0;J)J

    move-result-wide v0

    invoke-virtual {p3}, LF0/d0;->p2()LF0/d0;

    move-result-object p3

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object p2, p0, LF0/a;->a:LF0/b;

    invoke-interface {p2}, LF0/b;->F()LF0/d0;

    move-result-object p2

    invoke-static {p3, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p3}, LF0/a;->e(LF0/d0;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p3, p1}, LF0/a;->i(LF0/d0;LD0/a;)I

    move-result p2

    goto :goto_0

    :cond_1
    instance-of p2, p1, LD0/m;

    if-eqz p2, :cond_2

    invoke-static {v0, v1}, Ln0/g;->n(J)F

    move-result p2

    goto :goto_1

    :cond_2
    invoke-static {v0, v1}, Ln0/g;->m(J)F

    move-result p2

    :goto_1
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    iget-object p3, p0, LF0/a;->i:Ljava/util/Map;

    invoke-interface {p3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LF0/a;->i:Ljava/util/Map;

    invoke-static {v0, p1}, Lj7/S;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {p1, v0, p2}, LD0/b;->c(LD0/a;II)I

    move-result p2

    :cond_3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method protected abstract d(LF0/d0;J)J
.end method

.method protected abstract e(LF0/d0;)Ljava/util/Map;
.end method

.method public final f()LF0/b;
    .locals 1

    iget-object v0, p0, LF0/a;->a:LF0/b;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, LF0/a;->b:Z

    return v0
.end method

.method public final h()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LF0/a;->i:Ljava/util/Map;

    return-object v0
.end method

.method protected abstract i(LF0/d0;LD0/a;)I
.end method

.method public final j()Z
    .locals 1

    .prologue
    iget-boolean v0, p0, LF0/a;->c:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LF0/a;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LF0/a;->f:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LF0/a;->g:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final k()Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/a;->o()V

    iget-object v0, p0, LF0/a;->h:LF0/b;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, LF0/a;->d:Z

    return v0
.end method

.method public final m()V
    .locals 2

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/a;->b:Z

    iget-object v0, p0, LF0/a;->a:LF0/b;

    invoke-interface {v0}, LF0/b;->J()LF0/b;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, p0, LF0/a;->c:Z

    if-eqz v1, :cond_1

    invoke-interface {v0}, LF0/b;->i0()V

    goto :goto_0

    :cond_1
    iget-boolean v1, p0, LF0/a;->e:Z

    if-nez v1, :cond_2

    iget-boolean v1, p0, LF0/a;->d:Z

    if-eqz v1, :cond_3

    :cond_2
    invoke-interface {v0}, LF0/b;->requestLayout()V

    :cond_3
    :goto_0
    iget-boolean v1, p0, LF0/a;->f:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, LF0/a;->a:LF0/b;

    invoke-interface {v1}, LF0/b;->i0()V

    :cond_4
    iget-boolean v1, p0, LF0/a;->g:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, LF0/a;->a:LF0/b;

    invoke-interface {v1}, LF0/b;->requestLayout()V

    :cond_5
    invoke-interface {v0}, LF0/b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0}, LF0/a;->m()V

    return-void
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, LF0/a;->i:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, LF0/a;->a:LF0/b;

    new-instance v1, LF0/a$a;

    invoke-direct {v1, p0}, LF0/a$a;-><init>(LF0/a;)V

    invoke-interface {v0, v1}, LF0/b;->c0(Lx7/l;)V

    iget-object v0, p0, LF0/a;->i:Ljava/util/Map;

    iget-object v1, p0, LF0/a;->a:LF0/b;

    invoke-interface {v1}, LF0/b;->F()LF0/d0;

    move-result-object v1

    invoke-virtual {p0, v1}, LF0/a;->e(LF0/d0;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LF0/a;->b:Z

    return-void
.end method

.method public final o()V
    .locals 2

    .prologue
    invoke-virtual {p0}, LF0/a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF0/a;->a:LF0/b;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LF0/a;->a:LF0/b;

    invoke-interface {v0}, LF0/b;->J()LF0/b;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-interface {v0}, LF0/b;->f()LF0/a;

    move-result-object v0

    iget-object v0, v0, LF0/a;->h:LF0/b;

    if-eqz v0, :cond_2

    invoke-interface {v0}, LF0/b;->f()LF0/a;

    move-result-object v1

    invoke-virtual {v1}, LF0/a;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, LF0/a;->h:LF0/b;

    if-eqz v0, :cond_6

    invoke-interface {v0}, LF0/b;->f()LF0/a;

    move-result-object v1

    invoke-virtual {v1}, LF0/a;->j()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v0}, LF0/b;->J()LF0/b;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {v1}, LF0/b;->f()LF0/a;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LF0/a;->o()V

    :cond_4
    invoke-interface {v0}, LF0/b;->J()LF0/b;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, LF0/b;->f()LF0/a;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, v0, LF0/a;->h:LF0/b;

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, LF0/a;->h:LF0/b;

    :cond_6
    :goto_1
    return-void
.end method

.method public final p()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/a;->b:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, LF0/a;->c:Z

    iput-boolean v0, p0, LF0/a;->e:Z

    iput-boolean v0, p0, LF0/a;->d:Z

    iput-boolean v0, p0, LF0/a;->f:Z

    iput-boolean v0, p0, LF0/a;->g:Z

    const/4 v0, 0x0

    iput-object v0, p0, LF0/a;->h:LF0/b;

    return-void
.end method

.method public final q(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/a;->e:Z

    return-void
.end method

.method public final r(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/a;->g:Z

    return-void
.end method

.method public final s(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/a;->f:Z

    return-void
.end method

.method public final t(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/a;->d:Z

    return-void
.end method

.method public final u(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/a;->c:Z

    return-void
.end method
