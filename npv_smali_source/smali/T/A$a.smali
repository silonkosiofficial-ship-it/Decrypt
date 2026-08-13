.class final LT/A$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/A;->a(LT/G;Ljava/lang/String;Lx7/p;LS0/g0;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZZZLz/j;LA/B;LS/i1;Lx7/p;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:F

.field final synthetic E:LV/w0;


# direct methods
.method constructor <init>(FLV/w0;)V
    .locals 0

    iput p1, p0, LT/A$a;->D:F

    iput-object p2, p0, LT/A$a;->E:LV/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    .prologue
    invoke-static {p1, p2}, Ln0/m;->i(J)F

    move-result v0

    iget v1, p0, LT/A$a;->D:F

    mul-float/2addr v0, v1

    invoke-static {p1, p2}, Ln0/m;->g(J)F

    move-result p1

    iget p2, p0, LT/A$a;->D:F

    mul-float/2addr p1, p2

    iget-object p2, p0, LT/A$a;->E:LV/w0;

    invoke-interface {p2}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln0/m;

    invoke-virtual {p2}, Ln0/m;->m()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/m;->i(J)F

    move-result p2

    cmpg-float p2, p2, v0

    if-nez p2, :cond_0

    iget-object p2, p0, LT/A$a;->E:LV/w0;

    invoke-interface {p2}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln0/m;

    invoke-virtual {p2}, Ln0/m;->m()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/m;->g(J)F

    move-result p2

    cmpg-float p2, p2, p1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, LT/A$a;->E:LV/w0;

    invoke-static {v0, p1}, Ln0/n;->a(FF)J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/m;->c(J)Ln0/m;

    move-result-object p1

    invoke-interface {p2, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ln0/m;

    invoke-virtual {p1}, Ln0/m;->m()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LT/A$a;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
