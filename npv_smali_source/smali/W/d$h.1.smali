.class public final LW/d$h;
.super LW/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# static fields
.field public static final c:LW/d$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW/d$h;

    invoke-direct {v0}, LW/d$h;-><init>()V

    sput-object v0, LW/d$h;->c:LW/d$h;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v0, v1}, LW/d;-><init>(IIILy7/k;)V

    return-void
.end method


# virtual methods
.method public a(LW/e;LV/g;LV/k1;LV/Y0;)V
    .locals 1

    .prologue
    const-string p3, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"

    invoke-static {p2, p3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p3}, LW/d$t;->a(I)I

    move-result p4

    invoke-interface {p1, p4}, LW/e;->a(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    array-length p4, p1

    :goto_0
    if-ge p3, p4, :cond_0

    aget-object v0, p1, p3

    invoke-interface {p2, v0}, LV/g;->d(Ljava/lang/Object;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-void
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

    const-string p1, "nodes"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LW/d;->f(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
