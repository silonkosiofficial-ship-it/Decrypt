.class final Lt/j$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/j$a;->a(Lp0/c;)Lu/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lp0/c;


# direct methods
.method constructor <init>(Lp0/c;)V
    .locals 0

    iput-object p1, p0, Lt/j$a$b;->D:Lp0/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/q;)J
    .locals 8

    .prologue
    invoke-virtual {p1}, Lu/q;->g()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-gez v2, :cond_0

    move v0, v1

    :cond_0
    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v3, v0, v2

    if-lez v3, :cond_1

    move v0, v2

    :cond_1
    invoke-virtual {p1}, Lu/q;->h()F

    move-result v3

    const/high16 v4, -0x41000000    # -0.5f

    cmpg-float v5, v3, v4

    if-gez v5, :cond_2

    move v3, v4

    :cond_2
    const/high16 v5, 0x3f000000    # 0.5f

    cmpl-float v6, v3, v5

    if-lez v6, :cond_3

    move v3, v5

    :cond_3
    invoke-virtual {p1}, Lu/q;->i()F

    move-result v6

    cmpg-float v7, v6, v4

    if-gez v7, :cond_4

    goto :goto_0

    :cond_4
    move v4, v6

    :goto_0
    cmpl-float v6, v4, v5

    if-lez v6, :cond_5

    goto :goto_1

    :cond_5
    move v5, v4

    :goto_1
    invoke-virtual {p1}, Lu/q;->f()F

    move-result p1

    cmpg-float v4, p1, v1

    if-gez v4, :cond_6

    goto :goto_2

    :cond_6
    move v1, p1

    :goto_2
    cmpl-float p1, v1, v2

    if-lez p1, :cond_7

    goto :goto_3

    :cond_7
    move v2, v1

    :goto_3
    sget-object p1, Lp0/g;->a:Lp0/g;

    invoke-virtual {p1}, Lp0/g;->t()Lp0/c;

    move-result-object p1

    invoke-static {v0, v3, v5, v2, p1}, Lo0/A0;->a(FFFFLp0/c;)J

    move-result-wide v0

    iget-object p1, p0, Lt/j$a$b;->D:Lp0/c;

    invoke-static {v0, v1, p1}, Lo0/y0;->k(JLp0/c;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lu/q;

    invoke-virtual {p0, p1}, Lt/j$a$b;->a(Lu/q;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object p1

    return-object p1
.end method
