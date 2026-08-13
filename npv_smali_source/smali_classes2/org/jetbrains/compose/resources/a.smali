.class public abstract Lorg/jetbrains/compose/resources/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LV/n;I)V
    .locals 3

    .prologue
    const v0, 0x5e9b7ab6

    invoke-interface {p0, v0}, LV/n;->r(I)LV/n;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LV/n;->u()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LV/n;->A()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "org.jetbrains.compose.resources.PreviewContextConfigurationEffect (AndroidContextProvider.kt:35)"

    invoke-static {v0, p1, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/F0;->a()LV/O0;

    move-result-object v0

    invoke-interface {p0, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lorg/jetbrains/compose/resources/AndroidContextProvider;->C:Lorg/jetbrains/compose/resources/AndroidContextProvider$a;

    invoke-static {}, Landroidx/compose/ui/platform/T;->g()LV/O0;

    move-result-object v1

    invoke-interface {p0, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lorg/jetbrains/compose/resources/AndroidContextProvider$a;->b(Landroid/content/Context;)V

    :cond_3
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    :goto_1
    invoke-interface {p0}, LV/n;->x()LV/e1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lorg/jetbrains/compose/resources/a$a;

    invoke-direct {v0, p1}, Lorg/jetbrains/compose/resources/a$a;-><init>(I)V

    invoke-interface {p0, v0}, LV/e1;->a(Lx7/p;)V

    :cond_5
    return-void
.end method

.method public static final b()Landroid/content/Context;
    .locals 1

    sget-object v0, Lorg/jetbrains/compose/resources/AndroidContextProvider;->C:Lorg/jetbrains/compose/resources/AndroidContextProvider$a;

    invoke-virtual {v0}, Lorg/jetbrains/compose/resources/AndroidContextProvider$a;->a()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static final c()Landroid/content/Context;
    .locals 1

    invoke-static {}, Landroidx/test/platform/app/InstrumentationRegistry;->getInstrumentation()Landroid/app/Instrumentation;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Instrumentation;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method
