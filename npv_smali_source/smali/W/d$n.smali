.class public final LW/d$n;
.super LW/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "n"
.end annotation


# static fields
.field public static final c:LW/d$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW/d$n;

    invoke-direct {v0}, LW/d$n;-><init>()V

    sput-object v0, LW/d$n;->c:LW/d$n;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v2, v0, v1}, LW/d;-><init>(IILy7/k;)V

    return-void
.end method


# virtual methods
.method public a(LW/e;LV/g;LV/k1;LV/Y0;)V
    .locals 2

    const/4 p4, 0x0

    invoke-static {p4}, LW/d$t;->a(I)I

    move-result v0

    invoke-interface {p1, v0}, LW/e;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, LW/d$t;->a(I)I

    move-result v1

    invoke-interface {p1, v1}, LW/e;->a(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LV/d;

    invoke-static {p4}, LW/d$q;->a(I)I

    move-result p4

    invoke-interface {p1, p4}, LW/e;->b(I)I

    move-result p1

    const-string p4, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"

    invoke-static {p2, p4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, v1, v0}, LV/k1;->s1(LV/d;Ljava/lang/Object;)V

    invoke-interface {p2, p1, v0}, LV/g;->h(ILjava/lang/Object;)V

    invoke-interface {p2, v0}, LV/g;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public e(I)Ljava/lang/String;
    .locals 1

    .prologue
    const/4 v0, 0x0

    invoke-static {v0}, LW/d$q;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LW/d$q;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "insertIndex"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LW/d;->e(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
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

    const-string p1, "factory"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, LW/d$t;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LW/d$t;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "groupAnchor"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, LW/d;->f(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
