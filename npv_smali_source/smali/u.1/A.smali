.class public final Lu/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/e;


# instance fields
.field private final a:Lu/D0;

.field private final b:Lu/x0;

.field private final c:Ljava/lang/Object;

.field private final d:Lu/r;

.field private final e:Lu/r;

.field private final f:Lu/r;

.field private final g:Ljava/lang/Object;

.field private final h:J

.field private final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lu/B;Lu/x0;Ljava/lang/Object;Lu/r;)V
    .locals 0

    invoke-interface {p1, p2}, Lu/B;->a(Lu/x0;)Lu/D0;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3, p4}, Lu/A;-><init>(Lu/D0;Lu/x0;Ljava/lang/Object;Lu/r;)V

    return-void
.end method

.method public constructor <init>(Lu/D0;Lu/x0;Ljava/lang/Object;Lu/r;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/A;->a:Lu/D0;

    iput-object p2, p0, Lu/A;->b:Lu/x0;

    iput-object p3, p0, Lu/A;->c:Ljava/lang/Object;

    invoke-virtual {p0}, Lu/A;->c()Lu/x0;

    move-result-object p2

    invoke-interface {p2}, Lu/x0;->a()Lx7/l;

    move-result-object p2

    invoke-interface {p2, p3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lu/r;

    iput-object p2, p0, Lu/A;->d:Lu/r;

    invoke-static {p4}, Lu/s;->e(Lu/r;)Lu/r;

    move-result-object p3

    iput-object p3, p0, Lu/A;->e:Lu/r;

    invoke-virtual {p0}, Lu/A;->c()Lu/x0;

    move-result-object p3

    invoke-interface {p3}, Lu/x0;->b()Lx7/l;

    move-result-object p3

    invoke-interface {p1, p2, p4}, Lu/D0;->b(Lu/r;Lu/r;)Lu/r;

    move-result-object v0

    invoke-interface {p3, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, p0, Lu/A;->g:Ljava/lang/Object;

    invoke-interface {p1, p2, p4}, Lu/D0;->d(Lu/r;Lu/r;)J

    move-result-wide v0

    iput-wide v0, p0, Lu/A;->h:J

    invoke-virtual {p0}, Lu/A;->b()J

    move-result-wide v0

    invoke-interface {p1, v0, v1, p2, p4}, Lu/D0;->e(JLu/r;Lu/r;)Lu/r;

    move-result-object p1

    invoke-static {p1}, Lu/s;->e(Lu/r;)Lu/r;

    move-result-object p1

    iput-object p1, p0, Lu/A;->f:Lu/r;

    invoke-virtual {p1}, Lu/r;->b()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_0

    iget-object p3, p0, Lu/A;->f:Lu/r;

    invoke-virtual {p3, p2}, Lu/r;->a(I)F

    move-result p4

    iget-object v0, p0, Lu/A;->a:Lu/D0;

    invoke-interface {v0}, Lu/D0;->a()F

    move-result v0

    neg-float v0, v0

    iget-object v1, p0, Lu/A;->a:Lu/D0;

    invoke-interface {v1}, Lu/D0;->a()F

    move-result v1

    invoke-static {p4, v0, v1}, LE7/j;->j(FFF)F

    move-result p4

    invoke-virtual {p3, p2, p4}, Lu/r;->e(IF)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lu/A;->i:Z

    return v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lu/A;->h:J

    return-wide v0
.end method

.method public c()Lu/x0;
    .locals 1

    iget-object v0, p0, Lu/A;->b:Lu/x0;

    return-object v0
.end method

.method public d(J)Lu/r;
    .locals 3

    .prologue
    invoke-virtual {p0, p1, p2}, Lu/A;->e(J)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lu/A;->a:Lu/D0;

    iget-object v1, p0, Lu/A;->d:Lu/r;

    iget-object v2, p0, Lu/A;->e:Lu/r;

    invoke-interface {v0, p1, p2, v1, v2}, Lu/D0;->e(JLu/r;Lu/r;)Lu/r;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lu/A;->f:Lu/r;

    return-object p1
.end method

.method public synthetic e(J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lu/d;->a(Lu/e;J)Z

    move-result p1

    return p1
.end method

.method public f(J)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-virtual {p0, p1, p2}, Lu/A;->e(J)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lu/A;->c()Lu/x0;

    move-result-object v0

    invoke-interface {v0}, Lu/x0;->b()Lx7/l;

    move-result-object v0

    iget-object v1, p0, Lu/A;->a:Lu/D0;

    iget-object v2, p0, Lu/A;->d:Lu/r;

    iget-object v3, p0, Lu/A;->e:Lu/r;

    invoke-interface {v1, p1, p2, v2, v3}, Lu/D0;->c(JLu/r;Lu/r;)Lu/r;

    move-result-object p1

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lu/A;->g()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/A;->g:Ljava/lang/Object;

    return-object v0
.end method
