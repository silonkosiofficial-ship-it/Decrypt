.class public abstract LN/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ln0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/i;

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    const/high16 v2, -0x800000    # Float.NEGATIVE_INFINITY

    invoke-direct {v0, v1, v1, v2, v2}, Ln0/i;-><init>(FFFF)V

    sput-object v0, LN/z;->a:Ln0/i;

    return-void
.end method

.method public static final a(Ln0/i;J)Z
    .locals 3

    .prologue
    invoke-virtual {p0}, Ln0/i;->i()F

    move-result v0

    invoke-virtual {p0}, Ln0/i;->j()F

    move-result v1

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v2

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    cmpg-float v0, v2, v1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Ln0/i;->l()F

    move-result v0

    invoke-virtual {p0}, Ln0/i;->e()F

    move-result p0

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    cmpg-float p2, v0, p1

    if-gtz p2, :cond_0

    cmpg-float p0, p1, p0

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(LD0/t;)Ln0/i;
    .locals 5

    invoke-static {p0}, LD0/u;->c(LD0/t;)Ln0/i;

    move-result-object v0

    invoke-virtual {v0}, Ln0/i;->m()J

    move-result-wide v1

    invoke-interface {p0, v1, v2}, LD0/t;->W(J)J

    move-result-wide v1

    invoke-virtual {v0}, Ln0/i;->f()J

    move-result-wide v3

    invoke-interface {p0, v3, v4}, LD0/t;->W(J)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ln0/j;->a(JJ)Ln0/i;

    move-result-object p0

    return-object p0
.end method
