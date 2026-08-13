.class public final Laa/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Laa/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LV/n;I)Laa/n;
    .locals 5

    .prologue
    const v0, 0x6bc47f91

    invoke-interface {p1, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "org.jetbrains.compose.resources.DefaultComposeEnvironment.<no name provided>.rememberEnvironment (ResourceEnvironment.kt:44)"

    invoke-static {v0, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LT0/g;->b:LT0/g$a;

    invoke-virtual {p2}, LT0/g$a;->a()LT0/g;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lv/m;->a(LV/n;I)Z

    move-result v0

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v1

    invoke-interface {p1, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/e;

    const v2, 0x6529cefb

    invoke-interface {p1, v2}, LV/n;->T(I)V

    invoke-interface {p1, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p1, v0}, LV/n;->d(Z)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {p1, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v3, Laa/n;

    new-instance v2, Laa/i;

    invoke-virtual {p2}, LT0/g;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Laa/i;-><init>(Ljava/lang/String;)V

    new-instance v4, Laa/l;

    invoke-virtual {p2}, LT0/g;->c()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v4, p2}, Laa/l;-><init>(Ljava/lang/String;)V

    sget-object p2, Laa/C;->C:Laa/C$a;

    invoke-virtual {p2, v0}, Laa/C$a;->a(Z)Laa/C;

    move-result-object p2

    sget-object v0, Laa/c;->D:Laa/c$a;

    invoke-interface {v1}, LY0/e;->getDensity()F

    move-result v1

    invoke-virtual {v0, v1}, Laa/c$a;->a(F)Laa/c;

    move-result-object v0

    invoke-direct {v3, v2, v4, p2, v0}, Laa/n;-><init>(Laa/i;Laa/l;Laa/C;Laa/c;)V

    invoke-interface {p1, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Laa/n;

    invoke-interface {p1}, LV/n;->J()V

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    invoke-interface {p1}, LV/n;->J()V

    return-object v3
.end method
