.class final LS/f$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/f;->b(Landroidx/compose/ui/d;JJFLA/B;LA/S;LS/j;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# direct methods
.method constructor <init>(LS/j;)V
    .locals 0

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/M;LD0/G;J)LD0/K;
    .locals 7

    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result p3

    int-to-float p3, p3

    const/4 p4, 0x0

    add-float/2addr p3, p4

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v1

    invoke-static {p3}, LA7/a;->d(F)I

    move-result v2

    new-instance v4, LS/f$b$a;

    invoke-direct {v4, p2}, LS/f$b$a;-><init>(LD0/X;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LD0/M;

    check-cast p2, LD0/G;

    check-cast p3, LY0/b;

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, LS/f$b;->a(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    return-object p1
.end method
