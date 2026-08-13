.class public final LW/d$p;
.super LW/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "p"
.end annotation


# static fields
.field public static final c:LW/d$p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW/d$p;

    invoke-direct {v0}, LW/d$p;-><init>()V

    sput-object v0, LW/d$p;->c:LW/d$p;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {p0, v2, v3, v0, v1}, LW/d;-><init>(IIILy7/k;)V

    return-void
.end method


# virtual methods
.method public a(LW/e;LV/g;LV/k1;LV/Y0;)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    invoke-static {v0}, LW/d$t;->a(I)I

    move-result v1

    invoke-interface {p1, v1}, LW/e;->a(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LV/h1;

    const/4 v2, 0x0

    invoke-static {v2}, LW/d$t;->a(I)I

    move-result v3

    invoke-interface {p1, v3}, LW/e;->a(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LV/d;

    const/4 v4, 0x2

    invoke-static {v4}, LW/d$t;->a(I)I

    move-result v4

    invoke-interface {p1, v4}, LW/e;->a(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LW/c;

    invoke-virtual {v1}, LV/h1;->V()LV/k1;

    move-result-object v4

    :try_start_0
    invoke-virtual {p1, p2, v4, p4}, LW/c;->d(LV/g;LV/k1;LV/Y0;)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4, v0}, LV/k1;->L(Z)V

    invoke-virtual {p3}, LV/k1;->I()V

    invoke-virtual {v3, v1}, LV/d;->d(LV/h1;)I

    move-result p1

    invoke-virtual {p3, v1, p1, v2}, LV/k1;->v0(LV/h1;IZ)Ljava/util/List;

    invoke-virtual {p3}, LV/k1;->U()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v4, v2}, LV/k1;->L(Z)V

    throw p1
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    .prologue
    const/4 v0, 0x0

    invoke-static {v0}, LW/d$t;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LW/d$t;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "anchor"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, LW/d$t;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LW/d$t;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "from"

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    invoke-static {v0}, LW/d$t;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LW/d$t;->b(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "fixups"

    goto :goto_0

    :cond_2
    invoke-super {p0, p1}, LW/d;->f(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
