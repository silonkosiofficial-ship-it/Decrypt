.class public final Landroidx/compose/ui/platform/B1$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/B1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/B1$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/B1;->l()Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/B1;->o()Z

    move-result v0

    return v0
.end method

.method public final c(Z)V
    .locals 0

    invoke-static {p1}, Landroidx/compose/ui/platform/B1;->s(Z)V

    return-void
.end method

.method public final d(Landroid/view/View;)V
    .locals 12

    .prologue
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-class v3, Ljava/lang/String;

    const-class v4, Ljava/lang/Class;

    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/B1$c;->a()Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_3

    invoke-static {v2}, Landroidx/compose/ui/platform/B1;->q(Z)V

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v7, 0x1c

    const-string v8, "mRecreateDisplayList"

    const-string v9, "updateDisplayListIfDirty"

    const-class v10, Landroid/view/View;

    if-ge v5, v7, :cond_0

    :try_start_1
    invoke-virtual {v10, v9, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/platform/B1;->t(Ljava/lang/reflect/Method;)V

    invoke-virtual {v10, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Landroidx/compose/ui/platform/B1;->r(Ljava/lang/reflect/Field;)V

    goto :goto_1

    :cond_0
    const-string v5, "getDeclaredMethod"

    new-array v7, v1, [Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    new-array v11, v0, [Ljava/lang/Class;

    aput-object v3, v11, v1

    aput-object v7, v11, v2

    invoke-virtual {v4, v5, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    new-array v7, v1, [Ljava/lang/Class;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v9, v0, v1

    aput-object v7, v0, v2

    invoke-virtual {v5, v10, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-static {v0}, Landroidx/compose/ui/platform/B1;->t(Ljava/lang/reflect/Method;)V

    const-string v0, "getDeclaredField"

    new-array v5, v2, [Ljava/lang/Class;

    aput-object v3, v5, v1

    invoke-virtual {v4, v0, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/Object;

    aput-object v8, v3, v1

    invoke-virtual {v0, v10, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    goto :goto_0

    :goto_1
    invoke-static {}, Landroidx/compose/ui/platform/B1;->p()Ljava/lang/reflect/Method;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :goto_2
    invoke-static {}, Landroidx/compose/ui/platform/B1;->n()Ljava/lang/reflect/Field;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_3
    :goto_3
    invoke-static {}, Landroidx/compose/ui/platform/B1;->n()Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    :cond_4
    invoke-static {}, Landroidx/compose/ui/platform/B1;->p()Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catchall_0
    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/B1$c;->c(Z)V

    :cond_5
    :goto_4
    return-void
.end method
