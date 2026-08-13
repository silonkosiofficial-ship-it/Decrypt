.class final LS/w0$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/w0;->a(LA/L;ZLx7/a;Lx7/p;Landroidx/compose/ui/d;ZLx7/p;ZLS/u0;Lz/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/u0;

.field final synthetic E:Z

.field final synthetic F:Z

.field final synthetic G:Lx7/p;


# direct methods
.method constructor <init>(LS/u0;ZZLx7/p;)V
    .locals 0

    iput-object p1, p0, LS/w0$g;->D:LS/u0;

    iput-boolean p2, p0, LS/w0$g;->E:Z

    iput-boolean p3, p0, LS/w0$g;->F:Z

    iput-object p4, p0, LS/w0$g;->G:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method

.method private static final e(LV/G1;)J
    .locals 2

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo0/y0;

    invoke-virtual {p0}, Lo0/y0;->w()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 12

    .prologue
    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/n;->A()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:201)"

    const v2, 0x620c84c8

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, LU/r;->a:LU/r;

    invoke-virtual {p2}, LU/r;->k()LU/L;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LS/B1;->c(LU/L;LV/n;I)LM0/P;

    move-result-object v3

    iget-object p2, p0, LS/w0$g;->D:LS/u0;

    iget-boolean v1, p0, LS/w0$g;->E:Z

    iget-boolean v2, p0, LS/w0$g;->F:Z

    invoke-virtual {p2, v1, v2}, LS/u0;->c(ZZ)J

    move-result-wide v4

    const/16 p2, 0x64

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, v1, v2, v0, v2}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v6

    const/16 v10, 0x30

    const/16 v11, 0xc

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, p1

    invoke-static/range {v4 .. v11}, Lt/w;->a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object p2

    invoke-static {p2}, LS/w0$g;->e(LV/G1;)J

    move-result-wide v1

    iget-object v4, p0, LS/w0$g;->G:Lx7/p;

    const/4 v6, 0x0

    move-object v5, p1

    invoke-static/range {v1 .. v6}, LT/w;->a(JLM0/P;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/w0$g;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
