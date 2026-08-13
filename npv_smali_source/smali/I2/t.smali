.class public abstract LI2/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Landroid/content/Context;)LI2/t;
    .locals 0

    invoke-static {p0}, LJ2/j;->k(Landroid/content/Context;)LJ2/j;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/content/Context;Landroidx/work/a;)V
    .locals 0

    invoke-static {p0, p1}, LJ2/j;->e(Landroid/content/Context;Landroidx/work/a;)V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)LI2/m;
.end method

.method public final b(LI2/u;)LI2/m;
    .locals 0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LI2/t;->c(Ljava/util/List;)LI2/m;

    move-result-object p1

    return-object p1
.end method

.method public abstract c(Ljava/util/List;)LI2/m;
.end method
