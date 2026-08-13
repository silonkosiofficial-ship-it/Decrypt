.class final LC/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC/H;


# instance fields
.field private final a:Lx7/p;

.field private b:J

.field private c:F

.field private d:LC/G;


# direct methods
.method public constructor <init>(Lx7/p;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC/d;->a:Lx7/p;

    const/16 v4, 0xf

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v0

    iput-wide v0, p0, LC/d;->b:J

    return-void
.end method


# virtual methods
.method public a(LY0/e;J)LC/G;
    .locals 2

    .prologue
    iget-object v0, p0, LC/d;->d:LC/G;

    if-eqz v0, :cond_0

    iget-wide v0, p0, LC/d;->b:J

    invoke-static {v0, v1, p2, p3}, LY0/b;->f(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LC/d;->c:F

    invoke-interface {p1}, LY0/e;->getDensity()F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget-object p1, p0, LC/d;->d:LC/G;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    iput-wide p2, p0, LC/d;->b:J

    invoke-interface {p1}, LY0/e;->getDensity()F

    move-result v0

    iput v0, p0, LC/d;->c:F

    iget-object v0, p0, LC/d;->a:Lx7/p;

    invoke-static {p2, p3}, LY0/b;->a(J)LY0/b;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC/G;

    iput-object p1, p0, LC/d;->d:LC/G;

    return-object p1
.end method
