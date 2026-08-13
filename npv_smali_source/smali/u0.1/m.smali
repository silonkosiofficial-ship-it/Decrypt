.class public final Lu0/m;
.super Lu0/l;
.source "SourceFile"


# instance fields
.field private final b:Lu0/c;

.field private c:Ljava/lang/String;

.field private d:Z

.field private final e:Lu0/a;

.field private f:Lx7/a;

.field private final g:LV/w0;

.field private h:Lo0/z0;

.field private final i:LV/w0;

.field private j:J

.field private k:F

.field private l:F

.field private final m:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lu0/c;)V
    .locals 4

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu0/l;-><init>(Ly7/k;)V

    iput-object p1, p0, Lu0/m;->b:Lu0/c;

    new-instance v1, Lu0/m$a;

    invoke-direct {v1, p0}, Lu0/m$a;-><init>(Lu0/m;)V

    invoke-virtual {p1, v1}, Lu0/c;->d(Lx7/l;)V

    const-string p1, ""

    iput-object p1, p0, Lu0/m;->c:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu0/m;->d:Z

    new-instance p1, Lu0/a;

    invoke-direct {p1}, Lu0/a;-><init>()V

    iput-object p1, p0, Lu0/m;->e:Lu0/a;

    sget-object p1, Lu0/m$c;->D:Lu0/m$c;

    iput-object p1, p0, Lu0/m;->f:Lx7/a;

    const/4 p1, 0x2

    invoke-static {v0, v0, p1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v1

    iput-object v1, p0, Lu0/m;->g:LV/w0;

    sget-object v1, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v1}, Ln0/m$a;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->c(J)Ln0/m;

    move-result-object v2

    invoke-static {v2, v0, p1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Lu0/m;->i:LV/w0;

    invoke-virtual {v1}, Ln0/m$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lu0/m;->j:J

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lu0/m;->k:F

    iput p1, p0, Lu0/m;->l:F

    new-instance p1, Lu0/m$b;

    invoke-direct {p1, p0}, Lu0/m$b;-><init>(Lu0/m;)V

    iput-object p1, p0, Lu0/m;->m:Lx7/l;

    return-void
.end method

.method public static final synthetic e(Lu0/m;)V
    .locals 0

    invoke-direct {p0}, Lu0/m;->h()V

    return-void
.end method

.method public static final synthetic f(Lu0/m;)F
    .locals 0

    iget p0, p0, Lu0/m;->k:F

    return p0
.end method

.method public static final synthetic g(Lu0/m;)F
    .locals 0

    iget p0, p0, Lu0/m;->l:F

    return p0
.end method

.method private final h()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu0/m;->d:Z

    iget-object v0, p0, Lu0/m;->f:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lq0/g;)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lu0/m;->i(Lq0/g;FLo0/z0;)V

    return-void
.end method

.method public final i(Lq0/g;FLo0/z0;)V
    .locals 9

    .prologue
    iget-object v0, p0, Lu0/m;->b:Lu0/c;

    invoke-virtual {v0}, Lu0/c;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu0/m;->b:Lu0/c;

    invoke-virtual {v0}, Lu0/c;->g()J

    move-result-wide v0

    const-wide/16 v2, 0x10

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu0/m;->k()Lo0/z0;

    move-result-object v0

    invoke-static {v0}, Lu0/o;->g(Lo0/z0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p3}, Lu0/o;->g(Lo0/z0;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lo0/F1;->b:Lo0/F1$a;

    invoke-virtual {v0}, Lo0/F1$a;->a()I

    move-result v0

    :goto_0
    move v2, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lo0/F1;->b:Lo0/F1$a;

    invoke-virtual {v0}, Lo0/F1$a;->b()I

    move-result v0

    goto :goto_0

    :goto_1
    iget-boolean v0, p0, Lu0/m;->d:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lu0/m;->j:J

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Ln0/m;->f(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lu0/m;->j()I

    move-result v0

    invoke-static {v2, v0}, Lo0/F1;->i(II)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    sget-object v0, Lo0/F1;->b:Lo0/F1$a;

    invoke-virtual {v0}, Lo0/F1$a;->a()I

    move-result v0

    invoke-static {v2, v0}, Lo0/F1;->i(II)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v3, Lo0/z0;->b:Lo0/z0$a;

    iget-object v0, p0, Lu0/m;->b:Lu0/c;

    invoke-virtual {v0}, Lu0/c;->g()J

    move-result-wide v4

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lo0/z0$a;->b(Lo0/z0$a;JIILjava/lang/Object;)Lo0/z0;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iput-object v0, p0, Lu0/m;->h:Lo0/z0;

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/m;->i(J)F

    move-result v0

    invoke-virtual {p0}, Lu0/m;->m()J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/m;->i(J)F

    move-result v1

    div-float/2addr v0, v1

    iput v0, p0, Lu0/m;->k:F

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/m;->g(J)F

    move-result v0

    invoke-virtual {p0}, Lu0/m;->m()J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/m;->g(J)F

    move-result v1

    div-float/2addr v0, v1

    iput v0, p0, Lu0/m;->l:F

    iget-object v1, p0, Lu0/m;->e:Lu0/a;

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/m;->i(J)F

    move-result v0

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v0, v3

    float-to-int v0, v0

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/m;->g(J)F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    invoke-static {v0, v3}, LY0/u;->a(II)J

    move-result-wide v3

    invoke-interface {p1}, Lq0/g;->getLayoutDirection()LY0/v;

    move-result-object v6

    iget-object v7, p0, Lu0/m;->m:Lx7/l;

    move-object v5, p1

    invoke-virtual/range {v1 .. v7}, Lu0/a;->b(IJLY0/e;LY0/v;Lx7/l;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu0/m;->d:Z

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v0

    iput-wide v0, p0, Lu0/m;->j:J

    :cond_3
    if-eqz p3, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Lu0/m;->k()Lo0/z0;

    move-result-object p3

    if-eqz p3, :cond_5

    invoke-virtual {p0}, Lu0/m;->k()Lo0/z0;

    move-result-object p3

    goto :goto_3

    :cond_5
    iget-object p3, p0, Lu0/m;->h:Lo0/z0;

    :goto_3
    iget-object v0, p0, Lu0/m;->e:Lu0/a;

    invoke-virtual {v0, p1, p2, p3}, Lu0/a;->c(Lq0/g;FLo0/z0;)V

    return-void
.end method

.method public final j()I
    .locals 1

    .prologue
    iget-object v0, p0, Lu0/m;->e:Lu0/a;

    invoke-virtual {v0}, Lu0/a;->d()Lo0/E1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lo0/E1;->b()I

    move-result v0

    goto :goto_0

    :cond_0
    sget-object v0, Lo0/F1;->b:Lo0/F1$a;

    invoke-virtual {v0}, Lo0/F1$a;->b()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final k()Lo0/z0;
    .locals 1

    iget-object v0, p0, Lu0/m;->g:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo0/z0;

    return-object v0
.end method

.method public final l()Lu0/c;
    .locals 1

    iget-object v0, p0, Lu0/m;->b:Lu0/c;

    return-object v0
.end method

.method public final m()J
    .locals 2

    iget-object v0, p0, Lu0/m;->i:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/m;

    invoke-virtual {v0}, Ln0/m;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final n(Lo0/z0;)V
    .locals 1

    iget-object v0, p0, Lu0/m;->g:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final o(Lx7/a;)V
    .locals 0

    iput-object p1, p0, Lu0/m;->f:Lx7/a;

    return-void
.end method

.method public final p(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lu0/m;->c:Ljava/lang/String;

    return-void
.end method

.method public final q(J)V
    .locals 1

    iget-object v0, p0, Lu0/m;->i:LV/w0;

    invoke-static {p1, p2}, Ln0/m;->c(J)Ln0/m;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Params: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\tname: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu0/m;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\tviewportWidth: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu0/m;->m()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->i(J)F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\tviewportHeight: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu0/m;->m()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->g(J)F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
