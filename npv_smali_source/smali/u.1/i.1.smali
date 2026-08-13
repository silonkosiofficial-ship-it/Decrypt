.class public final Lu/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lu/x0;

.field private final b:Ljava/lang/Object;

.field private final c:J

.field private final d:Lx7/a;

.field private final e:LV/w0;

.field private f:Lu/r;

.field private g:J

.field private h:J

.field private final i:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lu/x0;Lu/r;JLjava/lang/Object;JZLx7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu/i;->a:Lu/x0;

    iput-object p6, p0, Lu/i;->b:Ljava/lang/Object;

    iput-wide p7, p0, Lu/i;->c:J

    iput-object p10, p0, Lu/i;->d:Lx7/a;

    const/4 p2, 0x0

    const/4 p6, 0x2

    invoke-static {p1, p2, p6, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Lu/i;->e:LV/w0;

    invoke-static {p3}, Lu/s;->e(Lu/r;)Lu/r;

    move-result-object p1

    iput-object p1, p0, Lu/i;->f:Lu/r;

    iput-wide p4, p0, Lu/i;->g:J

    const-wide/high16 p3, -0x8000000000000000L

    iput-wide p3, p0, Lu/i;->h:J

    invoke-static {p9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, p2, p6, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Lu/i;->i:LV/w0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lu/i;->k(Z)V

    iget-object v0, p0, Lu/i;->d:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lu/i;->h:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lu/i;->g:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lu/i;->c:J

    return-wide v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/i;->e:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lu/i;->a:Lu/x0;

    invoke-interface {v0}, Lu/x0;->b()Lx7/l;

    move-result-object v0

    iget-object v1, p0, Lu/i;->f:Lu/r;

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lu/r;
    .locals 1

    iget-object v0, p0, Lu/i;->f:Lu/r;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lu/i;->i:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final i(J)V
    .locals 0

    iput-wide p1, p0, Lu/i;->h:J

    return-void
.end method

.method public final j(J)V
    .locals 0

    iput-wide p1, p0, Lu/i;->g:J

    return-void
.end method

.method public final k(Z)V
    .locals 1

    iget-object v0, p0, Lu/i;->i:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final l(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lu/i;->e:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final m(Lu/r;)V
    .locals 0

    iput-object p1, p0, Lu/i;->f:Lu/r;

    return-void
.end method
