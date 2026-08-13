.class final Lu/S$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/S$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/w0;

.field final synthetic E:Lu/S;

.field final synthetic F:Ly7/L;

.field final synthetic G:LW8/N;


# direct methods
.method constructor <init>(LV/w0;Lu/S;Ly7/L;LW8/N;)V
    .locals 0

    iput-object p1, p0, Lu/S$b$a;->D:LV/w0;

    iput-object p2, p0, Lu/S$b$a;->E:Lu/S;

    iput-object p3, p0, Lu/S$b$a;->F:Ly7/L;

    iput-object p4, p0, Lu/S$b$a;->G:LW8/N;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 6

    .prologue
    iget-object v0, p0, Lu/S$b$a;->D:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV/G1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    move-wide v0, p1

    :goto_0
    iget-object v2, p0, Lu/S$b$a;->E:Lu/S;

    invoke-static {v2}, Lu/S;->a(Lu/S;)J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v2, p0, Lu/S$b$a;->F:Ly7/L;

    iget v2, v2, Ly7/L;->C:F

    iget-object v4, p0, Lu/S$b$a;->G:LW8/N;

    invoke-interface {v4}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v4

    invoke-static {v4}, Lu/q0;->n(Lm7/i;)F

    move-result v4

    cmpg-float v2, v2, v4

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lu/S$b$a;->E:Lu/S;

    invoke-static {v2, p1, p2}, Lu/S;->e(Lu/S;J)V

    iget-object p1, p0, Lu/S$b$a;->E:Lu/S;

    invoke-static {p1}, Lu/S;->b(Lu/S;)LX/b;

    move-result-object p1

    invoke-virtual {p1}, LX/b;->t()I

    move-result p2

    if-lez p2, :cond_3

    invoke-virtual {p1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object p1

    move v2, v3

    :cond_2
    aget-object v4, p1, v2

    check-cast v4, Lu/S$a;

    invoke-virtual {v4}, Lu/S$a;->q()V

    add-int/lit8 v2, v2, 0x1

    if-lt v2, p2, :cond_2

    :cond_3
    iget-object p1, p0, Lu/S$b$a;->F:Ly7/L;

    iget-object p2, p0, Lu/S$b$a;->G:LW8/N;

    invoke-interface {p2}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p2

    invoke-static {p2}, Lu/q0;->n(Lm7/i;)F

    move-result p2

    iput p2, p1, Ly7/L;->C:F

    :goto_1
    iget-object p1, p0, Lu/S$b$a;->F:Ly7/L;

    iget p1, p1, Ly7/L;->C:F

    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-nez p1, :cond_5

    iget-object p1, p0, Lu/S$b$a;->E:Lu/S;

    invoke-static {p1}, Lu/S;->b(Lu/S;)LX/b;

    move-result-object p1

    invoke-virtual {p1}, LX/b;->t()I

    move-result p2

    if-lez p2, :cond_6

    invoke-virtual {p1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object p1

    :cond_4
    aget-object v0, p1, v3

    check-cast v0, Lu/S$a;

    invoke-virtual {v0}, Lu/S$a;->s()V

    add-int/lit8 v3, v3, 0x1

    if-lt v3, p2, :cond_4

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lu/S$b$a;->E:Lu/S;

    invoke-static {p1}, Lu/S;->a(Lu/S;)J

    move-result-wide p1

    sub-long/2addr v0, p1

    long-to-float p1, v0

    iget-object p2, p0, Lu/S$b$a;->F:Ly7/L;

    iget p2, p2, Ly7/L;->C:F

    div-float/2addr p1, p2

    float-to-long p1, p1

    iget-object v0, p0, Lu/S$b$a;->E:Lu/S;

    invoke-static {v0, p1, p2}, Lu/S;->c(Lu/S;J)V

    :cond_6
    :goto_2
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu/S$b$a;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
