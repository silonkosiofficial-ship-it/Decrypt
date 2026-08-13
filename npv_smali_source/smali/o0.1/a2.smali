.class public abstract Lo0/a2;
.super Lo0/n0;
.source "SourceFile"


# instance fields
.field private c:Landroid/graphics/Shader;

.field private d:J


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo0/n0;-><init>(Ly7/k;)V

    sget-object v0, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v0}, Ln0/m$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lo0/a2;->d:J

    return-void
.end method


# virtual methods
.method public final a(JLo0/N1;F)V
    .locals 4

    .prologue
    iget-object v0, p0, Lo0/a2;->c:Landroid/graphics/Shader;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Lo0/a2;->d:J

    invoke-static {v1, v2, p1, p2}, Ln0/m;->f(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    invoke-static {p1, p2}, Ln0/m;->k(J)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lo0/a2;->c:Landroid/graphics/Shader;

    sget-object p1, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {p1}, Ln0/m$a;->a()J

    move-result-wide p1

    :goto_0
    iput-wide p1, p0, Lo0/a2;->d:J

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1, p2}, Lo0/a2;->b(J)Landroid/graphics/Shader;

    move-result-object v0

    iput-object v0, p0, Lo0/a2;->c:Landroid/graphics/Shader;

    goto :goto_0

    :cond_2
    :goto_1
    invoke-interface {p3}, Lo0/N1;->c()J

    move-result-wide p1

    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->a()J

    move-result-wide v2

    invoke-static {p1, p2, v2, v3}, Lo0/y0;->o(JJ)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v1}, Lo0/y0$a;->a()J

    move-result-wide p1

    invoke-interface {p3, p1, p2}, Lo0/N1;->G(J)V

    :cond_3
    invoke-interface {p3}, Lo0/N1;->y()Landroid/graphics/Shader;

    move-result-object p1

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {p3, v0}, Lo0/N1;->x(Landroid/graphics/Shader;)V

    :cond_4
    invoke-interface {p3}, Lo0/N1;->a()F

    move-result p1

    cmpg-float p1, p1, p4

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {p3, p4}, Lo0/N1;->b(F)V

    :goto_2
    return-void
.end method

.method public abstract b(J)Landroid/graphics/Shader;
.end method
