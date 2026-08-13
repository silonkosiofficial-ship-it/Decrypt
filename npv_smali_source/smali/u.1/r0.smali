.class public final Lu/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/e;


# instance fields
.field private final a:Lu/B0;

.field private final b:Lu/x0;

.field private c:Ljava/lang/Object;

.field private d:Ljava/lang/Object;

.field private e:Lu/r;

.field private f:Lu/r;

.field private final g:Lu/r;

.field private h:J

.field private i:Lu/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lu/B0;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/r0;->a:Lu/B0;

    iput-object p2, p0, Lu/r0;->b:Lu/x0;

    iput-object p4, p0, Lu/r0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lu/r0;->d:Ljava/lang/Object;

    invoke-virtual {p0}, Lu/r0;->c()Lu/x0;

    move-result-object p1

    invoke-interface {p1}, Lu/x0;->a()Lx7/l;

    move-result-object p1

    invoke-interface {p1, p3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu/r;

    iput-object p1, p0, Lu/r0;->e:Lu/r;

    invoke-virtual {p0}, Lu/r0;->c()Lu/x0;

    move-result-object p1

    invoke-interface {p1}, Lu/x0;->a()Lx7/l;

    move-result-object p1

    invoke-interface {p1, p4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu/r;

    iput-object p1, p0, Lu/r0;->f:Lu/r;

    if-eqz p5, :cond_0

    invoke-static {p5}, Lu/s;->e(Lu/r;)Lu/r;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lu/r0;->c()Lu/x0;

    move-result-object p1

    invoke-interface {p1}, Lu/x0;->a()Lx7/l;

    move-result-object p1

    invoke-interface {p1, p3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu/r;

    invoke-static {p1}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lu/r0;->g:Lu/r;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lu/r0;->h:J

    return-void
.end method

.method public constructor <init>(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;)V
    .locals 6

    invoke-interface {p1, p2}, Lu/j;->a(Lu/x0;)Lu/B0;

    move-result-object v1

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lu/r0;-><init>(Lu/B0;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;)V

    return-void
.end method

.method public synthetic constructor <init>(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;ILy7/k;)V
    .locals 6

    .prologue
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lu/r0;-><init>(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;)V

    return-void
.end method

.method private final h()Lu/r;
    .locals 4

    .prologue
    iget-object v0, p0, Lu/r0;->i:Lu/r;

    if-nez v0, :cond_0

    iget-object v0, p0, Lu/r0;->a:Lu/B0;

    iget-object v1, p0, Lu/r0;->e:Lu/r;

    iget-object v2, p0, Lu/r0;->f:Lu/r;

    iget-object v3, p0, Lu/r0;->g:Lu/r;

    invoke-interface {v0, v1, v2, v3}, Lu/B0;->g(Lu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object v0

    iput-object v0, p0, Lu/r0;->i:Lu/r;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lu/r0;->a:Lu/B0;

    invoke-interface {v0}, Lu/B0;->a()Z

    move-result v0

    return v0
.end method

.method public b()J
    .locals 4

    .prologue
    iget-wide v0, p0, Lu/r0;->h:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Lu/r0;->a:Lu/B0;

    iget-object v1, p0, Lu/r0;->e:Lu/r;

    iget-object v2, p0, Lu/r0;->f:Lu/r;

    iget-object v3, p0, Lu/r0;->g:Lu/r;

    invoke-interface {v0, v1, v2, v3}, Lu/B0;->e(Lu/r;Lu/r;Lu/r;)J

    move-result-wide v0

    iput-wide v0, p0, Lu/r0;->h:J

    :cond_0
    iget-wide v0, p0, Lu/r0;->h:J

    return-wide v0
.end method

.method public c()Lu/x0;
    .locals 1

    iget-object v0, p0, Lu/r0;->b:Lu/x0;

    return-object v0
.end method

.method public d(J)Lu/r;
    .locals 7

    .prologue
    invoke-virtual {p0, p1, p2}, Lu/r0;->e(J)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lu/r0;->a:Lu/B0;

    iget-object v4, p0, Lu/r0;->e:Lu/r;

    iget-object v5, p0, Lu/r0;->f:Lu/r;

    iget-object v6, p0, Lu/r0;->g:Lu/r;

    move-wide v2, p1

    invoke-interface/range {v1 .. v6}, Lu/B0;->b(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lu/r0;->h()Lu/r;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public synthetic e(J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lu/d;->a(Lu/e;J)Z

    move-result p1

    return p1
.end method

.method public f(J)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-virtual {p0, p1, p2}, Lu/r0;->e(J)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v1, p0, Lu/r0;->a:Lu/B0;

    iget-object v4, p0, Lu/r0;->e:Lu/r;

    iget-object v5, p0, Lu/r0;->f:Lu/r;

    iget-object v6, p0, Lu/r0;->g:Lu/r;

    move-wide v2, p1

    invoke-interface/range {v1 .. v6}, Lu/B0;->c(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object v0

    invoke-virtual {v0}, Lu/r;->b()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Lu/r;->a(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-nez v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AnimationVector cannot contain a NaN. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ". Animation: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", playTimeNanos: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lu/e0;->b(Ljava/lang/String;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lu/r0;->c()Lu/x0;

    move-result-object p1

    invoke-interface {p1}, Lu/x0;->b()Lx7/l;

    move-result-object p1

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lu/r0;->g()Ljava/lang/Object;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/r0;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/r0;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public final j(Ljava/lang/Object;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lu/r0;->d:Ljava/lang/Object;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lu/r0;->d:Ljava/lang/Object;

    invoke-virtual {p0}, Lu/r0;->c()Lu/x0;

    move-result-object v0

    invoke-interface {v0}, Lu/x0;->a()Lx7/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu/r;

    iput-object p1, p0, Lu/r0;->e:Lu/r;

    const/4 p1, 0x0

    iput-object p1, p0, Lu/r0;->i:Lu/r;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lu/r0;->h:J

    :cond_0
    return-void
.end method

.method public final k(Ljava/lang/Object;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lu/r0;->c:Ljava/lang/Object;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lu/r0;->c:Ljava/lang/Object;

    invoke-virtual {p0}, Lu/r0;->c()Lu/x0;

    move-result-object v0

    invoke-interface {v0}, Lu/x0;->a()Lx7/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu/r;

    iput-object p1, p0, Lu/r0;->f:Lu/r;

    const/4 p1, 0x0

    iput-object p1, p0, Lu/r0;->i:Lu/r;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lu/r0;->h:J

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TargetBasedAnimation: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu/r0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu/r0;->g()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",initial velocity: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu/r0;->g:Lu/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", duration: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lu/g;->b(Lu/e;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ms,animationSpec: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu/r0;->a:Lu/B0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
